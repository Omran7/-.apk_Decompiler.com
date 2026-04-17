package h3;

import B.m;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;

public final class k implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f8142a;

    /* renamed from: b  reason: collision with root package name */
    public final Semaphore f8143b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedBlockingQueue f8144c = new LinkedBlockingQueue();

    public k(Executor executor, int i2) {
        boolean z3;
        if (i2 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            this.f8142a = executor;
            this.f8143b = new Semaphore(i2, true);
            return;
        }
        throw new IllegalArgumentException("concurrency must be positive.");
    }

    public final void a() {
        while (true) {
            Semaphore semaphore = this.f8143b;
            if (semaphore.tryAcquire()) {
                Runnable runnable = (Runnable) this.f8144c.poll();
                if (runnable != null) {
                    this.f8142a.execute(new m(this, runnable, 14));
                } else {
                    semaphore.release();
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void execute(Runnable runnable) {
        this.f8144c.offer(runnable);
        a();
    }
}
