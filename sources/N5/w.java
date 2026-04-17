package N5;

import h0.C0552a;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class w {
    public static final v d = new Object();

    /* renamed from: a  reason: collision with root package name */
    public boolean f1965a;

    /* renamed from: b  reason: collision with root package name */
    public long f1966b;

    /* renamed from: c  reason: collision with root package name */
    public long f1967c;

    public w a() {
        this.f1965a = false;
        return this;
    }

    public w b() {
        this.f1967c = 0;
        return this;
    }

    public long c() {
        if (this.f1965a) {
            return this.f1966b;
        }
        throw new IllegalStateException("No deadline");
    }

    public w d(long j6) {
        this.f1965a = true;
        this.f1966b = j6;
        return this;
    }

    public boolean e() {
        return this.f1965a;
    }

    public void f() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.f1965a && this.f1966b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public w g(long j6, TimeUnit timeUnit) {
        if (j6 < 0) {
            throw new IllegalArgumentException(C0552a.m("timeout < 0: ", j6));
        } else if (timeUnit != null) {
            this.f1967c = timeUnit.toNanos(j6);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }
}
