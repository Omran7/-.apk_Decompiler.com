package Z0;

import h0.C0552a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f4465a;

    public c(String str) {
        if (str != null) {
            this.f4465a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f4465a.equals(((c) obj).f4465a);
    }

    public final int hashCode() {
        return this.f4465a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return C0552a.r(new StringBuilder("Encoding{name=\""), this.f4465a, "\"}");
    }
}
