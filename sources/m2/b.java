package M2;

import C2.f;
import java.util.Objects;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final f f1821a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1822b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1823c;
    public final String d;

    public b(f fVar, int i2, String str, String str2) {
        this.f1821a = fVar;
        this.f1822b = i2;
        this.f1823c = str;
        this.d = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r4 = (M2.b) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof M2.b
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            M2.b r4 = (M2.b) r4
            C2.f r0 = r4.f1821a
            C2.f r2 = r3.f1821a
            if (r2 != r0) goto L_0x0029
            int r0 = r3.f1822b
            int r2 = r4.f1822b
            if (r0 != r2) goto L_0x0029
            java.lang.String r0 = r3.f1823c
            java.lang.String r2 = r4.f1823c
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = r3.d
            java.lang.String r4 = r4.d
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0029
            r1 = 1
        L_0x0029:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f1821a, Integer.valueOf(this.f1822b), this.f1823c, this.d});
    }

    public final String toString() {
        return "(status=" + this.f1821a + ", keyId=" + this.f1822b + ", keyType='" + this.f1823c + "', keyPrefix='" + this.d + "')";
    }
}
