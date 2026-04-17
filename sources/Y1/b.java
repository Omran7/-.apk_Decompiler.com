package y1;

import B4.d;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zza;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import k.C0737s0;
import m0.a0;
import n.j;

public final class b {
    public static int h;

    /* renamed from: i  reason: collision with root package name */
    public static PendingIntent f12649i;

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f12650j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: a  reason: collision with root package name */
    public final j f12651a = new j(0);

    /* renamed from: b  reason: collision with root package name */
    public final Context f12652b;

    /* renamed from: c  reason: collision with root package name */
    public final U0.b f12653c;
    public final ScheduledThreadPoolExecutor d;

    /* renamed from: e  reason: collision with root package name */
    public final Messenger f12654e;

    /* renamed from: f  reason: collision with root package name */
    public Messenger f12655f;
    public g g;

    public b(Context context) {
        this.f12652b = context;
        this.f12653c = new U0.b(context);
        this.f12654e = new Messenger(new e(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    public final Task a(Bundle bundle) {
        int i2;
        U0.b bVar = this.f12653c;
        int b6 = bVar.b();
        h hVar = h.f12663c;
        if (b6 >= 12000000) {
            l a6 = l.a(this.f12652b);
            synchronized (a6) {
                i2 = a6.f12677a;
                a6.f12677a = i2 + 1;
            }
            return a6.b(new k(i2, 1, bundle, 1)).continueWith(hVar, d.f12657b);
        } else if (bVar.c() != 0) {
            return b(bundle).continueWithTask(hVar, new a0(this, bundle, 23));
        } else {
            return Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
    }

    public final Task b(Bundle bundle) {
        String num;
        synchronized (b.class) {
            int i2 = h;
            h = i2 + 1;
            num = Integer.toString(i2);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.f12651a) {
            this.f12651a.put(num, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f12653c.c() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.f12652b;
        synchronized (b.class) {
            try {
                if (f12649i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f12649i = PendingIntent.getBroadcast(context, 0, intent2, zza.zza);
                }
                intent.putExtra("app", f12649i);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        intent.putExtra("kid", "|ID|" + num + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f12654e);
        if (!(this.f12655f == null && this.g == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f12655f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.g.f12661a;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            taskCompletionSource.getTask().addOnCompleteListener((Executor) h.f12663c, new d(this, num, this.d.schedule(new C0737s0(taskCompletionSource, 18), 30, TimeUnit.SECONDS)));
            return taskCompletionSource.getTask();
        }
        if (this.f12653c.c() == 2) {
            this.f12652b.sendBroadcast(intent);
        } else {
            this.f12652b.startService(intent);
        }
        taskCompletionSource.getTask().addOnCompleteListener((Executor) h.f12663c, new d(this, num, this.d.schedule(new C0737s0(taskCompletionSource, 18), 30, TimeUnit.SECONDS)));
        return taskCompletionSource.getTask();
    }

    public final void c(Bundle bundle, String str) {
        synchronized (this.f12651a) {
            try {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f12651a.remove(str);
                if (taskCompletionSource == null) {
                    Log.w("Rpc", "Missing callback for " + str);
                    return;
                }
                taskCompletionSource.setResult(bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
