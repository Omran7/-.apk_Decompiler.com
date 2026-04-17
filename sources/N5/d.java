package N5;

import com.google.android.gms.internal.measurement.a;
import h0.C0552a;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

public final class d implements f, e, Cloneable, ByteChannel {

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f1930c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: a  reason: collision with root package name */
    public q f1931a;

    /* renamed from: b  reason: collision with root package name */
    public long f1932b;

    public final void A(int i2) {
        q w6 = w(1);
        int i5 = w6.f1957c;
        w6.f1957c = i5 + 1;
        w6.f1955a[i5] = (byte) i2;
        this.f1932b++;
    }

    public final void B(long j6) {
        if (j6 == 0) {
            A(48);
            return;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j6)) / 4) + 1;
        q w6 = w(numberOfTrailingZeros);
        int i2 = w6.f1957c;
        for (int i5 = (i2 + numberOfTrailingZeros) - 1; i5 >= i2; i5--) {
            w6.f1955a[i5] = f1930c[(int) (15 & j6)];
            j6 >>>= 4;
        }
        w6.f1957c += numberOfTrailingZeros;
        this.f1932b += (long) numberOfTrailingZeros;
    }

    public final void C(int i2, int i5, String str) {
        char c3;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i2 < 0) {
            throw new IllegalArgumentException(a.f(i2, "beginIndex < 0: "));
        } else if (i5 < i2) {
            throw new IllegalArgumentException(C0552a.l("endIndex < beginIndex: ", i5, i2, " < "));
        } else if (i5 <= str.length()) {
            while (i2 < i5) {
                char charAt = str.charAt(i2);
                if (charAt < 128) {
                    q w6 = w(1);
                    int i6 = w6.f1957c - i2;
                    int min = Math.min(i5, 8192 - i6);
                    int i7 = i2 + 1;
                    byte[] bArr = w6.f1955a;
                    bArr[i2 + i6] = (byte) charAt;
                    while (i7 < min) {
                        char charAt2 = str.charAt(i7);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i7 + i6] = (byte) charAt2;
                        i7++;
                    }
                    int i8 = w6.f1957c;
                    int i9 = (i6 + i7) - i8;
                    w6.f1957c = i8 + i9;
                    this.f1932b += (long) i9;
                    i2 = i7;
                } else {
                    if (charAt < 2048) {
                        A((charAt >> 6) | 192);
                        A((charAt & '?') | 128);
                    } else if (charAt < 55296 || charAt > 57343) {
                        A((charAt >> 12) | 224);
                        A(((charAt >> 6) & 63) | 128);
                        A((charAt & '?') | 128);
                    } else {
                        int i10 = i2 + 1;
                        if (i10 < i5) {
                            c3 = str.charAt(i10);
                        } else {
                            c3 = 0;
                        }
                        if (charAt > 56319 || c3 < 56320 || c3 > 57343) {
                            A(63);
                            i2 = i10;
                        } else {
                            int i11 = (((charAt & 10239) << 10) | (9215 & c3)) + 0;
                            A((i11 >> 18) | 240);
                            A(((i11 >> 12) & 63) | 128);
                            A(((i11 >> 6) & 63) | 128);
                            A((i11 & 63) | 128);
                            i2 += 2;
                        }
                    }
                    i2++;
                }
            }
        } else {
            StringBuilder s6 = C0552a.s(i5, "endIndex > string.length: ", " > ");
            s6.append(str.length());
            throw new IllegalArgumentException(s6.toString());
        }
    }

    public final void D(int i2) {
        if (i2 < 128) {
            A(i2);
        } else if (i2 < 2048) {
            A((i2 >> 6) | 192);
            A((i2 & 63) | 128);
        } else if (i2 < 65536) {
            if (i2 < 55296 || i2 > 57343) {
                A((i2 >> 12) | 224);
                A(((i2 >> 6) & 63) | 128);
                A((i2 & 63) | 128);
                return;
            }
            A(63);
        } else if (i2 <= 1114111) {
            A((i2 >> 18) | 240);
            A(((i2 >> 12) & 63) | 128);
            A(((i2 >> 6) & 63) | 128);
            A((i2 & 63) | 128);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i2));
        }
    }

    public final void a(long j6) {
        while (j6 > 0) {
            q qVar = this.f1931a;
            if (qVar != null) {
                int min = (int) Math.min(j6, (long) (qVar.f1957c - qVar.f1956b));
                long j7 = (long) min;
                this.f1932b -= j7;
                j6 -= j7;
                q qVar2 = this.f1931a;
                int i2 = qVar2.f1956b + min;
                qVar2.f1956b = i2;
                if (i2 == qVar2.f1957c) {
                    this.f1931a = qVar2.a();
                    r.a(qVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final w b() {
        return w.d;
    }

    public final void c() {
        try {
            a(this.f1932b);
        } catch (EOFException e6) {
            throw new AssertionError(e6);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [N5.d, java.lang.Object] */
    public final Object clone() {
        ? obj = new Object();
        if (this.f1932b != 0) {
            q c3 = this.f1931a.c();
            obj.f1931a = c3;
            c3.g = c3;
            c3.f1959f = c3;
            q qVar = this.f1931a;
            while (true) {
                qVar = qVar.f1959f;
                if (qVar == this.f1931a) {
                    break;
                }
                obj.f1931a.g.b(qVar.c());
            }
            obj.f1932b = this.f1932b;
        }
        return obj;
    }

    public final boolean d() {
        if (this.f1932b == 0) {
            return true;
        }
        return false;
    }

    public final long e(long j6, d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j6 >= 0) {
            long j7 = this.f1932b;
            if (j7 == 0) {
                return -1;
            }
            if (j6 > j7) {
                j6 = j7;
            }
            dVar.f(j6, this);
            return j6;
        } else {
            throw new IllegalArgumentException(C0552a.m("byteCount < 0: ", j6));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        long j6 = this.f1932b;
        if (j6 != dVar.f1932b) {
            return false;
        }
        long j7 = 0;
        if (j6 == 0) {
            return true;
        }
        q qVar = this.f1931a;
        q qVar2 = dVar.f1931a;
        int i2 = qVar.f1956b;
        int i5 = qVar2.f1956b;
        while (j7 < this.f1932b) {
            long min = (long) Math.min(qVar.f1957c - i2, qVar2.f1957c - i5);
            int i6 = 0;
            while (((long) i6) < min) {
                int i7 = i2 + 1;
                int i8 = i5 + 1;
                if (qVar.f1955a[i2] != qVar2.f1955a[i5]) {
                    return false;
                }
                i6++;
                i2 = i7;
                i5 = i8;
            }
            if (i2 == qVar.f1957c) {
                qVar = qVar.f1959f;
                i2 = qVar.f1956b;
            }
            if (i5 == qVar2.f1957c) {
                qVar2 = qVar2.f1959f;
                i5 = qVar2.f1956b;
            }
            j7 += min;
        }
        return true;
    }

    public final void f(long j6, d dVar) {
        q qVar;
        q qVar2;
        int i2;
        if (dVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (dVar != this) {
            x.a(dVar.f1932b, 0, j6);
            while (j6 > 0) {
                q qVar3 = dVar.f1931a;
                int i5 = qVar3.f1957c - qVar3.f1956b;
                int i6 = 0;
                if (j6 < ((long) i5)) {
                    q qVar4 = this.f1931a;
                    if (qVar4 != null) {
                        qVar = qVar4.g;
                    } else {
                        qVar = null;
                    }
                    if (qVar != null && qVar.f1958e) {
                        long j7 = ((long) qVar.f1957c) + j6;
                        if (qVar.d) {
                            i2 = 0;
                        } else {
                            i2 = qVar.f1956b;
                        }
                        if (j7 - ((long) i2) <= 8192) {
                            qVar3.d(qVar, (int) j6);
                            dVar.f1932b -= j6;
                            this.f1932b += j6;
                            return;
                        }
                    }
                    int i7 = (int) j6;
                    if (i7 <= 0 || i7 > i5) {
                        throw new IllegalArgumentException();
                    }
                    if (i7 >= 1024) {
                        qVar2 = qVar3.c();
                    } else {
                        qVar2 = r.b();
                        System.arraycopy(qVar3.f1955a, qVar3.f1956b, qVar2.f1955a, 0, i7);
                    }
                    qVar2.f1957c = qVar2.f1956b + i7;
                    qVar3.f1956b += i7;
                    qVar3.g.b(qVar2);
                    dVar.f1931a = qVar2;
                }
                q qVar5 = dVar.f1931a;
                long j8 = (long) (qVar5.f1957c - qVar5.f1956b);
                dVar.f1931a = qVar5.a();
                q qVar6 = this.f1931a;
                if (qVar6 == null) {
                    this.f1931a = qVar5;
                    qVar5.g = qVar5;
                    qVar5.f1959f = qVar5;
                } else {
                    qVar6.g.b(qVar5);
                    q qVar7 = qVar5.g;
                    if (qVar7 == qVar5) {
                        throw new IllegalStateException();
                    } else if (qVar7.f1958e) {
                        int i8 = qVar5.f1957c - qVar5.f1956b;
                        int i9 = 8192 - qVar7.f1957c;
                        if (!qVar7.d) {
                            i6 = qVar7.f1956b;
                        }
                        if (i8 <= i9 + i6) {
                            qVar5.d(qVar7, i8);
                            qVar5.a();
                            r.a(qVar5);
                        }
                    }
                }
                dVar.f1932b -= j8;
                this.f1932b += j8;
                j6 -= j8;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    public final e g(String str) {
        C(0, str.length(), str);
        return this;
    }

    public final boolean h(g gVar) {
        byte[] bArr = gVar.f1934a;
        int length = bArr.length;
        if (length < 0 || this.f1932b < ((long) length) || bArr.length < length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (j((long) i2) != gVar.f1934a[i2]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        q qVar = this.f1931a;
        if (qVar == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i5 = qVar.f1957c;
            for (int i6 = qVar.f1956b; i6 < i5; i6++) {
                i2 = (i2 * 31) + qVar.f1955a[i6];
            }
            qVar = qVar.f1959f;
        } while (qVar != this.f1931a);
        return i2;
    }

    public final String i(Charset charset) {
        try {
            return t(this.f1932b, charset);
        } catch (EOFException e6) {
            throw new AssertionError(e6);
        }
    }

    public final boolean isOpen() {
        return true;
    }

    public final byte j(long j6) {
        int i2;
        x.a(this.f1932b, j6, 1);
        long j7 = this.f1932b;
        if (j7 - j6 > j6) {
            q qVar = this.f1931a;
            while (true) {
                int i5 = qVar.f1957c;
                int i6 = qVar.f1956b;
                long j8 = (long) (i5 - i6);
                if (j6 < j8) {
                    return qVar.f1955a[i6 + ((int) j6)];
                }
                j6 -= j8;
                qVar = qVar.f1959f;
            }
        } else {
            long j9 = j6 - j7;
            q qVar2 = this.f1931a;
            do {
                qVar2 = qVar2.g;
                int i7 = qVar2.f1957c;
                i2 = qVar2.f1956b;
                j9 += (long) (i7 - i2);
            } while (j9 < 0);
            return qVar2.f1955a[i2 + ((int) j9)];
        }
    }

    public final int l(byte[] bArr, int i2, int i5) {
        x.a((long) bArr.length, (long) i2, (long) i5);
        q qVar = this.f1931a;
        if (qVar == null) {
            return -1;
        }
        int min = Math.min(i5, qVar.f1957c - qVar.f1956b);
        System.arraycopy(qVar.f1955a, qVar.f1956b, bArr, i2, min);
        int i6 = qVar.f1956b + min;
        qVar.f1956b = i6;
        this.f1932b -= (long) min;
        if (i6 == qVar.f1957c) {
            this.f1931a = qVar.a();
            r.a(qVar);
        }
        return min;
    }

    public final byte m() {
        long j6 = this.f1932b;
        if (j6 != 0) {
            q qVar = this.f1931a;
            int i2 = qVar.f1956b;
            int i5 = qVar.f1957c;
            int i6 = i2 + 1;
            byte b6 = qVar.f1955a[i2];
            this.f1932b = j6 - 1;
            if (i6 == i5) {
                this.f1931a = qVar.a();
                r.a(qVar);
            } else {
                qVar.f1956b = i6;
            }
            return b6;
        }
        throw new IllegalStateException("size == 0");
    }

    public final byte[] n(long j6) {
        x.a(this.f1932b, 0, j6);
        if (j6 <= 2147483647L) {
            byte[] bArr = new byte[((int) j6)];
            p(bArr);
            return bArr;
        }
        throw new IllegalArgumentException(C0552a.m("byteCount > Integer.MAX_VALUE: ", j6));
    }

    public final g o() {
        try {
            return new g(n(this.f1932b));
        } catch (EOFException e6) {
            throw new AssertionError(e6);
        }
    }

    public final void p(byte[] bArr) {
        int i2 = 0;
        while (i2 < bArr.length) {
            int l6 = l(bArr, i2, bArr.length - i2);
            if (l6 != -1) {
                i2 += l6;
            } else {
                throw new EOFException();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [N5.d, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007e, code lost:
        if (r8 != r9) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0080, code lost:
        r14.f1931a = r6.a();
        N5.r.a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008a, code lost:
        r6.f1956b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008c, code lost:
        if (r1 != false) goto L_0x0092;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0066 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long q() {
        /*
            r14 = this;
            long r0 = r14.f1932b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0099
            r0 = 0
            r1 = r0
            r4 = r2
        L_0x000b:
            N5.q r6 = r14.f1931a
            byte[] r7 = r6.f1955a
            int r8 = r6.f1956b
            int r9 = r6.f1957c
        L_0x0013:
            if (r8 >= r9) goto L_0x007e
            byte r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L_0x0022
            r11 = 57
            if (r10 > r11) goto L_0x0022
            int r11 = r10 + -48
            goto L_0x0037
        L_0x0022:
            r11 = 97
            if (r10 < r11) goto L_0x002d
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L_0x002d
            int r11 = r10 + -87
            goto L_0x0037
        L_0x002d:
            r11 = 65
            if (r10 < r11) goto L_0x0062
            r11 = 70
            if (r10 > r11) goto L_0x0062
            int r11 = r10 + -55
        L_0x0037:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x0047
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0013
        L_0x0047:
            N5.d r0 = new N5.d
            r0.<init>()
            r0.B(r4)
            r0.A(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.u()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L_0x0062:
            if (r0 == 0) goto L_0x0066
            r1 = 1
            goto L_0x007e
        L_0x0066:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x007e:
            if (r8 != r9) goto L_0x008a
            N5.q r7 = r6.a()
            r14.f1931a = r7
            N5.r.a(r6)
            goto L_0x008c
        L_0x008a:
            r6.f1956b = r8
        L_0x008c:
            if (r1 != 0) goto L_0x0092
            N5.q r6 = r14.f1931a
            if (r6 != 0) goto L_0x000b
        L_0x0092:
            long r1 = r14.f1932b
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.f1932b = r1
            return r4
        L_0x0099:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: N5.d.q():long");
    }

    public final int r() {
        long j6 = this.f1932b;
        if (j6 >= 4) {
            q qVar = this.f1931a;
            int i2 = qVar.f1956b;
            int i5 = qVar.f1957c;
            if (i5 - i2 < 4) {
                return ((m() & 255) << 24) | ((m() & 255) << 16) | ((m() & 255) << 8) | (m() & 255);
            }
            byte[] bArr = qVar.f1955a;
            byte b6 = ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2] & 255) << 24);
            int i6 = i2 + 3;
            int i7 = i2 + 4;
            byte b7 = b6 | ((bArr[i2 + 2] & 255) << 8) | (bArr[i6] & 255);
            this.f1932b = j6 - 4;
            if (i7 == i5) {
                this.f1931a = qVar.a();
                r.a(qVar);
            } else {
                qVar.f1956b = i7;
            }
            return b7;
        }
        throw new IllegalStateException("size < 4: " + this.f1932b);
    }

    public final int read(ByteBuffer byteBuffer) {
        q qVar = this.f1931a;
        if (qVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), qVar.f1957c - qVar.f1956b);
        byteBuffer.put(qVar.f1955a, qVar.f1956b, min);
        int i2 = qVar.f1956b + min;
        qVar.f1956b = i2;
        this.f1932b -= (long) min;
        if (i2 == qVar.f1957c) {
            this.f1931a = qVar.a();
            r.a(qVar);
        }
        return min;
    }

    public final short s() {
        long j6 = this.f1932b;
        if (j6 >= 2) {
            q qVar = this.f1931a;
            int i2 = qVar.f1956b;
            int i5 = qVar.f1957c;
            if (i5 - i2 < 2) {
                return (short) (((m() & 255) << 8) | (m() & 255));
            }
            int i6 = i2 + 1;
            byte[] bArr = qVar.f1955a;
            int i7 = i2 + 2;
            byte b6 = (bArr[i6] & 255) | ((bArr[i2] & 255) << 8);
            this.f1932b = j6 - 2;
            if (i7 == i5) {
                this.f1931a = qVar.a();
                r.a(qVar);
            } else {
                qVar.f1956b = i7;
            }
            return (short) b6;
        }
        throw new IllegalStateException("size < 2: " + this.f1932b);
    }

    public final String t(long j6, Charset charset) {
        x.a(this.f1932b, 0, j6);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j6 > 2147483647L) {
            throw new IllegalArgumentException(C0552a.m("byteCount > Integer.MAX_VALUE: ", j6));
        } else if (j6 == 0) {
            return "";
        } else {
            q qVar = this.f1931a;
            int i2 = qVar.f1956b;
            if (((long) i2) + j6 > ((long) qVar.f1957c)) {
                return new String(n(j6), charset);
            }
            String str = new String(qVar.f1955a, i2, (int) j6, charset);
            int i5 = (int) (((long) qVar.f1956b) + j6);
            qVar.f1956b = i5;
            this.f1932b -= j6;
            if (i5 == qVar.f1957c) {
                this.f1931a = qVar.a();
                r.a(qVar);
            }
            return str;
        }
    }

    public final String toString() {
        g gVar;
        long j6 = this.f1932b;
        if (j6 <= 2147483647L) {
            int i2 = (int) j6;
            if (i2 == 0) {
                gVar = g.f1933e;
            } else {
                gVar = new s(this, i2);
            }
            return gVar.toString();
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f1932b);
    }

    public final String u() {
        try {
            return t(this.f1932b, x.f1968a);
        } catch (EOFException e6) {
            throw new AssertionError(e6);
        }
    }

    public final String v(long j6) {
        if (j6 > 0) {
            long j7 = j6 - 1;
            if (j(j7) == 13) {
                String t6 = t(j7, x.f1968a);
                a(2);
                return t6;
            }
        }
        String t7 = t(j6, x.f1968a);
        a(1);
        return t7;
    }

    public final q w(int i2) {
        if (i2 < 1 || i2 > 8192) {
            throw new IllegalArgumentException();
        }
        q qVar = this.f1931a;
        if (qVar == null) {
            q b6 = r.b();
            this.f1931a = b6;
            b6.g = b6;
            b6.f1959f = b6;
            return b6;
        }
        q qVar2 = qVar.g;
        if (qVar2.f1957c + i2 <= 8192 && qVar2.f1958e) {
            return qVar2;
        }
        q b7 = r.b();
        qVar2.b(b7);
        return b7;
    }

    public final int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i2 = remaining;
            while (i2 > 0) {
                q w6 = w(1);
                int min = Math.min(i2, 8192 - w6.f1957c);
                byteBuffer.get(w6.f1955a, w6.f1957c, min);
                i2 -= min;
                w6.f1957c += min;
            }
            this.f1932b += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final void x(byte[] bArr) {
        if (bArr != null) {
            y(bArr, bArr.length);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final void y(byte[] bArr, int i2) {
        if (bArr != null) {
            int i5 = 0;
            long j6 = (long) i2;
            x.a((long) bArr.length, (long) 0, j6);
            while (i5 < i2) {
                q w6 = w(1);
                int min = Math.min(i2 - i5, 8192 - w6.f1957c);
                System.arraycopy(bArr, i5, w6.f1955a, w6.f1957c, min);
                i5 += min;
                w6.f1957c += min;
            }
            this.f1932b += j6;
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final long z(u uVar) {
        if (uVar != null) {
            long j6 = 0;
            while (true) {
                long e6 = uVar.e(8192, this);
                if (e6 == -1) {
                    return j6;
                }
                j6 += e6;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    public final void close() {
    }

    public final void flush() {
    }
}
