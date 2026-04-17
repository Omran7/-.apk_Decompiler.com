package G5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class k0 extends v0 {

    /* renamed from: c  reason: collision with root package name */
    public final boolean f919c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k0(C0034h0 h0Var) {
        super(true);
        C0044p pVar;
        C0044p pVar2;
        boolean z3 = true;
        x(h0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v0.f955b;
        C0043o oVar = (C0043o) atomicReferenceFieldUpdater.get(this);
        if (oVar instanceof C0044p) {
            pVar = (C0044p) oVar;
        } else {
            pVar = null;
        }
        if (pVar != null) {
            v0 i2 = pVar.i();
            while (true) {
                if (!i2.r()) {
                    C0043o oVar2 = (C0043o) atomicReferenceFieldUpdater.get(i2);
                    if (oVar2 instanceof C0044p) {
                        pVar2 = (C0044p) oVar2;
                    } else {
                        pVar2 = null;
                    }
                    if (pVar2 == null) {
                        break;
                    }
                    i2 = pVar2.i();
                } else {
                    break;
                }
            }
        }
        z3 = false;
        this.f919c = z3;
    }

    public final boolean r() {
        return this.f919c;
    }

    public final boolean s() {
        return true;
    }
}
