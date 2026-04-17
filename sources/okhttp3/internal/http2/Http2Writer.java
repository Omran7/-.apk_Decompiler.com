package okhttp3.internal.http2;

import N5.d;
import N5.g;
import N5.o;
import com.google.android.gms.common.api.f;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;

final class Http2Writer implements Closeable {

    /* renamed from: p  reason: collision with root package name */
    public static final Logger f10894p = Logger.getLogger(Http2.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final o f10895a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f10896b;

    /* renamed from: c  reason: collision with root package name */
    public final d f10897c;
    public int d = 16384;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10898e;

    /* renamed from: f  reason: collision with root package name */
    public final Hpack.Writer f10899f;

    /* JADX WARNING: type inference failed for: r1v1, types: [N5.d, java.lang.Object] */
    public Http2Writer(o oVar, boolean z3) {
        this.f10895a = oVar;
        this.f10896b = z3;
        ? obj = new Object();
        this.f10897c = obj;
        this.f10899f = new Hpack.Writer(obj);
    }

    public final synchronized void c(Settings settings) {
        int i2;
        try {
            if (!this.f10898e) {
                int i5 = this.d;
                int i6 = settings.f10907a;
                if ((i6 & 32) != 0) {
                    i5 = settings.f10908b[5];
                }
                this.d = i5;
                int i7 = -1;
                if ((i6 & 2) != 0) {
                    i2 = settings.f10908b[1];
                } else {
                    i2 = -1;
                }
                if (i2 != -1) {
                    Hpack.Writer writer = this.f10899f;
                    if ((i6 & 2) != 0) {
                        i7 = settings.f10908b[1];
                    }
                    int min = Math.min(i7, 16384);
                    int i8 = writer.d;
                    if (i8 != min) {
                        if (min < i8) {
                            writer.f10802b = Math.min(writer.f10802b, min);
                        }
                        writer.f10803c = true;
                        writer.d = min;
                        int i9 = writer.h;
                        if (min < i9) {
                            if (min == 0) {
                                Arrays.fill(writer.f10804e, (Object) null);
                                writer.f10805f = writer.f10804e.length - 1;
                                writer.g = 0;
                                writer.h = 0;
                            } else {
                                writer.a(i9 - min);
                            }
                        }
                    }
                }
                j(0, 0, (byte) 4, (byte) 1);
                this.f10895a.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void close() {
        this.f10898e = true;
        this.f10895a.close();
    }

    public final synchronized void d(boolean z3, int i2, d dVar, int i5) {
        byte b6;
        if (!this.f10898e) {
            if (z3) {
                b6 = (byte) 1;
            } else {
                b6 = 0;
            }
            j(i2, i5, (byte) 0, b6);
            if (i5 > 0) {
                this.f10895a.f((long) i5, dVar);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void flush() {
        if (!this.f10898e) {
            this.f10895a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final void j(int i2, int i5, byte b6, byte b7) {
        Level level = Level.FINE;
        Logger logger = f10894p;
        if (logger.isLoggable(level)) {
            logger.fine(Http2.a(false, i2, i5, b6, b7));
        }
        int i6 = this.d;
        if (i5 > i6) {
            Http2.b("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i6), Integer.valueOf(i5));
            throw null;
        } else if ((Integer.MIN_VALUE & i2) == 0) {
            o oVar = this.f10895a;
            oVar.j((i5 >>> 16) & 255);
            oVar.j((i5 >>> 8) & 255);
            oVar.j(i5 & 255);
            oVar.j(b6 & 255);
            oVar.j(b7 & 255);
            oVar.k(i2 & f.API_PRIORITY_OTHER);
        } else {
            Http2.b("reserved bit set: %s", Integer.valueOf(i2));
            throw null;
        }
    }

    public final synchronized void k(int i2, ErrorCode errorCode, byte[] bArr) {
        try {
            if (this.f10898e) {
                throw new IOException("closed");
            } else if (errorCode.f10787a != -1) {
                j(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.f10895a.k(i2);
                this.f10895a.k(errorCode.f10787a);
                if (bArr.length > 0) {
                    this.f10895a.d(bArr);
                }
                this.f10895a.flush();
            } else {
                Http2.b("errorCode.httpCode == -1", new Object[0]);
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void l(boolean z3, int i2, ArrayList arrayList) {
        byte b6;
        byte b7;
        int i5;
        int i6;
        int i7 = i2;
        if (!this.f10898e) {
            Hpack.Writer writer = this.f10899f;
            if (writer.f10803c) {
                int i8 = writer.f10802b;
                if (i8 < writer.d) {
                    writer.d(i8, 31, 32);
                }
                writer.f10803c = false;
                writer.f10802b = f.API_PRIORITY_OTHER;
                writer.d(writer.d, 31, 32);
            }
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                Header header = (Header) arrayList.get(i9);
                g z4 = header.f10791a.z();
                Integer num = (Integer) Hpack.f10795b.get(z4);
                g gVar = header.f10792b;
                if (num != null) {
                    int intValue = num.intValue();
                    i5 = intValue + 1;
                    if (i5 > 1 && i5 < 8) {
                        Header[] headerArr = Hpack.f10794a;
                        if (Util.k(headerArr[intValue].f10792b, gVar)) {
                            i6 = i5;
                        } else if (Util.k(headerArr[i5].f10792b, gVar)) {
                            int i10 = i5;
                            i5 = intValue + 2;
                            i6 = i10;
                        }
                    }
                    i6 = i5;
                    i5 = -1;
                } else {
                    i6 = -1;
                    i5 = -1;
                }
                if (i5 == -1) {
                    int i11 = writer.f10805f + 1;
                    int length = writer.f10804e.length;
                    while (true) {
                        if (i11 >= length) {
                            break;
                        }
                        if (Util.k(writer.f10804e[i11].f10791a, z4)) {
                            if (Util.k(writer.f10804e[i11].f10792b, gVar)) {
                                i5 = (i11 - writer.f10805f) + Hpack.f10794a.length;
                                break;
                            } else if (i6 == -1) {
                                i6 = (i11 - writer.f10805f) + Hpack.f10794a.length;
                            }
                        }
                        i11++;
                    }
                }
                if (i5 != -1) {
                    writer.d(i5, 127, 128);
                } else if (i6 == -1) {
                    writer.f10801a.A(64);
                    writer.c(z4);
                    writer.c(gVar);
                    writer.b(header);
                } else {
                    g gVar2 = Header.d;
                    z4.getClass();
                    if (!z4.w(gVar2, gVar2.f1934a.length) || Header.f10790i.equals(z4)) {
                        writer.d(i6, 63, 64);
                        writer.c(gVar);
                        writer.b(header);
                    } else {
                        writer.d(i6, 15, 0);
                        writer.c(gVar);
                    }
                }
            }
            d dVar = this.f10897c;
            long j6 = dVar.f1932b;
            int min = (int) Math.min((long) this.d, j6);
            long j7 = (long) min;
            int i12 = (j6 > j7 ? 1 : (j6 == j7 ? 0 : -1));
            if (i12 == 0) {
                b6 = 4;
            } else {
                b6 = 0;
            }
            if (z3) {
                b6 = (byte) (b6 | 1);
            }
            j(i7, min, (byte) 1, b6);
            o oVar = this.f10895a;
            oVar.f(j7, dVar);
            if (i12 > 0) {
                long j8 = j6 - j7;
                while (j8 > 0) {
                    int min2 = (int) Math.min((long) this.d, j8);
                    long j9 = (long) min2;
                    j8 -= j9;
                    if (j8 == 0) {
                        b7 = 4;
                    } else {
                        b7 = 0;
                    }
                    j(i7, min2, (byte) 9, b7);
                    oVar.f(j9, dVar);
                }
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    public final synchronized void m(int i2, int i5, boolean z3) {
        if (!this.f10898e) {
            j(0, 8, (byte) 6, z3 ? (byte) 1 : 0);
            this.f10895a.k(i2);
            this.f10895a.k(i5);
            this.f10895a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void n(int i2, ErrorCode errorCode) {
        if (this.f10898e) {
            throw new IOException("closed");
        } else if (errorCode.f10787a != -1) {
            j(i2, 4, (byte) 3, (byte) 0);
            this.f10895a.k(errorCode.f10787a);
            this.f10895a.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void o(int i2, long j6) {
        if (this.f10898e) {
            throw new IOException("closed");
        } else if (j6 == 0 || j6 > 2147483647L) {
            Http2.b("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j6));
            throw null;
        } else {
            j(i2, 4, (byte) 8, (byte) 0);
            this.f10895a.k((int) j6);
            this.f10895a.flush();
        }
    }
}
