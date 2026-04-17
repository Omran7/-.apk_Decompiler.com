package N5;

import java.nio.charset.Charset;
import java.util.Arrays;

public final class s extends g {

    /* renamed from: f  reason: collision with root package name */
    public final transient byte[][] f1963f;

    /* renamed from: p  reason: collision with root package name */
    public final transient int[] f1964p;

    public s(d dVar, int i2) {
        super((byte[]) null);
        x.a(dVar.f1932b, 0, (long) i2);
        q qVar = dVar.f1931a;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i2) {
            int i8 = qVar.f1957c;
            int i9 = qVar.f1956b;
            if (i8 != i9) {
                i6 += i8 - i9;
                i7++;
                qVar = qVar.f1959f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f1963f = new byte[i7][];
        this.f1964p = new int[(i7 * 2)];
        q qVar2 = dVar.f1931a;
        int i10 = 0;
        while (i5 < i2) {
            byte[][] bArr = this.f1963f;
            bArr[i10] = qVar2.f1955a;
            int i11 = qVar2.f1957c;
            int i12 = qVar2.f1956b;
            int i13 = (i11 - i12) + i5;
            if (i13 > i2) {
                i5 = i2;
            } else {
                i5 = i13;
            }
            int[] iArr = this.f1964p;
            iArr[i10] = i5;
            iArr[bArr.length + i10] = i12;
            qVar2.d = true;
            i10++;
            qVar2 = qVar2.f1959f;
        }
    }

    public final String A() {
        return D().A();
    }

    public final void B(d dVar) {
        byte[][] bArr = this.f1963f;
        int length = bArr.length;
        int i2 = 0;
        int i5 = 0;
        while (i2 < length) {
            int[] iArr = this.f1964p;
            int i6 = iArr[length + i2];
            int i7 = iArr[i2];
            q qVar = new q(bArr[i2], i6, (i6 + i7) - i5, true, false);
            q qVar2 = dVar.f1931a;
            if (qVar2 == null) {
                qVar.g = qVar;
                qVar.f1959f = qVar;
                dVar.f1931a = qVar;
            } else {
                qVar2.g.b(qVar);
            }
            i2++;
            i5 = i7;
        }
        dVar.f1932b += (long) i5;
    }

    public final int C(int i2) {
        int binarySearch = Arrays.binarySearch(this.f1964p, 0, this.f1963f.length, i2 + 1);
        if (binarySearch >= 0) {
            return binarySearch;
        }
        return ~binarySearch;
    }

    public final g D() {
        byte[][] bArr = this.f1963f;
        int[] iArr = this.f1964p;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i2 = 0;
        int i5 = 0;
        while (i2 < length) {
            int i6 = iArr[length + i2];
            int i7 = iArr[i2];
            System.arraycopy(bArr[i2], i6, bArr2, i5, i7 - i5);
            i2++;
            i5 = i7;
        }
        return new g(bArr2);
    }

    public final String a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (gVar.x() != x() || !w(gVar, x())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f1935b;
        if (i2 != 0) {
            return i2;
        }
        byte[][] bArr = this.f1963f;
        int length = bArr.length;
        int i5 = 0;
        int i6 = 1;
        int i7 = 0;
        while (i5 < length) {
            byte[] bArr2 = bArr[i5];
            int[] iArr = this.f1964p;
            int i8 = iArr[length + i5];
            int i9 = iArr[i5];
            int i10 = (i9 - i7) + i8;
            while (i8 < i10) {
                i6 = (i6 * 31) + bArr2[i8];
                i8++;
            }
            i5++;
            i7 = i9;
        }
        this.f1935b = i6;
        return i6;
    }

    public final byte m(int i2) {
        int i5;
        byte[][] bArr = this.f1963f;
        int[] iArr = this.f1964p;
        x.a((long) iArr[bArr.length - 1], (long) i2, 1);
        int C6 = C(i2);
        if (C6 == 0) {
            i5 = 0;
        } else {
            i5 = iArr[C6 - 1];
        }
        return bArr[C6][(i2 - i5) + iArr[bArr.length + C6]];
    }

    public final String n() {
        return D().n();
    }

    public final String toString() {
        return D().toString();
    }

    public final boolean v(int i2, byte[] bArr, int i5, int i6) {
        int i7;
        if (i2 < 0 || i2 > x() - i6 || i5 < 0 || i5 > bArr.length - i6) {
            return false;
        }
        int C6 = C(i2);
        while (i6 > 0) {
            int[] iArr = this.f1964p;
            if (C6 == 0) {
                i7 = 0;
            } else {
                i7 = iArr[C6 - 1];
            }
            int min = Math.min(i6, ((iArr[C6] - i7) + i7) - i2);
            byte[][] bArr2 = this.f1963f;
            int i8 = (i2 - i7) + iArr[bArr2.length + C6];
            byte[] bArr3 = bArr2[C6];
            Charset charset = x.f1968a;
            for (int i9 = 0; i9 < min; i9++) {
                if (bArr3[i9 + i8] != bArr[i9 + i5]) {
                    return false;
                }
            }
            i2 += min;
            i5 += min;
            i6 -= min;
            C6++;
        }
        return true;
    }

    public final boolean w(g gVar, int i2) {
        int i5;
        if (x() - i2 < 0) {
            return false;
        }
        int C6 = C(0);
        int i6 = 0;
        int i7 = 0;
        while (i2 > 0) {
            int[] iArr = this.f1964p;
            if (C6 == 0) {
                i5 = 0;
            } else {
                i5 = iArr[C6 - 1];
            }
            int min = Math.min(i2, ((iArr[C6] - i5) + i5) - i6);
            byte[][] bArr = this.f1963f;
            if (!gVar.v(i7, bArr[C6], (i6 - i5) + iArr[bArr.length + C6], min)) {
                return false;
            }
            i6 += min;
            i7 += min;
            i2 -= min;
            C6++;
        }
        return true;
    }

    public final int x() {
        return this.f1964p[this.f1963f.length - 1];
    }

    public final g y() {
        return D().y();
    }

    public final g z() {
        return D().z();
    }
}
