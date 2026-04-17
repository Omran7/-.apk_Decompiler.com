package A2;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import w5.a;

public abstract class d extends a implements List, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    public static final b f24b = new b(i.f35e, 0);

    public static i x(int i2, Object[] objArr) {
        if (i2 == 0) {
            return i.f35e;
        }
        return new i(objArr, i2);
    }

    public final void add(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        Object next;
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj2 = get(i2);
                        Object obj3 = list.get(i2);
                        if (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) {
                            i2++;
                        }
                    }
                    return true;
                }
                Iterator it2 = list.iterator();
                for (Object obj4 : this) {
                    if (it2.hasNext() && (obj4 == (next = it2.next()) || (obj4 != null && obj4.equals(next)))) {
                    }
                }
                return !it2.hasNext();
            }
        }
        return false;
    }

    public final int hashCode() {
        int size = size();
        int i2 = 1;
        for (int i5 = 0; i5 < size; i5++) {
            i2 = ~(~(get(i5).hashCode() + (i2 * 31)));
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (obj.equals(get(i2))) {
                return i2;
            }
        }
        return -1;
    }

    public Iterator iterator() {
        return listIterator(0);
    }

    public int k(Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public final Object remove(int i2) {
        throw new UnsupportedOperationException();
    }

    public final Object set(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: y */
    public final b listIterator(int i2) {
        a.c(i2, size());
        if (isEmpty()) {
            return f24b;
        }
        return new b(this, i2);
    }

    /* renamed from: z */
    public d subList(int i2, int i5) {
        a.d(i2, i5, size());
        int i6 = i5 - i2;
        if (i6 == size()) {
            return this;
        }
        if (i6 == 0) {
            return i.f35e;
        }
        return new c(this, i2, i6);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }
}
