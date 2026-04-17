package b1;

public final class j extends q {

    /* renamed from: a  reason: collision with root package name */
    public final h f5488a;

    public j(h hVar) {
        this.f5488a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        p pVar = p.f5502a;
        ((j) qVar).getClass();
        if (!pVar.equals(pVar) || !this.f5488a.equals(((j) qVar).f5488a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((p.f5502a.hashCode() ^ 1000003) * 1000003) ^ this.f5488a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f5502a + ", androidClientInfo=" + this.f5488a + "}";
    }
}
