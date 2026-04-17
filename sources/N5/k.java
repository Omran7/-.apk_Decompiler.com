package N5;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.logging.Logger;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class k implements u {

    /* renamed from: a  reason: collision with root package name */
    public int f1940a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final p f1941b;

    /* renamed from: c  reason: collision with root package name */
    public final Inflater f1942c;
    public final l d;

    /* renamed from: e  reason: collision with root package name */
    public final CRC32 f1943e = new CRC32();

    public k(u uVar) {
        if (uVar != null) {
            Inflater inflater = new Inflater(true);
            this.f1942c = inflater;
            Logger logger = n.f1948a;
            p pVar = new p(uVar);
            this.f1941b = pVar;
            this.d = new l(pVar, inflater);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    public static void c(int i2, int i5, String str) {
        if (i5 != i2) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[]{str, Integer.valueOf(i5), Integer.valueOf(i2)}));
        }
    }

    public final w b() {
        return this.f1941b.f1953b.b();
    }

    public final void close() {
        this.d.close();
    }

    public final void d(d dVar, long j6, long j7) {
        q qVar = dVar.f1931a;
        while (true) {
            int i2 = qVar.f1957c;
            int i5 = qVar.f1956b;
            if (j6 < ((long) (i2 - i5))) {
                break;
            }
            j6 -= (long) (i2 - i5);
            qVar = qVar.f1959f;
        }
        while (j7 > 0) {
            int i6 = (int) (((long) qVar.f1956b) + j6);
            int min = (int) Math.min((long) (qVar.f1957c - i6), j7);
            this.f1943e.update(qVar.f1955a, i6, min);
            j7 -= (long) min;
            qVar = qVar.f1959f;
            j6 = 0;
        }
    }

    public final long e(long j6, d dVar) {
        p pVar;
        boolean z3;
        d dVar2;
        long j7;
        d dVar3 = dVar;
        int i2 = this.f1940a;
        CRC32 crc32 = this.f1943e;
        p pVar2 = this.f1941b;
        if (i2 == 0) {
            pVar2.q(10);
            d dVar4 = pVar2.f1952a;
            byte j8 = dVar4.j(3);
            if (((j8 >> 1) & 1) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                dVar2 = dVar4;
                d(dVar4, 0, 10);
            } else {
                dVar2 = dVar4;
            }
            c(8075, pVar2.n(), "ID1ID2");
            pVar2.a(8);
            if (((j8 >> 2) & 1) == 1) {
                pVar2.q(2);
                if (z3) {
                    d(dVar2, 0, 2);
                }
                short s6 = dVar2.s();
                Charset charset = x.f1968a;
                long j9 = (long) ((short) (((s6 & 255) << 8) | ((s6 & 65280) >>> 8)));
                pVar2.q(j9);
                if (z3) {
                    d(dVar2, 0, j9);
                    j7 = j9;
                } else {
                    j7 = j9;
                }
                pVar2.a(j7);
            }
            if (((j8 >> 3) & 1) == 1) {
                p pVar3 = pVar2;
                long d6 = pVar2.d((byte) 0, 0, Long.MAX_VALUE);
                if (d6 != -1) {
                    if (z3) {
                        pVar = pVar3;
                        d(dVar2, 0, d6 + 1);
                    } else {
                        pVar = pVar3;
                    }
                    pVar.a(d6 + 1);
                } else {
                    throw new EOFException();
                }
            } else {
                pVar = pVar2;
            }
            if (((j8 >> 4) & 1) == 1) {
                long d7 = pVar.d((byte) 0, 0, Long.MAX_VALUE);
                if (d7 != -1) {
                    if (z3) {
                        d(dVar2, 0, d7 + 1);
                    }
                    pVar.a(d7 + 1);
                } else {
                    throw new EOFException();
                }
            }
            if (z3) {
                pVar.q(2);
                short s7 = dVar2.s();
                Charset charset2 = x.f1968a;
                c((short) (((s7 & 255) << 8) | ((s7 & 65280) >>> 8)), (short) ((int) crc32.getValue()), "FHCRC");
                crc32.reset();
            }
            this.f1940a = 1;
        } else {
            pVar = pVar2;
        }
        if (this.f1940a == 1) {
            long j10 = dVar3.f1932b;
            long e6 = this.d.e(8192, dVar3);
            if (e6 != -1) {
                d(dVar, j10, e6);
                return e6;
            }
            this.f1940a = 2;
        }
        if (this.f1940a == 2) {
            pVar.q(4);
            d dVar5 = pVar.f1952a;
            int r6 = dVar5.r();
            Charset charset3 = x.f1968a;
            c(((r6 & 255) << 24) | ((r6 & -16777216) >>> 24) | ((r6 & 16711680) >>> 8) | ((r6 & 65280) << 8), (int) crc32.getValue(), "CRC");
            pVar.q(4);
            int r7 = dVar5.r();
            c(((r7 & 255) << 24) | ((r7 & -16777216) >>> 24) | ((r7 & 16711680) >>> 8) | ((r7 & 65280) << 8), (int) this.f1942c.getBytesWritten(), "ISIZE");
            this.f1940a = 3;
            if (!pVar.c()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1;
    }
}
