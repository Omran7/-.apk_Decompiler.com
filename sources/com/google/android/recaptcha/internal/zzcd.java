package com.google.android.recaptcha.internal;

import android.content.Context;

public final class zzcd {
    public zzcd(Context context) {
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [java.io.OutputStream, java.io.ByteArrayOutputStream, v5.b] */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a4, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a5, code lost:
        v5.a.a(r0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a8, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] zza(java.io.File r9) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.j.e(r9, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r9)
            long r1 = r9.length()     // Catch:{ all -> 0x0028 }
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            java.lang.String r4 = "File "
            if (r3 > 0) goto L_0x0084
            int r1 = (int) r1
            byte[] r2 = new byte[r1]     // Catch:{ all -> 0x0028 }
            r3 = 0
            r5 = r1
            r6 = r3
        L_0x001d:
            if (r5 <= 0) goto L_0x002b
            int r7 = r0.read(r2, r6, r5)     // Catch:{ all -> 0x0028 }
            if (r7 < 0) goto L_0x002b
            int r5 = r5 - r7
            int r6 = r6 + r7
            goto L_0x001d
        L_0x0028:
            r9 = move-exception
            goto L_0x00a3
        L_0x002b:
            java.lang.String r7 = "copyOf(...)"
            if (r5 <= 0) goto L_0x0037
            byte[] r2 = java.util.Arrays.copyOf(r2, r6)     // Catch:{ all -> 0x0028 }
            kotlin.jvm.internal.j.d(r2, r7)     // Catch:{ all -> 0x0028 }
            goto L_0x0065
        L_0x0037:
            int r5 = r0.read()     // Catch:{ all -> 0x0028 }
            r6 = -1
            if (r5 != r6) goto L_0x003f
            goto L_0x0065
        L_0x003f:
            v5.b r6 = new v5.b     // Catch:{ all -> 0x0028 }
            r8 = 8193(0x2001, float:1.1481E-41)
            r6.<init>(r8)     // Catch:{ all -> 0x0028 }
            r6.write(r5)     // Catch:{ all -> 0x0028 }
            z1.m.a(r0, r6)     // Catch:{ all -> 0x0028 }
            int r5 = r6.size()     // Catch:{ all -> 0x0028 }
            int r5 = r5 + r1
            if (r5 < 0) goto L_0x006a
            byte[] r9 = r6.c()     // Catch:{ all -> 0x0028 }
            byte[] r2 = java.util.Arrays.copyOf(r2, r5)     // Catch:{ all -> 0x0028 }
            kotlin.jvm.internal.j.d(r2, r7)     // Catch:{ all -> 0x0028 }
            int r4 = r6.size()     // Catch:{ all -> 0x0028 }
            java.lang.System.arraycopy(r9, r3, r2, r1, r4)     // Catch:{ all -> 0x0028 }
        L_0x0065:
            r9 = 0
            v5.a.a(r0, r9)
            return r2
        L_0x006a:
            java.lang.OutOfMemoryError r1 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x0028 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0028 }
            r2.<init>()     // Catch:{ all -> 0x0028 }
            r2.append(r4)     // Catch:{ all -> 0x0028 }
            r2.append(r9)     // Catch:{ all -> 0x0028 }
            java.lang.String r9 = " is too big to fit in memory."
            r2.append(r9)     // Catch:{ all -> 0x0028 }
            java.lang.String r9 = r2.toString()     // Catch:{ all -> 0x0028 }
            r1.<init>(r9)     // Catch:{ all -> 0x0028 }
            throw r1     // Catch:{ all -> 0x0028 }
        L_0x0084:
            java.lang.OutOfMemoryError r3 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x0028 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0028 }
            r5.<init>(r4)     // Catch:{ all -> 0x0028 }
            r5.append(r9)     // Catch:{ all -> 0x0028 }
            java.lang.String r9 = " is too big ("
            r5.append(r9)     // Catch:{ all -> 0x0028 }
            r5.append(r1)     // Catch:{ all -> 0x0028 }
            java.lang.String r9 = " bytes) to fit in memory."
            r5.append(r9)     // Catch:{ all -> 0x0028 }
            java.lang.String r9 = r5.toString()     // Catch:{ all -> 0x0028 }
            r3.<init>(r9)     // Catch:{ all -> 0x0028 }
            throw r3     // Catch:{ all -> 0x0028 }
        L_0x00a3:
            throw r9     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r1 = move-exception
            v5.a.a(r0, r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcd.zza(java.io.File):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        v5.a.a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void zzb(java.io.File r1, byte[] r2) {
        /*
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0015
            boolean r0 = r1.delete()
            if (r0 == 0) goto L_0x000d
            goto L_0x0015
        L_0x000d:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Unable to delete existing encrypted file"
            r1.<init>(r2)
            throw r1
        L_0x0015:
            java.lang.String r0 = "array"
            kotlin.jvm.internal.j.e(r2, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            r0.write(r2)     // Catch:{ all -> 0x0027 }
            r1 = 0
            v5.a.a(r0, r1)
            return
        L_0x0027:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0029 }
        L_0x0029:
            r2 = move-exception
            v5.a.a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcd.zzb(java.io.File, byte[]):void");
    }
}
