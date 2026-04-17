package q3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import k3.C0762b;
import k3.c;
import k3.n;
import n3.C0866g;
import v3.C1048c;

public final class e implements Iterable {

    /* renamed from: c  reason: collision with root package name */
    public static final C0762b f11087c;
    public static final e d;

    /* renamed from: a  reason: collision with root package name */
    public final Object f11088a;

    /* renamed from: b  reason: collision with root package name */
    public final c f11089b;

    static {
        C0762b bVar = new C0762b(n.f9481a);
        f11087c = bVar;
        d = new e((Object) null, bVar);
    }

    public e(Object obj, c cVar) {
        this.f11088a = obj;
        this.f11089b = cVar;
    }

    public final e A(C0866g gVar) {
        if (gVar.isEmpty()) {
            return this;
        }
        e eVar = (e) this.f11089b.t(gVar.z());
        if (eVar != null) {
            return eVar.A(gVar.C());
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        c cVar = eVar.f11089b;
        c cVar2 = this.f11089b;
        if (cVar2 == null ? cVar != null : !cVar2.equals(cVar)) {
            return false;
        }
        Object obj2 = eVar.f11088a;
        Object obj3 = this.f11088a;
        if (obj3 == null ? obj2 == null : obj3.equals(obj2)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int i5 = 0;
        Object obj = this.f11088a;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = i2 * 31;
        c cVar = this.f11089b;
        if (cVar != null) {
            i5 = cVar.hashCode();
        }
        return i6 + i5;
    }

    public final boolean isEmpty() {
        if (this.f11088a != null || !this.f11089b.isEmpty()) {
            return false;
        }
        return true;
    }

    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        t(C0866g.d, new N0.c(arrayList), (Object) null);
        return arrayList.iterator();
    }

    public final C0866g k(C0866g gVar, h hVar) {
        C0866g k6;
        Object obj = this.f11088a;
        if (obj != null && hVar.f(obj)) {
            return C0866g.d;
        }
        if (gVar.isEmpty()) {
            return null;
        }
        C1048c z3 = gVar.z();
        e eVar = (e) this.f11089b.t(z3);
        if (eVar == null || (k6 = eVar.k(gVar.C(), hVar)) == null) {
            return null;
        }
        return new C0866g(z3).t(k6);
    }

    public final Object t(C0866g gVar, d dVar, Object obj) {
        for (Map.Entry entry : this.f11089b) {
            obj = ((e) entry.getValue()).t(gVar.v((C1048c) entry.getKey()), dVar, obj);
        }
        Object obj2 = this.f11088a;
        if (obj2 != null) {
            return dVar.z(gVar, obj2, obj);
        }
        return obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableTree { value=");
        sb.append(this.f11088a);
        sb.append(", children={");
        for (Map.Entry entry : this.f11089b) {
            sb.append(((C1048c) entry.getKey()).f12280a);
            sb.append("=");
            sb.append(entry.getValue());
        }
        sb.append("} }");
        return sb.toString();
    }

    public final Object v(C0866g gVar) {
        if (gVar.isEmpty()) {
            return this.f11088a;
        }
        e eVar = (e) this.f11089b.t(gVar.z());
        if (eVar != null) {
            return eVar.v(gVar.C());
        }
        return null;
    }

    public final e w(C1048c cVar) {
        e eVar = (e) this.f11089b.t(cVar);
        if (eVar != null) {
            return eVar;
        }
        return d;
    }

    public final e x(C0866g gVar) {
        c cVar;
        boolean isEmpty = gVar.isEmpty();
        e eVar = d;
        c cVar2 = this.f11089b;
        if (!isEmpty) {
            C1048c z3 = gVar.z();
            e eVar2 = (e) cVar2.t(z3);
            if (eVar2 == null) {
                return this;
            }
            e x6 = eVar2.x(gVar.C());
            if (x6.isEmpty()) {
                cVar = cVar2.B(z3);
            } else {
                cVar = cVar2.A(x6, z3);
            }
            Object obj = this.f11088a;
            if (obj != null || !cVar.isEmpty()) {
                return new e(obj, cVar);
            }
            return eVar;
        } else if (cVar2.isEmpty()) {
            return eVar;
        } else {
            return new e((Object) null, cVar2);
        }
    }

    public final e y(C0866g gVar, Object obj) {
        boolean isEmpty = gVar.isEmpty();
        c cVar = this.f11089b;
        if (isEmpty) {
            return new e(obj, cVar);
        }
        C1048c z3 = gVar.z();
        e eVar = (e) cVar.t(z3);
        if (eVar == null) {
            eVar = d;
        }
        return new e(this.f11088a, cVar.A(eVar.y(gVar.C(), obj), z3));
    }

    public final e z(C0866g gVar, e eVar) {
        c cVar;
        if (gVar.isEmpty()) {
            return eVar;
        }
        C1048c z3 = gVar.z();
        c cVar2 = this.f11089b;
        e eVar2 = (e) cVar2.t(z3);
        if (eVar2 == null) {
            eVar2 = d;
        }
        e z4 = eVar2.z(gVar.C(), eVar);
        if (z4.isEmpty()) {
            cVar = cVar2.B(z3);
        } else {
            cVar = cVar2.A(z4, z3);
        }
        return new e(this.f11088a, cVar);
    }

    public e(Comparable comparable) {
        this(comparable, f11087c);
    }
}
