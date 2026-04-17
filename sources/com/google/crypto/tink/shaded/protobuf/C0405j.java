package com.google.crypto.tink.shaded.protobuf;

import E2.d;
import com.google.android.gms.common.api.f;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.crypto.tink.shaded.protobuf.j  reason: case insensitive filesystem */
public final class C0405j extends d {

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f6814c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f6815e;

    /* renamed from: f  reason: collision with root package name */
    public int f6816f;

    /* renamed from: p  reason: collision with root package name */
    public final int f6817p;

    /* renamed from: q  reason: collision with root package name */
    public int f6818q;

    /* renamed from: r  reason: collision with root package name */
    public int f6819r = f.API_PRIORITY_OTHER;

    public C0405j(byte[] bArr, int i2, int i5, boolean z3) {
        this.f6814c = bArr;
        this.d = i5 + i2;
        this.f6816f = i2;
        this.f6817p = i2;
    }

    public final String A() {
        int H6 = H();
        if (H6 > 0) {
            int i2 = this.d;
            int i5 = this.f6816f;
            if (H6 <= i2 - i5) {
                String p6 = s0.f6855a.p(this.f6814c, i5, H6);
                this.f6816f += H6;
                return p6;
            }
        }
        if (H6 == 0) {
            return "";
        }
        if (H6 <= 0) {
            throw D.e();
        }
        throw D.g();
    }

    public final int B() {
        if (g()) {
            this.f6818q = 0;
            return 0;
        }
        int H6 = H();
        this.f6818q = H6;
        if ((H6 >>> 3) != 0) {
            return H6;
        }
        throw D.a();
    }

    public final int C() {
        return H();
    }

    public final long D() {
        return I();
    }

    public final int F() {
        int i2 = this.f6816f;
        if (this.d - i2 >= 4) {
            this.f6816f = i2 + 4;
            byte[] bArr = this.f6814c;
            return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        }
        throw D.g();
    }

    public final long G() {
        int i2 = this.f6816f;
        if (this.d - i2 >= 8) {
            this.f6816f = i2 + 8;
            byte[] bArr = this.f6814c;
            return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
        }
        throw D.g();
    }

    public final int H() {
        byte b6;
        byte b7;
        int i2 = this.f6816f;
        int i5 = this.d;
        if (i5 != i2) {
            int i6 = i2 + 1;
            byte[] bArr = this.f6814c;
            byte b8 = bArr[i2];
            if (b8 >= 0) {
                this.f6816f = i6;
                return b8;
            } else if (i5 - i6 >= 9) {
                int i7 = i2 + 2;
                byte b9 = (bArr[i6] << 7) ^ b8;
                if (b9 < 0) {
                    b6 = b9 ^ Byte.MIN_VALUE;
                } else {
                    int i8 = i2 + 3;
                    byte b10 = (bArr[i7] << 14) ^ b9;
                    if (b10 >= 0) {
                        b7 = b10 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        byte b11 = b10 ^ (bArr[i8] << 21);
                        if (b11 < 0) {
                            b6 = -2080896 ^ b11;
                        } else {
                            i8 = i2 + 5;
                            byte b12 = bArr[i9];
                            byte b13 = (b11 ^ (b12 << 28)) ^ 266354560;
                            if (b12 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i8] < 0) {
                                    i8 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i8] < 0) {
                                            i8 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i10 = i2 + 10;
                                                if (bArr[i8] >= 0) {
                                                    byte b14 = b13;
                                                    i7 = i10;
                                                    b6 = b14;
                                                }
                                            }
                                        }
                                    }
                                }
                                b6 = b13;
                            }
                            b7 = b13;
                        }
                        i7 = i9;
                    }
                    i7 = i8;
                }
                this.f6816f = i7;
                return b6;
            }
        }
        return (int) J();
    }

    public final long I() {
        long j6;
        long j7;
        long j8;
        long j9;
        int i2 = this.f6816f;
        int i5 = this.d;
        if (i5 != i2) {
            int i6 = i2 + 1;
            byte[] bArr = this.f6814c;
            byte b6 = bArr[i2];
            if (b6 >= 0) {
                this.f6816f = i6;
                return (long) b6;
            } else if (i5 - i6 >= 9) {
                int i7 = i2 + 2;
                byte b7 = (bArr[i6] << 7) ^ b6;
                if (b7 < 0) {
                    j6 = (long) (b7 ^ Byte.MIN_VALUE);
                } else {
                    int i8 = i2 + 3;
                    byte b8 = (bArr[i7] << 14) ^ b7;
                    if (b8 >= 0) {
                        j6 = (long) (b8 ^ 16256);
                        i7 = i8;
                    } else {
                        int i9 = i2 + 4;
                        byte b9 = b8 ^ (bArr[i8] << 21);
                        if (b9 < 0) {
                            j9 = (long) (-2080896 ^ b9);
                        } else {
                            long j10 = (long) b9;
                            int i10 = i2 + 5;
                            long j11 = j10 ^ (((long) bArr[i9]) << 28);
                            if (j11 >= 0) {
                                j8 = 266354560;
                            } else {
                                i9 = i2 + 6;
                                long j12 = j11 ^ (((long) bArr[i10]) << 35);
                                if (j12 < 0) {
                                    j7 = -34093383808L;
                                } else {
                                    i10 = i2 + 7;
                                    j11 = j12 ^ (((long) bArr[i9]) << 42);
                                    if (j11 >= 0) {
                                        j8 = 4363953127296L;
                                    } else {
                                        i9 = i2 + 8;
                                        j12 = j11 ^ (((long) bArr[i10]) << 49);
                                        if (j12 < 0) {
                                            j7 = -558586000294016L;
                                        } else {
                                            i7 = i2 + 9;
                                            long j13 = (j12 ^ (((long) bArr[i9]) << 56)) ^ 71499008037633920L;
                                            if (j13 < 0) {
                                                int i11 = i2 + 10;
                                                if (((long) bArr[i7]) >= 0) {
                                                    i7 = i11;
                                                }
                                            }
                                            j6 = j13;
                                        }
                                    }
                                }
                                j9 = j7 ^ j12;
                            }
                            j6 = j8 ^ j11;
                        }
                        i7 = i9;
                        j6 = j9;
                    }
                }
                this.f6816f = i7;
                return j6;
            }
        }
        return J();
    }

    public final long J() {
        long j6 = 0;
        int i2 = 0;
        while (i2 < 64) {
            int i5 = this.f6816f;
            if (i5 != this.d) {
                this.f6816f = i5 + 1;
                byte b6 = this.f6814c[i5];
                j6 |= ((long) (b6 & Byte.MAX_VALUE)) << i2;
                if ((b6 & 128) == 0) {
                    return j6;
                }
                i2 += 7;
            } else {
                throw D.g();
            }
        }
        throw D.d();
    }

    public final void K() {
        int i2 = this.d + this.f6815e;
        this.d = i2;
        int i5 = i2 - this.f6817p;
        int i6 = this.f6819r;
        if (i5 > i6) {
            int i7 = i5 - i6;
            this.f6815e = i7;
            this.d = i2 - i7;
            return;
        }
        this.f6815e = 0;
    }

    public final void b(int i2) {
        if (this.f6818q != i2) {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final int f() {
        return this.f6816f - this.f6817p;
    }

    public final boolean g() {
        if (this.f6816f == this.d) {
            return true;
        }
        return false;
    }

    public final void j(int i2) {
        this.f6819r = i2;
        K();
    }

    public final int l(int i2) {
        if (i2 >= 0) {
            int f6 = f() + i2;
            if (f6 >= 0) {
                int i5 = this.f6819r;
                if (f6 <= i5) {
                    this.f6819r = f6;
                    K();
                    return i5;
                }
                throw D.g();
            }
            throw D.f();
        }
        throw D.e();
    }

    public final boolean m() {
        if (I() != 0) {
            return true;
        }
        return false;
    }

    public final C0403h n() {
        byte[] bArr;
        int H6 = H();
        byte[] bArr2 = this.f6814c;
        if (H6 > 0) {
            int i2 = this.d;
            int i5 = this.f6816f;
            if (H6 <= i2 - i5) {
                C0403h v6 = C0404i.v(bArr2, i5, H6);
                this.f6816f += H6;
                return v6;
            }
        }
        if (H6 == 0) {
            return C0404i.f6810b;
        }
        if (H6 > 0) {
            int i6 = this.d;
            int i7 = this.f6816f;
            if (H6 <= i6 - i7) {
                int i8 = H6 + i7;
                this.f6816f = i8;
                bArr = Arrays.copyOfRange(bArr2, i7, i8);
                C0403h hVar = C0404i.f6810b;
                return new C0403h(bArr);
            }
        }
        if (H6 > 0) {
            throw D.g();
        } else if (H6 == 0) {
            bArr = B.f6743b;
            C0403h hVar2 = C0404i.f6810b;
            return new C0403h(bArr);
        } else {
            throw D.e();
        }
    }

    public final double o() {
        return Double.longBitsToDouble(G());
    }

    public final int p() {
        return H();
    }

    public final int q() {
        return F();
    }

    public final long r() {
        return G();
    }

    public final float s() {
        return Float.intBitsToFloat(F());
    }

    public final int t() {
        return H();
    }

    public final long u() {
        return I();
    }

    public final int v() {
        return F();
    }

    public final long w() {
        return G();
    }

    public final int x() {
        return d.d(H());
    }

    public final long y() {
        return d.e(I());
    }

    public final String z() {
        int H6 = H();
        if (H6 > 0) {
            int i2 = this.d;
            int i5 = this.f6816f;
            if (H6 <= i2 - i5) {
                String str = new String(this.f6814c, i5, H6, B.f6742a);
                this.f6816f += H6;
                return str;
            }
        }
        if (H6 == 0) {
            return "";
        }
        if (H6 < 0) {
            throw D.e();
        }
        throw D.g();
    }
}
