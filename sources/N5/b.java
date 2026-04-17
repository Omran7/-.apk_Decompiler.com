package N5;

import java.io.IOException;
import java.io.InputStream;

public final class b implements u {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1923a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1924b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f1925c;

    public b(w wVar, InputStream inputStream) {
        this.f1924b = wVar;
        this.f1925c = inputStream;
    }

    public final w b() {
        switch (this.f1923a) {
            case 0:
                return (m) this.f1925c;
            default:
                return (w) this.f1924b;
        }
    }

    public final void close() {
        switch (this.f1923a) {
            case 0:
                m mVar = (m) this.f1925c;
                try {
                    ((b) this.f1924b).close();
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
                ((InputStream) this.f1925c).close();
                return;
        }
    }

    public final long e(long j6, d dVar) {
        switch (this.f1923a) {
            case 0:
                m mVar = (m) this.f1925c;
                mVar.i();
                try {
                    long e6 = ((b) this.f1924b).e(8192, dVar);
                    mVar.j(true);
                    return e6;
                } catch (IOException e7) {
                    e = e7;
                    if (mVar.k()) {
                        e = mVar.l(e);
                    }
                    throw e;
                } catch (Throwable th) {
                    mVar.j(false);
                    throw th;
                }
            default:
                try {
                    ((w) this.f1924b).f();
                    q w6 = dVar.w(1);
                    int read = ((InputStream) this.f1925c).read(w6.f1955a, w6.f1957c, (int) Math.min(8192, (long) (8192 - w6.f1957c)));
                    if (read == -1) {
                        return -1;
                    }
                    w6.f1957c += read;
                    long j7 = (long) read;
                    dVar.f1932b += j7;
                    return j7;
                } catch (AssertionError e8) {
                    if (e8.getCause() == null || e8.getMessage() == null || !e8.getMessage().contains("getsockname failed")) {
                        throw e8;
                    }
                    throw new IOException(e8);
                }
        }
    }

    public final String toString() {
        switch (this.f1923a) {
            case 0:
                return "AsyncTimeout.source(" + ((b) this.f1924b) + ")";
            default:
                return "source(" + ((InputStream) this.f1925c) + ")";
        }
    }

    public b(m mVar, b bVar) {
        this.f1925c = mVar;
        this.f1924b = bVar;
    }
}
