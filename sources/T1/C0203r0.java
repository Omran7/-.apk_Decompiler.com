package T1;

import com.google.android.gms.common.internal.I;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: T1.r0  reason: case insensitive filesystem */
public final class C0203r0 extends E0 {

    /* renamed from: t  reason: collision with root package name */
    public static final AtomicLong f3444t = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c  reason: collision with root package name */
    public C0201q0 f3445c;
    public C0201q0 d;

    /* renamed from: e  reason: collision with root package name */
    public final PriorityBlockingQueue f3446e = new PriorityBlockingQueue();

    /* renamed from: f  reason: collision with root package name */
    public final LinkedBlockingQueue f3447f = new LinkedBlockingQueue();

    /* renamed from: p  reason: collision with root package name */
    public final C0195o0 f3448p = new C0195o0(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: q  reason: collision with root package name */
    public final C0195o0 f3449q = new C0195o0(this, "Thread death: Uncaught exception on network thread");

    /* renamed from: r  reason: collision with root package name */
    public final Object f3450r = new Object();

    /* renamed from: s  reason: collision with root package name */
    public final Semaphore f3451s = new Semaphore(2);

    public C0203r0(C0212u0 u0Var) {
        super(u0Var);
    }

    public final boolean A() {
        if (Thread.currentThread() == this.f3445c) {
            return true;
        }
        return false;
    }

    public final void B(C0198p0 p0Var) {
        synchronized (this.f3450r) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f3446e;
                priorityBlockingQueue.add(p0Var);
                C0201q0 q0Var = this.f3445c;
                if (q0Var == null) {
                    C0201q0 q0Var2 = new C0201q0(this, "Measurement Worker", priorityBlockingQueue);
                    this.f3445c = q0Var2;
                    q0Var2.setUncaughtExceptionHandler(this.f3448p);
                    this.f3445c.start();
                } else {
                    Object obj = q0Var.f3434a;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o() {
        if (Thread.currentThread() != this.f3445c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final boolean p() {
        return false;
    }

    public final void s() {
        if (Thread.currentThread() != this.d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:13|14|15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r4 = ((T1.C0212u0) r2.f398a).f3496r;
        T1.C0212u0.k(r4);
        r4.f3175r.a("Timed out waiting for ".concat(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r4 = ((T1.C0212u0) r2.f398a).f3496r;
        T1.C0212u0.k(r4);
        r4.f3175r.a("Interrupted waiting for ".concat(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        r3 = r3.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r3 != null) goto L_0x002d;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0030 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object t(java.util.concurrent.atomic.AtomicReference r3, long r4, java.lang.String r6, java.lang.Runnable r7) {
        /*
            r2 = this;
            java.lang.String r0 = "Interrupted waiting for "
            monitor-enter(r3)
            java.lang.Object r1 = r2.f398a     // Catch:{ all -> 0x002e }
            T1.u0 r1 = (T1.C0212u0) r1     // Catch:{ all -> 0x002e }
            T1.r0 r1 = r1.f3497s     // Catch:{ all -> 0x002e }
            T1.C0212u0.k(r1)     // Catch:{ all -> 0x002e }
            r1.y(r7)     // Catch:{ all -> 0x002e }
            r3.wait(r4)     // Catch:{ InterruptedException -> 0x0030 }
            monitor-exit(r3)     // Catch:{ all -> 0x002e }
            java.lang.Object r3 = r3.get()
            if (r3 != 0) goto L_0x002d
            java.lang.Object r4 = r2.f398a
            T1.u0 r4 = (T1.C0212u0) r4
            T1.Z r4 = r4.f3496r
            T1.C0212u0.k(r4)
            T1.X r4 = r4.f3175r
            java.lang.String r5 = "Timed out waiting for "
            java.lang.String r5 = r5.concat(r6)
            r4.a(r5)
        L_0x002d:
            return r3
        L_0x002e:
            r4 = move-exception
            goto L_0x0045
        L_0x0030:
            java.lang.Object r4 = r2.f398a     // Catch:{ all -> 0x002e }
            T1.u0 r4 = (T1.C0212u0) r4     // Catch:{ all -> 0x002e }
            T1.Z r4 = r4.f3496r     // Catch:{ all -> 0x002e }
            T1.C0212u0.k(r4)     // Catch:{ all -> 0x002e }
            T1.X r4 = r4.f3175r     // Catch:{ all -> 0x002e }
            java.lang.String r5 = r0.concat(r6)     // Catch:{ all -> 0x002e }
            r4.a(r5)     // Catch:{ all -> 0x002e }
            monitor-exit(r3)     // Catch:{ all -> 0x002e }
            r3 = 0
            return r3
        L_0x0045:
            monitor-exit(r3)     // Catch:{ all -> 0x002e }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.C0203r0.t(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    public final C0198p0 u(Callable callable) {
        q();
        C0198p0 p0Var = new C0198p0(this, callable, false);
        if (Thread.currentThread() == this.f3445c) {
            if (!this.f3446e.isEmpty()) {
                Z z3 = ((C0212u0) this.f398a).f3496r;
                C0212u0.k(z3);
                z3.f3175r.a("Callable skipped the worker queue.");
            }
            p0Var.run();
        } else {
            B(p0Var);
        }
        return p0Var;
    }

    public final C0198p0 v(Callable callable) {
        q();
        C0198p0 p0Var = new C0198p0(this, callable, true);
        if (Thread.currentThread() == this.f3445c) {
            p0Var.run();
        } else {
            B(p0Var);
        }
        return p0Var;
    }

    public final void w() {
        if (Thread.currentThread() == this.f3445c) {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    public final void x(Runnable runnable) {
        q();
        C0198p0 p0Var = new C0198p0(this, runnable, false, "Task exception on network thread");
        synchronized (this.f3450r) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.f3447f;
                linkedBlockingQueue.add(p0Var);
                C0201q0 q0Var = this.d;
                if (q0Var == null) {
                    C0201q0 q0Var2 = new C0201q0(this, "Measurement Network", linkedBlockingQueue);
                    this.d = q0Var2;
                    q0Var2.setUncaughtExceptionHandler(this.f3449q);
                    this.d.start();
                } else {
                    Object obj = q0Var.f3434a;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(Runnable runnable) {
        q();
        I.g(runnable);
        B(new C0198p0(this, runnable, false, "Task exception on worker thread"));
    }

    public final void z(Runnable runnable) {
        q();
        B(new C0198p0(this, runnable, true, "Task exception on worker thread"));
    }
}
