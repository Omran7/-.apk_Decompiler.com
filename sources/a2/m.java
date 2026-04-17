package A2;

import java.util.Objects;
import w5.a;

public final class m extends d {

    /* renamed from: c  reason: collision with root package name */
    public final transient Object[] f41c;
    public final transient int d;

    /* renamed from: e  reason: collision with root package name */
    public final transient int f42e;

    public m(Object[] objArr, int i2, int i5) {
        this.f41c = objArr;
        this.d = i2;
        this.f42e = i5;
    }

    public final Object get(int i2) {
        a.b(i2, this.f42e);
        Object obj = this.f41c[(i2 * 2) + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    public final int size() {
        return this.f42e;
    }
}
