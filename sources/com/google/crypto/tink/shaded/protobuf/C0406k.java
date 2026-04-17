package com.google.crypto.tink.shaded.protobuf;

import E2.d;
import com.google.android.gms.common.api.f;
import h0.C0552a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.crypto.tink.shaded.protobuf.k  reason: case insensitive filesystem */
public final class C0406k extends d {

    /* renamed from: c  reason: collision with root package name */
    public final ByteArrayInputStream f6821c;
    public final byte[] d;

    /* renamed from: e  reason: collision with root package name */
    public int f6822e;

    /* renamed from: f  reason: collision with root package name */
    public int f6823f;

    /* renamed from: p  reason: collision with root package name */
    public int f6824p;

    /* renamed from: q  reason: collision with root package name */
    public int f6825q;

    /* renamed from: r  reason: collision with root package name */
    public int f6826r;

    /* renamed from: s  reason: collision with root package name */
    public int f6827s = f.API_PRIORITY_OTHER;

    public C0406k(ByteArrayInputStream byteArrayInputStream) {
        Charset charset = B.f6742a;
        this.f6821c = byteArrayInputStream;
        this.d = new byte[4096];
        this.f6822e = 0;
        this.f6824p = 0;
        this.f6826r = 0;
    }

    public final String A() {
        int K6 = K();
        int i2 = this.f6824p;
        int i5 = this.f6822e;
        int i6 = i5 - i2;
        byte[] bArr = this.d;
        if (K6 <= i6 && K6 > 0) {
            this.f6824p = i2 + K6;
        } else if (K6 == 0) {
            return "";
        } else {
            i2 = 0;
            if (K6 <= i5) {
                O(K6);
                this.f6824p = K6;
            } else {
                bArr = F(K6);
            }
        }
        return s0.f6855a.p(bArr, i2, K6);
    }

    public final int B() {
        if (g()) {
            this.f6825q = 0;
            return 0;
        }
        int K6 = K();
        this.f6825q = K6;
        if ((K6 >>> 3) != 0) {
            return K6;
        }
        throw D.a();
    }

    public final int C() {
        return K();
    }

    public final long D() {
        return L();
    }

    public final byte[] F(int i2) {
        byte[] G6 = G(i2);
        if (G6 != null) {
            return G6;
        }
        int i5 = this.f6824p;
        int i6 = this.f6822e;
        int i7 = i6 - i5;
        this.f6826r += i6;
        this.f6824p = 0;
        this.f6822e = 0;
        ArrayList H6 = H(i2 - i7);
        byte[] bArr = new byte[i2];
        System.arraycopy(this.d, i5, bArr, 0, i7);
        Iterator it2 = H6.iterator();
        while (it2.hasNext()) {
            byte[] bArr2 = (byte[]) it2.next();
            System.arraycopy(bArr2, 0, bArr, i7, bArr2.length);
            i7 += bArr2.length;
        }
        return bArr;
    }

    public final byte[] G(int i2) {
        if (i2 == 0) {
            return B.f6743b;
        }
        if (i2 >= 0) {
            int i5 = this.f6826r;
            int i6 = this.f6824p;
            int i7 = i5 + i6 + i2;
            if (i7 - f.API_PRIORITY_OTHER <= 0) {
                int i8 = this.f6827s;
                if (i7 <= i8) {
                    int i9 = this.f6822e - i6;
                    int i10 = i2 - i9;
                    ByteArrayInputStream byteArrayInputStream = this.f6821c;
                    if (i10 >= 4096) {
                        try {
                            if (i10 > byteArrayInputStream.available()) {
                                return null;
                            }
                        } catch (D e6) {
                            e6.f6744a = true;
                            throw e6;
                        }
                    }
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.d, this.f6824p, bArr, 0, i9);
                    this.f6826r += this.f6822e;
                    this.f6824p = 0;
                    this.f6822e = 0;
                    while (i9 < i2) {
                        try {
                            int read = byteArrayInputStream.read(bArr, i9, i2 - i9);
                            if (read != -1) {
                                this.f6826r += read;
                                i9 += read;
                            } else {
                                throw D.g();
                            }
                        } catch (D e7) {
                            e7.f6744a = true;
                            throw e7;
                        }
                    }
                    return bArr;
                }
                P((i8 - i5) - i6);
                throw D.g();
            }
            throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw D.e();
    }

    public final ArrayList H(int i2) {
        ArrayList arrayList = new ArrayList();
        while (i2 > 0) {
            int min = Math.min(i2, 4096);
            byte[] bArr = new byte[min];
            int i5 = 0;
            while (i5 < min) {
                int read = this.f6821c.read(bArr, i5, min - i5);
                if (read != -1) {
                    this.f6826r += read;
                    i5 += read;
                } else {
                    throw D.g();
                }
            }
            i2 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int I() {
        int i2 = this.f6824p;
        if (this.f6822e - i2 < 4) {
            O(4);
            i2 = this.f6824p;
        }
        this.f6824p = i2 + 4;
        byte[] bArr = this.d;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public final long J() {
        int i2 = this.f6824p;
        if (this.f6822e - i2 < 8) {
            O(8);
            i2 = this.f6824p;
        }
        this.f6824p = i2 + 8;
        byte[] bArr = this.d;
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    public final int K() {
        byte b6;
        byte b7;
        int i2 = this.f6824p;
        int i5 = this.f6822e;
        if (i5 != i2) {
            int i6 = i2 + 1;
            byte[] bArr = this.d;
            byte b8 = bArr[i2];
            if (b8 >= 0) {
                this.f6824p = i6;
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
                this.f6824p = i7;
                return b6;
            }
        }
        return (int) M();
    }

    public final long L() {
        long j6;
        long j7;
        long j8;
        long j9;
        int i2 = this.f6824p;
        int i5 = this.f6822e;
        if (i5 != i2) {
            int i6 = i2 + 1;
            byte[] bArr = this.d;
            byte b6 = bArr[i2];
            if (b6 >= 0) {
                this.f6824p = i6;
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
                this.f6824p = i7;
                return j6;
            }
        }
        return M();
    }

    public final long M() {
        long j6 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            if (this.f6824p == this.f6822e) {
                O(1);
            }
            int i5 = this.f6824p;
            this.f6824p = i5 + 1;
            byte b6 = this.d[i5];
            j6 |= ((long) (b6 & Byte.MAX_VALUE)) << i2;
            if ((b6 & 128) == 0) {
                return j6;
            }
        }
        throw D.d();
    }

    public final void N() {
        int i2 = this.f6822e + this.f6823f;
        this.f6822e = i2;
        int i5 = this.f6826r + i2;
        int i6 = this.f6827s;
        if (i5 > i6) {
            int i7 = i5 - i6;
            this.f6823f = i7;
            this.f6822e = i2 - i7;
            return;
        }
        this.f6823f = 0;
    }

    public final void O(int i2) {
        if (Q(i2)) {
            return;
        }
        if (i2 > (f.API_PRIORITY_OTHER - this.f6826r) - this.f6824p) {
            throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw D.g();
    }

    public final void P(int i2) {
        int i5 = this.f6822e;
        int i6 = this.f6824p;
        int i7 = i5 - i6;
        if (i2 > i7 || i2 < 0) {
            ByteArrayInputStream byteArrayInputStream = this.f6821c;
            if (i2 >= 0) {
                int i8 = this.f6826r;
                int i9 = i8 + i6;
                int i10 = i9 + i2;
                int i11 = this.f6827s;
                if (i10 <= i11) {
                    this.f6826r = i9;
                    this.f6822e = 0;
                    this.f6824p = 0;
                    while (i7 < i2) {
                        long j6 = (long) (i2 - i7);
                        try {
                            long skip = byteArrayInputStream.skip(j6);
                            int i12 = (skip > 0 ? 1 : (skip == 0 ? 0 : -1));
                            if (i12 < 0 || skip > j6) {
                                throw new IllegalStateException(byteArrayInputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                            } else if (i12 == 0) {
                                break;
                            } else {
                                i7 += (int) skip;
                            }
                        } catch (D e6) {
                            e6.f6744a = true;
                            throw e6;
                        } catch (Throwable th) {
                            this.f6826r += i7;
                            N();
                            throw th;
                        }
                    }
                    this.f6826r += i7;
                    N();
                    if (i7 < i2) {
                        int i13 = this.f6822e;
                        int i14 = i13 - this.f6824p;
                        this.f6824p = i13;
                        O(1);
                        while (true) {
                            int i15 = i2 - i14;
                            int i16 = this.f6822e;
                            if (i15 > i16) {
                                i14 += i16;
                                this.f6824p = i16;
                                O(1);
                            } else {
                                this.f6824p = i15;
                                return;
                            }
                        }
                    }
                } else {
                    P((i11 - i8) - i6);
                    throw D.g();
                }
            } else {
                throw D.e();
            }
        } else {
            this.f6824p = i6 + i2;
        }
    }

    public final boolean Q(int i2) {
        int i5 = this.f6824p;
        int i6 = i5 + i2;
        int i7 = this.f6822e;
        if (i6 > i7) {
            int i8 = this.f6826r;
            if (i2 > (f.API_PRIORITY_OTHER - i8) - i5 || i8 + i5 + i2 > this.f6827s) {
                return false;
            }
            byte[] bArr = this.d;
            if (i5 > 0) {
                if (i7 > i5) {
                    System.arraycopy(bArr, i5, bArr, 0, i7 - i5);
                }
                this.f6826r += i5;
                this.f6822e -= i5;
                this.f6824p = 0;
            }
            int i9 = this.f6822e;
            int min = Math.min(bArr.length - i9, (f.API_PRIORITY_OTHER - this.f6826r) - i9);
            ByteArrayInputStream byteArrayInputStream = this.f6821c;
            try {
                int read = byteArrayInputStream.read(bArr, i9, min);
                if (read == 0 || read < -1 || read > bArr.length) {
                    throw new IllegalStateException(byteArrayInputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                } else if (read <= 0) {
                    return false;
                } else {
                    this.f6822e += read;
                    N();
                    if (this.f6822e >= i2) {
                        return true;
                    }
                    return Q(i2);
                }
            } catch (D e6) {
                e6.f6744a = true;
                throw e6;
            }
        } else {
            throw new IllegalStateException(C0552a.k(i2, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
    }

    public final void b(int i2) {
        if (this.f6825q != i2) {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final int f() {
        return this.f6826r + this.f6824p;
    }

    public final boolean g() {
        if (this.f6824p != this.f6822e || Q(1)) {
            return false;
        }
        return true;
    }

    public final void j(int i2) {
        this.f6827s = i2;
        N();
    }

    public final int l(int i2) {
        if (i2 >= 0) {
            int i5 = this.f6826r + this.f6824p + i2;
            int i6 = this.f6827s;
            if (i5 <= i6) {
                this.f6827s = i5;
                N();
                return i6;
            }
            throw D.g();
        }
        throw D.e();
    }

    public final boolean m() {
        if (L() != 0) {
            return true;
        }
        return false;
    }

    public final C0403h n() {
        int K6 = K();
        int i2 = this.f6822e;
        int i5 = this.f6824p;
        int i6 = i2 - i5;
        byte[] bArr = this.d;
        if (K6 <= i6 && K6 > 0) {
            C0403h v6 = C0404i.v(bArr, i5, K6);
            this.f6824p += K6;
            return v6;
        } else if (K6 == 0) {
            return C0404i.f6810b;
        } else {
            byte[] G6 = G(K6);
            if (G6 != null) {
                return C0404i.v(G6, 0, G6.length);
            }
            int i7 = this.f6824p;
            int i8 = this.f6822e;
            int i9 = i8 - i7;
            this.f6826r += i8;
            this.f6824p = 0;
            this.f6822e = 0;
            ArrayList H6 = H(K6 - i9);
            byte[] bArr2 = new byte[K6];
            System.arraycopy(bArr, i7, bArr2, 0, i9);
            Iterator it2 = H6.iterator();
            while (it2.hasNext()) {
                byte[] bArr3 = (byte[]) it2.next();
                System.arraycopy(bArr3, 0, bArr2, i9, bArr3.length);
                i9 += bArr3.length;
            }
            C0403h hVar = C0404i.f6810b;
            return new C0403h(bArr2);
        }
    }

    public final double o() {
        return Double.longBitsToDouble(J());
    }

    public final int p() {
        return K();
    }

    public final int q() {
        return I();
    }

    public final long r() {
        return J();
    }

    public final float s() {
        return Float.intBitsToFloat(I());
    }

    public final int t() {
        return K();
    }

    public final long u() {
        return L();
    }

    public final int v() {
        return I();
    }

    public final long w() {
        return J();
    }

    public final int x() {
        return d.d(K());
    }

    public final long y() {
        return d.e(L());
    }

    public final String z() {
        int K6 = K();
        byte[] bArr = this.d;
        if (K6 > 0) {
            int i2 = this.f6822e;
            int i5 = this.f6824p;
            if (K6 <= i2 - i5) {
                String str = new String(bArr, i5, K6, B.f6742a);
                this.f6824p += K6;
                return str;
            }
        }
        if (K6 == 0) {
            return "";
        }
        if (K6 > this.f6822e) {
            return new String(F(K6), B.f6742a);
        }
        O(K6);
        String str2 = new String(bArr, this.f6824p, K6, B.f6742a);
        this.f6824p += K6;
        return str2;
    }
}
