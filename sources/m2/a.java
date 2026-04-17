package M2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f1819b = new a(Collections.unmodifiableMap(new HashMap()));

    /* renamed from: a  reason: collision with root package name */
    public final Map f1820a;

    public a(Map map) {
        this.f1820a = map;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f1820a.equals(((a) obj).f1820a);
    }

    public final int hashCode() {
        return this.f1820a.hashCode();
    }

    public final String toString() {
        return this.f1820a.toString();
    }
}
