package U3;

import h0.C0552a;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f3707a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3708b;

    public a(String str, String str2) {
        this.f3707a = str;
        if (str2 != null) {
            this.f3708b = str2;
            return;
        }
        throw new NullPointerException("Null version");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f3707a.equals(aVar.f3707a) || !this.f3708b.equals(aVar.f3708b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f3707a.hashCode() ^ 1000003) * 1000003) ^ this.f3708b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f3707a);
        sb.append(", version=");
        return C0552a.r(sb, this.f3708b, "}");
    }
}
