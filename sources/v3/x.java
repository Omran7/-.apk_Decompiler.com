package v3;

public final class x extends l {

    /* renamed from: a  reason: collision with root package name */
    public static final x f12313a = new Object();

    public final String a() {
        return ".value";
    }

    public final boolean b(s sVar) {
        return true;
    }

    public final q c(C1048c cVar, s sVar) {
        return new q(cVar, sVar);
    }

    public final int compare(Object obj, Object obj2) {
        q qVar = (q) obj;
        q qVar2 = (q) obj2;
        int compareTo = qVar.f12305b.compareTo(qVar2.f12305b);
        if (compareTo == 0) {
            return qVar.f12304a.compareTo(qVar2.f12304a);
        }
        return compareTo;
    }

    public final q d() {
        return new q(C1048c.f12279c, s.f12306n);
    }

    public final boolean equals(Object obj) {
        return obj instanceof x;
    }

    public final int hashCode() {
        return 4;
    }

    public final String toString() {
        return "ValueIndex";
    }
}
