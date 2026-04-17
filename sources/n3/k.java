package n3;

import R2.b;
import java.util.Collections;
import l3.C0791j;
import l3.o;
import s3.C0969g;

public final class k implements C0856A, x {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m f10287a;

    public /* synthetic */ k(m mVar) {
        this.f10287a = mVar;
    }

    public void a(String str) {
        boolean z3;
        m mVar = this.f10287a;
        mVar.f10304i.d("Auth token changed, triggering auth token refresh", (Throwable) null, new Object[0]);
        o oVar = mVar.f10301c;
        oVar.f9726x.d("Auth token refreshed.", (Throwable) null, new Object[0]);
        oVar.f9718p = str;
        if (!oVar.a()) {
            return;
        }
        if (str != null) {
            oVar.j(false);
            return;
        }
        b.g0(oVar.a(), "Must be connected to send unauth.", new Object[0]);
        if (oVar.f9718p == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        b.g0(z3, "Auth token must not be set.", new Object[0]);
        oVar.m("unauth", false, Collections.emptyMap(), (C0791j) null);
    }

    public void c(C0969g gVar, z zVar, G g, G g5) {
        this.f10287a.o(new i(this, gVar, g5));
    }

    public void b(C0969g gVar) {
    }
}
