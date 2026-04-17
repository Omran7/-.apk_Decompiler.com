package F0;

import h0.C0552a;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final String f694a;

    public l(String str) {
        this.f694a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f694a.equals(((l) obj).f694a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f694a.hashCode();
    }

    public final String toString() {
        return C0552a.r(new StringBuilder("StringHeaderFactory{value='"), this.f694a, "'}");
    }
}
