package N5;

import h0.C0552a;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class p implements f {

    /* renamed from: a  reason: collision with root package name */
    public final d f1952a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final u f1953b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1954c;

    /* JADX WARNING: type inference failed for: r0v0, types: [N5.d, java.lang.Object] */
    public p(u uVar) {
        if (uVar != null) {
            this.f1953b = uVar;
            return;
        }
        throw new NullPointerException("source == null");
    }

    public final void a(long j6) {
        if (!this.f1954c) {
            while (j6 > 0) {
                d dVar = this.f1952a;
                if (dVar.f1932b == 0 && this.f1953b.e(8192, dVar) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j6, dVar.f1932b);
                dVar.a(min);
                j6 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final w b() {
        return this.f1953b.b();
    }

    public final boolean c() {
        if (!this.f1954c) {
            d dVar = this.f1952a;
            if (!dVar.d() || this.f1953b.e(8192, dVar) != -1) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("closed");
    }

    public final void close() {
        if (!this.f1954c) {
            this.f1954c = true;
            this.f1953b.close();
            this.f1952a.c();
        }
    }

    public final long d(byte b6, long j6, long j7) {
        long j8;
        long j9;
        long j10;
        long j11;
        q qVar;
        long j12 = j7;
        if (!this.f1954c) {
            long j13 = 0;
            if (j12 >= 0) {
                while (j13 < j12) {
                    d dVar = this.f1952a;
                    dVar.getClass();
                    long j14 = 0;
                    if (j13 < 0 || j12 < j13) {
                        long j15 = dVar.f1932b;
                        throw new IllegalArgumentException("size=" + j15 + " fromIndex=" + j13 + " toIndex=" + j12);
                    }
                    long j16 = dVar.f1932b;
                    if (j12 > j16) {
                        j8 = j16;
                    } else {
                        j8 = j12;
                    }
                    if (j13 != j8 && (qVar = dVar.f1931a) != null) {
                        if (j16 - j13 < j13) {
                            while (j16 > j13) {
                                qVar = qVar.g;
                                j16 -= (long) (qVar.f1957c - qVar.f1956b);
                            }
                        } else {
                            while (true) {
                                long j17 = ((long) (qVar.f1957c - qVar.f1956b)) + j14;
                                if (j17 >= j13) {
                                    break;
                                }
                                qVar = qVar.f1959f;
                                j14 = j17;
                            }
                            j16 = j14;
                        }
                        long j18 = j13;
                        while (true) {
                            if (j16 >= j8) {
                                break;
                            }
                            byte[] bArr = qVar.f1955a;
                            j9 = j13;
                            int min = (int) Math.min((long) qVar.f1957c, (((long) qVar.f1956b) + j8) - j16);
                            for (int i2 = (int) ((((long) qVar.f1956b) + j18) - j16); i2 < min; i2++) {
                                if (bArr[i2] == b6) {
                                    j10 = ((long) (i2 - qVar.f1956b)) + j16;
                                    j11 = -1;
                                    break;
                                }
                            }
                            byte b7 = b6;
                            j18 = j16 + ((long) (qVar.f1957c - qVar.f1956b));
                            qVar = qVar.f1959f;
                            j16 = j18;
                            j13 = j9;
                        }
                    }
                    byte b8 = b6;
                    j9 = j13;
                    j11 = -1;
                    j10 = -1;
                    if (j10 != j11) {
                        return j10;
                    }
                    long j19 = dVar.f1932b;
                    if (j19 >= j12 || this.f1953b.e(8192, dVar) == j11) {
                        return j11;
                    }
                    j13 = Math.max(j9, j19);
                }
                return -1;
            }
            throw new IllegalArgumentException(C0552a.m("fromIndex=0 toIndex=", j12));
        }
        throw new IllegalStateException("closed");
    }

    public final long e(long j6, d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j6 < 0) {
            throw new IllegalArgumentException(C0552a.m("byteCount < 0: ", j6));
        } else if (!this.f1954c) {
            d dVar2 = this.f1952a;
            if (dVar2.f1932b == 0 && this.f1953b.e(8192, dVar2) == -1) {
                return -1;
            }
            return dVar2.e(Math.min(j6, dVar2.f1932b), dVar);
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final boolean h(g gVar) {
        byte[] bArr = gVar.f1934a;
        int length = bArr.length;
        if (this.f1954c) {
            throw new IllegalStateException("closed");
        } else if (length < 0 || bArr.length < length) {
            return false;
        } else {
            for (int i2 = 0; i2 < length; i2++) {
                long j6 = (long) i2;
                if (!p(1 + j6) || this.f1952a.j(j6) != gVar.f1934a[i2]) {
                    return false;
                }
            }
            return true;
        }
    }

    public final String i(Charset charset) {
        if (charset != null) {
            u uVar = this.f1953b;
            d dVar = this.f1952a;
            dVar.z(uVar);
            return dVar.i(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    public final boolean isOpen() {
        return !this.f1954c;
    }

    public final byte j() {
        q(1);
        return this.f1952a.m();
    }

    public final g k(long j6) {
        q(j6);
        d dVar = this.f1952a;
        dVar.getClass();
        return new g(dVar.n(j6));
    }

    public final void l(byte[] bArr) {
        d dVar = this.f1952a;
        try {
            q((long) bArr.length);
            dVar.p(bArr);
        } catch (EOFException e6) {
            int i2 = 0;
            while (true) {
                long j6 = dVar.f1932b;
                if (j6 > 0) {
                    int l6 = dVar.l(bArr, i2, (int) j6);
                    if (l6 != -1) {
                        i2 += l6;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e6;
                }
            }
        }
    }

    public final int m() {
        q(4);
        return this.f1952a.r();
    }

    public final short n() {
        q(2);
        return this.f1952a.s();
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [N5.d, java.lang.Object] */
    public final String o(long j6) {
        long j7;
        long j8 = j6;
        if (j8 >= 0) {
            if (j8 == Long.MAX_VALUE) {
                j7 = Long.MAX_VALUE;
            } else {
                j7 = j8 + 1;
            }
            long d = d((byte) 10, 0, j7);
            int i2 = (d > -1 ? 1 : (d == -1 ? 0 : -1));
            d dVar = this.f1952a;
            if (i2 != 0) {
                return dVar.v(d);
            }
            if (j7 < Long.MAX_VALUE && p(j7) && dVar.j(j7 - 1) == 13 && p(1 + j7) && dVar.j(j7) == 10) {
                return dVar.v(j7);
            }
            ? obj = new Object();
            long min = Math.min(32, dVar.f1932b);
            long j9 = 0;
            x.a(dVar.f1932b, 0, min);
            if (min != 0) {
                obj.f1932b += min;
                q qVar = dVar.f1931a;
                while (true) {
                    long j10 = (long) (qVar.f1957c - qVar.f1956b);
                    if (j9 < j10) {
                        break;
                    }
                    j9 -= j10;
                    qVar = qVar.f1959f;
                }
                while (min > 0) {
                    q c3 = qVar.c();
                    int i5 = (int) (((long) c3.f1956b) + j9);
                    c3.f1956b = i5;
                    c3.f1957c = Math.min(i5 + ((int) min), c3.f1957c);
                    q qVar2 = obj.f1931a;
                    if (qVar2 == null) {
                        c3.g = c3;
                        c3.f1959f = c3;
                        obj.f1931a = c3;
                    } else {
                        qVar2.g.b(c3);
                    }
                    min -= (long) (c3.f1957c - c3.f1956b);
                    qVar = qVar.f1959f;
                    j9 = 0;
                }
            }
            throw new EOFException("\\n not found: limit=" + Math.min(dVar.f1932b, j8) + " content=" + obj.o().n() + 8230);
        }
        throw new IllegalArgumentException(C0552a.m("limit < 0: ", j8));
    }

    public final boolean p(long j6) {
        d dVar;
        if (j6 < 0) {
            throw new IllegalArgumentException(C0552a.m("byteCount < 0: ", j6));
        } else if (!this.f1954c) {
            do {
                dVar = this.f1952a;
                if (dVar.f1932b >= j6) {
                    return true;
                }
            } while (this.f1953b.e(8192, dVar) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final void q(long j6) {
        if (!p(j6)) {
            throw new EOFException();
        }
    }

    public final int read(ByteBuffer byteBuffer) {
        d dVar = this.f1952a;
        if (dVar.f1932b == 0 && this.f1953b.e(8192, dVar) == -1) {
            return -1;
        }
        return dVar.read(byteBuffer);
    }

    public final String toString() {
        return "buffer(" + this.f1953b + ")";
    }
}
