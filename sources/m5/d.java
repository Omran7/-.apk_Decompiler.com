package M5;

import G5.C0021b;
import G5.C0040l;
import G5.C0047t;
import G5.F;
import I5.a;
import I5.h;
import I5.u;
import R2.b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m5.C0849h;
import q5.c;

public final class d extends i implements a {
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public d(boolean z3) {
        super(z3 ? 1 : 0);
        u uVar;
        if (z3) {
            uVar = null;
        } else {
            uVar = e.f1874a;
        }
        this.owner$volatile = uVar;
    }

    public final Object c(c cVar) {
        C0040l lVar;
        boolean z3;
        C0040l lVar2;
        C0040l lVar3;
        int i2;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i.f1882f;
            int i5 = atomicIntegerFieldUpdater.get(this);
            if (i5 > 1) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 <= 1) {
                        break;
                    }
                } while (atomicIntegerFieldUpdater.compareAndSet(this, i2, 1));
            } else {
                lVar = null;
                if (i5 <= 0) {
                    z3 = true;
                    break;
                } else if (atomicIntegerFieldUpdater.compareAndSet(this, i5, i5 - 1)) {
                    g.set(this, (Object) null);
                    z3 = false;
                    break;
                }
            }
        }
        C0849h hVar = C0849h.f10203c;
        if (!z3) {
            return hVar;
        }
        if (z3) {
            o5.d h02 = b.h0(cVar);
            if (!(h02 instanceof h)) {
                lVar2 = new C0040l(1, h02);
            } else {
                h hVar2 = (h) h02;
                loop2:
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h.f1256q;
                    Object obj = atomicReferenceFieldUpdater.get(hVar2);
                    u uVar = a.d;
                    if (obj == null) {
                        atomicReferenceFieldUpdater.set(hVar2, uVar);
                        lVar3 = null;
                        break;
                    } else if (obj instanceof C0040l) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(hVar2, obj, uVar)) {
                            if (atomicReferenceFieldUpdater.get(hVar2) != obj) {
                            }
                        }
                        lVar3 = (C0040l) obj;
                        break loop2;
                    } else if (obj != uVar && !(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                }
                if (lVar3 != null) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0040l.f921p;
                    Object obj2 = atomicReferenceFieldUpdater2.get(lVar3);
                    if (!(obj2 instanceof C0047t) || ((C0047t) obj2).d == null) {
                        C0040l.f920f.set(lVar3, 536870911);
                        atomicReferenceFieldUpdater2.set(lVar3, C0021b.f895a);
                        lVar = lVar3;
                    } else {
                        lVar3.o();
                    }
                    if (lVar != null) {
                        lVar2 = lVar;
                    }
                }
                lVar2 = new C0040l(2, h02);
            }
            try {
                a(new c(this, lVar2));
                Object r6 = lVar2.r();
                p5.a aVar = p5.a.f11033a;
                if (r6 != aVar) {
                    r6 = hVar;
                }
                if (r6 == aVar) {
                    return r6;
                }
                return hVar;
            } catch (Throwable th) {
                lVar2.y();
                throw th;
            }
        } else if (!z3) {
            throw new IllegalStateException("unexpected");
        } else {
            throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
        }
    }

    public final void d() {
        while (Math.max(i.f1882f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            u uVar = e.f1874a;
            if (obj != uVar) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, uVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                b();
                return;
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(F.j(this));
        sb.append("[isLocked=");
        boolean z3 = false;
        if (Math.max(i.f1882f.get(this), 0) == 0) {
            z3 = true;
        }
        sb.append(z3);
        sb.append(",owner=");
        sb.append(g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
