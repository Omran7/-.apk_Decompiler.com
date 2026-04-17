package j4;

import B0.A;
import K1.e;
import R2.b;
import Y4.C0246c;
import Y4.D;
import Y4.h;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.B;
import androidx.fragment.app.C0286s;
import b5.C0325a;
import b5.n;
import c.C0326a;
import c.C0327b;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.bumptech.glide.c;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.gms.internal.play_billing.zzco;
import com.google.android.gms.internal.play_billing.zze;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.K;
import com.mtma.criminal.city.utils.T;
import com.mtma.criminal.city.utils.o0;
import com.mtma.criminal.city.utils.v0;
import d5.C0472e;
import d5.C0473f;
import d5.C0475h;
import d5.j;
import d5.o;
import d5.u;
import i3.C0585a;
import i3.C0586b;
import i3.C0587c;
import i3.C0588d;
import i3.C0590f;
import i3.C0592h;
import i3.q;
import j.C0600C;
import j.i;
import j.k;
import j.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k.C0697Y;
import k.C0718j;
import k.C0724m;
import l4.C0794b;
import m0.C0804F;
import m0.C0805G;
import m0.e0;
import n3.C0861b;
import n3.C0866g;
import n3.x;
import n3.y;
import n4.f;
import q3.d;
import s3.C0964b;
import s3.C0969g;
import s3.C0970h;
import s4.C0973b;
import s4.C0974c;
import t3.C1007a;
import t3.C1008b;
import t4.C1009a;
import t4.C1011c;
import u4.C1033b;
import u4.g;
import v3.C1048c;
import v3.l;
import v3.m;
import v3.s;
import v4.C1052a;
import w4.C1087c;
import w4.C1088d;
import x4.C1101d;
import x4.C1102e;
import x4.C1105h;

public class p0 implements o0, T, com.mtma.criminal.city.utils.p0, v, C0697Y, i, C0585a, e0, q, d, C1008b, C0327b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9074a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f9075b;

    public /* synthetic */ p0(Object obj, int i2) {
        this.f9074a = i2;
        this.f9075b = obj;
    }

    public m A(m mVar, m mVar2, A a6) {
        boolean z3;
        s<v3.q> sVar;
        if (mVar2.f12298c == ((l) this.f9075b)) {
            z3 = true;
        } else {
            z3 = false;
        }
        q3.l.b("Can't use IndexedNode that doesn't have filter's index", z3);
        if (a6 != null) {
            Iterator it2 = mVar.f12296a.iterator();
            while (true) {
                boolean hasNext = it2.hasNext();
                sVar = mVar2.f12296a;
                if (!hasNext) {
                    break;
                }
                v3.q qVar = (v3.q) it2.next();
                if (!sVar.d(qVar.f12304a)) {
                    a6.a(new C0964b(1, m.t(qVar.f12305b), qVar.f12304a, (C1048c) null, (m) null));
                }
            }
            if (!sVar.h()) {
                for (v3.q qVar2 : sVar) {
                    C1048c cVar = qVar2.f12304a;
                    s sVar2 = mVar.f12296a;
                    boolean d = sVar2.d(cVar);
                    s sVar3 = qVar2.f12305b;
                    C1048c cVar2 = qVar2.f12304a;
                    if (d) {
                        s l6 = sVar2.l(cVar2);
                        if (!l6.equals(sVar3)) {
                            a6.a(new C0964b(4, m.t(sVar3), cVar2, (C1048c) null, m.t(l6)));
                        }
                    } else {
                        a6.a(new C0964b(2, m.t(sVar3), cVar2, (C1048c) null, (m) null));
                    }
                }
            }
        }
        return mVar2;
    }

    public void B(C0588d dVar) {
        switch (this.f9074a) {
            case 10:
            case 13:
            case 16:
            case 19:
            case 20:
            case 21:
            case 22:
            case 27:
                return;
            case 28:
                C1102e eVar = (C1102e) this.f9075b;
                c.s0(eVar.f12578d0, (String) null, (String) null);
                b.w(false);
                eVar.f12581g0.setEmptyView(eVar.f12580f0);
                return;
            default:
                return;
        }
    }

    public void L(boolean z3, boolean z4, C0475h hVar, C0475h hVar2) {
        C1087c cVar = (C1087c) this.f9075b;
        if (z3) {
            b.w(false);
            b.M0(R.raw.add_new_item);
            C1088d dVar = cVar.f12449f;
            dVar.f12474j0.setText(I1.b.x(o.getGymObject().getStrength()));
            dVar.f12475k0.setText(I1.b.x(o.getGymObject().getDefense()));
            dVar.f12476l0.setText(I1.b.x(o.getGymObject().getSpeed()));
            dVar.f12477m0.setText(I1.b.x(o.getGymObject().getDexterity()));
            if (dVar.f12456F0.getVisibility() == 0) {
                dVar.f12457G0.setVisibility(0);
                dVar.W();
            }
            dVar.f12478n0.setText("");
            dVar.f12479o0.setText("");
            dVar.f12480p0.setText("");
            dVar.f12481q0.setText("");
            dVar.f12482r0.setProgress(0);
            dVar.s0.setProgress(0);
            dVar.f12483t0.setProgress(0);
            dVar.f12484u0.setProgress(0);
            C1088d dVar2 = cVar.f12449f;
            dVar2.getClass();
            if (hVar.getStrength() < hVar2.getStrength()) {
                dVar2.X(1, hVar2.getStrength() - hVar.getStrength());
            }
            if (hVar.getDefense() < hVar2.getDefense()) {
                dVar2.X(2, hVar2.getDefense() - hVar.getDefense());
            }
            if (hVar.getSpeed() < hVar2.getSpeed()) {
                dVar2.X(3, hVar2.getSpeed() - hVar.getSpeed());
            }
            if (hVar.getDexterity() < hVar2.getDexterity()) {
                dVar2.X(4, hVar2.getDexterity() - hVar.getDexterity());
            }
            C1088d.V(dVar2);
            if (I1.b.p0()) {
                dVar2.f12458H0.setVisibility(0);
                dVar2.f12489z0.setImageResource(R.drawable.button_gray);
            }
            if (cVar.f12446b > 0) {
                for (C0286s sVar : dVar2.p().f5000c.v()) {
                    if (sVar instanceof l4.i) {
                        ((l4.i) sVar).Y();
                        return;
                    }
                }
                return;
            }
            return;
        }
        b.w(false);
        if (z4) {
            a.p(MyApplication.f7090a, R.string.gym_reach_maximum_statics, cVar.f12449f.f12468d0, (String) null);
        } else {
            a.p(MyApplication.f7090a, R.string.unknown_error_try_again, cVar.f12449f.f12468d0, (String) null);
        }
        C1088d.V(cVar.f12449f);
    }

    public void a(k kVar, boolean z3) {
        if (kVar instanceof C0600C) {
            ((C0600C) kVar).f8662I.k().c(false);
        }
        v vVar = ((C0718j) this.f9075b).f9326e;
        if (vVar != null) {
            vVar.a(kVar, z3);
        }
    }

    public m b(m mVar, s sVar) {
        if (mVar.f12296a.isEmpty()) {
            return mVar;
        }
        return new m(mVar.f12296a.b(sVar), mVar.f12298c, mVar.f12297b);
    }

    public void c(boolean z3) {
        switch (this.f9074a) {
            case 1:
                X4.d dVar = (X4.d) this.f9075b;
                if (z3) {
                    int i2 = ((D) dVar.f4209b).f4293a;
                    K k6 = new K(this, 26);
                    if (c.f5744o == -111) {
                        k6.i(-1, false);
                        return;
                    } else {
                        a.d(a.c(C0592h.b().e(), "players"), "stockObject", "timeBuyPackages").E(e.x(i2, 0)).H(new B0.l((Object) k6, i2, 13));
                        return;
                    }
                } else {
                    b.w(false);
                    c.y0(((Z) dVar.f4210c).f8965b);
                    return;
                }
            default:
                x0 x0Var = (x0) this.f9075b;
                if (z3) {
                    b.w(false);
                    b.M0(R.raw.money_get);
                    A0 a02 = x0Var.f9129c;
                    v0.e(a02.f8839a, a02.getContext().getString(R.string.toast_successfully));
                    return;
                }
                b.w(false);
                a.n(MyApplication.f7090a, R.string.unknown_error_try_again, x0Var.f9129c.f8839a, (String) null);
                return;
        }
    }

    public void d(int i2, boolean z3) {
        K k6 = (K) this.f9075b;
        if (z3) {
            ((Z) ((X4.d) ((p0) k6.f7360b).f9075b).f4210c).notifyDataSetChanged();
            b.w(false);
            a.l(MyApplication.f7090a, R.string.toast_successfully, ((Z) ((X4.d) ((p0) k6.f7360b).f9075b).f4210c).f8965b, R.raw.add_new_item);
            return;
        }
        b.w(false);
        if (android.support.v4.media.session.a.z().equals("count") && o.getStockObject().getStockFreeSpace() < 1) {
            a.n(MyApplication.f7090a, R.string.no_enough_space_in_stock, ((Z) ((X4.d) ((p0) k6.f7360b).f9075b).f4210c).f8965b, (String) null);
        } else if (!android.support.v4.media.session.a.z().equals("countInBag") || o.getStockObject().getBagFreeSpace() >= 1) {
            a.n(MyApplication.f7090a, R.string.unknown_error_try_again, ((Z) ((X4.d) ((p0) k6.f7360b).f9075b).f4210c).f8965b, (String) null);
        } else {
            a.n(MyApplication.f7090a, R.string.no_enough_space_in_bag, ((Z) ((X4.d) ((p0) k6.f7360b).f9075b).f4210c).f8965b, (String) null);
        }
    }

    public void e(Object obj) {
        Bundle bundle;
        C0326a aVar = (C0326a) obj;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f9075b;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f5561b;
        int i2 = zze.zzf(intent, "ProxyBillingActivityV2").f12358a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.F;
        if (resultReceiver != null) {
            if (intent == null) {
                bundle = null;
            } else {
                bundle = intent.getExtras();
            }
            resultReceiver.send(i2, bundle);
        }
        int i5 = aVar.f5560a;
        if (!(i5 == -1 && i2 == 0)) {
            zze.zzl("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i5 + " and billing's responseCode: " + i2);
        }
        proxyBillingActivityV2.finish();
    }

    public m g(m mVar, C1048c cVar, s sVar, C0866g gVar, C1007a aVar, A a6) {
        boolean z3;
        m mVar2 = mVar;
        C1048c cVar2 = cVar;
        A a7 = a6;
        if (mVar2.f12298c == ((l) this.f9075b)) {
            z3 = true;
        } else {
            z3 = false;
        }
        q3.l.b("The index must match the filter", z3);
        s sVar2 = mVar2.f12296a;
        s l6 = sVar2.l(cVar);
        if (l6.f(gVar).equals(sVar.f(gVar)) && l6.isEmpty() == sVar.isEmpty()) {
            return mVar2;
        }
        if (a7 != null) {
            if (sVar.isEmpty()) {
                if (sVar2.d(cVar)) {
                    a7.a(new C0964b(1, m.t(l6), cVar, (C1048c) null, (m) null));
                } else {
                    q3.l.b("A child remove without an old child only makes sense on a leaf node", sVar2.h());
                }
            } else if (l6.isEmpty()) {
                a7.a(new C0964b(2, m.t(sVar), cVar, (C1048c) null, (m) null));
            } else {
                a7.a(new C0964b(4, m.t(sVar), cVar, (C1048c) null, m.t(l6)));
            }
        }
        if (!sVar2.h() || !sVar.isEmpty()) {
            return mVar.v(cVar, sVar);
        }
        return mVar2;
    }

    public int h() {
        C0804F f6 = (C0804F) this.f9075b;
        return f6.f9860o - f6.D();
    }

    public void i(C0587c cVar) {
        switch (this.f9074a) {
            case zzaky.zzf.zzg:
            case 15:
                return;
            default:
                C1009a aVar = (C1009a) this.f9075b;
                int i2 = aVar.f11758m0 - 1;
                aVar.f11758m0 = i2;
                aVar.f11751f0.setText(aVar.s(R.string.number_of_estates, Integer.valueOf(i2)));
                b.c(aVar.f11751f0, 3);
                return;
        }
    }

    public void k(C0587c cVar) {
        p0 p0Var;
        p0 p0Var2;
        switch (this.f9074a) {
            case zzaky.zzf.zzg:
                C0794b bVar = (C0794b) this.f9075b;
                try {
                    String F = cVar.f8279b.F();
                    if (F == null) {
                        return;
                    }
                    if (bVar.f9762u0) {
                        bVar.s0 = F;
                        bVar.f9763v0 = true;
                        return;
                    } else if (bVar.f9761t0 && !bVar.s0.equals(F)) {
                        bVar.f9758p0.setVisibility(0);
                        bVar.s0 = F;
                        bVar.f9761t0 = false;
                        C0590f fVar = bVar.f9759q0;
                        if (fVar != null && (p0Var2 = bVar.f9760r0) != null) {
                            fVar.u(p0Var2);
                            return;
                        }
                        return;
                    } else if (bVar.f9763v0) {
                        bVar.f9758p0.setVisibility(0);
                        bVar.s0 = F;
                        C0590f fVar2 = bVar.f9759q0;
                        if (fVar2 != null && (p0Var = bVar.f9760r0) != null) {
                            fVar2.u(p0Var);
                            return;
                        }
                        return;
                    } else {
                        bVar.s0 = F;
                        bVar.f9763v0 = true;
                        return;
                    }
                } catch (Exception unused) {
                    return;
                }
            default:
                return;
        }
    }

    public int l(View view) {
        ((C0804F) this.f9075b).getClass();
        return (view.getTop() - ((C0805G) view.getLayoutParams()).f9862b.top) - ((C0805G) view.getLayoutParams()).topMargin;
    }

    public boolean m() {
        return false;
    }

    public l n() {
        return (l) this.f9075b;
    }

    public void o(int i2) {
        x0 x0Var = (x0) this.f9075b;
        int i5 = x0Var.f9127a;
        if (i2 < i5) {
            b.w(false);
            a.n(MyApplication.f7090a, R.string.no_enough_space_in_stock, x0Var.f9129c.f8839a, (String) null);
            return;
        }
        D d = x0Var.f9128b;
        android.support.v4.media.session.a.y0(d.f4293a, d.f4294b, d.f4298i, i5, false, new K(this, 28));
    }

    public boolean p(k kVar) {
        C0718j jVar = (C0718j) this.f9075b;
        if (kVar == jVar.f9325c) {
            return false;
        }
        ((C0600C) kVar).f8663J.getClass();
        jVar.getClass();
        v vVar = jVar.f9326e;
        if (vVar != null) {
            return vVar.p(kVar);
        }
        return false;
    }

    public void q(C0587c cVar) {
        Object obj = this.f9075b;
        switch (this.f9074a) {
            case zzaky.zzf.zzg:
                return;
            case 15:
                C0973b bVar = (C0973b) obj;
                try {
                    String F = cVar.f8279b.F();
                    Class<Integer> cls = Integer.class;
                    if (F.equals("lastOpenedCrimeExecutionNumber")) {
                        o.getCrimeObject().setLastOpenedCrimeExecutionNumber((double) ((Integer) cVar.f(cls)).intValue());
                    } else if (F.equals("lastOpenedCrimeType")) {
                        o.getCrimeObject().setLastOpenedCrimeType(((Integer) cVar.f(cls)).intValue());
                    } else if (F.equals("lastOpenedCrimeItem")) {
                        o.getCrimeObject().setLastOpenedCrimeItem(((Integer) cVar.f(cls)).intValue());
                    }
                    bVar.f11555j0.notifyDataSetChanged();
                    for (C0286s sVar : bVar.p().f5000c.v()) {
                        if (sVar instanceof C0974c) {
                            ((C0974c) sVar).V();
                            return;
                        }
                    }
                    return;
                } catch (Exception e6) {
                    a.q("Exception from try-catch block inside ", "b", " in addListenerToAppInfo method.", e6, "b");
                    return;
                }
            default:
                try {
                    Object f6 = cVar.f(C0473f.class);
                    C0590f fVar = cVar.f8279b;
                    h j6 = com.bumptech.glide.d.j((C0473f) f6);
                    j6.f4354a = fVar.F();
                    if (fVar.F().equals("--defaultEstate")) {
                        j6.f4362l = true;
                    }
                    ((C1009a) obj).f11755j0.b(j6);
                    return;
                } catch (Exception e7) {
                    a.q("Exception from try-catch block inside ", "a", " in addListenerToOwnEstates method.", e7, "a");
                    return;
                }
        }
    }

    public void r(k kVar) {
        Toolbar toolbar = (Toolbar) this.f9075b;
        C0718j jVar = toolbar.f4812a.f4768C;
        if (jVar == null || !jVar.f()) {
            Iterator it2 = ((CopyOnWriteArrayList) toolbar.f4804P.f229c).iterator();
            while (it2.hasNext()) {
                ((B) it2.next()).f4973a.s();
            }
        }
    }

    public boolean s(k kVar, MenuItem menuItem) {
        ((Toolbar) this.f9075b).getClass();
        return false;
    }

    public View t(int i2) {
        return ((C0804F) this.f9075b).u(i2);
    }

    public void u(C0587c cVar) {
        int i2;
        j jVar;
        D d;
        D d6;
        j jVar2;
        C0587c cVar2 = cVar;
        Class<j> cls = j.class;
        Class<u> cls2 = u.class;
        Object obj = this.f9075b;
        switch (this.f9074a) {
            case 10:
                C0586b c3 = cVar.c();
                while (true) {
                    Iterator it2 = c3.f8276a;
                    P4.i iVar = (P4.i) obj;
                    if (it2.hasNext()) {
                        v3.q qVar = (v3.q) it2.next();
                        c3.f8277b.f8279b.E(qVar.f12304a.f12280a);
                        C0325a aVar = (C0325a) r3.b.c(C0325a.class, m.t(qVar.f12305b).f12296a.getValue());
                        if (aVar != null) {
                            int activityId = aVar.getActivityId();
                            if (activityId == 0) {
                                i2 = R.string.activity_aid_al_fitre_name;
                            } else if (activityId == 1) {
                                i2 = R.string.activity_gold_bullion_chase_name;
                            } else if (activityId != 2) {
                                i2 = R.string.activities;
                            } else {
                                i2 = R.string.activity_aid_al_adha_name;
                            }
                            aVar.setNameResourceId(i2);
                            if (c.f5744o * 1000 >= aVar.getStartTimeInMilli() && c.f5744o * 1000 <= aVar.getEndTimeInMilli()) {
                                aVar.setState(0);
                            } else if (c.f5744o * 1000 < aVar.getStartTimeInMilli()) {
                                aVar.setState(1);
                            } else if (c.f5744o * 1000 > aVar.getEndTimeInMilli()) {
                                aVar.setState(2);
                            }
                            ((ArrayList) iVar.f2231k0).add(aVar);
                        }
                    } else {
                        ((ArrayList) iVar.f2231k0).sort(new H.b(3));
                        ((ListView) iVar.f2229i0).setAdapter(new C0612a((MainActivity) iVar.f2228h0, (ArrayList) iVar.f2231k0, 0));
                        ((ListView) iVar.f2229i0).setOnItemClickListener(new G4.a(this, 2));
                        ((ListView) iVar.f2229i0).setEmptyView(iVar.f2226f0);
                        b.w(false);
                        return;
                    }
                }
                break;
            case 13:
                if (cVar.b() && (jVar = (j) cVar2.f(cls)) != null) {
                    o.setLocationObject(jVar);
                    ((f) obj).W();
                    return;
                }
                return;
            case 16:
                C0472e eVar = (C0472e) cVar2.f(C0472e.class);
                if (eVar == null) {
                    eVar = new C0472e();
                }
                o.setCrimeObject(eVar);
                ((C0974c) obj).V();
                b.w(false);
                return;
            case 19:
                ArrayList Z5 = com.bumptech.glide.d.Z();
                C0586b c6 = cVar.c();
                while (true) {
                    Iterator it3 = c6.f8276a;
                    if (it3.hasNext()) {
                        v3.q qVar2 = (v3.q) it3.next();
                        ((C0246c) Z5.get(Integer.parseInt(c6.f8277b.f8279b.E(qVar2.f12304a.f12280a).F()))).d = (int) ((long) m.t(qVar2.f12305b).f12296a.i());
                    } else {
                        C1011c cVar3 = (C1011c) obj;
                        cVar3.f11767j0.setAdapter(new C0640p(cVar3.f11762e0, Z5, 1, 0, (byte) 0));
                        b.w(false);
                        return;
                    }
                }
            case 20:
                C1033b bVar = (C1033b) obj;
                if (cVar.g()) {
                    C0586b c7 = cVar.c();
                    boolean z3 = false;
                    while (true) {
                        Iterator it4 = c7.f8276a;
                        if (it4.hasNext()) {
                            v3.q qVar3 = (v3.q) it4.next();
                            c7.f8277b.f8279b.E(qVar3.f12304a.f12280a);
                            u uVar = (u) r3.b.c(cls2, m.t(qVar3.f12305b).f12296a.getValue());
                            if (uVar != null) {
                                if (!z3) {
                                    if (o.getLocationObject().getCurrentCity() == 0) {
                                        bVar.f11863o0 = uVar.getLocationObject().getSortByCityPlaceLevelLastSeen();
                                    } else {
                                        bVar.f11863o0 = uVar.getLocationObject().getSortByCityPlaceLastSeen();
                                    }
                                    z3 = true;
                                }
                                if (o.getLocationObject().getCurrentCity() == 0 && uVar.getMainStatesObject().getLevel() < o.getMainStatesObject().getLevel() - 5) {
                                    bVar.f11865q0 = true;
                                } else if (uVar.getLocationObject().getCurrentCity() != o.getLocationObject().getCurrentCity()) {
                                    bVar.f11865q0 = true;
                                } else if (!a.t(uVar.getAccountObject().getId())) {
                                    bVar.f11861m0.add(0, Y4.i.a(uVar));
                                }
                            }
                        } else {
                            bVar.f11862n0.notifyDataSetChanged();
                            bVar.f11855g0.setEmptyView(bVar.f11856h0);
                            if (cVar.d() == 15 && !bVar.f11865q0) {
                                bVar.f11864p0 = true;
                            }
                            b.w(false);
                            return;
                        }
                    }
                } else {
                    bVar.f11864p0 = false;
                    bVar.f11855g0.setEmptyView(bVar.f11856h0);
                    b.w(false);
                    return;
                }
                break;
            case 21:
                u uVar2 = (u) cVar2.f(cls2);
                g gVar = (g) obj;
                gVar.f11906e1 = uVar2;
                if (uVar2 != null) {
                    uVar2.getMainStatesObject().setHealthCurrent(com.bumptech.glide.d.h0(gVar.f11906e1.getMainStatesObject(), gVar.f11906e1.getGymObject(), gVar.f11906e1.getSkillsObject(), gVar.f11906e1.getArmingObject(), gVar.f11906e1.getSchoolObject()));
                    gVar.f11904d1 = gVar.f11906e1.getMainStatesObject().getHealthCurrent();
                    gVar.f11910h0.setText(gVar.f11906e1.getMainStatesObject().getNickName());
                    I1.b.v(gVar.f11914j0, gVar.f11906e1.getMainStatesObject().getProfilePicUrl());
                    if (b.k0(gVar.f11906e1.getMainStatesObject().getVipEndTime())) {
                        gVar.f11914j0.setBackgroundResource(R.drawable.profile_pic_frame_vip);
                    } else {
                        gVar.f11914j0.setBackgroundResource(R.drawable.profile_pic_frame_default);
                    }
                    if (gVar.f11906e1.getArmingObject().getGunId() == -1) {
                        gVar.f11918l0.setImageResource(R.drawable.stock_empty_frame);
                    } else {
                        if (gVar.f11906e1.getArmingObject().getGunLevel() > 0) {
                            d6 = D.v(gVar.f11906e1.getArmingObject().getGunId(), 1, gVar.f11906e1.getArmingObject().getGunLevel(), false);
                            gVar.f11920m0.setVisibility(0);
                            gVar.f11922n0.setText(String.valueOf(gVar.f11906e1.getArmingObject().getGunLevel()));
                        } else {
                            d6 = D.j(gVar.f11906e1.getArmingObject().getGunId(), 1, false);
                            gVar.f11920m0.setVisibility(8);
                        }
                        gVar.f11918l0.setImageResource(d6.d);
                        ConstraintLayout constraintLayout = gVar.f11924o0;
                        constraintLayout.setOnClickListener(new u4.d(this, constraintLayout, d6, 0));
                    }
                    if (gVar.f11906e1.getArmingObject().getArmorId() == -1) {
                        gVar.f11933t0.setImageResource(R.drawable.stock_empty_frame);
                    } else {
                        if (gVar.f11906e1.getArmingObject().getArmorLevel() > 0) {
                            d = D.v(gVar.f11906e1.getArmingObject().getArmorId(), 1, gVar.f11906e1.getArmingObject().getArmorLevel(), false);
                            gVar.f11935u0.setVisibility(0);
                            gVar.f11937v0.setText(String.valueOf(gVar.f11906e1.getArmingObject().getArmorLevel()));
                        } else {
                            d = D.b(gVar.f11906e1.getArmingObject().getArmorId(), 1, false);
                            gVar.f11935u0.setVisibility(8);
                        }
                        gVar.f11933t0.setImageResource(d.d);
                        ConstraintLayout constraintLayout2 = gVar.f11939w0;
                        constraintLayout2.setOnClickListener(new u4.d(this, constraintLayout2, d, 1));
                    }
                    if (gVar.f11906e1.getArmingObject().getSpecialEquipmentId() == -1) {
                        gVar.f11878B0.setImageResource(R.drawable.stock_empty_frame);
                    } else {
                        D s6 = D.s(gVar.f11906e1.getArmingObject().getSpecialEquipmentId(), 0, 1);
                        gVar.f11878B0.setImageResource(s6.d);
                        ImageView imageView = gVar.f11878B0;
                        imageView.setOnClickListener(new u4.d(this, imageView, s6, 2));
                    }
                    if (gVar.f11906e1.getArmingObject().getBioChemicalId() == -1) {
                        gVar.f11880D0.setImageResource(R.drawable.stock_empty_frame);
                    } else {
                        D s7 = D.s(gVar.f11906e1.getArmingObject().getBioChemicalId(), 0, 1);
                        gVar.f11880D0.setImageResource(s7.d);
                        ImageView imageView2 = gVar.f11880D0;
                        imageView2.setOnClickListener(new u4.d(this, imageView2, s7, 3));
                    }
                    gVar.g1 = gVar.f11906e1.getMainStatesObject().getHealthCurrent();
                    gVar.f11911h1 = com.bumptech.glide.d.q0(gVar.f11906e1.getMainStatesObject(), gVar.f11906e1.getGymObject(), gVar.f11906e1.getSkillsObject(), gVar.f11906e1.getArmingObject(), gVar.f11906e1.getSchoolObject());
                    long j6 = gVar.f11911h1;
                    long j7 = gVar.g1;
                    if (j6 < j7) {
                        gVar.f11911h1 = j7;
                    }
                    gVar.e0(j7, gVar.f11911h1, gVar.f11883G0);
                    gVar.f11901b1 = true;
                    g.W(gVar);
                    return;
                }
                return;
            case 22:
                C1052a aVar2 = (C1052a) obj;
                if (cVar.d() < 1) {
                    aVar2.f12328q0 = false;
                    aVar2.f12320i0.setEmptyView(aVar2.f12321j0);
                    b.w(false);
                    return;
                }
                aVar2.f12324m0.clear();
                ArrayList arrayList = aVar2.f12325n0;
                arrayList.clear();
                for (int i5 = 0; ((long) i5) < cVar.d(); i5++) {
                    aVar2.f12324m0.add((Object) null);
                }
                C0586b c8 = cVar.c();
                int i6 = 0;
                while (true) {
                    Iterator it5 = c8.f8276a;
                    if (it5.hasNext()) {
                        v3.q qVar4 = (v3.q) it5.next();
                        C0590f E6 = c8.f8277b.f8279b.E(qVar4.f12304a.f12280a);
                        try {
                            b5.m mVar = (b5.m) r3.b.c(b5.m.class, m.t(qVar4.f12305b).f12296a.getValue());
                            if (((long) i6) == cVar.d() - 1) {
                                aVar2.f12327p0 = E6.F();
                            }
                            Y4.k kVar = new Y4.k(mVar);
                            C0592h.b().e().E(b.Z()).E("players").E(kVar.f4376b).E("mainStatesObject").d(new A2.f((Object) this, (Object) kVar, i6, 20));
                        } catch (Exception e6) {
                            arrayList.add(Integer.valueOf(i6));
                            a.r("Exception from try-catch inside ", "a", " class in displayFirstItems method.", "a", e6);
                        }
                        i6++;
                    } else {
                        C1052a.V(aVar2);
                        if (cVar.d() < 15) {
                            aVar2.f12328q0 = false;
                            return;
                        } else {
                            aVar2.f12328q0 = true;
                            return;
                        }
                    }
                }
            case 27:
                C1101d dVar = (C1101d) obj;
                if (cVar.g()) {
                    C0586b c9 = cVar.c();
                    int i7 = 0;
                    while (true) {
                        Iterator it6 = c9.f8276a;
                        if (it6.hasNext()) {
                            v3.q qVar5 = (v3.q) it6.next();
                            c9.f8277b.f8279b.E(qVar5.f12304a.f12280a);
                            u uVar3 = (u) r3.b.c(cls2, m.t(qVar5.f12305b).f12296a.getValue());
                            if (uVar3 != null) {
                                if (((long) i7) == cVar.d() - 1) {
                                    dVar.f12571l0 = uVar3.getLocationObject().getSortByCityPlaceLastSeen();
                                }
                                i7++;
                                if (uVar3.getLocationObject().getSortByCityPlaceLastSeen().startsWith(com.bumptech.glide.d.r0())) {
                                    dVar.f12569j0.add(0, Y4.u.a(uVar3.getAccountObject().getId(), uVar3.getMainStatesObject(), uVar3.getLocationObject()));
                                }
                            }
                        }
                    }
                    dVar.f12570k0.notifyDataSetChanged();
                    if (dVar.f12569j0.size() == 15) {
                        dVar.f12572m0 = true;
                    }
                } else {
                    dVar.f12572m0 = false;
                }
                dVar.f12565f0.setEmptyView(dVar.f12566g0);
                b.w(false);
                return;
            case 28:
                C1102e eVar2 = (C1102e) obj;
                eVar2.f12587m0.clear();
                ArrayList arrayList2 = eVar2.f12588n0;
                arrayList2.clear();
                C0586b c10 = cVar.c();
                while (true) {
                    Iterator it7 = c10.f8276a;
                    boolean hasNext = it7.hasNext();
                    ArrayList arrayList3 = eVar2.f12587m0;
                    if (hasNext) {
                        v3.q qVar6 = (v3.q) it7.next();
                        C0590f E7 = c10.f8277b.f8279b.E(qVar6.f12304a.f12280a);
                        C0586b c11 = new C0587c(E7, m.t(qVar6.f12305b)).c();
                        while (true) {
                            Iterator it8 = c11.f8276a;
                            if (it8.hasNext()) {
                                v3.q qVar7 = (v3.q) it8.next();
                                c11.f8277b.f8279b.E(qVar7.f12304a.f12280a);
                                try {
                                    n nVar = (n) r3.b.c(n.class, m.t(qVar7.f12305b).f12296a.getValue());
                                    if (nVar != null) {
                                        if (o.getLocationObject().getCurrentCity() != 0) {
                                            nVar.setCount(nVar.getCountInBag());
                                        }
                                        if (nVar.getCount() > 0) {
                                            if (E7.F().equals(e.y(3))) {
                                                D l6 = D.l(nVar.getId(), nVar.getCount(), nVar.isLocked());
                                                l6.f4300k = true;
                                                arrayList3.add(l6);
                                            } else if (E7.F().equals(e.y(7)) && nVar.getId() == 2004) {
                                                D o6 = D.o(nVar.getId(), nVar.getCount(), nVar.isLocked());
                                                o6.f4300k = true;
                                                arrayList2.add(o6);
                                            }
                                        }
                                    }
                                } catch (Exception e7) {
                                    a.q("Exception from try-catch block inside ", "e", " in displayHospitalItems method.", e7, "e");
                                }
                            }
                        }
                    } else {
                        ArrayList arrayList4 = eVar2.f12586l0;
                        arrayList4.clear();
                        arrayList4.addAll(arrayList3);
                        arrayList4.addAll(arrayList2);
                        A0 a02 = new A0(eVar2.f12578d0, arrayList4);
                        eVar2.f12583i0 = a02;
                        eVar2.f12581g0.setAdapter(a02);
                        eVar2.f12580f0.setText(R.string.empty_stock_supplies_for_hospital);
                        eVar2.f12581g0.setEmptyView(eVar2.f12580f0);
                        b.w(false);
                        if (eVar2.f12585k0 == null) {
                            C0724m mVar2 = new C0724m(eVar2, 22);
                            eVar2.f12585k0 = mVar2;
                            eVar2.f12584j0.b(mVar2);
                            return;
                        }
                        return;
                    }
                }
            default:
                if (cVar.b() && (jVar2 = (j) cVar2.f(cls)) != null) {
                    o.setLocationObject(jVar2);
                    ((C1105h) obj).W();
                    return;
                }
                return;
        }
    }

    public int v() {
        return ((C0804F) this.f9075b).G();
    }

    public int x(View view) {
        ((C0804F) this.f9075b).getClass();
        return view.getBottom() + ((C0805G) view.getLayoutParams()).f9862b.bottom + ((C0805G) view.getLayoutParams()).bottomMargin;
    }

    public Object z(C0866g gVar, Object obj, Object obj2) {
        switch (this.f9074a) {
            case ModuleDescriptor.MODULE_VERSION:
                return ((C0861b) obj2).k(((C0866g) this.f9075b).t(gVar), (s) obj);
            default:
                n3.q qVar = (n3.q) obj;
                Void voidR = (Void) obj2;
                boolean isEmpty = gVar.isEmpty();
                y yVar = (y) this.f9075b;
                if (isEmpty || !qVar.f()) {
                    Iterator it2 = qVar.e().iterator();
                    while (it2.hasNext()) {
                        C0969g gVar2 = ((C0970h) it2.next()).f11540a;
                        x xVar = yVar.f10350e;
                        C0969g j6 = y.j(gVar2);
                        yVar.l(gVar2);
                        xVar.b(j6);
                    }
                    return null;
                }
                C0969g gVar3 = qVar.d().f11540a;
                x xVar2 = yVar.f10350e;
                C0969g j7 = y.j(gVar3);
                yVar.l(gVar3);
                xVar2.b(j7);
                return null;
        }
    }

    public /* synthetic */ p0(C0724m mVar) {
        this.f9074a = 23;
        this.f9075b = (zzco) mVar.f9345b;
    }

    public p0 j() {
        return this;
    }

    private final void C(C0588d dVar) {
    }

    private final void D(C0588d dVar) {
    }

    private final void E(C0588d dVar) {
    }

    private final void F(C0588d dVar) {
    }

    private final void G(C0588d dVar) {
    }

    private final void H(C0588d dVar) {
    }

    private final void I(C0588d dVar) {
    }

    private final void J(C0588d dVar) {
    }

    private final void K(C0588d dVar) {
    }

    private final void M(C0587c cVar) {
    }

    private final void N(C0587c cVar) {
    }

    private final void O(C0587c cVar) {
    }

    private final void P(C0587c cVar) {
    }

    private final void Q(C0587c cVar) {
    }

    public void f(int i2) {
    }

    public void w(int i2) {
    }

    public void y(int i2, float f6) {
    }
}
