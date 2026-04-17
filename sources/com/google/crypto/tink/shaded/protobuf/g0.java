package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;

public final class g0 {

    /* renamed from: f  reason: collision with root package name */
    public static final g0 f6805f = new g0(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f6806a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f6807b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f6808c;
    public int d = -1;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6809e;

    public g0(int i2, int[] iArr, Object[] objArr, boolean z3) {
        this.f6806a = i2;
        this.f6807b = iArr;
        this.f6808c = objArr;
        this.f6809e = z3;
    }

    public static g0 c() {
        return new g0(0, new int[8], new Object[8], true);
    }

    public final void a(int i2) {
        int[] iArr = this.f6807b;
        if (i2 > iArr.length) {
            int i5 = this.f6806a;
            int i6 = (i5 / 2) + i5;
            if (i6 >= i2) {
                i2 = i6;
            }
            if (i2 < 8) {
                i2 = 8;
            }
            this.f6807b = Arrays.copyOf(iArr, i2);
            this.f6808c = Arrays.copyOf(this.f6808c, i2);
        }
    }

    public final int b() {
        int n12;
        int i2 = this.d;
        if (i2 != -1) {
            return i2;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f6806a; i6++) {
            int i7 = this.f6807b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 == 0) {
                n12 = C0408m.n1(i8, ((Long) this.f6808c[i6]).longValue());
            } else if (i9 == 1) {
                ((Long) this.f6808c[i6]).getClass();
                n12 = C0408m.Y0(i8);
            } else if (i9 == 2) {
                n12 = C0408m.T0(i8, (C0404i) this.f6808c[i6]);
            } else if (i9 == 3) {
                i5 = ((g0) this.f6808c[i6]).b() + (C0408m.k1(i8) * 2) + i5;
            } else if (i9 == 5) {
                ((Integer) this.f6808c[i6]).getClass();
                n12 = C0408m.X0(i8);
            } else {
                throw new IllegalStateException(D.c());
            }
            i5 = n12 + i5;
        }
        this.d = i5;
        return i5;
    }

    public final void d(int i2, Object obj) {
        if (this.f6809e) {
            a(this.f6806a + 1);
            int[] iArr = this.f6807b;
            int i5 = this.f6806a;
            iArr[i5] = i2;
            this.f6808c[i5] = obj;
            this.f6806a = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void e(M m6) {
        if (this.f6806a != 0) {
            m6.getClass();
            for (int i2 = 0; i2 < this.f6806a; i2++) {
                int i5 = this.f6807b[i2];
                Object obj = this.f6808c[i2];
                int i6 = i5 >>> 3;
                int i7 = i5 & 7;
                if (i7 == 0) {
                    m6.j(i6, ((Long) obj).longValue());
                } else if (i7 == 1) {
                    m6.f(i6, ((Long) obj).longValue());
                } else if (i7 == 2) {
                    m6.b(i6, (C0404i) obj);
                } else if (i7 == 3) {
                    C0408m mVar = (C0408m) m6.f6761a;
                    mVar.w1(i6, 3);
                    ((g0) obj).e(m6);
                    mVar.w1(i6, 4);
                } else if (i7 == 5) {
                    m6.e(i6, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(D.c());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        int i2 = this.f6806a;
        if (i2 == g0Var.f6806a) {
            int[] iArr = this.f6807b;
            int[] iArr2 = g0Var.f6807b;
            int i5 = 0;
            while (true) {
                if (i5 >= i2) {
                    Object[] objArr = this.f6808c;
                    Object[] objArr2 = g0Var.f6808c;
                    int i6 = this.f6806a;
                    int i7 = 0;
                    while (i7 < i6) {
                        if (objArr[i7].equals(objArr2[i7])) {
                            i7++;
                        }
                    }
                    return true;
                } else if (iArr[i5] != iArr2[i5]) {
                    break;
                } else {
                    i5++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f6806a;
        int i5 = (527 + i2) * 31;
        int[] iArr = this.f6807b;
        int i6 = 17;
        int i7 = 17;
        for (int i8 = 0; i8 < i2; i8++) {
            i7 = (i7 * 31) + iArr[i8];
        }
        int i9 = (i5 + i7) * 31;
        Object[] objArr = this.f6808c;
        int i10 = this.f6806a;
        for (int i11 = 0; i11 < i10; i11++) {
            i6 = (i6 * 31) + objArr[i11].hashCode();
        }
        return i9 + i6;
    }
}
