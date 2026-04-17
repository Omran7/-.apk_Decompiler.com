package e0;

import c1.i;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import q3.c;

/* renamed from: e0.b  reason: case insensitive filesystem */
public final class C0478b implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7564a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7565b;

    public C0478b(i iVar) {
        this.f7564a = 2;
        this.f7565b = iVar;
    }

    public final Thread newThread(Runnable runnable) {
        switch (this.f7564a) {
            case 0:
                return new Thread(runnable, "ModernAsyncTask #" + ((AtomicInteger) this.f7565b).getAndIncrement());
            case 1:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) this.f7565b).getAndIncrement());
                return thread;
            default:
                ((i) this.f7565b).getClass();
                Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                newThread.setName("FirebaseDatabaseWorker");
                newThread.setDaemon(true);
                newThread.setUncaughtExceptionHandler(new c(this));
                return newThread;
        }
    }

    public C0478b(int i2) {
        this.f7564a = i2;
        switch (i2) {
            case 1:
                this.f7565b = new AtomicInteger(0);
                return;
            default:
                this.f7565b = new AtomicInteger(1);
                return;
        }
    }
}
