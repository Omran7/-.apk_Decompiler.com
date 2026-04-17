package v3;

import n3.C0866g;

public final class t extends l {

    /* renamed from: a  reason: collision with root package name */
    public final C0866g f12307a;

    public t(C0866g gVar) {
        if (gVar.size() != 1 || !gVar.z().equals(C1048c.d)) {
            this.f12307a = gVar;
            return;
        }
        throw new IllegalArgumentException("Can't create PathIndex with '.priority' as key. Please use PriorityIndex instead!");
    }

    public final String a() {
        return this.f12307a.D();
    }

    public final boolean b(s sVar) {
        return !sVar.f(this.f12307a).isEmpty();
    }

    public final q c(C1048c cVar, s sVar) {
        return new q(cVar, k.f12295e.q(this.f12307a, sVar));
    }

    public final int compare(Object obj, Object obj2) {
        q qVar = (q) obj;
        q qVar2 = (q) obj2;
        s sVar = qVar.f12305b;
        C0866g gVar = this.f12307a;
        int compareTo = sVar.f(gVar).compareTo(qVar2.f12305b.f(gVar));
        if (compareTo == 0) {
            return qVar.f12304a.compareTo(qVar2.f12304a);
        }
        return compareTo;
    }

    public final q d() {
        return new q(C1048c.f12279c, k.f12295e.q(this.f12307a, s.f12306n));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass() || !this.f12307a.equals(((t) obj).f12307a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f12307a.hashCode();
    }
}
