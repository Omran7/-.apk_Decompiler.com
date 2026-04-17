package J;

import kotlin.jvm.internal.j;

public final class c extends b {

    /* renamed from: c  reason: collision with root package name */
    public final Object f1291c = new Object();

    public c(int i2) {
        super(i2);
    }

    public final Object a() {
        Object a6;
        synchronized (this.f1291c) {
            a6 = super.a();
        }
        return a6;
    }

    public final boolean c(Object obj) {
        boolean c3;
        j.e(obj, "instance");
        synchronized (this.f1291c) {
            c3 = super.c(obj);
        }
        return c3;
    }
}
