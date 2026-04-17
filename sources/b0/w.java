package B0;

import U0.g;

public final class w implements D {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f325a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f326b;

    /* renamed from: c  reason: collision with root package name */
    public final D f327c;
    public final q d;

    /* renamed from: e  reason: collision with root package name */
    public final v f328e;

    /* renamed from: f  reason: collision with root package name */
    public int f329f;

    /* renamed from: p  reason: collision with root package name */
    public boolean f330p;

    public w(D d6, boolean z3, boolean z4, v vVar, q qVar) {
        g.c(d6, "Argument must not be null");
        this.f327c = d6;
        this.f325a = z3;
        this.f326b = z4;
        this.f328e = vVar;
        g.c(qVar, "Argument must not be null");
        this.d = qVar;
    }

    public final synchronized void a() {
        if (!this.f330p) {
            this.f329f++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    public final int b() {
        return this.f327c.b();
    }

    public final Class c() {
        return this.f327c.c();
    }

    public final synchronized void d() {
        if (this.f329f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f330p) {
            this.f330p = true;
            if (this.f326b) {
                this.f327c.d();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    public final void e() {
        boolean z3;
        synchronized (this) {
            int i2 = this.f329f;
            if (i2 > 0) {
                z3 = true;
                int i5 = i2 - 1;
                this.f329f = i5;
                if (i5 != 0) {
                    z3 = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z3) {
            this.d.e(this.f328e, this);
        }
    }

    public final Object get() {
        return this.f327c.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f325a + ", listener=" + this.d + ", key=" + this.f328e + ", acquired=" + this.f329f + ", isRecycled=" + this.f330p + ", resource=" + this.f327c + '}';
    }
}
