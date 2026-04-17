package m;

import java.util.Map;

public final class c implements Map.Entry {

    /* renamed from: a  reason: collision with root package name */
    public final Object f9832a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f9833b;

    /* renamed from: c  reason: collision with root package name */
    public c f9834c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f9832a = obj;
        this.f9833b = obj2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f9832a.equals(cVar.f9832a) || !this.f9833b.equals(cVar.f9833b)) {
            return false;
        }
        return true;
    }

    public final Object getKey() {
        return this.f9832a;
    }

    public final Object getValue() {
        return this.f9833b;
    }

    public final int hashCode() {
        return this.f9832a.hashCode() ^ this.f9833b.hashCode();
    }

    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f9832a + "=" + this.f9833b;
    }
}
