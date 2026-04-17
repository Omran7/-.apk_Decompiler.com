package n;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class b implements Set {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f10209a;

    public b(e eVar) {
        this.f10209a = eVar;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f10209a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f10209a.containsKey(obj);
    }

    public final boolean containsAll(Collection collection) {
        return this.f10209a.k(collection);
    }

    public final boolean equals(Object obj) {
        e eVar = this.f10209a;
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (eVar.f10226c == set.size() && eVar.k(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        e eVar = this.f10209a;
        int i5 = 0;
        for (int i6 = eVar.f10226c - 1; i6 >= 0; i6--) {
            Object f6 = eVar.f(i6);
            if (f6 == null) {
                i2 = 0;
            } else {
                i2 = f6.hashCode();
            }
            i5 += i2;
        }
        return i5;
    }

    public final boolean isEmpty() {
        return this.f10209a.isEmpty();
    }

    public final Iterator iterator() {
        return new C0850a(this.f10209a, 0);
    }

    public final boolean remove(Object obj) {
        e eVar = this.f10209a;
        int d = eVar.d(obj);
        if (d < 0) {
            return false;
        }
        eVar.h(d);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        return this.f10209a.l(collection);
    }

    public final boolean retainAll(Collection collection) {
        e eVar = this.f10209a;
        int i2 = eVar.f10226c;
        for (int i5 = i2 - 1; i5 >= 0; i5--) {
            if (!collection.contains(eVar.f(i5))) {
                eVar.h(i5);
            }
        }
        if (i2 != eVar.f10226c) {
            return true;
        }
        return false;
    }

    public final int size() {
        return this.f10209a.f10226c;
    }

    public final Object[] toArray() {
        e eVar = this.f10209a;
        int i2 = eVar.f10226c;
        Object[] objArr = new Object[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            objArr[i5] = eVar.f(i5);
        }
        return objArr;
    }

    public final Object[] toArray(Object[] objArr) {
        e eVar = this.f10209a;
        int i2 = eVar.f10226c;
        if (objArr.length < i2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2);
        }
        for (int i5 = 0; i5 < i2; i5++) {
            objArr[i5] = eVar.f(i5);
        }
        if (objArr.length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }
}
