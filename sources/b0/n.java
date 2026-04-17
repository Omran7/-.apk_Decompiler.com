package B0;

import I0.q;
import V0.b;
import V0.d;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.f;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.data.g;
import h0.C0552a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import q.C0928e;
import z0.C1130f;
import z0.h;
import z0.i;
import z0.l;
import z1.j;

public final class n implements C0010i, Runnable, Comparable, b {

    /* renamed from: A  reason: collision with root package name */
    public long f251A;

    /* renamed from: B  reason: collision with root package name */
    public Object f252B;

    /* renamed from: C  reason: collision with root package name */
    public Thread f253C;

    /* renamed from: D  reason: collision with root package name */
    public C1130f f254D;

    /* renamed from: E  reason: collision with root package name */
    public C1130f f255E;
    public Object F;

    /* renamed from: G  reason: collision with root package name */
    public e f256G;

    /* renamed from: H  reason: collision with root package name */
    public volatile j f257H;

    /* renamed from: I  reason: collision with root package name */
    public volatile boolean f258I;

    /* renamed from: J  reason: collision with root package name */
    public volatile boolean f259J;

    /* renamed from: K  reason: collision with root package name */
    public boolean f260K;

    /* renamed from: L  reason: collision with root package name */
    public int f261L;

    /* renamed from: M  reason: collision with root package name */
    public int f262M;

    /* renamed from: N  reason: collision with root package name */
    public int f263N;

    /* renamed from: a  reason: collision with root package name */
    public final k f264a = new k();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f265b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final d f266c = new Object();
    public final j d;

    /* renamed from: e  reason: collision with root package name */
    public final C0009h f267e;

    /* renamed from: f  reason: collision with root package name */
    public final C0009h f268f = new C0009h(1);

    /* renamed from: p  reason: collision with root package name */
    public final m f269p = new Object();

    /* renamed from: q  reason: collision with root package name */
    public com.bumptech.glide.e f270q;

    /* renamed from: r  reason: collision with root package name */
    public C1130f f271r;

    /* renamed from: s  reason: collision with root package name */
    public f f272s;

    /* renamed from: t  reason: collision with root package name */
    public v f273t;

    /* renamed from: u  reason: collision with root package name */
    public int f274u;

    /* renamed from: v  reason: collision with root package name */
    public int f275v;

    /* renamed from: w  reason: collision with root package name */
    public p f276w;

    /* renamed from: x  reason: collision with root package name */
    public i f277x;

    /* renamed from: y  reason: collision with root package name */
    public u f278y;

    /* renamed from: z  reason: collision with root package name */
    public int f279z;

    /* JADX WARNING: type inference failed for: r0v2, types: [V0.d, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v4, types: [B0.m, java.lang.Object] */
    public n(j jVar, C0009h hVar) {
        this.d = jVar;
        this.f267e = hVar;
    }

    public final void A() {
        this.f253C = Thread.currentThread();
        int i2 = U0.i.f3686b;
        this.f251A = SystemClock.elapsedRealtimeNanos();
        boolean z3 = false;
        while (!this.f259J && this.f257H != null && !(z3 = this.f257H.b())) {
            this.f261L = v(this.f261L);
            this.f257H = t();
            if (this.f261L == 4) {
                z(2);
                return;
            }
        }
        if ((this.f261L == 6 || this.f259J) && !z3) {
            x();
        }
    }

    public final void B() {
        String str;
        int c3 = C0928e.c(this.f262M);
        if (c3 == 0) {
            this.f261L = v(1);
            this.f257H = t();
            A();
        } else if (c3 == 1) {
            A();
        } else if (c3 == 2) {
            n();
        } else {
            int i2 = this.f262M;
            if (i2 == 1) {
                str = "INITIALIZE";
            } else if (i2 == 2) {
                str = "SWITCH_TO_SOURCE_SERVICE";
            } else if (i2 != 3) {
                str = "null";
            } else {
                str = "DECODE_DATA";
            }
            throw new IllegalStateException("Unrecognized run reason: ".concat(str));
        }
    }

    public final void C() {
        Throwable th;
        this.f266c.a();
        if (this.f258I) {
            if (this.f265b.isEmpty()) {
                th = null;
            } else {
                ArrayList arrayList = this.f265b;
                th = (Throwable) arrayList.get(arrayList.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.f258I = true;
    }

    public final void a(C1130f fVar, Object obj, e eVar, int i2, C1130f fVar2) {
        this.f254D = fVar;
        this.F = obj;
        this.f256G = eVar;
        this.f263N = i2;
        this.f255E = fVar2;
        boolean z3 = false;
        if (fVar != this.f264a.a().get(0)) {
            z3 = true;
        }
        this.f260K = z3;
        if (Thread.currentThread() != this.f253C) {
            z(3);
        } else {
            n();
        }
    }

    public final int compareTo(Object obj) {
        n nVar = (n) obj;
        int ordinal = this.f272s.ordinal() - nVar.f272s.ordinal();
        if (ordinal == 0) {
            return this.f279z - nVar.f279z;
        }
        return ordinal;
    }

    public final void e(C1130f fVar, Exception exc, e eVar, int i2) {
        eVar.c();
        y yVar = new y("Fetching data failed", Collections.singletonList(exc));
        Class b6 = eVar.b();
        yVar.f335b = fVar;
        yVar.f336c = i2;
        yVar.d = b6;
        this.f265b.add(yVar);
        if (Thread.currentThread() != this.f253C) {
            z(2);
        } else {
            A();
        }
    }

    public final d j() {
        return this.f266c;
    }

    public final D k(e eVar, Object obj, int i2) {
        if (obj == null) {
            eVar.c();
            return null;
        }
        try {
            int i5 = U0.i.f3686b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            D m6 = m(i2, obj);
            if (Log.isLoggable("DecodeJob", 2)) {
                w(elapsedRealtimeNanos, "Decoded result " + m6, (String) null);
            }
            return m6;
        } finally {
            eVar.c();
        }
    }

    public final D m(int i2, Object obj) {
        boolean z3;
        Class<?> cls = obj.getClass();
        k kVar = this.f264a;
        B c3 = kVar.c(cls);
        i iVar = this.f277x;
        if (Build.VERSION.SDK_INT >= 26) {
            if (i2 == 4 || kVar.f244r) {
                z3 = true;
            } else {
                z3 = false;
            }
            h hVar = q.f1127i;
            Boolean bool = (Boolean) iVar.c(hVar);
            if (bool == null || (bool.booleanValue() && !z3)) {
                iVar = new i();
                i iVar2 = this.f277x;
                U0.d dVar = iVar.f12794b;
                dVar.g(iVar2.f12794b);
                dVar.put(hVar, Boolean.valueOf(z3));
            }
        }
        i iVar3 = iVar;
        g g = this.f270q.a().g(obj);
        try {
            return c3.a(this.f274u, this.f275v, new l((Object) this, i2, 0), g, iVar3);
        } finally {
            g.c();
        }
    }

    public final void n() {
        D d6;
        C0009h hVar;
        boolean a6;
        if (Log.isLoggable("DecodeJob", 2)) {
            w(this.f251A, "Retrieved data", "data: " + this.F + ", cache key: " + this.f254D + ", fetcher: " + this.f256G);
        }
        C c3 = null;
        try {
            d6 = k(this.f256G, this.F, this.f263N);
        } catch (y e6) {
            C1130f fVar = this.f255E;
            int i2 = this.f263N;
            e6.f335b = fVar;
            e6.f336c = i2;
            e6.d = null;
            this.f265b.add(e6);
            d6 = null;
        }
        if (d6 != null) {
            int i5 = this.f263N;
            boolean z3 = this.f260K;
            if (d6 instanceof z) {
                ((z) d6).a();
            }
            boolean z4 = false;
            if (((C) this.f268f.d) != null) {
                c3 = (C) C.f179e.j();
                c3.d = false;
                c3.f182c = true;
                c3.f181b = d6;
                d6 = c3;
            }
            C();
            u uVar = this.f278y;
            synchronized (uVar) {
                uVar.f315w = d6;
                uVar.f316x = i5;
                uVar.f302E = z3;
            }
            synchronized (uVar) {
                try {
                    uVar.f304b.a();
                    if (uVar.f301D) {
                        uVar.f315w.d();
                        uVar.f();
                    } else if (uVar.f303a.f297a.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    } else if (!uVar.f317y) {
                        s2.e eVar = uVar.f306e;
                        D d7 = uVar.f315w;
                        boolean z5 = uVar.f313u;
                        v vVar = uVar.f312t;
                        q qVar = uVar.f305c;
                        eVar.getClass();
                        uVar.f299B = new w(d7, z5, true, vVar, qVar);
                        uVar.f317y = true;
                        t tVar = uVar.f303a;
                        tVar.getClass();
                        ArrayList arrayList = new ArrayList(tVar.f297a);
                        uVar.d(arrayList.size() + 1);
                        v vVar2 = uVar.f312t;
                        w wVar = uVar.f299B;
                        uVar.f307f.d(uVar, vVar2, wVar);
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            s sVar = (s) it2.next();
                            sVar.f296b.execute(new r(uVar, sVar.f295a, 1));
                        }
                        uVar.c();
                    } else {
                        throw new IllegalStateException("Already have resource");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f261L = 5;
            try {
                hVar = this.f268f;
                if (((C) hVar.d) != null) {
                    z4 = true;
                }
                if (z4) {
                    j jVar = this.d;
                    i iVar = this.f277x;
                    hVar.getClass();
                    jVar.a().i((C1130f) hVar.f228b, new C0009h((Object) (l) hVar.f229c, (Object) (C) hVar.d, (Object) iVar, 0));
                    ((C) hVar.d).a();
                }
                if (c3 != null) {
                    c3.a();
                }
                m mVar = this.f269p;
                synchronized (mVar) {
                    mVar.f249b = true;
                    a6 = mVar.a();
                }
                if (a6) {
                    y();
                }
            } catch (Throwable th2) {
                if (c3 != null) {
                    c3.a();
                }
                throw th2;
            }
        } else {
            A();
        }
    }

    public final void run() {
        e eVar = this.f256G;
        try {
            if (this.f259J) {
                x();
                if (eVar != null) {
                    eVar.c();
                    return;
                }
                return;
            }
            B();
            if (eVar != null) {
                eVar.c();
            }
        } catch (C0006e e6) {
            throw e6;
        } catch (Throwable th) {
            if (eVar != null) {
                eVar.c();
            }
            throw th;
        }
    }

    public final j t() {
        int c3 = C0928e.c(this.f261L);
        k kVar = this.f264a;
        if (c3 == 1) {
            return new E(kVar, this);
        }
        if (c3 == 2) {
            return new C0007f(kVar.a(), kVar, this);
        }
        if (c3 == 3) {
            return new I(kVar, this);
        }
        if (c3 == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(C0552a.z(this.f261L)));
    }

    public final int v(int i2) {
        boolean z3;
        boolean z4;
        int c3 = C0928e.c(i2);
        if (c3 == 0) {
            switch (this.f276w.f286a) {
                case 0:
                case 1:
                    z3 = false;
                    break;
                default:
                    z3 = true;
                    break;
            }
            if (z3) {
                return 2;
            }
            return v(2);
        } else if (c3 == 1) {
            switch (this.f276w.f286a) {
                case 0:
                    z4 = false;
                    break;
                default:
                    z4 = true;
                    break;
            }
            if (z4) {
                return 3;
            }
            return v(3);
        } else if (c3 == 2) {
            return 4;
        } else {
            if (c3 == 3 || c3 == 5) {
                return 6;
            }
            throw new IllegalArgumentException("Unrecognized stage: ".concat(C0552a.z(i2)));
        }
    }

    public final void w(long j6, String str, String str2) {
        String str3;
        StringBuilder b6 = C0928e.b(str, " in ");
        b6.append(U0.i.a(j6));
        b6.append(", load key: ");
        b6.append(this.f273t);
        if (str2 != null) {
            str3 = ", ".concat(str2);
        } else {
            str3 = "";
        }
        b6.append(str3);
        b6.append(", thread: ");
        b6.append(Thread.currentThread().getName());
        Log.v("DecodeJob", b6.toString());
    }

    public final void x() {
        boolean a6;
        C();
        y yVar = new y("Failed to load resource", new ArrayList(this.f265b));
        u uVar = this.f278y;
        synchronized (uVar) {
            uVar.f318z = yVar;
        }
        synchronized (uVar) {
            try {
                uVar.f304b.a();
                if (uVar.f301D) {
                    uVar.f();
                } else if (uVar.f303a.f297a.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                } else if (!uVar.f298A) {
                    uVar.f298A = true;
                    v vVar = uVar.f312t;
                    t tVar = uVar.f303a;
                    tVar.getClass();
                    ArrayList arrayList = new ArrayList(tVar.f297a);
                    uVar.d(arrayList.size() + 1);
                    uVar.f307f.d(uVar, vVar, (w) null);
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        s sVar = (s) it2.next();
                        sVar.f296b.execute(new r(uVar, sVar.f295a, 0));
                    }
                    uVar.c();
                } else {
                    throw new IllegalStateException("Already failed once");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m mVar = this.f269p;
        synchronized (mVar) {
            mVar.f250c = true;
            a6 = mVar.a();
        }
        if (a6) {
            y();
        }
    }

    public final void y() {
        m mVar = this.f269p;
        synchronized (mVar) {
            mVar.f249b = false;
            mVar.f248a = false;
            mVar.f250c = false;
        }
        C0009h hVar = this.f268f;
        hVar.f228b = null;
        hVar.f229c = null;
        hVar.d = null;
        k kVar = this.f264a;
        kVar.f232c = null;
        kVar.d = null;
        kVar.f240n = null;
        kVar.g = null;
        kVar.f237k = null;
        kVar.f235i = null;
        kVar.f241o = null;
        kVar.f236j = null;
        kVar.f242p = null;
        kVar.f230a.clear();
        kVar.f238l = false;
        kVar.f231b.clear();
        kVar.f239m = false;
        this.f258I = false;
        this.f270q = null;
        this.f271r = null;
        this.f277x = null;
        this.f272s = null;
        this.f273t = null;
        this.f278y = null;
        this.f261L = 0;
        this.f257H = null;
        this.f253C = null;
        this.f254D = null;
        this.F = null;
        this.f263N = 0;
        this.f256G = null;
        this.f251A = 0;
        this.f259J = false;
        this.f265b.clear();
        this.f267e.D(this);
    }

    public final void z(int i2) {
        E0.e eVar;
        this.f262M = i2;
        u uVar = this.f278y;
        if (uVar.f314v) {
            eVar = uVar.f310r;
        } else {
            eVar = uVar.f309q;
        }
        eVar.execute(this);
    }
}
