package y2;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final int f12708a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12709b;

    public m(int i2, long j6) {
        this.f12708a = i2;
        this.f12709b = j6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        r8 = (y2.m) r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof y2.m
            r2 = 0
            if (r1 == 0) goto L_0x001a
            y2.m r8 = (y2.m) r8
            int r1 = r8.f12708a
            int r3 = r7.f12708a
            if (r3 != r1) goto L_0x001a
            long r3 = r7.f12709b
            long r5 = r8.f12709b
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x001a
            return r0
        L_0x001a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.m.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        long j6 = this.f12709b;
        return ((int) (j6 ^ (j6 >>> 32))) ^ ((this.f12708a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f12708a + ", eventTimestamp=" + this.f12709b + "}";
    }
}
