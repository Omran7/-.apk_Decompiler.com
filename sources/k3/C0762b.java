package k3;

import I1.b;
import S3.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import v3.C1048c;

/* renamed from: k3.b  reason: case insensitive filesystem */
public final class C0762b extends c {

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f9463a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f9464b;

    /* renamed from: c  reason: collision with root package name */
    public final Comparator f9465c;

    public C0762b(Comparator comparator) {
        this.f9463a = new Object[0];
        this.f9464b = new Object[0];
        this.f9465c = comparator;
    }

    public static C0762b C(List list, Map map, Comparator comparator) {
        Collections.sort(list, comparator);
        int size = list.size();
        Object[] objArr = new Object[size];
        Object[] objArr2 = new Object[size];
        int i2 = 0;
        for (Object next : list) {
            objArr[i2] = next;
            objArr2[i2] = map.get(next);
            i2++;
        }
        return new C0762b(comparator, objArr, objArr2);
    }

    public final c A(Iterable iterable, Object obj) {
        int D4 = D(obj);
        Object[] objArr = this.f9464b;
        Object[] objArr2 = this.f9463a;
        Comparator comparator = this.f9465c;
        if (D4 != -1) {
            if (objArr2[D4] == obj && objArr[D4] == iterable) {
                return this;
            }
            int length = objArr2.length;
            Object[] objArr3 = new Object[length];
            System.arraycopy(objArr2, 0, objArr3, 0, length);
            objArr3[D4] = obj;
            int length2 = objArr.length;
            Object[] objArr4 = new Object[length2];
            System.arraycopy(objArr, 0, objArr4, 0, length2);
            objArr4[D4] = iterable;
            return new C0762b(comparator, objArr3, objArr4);
        } else if (objArr2.length > 25) {
            HashMap hashMap = new HashMap(objArr2.length + 1);
            for (int i2 = 0; i2 < objArr2.length; i2++) {
                hashMap.put(objArr2[i2], objArr[i2]);
            }
            hashMap.put(obj, iterable);
            return z.k(new ArrayList(hashMap.keySet()), hashMap, comparator);
        } else {
            int i5 = 0;
            while (i5 < objArr2.length && comparator.compare(objArr2[i5], obj) < 0) {
                i5++;
            }
            int length3 = objArr2.length + 1;
            Object[] objArr5 = new Object[length3];
            System.arraycopy(objArr2, 0, objArr5, 0, i5);
            objArr5[i5] = obj;
            int i6 = i5 + 1;
            System.arraycopy(objArr2, i5, objArr5, i6, (length3 - i5) - 1);
            int length4 = objArr.length + 1;
            Object[] objArr6 = new Object[length4];
            System.arraycopy(objArr, 0, objArr6, 0, i5);
            objArr6[i5] = iterable;
            System.arraycopy(objArr, i5, objArr6, i6, (length4 - i5) - 1);
            return new C0762b(comparator, objArr5, objArr6);
        }
    }

    public final c B(Object obj) {
        int D4 = D(obj);
        if (D4 == -1) {
            return this;
        }
        Object[] objArr = this.f9463a;
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, D4);
        int i2 = D4 + 1;
        System.arraycopy(objArr, i2, objArr2, D4, length - D4);
        Object[] objArr3 = this.f9464b;
        int length2 = objArr3.length - 1;
        Object[] objArr4 = new Object[length2];
        System.arraycopy(objArr3, 0, objArr4, 0, D4);
        System.arraycopy(objArr3, i2, objArr4, D4, length2 - D4);
        return new C0762b(this.f9465c, objArr2, objArr4);
    }

    public final int D(Object obj) {
        int i2 = 0;
        for (Object compare : this.f9463a) {
            if (this.f9465c.compare(obj, compare) == 0) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public final boolean isEmpty() {
        if (this.f9463a.length == 0) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return new C0761a(this, 0, false);
    }

    public final boolean k(Object obj) {
        if (D(obj) != -1) {
            return true;
        }
        return false;
    }

    public final Iterator s() {
        return new C0761a(this, this.f9463a.length - 1, true);
    }

    public final int size() {
        return this.f9463a.length;
    }

    public final Object t(C1048c cVar) {
        int D4 = D(cVar);
        if (D4 != -1) {
            return this.f9464b[D4];
        }
        return null;
    }

    public final Comparator v() {
        return this.f9465c;
    }

    public final Object w() {
        Object[] objArr = this.f9463a;
        if (objArr.length > 0) {
            return objArr[objArr.length - 1];
        }
        return null;
    }

    public final Object x() {
        Object[] objArr = this.f9463a;
        if (objArr.length > 0) {
            return objArr[0];
        }
        return null;
    }

    public final Object y(Object obj) {
        int D4 = D(obj);
        if (D4 == -1) {
            throw new IllegalArgumentException("Can't find predecessor of nonexistent key");
        } else if (D4 <= 0) {
            return null;
        } else {
            return this.f9463a[D4 - 1];
        }
    }

    public final void z(b bVar) {
        int i2 = 0;
        while (true) {
            Object[] objArr = this.f9463a;
            if (i2 < objArr.length) {
                bVar.P0(objArr[i2], this.f9464b[i2]);
                i2++;
            } else {
                return;
            }
        }
    }

    public C0762b(Comparator comparator, Object[] objArr, Object[] objArr2) {
        this.f9463a = objArr;
        this.f9464b = objArr2;
        this.f9465c = comparator;
    }
}
