package G5;

import kotlin.jvm.internal.j;
import o5.a;
import o5.e;
import o5.f;
import o5.g;
import o5.h;
import o5.i;

public abstract class A extends a implements f {

    /* renamed from: b  reason: collision with root package name */
    public static final C0053z f854b = new C0053z(e.f10478a, C0052y.f960a);

    public A() {
        super(e.f10478a);
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [kotlin.jvm.internal.k, x5.l] */
    public final g get(h hVar) {
        g gVar;
        j.e(hVar, "key");
        if (hVar instanceof C0053z) {
            C0053z zVar = (C0053z) hVar;
            h hVar2 = this.f10472a;
            if ((hVar2 == zVar || zVar.f962b == hVar2) && (gVar = (g) zVar.f961a.invoke(this)) != null) {
                return gVar;
            }
            return null;
        } else if (e.f10478a == hVar) {
            return this;
        } else {
            return null;
        }
    }

    public abstract void j(i iVar, Runnable runnable);

    public boolean k() {
        return !(this instanceof G0);
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [kotlin.jvm.internal.k, x5.l] */
    public final i minusKey(h hVar) {
        j.e(hVar, "key");
        boolean z3 = hVar instanceof C0053z;
        o5.j jVar = o5.j.f10479a;
        if (z3) {
            C0053z zVar = (C0053z) hVar;
            h hVar2 = this.f10472a;
            if ((hVar2 == zVar || zVar.f962b == hVar2) && ((g) zVar.f961a.invoke(this)) != null) {
                return jVar;
            }
        } else if (e.f10478a == hVar) {
            return jVar;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + F.j(this);
    }
}
