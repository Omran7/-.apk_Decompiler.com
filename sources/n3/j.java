package n3;

import R2.b;
import c1.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import l3.C0791j;
import l3.l;
import l3.n;
import l3.o;
import m0.a0;
import s3.C0969g;

public final class j implements C0856A, x {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m f10286a;

    public /* synthetic */ j(m mVar) {
        this.f10286a = mVar;
    }

    public void a(String str) {
        boolean z3;
        m mVar = this.f10286a;
        mVar.f10304i.d("App check token changed, triggering app check token refresh", (Throwable) null, new Object[0]);
        o oVar = mVar.f10301c;
        oVar.f9726x.d("App check token refreshed.", (Throwable) null, new Object[0]);
        oVar.f9720r = str;
        if (!oVar.a()) {
            return;
        }
        if (str != null) {
            oVar.i(false);
            return;
        }
        b.g0(oVar.a(), "Must be connected to send unauth.", new Object[0]);
        if (oVar.f9720r == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        b.g0(z3, "App check token must not be set.", new Object[0]);
        oVar.m("unappcheck", false, Collections.emptyMap(), (C0791j) null);
    }

    public void b(C0969g gVar) {
        o oVar = this.f10286a.f10301c;
        ArrayList k6 = gVar.f11538a.k();
        HashMap b6 = gVar.f11539b.b();
        oVar.getClass();
        n nVar = new n(k6, b6);
        i iVar = oVar.f9726x;
        if (iVar.y()) {
            iVar.d("unlistening on " + nVar, (Throwable) null, new Object[0]);
        }
        l f6 = oVar.f(nVar);
        if (f6 != null && oVar.a()) {
            HashMap hashMap = new HashMap();
            n nVar2 = f6.f9694b;
            hashMap.put("p", b.u0(nVar2.f9699a));
            Long l6 = f6.d;
            if (l6 != null) {
                hashMap.put("q", nVar2.f9700b);
                hashMap.put("t", l6);
            }
            oVar.m("n", false, hashMap, (C0791j) null);
        }
        oVar.b();
    }

    public void c(C0969g gVar, z zVar, G g, G g5) {
        Long l6;
        o oVar = this.f10286a.f10301c;
        ArrayList k6 = gVar.f11538a.k();
        HashMap b6 = gVar.f11539b.b();
        if (zVar != null) {
            l6 = Long.valueOf(zVar.f10352a);
        } else {
            l6 = null;
        }
        a0 a0Var = new a0(this, g5, 5, false);
        oVar.getClass();
        n nVar = new n(k6, b6);
        i iVar = oVar.f9726x;
        if (iVar.y()) {
            iVar.d("Listening on " + nVar, (Throwable) null, new Object[0]);
        }
        HashMap hashMap = oVar.f9717o;
        b.g0(!hashMap.containsKey(nVar), "listen() called twice for same QuerySpec.", new Object[0]);
        if (iVar.y()) {
            iVar.d("Adding listen query: " + nVar, (Throwable) null, new Object[0]);
        }
        l lVar = new l(a0Var, nVar, l6, g);
        hashMap.put(nVar, lVar);
        if (oVar.a()) {
            oVar.k(lVar);
        }
        oVar.b();
    }
}
