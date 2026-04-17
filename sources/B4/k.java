package b4;

import java.util.Map;

public final class k implements Map.Entry {

    /* renamed from: a  reason: collision with root package name */
    public k f5536a;

    /* renamed from: b  reason: collision with root package name */
    public k f5537b;

    /* renamed from: c  reason: collision with root package name */
    public k f5538c;
    public k d;

    /* renamed from: e  reason: collision with root package name */
    public k f5539e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f5540f;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f5541p;

    /* renamed from: q  reason: collision with root package name */
    public Object f5542q;

    /* renamed from: r  reason: collision with root package name */
    public int f5543r;

    public k(boolean z3) {
        this.f5540f = null;
        this.f5541p = z3;
        this.f5539e = this;
        this.d = this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L_0x0032
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r3.f5540f
            if (r0 != 0) goto L_0x0012
            java.lang.Object r0 = r4.getKey()
            if (r0 != 0) goto L_0x0032
            goto L_0x001c
        L_0x0012:
            java.lang.Object r2 = r4.getKey()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0032
        L_0x001c:
            java.lang.Object r0 = r3.f5542q
            if (r0 != 0) goto L_0x0027
            java.lang.Object r4 = r4.getValue()
            if (r4 != 0) goto L_0x0032
            goto L_0x0031
        L_0x0027:
            java.lang.Object r4 = r4.getValue()
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0032
        L_0x0031:
            r1 = 1
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.k.equals(java.lang.Object):boolean");
    }

    public final Object getKey() {
        return this.f5540f;
    }

    public final Object getValue() {
        return this.f5542q;
    }

    public final int hashCode() {
        int i2;
        int i5 = 0;
        Object obj = this.f5540f;
        if (obj == null) {
            i2 = 0;
        } else {
            i2 = obj.hashCode();
        }
        Object obj2 = this.f5542q;
        if (obj2 != null) {
            i5 = obj2.hashCode();
        }
        return i5 ^ i2;
    }

    public final Object setValue(Object obj) {
        if (obj != null || this.f5541p) {
            Object obj2 = this.f5542q;
            this.f5542q = obj;
            return obj2;
        }
        throw new NullPointerException("value == null");
    }

    public final String toString() {
        return this.f5540f + "=" + this.f5542q;
    }

    public k(boolean z3, k kVar, Object obj, k kVar2, k kVar3) {
        this.f5536a = kVar;
        this.f5540f = obj;
        this.f5541p = z3;
        this.f5543r = 1;
        this.d = kVar2;
        this.f5539e = kVar3;
        kVar3.d = this;
        kVar2.f5539e = this;
    }
}
