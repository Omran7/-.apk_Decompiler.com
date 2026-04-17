package S3;

import P4.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class L implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2641a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f2642b;

    /* renamed from: c  reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f2643c;
    public final ArrayDeque d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    public J f2644e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2645f = false;

    public L(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(40, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        Context applicationContext = context.getApplicationContext();
        this.f2641a = applicationContext;
        this.f2642b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f2643c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                J j6 = this.f2644e;
                if (j6 == null || !j6.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f2644e.a((K) this.d.poll());
            }
        } finally {
            while (true) {
            }
        }
    }

    public final synchronized Task b(Intent intent) {
        K k6;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            k6 = new K(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f2643c;
            k6.f2640b.getTask().addOnCompleteListener((Executor) scheduledThreadPoolExecutor, new a(scheduledThreadPoolExecutor.schedule(new A4.a(k6, 3), 20, TimeUnit.SECONDS), 3));
            this.d.add(k6);
            a();
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return k6.f2640b.getTask();
    }

    public final void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder("binder is dead. start connection? ");
            sb.append(!this.f2645f);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (!this.f2645f) {
            this.f2645f = true;
            try {
                if (!F1.a.b().a(this.f2641a, this.f2642b, this, 65)) {
                    Log.e("FirebaseMessaging", "binding to the service failed");
                    this.f2645f = false;
                    while (true) {
                        ArrayDeque arrayDeque = this.d;
                        if (!arrayDeque.isEmpty()) {
                            ((K) arrayDeque.poll()).f2640b.trySetResult(null);
                        } else {
                            return;
                        }
                    }
                }
            } catch (SecurityException e6) {
                Log.e("FirebaseMessaging", "Exception while binding the service", e6);
            }
        }
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f2645f = false;
            if (!(iBinder instanceof J)) {
                Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
                while (true) {
                    ArrayDeque arrayDeque = this.d;
                    if (!arrayDeque.isEmpty()) {
                        ((K) arrayDeque.poll()).f2640b.trySetResult(null);
                    } else {
                        return;
                    }
                }
            } else {
                this.f2644e = (J) iBinder;
                a();
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}
