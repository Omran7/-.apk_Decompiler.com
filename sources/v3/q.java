package v3;

public final class q {

    /* renamed from: c  reason: collision with root package name */
    public static final q f12303c = new q(C1048c.f12278b, k.f12295e);
    public static final q d = new q(C1048c.f12279c, s.f12306n);

    /* renamed from: a  reason: collision with root package name */
    public final C1048c f12304a;

    /* renamed from: b  reason: collision with root package name */
    public final s f12305b;

    public q(C1048c cVar, s sVar) {
        this.f12304a = cVar;
        this.f12305b = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f12304a.equals(qVar.f12304a) && this.f12305b.equals(qVar.f12305b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12305b.hashCode() + (this.f12304a.f12280a.hashCode() * 31);
    }

    public final String toString() {
        return "NamedNode{name=" + this.f12304a + ", node=" + this.f12305b + '}';
    }
}
