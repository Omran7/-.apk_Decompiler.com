package N5;

import java.util.concurrent.TimeUnit;

public final class j extends w {

    /* renamed from: e  reason: collision with root package name */
    public w f1939e;

    public j(w wVar) {
        if (wVar != null) {
            this.f1939e = wVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final w a() {
        return this.f1939e.a();
    }

    public final w b() {
        return this.f1939e.b();
    }

    public final long c() {
        return this.f1939e.c();
    }

    public final w d(long j6) {
        return this.f1939e.d(j6);
    }

    public final boolean e() {
        return this.f1939e.e();
    }

    public final void f() {
        this.f1939e.f();
    }

    public final w g(long j6, TimeUnit timeUnit) {
        return this.f1939e.g(j6, timeUnit);
    }
}
