package N5;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class l implements u {

    /* renamed from: a  reason: collision with root package name */
    public final p f1944a;

    /* renamed from: b  reason: collision with root package name */
    public final Inflater f1945b;

    /* renamed from: c  reason: collision with root package name */
    public int f1946c;
    public boolean d;

    public l(p pVar, Inflater inflater) {
        this.f1944a = pVar;
        this.f1945b = inflater;
    }

    public final w b() {
        return this.f1944a.f1953b.b();
    }

    public final void close() {
        if (!this.d) {
            this.f1945b.end();
            this.d = true;
            this.f1944a.close();
        }
    }

    public final long e(long j6, d dVar) {
        Inflater inflater;
        p pVar;
        q w6;
        if (!this.d) {
            while (true) {
                inflater = this.f1945b;
                boolean needsInput = inflater.needsInput();
                pVar = this.f1944a;
                boolean z3 = false;
                if (needsInput) {
                    int i2 = this.f1946c;
                    if (i2 != 0) {
                        int remaining = i2 - inflater.getRemaining();
                        this.f1946c -= remaining;
                        pVar.a((long) remaining);
                    }
                    if (inflater.getRemaining() != 0) {
                        throw new IllegalStateException("?");
                    } else if (pVar.c()) {
                        z3 = true;
                    } else {
                        q qVar = pVar.f1952a.f1931a;
                        int i5 = qVar.f1957c;
                        int i6 = qVar.f1956b;
                        int i7 = i5 - i6;
                        this.f1946c = i7;
                        inflater.setInput(qVar.f1955a, i6, i7);
                    }
                }
                try {
                    w6 = dVar.w(1);
                    int inflate = inflater.inflate(w6.f1955a, w6.f1957c, (int) Math.min(8192, (long) (8192 - w6.f1957c)));
                    if (inflate > 0) {
                        w6.f1957c += inflate;
                        long j7 = (long) inflate;
                        dVar.f1932b += j7;
                        return j7;
                    } else if (inflater.finished()) {
                        break;
                    } else if (inflater.needsDictionary()) {
                        break;
                    } else if (z3) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e6) {
                    throw new IOException(e6);
                }
            }
            int i8 = this.f1946c;
            if (i8 != 0) {
                int remaining2 = i8 - inflater.getRemaining();
                this.f1946c -= remaining2;
                pVar.a((long) remaining2);
            }
            if (w6.f1956b != w6.f1957c) {
                return -1;
            }
            dVar.f1931a = w6.a();
            r.a(w6);
            return -1;
        }
        throw new IllegalStateException("closed");
    }
}
