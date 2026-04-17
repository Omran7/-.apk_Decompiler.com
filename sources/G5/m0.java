package G5;

import I5.k;
import I5.q;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.j;

public abstract class m0 extends k implements C0030f0, P, C0024c0 {
    public v0 d;

    public final w0 b() {
        return null;
    }

    public final void e() {
        v0 i2 = i();
        while (true) {
            Object u6 = i2.u();
            if (u6 instanceof m0) {
                if (u6 == this) {
                    S s6 = F.f867j;
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v0.f954a;
                        if (!atomicReferenceFieldUpdater.compareAndSet(i2, u6, s6)) {
                            if (atomicReferenceFieldUpdater.get(i2) != u6) {
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            } else if ((u6 instanceof C0024c0) && ((C0024c0) u6).b() != null) {
                while (true) {
                    Object f6 = f();
                    if (f6 instanceof q) {
                        k kVar = ((q) f6).f1277a;
                        return;
                    } else if (f6 == this) {
                        k kVar2 = (k) f6;
                        return;
                    } else {
                        j.c(f6, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        k kVar3 = (k) f6;
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = k.f1268c;
                        q qVar = (q) atomicReferenceFieldUpdater2.get(kVar3);
                        if (qVar == null) {
                            qVar = new q(kVar3);
                            atomicReferenceFieldUpdater2.set(kVar3, qVar);
                        }
                        while (true) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = k.f1266a;
                            if (atomicReferenceFieldUpdater3.compareAndSet(this, f6, qVar)) {
                                kVar3.c();
                                return;
                            } else if (atomicReferenceFieldUpdater3.get(this) != f6) {
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    public C0034h0 getParent() {
        return i();
    }

    public final v0 i() {
        v0 v0Var = this.d;
        if (v0Var != null) {
            return v0Var;
        }
        j.g("job");
        throw null;
    }

    public final boolean isActive() {
        return true;
    }

    public final String toString() {
        return getClass().getSimpleName() + '@' + F.j(this) + "[job@" + F.j(i()) + ']';
    }
}
