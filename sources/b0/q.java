package B0;

import E0.e;
import H3.f;
import S3.z;
import U0.d;
import V0.c;
import android.os.SystemClock;
import android.util.Log;
import java.util.HashMap;
import java.util.LinkedHashMap;
import k.e1;
import q.C0928e;
import x1.i;
import z0.C1130f;
import z1.j;

public final class q {
    public static final boolean h = Log.isLoggable("Engine", 2);

    /* renamed from: a  reason: collision with root package name */
    public final A f287a;

    /* renamed from: b  reason: collision with root package name */
    public final f f288b;

    /* renamed from: c  reason: collision with root package name */
    public final D0.f f289c;
    public final e1 d;

    /* renamed from: e  reason: collision with root package name */
    public final H f290e;

    /* renamed from: f  reason: collision with root package name */
    public final A2.f f291f;
    public final z g;

    /* JADX WARNING: type inference failed for: r5v4, types: [java.lang.Object, k.e1] */
    public q(D0.f fVar, i iVar, e eVar, e eVar2, e eVar3, e eVar4) {
        this.f289c = fVar;
        j jVar = new j((Object) iVar);
        z zVar = new z(1);
        this.g = zVar;
        synchronized (this) {
            synchronized (zVar) {
                zVar.f2713e = this;
            }
        }
        this.f288b = new f(2);
        this.f287a = new A(0);
        ? obj = new Object();
        obj.f9295p = c.a(150, new U3.c((Object) obj, 4));
        obj.f9290a = eVar;
        obj.f9291b = eVar2;
        obj.f9292c = eVar3;
        obj.d = eVar4;
        obj.f9293e = this;
        obj.f9294f = this;
        this.d = obj;
        this.f291f = new A2.f(jVar);
        this.f290e = new H(0);
        fVar.d = this;
    }

    public static void c(String str, long j6, v vVar) {
        StringBuilder b6 = C0928e.b(str, " in ");
        b6.append(U0.i.a(j6));
        b6.append("ms, key: ");
        b6.append(vVar);
        Log.v("Engine", b6.toString());
    }

    public static void f(D d6) {
        if (d6 instanceof w) {
            ((w) d6).e();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    public final C0009h a(com.bumptech.glide.e eVar, Object obj, C1130f fVar, int i2, int i5, Class cls, Class cls2, com.bumptech.glide.f fVar2, p pVar, d dVar, boolean z3, boolean z4, z0.i iVar, boolean z5, boolean z6, Q0.f fVar3, T2.c cVar) {
        long j6;
        if (h) {
            int i6 = U0.i.f3686b;
            j6 = SystemClock.elapsedRealtimeNanos();
        } else {
            j6 = 0;
        }
        long j7 = j6;
        this.f288b.getClass();
        v vVar = new v(obj, fVar, i2, i5, dVar, cls, cls2, iVar);
        synchronized (this) {
            try {
                w b6 = b(vVar, z5, j7);
                if (b6 == null) {
                    C0009h g5 = g(eVar, obj, fVar, i2, i5, cls, cls2, fVar2, pVar, dVar, z3, z4, iVar, z5, z6, fVar3, cVar, vVar, j7);
                    return g5;
                }
                fVar3.l(b6, 5, false);
                return null;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final w b(v vVar, boolean z3, long j6) {
        w wVar;
        Object obj;
        w wVar2;
        if (!z3) {
            return null;
        }
        z zVar = this.g;
        synchronized (zVar) {
            C0005d dVar = (C0005d) ((HashMap) zVar.f2712c).get(vVar);
            if (dVar == null) {
                wVar = null;
            } else {
                wVar = (w) dVar.get();
                if (wVar == null) {
                    zVar.o(dVar);
                }
            }
        }
        if (wVar != null) {
            wVar.a();
        }
        if (wVar != null) {
            if (h) {
                c("Loaded resource from active resources", j6, vVar);
            }
            return wVar;
        }
        D0.f fVar = this.f289c;
        synchronized (fVar) {
            U0.j jVar = (U0.j) ((LinkedHashMap) fVar.f3691c).remove(vVar);
            if (jVar == null) {
                obj = null;
            } else {
                fVar.f3690b -= (long) jVar.f3688b;
                obj = jVar.f3687a;
            }
        }
        D d6 = (D) obj;
        if (d6 == null) {
            wVar2 = null;
        } else if (d6 instanceof w) {
            wVar2 = (w) d6;
        } else {
            wVar2 = new w(d6, true, true, vVar, this);
        }
        if (wVar2 != null) {
            wVar2.a();
            this.g.a(vVar, wVar2);
        }
        if (wVar2 == null) {
            return null;
        }
        if (h) {
            c("Loaded resource from cache", j6, vVar);
        }
        return wVar2;
    }

    public final synchronized void d(u uVar, v vVar, w wVar) {
        if (wVar != null) {
            try {
                if (wVar.f325a) {
                    this.g.a(vVar, wVar);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        A a6 = this.f287a;
        a6.getClass();
        uVar.getClass();
        HashMap hashMap = a6.f175a;
        if (uVar.equals(hashMap.get(vVar))) {
            hashMap.remove(vVar);
        }
    }

    public final void e(v vVar, w wVar) {
        z zVar = this.g;
        synchronized (zVar) {
            C0005d dVar = (C0005d) ((HashMap) zVar.f2712c).remove(vVar);
            if (dVar != null) {
                dVar.f215c = null;
                dVar.clear();
            }
        }
        if (wVar.f325a) {
            D d6 = (D) this.f289c.d(vVar, wVar);
        } else {
            this.f290e.d(wVar, false);
        }
    }

    public final C0009h g(com.bumptech.glide.e eVar, Object obj, C1130f fVar, int i2, int i5, Class cls, Class cls2, com.bumptech.glide.f fVar2, p pVar, d dVar, boolean z3, boolean z4, z0.i iVar, boolean z5, boolean z6, Q0.f fVar3, T2.c cVar, v vVar, long j6) {
        e eVar2;
        com.bumptech.glide.e eVar3 = eVar;
        Object obj2 = obj;
        C1130f fVar4 = fVar;
        int i6 = i2;
        int i7 = i5;
        com.bumptech.glide.f fVar5 = fVar2;
        p pVar2 = pVar;
        z0.i iVar2 = iVar;
        Q0.f fVar6 = fVar3;
        T2.c cVar2 = cVar;
        v vVar2 = vVar;
        long j7 = j6;
        u uVar = (u) this.f287a.f175a.get(vVar2);
        if (uVar != null) {
            uVar.a(fVar6, cVar2);
            if (h) {
                c("Added to existing load", j7, vVar2);
            }
            return new C0009h(this, fVar6, uVar);
        }
        u uVar2 = (u) ((C0009h) this.d.f9295p).j();
        synchronized (uVar2) {
            uVar2.f312t = vVar2;
            uVar2.f313u = z5;
            uVar2.f314v = z6;
        }
        A2.f fVar7 = this.f291f;
        n nVar = (n) ((C0009h) fVar7.d).j();
        int i8 = fVar7.f29b;
        fVar7.f29b = i8 + 1;
        k kVar = nVar.f264a;
        kVar.f232c = eVar3;
        kVar.d = obj2;
        kVar.f240n = fVar4;
        kVar.f233e = i6;
        kVar.f234f = i7;
        kVar.f242p = pVar2;
        kVar.g = cls;
        kVar.h = nVar.d;
        kVar.f237k = cls2;
        kVar.f241o = fVar5;
        kVar.f235i = iVar2;
        kVar.f236j = dVar;
        kVar.f243q = z3;
        kVar.f244r = z4;
        nVar.f270q = eVar3;
        nVar.f271r = fVar4;
        nVar.f272s = fVar5;
        nVar.f273t = vVar2;
        nVar.f274u = i6;
        nVar.f275v = i7;
        nVar.f276w = pVar2;
        nVar.f277x = iVar2;
        nVar.f278y = uVar2;
        nVar.f279z = i8;
        nVar.f262M = 1;
        nVar.f252B = obj2;
        A a6 = this.f287a;
        a6.getClass();
        a6.f175a.put(vVar2, uVar2);
        Q0.f fVar8 = fVar3;
        uVar2.a(fVar8, cVar2);
        synchronized (uVar2) {
            uVar2.f300C = nVar;
            int v6 = nVar.v(1);
            if (v6 != 2) {
                if (v6 != 3) {
                    eVar2 = uVar2.f314v ? uVar2.f310r : uVar2.f309q;
                    eVar2.execute(nVar);
                }
            }
            eVar2 = uVar2.f308p;
            eVar2.execute(nVar);
        }
        if (h) {
            c("Started new load", j6, vVar2);
        }
        return new C0009h(this, fVar8, uVar2);
    }
}
