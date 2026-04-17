package q3;

import n3.C0866g;
import n3.n;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public n f11092a;

    /* renamed from: b  reason: collision with root package name */
    public C0866g f11093b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (!this.f11092a.equals(gVar.f11092a)) {
            return false;
        }
        return this.f11093b.equals(gVar.f11093b);
    }

    public final int hashCode() {
        return this.f11093b.hashCode() + (this.f11092a.hashCode() * 31);
    }
}
