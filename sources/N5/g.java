package N5;

import h0.C0552a;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;

public class g implements Serializable, Comparable {
    public static final char[] d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: e  reason: collision with root package name */
    public static final g f1933e = t(new byte[0]);

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f1934a;

    /* renamed from: b  reason: collision with root package name */
    public transient int f1935b;

    /* renamed from: c  reason: collision with root package name */
    public transient String f1936c;

    public g(byte[] bArr) {
        this.f1934a = bArr;
    }

    public static g e(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                int i5 = i2 * 2;
                bArr[i2] = (byte) (j(str.charAt(i5 + 1)) + (j(str.charAt(i5)) << 4));
            }
            return t(bArr);
        }
        throw new IllegalArgumentException("Unexpected hex string: ".concat(str));
    }

    public static int j(char c3) {
        if (c3 >= '0' && c3 <= '9') {
            return c3 - '0';
        }
        if (c3 >= 'a' && c3 <= 'f') {
            return c3 - 'W';
        }
        if (c3 >= 'A' && c3 <= 'F') {
            return c3 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c3);
    }

    public static g k(String str) {
        if (str != null) {
            g gVar = new g(str.getBytes(x.f1968a));
            gVar.f1936c = str;
            return gVar;
        }
        throw new IllegalArgumentException("s == null");
    }

    public static g t(byte... bArr) {
        if (bArr != null) {
            return new g((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public String A() {
        String str = this.f1936c;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f1934a, x.f1968a);
        this.f1936c = str2;
        return str2;
    }

    public void B(d dVar) {
        byte[] bArr = this.f1934a;
        dVar.y(bArr, bArr.length);
    }

    public String a() {
        byte[] bArr = r.f1962c;
        byte[] bArr2 = this.f1934a;
        byte[] bArr3 = new byte[(((bArr2.length + 2) / 3) * 4)];
        int length = bArr2.length - (bArr2.length % 3);
        int i2 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            bArr3[i2] = bArr[(bArr2[i5] & 255) >> 2];
            int i6 = i5 + 1;
            bArr3[i2 + 1] = bArr[((bArr2[i5] & 3) << 4) | ((bArr2[i6] & 255) >> 4)];
            int i7 = i2 + 3;
            int i8 = i5 + 2;
            bArr3[i2 + 2] = bArr[((bArr2[i6] & 15) << 2) | ((bArr2[i8] & 255) >> 6)];
            i2 += 4;
            bArr3[i7] = bArr[bArr2[i8] & 63];
        }
        int length2 = bArr2.length % 3;
        if (length2 == 1) {
            bArr3[i2] = bArr[(bArr2[length] & 255) >> 2];
            bArr3[i2 + 1] = bArr[(bArr2[length] & 3) << 4];
            bArr3[i2 + 2] = 61;
            bArr3[i2 + 3] = 61;
        } else if (length2 == 2) {
            bArr3[i2] = bArr[(bArr2[length] & 255) >> 2];
            int i9 = length + 1;
            bArr3[i2 + 1] = bArr[((bArr2[i9] & 255) >> 4) | ((bArr2[length] & 3) << 4)];
            bArr3[i2 + 2] = bArr[(bArr2[i9] & 15) << 2];
            bArr3[i2 + 3] = 61;
        }
        try {
            return new String(bArr3, "US-ASCII");
        } catch (UnsupportedEncodingException e6) {
            throw new AssertionError(e6);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r0 < r1) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        if (r7 < r8) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compareTo(java.lang.Object r10) {
        /*
            r9 = this;
            N5.g r10 = (N5.g) r10
            int r0 = r9.x()
            int r1 = r10.x()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0010:
            r5 = 1
            r6 = -1
            if (r4 >= r2) goto L_0x002b
            byte r7 = r9.m(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.m(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L_0x0025
            int r4 = r4 + 1
            goto L_0x0010
        L_0x0025:
            if (r7 >= r8) goto L_0x0029
        L_0x0027:
            r3 = r6
            goto L_0x0031
        L_0x0029:
            r3 = r5
            goto L_0x0031
        L_0x002b:
            if (r0 != r1) goto L_0x002e
            goto L_0x0031
        L_0x002e:
            if (r0 >= r1) goto L_0x0029
            goto L_0x0027
        L_0x0031:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: N5.g.compareTo(java.lang.Object):int");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            int x6 = gVar.x();
            byte[] bArr = this.f1934a;
            if (x6 == bArr.length && gVar.v(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i2 = this.f1935b;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = Arrays.hashCode(this.f1934a);
        this.f1935b = hashCode;
        return hashCode;
    }

    public byte m(int i2) {
        return this.f1934a[i2];
    }

    public String n() {
        byte[] bArr = this.f1934a;
        char[] cArr = new char[(bArr.length * 2)];
        int i2 = 0;
        for (byte b6 : bArr) {
            int i5 = i2 + 1;
            char[] cArr2 = d;
            cArr[i2] = cArr2[(b6 >> 4) & 15];
            i2 += 2;
            cArr[i5] = cArr2[b6 & 15];
        }
        return new String(cArr);
    }

    public String toString() {
        byte[] bArr = this.f1934a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        String A6 = A();
        int length = A6.length();
        int i2 = 0;
        int i5 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = A6.length();
                break;
            } else if (i5 == 64) {
                break;
            } else {
                int codePointAt = A6.codePointAt(i2);
                if ((!Character.isISOControl(codePointAt) || codePointAt == 10 || codePointAt == 13) && codePointAt != 65533) {
                    i5++;
                    i2 += Character.charCount(codePointAt);
                }
            }
        }
        i2 = -1;
        if (i2 != -1) {
            String replace = A6.substring(0, i2).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (i2 >= A6.length()) {
                return C0552a.o("[text=", replace, "]");
            }
            return "[size=" + bArr.length + " text=" + replace + "…]";
        } else if (bArr.length <= 64) {
            return "[hex=" + n() + "]";
        } else {
            return "[size=" + bArr.length + " hex=" + y().n() + "…]";
        }
    }

    public boolean v(int i2, byte[] bArr, int i5, int i6) {
        if (i2 >= 0) {
            byte[] bArr2 = this.f1934a;
            if (i2 <= bArr2.length - i6 && i5 >= 0 && i5 <= bArr.length - i6) {
                Charset charset = x.f1968a;
                int i7 = 0;
                while (i7 < i6) {
                    if (bArr2[i7 + i2] == bArr[i7 + i5]) {
                        i7++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public boolean w(g gVar, int i2) {
        return gVar.v(0, this.f1934a, 0, i2);
    }

    public int x() {
        return this.f1934a.length;
    }

    public g y() {
        byte[] bArr = this.f1934a;
        if (64 > bArr.length) {
            throw new IllegalArgumentException("endIndex > length(" + bArr.length + ")");
        } else if (64 == bArr.length) {
            return this;
        } else {
            byte[] bArr2 = new byte[64];
            System.arraycopy(bArr, 0, bArr2, 0, 64);
            return new g(bArr2);
        }
    }

    public g z() {
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f1934a;
            if (i2 >= bArr.length) {
                return this;
            }
            byte b6 = bArr[i2];
            if (b6 < 65 || b6 > 90) {
                i2++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i2] = (byte) (b6 + 32);
                for (int i5 = i2 + 1; i5 < bArr2.length; i5++) {
                    byte b7 = bArr2[i5];
                    if (b7 >= 65 && b7 <= 90) {
                        bArr2[i5] = (byte) (b7 + 32);
                    }
                }
                return new g(bArr2);
            }
        }
    }
}
