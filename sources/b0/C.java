package B0;

import V0.b;
import V0.c;
import V0.d;
import s2.e;

public final class C implements D, b {

    /* renamed from: e  reason: collision with root package name */
    public static final C0009h f179e = c.a(20, new e(2));

    /* renamed from: a  reason: collision with root package name */
    public final d f180a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public D f181b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f182c;
    public boolean d;

    public final synchronized void a() {
        this.f180a.a();
        if (this.f182c) {
            this.f182c = false;
            if (this.d) {
                d();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    public final int b() {
        return this.f181b.b();
    }

    public final Class c() {
        return this.f181b.c();
    }

    public final synchronized void d() {
        this.f180a.a();
        this.d = true;
        if (!this.f182c) {
            this.f181b.d();
            this.f181b = null;
            f179e.D(this);
        }
    }

    public final Object get() {
        return this.f181b.get();
    }

    public final d j() {
        return this.f180a;
    }
}
