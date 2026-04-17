package A2;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

public abstract class a extends AbstractCollection implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final Object[] f18a = new Object[0];

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    public abstract int k(Object[] objArr);

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public Object[] t() {
        return null;
    }

    public final Object[] toArray() {
        return toArray(f18a);
    }

    public int v() {
        throw new UnsupportedOperationException();
    }

    public int w() {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        if (objArr.length < size) {
            Object[] t6 = t();
            if (t6 != null) {
                return Arrays.copyOfRange(t6, w(), v(), objArr.getClass());
            }
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        k(objArr);
        return objArr;
    }
}
