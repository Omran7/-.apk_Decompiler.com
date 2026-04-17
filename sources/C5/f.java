package C5;

public final class f extends d {
    public static final f d = new d(1, 0, 1);

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r3 = (C5.f) r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof C5.f
            if (r0 == 0) goto L_0x0023
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0013
            r0 = r3
            C5.f r0 = (C5.f) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0021
        L_0x0013:
            C5.f r3 = (C5.f) r3
            int r0 = r3.f480a
            int r1 = r2.f480a
            if (r1 != r0) goto L_0x0023
            int r3 = r3.f481b
            int r0 = r2.f481b
            if (r0 != r3) goto L_0x0023
        L_0x0021:
            r3 = 1
            goto L_0x0024
        L_0x0023:
            r3 = 0
        L_0x0024:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: C5.f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f480a * 31) + this.f481b;
    }

    public final boolean isEmpty() {
        if (this.f480a > this.f481b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f480a + ".." + this.f481b;
    }
}
