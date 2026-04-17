package b1;

public final class n extends v {

    /* renamed from: a  reason: collision with root package name */
    public final u f5500a;

    /* renamed from: b  reason: collision with root package name */
    public final t f5501b;

    public n(u uVar, t tVar) {
        this.f5500a = uVar;
        this.f5501b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        u uVar = this.f5500a;
        if (uVar != null ? uVar.equals(((n) vVar).f5500a) : ((n) vVar).f5500a == null) {
            t tVar = this.f5501b;
            if (tVar == null) {
                if (((n) vVar).f5501b == null) {
                    return true;
                }
            } else if (tVar.equals(((n) vVar).f5501b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int i5 = 0;
        u uVar = this.f5500a;
        if (uVar == null) {
            i2 = 0;
        } else {
            i2 = uVar.hashCode();
        }
        int i6 = (i2 ^ 1000003) * 1000003;
        t tVar = this.f5501b;
        if (tVar != null) {
            i5 = tVar.hashCode();
        }
        return i5 ^ i6;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f5500a + ", mobileSubtype=" + this.f5501b + "}";
    }
}
