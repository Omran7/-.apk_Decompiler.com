package androidx.lifecycle;

import B0.C0004c;
import T1.A;
import android.os.Looper;
import h0.C0552a;
import java.util.Map;
import l.C0777a;
import m.c;
import m.d;
import m.f;

public class y {

    /* renamed from: k  reason: collision with root package name */
    public static final Object f5286k = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f5287a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final f f5288b = new f();

    /* renamed from: c  reason: collision with root package name */
    public int f5289c = 0;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f5290e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f5291f;
    public int g;
    public boolean h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5292i;

    /* renamed from: j  reason: collision with root package name */
    public final C0004c f5293j;

    public y() {
        Object obj = f5286k;
        this.f5291f = obj;
        this.f5293j = new C0004c((Object) this, 19);
        this.f5290e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        C0777a.z0().f9659i.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(C0552a.o("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(x xVar) {
        if (xVar.f5284b) {
            if (!xVar.f()) {
                xVar.b(false);
                return;
            }
            int i2 = xVar.f5285c;
            int i5 = this.g;
            if (i2 < i5) {
                xVar.f5285c = i5;
                xVar.f5283a.g(this.f5290e);
            }
        }
    }

    public final void c(x xVar) {
        if (this.h) {
            this.f5292i = true;
            return;
        }
        this.h = true;
        do {
            this.f5292i = false;
            if (xVar == null) {
                f fVar = this.f5288b;
                fVar.getClass();
                d dVar = new d(fVar);
                fVar.f9840c.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((x) ((Map.Entry) dVar.next()).getValue());
                    if (this.f5292i) {
                        break;
                    }
                }
            } else {
                b(xVar);
                xVar = null;
            }
        } while (this.f5292i);
        this.h = false;
    }

    public final void d(C0307s sVar, z zVar) {
        Object obj;
        a("observe");
        if (sVar.h().f5278c != C0303n.f5268a) {
            LiveData$LifecycleBoundObserver liveData$LifecycleBoundObserver = new LiveData$LifecycleBoundObserver(this, sVar, zVar);
            f fVar = this.f5288b;
            c k6 = fVar.k(zVar);
            if (k6 != null) {
                obj = k6.f9833b;
            } else {
                c cVar = new c(zVar, liveData$LifecycleBoundObserver);
                fVar.d++;
                c cVar2 = fVar.f9839b;
                if (cVar2 == null) {
                    fVar.f9838a = cVar;
                    fVar.f9839b = cVar;
                } else {
                    cVar2.f9834c = cVar;
                    cVar.d = cVar2;
                    fVar.f9839b = cVar;
                }
                obj = null;
            }
            x xVar = (x) obj;
            if (xVar != null && !xVar.e(sVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (xVar == null) {
                sVar.h().a(liveData$LifecycleBoundObserver);
            }
        }
    }

    public final void e(A a6) {
        Object obj;
        a("observeForever");
        x xVar = new x(this, a6);
        f fVar = this.f5288b;
        c k6 = fVar.k(a6);
        if (k6 != null) {
            obj = k6.f9833b;
        } else {
            c cVar = new c(a6, xVar);
            fVar.d++;
            c cVar2 = fVar.f9839b;
            if (cVar2 == null) {
                fVar.f9838a = cVar;
                fVar.f9839b = cVar;
            } else {
                cVar2.f9834c = cVar;
                cVar.d = cVar2;
                fVar.f9839b = cVar;
            }
            obj = null;
        }
        x xVar2 = (x) obj;
        if (xVar2 instanceof LiveData$LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (xVar2 == null) {
            xVar.b(true);
        }
    }

    public void h(z zVar) {
        a("removeObserver");
        x xVar = (x) this.f5288b.t(zVar);
        if (xVar != null) {
            xVar.d();
            xVar.b(false);
        }
    }

    public void i(Object obj) {
        a("setValue");
        this.g++;
        this.f5290e = obj;
        c((x) null);
    }

    public void f() {
    }

    public void g() {
    }
}
