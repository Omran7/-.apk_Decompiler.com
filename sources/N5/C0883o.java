package n5;

import h0.C0552a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.j;
import y5.a;

/* renamed from: n5.o  reason: case insensitive filesystem */
public final class C0883o implements List, Serializable, RandomAccess, a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0883o f10398a = new Object();

    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(int i2, Collection collection) {
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
        if (!(obj instanceof List) || !((List) obj).isEmpty()) {
            return false;
        }
        return true;
    }

    public final Object get(int i2) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i2 + '.');
    }

    public final int hashCode() {
        return 1;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        j.e((Void) obj, "element");
        return -1;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final Iterator iterator() {
        return C0882n.f10397a;
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        j.e((Void) obj, "element");
        return -1;
    }

    public final ListIterator listIterator() {
        return C0882n.f10397a;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public final List subList(int i2, int i5) {
        if (i2 == 0 && i5 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException(C0552a.l("fromIndex: ", i2, i5, ", toIndex: "));
    }

    public final Object[] toArray() {
        return j.h(this);
    }

    public final String toString() {
        return "[]";
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final ListIterator listIterator(int i2) {
        if (i2 == 0) {
            return C0882n.f10397a;
        }
        throw new IndexOutOfBoundsException(com.google.android.gms.internal.measurement.a.f(i2, "Index: "));
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object[] toArray(Object[] objArr) {
        j.e(objArr, "array");
        return j.i(this, objArr);
    }
}
