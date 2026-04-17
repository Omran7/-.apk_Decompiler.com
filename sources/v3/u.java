package v3;

public final class u extends l {

    /* renamed from: a  reason: collision with root package name */
    public static final u f12308a = new Object();

    public final String a() {
        throw new IllegalArgumentException("Can't get query definition on priority index!");
    }

    public final boolean b(s sVar) {
        return !sVar.c().isEmpty();
    }

    public final q c(C1048c cVar, s sVar) {
        return new q(cVar, new w("[PRIORITY-POST]", sVar));
    }

    public final int compare(Object obj, Object obj2) {
        q qVar = (q) obj;
        q qVar2 = (q) obj2;
        int compareTo = qVar.f12305b.c().compareTo(qVar2.f12305b.c());
        if (compareTo != 0) {
            return compareTo;
        }
        return qVar.f12304a.compareTo(qVar2.f12304a);
    }

    public final q d() {
        return c(C1048c.f12279c, s.f12306n);
    }

    public final boolean equals(Object obj) {
        return obj instanceof u;
    }

    public final int hashCode() {
        return 3155577;
    }

    public final String toString() {
        return "PriorityIndex";
    }
}
