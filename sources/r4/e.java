package R4;

import R2.b;
import Y4.D;
import b5.n;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import i3.C0585a;
import i3.C0586b;
import i3.C0587c;
import i3.C0588d;
import i3.C0590f;
import i3.q;
import java.util.ArrayList;
import java.util.Iterator;
import v3.m;

public final class e implements q, C0585a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f2550a;

    public /* synthetic */ e(g gVar) {
        this.f2550a = gVar;
    }

    public void B(C0588d dVar) {
        g gVar = this.f2550a;
        c.s0(gVar.f2565d0, (String) null, (String) null);
        b.w(false);
        gVar.f2569h0.setEmptyView(gVar.f2568g0);
    }

    public void i(C0587c cVar) {
        String F = cVar.f8279b.F();
        try {
            boolean equals = F.equals(K1.e.y(0));
            g gVar = this.f2550a;
            if (equals) {
                gVar.f2581u0.clear();
            } else if (F.equals(K1.e.y(1))) {
                gVar.f2582v0.clear();
            } else if (F.equals(K1.e.y(10))) {
                gVar.f2583w0.clear();
            } else if (F.equals(K1.e.y(11))) {
                gVar.f2584x0.clear();
            } else if (F.equals(K1.e.y(3))) {
                gVar.f2585y0.clear();
            } else if (F.equals(K1.e.y(9))) {
                gVar.f2586z0.clear();
            } else if (F.equals(K1.e.y(2))) {
                gVar.f2554A0.clear();
            } else if (F.equals(K1.e.y(8))) {
                gVar.f2555B0.clear();
            } else if (F.equals(K1.e.y(4))) {
                gVar.f2556C0.clear();
            } else if (F.equals(K1.e.y(5))) {
                gVar.f2557D0.clear();
            } else if (F.equals(K1.e.y(18))) {
                gVar.f2558E0.clear();
            } else if (F.equals(K1.e.y(12))) {
                gVar.f2559F0.clear();
            } else if (F.equals(K1.e.y(7))) {
                gVar.f2561H0.clear();
            } else if (F.equals(K1.e.y(13))) {
                gVar.f2560G0.clear();
            } else if (F.equals(K1.e.y(14))) {
                gVar.f2580t0.clear();
            } else if (F.equals(K1.e.y(15))) {
                gVar.f2562I0.clear();
            } else if (F.equals(K1.e.y(16))) {
                gVar.f2563J0.clear();
            } else if (F.equals(K1.e.y(17))) {
                gVar.f2564K0.clear();
            } else if (F.equals(K1.e.y(6))) {
                gVar.L0.clear();
            }
            gVar.Y();
        } catch (Exception e6) {
            a.r("Exception from try-catch inside ", "g", " class in onChildRemoved method in addListenerToStockItems method.", "g", e6);
        }
    }

    public void k(C0587c cVar) {
        String F = cVar.f8279b.F();
        try {
            boolean equals = F.equals(K1.e.y(0));
            g gVar = this.f2550a;
            if (equals) {
                g.W(gVar, cVar, gVar.f2581u0);
            } else if (F.equals(K1.e.y(1))) {
                g.W(gVar, cVar, gVar.f2582v0);
            } else if (F.equals(K1.e.y(10))) {
                g.W(gVar, cVar, gVar.f2583w0);
            } else if (F.equals(K1.e.y(11))) {
                g.W(gVar, cVar, gVar.f2584x0);
            } else if (F.equals(K1.e.y(3))) {
                g.W(gVar, cVar, gVar.f2585y0);
            } else if (F.equals(K1.e.y(9))) {
                g.W(gVar, cVar, gVar.f2586z0);
            } else if (F.equals(K1.e.y(2))) {
                g.W(gVar, cVar, gVar.f2554A0);
            } else if (F.equals(K1.e.y(8))) {
                g.W(gVar, cVar, gVar.f2555B0);
            } else if (F.equals(K1.e.y(4))) {
                g.W(gVar, cVar, gVar.f2556C0);
            } else if (F.equals(K1.e.y(5))) {
                g.W(gVar, cVar, gVar.f2557D0);
            } else if (F.equals(K1.e.y(18))) {
                g.W(gVar, cVar, gVar.f2558E0);
            } else if (F.equals(K1.e.y(12))) {
                g.W(gVar, cVar, gVar.f2559F0);
            } else if (F.equals(K1.e.y(7))) {
                g.W(gVar, cVar, gVar.f2561H0);
            } else if (F.equals(K1.e.y(14))) {
                g.W(gVar, cVar, gVar.f2580t0);
            } else if (F.equals(K1.e.y(13))) {
                g.W(gVar, cVar, gVar.f2560G0);
            } else if (F.equals(K1.e.y(15))) {
                g.W(gVar, cVar, gVar.f2562I0);
            } else if (F.equals(K1.e.y(16))) {
                g.W(gVar, cVar, gVar.f2563J0);
            } else if (F.equals(K1.e.y(17))) {
                g.W(gVar, cVar, gVar.f2564K0);
            } else if (F.equals(K1.e.y(6))) {
                g.W(gVar, cVar, gVar.L0);
            }
        } catch (Exception e6) {
            a.r("Exception from try-catch inside ", "g", " class in onChildAdded method in addListenerToStockItems method.", "g", e6);
        }
    }

    public void q(C0587c cVar) {
        String F = cVar.f8279b.F();
        try {
            boolean equals = F.equals(K1.e.y(0));
            g gVar = this.f2550a;
            if (equals) {
                g.X(gVar, cVar, gVar.f2581u0);
            } else if (F.equals(K1.e.y(1))) {
                g.X(gVar, cVar, gVar.f2582v0);
            } else if (F.equals(K1.e.y(10))) {
                g.X(gVar, cVar, gVar.f2583w0);
            } else if (F.equals(K1.e.y(11))) {
                g.X(gVar, cVar, gVar.f2584x0);
            } else if (F.equals(K1.e.y(3))) {
                g.X(gVar, cVar, gVar.f2585y0);
            } else if (F.equals(K1.e.y(9))) {
                g.X(gVar, cVar, gVar.f2586z0);
            } else if (F.equals(K1.e.y(2))) {
                g.X(gVar, cVar, gVar.f2554A0);
            } else if (F.equals(K1.e.y(8))) {
                g.X(gVar, cVar, gVar.f2555B0);
            } else if (F.equals(K1.e.y(4))) {
                g.X(gVar, cVar, gVar.f2556C0);
            } else if (F.equals(K1.e.y(5))) {
                g.X(gVar, cVar, gVar.f2557D0);
            } else if (F.equals(K1.e.y(18))) {
                g.X(gVar, cVar, gVar.f2558E0);
            } else if (F.equals(K1.e.y(12))) {
                g.X(gVar, cVar, gVar.f2559F0);
            } else if (F.equals(K1.e.y(7))) {
                g.X(gVar, cVar, gVar.f2561H0);
            } else if (F.equals(K1.e.y(14))) {
                g.X(gVar, cVar, gVar.f2580t0);
            } else if (F.equals(K1.e.y(13))) {
                g.X(gVar, cVar, gVar.f2560G0);
            } else if (F.equals(K1.e.y(15))) {
                g.X(gVar, cVar, gVar.f2562I0);
            } else if (F.equals(K1.e.y(16))) {
                g.X(gVar, cVar, gVar.f2563J0);
            } else if (F.equals(K1.e.y(17))) {
                g.X(gVar, cVar, gVar.f2564K0);
            } else if (F.equals(K1.e.y(6))) {
                g.X(gVar, cVar, gVar.L0);
            }
        } catch (Exception e6) {
            a.r("Exception from try-catch inside ", "g", " class in onChildChanged method in addListenerToStockItems method.", "g", e6);
        }
    }

    public void u(C0587c cVar) {
        g gVar;
        ArrayList arrayList = new ArrayList();
        C0586b c3 = cVar.c();
        while (true) {
            Iterator it2 = c3.f8276a;
            boolean hasNext = it2.hasNext();
            gVar = this.f2550a;
            if (!hasNext) {
                break;
            }
            v3.q qVar = (v3.q) it2.next();
            C0590f E6 = c3.f8277b.f8279b.E(qVar.f12304a.f12280a);
            C0586b c6 = new C0587c(E6, m.t(qVar.f12305b)).c();
            while (true) {
                Iterator it3 = c6.f8276a;
                if (it3.hasNext()) {
                    v3.q qVar2 = (v3.q) it3.next();
                    c6.f8277b.f8279b.E(qVar2.f12304a.f12280a);
                    try {
                        n nVar = (n) r3.b.c(n.class, m.t(qVar2.f12305b).f12296a.getValue());
                        if (nVar.isUsedInArming()) {
                            nVar.setCount(nVar.getCount() - 1);
                        }
                        if (nVar.getCount() > 0) {
                            if (E6.F().equals(K1.e.y(14))) {
                                D v6 = D.v(nVar.getId(), nVar.getCount(), nVar.getLevel(), nVar.isLocked());
                                v6.f4304o = nVar.isUsedInArming();
                                gVar.f2580t0.add(0, v6);
                            } else if (E6.F().equals(K1.e.y(0))) {
                                D j6 = D.j(nVar.getId(), nVar.getCount(), nVar.isLocked());
                                j6.f4304o = nVar.isUsedInArming();
                                gVar.f2581u0.add(0, j6);
                            } else if (E6.F().equals(K1.e.y(1))) {
                                D b6 = D.b(nVar.getId(), nVar.getCount(), nVar.isLocked());
                                b6.f4304o = nVar.isUsedInArming();
                                gVar.f2582v0.add(0, b6);
                            } else if (E6.F().equals(K1.e.y(10))) {
                                gVar.f2583w0.add(D.k(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else if (E6.F().equals(K1.e.y(11))) {
                                gVar.f2584x0.add(D.d(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else if (E6.F().equals(K1.e.y(3))) {
                                gVar.f2585y0.add(D.l(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else if (E6.F().equals(K1.e.y(9))) {
                                D q6 = D.q(nVar.getId(), nVar.getCount(), nVar.isLocked());
                                q6.f4297f = nVar.getCost();
                                gVar.f2586z0.add(q6);
                                arrayList.add(Integer.valueOf(nVar.getId()));
                            } else if (E6.F().equals(K1.e.y(2))) {
                                gVar.f2554A0.add(D.i(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else if (E6.F().equals(K1.e.y(8))) {
                                gVar.f2555B0.add(D.w(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else if (E6.F().equals(K1.e.y(4))) {
                                gVar.f2556C0.add(D.g(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else if (E6.F().equals(K1.e.y(5))) {
                                gVar.f2557D0.add(D.h(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else if (E6.F().equals(K1.e.y(18))) {
                                gVar.f2558E0.add(0, D.n(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else if (E6.F().equals(K1.e.y(12))) {
                                gVar.f2559F0.add(D.t(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else if (E6.F().equals(K1.e.y(7))) {
                                gVar.f2561H0.add(D.o(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else if (E6.F().equals(K1.e.y(13))) {
                                gVar.f2560G0.add(D.u(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else if (E6.F().equals(K1.e.y(15))) {
                                D p6 = D.p(nVar.getId(), nVar.getCount(), nVar.isLocked());
                                p6.f4304o = nVar.isUsedInArming();
                                gVar.f2562I0.add(0, p6);
                            } else if (E6.F().equals(K1.e.y(16))) {
                                D c7 = D.c(nVar.getId(), nVar.getCount(), nVar.isLocked());
                                c7.f4304o = nVar.isUsedInArming();
                                gVar.f2563J0.add(0, c7);
                            } else if (E6.F().equals(K1.e.y(17))) {
                                gVar.f2564K0.add(0, D.m(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else if (E6.F().equals(K1.e.y(6))) {
                                gVar.L0.add(D.e(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            }
                        }
                    } catch (Exception e6) {
                        a.q("Exception from try-catch block inside ", "g", " in displayStockItems method.", e6, "g");
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            g.V(gVar);
            return;
        }
        gVar.getClass();
        I1.b.e0(arrayList, new U3.c((Object) gVar, 25));
    }
}
