package g3;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final p f8026a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8027b;

    public g(p pVar, boolean z3) {
        this.f8026a = pVar;
        this.f8027b = z3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!gVar.f8026a.equals(this.f8026a) || gVar.f8027b != this.f8027b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f8026a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f8027b).hashCode();
    }
}
