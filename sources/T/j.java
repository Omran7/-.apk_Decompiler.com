package t;

import java.util.Iterator;
import s.C0960a;
import s.d;

public final class j extends o {
    public final void a(d dVar) {
        C0960a aVar = (C0960a) this.f11603b;
        int i2 = aVar.s0;
        f fVar = this.h;
        Iterator it2 = fVar.f11589l.iterator();
        int i5 = 0;
        int i6 = -1;
        while (it2.hasNext()) {
            int i7 = ((f) it2.next()).g;
            if (i6 == -1 || i7 < i6) {
                i6 = i7;
            }
            if (i5 < i7) {
                i5 = i7;
            }
        }
        if (i2 == 0 || i2 == 2) {
            fVar.d(i6 + aVar.f11267u0);
        } else {
            fVar.d(i5 + aVar.f11267u0);
        }
    }

    public final void d() {
        d dVar = this.f11603b;
        if (dVar instanceof C0960a) {
            f fVar = this.h;
            fVar.f11582b = true;
            C0960a aVar = (C0960a) dVar;
            int i2 = aVar.s0;
            boolean z3 = aVar.f11266t0;
            int i5 = 0;
            if (i2 == 0) {
                fVar.f11584e = 4;
                while (i5 < aVar.f11426r0) {
                    d dVar2 = aVar.f11425q0[i5];
                    if (z3 || dVar2.f11325g0 != 8) {
                        f fVar2 = dVar2.d.h;
                        fVar2.f11588k.add(fVar);
                        fVar.f11589l.add(fVar2);
                    }
                    i5++;
                }
                m(this.f11603b.d.h);
                m(this.f11603b.d.f11607i);
            } else if (i2 == 1) {
                fVar.f11584e = 5;
                while (i5 < aVar.f11426r0) {
                    d dVar3 = aVar.f11425q0[i5];
                    if (z3 || dVar3.f11325g0 != 8) {
                        f fVar3 = dVar3.d.f11607i;
                        fVar3.f11588k.add(fVar);
                        fVar.f11589l.add(fVar3);
                    }
                    i5++;
                }
                m(this.f11603b.d.h);
                m(this.f11603b.d.f11607i);
            } else if (i2 == 2) {
                fVar.f11584e = 6;
                while (i5 < aVar.f11426r0) {
                    d dVar4 = aVar.f11425q0[i5];
                    if (z3 || dVar4.f11325g0 != 8) {
                        f fVar4 = dVar4.f11321e.h;
                        fVar4.f11588k.add(fVar);
                        fVar.f11589l.add(fVar4);
                    }
                    i5++;
                }
                m(this.f11603b.f11321e.h);
                m(this.f11603b.f11321e.f11607i);
            } else if (i2 == 3) {
                fVar.f11584e = 7;
                while (i5 < aVar.f11426r0) {
                    d dVar5 = aVar.f11425q0[i5];
                    if (z3 || dVar5.f11325g0 != 8) {
                        f fVar5 = dVar5.f11321e.f11607i;
                        fVar5.f11588k.add(fVar);
                        fVar.f11589l.add(fVar5);
                    }
                    i5++;
                }
                m(this.f11603b.f11321e.h);
                m(this.f11603b.f11321e.f11607i);
            }
        }
    }

    public final void e() {
        d dVar = this.f11603b;
        if (dVar instanceof C0960a) {
            int i2 = ((C0960a) dVar).s0;
            f fVar = this.h;
            if (i2 == 0 || i2 == 1) {
                dVar.f11312Y = fVar.g;
            } else {
                dVar.f11313Z = fVar.g;
            }
        }
    }

    public final void f() {
        this.f11604c = null;
        this.h.c();
    }

    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.h;
        fVar2.f11588k.add(fVar);
        fVar.f11589l.add(fVar2);
    }
}
