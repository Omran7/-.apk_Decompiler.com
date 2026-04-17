package com.google.crypto.tink.shaded.protobuf;

import I0.x;
import I1.b;
import java.util.logging.Logger;

/* renamed from: com.google.crypto.tink.shaded.protobuf.m  reason: case insensitive filesystem */
public final class C0408m extends b {

    /* renamed from: t  reason: collision with root package name */
    public static final Logger f6832t = Logger.getLogger(C0408m.class.getName());

    /* renamed from: u  reason: collision with root package name */
    public static final boolean f6833u = p0.f6846e;

    /* renamed from: p  reason: collision with root package name */
    public M f6834p;

    /* renamed from: q  reason: collision with root package name */
    public final byte[] f6835q;

    /* renamed from: r  reason: collision with root package name */
    public final int f6836r;

    /* renamed from: s  reason: collision with root package name */
    public int f6837s;

    public C0408m(byte[] bArr, int i2) {
        if (((bArr.length - i2) | i2) >= 0) {
            this.f6835q = bArr;
            this.f6837s = 0;
            this.f6836r = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)}));
    }

    public static int S0(int i2) {
        return k1(i2) + 1;
    }

    public static int T0(int i2, C0404i iVar) {
        return U0(iVar) + k1(i2);
    }

    public static int U0(C0404i iVar) {
        int size = iVar.size();
        return m1(size) + size;
    }

    public static int V0(int i2) {
        return k1(i2) + 8;
    }

    public static int W0(int i2, int i5) {
        return c1(i5) + k1(i2);
    }

    public static int X0(int i2) {
        return k1(i2) + 4;
    }

    public static int Y0(int i2) {
        return k1(i2) + 8;
    }

    public static int Z0(int i2) {
        return k1(i2) + 4;
    }

    public static int a1(int i2, C0396a aVar, d0 d0Var) {
        return aVar.b(d0Var) + (k1(i2) * 2);
    }

    public static int b1(int i2, int i5) {
        return c1(i5) + k1(i2);
    }

    public static int c1(int i2) {
        if (i2 >= 0) {
            return m1(i2);
        }
        return 10;
    }

    public static int d1(int i2, long j6) {
        return o1(j6) + k1(i2);
    }

    public static int e1(int i2) {
        return k1(i2) + 4;
    }

    public static int f1(int i2) {
        return k1(i2) + 8;
    }

    public static int g1(int i2, int i5) {
        return m1((i5 >> 31) ^ (i5 << 1)) + k1(i2);
    }

    public static int h1(int i2, long j6) {
        return o1((j6 >> 63) ^ (j6 << 1)) + k1(i2);
    }

    public static int i1(int i2, String str) {
        return j1(str) + k1(i2);
    }

    public static int j1(String str) {
        int i2;
        try {
            i2 = s0.b(str);
        } catch (r0 unused) {
            i2 = str.getBytes(B.f6742a).length;
        }
        return m1(i2) + i2;
    }

    public static int k1(int i2) {
        return m1(i2 << 3);
    }

    public static int l1(int i2, int i5) {
        return m1(i5) + k1(i2);
    }

    public static int m1(int i2) {
        if ((i2 & -128) == 0) {
            return 1;
        }
        if ((i2 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i2) == 0) {
            return 3;
        }
        if ((i2 & -268435456) == 0) {
            return 4;
        }
        return 5;
    }

    public static int n1(int i2, long j6) {
        return o1(j6) + k1(i2);
    }

    public static int o1(long j6) {
        int i2;
        if ((-128 & j6) == 0) {
            return 1;
        }
        if (j6 < 0) {
            return 10;
        }
        if ((-34359738368L & j6) != 0) {
            j6 >>>= 28;
            i2 = 6;
        } else {
            i2 = 2;
        }
        if ((-2097152 & j6) != 0) {
            i2 += 2;
            j6 >>>= 14;
        }
        if ((j6 & -16384) != 0) {
            return i2 + 1;
        }
        return i2;
    }

    public final void p1(byte b6) {
        try {
            byte[] bArr = this.f6835q;
            int i2 = this.f6837s;
            this.f6837s = i2 + 1;
            bArr[i2] = b6;
        } catch (IndexOutOfBoundsException e6) {
            throw new x(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f6837s), Integer.valueOf(this.f6836r), 1}), e6);
        }
    }

    public final void q1(byte[] bArr, int i2, int i5) {
        try {
            System.arraycopy(bArr, i2, this.f6835q, this.f6837s, i5);
            this.f6837s += i5;
        } catch (IndexOutOfBoundsException e6) {
            throw new x(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f6837s), Integer.valueOf(this.f6836r), Integer.valueOf(i5)}), e6);
        }
    }

    public final void r1(int i2, int i5) {
        w1(i2, 5);
        s1(i5);
    }

    public final void s1(int i2) {
        try {
            byte[] bArr = this.f6835q;
            int i5 = this.f6837s;
            int i6 = i5 + 1;
            this.f6837s = i6;
            bArr[i5] = (byte) (i2 & 255);
            int i7 = i5 + 2;
            this.f6837s = i7;
            bArr[i6] = (byte) ((i2 >> 8) & 255);
            int i8 = i5 + 3;
            this.f6837s = i8;
            bArr[i7] = (byte) ((i2 >> 16) & 255);
            this.f6837s = i5 + 4;
            bArr[i8] = (byte) ((i2 >> 24) & 255);
        } catch (IndexOutOfBoundsException e6) {
            throw new x(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f6837s), Integer.valueOf(this.f6836r), 1}), e6);
        }
    }

    public final void t1(int i2, long j6) {
        w1(i2, 1);
        u1(j6);
    }

    public final void u1(long j6) {
        try {
            byte[] bArr = this.f6835q;
            int i2 = this.f6837s;
            int i5 = i2 + 1;
            this.f6837s = i5;
            bArr[i2] = (byte) (((int) j6) & 255);
            int i6 = i2 + 2;
            this.f6837s = i6;
            bArr[i5] = (byte) (((int) (j6 >> 8)) & 255);
            int i7 = i2 + 3;
            this.f6837s = i7;
            bArr[i6] = (byte) (((int) (j6 >> 16)) & 255);
            int i8 = i2 + 4;
            this.f6837s = i8;
            bArr[i7] = (byte) (((int) (j6 >> 24)) & 255);
            int i9 = i2 + 5;
            this.f6837s = i9;
            bArr[i8] = (byte) (((int) (j6 >> 32)) & 255);
            int i10 = i2 + 6;
            this.f6837s = i10;
            bArr[i9] = (byte) (((int) (j6 >> 40)) & 255);
            int i11 = i2 + 7;
            this.f6837s = i11;
            bArr[i10] = (byte) (((int) (j6 >> 48)) & 255);
            this.f6837s = i2 + 8;
            bArr[i11] = (byte) (((int) (j6 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e6) {
            throw new x(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f6837s), Integer.valueOf(this.f6836r), 1}), e6);
        }
    }

    public final void v1(int i2) {
        if (i2 >= 0) {
            x1(i2);
        } else {
            z1((long) i2);
        }
    }

    public final void w1(int i2, int i5) {
        x1((i2 << 3) | i5);
    }

    public final void x1(int i2) {
        while (true) {
            int i5 = i2 & -128;
            byte[] bArr = this.f6835q;
            if (i5 == 0) {
                try {
                    int i6 = this.f6837s;
                    this.f6837s = i6 + 1;
                    bArr[i6] = (byte) i2;
                    return;
                } catch (IndexOutOfBoundsException e6) {
                    throw new x(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f6837s), Integer.valueOf(this.f6836r), 1}), e6);
                }
            } else {
                int i7 = this.f6837s;
                this.f6837s = i7 + 1;
                bArr[i7] = (byte) ((i2 & 127) | 128);
                i2 >>>= 7;
            }
        }
    }

    public final void y1(int i2, long j6) {
        w1(i2, 0);
        z1(j6);
    }

    public final void z1(long j6) {
        byte[] bArr = this.f6835q;
        boolean z3 = f6833u;
        int i2 = this.f6836r;
        if (!z3 || i2 - this.f6837s < 10) {
            while ((j6 & -128) != 0) {
                int i5 = this.f6837s;
                this.f6837s = i5 + 1;
                bArr[i5] = (byte) ((((int) j6) & 127) | 128);
                j6 >>>= 7;
            }
            try {
                int i6 = this.f6837s;
                this.f6837s = i6 + 1;
                bArr[i6] = (byte) ((int) j6);
            } catch (IndexOutOfBoundsException e6) {
                throw new x(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f6837s), Integer.valueOf(i2), 1}), e6);
            }
        } else {
            while ((j6 & -128) != 0) {
                int i7 = this.f6837s;
                this.f6837s = i7 + 1;
                p0.o(bArr, (long) i7, (byte) ((((int) j6) & 127) | 128));
                j6 >>>= 7;
            }
            int i8 = this.f6837s;
            this.f6837s = i8 + 1;
            p0.o(bArr, (long) i8, (byte) ((int) j6));
        }
    }
}
