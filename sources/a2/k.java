package A2;

import java.util.Map;

public final class k extends g {
    public final transient n d;

    /* renamed from: e  reason: collision with root package name */
    public final transient Object[] f38e;

    /* renamed from: f  reason: collision with root package name */
    public final transient int f39f;

    public k(n nVar, Object[] objArr, int i2) {
        this.d = nVar;
        this.f38e = objArr;
        this.f39f = i2;
    }

    public final d A() {
        return new j(this);
    }

    /* renamed from: B */
    public final s iterator() {
        return x().listIterator(0);
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        if (value == null || !value.equals(this.d.get(key))) {
            return false;
        }
        return true;
    }

    public final int k(Object[] objArr) {
        return x().k(objArr);
    }

    public final int size() {
        return this.f39f;
    }
}
