package t;

import s.d;
import s.h;

public final class i extends o {
    public final void a(d dVar) {
        f fVar = this.h;
        if (fVar.f11583c && !fVar.f11587j) {
            fVar.d((int) ((((float) ((f) fVar.f11589l.get(0)).g) * ((h) this.f11603b).f11420q0) + 0.5f));
        }
    }

    public final void d() {
        d dVar = this.f11603b;
        h hVar = (h) dVar;
        int i2 = hVar.f11421r0;
        int i5 = hVar.s0;
        int i6 = hVar.f11423u0;
        f fVar = this.h;
        if (i6 == 1) {
            if (i2 != -1) {
                fVar.f11589l.add(dVar.f11307T.d.h);
                this.f11603b.f11307T.d.h.f11588k.add(fVar);
                fVar.f11585f = i2;
            } else if (i5 != -1) {
                fVar.f11589l.add(dVar.f11307T.d.f11607i);
                this.f11603b.f11307T.d.f11607i.f11588k.add(fVar);
                fVar.f11585f = -i5;
            } else {
                fVar.f11582b = true;
                fVar.f11589l.add(dVar.f11307T.d.f11607i);
                this.f11603b.f11307T.d.f11607i.f11588k.add(fVar);
            }
            m(this.f11603b.d.h);
            m(this.f11603b.d.f11607i);
            return;
        }
        if (i2 != -1) {
            fVar.f11589l.add(dVar.f11307T.f11321e.h);
            this.f11603b.f11307T.f11321e.h.f11588k.add(fVar);
            fVar.f11585f = i2;
        } else if (i5 != -1) {
            fVar.f11589l.add(dVar.f11307T.f11321e.f11607i);
            this.f11603b.f11307T.f11321e.f11607i.f11588k.add(fVar);
            fVar.f11585f = -i5;
        } else {
            fVar.f11582b = true;
            fVar.f11589l.add(dVar.f11307T.f11321e.f11607i);
            this.f11603b.f11307T.f11321e.f11607i.f11588k.add(fVar);
        }
        m(this.f11603b.f11321e.h);
        m(this.f11603b.f11321e.f11607i);
    }

    public final void e() {
        d dVar = this.f11603b;
        int i2 = ((h) dVar).f11423u0;
        f fVar = this.h;
        if (i2 == 1) {
            dVar.f11312Y = fVar.g;
        } else {
            dVar.f11313Z = fVar.g;
        }
    }

    public final void f() {
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
