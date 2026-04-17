package A3;

import java.util.Collections;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f61a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f62b;

    public c(Map map, String str) {
        this.f61a = str;
        this.f62b = map;
    }

    public static c a(String str) {
        return new c(Collections.emptyMap(), str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f61a.equals(cVar.f61a) || !this.f62b.equals(cVar.f62b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f62b.hashCode() + (this.f61a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f61a + ", properties=" + this.f62b.values() + "}";
    }
}
