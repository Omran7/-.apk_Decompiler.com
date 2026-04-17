package n5;

import M5.g;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.j;
import y5.a;

/* renamed from: n5.c  reason: case insensitive filesystem */
public abstract class C0871c implements List, Collection, a {
    public final void add(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        for (Object a6 : this) {
            if (j.a(a6, obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        j.e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        j.e(collection, "other");
        if (size() == collection.size()) {
            Iterator it2 = collection.iterator();
            for (Object a6 : this) {
                if (!j.a(a6, it2.next())) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int i5 = 1;
        for (Object next : this) {
            int i6 = i5 * 31;
            if (next != null) {
                i2 = next.hashCode();
            } else {
                i2 = 0;
            }
            i5 = i6 + i2;
        }
        return i5;
    }

    public int indexOf(Object obj) {
        int i2 = 0;
        for (Object a6 : this) {
            if (j.a(a6, obj)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public final boolean isEmpty() {
        if (k() == 0) {
            return true;
        }
        return false;
    }

    public Iterator iterator() {
        return new kotlin.jvm.internal.a(this);
    }

    public abstract int k();

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (j.a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public final ListIterator listIterator() {
        return new C0869a(this, 0);
    }

    public final Object remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object set(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return k();
    }

    public final List subList(int i2, int i5) {
        return new C0870b(this, i2, i5);
    }

    public Object[] toArray() {
        return j.h(this);
    }

    public final String toString() {
        return C0875g.U0(this, ", ", "[", "]", new g(this, 2), 24);
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final ListIterator listIterator(int i2) {
        return new C0869a(this, i2);
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object[] toArray(Object[] objArr) {
        j.e(objArr, "array");
        return j.i(this, objArr);
    }
}
