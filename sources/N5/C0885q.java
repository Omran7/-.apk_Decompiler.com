package n5;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.j;
import y5.a;

/* renamed from: n5.q  reason: case insensitive filesystem */
public final class C0885q implements Set, Serializable, a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0885q f10400a = new Object();

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        j.e((Void) obj, "element");
        return false;
    }

    public final boolean containsAll(Collection collection) {
        j.e(collection, "elements");
        return collection.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Set) || !((Set) obj).isEmpty()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final Iterator iterator() {
        return C0882n.f10397a;
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public final Object[] toArray() {
        return j.h(this);
    }

    public final String toString() {
        return "[]";
    }

    public final Object[] toArray(Object[] objArr) {
        j.e(objArr, "array");
        return j.i(this, objArr);
    }
}
