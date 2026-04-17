package n5;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.j;
import y5.a;

/* renamed from: n5.d  reason: case insensitive filesystem */
public final class C0872d implements Collection, a {

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f10393a;

    public C0872d(Object[] objArr) {
        j.e(objArr, "values");
        this.f10393a = objArr;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        return C0874f.t1(this.f10393a, obj);
    }

    public final boolean containsAll(Collection collection) {
        j.e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object t12 : collection) {
            if (!C0874f.t1(this.f10393a, t12)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        if (this.f10393a.length == 0) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        Object[] objArr = this.f10393a;
        j.e(objArr, "array");
        return new kotlin.jvm.internal.a(objArr);
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

    public final int size() {
        return this.f10393a.length;
    }

    public final Object[] toArray() {
        Object[] objArr = this.f10393a;
        j.e(objArr, "<this>");
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        j.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    public final Object[] toArray(Object[] objArr) {
        j.e(objArr, "array");
        return j.i(this, objArr);
    }
}
