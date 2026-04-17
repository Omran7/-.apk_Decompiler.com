package G5;

import I5.a;
import I5.s;
import R2.b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import x5.l;

public final class L extends s {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f875e = AtomicIntegerFieldUpdater.newUpdater(L.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public final void f(Object obj) {
        g(obj);
    }

    public final void g(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f875e;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 != 0) {
                if (i2 == 1) {
                    a.e(b.h0(this.d), F.r(obj), (l) null);
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
