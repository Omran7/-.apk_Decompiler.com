package n5;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.j;
import y5.a;

/* renamed from: n5.p  reason: case insensitive filesystem */
public final class C0884p implements Map, Serializable, a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0884p f10399a = new Object();

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsKey(Object obj) {
        return false;
    }

    public final boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        j.e((Void) obj, "value");
        return false;
    }

    public final /* bridge */ Set entrySet() {
        return C0885q.f10400a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Map) || !((Map) obj).isEmpty()) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final /* bridge */ Set keySet() {
        return C0885q.f10400a;
    }

    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public final String toString() {
        return "{}";
    }

    public final /* bridge */ Collection values() {
        return C0883o.f10398a;
    }
}
