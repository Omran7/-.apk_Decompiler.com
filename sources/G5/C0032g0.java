package G5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: G5.g0  reason: case insensitive filesystem */
public final class C0032g0 extends C0038j0 {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f913f = AtomicIntegerFieldUpdater.newUpdater(C0032g0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* renamed from: e  reason: collision with root package name */
    public final C0030f0 f914e;

    public C0032g0(C0030f0 f0Var) {
        this.f914e = f0Var;
    }

    public final void a(Throwable th) {
        if (f913f.compareAndSet(this, 0, 1)) {
            this.f914e.a(th);
        }
    }
}
