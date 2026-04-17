package A2;

import I1.b;
import java.util.Iterator;

public final class o extends g {

    /* renamed from: r  reason: collision with root package name */
    public static final Object[] f49r;

    /* renamed from: s  reason: collision with root package name */
    public static final o f50s;
    public final transient Object[] d;

    /* renamed from: e  reason: collision with root package name */
    public final transient int f51e;

    /* renamed from: f  reason: collision with root package name */
    public final transient Object[] f52f;

    /* renamed from: p  reason: collision with root package name */
    public final transient int f53p;

    /* renamed from: q  reason: collision with root package name */
    public final transient int f54q;

    static {
        Object[] objArr = new Object[0];
        f49r = objArr;
        f50s = new o(objArr, 0, objArr, 0, 0);
    }

    public o(Object[] objArr, int i2, Object[] objArr2, int i5, int i6) {
        this.d = objArr;
        this.f51e = i2;
        this.f52f = objArr2;
        this.f53p = i5;
        this.f54q = i6;
    }

    public final d A() {
        return d.x(this.f54q, this.d);
    }

    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f52f;
            if (objArr.length != 0) {
                int F02 = b.F0(obj.hashCode());
                while (true) {
                    int i2 = F02 & this.f53p;
                    Object obj2 = objArr[i2];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    F02 = i2 + 1;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f51e;
    }

    public final Iterator iterator() {
        return x().listIterator(0);
    }

    public final int k(Object[] objArr) {
        Object[] objArr2 = this.d;
        int i2 = this.f54q;
        System.arraycopy(objArr2, 0, objArr, 0, i2);
        return i2;
    }

    public final int size() {
        return this.f54q;
    }

    public final Object[] t() {
        return this.d;
    }

    public final int v() {
        return this.f54q;
    }

    public final int w() {
        return 0;
    }
}
