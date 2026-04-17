package f;

import T2.c;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public final class m implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final Object f7786a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque f7787b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    public final c f7788c;
    public Runnable d;

    public m(c cVar) {
        this.f7788c = cVar;
    }

    public final void a() {
        synchronized (this.f7786a) {
            try {
                Runnable runnable = (Runnable) this.f7787b.poll();
                this.d = runnable;
                if (runnable != null) {
                    this.f7788c.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void execute(Runnable runnable) {
        synchronized (this.f7786a) {
            try {
                this.f7787b.add(new B.m(this, runnable, 9));
                if (this.d == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
