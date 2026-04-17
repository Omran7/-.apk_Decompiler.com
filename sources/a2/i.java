package A2;

import java.util.Objects;
import w5.a;

public final class i extends d {

    /* renamed from: e  reason: collision with root package name */
    public static final i f35e = new i(new Object[0], 0);

    /* renamed from: c  reason: collision with root package name */
    public final transient Object[] f36c;
    public final transient int d;

    public i(Object[] objArr, int i2) {
        this.f36c = objArr;
        this.d = i2;
    }

    public final Object get(int i2) {
        a.b(i2, this.d);
        Object obj = this.f36c[i2];
        Objects.requireNonNull(obj);
        return obj;
    }

    public final int k(Object[] objArr) {
        Object[] objArr2 = this.f36c;
        int i2 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i2);
        return i2;
    }

    public final int size() {
        return this.d;
    }

    public final Object[] t() {
        return this.f36c;
    }

    public final int v() {
        return this.d;
    }

    public final int w() {
        return 0;
    }
}
