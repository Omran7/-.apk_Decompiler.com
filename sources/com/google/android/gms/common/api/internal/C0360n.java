package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.n  reason: case insensitive filesystem */
public final class C0360n {

    /* renamed from: a  reason: collision with root package name */
    public final Object f6106a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6107b;

    public C0360n(Object obj, String str) {
        this.f6106a = obj;
        this.f6107b = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (com.google.android.gms.common.api.internal.C0360n) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.gms.common.api.internal.C0360n
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            com.google.android.gms.common.api.internal.n r5 = (com.google.android.gms.common.api.internal.C0360n) r5
            java.lang.Object r1 = r5.f6106a
            java.lang.Object r3 = r4.f6106a
            if (r3 != r1) goto L_0x001d
            java.lang.String r1 = r4.f6107b
            java.lang.String r5 = r5.f6107b
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x001d
            return r0
        L_0x001d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C0360n.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.f6107b.hashCode() + (System.identityHashCode(this.f6106a) * 31);
    }
}
