package k3;

import I1.b;
import java.util.Comparator;

public abstract class j implements h {

    /* renamed from: a  reason: collision with root package name */
    public final Object f9471a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f9472b;

    /* renamed from: c  reason: collision with root package name */
    public h f9473c;
    public final h d;

    public j(Object obj, Object obj2, h hVar, h hVar2) {
        this.f9471a = obj;
        this.f9472b = obj2;
        g gVar = g.f9470a;
        this.f9473c = hVar == null ? gVar : hVar;
        this.d = hVar2 == null ? gVar : hVar2;
    }

    public final h a(Object obj, Iterable iterable, Comparator comparator) {
        j jVar;
        int compare = comparator.compare(obj, this.f9471a);
        if (compare < 0) {
            jVar = l((Object) null, (Object) null, this.f9473c.a(obj, iterable, comparator), (h) null);
        } else if (compare == 0) {
            jVar = l(obj, iterable, (h) null, (h) null);
        } else {
            jVar = l((Object) null, (Object) null, (h) null, this.d.a(obj, iterable, comparator));
        }
        return jVar.m();
    }

    public final h b() {
        return this.f9473c;
    }

    public final void c(b bVar) {
        this.f9473c.c(bVar);
        bVar.P0(this.f9471a, this.f9472b);
        this.d.c(bVar);
    }

    public final h e() {
        return this.d;
    }

    public final h f(Object obj, Comparator comparator) {
        j jVar;
        j jVar2;
        j jVar3;
        if (comparator.compare(obj, this.f9471a) < 0) {
            if (this.f9473c.isEmpty() || this.f9473c.d() || ((j) this.f9473c).f9473c.d()) {
                jVar3 = this;
            } else {
                jVar3 = o();
            }
            jVar = jVar3.l((Object) null, (Object) null, jVar3.f9473c.f(obj, comparator), (h) null);
        } else {
            if (this.f9473c.d()) {
                jVar2 = q();
            } else {
                jVar2 = this;
            }
            h hVar = jVar2.d;
            if (!hVar.isEmpty() && !hVar.d() && !((j) hVar).f9473c.d()) {
                jVar2 = jVar2.j();
                if (jVar2.f9473c.b().d()) {
                    jVar2 = jVar2.q().j();
                }
            }
            if (comparator.compare(obj, jVar2.f9471a) == 0) {
                h hVar2 = jVar2.d;
                if (hVar2.isEmpty()) {
                    return g.f9470a;
                }
                h h = hVar2.h();
                jVar2 = jVar2.l(h.getKey(), h.getValue(), (h) null, ((j) hVar2).p());
            }
            jVar = jVar2.l((Object) null, (Object) null, (h) null, jVar2.d.f(obj, comparator));
        }
        return jVar.m();
    }

    public final Object getKey() {
        return this.f9471a;
    }

    public final Object getValue() {
        return this.f9472b;
    }

    public final h h() {
        if (this.f9473c.isEmpty()) {
            return this;
        }
        return this.f9473c.h();
    }

    public final h i() {
        h hVar = this.d;
        if (hVar.isEmpty()) {
            return this;
        }
        return hVar.i();
    }

    public final boolean isEmpty() {
        return false;
    }

    public final j j() {
        int i2;
        int i5;
        h hVar = this.f9473c;
        int i6 = 1;
        if (hVar.d()) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        h g = hVar.g(i2, (j) null, (j) null);
        h hVar2 = this.d;
        if (hVar2.d()) {
            i5 = 2;
        } else {
            i5 = 1;
        }
        h g5 = hVar2.g(i5, (j) null, (j) null);
        if (d()) {
            i6 = 2;
        }
        return g(i6, g, g5);
    }

    /* renamed from: k */
    public final j g(int i2, h hVar, h hVar2) {
        if (hVar == null) {
            hVar = this.f9473c;
        }
        if (hVar2 == null) {
            hVar2 = this.d;
        }
        Object obj = this.f9471a;
        Object obj2 = this.f9472b;
        if (i2 == 1) {
            return new j(obj, obj2, hVar, hVar2);
        }
        return new f(obj, obj2, hVar, hVar2);
    }

    public abstract j l(Object obj, Object obj2, h hVar, h hVar2);

    public final j m() {
        j jVar;
        h hVar = this.d;
        if (!hVar.d() || this.f9473c.d()) {
            jVar = this;
        } else {
            jVar = (j) hVar.g(n(), g(1, (h) null, ((j) hVar).f9473c), (j) null);
        }
        if (jVar.f9473c.d() && ((j) jVar.f9473c).f9473c.d()) {
            jVar = jVar.q();
        }
        if (!jVar.f9473c.d() || !jVar.d.d()) {
            return jVar;
        }
        return jVar.j();
    }

    public abstract int n();

    public final j o() {
        j j6 = j();
        h hVar = j6.d;
        if (!hVar.b().d()) {
            return j6;
        }
        j l6 = j6.l((Object) null, (Object) null, (h) null, ((j) hVar).q());
        h hVar2 = l6.d;
        return ((j) hVar2.g(l6.n(), l6.g(1, (h) null, ((j) hVar2).f9473c), (j) null)).j();
    }

    public final h p() {
        j jVar;
        if (this.f9473c.isEmpty()) {
            return g.f9470a;
        }
        if (this.f9473c.d() || this.f9473c.b().d()) {
            jVar = this;
        } else {
            jVar = o();
        }
        return jVar.l((Object) null, (Object) null, ((j) jVar.f9473c).p(), (h) null).m();
    }

    public final j q() {
        return (j) this.f9473c.g(n(), (j) null, g(1, ((j) this.f9473c).d, (h) null));
    }

    public void r(j jVar) {
        this.f9473c = jVar;
    }
}
