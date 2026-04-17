package C5;

public final class c extends a {
    static {
        new a(1, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        r2 = (C5.c) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof C5.c
            if (r0 == 0) goto L_0x0026
            char r0 = r4.f474a
            char r1 = r4.f475b
            if (r0 >= r1) goto L_0x000b
            goto L_0x001a
        L_0x000b:
            if (r0 != r1) goto L_0x000e
            goto L_0x001a
        L_0x000e:
            r2 = r5
            C5.c r2 = (C5.c) r2
            char r3 = r2.f474a
            char r2 = r2.f475b
            if (r3 >= r2) goto L_0x0018
            goto L_0x001a
        L_0x0018:
            if (r3 != r2) goto L_0x0024
        L_0x001a:
            C5.c r5 = (C5.c) r5
            char r2 = r5.f474a
            if (r0 != r2) goto L_0x0026
            char r5 = r5.f475b
            if (r1 != r5) goto L_0x0026
        L_0x0024:
            r5 = 1
            goto L_0x0027
        L_0x0026:
            r5 = 0
        L_0x0027:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: C5.c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        char c3 = this.f474a;
        char c6 = this.f475b;
        if (c3 >= c6 && c3 != c6) {
            return -1;
        }
        return (c3 * 31) + c6;
    }

    public final String toString() {
        return this.f474a + ".." + this.f475b;
    }
}
