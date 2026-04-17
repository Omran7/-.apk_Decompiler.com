package G5;

import I5.a;
import I5.h;
import I5.u;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.j;
import o5.d;

/* renamed from: G5.n  reason: case insensitive filesystem */
public final class C0042n extends C0038j0 {

    /* renamed from: e  reason: collision with root package name */
    public final C0040l f926e;

    public C0042n(C0040l lVar) {
        this.f926e = lVar;
    }

    public final void a(Throwable th) {
        v0 i2 = i();
        C0040l lVar = this.f926e;
        Throwable q6 = lVar.q(i2);
        if (lVar.v()) {
            d dVar = lVar.d;
            j.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            h hVar = (h) dVar;
            loop0:
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h.f1256q;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                u uVar = a.d;
                if (!j.a(obj, uVar)) {
                    if (!(obj instanceof Throwable)) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, (Object) null)) {
                            if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            }
                        }
                        break loop0;
                    }
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, uVar, q6)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != uVar) {
                    }
                }
                return;
            }
        }
        lVar.n(q6);
        if (!lVar.v()) {
            lVar.o();
        }
    }
}
