package P2;

import java.nio.charset.Charset;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f2170a = Charset.forName("UTF-8");

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00dc, code lost:
        if (r7 == 1) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00de, code lost:
        if (r7 == 2) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e0, code lost:
        if (r7 == 3) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e2, code lost:
        if (r7 == 4) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e5, code lost:
        r15 = r9 + 1;
        r3[r9] = (byte) (r8 >> 10);
        r9 = r9 + 2;
        r3[r15] = (byte) (r8 >> 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f4, code lost:
        r3[r9] = (byte) (r8 >> 4);
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fc, code lost:
        if (r9 != r1) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ff, code lost:
        r15 = new byte[r9];
        java.lang.System.arraycopy(r3, 0, r15, 0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        return r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00dc A[EDGE_INSN: B:55:0x00dc->B:40:0x00dc ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] a(java.lang.String r15) {
        /*
            java.nio.charset.Charset r0 = f2170a
            byte[] r15 = r15.getBytes(r0)
            int r0 = r15.length
            int r1 = r0 * 3
            r2 = 4
            int r1 = r1 / r2
            byte[] r3 = new byte[r1]
            int[] r4 = P2.e.f2168w
            r5 = 0
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
        L_0x0014:
            r10 = 3
            r11 = 2
            r12 = 1
            if (r6 >= r0) goto L_0x00dc
            if (r7 != 0) goto L_0x0061
        L_0x001b:
            int r13 = r6 + 4
            if (r13 > r0) goto L_0x005d
            byte r8 = r15[r6]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r8 = r4[r8]
            int r8 = r8 << 18
            int r14 = r6 + 1
            byte r14 = r15[r14]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r14 = r4[r14]
            int r14 = r14 << 12
            r8 = r8 | r14
            int r14 = r6 + 2
            byte r14 = r15[r14]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r14 = r4[r14]
            int r14 = r14 << 6
            r8 = r8 | r14
            int r14 = r6 + 3
            byte r14 = r15[r14]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r14 = r4[r14]
            r8 = r8 | r14
            if (r8 < 0) goto L_0x005d
            int r6 = r9 + 2
            byte r14 = (byte) r8
            r3[r6] = r14
            int r6 = r9 + 1
            int r14 = r8 >> 8
            byte r14 = (byte) r14
            r3[r6] = r14
            int r6 = r8 >> 16
            byte r6 = (byte) r6
            r3[r9] = r6
            int r9 = r9 + 3
            r6 = r13
            goto L_0x001b
        L_0x005d:
            if (r6 < r0) goto L_0x0061
            goto L_0x00dc
        L_0x0061:
            int r13 = r6 + 1
            byte r6 = r15[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r4[r6]
            r14 = -1
            if (r7 == 0) goto L_0x00d4
            if (r7 == r12) goto L_0x00ce
            r12 = -2
            if (r7 == r11) goto L_0x00b7
            r11 = 5
            if (r7 == r10) goto L_0x0087
            if (r7 == r2) goto L_0x007e
            if (r7 == r11) goto L_0x007a
            goto L_0x00d9
        L_0x007a:
            if (r6 != r14) goto L_0x0106
            goto L_0x00d9
        L_0x007e:
            if (r6 != r12) goto L_0x0084
            int r7 = r7 + 1
            goto L_0x00d9
        L_0x0084:
            if (r6 != r14) goto L_0x0106
            goto L_0x00d9
        L_0x0087:
            if (r6 < 0) goto L_0x00a2
            int r7 = r8 << 6
            r6 = r6 | r7
            int r7 = r9 + 2
            byte r8 = (byte) r6
            r3[r7] = r8
            int r7 = r9 + 1
            int r8 = r6 >> 8
            byte r8 = (byte) r8
            r3[r7] = r8
            int r7 = r6 >> 16
            byte r7 = (byte) r7
            r3[r9] = r7
            int r9 = r9 + 3
            r7 = r5
        L_0x00a0:
            r8 = r6
            goto L_0x00d9
        L_0x00a2:
            if (r6 != r12) goto L_0x00b4
            int r6 = r9 + 1
            int r7 = r8 >> 2
            byte r7 = (byte) r7
            r3[r6] = r7
            int r6 = r8 >> 10
            byte r6 = (byte) r6
            r3[r9] = r6
            int r9 = r9 + 2
            r7 = r11
            goto L_0x00d9
        L_0x00b4:
            if (r6 != r14) goto L_0x0106
            goto L_0x00d9
        L_0x00b7:
            if (r6 < 0) goto L_0x00bf
        L_0x00b9:
            int r8 = r8 << 6
            r6 = r6 | r8
        L_0x00bc:
            int r7 = r7 + 1
            goto L_0x00a0
        L_0x00bf:
            if (r6 != r12) goto L_0x00cb
            int r6 = r9 + 1
            int r7 = r8 >> 4
            byte r7 = (byte) r7
            r3[r9] = r7
            r7 = r2
            r9 = r6
            goto L_0x00d9
        L_0x00cb:
            if (r6 != r14) goto L_0x0106
            goto L_0x00d9
        L_0x00ce:
            if (r6 < 0) goto L_0x00d1
            goto L_0x00b9
        L_0x00d1:
            if (r6 != r14) goto L_0x0106
            goto L_0x00d9
        L_0x00d4:
            if (r6 < 0) goto L_0x00d7
            goto L_0x00bc
        L_0x00d7:
            if (r6 != r14) goto L_0x0106
        L_0x00d9:
            r6 = r13
            goto L_0x0014
        L_0x00dc:
            if (r7 == r12) goto L_0x0106
            if (r7 == r11) goto L_0x00f4
            if (r7 == r10) goto L_0x00e5
            if (r7 == r2) goto L_0x0106
            goto L_0x00fc
        L_0x00e5:
            int r15 = r9 + 1
            int r0 = r8 >> 10
            byte r0 = (byte) r0
            r3[r9] = r0
            int r9 = r9 + 2
            int r0 = r8 >> 2
            byte r0 = (byte) r0
            r3[r15] = r0
            goto L_0x00fc
        L_0x00f4:
            int r15 = r9 + 1
            int r0 = r8 >> 4
            byte r0 = (byte) r0
            r3[r9] = r0
            r9 = r15
        L_0x00fc:
            if (r9 != r1) goto L_0x00ff
            goto L_0x0105
        L_0x00ff:
            byte[] r15 = new byte[r9]
            java.lang.System.arraycopy(r3, r5, r15, r5, r9)
            r3 = r15
        L_0x0105:
            return r3
        L_0x0106:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "bad base-64"
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.f.a(java.lang.String):byte[]");
    }

    public static byte[] b(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = e.f2169x;
        int i2 = (length / 3) * 4;
        if (length % 3 > 0) {
            i2 += 4;
        }
        byte[] bArr3 = new byte[i2];
        int i5 = 0;
        int i6 = -1;
        int i7 = 0;
        while (true) {
            int i8 = i5 + 3;
            if (i8 > length) {
                break;
            }
            byte b6 = (bArr[i5 + 2] & 255) | ((bArr[i5] & 255) << 16) | ((bArr[i5 + 1] & 255) << 8);
            bArr3[i7] = bArr2[(b6 >> 18) & 63];
            bArr3[i7 + 1] = bArr2[(b6 >> 12) & 63];
            bArr3[i7 + 2] = bArr2[(b6 >> 6) & 63];
            bArr3[i7 + 3] = bArr2[b6 & 63];
            int i9 = i7 + 4;
            i6--;
            if (i6 == 0) {
                i7 += 5;
                bArr3[i9] = 10;
                i6 = 19;
            } else {
                i7 = i9;
            }
            i5 = i8;
        }
        if (i5 == length - 1) {
            int i10 = (bArr[i5] & 255) << 4;
            bArr3[i7] = bArr2[(i10 >> 6) & 63];
            bArr3[i7 + 1] = bArr2[i10 & 63];
            bArr3[i7 + 2] = 61;
            bArr3[i7 + 3] = 61;
        } else if (i5 == length - 2) {
            int i11 = ((bArr[i5 + 1] & 255) << 2) | ((bArr[i5] & 255) << 10);
            bArr3[i7] = bArr2[(i11 >> 12) & 63];
            bArr3[i7 + 1] = bArr2[(i11 >> 6) & 63];
            bArr3[i7 + 2] = bArr2[i11 & 63];
            bArr3[i7 + 3] = 61;
        }
        return bArr3;
    }
}
