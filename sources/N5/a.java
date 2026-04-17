package N5;

import java.io.IOException;
import java.io.OutputStream;

public final class a implements t {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1920a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1921b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f1922c;

    public a(w wVar, OutputStream outputStream) {
        this.f1921b = wVar;
        this.f1922c = outputStream;
    }

    public final w b() {
        switch (this.f1920a) {
            case 0:
                return (m) this.f1922c;
            default:
                return (w) this.f1921b;
        }
    }

    public final void close() {
        switch (this.f1920a) {
            case 0:
                m mVar = (m) this.f1922c;
                mVar.i();
                try {
                    ((a) this.f1921b).close();
                    mVar.j(true);
                    return;
                } catch (IOException e6) {
                    e = e6;
                    if (mVar.k()) {
                        e = mVar.l(e);
                    }
                    throw e;
                } catch (Throwable th) {
                    mVar.j(false);
                    throw th;
                }
            default:
                ((OutputStream) this.f1922c).close();
                return;
        }
    }

    public final void f(long j6, d dVar) {
        switch (this.f1920a) {
            case 0:
                x.a(dVar.f1932b, 0, j6);
                while (true) {
                    long j7 = 0;
                    if (j6 > 0) {
                        q qVar = dVar.f1931a;
                        while (true) {
                            if (j7 < 65536) {
                                j7 += (long) (qVar.f1957c - qVar.f1956b);
                                if (j7 >= j6) {
                                    j7 = j6;
                                } else {
                                    qVar = qVar.f1959f;
                                }
                            }
                        }
                        m mVar = (m) this.f1922c;
                        mVar.i();
                        try {
                            ((a) this.f1921b).f(j7, dVar);
                            j6 -= j7;
                            mVar.j(true);
                        } catch (IOException e6) {
                            e = e6;
                            if (mVar.k()) {
                                e = mVar.l(e);
                            }
                            throw e;
                        } catch (Throwable th) {
                            mVar.j(false);
                            throw th;
                        }
                    } else {
                        return;
                    }
                }
            default:
                x.a(dVar.f1932b, 0, j6);
                while (j6 > 0) {
                    ((w) this.f1921b).f();
                    q qVar2 = dVar.f1931a;
                    int min = (int) Math.min(j6, (long) (qVar2.f1957c - qVar2.f1956b));
                    ((OutputStream) this.f1922c).write(qVar2.f1955a, qVar2.f1956b, min);
                    int i2 = qVar2.f1956b + min;
                    qVar2.f1956b = i2;
                    long j8 = (long) min;
                    j6 -= j8;
                    dVar.f1932b -= j8;
                    if (i2 == qVar2.f1957c) {
                        dVar.f1931a = qVar2.a();
                        r.a(qVar2);
                    }
                }
                return;
        }
    }

    public final void flush() {
        switch (this.f1920a) {
            case 0:
                m mVar = (m) this.f1922c;
                mVar.i();
                try {
                    ((a) this.f1921b).flush();
                    mVar.j(true);
                    return;
                } catch (IOException e6) {
                    e = e6;
                    if (mVar.k()) {
                        e = mVar.l(e);
                    }
                    throw e;
                } catch (Throwable th) {
                    mVar.j(false);
                    throw th;
                }
            default:
                ((OutputStream) this.f1922c).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f1920a) {
            case 0:
                return "AsyncTimeout.sink(" + ((a) this.f1921b) + ")";
            default:
                return "sink(" + ((OutputStream) this.f1922c) + ")";
        }
    }

    public a(m mVar, a aVar) {
        this.f1922c = mVar;
        this.f1921b = aVar;
    }
}
