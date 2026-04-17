package S3;

import H1.a;
import U3.c;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: S3.i  reason: case insensitive filesystem */
public abstract class C0148i extends Service {

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f2672a;

    /* renamed from: b  reason: collision with root package name */
    public J f2673b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f2674c = new Object();
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f2675e = 0;

    public C0148i() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f2672a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public final void a(Intent intent) {
        if (intent != null) {
            I.b(intent);
        }
        synchronized (this.f2674c) {
            try {
                int i2 = this.f2675e - 1;
                this.f2675e = i2;
                if (i2 == 0) {
                    stopSelfResult(this.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f2673b == null) {
                this.f2673b = new J(new c((Object) this, 26));
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.f2673b;
    }

    public final void onDestroy() {
        this.f2672a.shutdown();
        super.onDestroy();
    }

    /* JADX WARNING: type inference failed for: r6v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final int onStartCommand(Intent intent, int i2, int i5) {
        synchronized (this.f2674c) {
            this.d = i5;
            this.f2675e++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) z.w().f2713e).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f2672a.execute(new C0147h((Object) this, (Object) intent2, (Object) taskCompletionSource, 0));
        Task task = taskCompletionSource.getTask();
        if (task.isComplete()) {
            a(intent);
            return 2;
        }
        task.addOnCompleteListener((Executor) new Object(), new C0146g(this, intent, 0));
        return 3;
    }
}
