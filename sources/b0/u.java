package B0;

import Q0.f;
import T2.c;
import U0.g;
import U0.o;
import V0.b;
import V0.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import s2.e;

public final class u implements b {
    public static final e F = new e(1);

    /* renamed from: A  reason: collision with root package name */
    public boolean f298A;

    /* renamed from: B  reason: collision with root package name */
    public w f299B;

    /* renamed from: C  reason: collision with root package name */
    public n f300C;

    /* renamed from: D  reason: collision with root package name */
    public volatile boolean f301D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f302E;

    /* renamed from: a  reason: collision with root package name */
    public final t f303a = new t(new ArrayList(2));

    /* renamed from: b  reason: collision with root package name */
    public final d f304b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final q f305c;
    public final C0009h d;

    /* renamed from: e  reason: collision with root package name */
    public final e f306e;

    /* renamed from: f  reason: collision with root package name */
    public final q f307f;

    /* renamed from: p  reason: collision with root package name */
    public final E0.e f308p;

    /* renamed from: q  reason: collision with root package name */
    public final E0.e f309q;

    /* renamed from: r  reason: collision with root package name */
    public final E0.e f310r;

    /* renamed from: s  reason: collision with root package name */
    public final AtomicInteger f311s = new AtomicInteger();

    /* renamed from: t  reason: collision with root package name */
    public v f312t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f313u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f314v;

    /* renamed from: w  reason: collision with root package name */
    public D f315w;

    /* renamed from: x  reason: collision with root package name */
    public int f316x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f317y;

    /* renamed from: z  reason: collision with root package name */
    public y f318z;

    /* JADX WARNING: type inference failed for: r0v1, types: [V0.d, java.lang.Object] */
    public u(E0.e eVar, E0.e eVar2, E0.e eVar3, E0.e eVar4, q qVar, q qVar2, C0009h hVar) {
        e eVar5 = F;
        this.f308p = eVar;
        this.f309q = eVar2;
        this.f310r = eVar4;
        this.f307f = qVar;
        this.f305c = qVar2;
        this.d = hVar;
        this.f306e = eVar5;
    }

    public final synchronized void a(f fVar, c cVar) {
        try {
            this.f304b.a();
            t tVar = this.f303a;
            tVar.getClass();
            tVar.f297a.add(new s(fVar, cVar));
            if (this.f317y) {
                d(1);
                r rVar = new r(this, fVar, 1);
                cVar.getClass();
                o.j(rVar);
            } else if (this.f298A) {
                d(1);
                r rVar2 = new r(this, fVar, 0);
                cVar.getClass();
                o.j(rVar2);
            } else {
                g.a("Cannot add callbacks to a cancelled EngineJob", !this.f301D);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final void b() {
        if (!e()) {
            this.f301D = true;
            n nVar = this.f300C;
            nVar.f259J = true;
            j jVar = nVar.f257H;
            if (jVar != null) {
                jVar.cancel();
            }
            q qVar = this.f307f;
            v vVar = this.f312t;
            synchronized (qVar) {
                A a6 = qVar.f287a;
                a6.getClass();
                HashMap hashMap = a6.f175a;
                if (equals(hashMap.get(vVar))) {
                    hashMap.remove(vVar);
                }
            }
        }
    }

    public final void c() {
        boolean z3;
        w wVar;
        synchronized (this) {
            try {
                this.f304b.a();
                g.a("Not yet complete!", e());
                int decrementAndGet = this.f311s.decrementAndGet();
                if (decrementAndGet >= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                g.a("Can't decrement below 0", z3);
                if (decrementAndGet == 0) {
                    wVar = this.f299B;
                    f();
                } else {
                    wVar = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (wVar != null) {
            wVar.e();
        }
    }

    public final synchronized void d(int i2) {
        w wVar;
        g.a("Not yet complete!", e());
        if (this.f311s.getAndAdd(i2) == 0 && (wVar = this.f299B) != null) {
            wVar.a();
        }
    }

    public final boolean e() {
        if (this.f298A || this.f317y || this.f301D) {
            return true;
        }
        return false;
    }

    public final synchronized void f() {
        boolean a6;
        if (this.f312t != null) {
            this.f303a.f297a.clear();
            this.f312t = null;
            this.f299B = null;
            this.f315w = null;
            this.f298A = false;
            this.f301D = false;
            this.f317y = false;
            this.f302E = false;
            n nVar = this.f300C;
            m mVar = nVar.f269p;
            synchronized (mVar) {
                mVar.f248a = true;
                a6 = mVar.a();
            }
            if (a6) {
                nVar.y();
            }
            this.f300C = null;
            this.f318z = null;
            this.f316x = 0;
            this.d.D(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void g(f fVar) {
        try {
            this.f304b.a();
            t tVar = this.f303a;
            tVar.f297a.remove(new s(fVar, g.f3684b));
            if (this.f303a.f297a.isEmpty()) {
                b();
                if (!this.f317y) {
                    if (this.f298A) {
                    }
                }
                if (this.f311s.get() == 0) {
                    f();
                }
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final d j() {
        return this.f304b;
    }
}
