package n3;

import B0.A;
import androidx.fragment.app.D;
import j4.p0;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import q3.e;
import q3.h;
import q3.l;
import v3.C1048c;
import v3.s;

/* renamed from: n3.b  reason: case insensitive filesystem */
public final class C0861b implements Iterable {

    /* renamed from: b  reason: collision with root package name */
    public static final C0861b f10257b = new C0861b(new e((Comparable) null));

    /* renamed from: a  reason: collision with root package name */
    public final e f10258a;

    public C0861b(e eVar) {
        this.f10258a = eVar;
    }

    public static s w(C0866g gVar, e eVar, s sVar) {
        C1048c cVar;
        boolean z3;
        Object obj = eVar.f11088a;
        if (obj != null) {
            return sVar.q(gVar, (s) obj);
        }
        Iterator it2 = eVar.f11089b.iterator();
        s sVar2 = null;
        while (true) {
            boolean hasNext = it2.hasNext();
            cVar = C1048c.d;
            if (!hasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            e eVar2 = (e) entry.getValue();
            C1048c cVar2 = (C1048c) entry.getKey();
            if (cVar2.equals(cVar)) {
                if (eVar2.f11088a != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                l.b("Priority writes must always be leaf nodes", z3);
                sVar2 = (s) eVar2.f11088a;
            } else {
                sVar = w(gVar.v(cVar2), eVar2, sVar);
            }
        }
        if (sVar.f(gVar).isEmpty() || sVar2 == null) {
            return sVar;
        }
        return sVar.q(gVar.v(cVar), sVar2);
    }

    public static C0861b y(AbstractMap abstractMap) {
        e eVar = e.d;
        for (Map.Entry entry : abstractMap.entrySet()) {
            eVar = eVar.z((C0866g) entry.getKey(), new e((s) entry.getValue()));
        }
        return new C0861b(eVar);
    }

    public final HashMap A() {
        HashMap hashMap = new HashMap();
        A a6 = new A(hashMap);
        e eVar = this.f10258a;
        eVar.getClass();
        eVar.t(C0866g.d, a6, (Object) null);
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != C0861b.class) {
            return false;
        }
        return ((C0861b) obj).A().equals(A());
    }

    public final int hashCode() {
        return A().hashCode();
    }

    public final Iterator iterator() {
        return this.f10258a.iterator();
    }

    public final C0861b k(C0866g gVar, s sVar) {
        if (gVar.isEmpty()) {
            return new C0861b(new e(sVar));
        }
        D d = h.h;
        e eVar = this.f10258a;
        C0866g k6 = eVar.k(gVar, d);
        if (k6 == null) {
            return new C0861b(eVar.z(gVar, new e(sVar)));
        }
        C0866g B6 = C0866g.B(k6, gVar);
        s sVar2 = (s) eVar.v(k6);
        C1048c y6 = B6.y();
        if (y6 == null || !y6.equals(C1048c.d) || !sVar2.f(B6.A()).isEmpty()) {
            return new C0861b(eVar.y(k6, sVar2.q(B6, sVar)));
        }
        return this;
    }

    public final C0861b t(C0866g gVar, C0861b bVar) {
        e eVar = bVar.f10258a;
        p0 p0Var = new p0(gVar, 11);
        eVar.getClass();
        return (C0861b) eVar.t(C0866g.d, p0Var, this);
    }

    public final String toString() {
        return "CompoundWrite{" + A().toString() + "}";
    }

    public final s v(s sVar) {
        return w(C0866g.d, this.f10258a, sVar);
    }

    public final C0861b x(C0866g gVar) {
        if (gVar.isEmpty()) {
            return this;
        }
        s z3 = z(gVar);
        if (z3 != null) {
            return new C0861b(new e(z3));
        }
        return new C0861b(this.f10258a.A(gVar));
    }

    public final s z(C0866g gVar) {
        D d = h.h;
        e eVar = this.f10258a;
        C0866g k6 = eVar.k(gVar, d);
        if (k6 != null) {
            return ((s) eVar.v(k6)).f(C0866g.B(k6, gVar));
        }
        return null;
    }
}
