package A4;

import U3.c;
import b5.b;
import b5.e;
import i3.C0586b;
import i3.C0587c;
import i3.C0588d;
import i3.C0592h;
import i3.q;
import java.util.Iterator;
import v3.m;

public final class f implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f75a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f76b;

    public /* synthetic */ f(j jVar, int i2) {
        this.f75a = i2;
        this.f76b = jVar;
    }

    public final void B(C0588d dVar) {
        switch (this.f75a) {
            case 0:
                j jVar = this.f76b;
                jVar.f93H0.set(0, Boolean.TRUE);
                j.V(jVar);
                return;
            default:
                j jVar2 = this.f76b;
                jVar2.f93H0.set(1, Boolean.TRUE);
                j.V(jVar2);
                return;
        }
    }

    public final void u(C0587c cVar) {
        switch (this.f75a) {
            case 0:
                j jVar = this.f76b;
                try {
                    if (cVar.g()) {
                        C0586b c3 = cVar.c();
                        Iterator it2 = c3.f8276a;
                        b bVar = null;
                        while (it2.hasNext()) {
                            v3.q qVar = (v3.q) it2.next();
                            c3.f8277b.f8279b.E(qVar.f12304a.f12280a);
                            bVar = (b) r3.b.c(b.class, m.t(qVar.f12305b).f12296a.getValue());
                        }
                        jVar.f96K0 = bVar.getContent();
                        C0592h.b().e().E(R2.b.Z()).E("players").E(bVar.getPlayerId()).E("mainStatesObject").E("nickName").d(new c((Object) this, 1));
                        return;
                    }
                    jVar.f93H0.set(0, Boolean.TRUE);
                    j.V(jVar);
                    return;
                } catch (Exception unused) {
                    jVar.f93H0.set(0, Boolean.TRUE);
                    j.V(jVar);
                    return;
                }
            default:
                j jVar2 = this.f76b;
                try {
                    if (cVar.g()) {
                        C0586b c6 = cVar.c();
                        Iterator it3 = c6.f8276a;
                        e eVar = null;
                        while (it3.hasNext()) {
                            v3.q qVar2 = (v3.q) it3.next();
                            c6.f8277b.f8279b.E(qVar2.f12304a.f12280a);
                            eVar = (e) r3.b.c(e.class, m.t(qVar2.f12305b).f12296a.getValue());
                        }
                        jVar2.f97M0 = eVar.getDescription();
                        jVar2.f98N0 = eVar.getCost();
                        C0592h.b().e().E(R2.b.Z()).E("players").E(eVar.getPlayerId()).d(new c((Object) this, 2));
                        return;
                    }
                    jVar2.f93H0.set(1, Boolean.TRUE);
                    j.V(jVar2);
                    return;
                } catch (Exception unused2) {
                    jVar2.f93H0.set(1, Boolean.TRUE);
                    j.V(jVar2);
                    return;
                }
        }
    }
}
