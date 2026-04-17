package U3;

import B0.C0009h;
import B0.u;
import F0.C0011a;
import F0.C0012b;
import F0.t;
import F0.y;
import F3.l;
import G3.b;
import I4.h;
import K.C0063c;
import K.C0066f;
import K1.e;
import K4.v;
import P2.i;
import R4.d;
import V0.a;
import Y4.B;
import Y4.D;
import Y4.r;
import android.content.ClipData;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.view.ContentInfo;
import android.widget.ListView;
import b5.f;
import b5.n;
import com.google.android.gms.common.api.internal.C0366u;
import com.google.android.gms.common.internal.C0392v;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.J;
import com.mtma.criminal.city.utils.Q;
import com.mtma.criminal.city.utils.v0;
import d5.j;
import d5.k;
import d5.o;
import i3.C0586b;
import i3.C0587c;
import i3.C0588d;
import i3.C0590f;
import i3.q;
import j4.A0;
import j4.C0614b;
import j4.C0626h;
import j4.C0641q;
import j4.M0;
import java.io.File;
import java.io.IOException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k.e1;
import n3.C0866g;
import u4.g;
import v3.m;
import v3.s;

public class c implements q, a, C0366u, t, C0011a, b, C0063c, J, i {

    /* renamed from: c  reason: collision with root package name */
    public static volatile c f3711c;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3712a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3713b;

    public /* synthetic */ c(Object obj, int i2) {
        this.f3712a = i2;
        this.f3713b = obj;
    }

    private final void r(C0587c cVar) {
        v vVar;
        C0586b c3 = cVar.c();
        while (true) {
            Iterator it2 = c3.f8276a;
            boolean hasNext = it2.hasNext();
            vVar = (v) this.f3713b;
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
                        if (nVar.getType() == 7) {
                            if (nVar.getId() >= 2026) {
                                if (nVar.getId() > 2029) {
                                }
                            }
                        }
                        int currentCity = o.getLocationObject().getCurrentCity();
                        try {
                            currentCity = ((Integer) cVar.a("locationObject").a("currentCity").f(Integer.class)).intValue();
                        } catch (Exception e6) {
                            Log.e("v", "Exception from try-catch block when get boolean value from Firebase (ignore it, default value added 0)." + e6);
                        }
                        if (currentCity != 0) {
                            nVar.setCount(nVar.getCountInBag());
                        } else if (nVar.isUsedInArming()) {
                            nVar.setCount(nVar.getCount() - 1);
                        }
                        if (nVar.getCount() > 0) {
                            if (E6.F().equals(e.y(14))) {
                                vVar.f1642u0.add(0, D.v(nVar.getId(), nVar.getCount(), nVar.getLevel(), nVar.isLocked()));
                            } else if (E6.F().equals(e.y(0))) {
                                vVar.f1643v0.add(0, D.j(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else if (E6.F().equals(e.y(1))) {
                                vVar.f1644w0.add(0, D.b(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else if (E6.F().equals(e.y(10))) {
                                vVar.f1645x0.add(D.k(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else if (E6.F().equals(e.y(11))) {
                                vVar.f1646y0.add(D.d(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else if (E6.F().equals(e.y(3))) {
                                vVar.f1647z0.add(D.l(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else if (E6.F().equals(e.y(9))) {
                                vVar.f1613A0.add(D.q(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else if (E6.F().equals(e.y(2))) {
                                vVar.f1614B0.add(D.i(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else if (E6.F().equals(e.y(8))) {
                                vVar.f1615C0.add(D.w(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else if (E6.F().equals(e.y(4))) {
                                vVar.f1616D0.add(D.g(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else if (E6.F().equals(e.y(5))) {
                                vVar.f1617E0.add(D.h(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else if (E6.F().equals(e.y(18))) {
                                vVar.f1618F0.add(0, D.n(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else if (E6.F().equals(e.y(12))) {
                                vVar.f1619G0.add(D.t(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else if (E6.F().equals(e.y(7))) {
                                vVar.f1621I0.add(D.o(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else if (E6.F().equals(e.y(13))) {
                                vVar.f1620H0.add(D.u(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else if (E6.F().equals(e.y(15))) {
                                vVar.f1622J0.add(0, D.p(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else if (E6.F().equals(e.y(16))) {
                                vVar.f1623K0.add(0, D.c(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else if (E6.F().equals(e.y(17))) {
                                vVar.L0.add(0, D.m(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else if (E6.F().equals(e.y(6))) {
                                vVar.f1624M0.add(D.e(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            }
                        }
                    } catch (Exception e7) {
                        com.google.android.gms.internal.measurement.a.q("Exception from try-catch block inside ", "v", " in displayStockItems method.", e7, "v");
                    }
                }
            }
        }
        M0 m02 = new M0(vVar.f1626d0, (List) vVar.f1641t0, vVar.f1627e0, vVar.f1628f0);
        vVar.f1638p0 = m02;
        vVar.f1631i0.setAdapter(m02);
        vVar.W();
        R2.b.w(false);
        vVar.f1631i0.setEmptyView(vVar.f1630h0);
        if (vVar.s0 == null) {
            x1.i iVar = new x1.i((Object) vVar, 22);
            vVar.s0 = iVar;
            vVar.f1640r0.b(iVar);
        }
    }

    private final void s(C0587c cVar) {
        boolean g = cVar.g();
        M4.e eVar = (M4.e) this.f3713b;
        if (g) {
            boolean equals = ((String) eVar.f1865k0).equals("players");
            Context context = eVar.f1859e0;
            String str = (String) eVar.f1867m0;
            String str2 = (String) eVar.f1866l0;
            if (equals) {
                ArrayList arrayList = new ArrayList();
                C0586b c3 = cVar.c();
                while (true) {
                    Iterator it2 = c3.f8276a;
                    if (!it2.hasNext()) {
                        break;
                    }
                    v3.q qVar = (v3.q) it2.next();
                    C0590f E6 = c3.f8277b.f8279b.E(qVar.f12304a.f12280a);
                    m t6 = m.t(qVar.f12305b);
                    E6.E("mainStatesObject");
                    C0866g gVar = new C0866g("mainStatesObject");
                    s sVar = t6.f12296a;
                    k kVar = (k) r3.b.c(k.class, m.t(sVar.f(gVar)).f12296a.getValue());
                    E6.E("locationObject");
                    j jVar = (j) r3.b.c(j.class, m.t(sVar.f(new C0866g("locationObject"))).f12296a.getValue());
                    String nickName = kVar.getNickName();
                    String profilePicUrl = kVar.getProfilePicUrl();
                    int gender = kVar.getGender();
                    int level = kVar.getLevel();
                    boolean k02 = R2.b.k0(kVar.getVipEndTime());
                    boolean l02 = R2.b.l0(kVar.getLastSeen());
                    int currentCity = jVar.getCurrentCity();
                    int currentPlace = jVar.getCurrentPlace();
                    if ((!str2.contains("nickName") || nickName.contains(str)) && (!str2.contains("id") || E6.F().contains(str))) {
                        arrayList.add(new B(E6.F(), nickName, profilePicUrl, k02, l02, gender, level, currentCity, currentPlace));
                    }
                }
                ((ListView) eVar.f1868n0).setAdapter(new C0614b(context, arrayList, 11));
            } else {
                ArrayList arrayList2 = new ArrayList();
                C0586b c6 = cVar.c();
                while (true) {
                    Iterator it3 = c6.f8276a;
                    if (!it3.hasNext()) {
                        break;
                    }
                    v3.q qVar2 = (v3.q) it3.next();
                    c6.f8277b.f8279b.E(qVar2.f12304a.f12280a);
                    f fVar = (f) r3.b.c(f.class, m.t(qVar2.f12305b).f12296a.getValue());
                    if ((!str2.contains("name") || fVar.getName().contains(str)) && (!str2.contains("id") || fVar.getId().contains(str))) {
                        arrayList2.add(0, fVar);
                    }
                }
                ((ListView) eVar.f1868n0).setAdapter(new C0626h(context, arrayList2, 1));
            }
        }
        ((ListView) eVar.f1868n0).setEmptyView(eVar.f1863i0);
        R2.b.w(false);
    }

    private final void t(C0587c cVar) {
        C0586b c3 = cVar.c();
        while (true) {
            Iterator it2 = c3.f8276a;
            boolean hasNext = it2.hasNext();
            d dVar = (d) this.f3713b;
            if (hasNext) {
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
                            if (nVar.isLocked()) {
                                dVar.s0.add(nVar);
                                dVar.f2542r0++;
                            }
                            if (nVar.getCount() > 0 || nVar.getCountInBag() > 0) {
                                if (E6.F().equals(e.y(14))) {
                                    D v6 = D.v(nVar.getId(), nVar.getCount(), nVar.getLevel(), nVar.isLocked());
                                    v6.f4304o = nVar.isUsedInArming();
                                    dVar.f2544u0.add(0, v6);
                                } else if (E6.F().equals(e.y(0))) {
                                    D j6 = D.j(nVar.getId(), nVar.getCount(), nVar.isLocked());
                                    j6.f4304o = nVar.isUsedInArming();
                                    dVar.f2545v0.add(0, j6);
                                } else if (E6.F().equals(e.y(1))) {
                                    D b6 = D.b(nVar.getId(), nVar.getCount(), nVar.isLocked());
                                    b6.f4304o = nVar.isUsedInArming();
                                    dVar.f2546w0.add(0, b6);
                                } else if (E6.F().equals(e.y(10))) {
                                    dVar.f2547x0.add(D.k(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                } else if (E6.F().equals(e.y(11))) {
                                    dVar.f2548y0.add(D.d(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                } else if (E6.F().equals(e.y(3))) {
                                    dVar.f2549z0.add(D.l(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                } else if (E6.F().equals(e.y(9))) {
                                    dVar.f2516A0.add(D.q(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                } else if (E6.F().equals(e.y(2))) {
                                    dVar.f2517B0.add(D.i(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                } else if (E6.F().equals(e.y(8))) {
                                    dVar.f2518C0.add(D.w(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                } else if (E6.F().equals(e.y(4))) {
                                    dVar.f2519D0.add(D.g(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                } else if (E6.F().equals(e.y(5))) {
                                    dVar.f2520E0.add(D.h(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                } else if (E6.F().equals(e.y(18))) {
                                    dVar.f2521F0.add(0, D.n(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                } else if (E6.F().equals(e.y(12))) {
                                    dVar.f2522G0.add(D.t(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                } else if (E6.F().equals(e.y(7))) {
                                    dVar.f2524I0.add(D.o(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                } else if (E6.F().equals(e.y(13))) {
                                    dVar.f2523H0.add(D.u(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                } else if (E6.F().equals(e.y(15))) {
                                    D p6 = D.p(nVar.getId(), nVar.getCount(), nVar.isLocked());
                                    p6.f4304o = nVar.isUsedInArming();
                                    dVar.f2525J0.add(0, p6);
                                } else if (E6.F().equals(e.y(16))) {
                                    D c7 = D.c(nVar.getId(), nVar.getCount(), nVar.isLocked());
                                    c7.f4304o = nVar.isUsedInArming();
                                    dVar.f2526K0.add(0, c7);
                                } else if (E6.F().equals(e.y(17))) {
                                    dVar.L0.add(0, D.m(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                } else if (E6.F().equals(e.y(6))) {
                                    dVar.f2527M0.add(D.e(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                }
                            }
                        } catch (Exception e6) {
                            com.google.android.gms.internal.measurement.a.q("Exception from try-catch block inside ", "d", " in displayStockItems method.", e6, "d");
                        }
                    }
                }
            } else {
                C0641q qVar3 = new C0641q(dVar.f2528d0, dVar.f2543t0, dVar.f2542r0, 2);
                dVar.f2539o0 = qVar3;
                dVar.f2532h0.setAdapter(qVar3);
                dVar.V();
                R2.b.w(false);
                dVar.f2532h0.setEmptyView(dVar.f2531g0);
                dVar.f2539o0.registerDataSetObserver(new R4.a(dVar, 0));
                return;
            }
        }
    }

    public void B(C0588d dVar) {
        switch (this.f3712a) {
            case 1:
                A4.f fVar = (A4.f) this.f3713b;
                fVar.f76b.f93H0.set(0, Boolean.TRUE);
                A4.j.V(fVar.f76b);
                return;
            case 2:
                A4.f fVar2 = (A4.f) this.f3713b;
                fVar2.f76b.f93H0.set(1, Boolean.TRUE);
                A4.j.V(fVar2.f76b);
                return;
            case 3:
                A4.j jVar = (A4.j) this.f3713b;
                jVar.f93H0.set(2, Boolean.TRUE);
                A4.j.V(jVar);
                return;
            case ModuleDescriptor.MODULE_VERSION /*11*/:
            case 12:
            case 13:
                return;
            case 14:
                I4.i iVar = (I4.i) this.f3713b;
                com.bumptech.glide.c.s0(iVar.f1234d0, (String) null, (String) null);
                R2.b.w(false);
                iVar.f1237g0.setEmptyView(iVar.f1236f0);
                return;
            case 17:
                v vVar = (v) this.f3713b;
                com.bumptech.glide.c.s0(vVar.f1626d0, (String) null, (String) null);
                R2.b.w(false);
                vVar.f1631i0.setEmptyView(vVar.f1630h0);
                return;
            case 19:
            case 21:
            case 22:
                return;
            case 24:
                d dVar2 = (d) this.f3713b;
                com.bumptech.glide.c.s0(dVar2.f2528d0, (String) null, (String) null);
                R2.b.w(false);
                dVar2.f2532h0.setEmptyView(dVar2.f2531g0);
                return;
            default:
                S4.f fVar3 = (S4.f) this.f3713b;
                com.bumptech.glide.c.s0(fVar3.f2768d0, (String) null, (String) null);
                R2.b.w(false);
                fVar3.f2772h0.setEmptyView(fVar3.f2771g0);
                return;
        }
    }

    public C0066f a() {
        return new C0066f(new x1.i(((ContentInfo.Builder) this.f3713b).build()));
    }

    public void accept(Object obj, Object obj2) {
        B1.a aVar = (B1.a) ((B1.d) obj).getService();
        Parcel zaa = aVar.zaa();
        zac.zac(zaa, (C0392v) this.f3713b);
        aVar.zad(1, zaa);
        ((TaskCompletionSource) obj2).setResult(null);
    }

    public Object b(String str) {
        return ((P2.k) this.f3713b).b(str, (Provider) null);
    }

    public void c(Bundle bundle) {
        ((ContentInfo.Builder) this.f3713b).setExtras(bundle);
    }

    public void d(Uri uri) {
        ((ContentInfo.Builder) this.f3713b).setLinkUri(uri);
    }

    public F0.s e(y yVar) {
        return new C0012b((AssetManager) this.f3713b, this, 0);
    }

    public void f(int i2) {
        ((ContentInfo.Builder) this.f3713b).setFlags(i2);
    }

    public L.j g(int i2) {
        return null;
    }

    public Object get() {
        return new l((F3.m) ((G3.c) this.f3713b).f840a);
    }

    public void h(boolean z3, k kVar) {
        B0.l lVar = (B0.l) this.f3713b;
        if (z3) {
            K4.k kVar2 = (K4.k) ((B0.l) lVar.f247c).f247c;
            K4.k.W(kVar2, new g(kVar2.f1553d0, kVar2.f1554e0));
            ((K4.k) ((B0.l) lVar.f247c).f247c).X0 = false;
            return;
        }
        R2.b.w(false);
        int powerCurrent = kVar.getPowerCurrent();
        B0.l lVar2 = (B0.l) lVar.f247c;
        int i2 = lVar2.f246b;
        K4.k kVar3 = (K4.k) lVar2.f247c;
        if (powerCurrent < i2) {
            com.bumptech.glide.c.p(kVar3.f1553d0, 2001);
        } else {
            com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.unknown_error_try_again, kVar3.f1553d0, (String) null);
        }
        ((K4.k) ((B0.l) lVar.f247c).f247c).X0 = false;
    }

    public L.j i(int i2) {
        return null;
    }

    public Object j() {
        e1 e1Var = (e1) this.f3713b;
        return new u((E0.e) e1Var.f9290a, (E0.e) e1Var.f9291b, (E0.e) e1Var.f9292c, (E0.e) e1Var.d, (B0.q) e1Var.f9293e, (B0.q) e1Var.f9294f, (C0009h) e1Var.f9295p);
    }

    public com.bumptech.glide.load.data.e l(AssetManager assetManager, String str) {
        return new com.bumptech.glide.load.data.j(assetManager, str, 1);
    }

    /* JADX WARNING: type inference failed for: r8v9, types: [Y4.r, java.lang.Object] */
    public void u(C0587c cVar) {
        j jVar;
        C0587c cVar2 = cVar;
        Class<j> cls = j.class;
        Class<String> cls2 = String.class;
        Class<n> cls3 = n.class;
        int i2 = 0;
        Object obj = this.f3713b;
        switch (this.f3712a) {
            case 1:
                A4.f fVar = (A4.f) obj;
                try {
                    A4.j jVar2 = fVar.f76b;
                    A4.j jVar3 = fVar.f76b;
                    jVar2.f95J0 = (String) cVar2.f(cls2);
                    jVar3.f93H0.set(0, Boolean.TRUE);
                    A4.j.V(jVar3);
                    return;
                } catch (Exception unused) {
                    fVar.f76b.f93H0.set(0, Boolean.TRUE);
                    A4.j.V(fVar.f76b);
                    return;
                }
            case 2:
                A4.f fVar2 = (A4.f) obj;
                try {
                    k kVar = (k) cVar2.a("mainStatesObject").f(k.class);
                    j jVar4 = (j) cVar2.a("locationObject").f(cls);
                    A4.j jVar5 = fVar2.f76b;
                    A4.j jVar6 = fVar2.f76b;
                    jVar5.L0 = kVar.getNickName();
                    jVar6.O0 = kVar.getProfilePicUrl();
                    jVar6.f99P0 = kVar.getLevel();
                    jVar6.f100Q0 = kVar.getGender();
                    jVar6.f101R0 = R2.b.k0(kVar.getVipEndTime());
                    jVar6.f102S0 = R2.b.l0(kVar.getLastSeen());
                    jVar6.f103T0 = jVar4.getCurrentCity();
                    jVar6.f104U0 = jVar4.getCurrentPlace();
                    jVar6.f93H0.set(1, Boolean.TRUE);
                    A4.j.V(jVar6);
                    return;
                } catch (Exception unused2) {
                    fVar2.f76b.f93H0.set(1, Boolean.TRUE);
                    A4.j.V(fVar2.f76b);
                    return;
                }
            case 3:
                A4.j jVar7 = (A4.j) obj;
                try {
                    if (cVar.g()) {
                        C0586b c3 = cVar.c();
                        Iterator it2 = c3.f8276a;
                        while (it2.hasNext()) {
                            v3.q qVar = (v3.q) it2.next();
                            c3.f8277b.f8279b.E(qVar.f12304a.f12280a);
                            jVar7.f105V0.add(0, (b5.c) r3.b.c(b5.c.class, m.t(qVar.f12305b).f12296a.getValue()));
                        }
                    }
                    jVar7.f93H0.set(2, Boolean.TRUE);
                    A4.j.V(jVar7);
                    return;
                } catch (Exception unused3) {
                    jVar7.f93H0.set(2, Boolean.TRUE);
                    A4.j.V(jVar7);
                    return;
                }
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                H4.j jVar8 = (H4.j) obj;
                if (cVar.g()) {
                    int size = jVar8.f1059j0.size();
                    C0586b c6 = cVar.c();
                    boolean z3 = false;
                    while (true) {
                        Iterator it3 = c6.f8276a;
                        if (it3.hasNext()) {
                            v3.q qVar2 = (v3.q) it3.next();
                            c6.f8277b.f8279b.E(qVar2.f12304a.f12280a);
                            b5.l lVar = (b5.l) r3.b.c(b5.l.class, m.t(qVar2.f12305b).f12296a.getValue());
                            if (!z3) {
                                jVar8.f1061l0 = ((Long) lVar.getLastMessageTimeInMilli()).longValue();
                                z3 = true;
                            }
                            jVar8.f1059j0.add(size, lVar);
                        } else {
                            jVar8.f1060k0.notifyDataSetChanged();
                            if (cVar.d() < 10) {
                                jVar8.f1062m0 = false;
                            }
                        }
                    }
                } else {
                    jVar8.f1062m0 = false;
                    v0.e(jVar8.f1053d0, MyApplication.f7090a.getApplicationContext().getString(R.string.no_more_items));
                    R2.b.M0(R.raw.error_loading);
                }
                R2.b.w(false);
                return;
            case 12:
                if (cVar.b() && (jVar = (j) cVar2.f(cls)) != null) {
                    o.setLocationObject(jVar);
                    ((I4.f) obj).W();
                    return;
                }
                return;
            case 13:
                h hVar = (h) obj;
                if (cVar.g()) {
                    C0586b c7 = cVar.c();
                    int i5 = 0;
                    while (true) {
                        Iterator it4 = c7.f8276a;
                        if (it4.hasNext()) {
                            v3.q qVar3 = (v3.q) it4.next();
                            c7.f8277b.f8279b.E(qVar3.f12304a.f12280a);
                            d5.u uVar = (d5.u) r3.b.c(d5.u.class, m.t(qVar3.f12305b).f12296a.getValue());
                            if (uVar != null) {
                                if (((long) i5) == cVar.d() - 1) {
                                    hVar.f1226l0 = uVar.getLocationObject().getSortByCityPlaceLastSeen();
                                }
                                i5++;
                                if (com.google.android.gms.internal.measurement.a.t(uVar.getAccountObject().getId())) {
                                    continue;
                                } else if (uVar.getLocationObject().getSortByCityPlaceLastSeen().startsWith(com.bumptech.glide.d.C0())) {
                                    hVar.f1224j0.add(0, Y4.u.a(uVar.getAccountObject().getId(), uVar.getMainStatesObject(), uVar.getLocationObject()));
                                }
                            }
                        }
                    }
                    hVar.f1225k0.notifyDataSetChanged();
                    if (hVar.f1224j0.size() == 15) {
                        hVar.f1227m0 = true;
                    }
                    hVar.f1231q0.postDelayed(hVar.f1232r0, 3000);
                } else {
                    hVar.f1227m0 = false;
                }
                hVar.f1221g0.setEmptyView(hVar.f1220f0);
                R2.b.w(false);
                return;
            case 14:
                I4.i iVar = (I4.i) obj;
                iVar.f1243m0.clear();
                C0586b c8 = cVar.c();
                while (true) {
                    Iterator it5 = c8.f8276a;
                    boolean hasNext = it5.hasNext();
                    ArrayList arrayList = iVar.f1243m0;
                    if (hasNext) {
                        v3.q qVar4 = (v3.q) it5.next();
                        C0587c cVar3 = new C0587c(c8.f8277b.f8279b.E(qVar4.f12304a.f12280a), m.t(qVar4.f12305b));
                        C0586b c9 = cVar3.c();
                        while (true) {
                            Iterator it6 = c9.f8276a;
                            if (it6.hasNext()) {
                                v3.q qVar5 = (v3.q) it6.next();
                                c9.f8277b.f8279b.E(qVar5.f12304a.f12280a);
                                try {
                                    n nVar = (n) r3.b.c(cls3, m.t(qVar5.f12305b).f12296a.getValue());
                                    if (nVar != null) {
                                        if (o.getLocationObject().getCurrentCity() != 0) {
                                            nVar.setCount(nVar.getCountInBag());
                                        }
                                        if (nVar.getCount() > 0) {
                                            try {
                                                if (cVar3.f8279b.F().equals(e.y(7)) && nVar.getId() == 2002) {
                                                    D o6 = D.o(nVar.getId(), nVar.getCount(), nVar.isLocked());
                                                    o6.f4300k = true;
                                                    arrayList.add(o6);
                                                }
                                            } catch (Exception e6) {
                                                e = e6;
                                                com.google.android.gms.internal.measurement.a.q("Exception from try-catch block inside ", "i", " in displayPrisonItems method.", e, "i");
                                            }
                                        }
                                    }
                                } catch (Exception e7) {
                                    e = e7;
                                    com.google.android.gms.internal.measurement.a.q("Exception from try-catch block inside ", "i", " in displayPrisonItems method.", e, "i");
                                }
                            }
                        }
                    } else {
                        ArrayList arrayList2 = iVar.f1242l0;
                        arrayList2.clear();
                        arrayList2.addAll(arrayList);
                        A0 a02 = new A0(iVar.f1234d0, arrayList2);
                        iVar.f1239i0 = a02;
                        iVar.f1237g0.setAdapter(a02);
                        iVar.f1236f0.setText(R.string.empty_stock_supplies_for_prison);
                        iVar.f1237g0.setEmptyView(iVar.f1236f0);
                        R2.b.w(false);
                        if (iVar.f1241k0 == null) {
                            x1.i iVar2 = new x1.i((Object) iVar, 17);
                            iVar.f1241k0 = iVar2;
                            iVar.f1240j0.b(iVar2);
                            return;
                        }
                        return;
                    }
                }
            case 17:
                r(cVar);
                return;
            case 19:
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                C0586b c10 = cVar.c();
                int i6 = 0;
                while (true) {
                    Iterator it7 = c10.f8276a;
                    if (it7.hasNext()) {
                        v3.q qVar6 = (v3.q) it7.next();
                        c10.f8277b.f8279b.E(qVar6.f12304a.f12280a);
                        b5.i iVar3 = (b5.i) r3.b.c(b5.i.class, m.t(qVar6.f12305b).f12296a.getValue());
                        if (iVar3 != null) {
                            if (arrayList3.contains(Integer.valueOf(iVar3.getId()))) {
                                int indexOf = arrayList3.indexOf(Integer.valueOf(iVar3.getId()));
                                i6 -= ((r) arrayList4.get(indexOf)).f4418b;
                                arrayList4.remove(indexOf);
                            }
                            int id = iVar3.getId();
                            int level = iVar3.getLevel();
                            ? obj2 = new Object();
                            obj2.f4417a = id;
                            obj2.f4418b = level;
                            obj2.d = ((Integer) Q.f7375a.get(id)).intValue();
                            obj2.f4420e = ((Integer) Q.f7376b.get(id)).intValue();
                            obj2.f4419c = ((Integer) ((ArrayList) Q.f7377c.get(id)).get(level - 1)).intValue();
                            obj2.f4421f = Q.d(id, level);
                            arrayList4.add(0, obj2);
                            i6 += obj2.f4418b;
                            arrayList3.add(0, Integer.valueOf(iVar3.getId()));
                        }
                    } else {
                        N4.a aVar = (N4.a) obj;
                        aVar.f1915f0.setText(aVar.s(R.string.total_medals_number, Integer.valueOf(i6)));
                        ((ListView) aVar.f1919j0).setAdapter(new C0614b((Context) aVar.f1918i0, arrayList4, 7));
                        ((ListView) aVar.f1919j0).setEmptyView(aVar.f1916g0);
                        R2.b.w(false);
                        return;
                    }
                }
            case 21:
                P4.j jVar9 = (P4.j) obj;
                if (cVar.d() < 1) {
                    jVar9.f2241m0 = false;
                    jVar9.f2235g0.setText(R.string.empty_invited_players);
                    jVar9.f2234f0.setEmptyView(jVar9.f2235g0);
                    R2.b.w(false);
                    return;
                }
                C0586b c11 = cVar.c();
                while (true) {
                    Iterator it8 = c11.f8276a;
                    if (it8.hasNext()) {
                        v3.q qVar7 = (v3.q) it8.next();
                        C0590f E6 = c11.f8277b.f8279b.E(qVar7.f12304a.f12280a);
                        m t6 = m.t(qVar7.f12305b);
                        if (i2 == 0) {
                            jVar9.f2239k0 = E6.F();
                        }
                        jVar9.f2245q0.E((String) r3.b.c(cls2, t6.f12296a.getValue())).d(new K4.u((Object) this, cVar.d(), 1));
                        i2++;
                    } else {
                        return;
                    }
                }
            case 22:
                s(cVar);
                return;
            case 24:
                t(cVar);
                return;
            default:
                C0586b c12 = cVar.c();
                while (true) {
                    Iterator it9 = c12.f8276a;
                    S4.f fVar3 = (S4.f) obj;
                    if (it9.hasNext()) {
                        v3.q qVar8 = (v3.q) it9.next();
                        C0590f E7 = c12.f8277b.f8279b.E(qVar8.f12304a.f12280a);
                        C0586b c13 = new C0587c(E7, m.t(qVar8.f12305b)).c();
                        while (true) {
                            Iterator it10 = c13.f8276a;
                            if (it10.hasNext()) {
                                v3.q qVar9 = (v3.q) it10.next();
                                c13.f8277b.f8279b.E(qVar9.f12304a.f12280a);
                                try {
                                    n nVar2 = (n) r3.b.c(cls3, m.t(qVar9.f12305b).f12296a.getValue());
                                    if (nVar2.isUsedInArming()) {
                                        nVar2.setCount(nVar2.getCount() - 1);
                                    }
                                    if (nVar2.getCount() > 0) {
                                        if (E7.F().equals(e.y(14))) {
                                            fVar3.s0.add(0, D.v(nVar2.getId(), nVar2.getCount(), nVar2.getLevel(), nVar2.isLocked()));
                                        } else if (E7.F().equals(e.y(0))) {
                                            fVar3.f2783t0.add(0, D.j(nVar2.getId(), nVar2.getCount(), nVar2.isLocked()));
                                        } else if (E7.F().equals(e.y(1))) {
                                            fVar3.f2784u0.add(0, D.b(nVar2.getId(), nVar2.getCount(), nVar2.isLocked()));
                                        } else if (E7.F().equals(e.y(10))) {
                                            fVar3.f2785v0.add(D.k(nVar2.getId(), nVar2.getCount(), nVar2.isLocked()));
                                        } else if (E7.F().equals(e.y(11))) {
                                            fVar3.f2786w0.add(D.d(nVar2.getId(), nVar2.getCount(), nVar2.isLocked()));
                                        } else if (E7.F().equals(e.y(3))) {
                                            fVar3.f2787x0.add(D.l(nVar2.getId(), nVar2.getCount(), nVar2.isLocked()));
                                        } else if (E7.F().equals(e.y(9))) {
                                            fVar3.f2788y0.add(D.q(nVar2.getId(), nVar2.getCount(), nVar2.isLocked()));
                                        } else if (E7.F().equals(e.y(2))) {
                                            fVar3.f2789z0.add(D.i(nVar2.getId(), nVar2.getCount(), nVar2.isLocked()));
                                        } else if (E7.F().equals(e.y(8))) {
                                            fVar3.f2757A0.add(D.w(nVar2.getId(), nVar2.getCount(), nVar2.isLocked()));
                                        } else if (E7.F().equals(e.y(4))) {
                                            fVar3.f2758B0.add(D.g(nVar2.getId(), nVar2.getCount(), nVar2.isLocked()));
                                        } else if (E7.F().equals(e.y(5))) {
                                            fVar3.f2759C0.add(D.h(nVar2.getId(), nVar2.getCount(), nVar2.isLocked()));
                                        } else if (E7.F().equals(e.y(18))) {
                                            fVar3.f2760D0.add(0, D.n(nVar2.getId(), nVar2.getCount(), nVar2.isLocked()));
                                        } else if (E7.F().equals(e.y(12))) {
                                            fVar3.f2761E0.add(D.t(nVar2.getId(), nVar2.getCount(), nVar2.isLocked()));
                                        } else if (E7.F().equals(e.y(7))) {
                                            fVar3.f2763G0.add(D.o(nVar2.getId(), nVar2.getCount(), nVar2.isLocked()));
                                        } else if (E7.F().equals(e.y(13))) {
                                            fVar3.f2762F0.add(D.u(nVar2.getId(), nVar2.getCount(), nVar2.isLocked()));
                                        } else if (E7.F().equals(e.y(15))) {
                                            fVar3.f2764H0.add(0, D.p(nVar2.getId(), nVar2.getCount(), nVar2.isLocked()));
                                        } else if (E7.F().equals(e.y(16))) {
                                            fVar3.f2765I0.add(0, D.c(nVar2.getId(), nVar2.getCount(), nVar2.isLocked()));
                                        } else if (E7.F().equals(e.y(17))) {
                                            fVar3.f2766J0.add(0, D.m(nVar2.getId(), nVar2.getCount(), nVar2.isLocked()));
                                        } else if (E7.F().equals(e.y(6))) {
                                            fVar3.f2767K0.add(D.e(nVar2.getId(), nVar2.getCount(), nVar2.isLocked()));
                                        }
                                    }
                                } catch (Exception e8) {
                                    com.google.android.gms.internal.measurement.a.q("Exception from try-catch block inside ", "f", " in displayStockItems method.", e8, "f");
                                }
                            }
                        }
                    } else {
                        fVar3.f2781q0 = 4;
                        ArrayList arrayList5 = fVar3.f2782r0;
                        M0 m02 = new M0(fVar3.f2768d0, arrayList5, fVar3.f2781q0);
                        fVar3.f2779o0 = m02;
                        fVar3.f2772h0.setAdapter(m02);
                        arrayList5.clear();
                        arrayList5.addAll(fVar3.s0);
                        arrayList5.addAll(fVar3.f2783t0);
                        arrayList5.addAll(fVar3.f2784u0);
                        arrayList5.addAll(fVar3.f2764H0);
                        arrayList5.addAll(fVar3.f2765I0);
                        arrayList5.addAll(fVar3.f2785v0);
                        arrayList5.addAll(fVar3.f2786w0);
                        arrayList5.addAll(fVar3.f2787x0);
                        arrayList5.addAll(fVar3.f2788y0);
                        arrayList5.addAll(fVar3.f2789z0);
                        arrayList5.addAll(fVar3.f2757A0);
                        arrayList5.addAll(fVar3.f2758B0);
                        arrayList5.addAll(fVar3.f2759C0);
                        arrayList5.addAll(fVar3.f2760D0);
                        arrayList5.addAll(fVar3.f2761E0);
                        arrayList5.addAll(fVar3.f2762F0);
                        arrayList5.addAll(fVar3.f2763G0);
                        arrayList5.addAll(fVar3.f2766J0);
                        arrayList5.addAll(fVar3.f2767K0);
                        fVar3.f2779o0.notifyDataSetChanged();
                        R2.b.w(false);
                        fVar3.f2772h0.setEmptyView(fVar3.f2771g0);
                        return;
                    }
                }
        }
    }

    public void v(Z4.m mVar) {
        switch (this.f3712a) {
            case 25:
                int i2 = 0;
                while (true) {
                    R4.g gVar = (R4.g) this.f3713b;
                    if (i2 < gVar.f2586z0.size()) {
                        ArrayList arrayList = gVar.f2586z0;
                        String x6 = e.x(((D) arrayList.get(i2)).f4293a, 0);
                        if (mVar.materialsIdsList.contains(x6)) {
                            ((D) arrayList.get(i2)).g = mVar.materialsCostsList.get(mVar.materialsIdsList.indexOf(x6)).longValue();
                        } else {
                            ((D) arrayList.get(i2)).g = (long) (((double) ((D) arrayList.get(i2)).f4297f) * 0.6d);
                        }
                        i2++;
                    } else {
                        R4.g.V(gVar);
                        return;
                    }
                }
            default:
                int i5 = 0;
                while (true) {
                    S4.d dVar = (S4.d) this.f3713b;
                    if (i5 < dVar.f2753y0.size()) {
                        ArrayList arrayList2 = dVar.f2753y0;
                        String x7 = e.x(((D) arrayList2.get(i5)).f4293a, 0);
                        if (mVar.materialsIdsList.contains(x7)) {
                            ((D) arrayList2.get(i5)).g = mVar.materialsCostsList.get(mVar.materialsIdsList.indexOf(x7)).longValue();
                        } else {
                            ((D) arrayList2.get(i5)).g = (long) (((double) ((D) arrayList2.get(i5)).f4297f) * 0.6d);
                        }
                        i5++;
                    } else {
                        S4.d.V(dVar);
                        return;
                    }
                }
        }
    }

    public boolean w(int i2, int i5, Bundle bundle) {
        return false;
    }

    public c(int i2) {
        this.f3712a = i2;
        switch (i2) {
            case 9:
                this.f3713b = new U0.k(500);
                return;
            case 18:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f3713b = new L.k(this);
                    return;
                } else {
                    this.f3713b = new L.k(this);
                    return;
                }
            default:
                this.f3713b = new HashSet();
                return;
        }
    }

    public c(Context context) {
        boolean isEmpty;
        this.f3712a = 27;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f3713b = sharedPreferences;
        File file = new File(A.h.getNoBackupFilesDir(context), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    synchronized (this) {
                        isEmpty = sharedPreferences.getAll().isEmpty();
                    }
                    if (!isEmpty) {
                        Log.i("FirebaseMessaging", "App restored, clearing state");
                        synchronized (this) {
                            sharedPreferences.edit().clear().commit();
                        }
                    }
                }
            } catch (IOException e6) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e6.getMessage());
                }
            }
        }
    }

    public c(ClipData clipData, int i2) {
        this.f3712a = 15;
        this.f3713b = G1.h.g(clipData, i2);
    }

    private final void k(C0588d dVar) {
    }

    private final void m(C0588d dVar) {
    }

    private final void n(C0588d dVar) {
    }

    private final void o(C0588d dVar) {
    }

    private final void p(C0588d dVar) {
    }

    private final void q(C0588d dVar) {
    }
}
