package com.google.android.gms.common.api;

public class j extends Exception {
    @Deprecated
    protected final Status mStatus;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j(com.google.android.gms.common.api.Status r4) {
        /*
            r3 = this;
            int r0 = r4.f6007a
            java.lang.String r1 = r4.f6008b
            if (r1 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            java.lang.String r1 = ""
        L_0x0009:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = ": "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r3.<init>(r0)
            r3.mStatus = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.j.<init>(com.google.android.gms.common.api.Status):void");
    }

    public Status getStatus() {
        return this.mStatus;
    }

    public int getStatusCode() {
        return this.mStatus.f6007a;
    }

    @Deprecated
    public String getStatusMessage() {
        return this.mStatus.f6008b;
    }
}
