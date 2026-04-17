package v3;

/* renamed from: v3.a  reason: case insensitive filesystem */
public final class C1046a extends o {

    /* renamed from: c  reason: collision with root package name */
    public final boolean f12276c;

    public C1046a(Boolean bool, s sVar) {
        super(sVar);
        this.f12276c = bool.booleanValue();
    }

    public final s b(s sVar) {
        return new C1046a(Boolean.valueOf(this.f12276c), sVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r4 = (v3.C1046a) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof v3.C1046a
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            v3.a r4 = (v3.C1046a) r4
            boolean r0 = r4.f12276c
            boolean r2 = r3.f12276c
            if (r2 != r0) goto L_0x0019
            v3.s r0 = r3.f12300a
            v3.s r4 = r4.f12300a
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0019
            r1 = 1
        L_0x0019:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.C1046a.equals(java.lang.Object):boolean");
    }

    public final String g(int i2) {
        return v(i2) + "boolean:" + this.f12276c;
    }

    public final Object getValue() {
        return Boolean.valueOf(this.f12276c);
    }

    public final int hashCode() {
        return this.f12300a.hashCode() + (this.f12276c ? 1 : 0);
    }

    public final int k(o oVar) {
        boolean z3 = ((C1046a) oVar).f12276c;
        boolean z4 = this.f12276c;
        if (z4 == z3) {
            return 0;
        }
        if (z4) {
            return 1;
        }
        return -1;
    }

    public final int t() {
        return 2;
    }
}
