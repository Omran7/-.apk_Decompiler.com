package N5;

import E0.a;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class c extends w {
    public static final long h;

    /* renamed from: i  reason: collision with root package name */
    public static final long f1926i;

    /* renamed from: j  reason: collision with root package name */
    public static c f1927j;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1928e;

    /* renamed from: f  reason: collision with root package name */
    public c f1929f;
    public long g;

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        h = millis;
        f1926i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public static c h() {
        c cVar = f1927j.f1929f;
        Class<c> cls = c.class;
        if (cVar == null) {
            long nanoTime = System.nanoTime();
            cls.wait(h);
            if (f1927j.f1929f != null || System.nanoTime() - nanoTime < f1926i) {
                return null;
            }
            return f1927j;
        }
        long nanoTime2 = cVar.g - System.nanoTime();
        if (nanoTime2 > 0) {
            long j6 = nanoTime2 / 1000000;
            cls.wait(j6, (int) (nanoTime2 - (1000000 * j6)));
            return null;
        }
        f1927j.f1929f = cVar.f1929f;
        cVar.f1929f = null;
        return cVar;
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [N5.c, java.lang.Object] */
    public final void i() {
        c cVar;
        if (!this.f1928e) {
            long j6 = this.f1967c;
            boolean z3 = this.f1965a;
            int i2 = (j6 > 0 ? 1 : (j6 == 0 ? 0 : -1));
            if (i2 != 0 || z3) {
                this.f1928e = true;
                synchronized (c.class) {
                    try {
                        if (f1927j == null) {
                            f1927j = new Object();
                            a aVar = new a("Okio Watchdog");
                            aVar.setDaemon(true);
                            aVar.start();
                        }
                        long nanoTime = System.nanoTime();
                        if (i2 != 0 && z3) {
                            this.g = Math.min(j6, c() - nanoTime) + nanoTime;
                        } else if (i2 != 0) {
                            this.g = j6 + nanoTime;
                        } else if (z3) {
                            this.g = c();
                        } else {
                            throw new AssertionError();
                        }
                        long j7 = this.g - nanoTime;
                        c cVar2 = f1927j;
                        while (true) {
                            cVar = cVar2.f1929f;
                            if (cVar == null) {
                                break;
                            } else if (j7 < cVar.g - nanoTime) {
                                break;
                            } else {
                                cVar2 = cVar;
                            }
                        }
                        this.f1929f = cVar;
                        cVar2.f1929f = this;
                        if (cVar2 == f1927j) {
                            c.class.notify();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    public final void j(boolean z3) {
        if (k() && z3) {
            throw l((IOException) null);
        }
    }

    public final boolean k() {
        if (!this.f1928e) {
            return false;
        }
        this.f1928e = false;
        synchronized (c.class) {
            c cVar = f1927j;
            while (cVar != null) {
                c cVar2 = cVar.f1929f;
                if (cVar2 == this) {
                    cVar.f1929f = this.f1929f;
                    this.f1929f = null;
                    return false;
                }
                cVar = cVar2;
            }
            return true;
        }
    }

    public IOException l(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void m() {
    }
}
