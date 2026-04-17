package com.google.android.play.core.integrity;

final class ao extends IntegrityTokenRequest {

    /* renamed from: a  reason: collision with root package name */
    private final String f6652a;

    /* renamed from: b  reason: collision with root package name */
    private final Long f6653b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f6654c = null;

    public /* synthetic */ ao(String str, Long l6, Object obj, an anVar) {
        this.f6652a = str;
        this.f6653b = l6;
    }

    private static boolean a() {
        return true;
    }

    public final Long cloudProjectNumber() {
        return this.f6653b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof com.google.android.play.core.integrity.IntegrityTokenRequest
            r2 = 0
            if (r1 == 0) goto L_0x0024
            r1 = r6
            com.google.android.play.core.integrity.IntegrityTokenRequest r1 = (com.google.android.play.core.integrity.IntegrityTokenRequest) r1
            java.lang.String r3 = r5.f6652a
            java.lang.String r4 = r1.nonce()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0024
            java.lang.Long r3 = r5.f6653b
            if (r3 != 0) goto L_0x0026
            java.lang.Long r1 = r1.cloudProjectNumber()
            if (r1 != 0) goto L_0x0024
        L_0x0022:
            r1 = r0
            goto L_0x0031
        L_0x0024:
            r1 = r2
            goto L_0x0031
        L_0x0026:
            java.lang.Long r1 = r1.cloudProjectNumber()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0024
            goto L_0x0022
        L_0x0031:
            boolean r3 = r6 instanceof com.google.android.play.core.integrity.ao
            if (r3 == 0) goto L_0x0044
            boolean r3 = a()
            if (r3 == 0) goto L_0x0044
            com.google.android.play.core.integrity.ao r6 = (com.google.android.play.core.integrity.ao) r6
            if (r1 == 0) goto L_0x0042
            java.lang.Object r6 = r6.f6654c
            goto L_0x0045
        L_0x0042:
            r0 = r2
            goto L_0x0045
        L_0x0044:
            r0 = r1
        L_0x0045:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.integrity.ao.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i2;
        int hashCode = this.f6652a.hashCode() ^ 1000003;
        Long l6 = this.f6653b;
        if (l6 == null) {
            i2 = 0;
        } else {
            i2 = l6.hashCode();
        }
        int i5 = (hashCode * 1000003) ^ i2;
        if (a()) {
            return i5 * 1000003;
        }
        return i5;
    }

    public final String nonce() {
        return this.f6652a;
    }

    public final String toString() {
        String str = "IntegrityTokenRequest{nonce=" + this.f6652a + ", cloudProjectNumber=" + this.f6653b;
        if (a()) {
            str = str.concat(", network=null");
        }
        return str.concat("}");
    }
}
