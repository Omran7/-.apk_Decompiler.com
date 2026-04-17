package n;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

public final class d implements Collection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f10213a;

    public d(e eVar) {
        this.f10213a = eVar;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f10213a.clear();
    }

    public final boolean contains(Object obj) {
        if (this.f10213a.a(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        return this.f10213a.isEmpty();
    }

    public final Iterator iterator() {
        return new C0850a(this.f10213a, 1);
    }

    public final boolean remove(Object obj) {
        e eVar = this.f10213a;
        int a6 = eVar.a(obj);
        if (a6 < 0) {
            return false;
        }
        eVar.h(a6);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        e eVar = this.f10213a;
        int i2 = eVar.f10226c;
        int i5 = 0;
        boolean z3 = false;
        while (i5 < i2) {
            if (collection.contains(eVar.j(i5))) {
                eVar.h(i5);
                i5--;
                i2--;
                z3 = true;
            }
            i5++;
        }
        return z3;
    }

    public final boolean retainAll(Collection collection) {
        e eVar = this.f10213a;
        int i2 = eVar.f10226c;
        int i5 = 0;
        boolean z3 = false;
        while (i5 < i2) {
            if (!collection.contains(eVar.j(i5))) {
                eVar.h(i5);
                i5--;
                i2--;
                z3 = true;
            }
            i5++;
        }
        return z3;
    }

    public final int size() {
        return this.f10213a.f10226c;
    }

    public final Object[] toArray() {
        e eVar = this.f10213a;
        int i2 = eVar.f10226c;
        Object[] objArr = new Object[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            objArr[i5] = eVar.j(i5);
        }
        return objArr;
    }

    public final Object[] toArray(Object[] objArr) {
        e eVar = this.f10213a;
        int i2 = eVar.f10226c;
        if (objArr.length < i2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2);
        }
        for (int i5 = 0; i5 < i2; i5++) {
            objArr[i5] = eVar.j(i5);
        }
        if (objArr.length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }
}
