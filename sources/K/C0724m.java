package k;

import A2.f;
import B4.d;
import K.C0076p;
import K.O;
import K.t0;
import R2.b;
import Y4.C0246c;
import Y4.D;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.B;
import androidx.profileinstaller.ProfileInstallReceiver;
import b5.h;
import b5.k;
import b5.n;
import c.C0326a;
import c.C0327b;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.bumptech.glide.c;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.S;
import com.mtma.criminal.city.utils.T;
import com.mtma.criminal.city.utils.U;
import com.mtma.criminal.city.utils.o0;
import com.mtma.criminal.city.utils.u0;
import com.mtma.criminal.city.utils.v0;
import d5.C0473f;
import d5.j;
import d5.m;
import d5.o;
import d5.u;
import i3.C0585a;
import i3.C0586b;
import i3.C0587c;
import i3.C0588d;
import i3.C0590f;
import i3.C0592h;
import i3.q;
import j.i;
import j4.C0626h;
import j4.C0640p;
import j4.G;
import j4.p0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k0.C0754c;
import m0.C0804F;
import m0.C0805G;
import m0.a0;
import m0.e0;
import m4.C0840b;
import m4.C0841c;
import n3.C0866g;
import p4.C0918a;
import p4.C0921d;
import p4.C0923f;
import q4.e;
import t4.C1009a;
import t4.C1011c;
import u4.C1033b;
import u4.g;
import v3.s;
import v4.C1052a;
import x.C1092d;
import x4.C1101d;
import x4.C1102e;
import x4.C1105h;
import y4.C1114a;
import y4.C1117d;
import y4.C1118e;

/* renamed from: k.m  reason: case insensitive filesystem */
public final class C0724m implements i, C0726n, C0754c, e0, q, S, C0327b, C0076p, C0585a, T, u0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9344a;

    /* renamed from: b  reason: collision with root package name */
    public Object f9345b;

    public /* synthetic */ C0724m(int i2) {
        this.f9344a = i2;
    }

    public void B(C0588d dVar) {
        int i2 = this.f9344a;
    }

    public void E(Z4.q qVar) {
        boolean z3 = qVar.isAllProcessSuccess;
        C0737s0 s0Var = (C0737s0) this.f9345b;
        if (z3) {
            b.w(false);
            b.M0(R.raw.add_new_item);
            if (qVar.isGotFirstPurchaseGifts) {
                v0.f(((e) ((a0) s0Var.f9372b).f9926c).f11109d0, U.e(), new a0(this, qVar, 10, false));
            } else if (qVar.type.equals("gold")) {
                c.s0(((e) ((a0) s0Var.f9372b).f9926c).f11109d0, MyApplication.f7090a.getApplicationContext().getString(R.string.purchase_gold_successfully, new Object[]{U.a(qVar.value)}), (String) null);
            } else {
                c.s0(((e) ((a0) s0Var.f9372b).f9926c).f11109d0, MyApplication.f7090a.getApplicationContext().getString(R.string.purchase_cash_successfully, new Object[]{U.a(qVar.value)}), (String) null);
            }
            if (qVar.type.equals("gold")) {
                c.k0(o.getAccountObject().getId(), new k(21, qVar.value));
            } else {
                c.k0(o.getAccountObject().getId(), new k(22, qVar.value));
            }
        } else {
            b.w(false);
            a.n(MyApplication.f7090a, R.string.purchase_failed, ((e) ((a0) s0Var.f9372b).f9926c).f11109d0, (String) null);
        }
    }

    public void F(ArrayList arrayList) {
        b.w(false);
        C0918a aVar = (C0918a) this.f9345b;
        if (arrayList != null) {
            ((ListView) aVar.f10998h0).setAdapter(new C0626h(aVar.f10995e0, arrayList, 3));
            return;
        }
        a.n(MyApplication.f7090a, R.string.unknown_error_try_again, aVar.f10995e0, (String) null);
    }

    public void a() {
        C1117d dVar = (C1117d) this.f9345b;
        C1118e.V(dVar.f12720b);
        dVar.f12720b.f12733n0.notifyDataSetChanged();
        C1118e eVar = dVar.f12720b;
        eVar.f12729j0.setSelection(eVar.f12741w0.size() - 1);
    }

    public K.v0 b(View view, K.v0 v0Var) {
        boolean z3;
        boolean z4;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f9345b;
        if (!Objects.equals(coordinatorLayout.f4871w, v0Var)) {
            coordinatorLayout.f4871w = v0Var;
            if (v0Var.d() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            coordinatorLayout.f4872x = z3;
            if (z3 || coordinatorLayout.getBackground() != null) {
                z4 = false;
            } else {
                z4 = true;
            }
            coordinatorLayout.setWillNotDraw(z4);
            t0 t0Var = v0Var.f1432a;
            if (!t0Var.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = coordinatorLayout.getChildAt(i2);
                    WeakHashMap weakHashMap = O.f1352a;
                    if (childAt.getFitsSystemWindows() && ((C1092d) childAt.getLayoutParams()).f12491a != null && t0Var.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return v0Var;
    }

    public void c(boolean z3) {
        f fVar = (f) this.f9345b;
        if (z3) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < ((ArrayList) fVar.f30c).size(); i2++) {
                int intValue = ((Integer) ((ArrayList) fVar.f30c).get(i2)).intValue();
                C1118e eVar = (C1118e) fVar.d;
                int longValue = (int) ((Long) eVar.f12738t0.get(intValue)).longValue();
                if (longValue == -10 || longValue == -50) {
                    U.g(o.getAccountObject().getId(), "cash", ((long) Math.abs(longValue)) * 1000000, (T) null);
                } else if (longValue == -600) {
                    U.g(o.getAccountObject().getId(), "gold", (long) Math.abs(longValue), (T) null);
                } else if (arrayList.contains(Integer.valueOf(longValue))) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(longValue));
                    arrayList2.set(indexOf, Integer.valueOf(((Integer) arrayList2.get(indexOf)).intValue() + 1));
                } else {
                    arrayList.add(Integer.valueOf(longValue));
                    arrayList2.add(1);
                }
                h hVar = new h(o.getAccountObject().getId(), o.getMainStatesObject().getNickName(), (String) eVar.f12740v0.get(intValue));
                C0592h.d().e().E(b.a0()).E("luckyWheel").E("winners").E(c.f5744o + C0592h.d().e().E(b.a0()).E("luckyWheel").E("winners").G().F()).I(hVar).addOnSuccessListener(new C1114a(this, hVar, i2));
            }
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                int intValue2 = ((Integer) arrayList.get(i5)).intValue();
                android.support.v4.media.session.a.B0(intValue2, D.s(intValue2, 0, 1).f4294b, 0, ((Integer) arrayList2.get(i5)).intValue(), (o0) null, o.getAccountObject().getId(), "count", false);
            }
            return;
        }
        b.w(false);
        c.y0(((C1118e) fVar.d).f12723d0);
    }

    public void d(int i2, Serializable serializable) {
        String str;
        switch (i2) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case zzaky.zzf.zzf:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case zzaky.zzf.zzg:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case ModuleDescriptor.MODULE_VERSION:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
            default:
                str = "";
                break;
        }
        if (i2 == 6 || i2 == 7 || i2 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f9345b).setResultCode(i2);
    }

    public void e(Object obj) {
        Bundle bundle;
        C0326a aVar = (C0326a) obj;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f9345b;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f5561b;
        int i2 = zze.zzf(intent, "ProxyBillingActivityV2").f12358a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.f5720E;
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
            zze.zzl("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i5 + " and billing's responseCode: " + i2);
        }
        proxyBillingActivityV2.finish();
    }

    public void g(boolean z3, m mVar) {
        o4.e eVar = (o4.e) this.f9345b;
        if (z3) {
            eVar.f10459j0.setText(U.a(mVar.getCash()));
            eVar.f10460k0.setText(U.a(mVar.getBankCash()));
            eVar.f10468t0.setProgress(0);
            eVar.f10464o0.setText(R.string.zero);
            eVar.f10467r0.setText("");
            eVar.f10467r0.clearFocus();
            b.w(false);
            v0.e(eVar.f10453d0, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_successfully));
            b.M0(R.raw.money_pay);
            return;
        }
        b.w(false);
        a.p(MyApplication.f7090a, R.string.not_has_enough_cash_to_transaction, eVar.f10453d0, (String) null);
    }

    public int h() {
        C0804F f6 = (C0804F) this.f9345b;
        return f6.f9859n - f6.F();
    }

    public void i(C0587c cVar) {
        String F = cVar.f8279b.F();
        try {
            boolean equals = F.equals(K1.e.y(3));
            C1102e eVar = (C1102e) this.f9345b;
            if (equals) {
                eVar.f12587m0.clear();
            } else if (F.equals(K1.e.y(7))) {
                eVar.f12588n0.clear();
            }
            ArrayList arrayList = eVar.f12586l0;
            arrayList.clear();
            arrayList.addAll(eVar.f12587m0);
            arrayList.addAll(eVar.f12588n0);
            eVar.f12583i0.notifyDataSetChanged();
        } catch (Exception e6) {
            a.r("Exception from try-catch inside ", "e", " class in addListenerToStockItems method.", "e", e6);
        }
    }

    public int l(View view) {
        ((C0804F) this.f9345b).getClass();
        return (view.getLeft() - ((C0805G) view.getLayoutParams()).f9862b.left) - ((C0805G) view.getLayoutParams()).leftMargin;
    }

    public void m() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    public void q(C0587c cVar) {
        String F = cVar.f8279b.F();
        try {
            boolean equals = F.equals(K1.e.y(3));
            C1102e eVar = (C1102e) this.f9345b;
            if (equals) {
                C1102e.V(eVar, cVar, eVar.f12587m0);
            } else if (F.equals(K1.e.y(7))) {
                C1102e.V(eVar, cVar, eVar.f12588n0);
            }
            ArrayList arrayList = eVar.f12586l0;
            arrayList.clear();
            arrayList.addAll(eVar.f12587m0);
            arrayList.addAll(eVar.f12588n0);
            eVar.f12583i0.notifyDataSetChanged();
        } catch (Exception e6) {
            a.r("Exception from try-catch inside ", "e", " class in addListenerToStockItems method.", "e", e6);
        }
    }

    public void r(j.k kVar) {
        p0 p0Var = ((ActionMenuView) this.f9345b).f4769D;
        if (p0Var != null) {
            p0Var.r(kVar);
        }
    }

    public boolean s(j.k kVar, MenuItem menuItem) {
        C0726n nVar = ((ActionMenuView) this.f9345b).f4773I;
        if (nVar != null) {
            Iterator it2 = ((CopyOnWriteArrayList) ((Toolbar) ((C0724m) nVar).f9345b).f4804P.f229c).iterator();
            while (it2.hasNext()) {
                if (((B) it2.next()).f4973a.o()) {
                    return true;
                }
            }
        }
        return false;
    }

    public View t(int i2) {
        return ((C0804F) this.f9345b).u(i2);
    }

    public void u(C0587c cVar) {
        j jVar;
        boolean z3;
        D d;
        D d6;
        j jVar2;
        C0587c cVar2 = cVar;
        Class<Long> cls = Long.class;
        Class<j> cls2 = j.class;
        Class<u> cls3 = u.class;
        long j6 = 1;
        switch (this.f9344a) {
            case 5:
                boolean b6 = cVar.b();
                C0840b bVar = (C0840b) this.f9345b;
                if (b6) {
                    long longValue = ((Long) cVar2.a("lastUpdatedTimeInMilli").f(cls)).longValue();
                    if (longValue >= bVar.f10168f0 && longValue < bVar.f10169g0) {
                        j6 = ((Long) cVar2.a("goldBullion").f(cls)).longValue();
                    }
                }
                bVar.f10175m0.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.activity_gold_bullion_player_has, new Object[]{Long.valueOf(j6)}));
                b.w(false);
                return;
            case zzaky.zzf.zzf:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (cVar.g()) {
                    C0586b c3 = cVar.c();
                    while (true) {
                        Iterator it2 = c3.f8276a;
                        if (it2.hasNext()) {
                            v3.q qVar = (v3.q) it2.next();
                            C0590f E6 = c3.f8277b.f8279b.E(qVar.f12304a.f12280a);
                            v3.m t6 = v3.m.t(qVar.f12305b);
                            C0590f E7 = E6.E("goldBullion");
                            C0866g gVar = new C0866g("goldBullion");
                            s sVar = t6.f12296a;
                            if (((Long) new C0587c(E7, v3.m.t(sVar.f(gVar))).f(cls)).longValue() > 1) {
                                arrayList.add(E6.F());
                                arrayList2.add((Long) new C0587c(E6.E("goldBullion"), v3.m.t(sVar.f(new C0866g("goldBullion")))).f(cls));
                            }
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        a.c(C0592h.b().e(), "players").E((String) arrayList.get(i2)).E("mainStatesObject").d(new E4.a(taskCompletionSource, 10));
                        arrayList3.add(taskCompletionSource.getTask());
                    }
                    Tasks.whenAllComplete((Collection<? extends Task<?>>) arrayList3).addOnCompleteListener(new d((Object) this, (Object) arrayList, (Object) arrayList2, 8));
                    return;
                }
                C0841c cVar3 = (C0841c) this.f9345b;
                a.o(MyApplication.f7090a, R.string.activity_empty_view, cVar3.f10189i0);
                cVar3.f10188h0.setEmptyView(cVar3.f10189i0);
                b.w(false);
                return;
            case 8:
                if (cVar.b() && (jVar = (j) cVar2.f(cls2)) != null) {
                    o.setLocationObject(jVar);
                    ((n4.f) this.f9345b).W();
                    return;
                }
                return;
            case 10:
                C0586b c6 = cVar.c();
                while (true) {
                    Iterator it3 = c6.f8276a;
                    boolean hasNext = it3.hasNext();
                    C0923f fVar = (C0923f) this.f9345b;
                    if (hasNext) {
                        v3.q qVar2 = (v3.q) it3.next();
                        c6.f8277b.f8279b.E(qVar2.f12304a.f12280a);
                        n nVar = (n) r3.b.c(n.class, v3.m.t(qVar2.f12305b).f12296a.getValue());
                        if (nVar != null) {
                            for (int i5 = 0; i5 < fVar.f11028t0.size(); i5++) {
                                if (((Integer) fVar.f11028t0.get(i5)).intValue() == nVar.getId()) {
                                    ((D) fVar.f11029u0.get(i5)).h = nVar.getCount();
                                }
                            }
                        }
                    } else {
                        C0923f.V(fVar);
                        fVar.f11022m0.setOnSeekBarChangeListener(new C0921d(fVar, 0));
                        C0640p pVar = new C0640p(fVar.f11013d0, fVar.f11029u0, fVar.f11025p0, fVar.W(), 2);
                        fVar.f11030v0 = pVar;
                        fVar.f11023n0.setAdapter(pVar);
                        b.w(false);
                        return;
                    }
                }
            case 12:
                ArrayList arrayList4 = new ArrayList();
                C0586b c7 = cVar.c();
                int i6 = 0;
                while (true) {
                    Iterator it4 = c7.f8276a;
                    if (it4.hasNext()) {
                        v3.q qVar3 = (v3.q) it4.next();
                        C0590f E8 = c7.f8277b.f8279b.E(qVar3.f12304a.f12280a);
                        Y4.h j7 = com.bumptech.glide.d.j((C0473f) r3.b.c(C0473f.class, v3.m.t(qVar3.f12305b).f12296a.getValue()));
                        j7.f4354a = E8.F();
                        if (E8.F().equals("--defaultEstate")) {
                            j7.f4362l = true;
                        }
                        if (j7.f4360j) {
                            arrayList4.add(0, j7);
                        } else if (j7.f4361k) {
                            arrayList4.add(i6, j7);
                        } else {
                            arrayList4.add(i6, j7);
                        }
                        i6++;
                    } else {
                        C1009a aVar = (C1009a) this.f9345b;
                        G g = new G(aVar.f11749d0, arrayList4, 1);
                        aVar.f11755j0 = g;
                        aVar.f11753h0.setAdapter(g);
                        int size = arrayList4.size();
                        aVar.f11758m0 = size;
                        aVar.f11751f0.setText(aVar.s(R.string.number_of_estates, Integer.valueOf(size)));
                        b.w(false);
                        return;
                    }
                }
            case 13:
                ArrayList Z5 = com.bumptech.glide.d.Z();
                C0586b c8 = cVar.c();
                while (true) {
                    Iterator it5 = c8.f8276a;
                    if (it5.hasNext()) {
                        v3.q qVar4 = (v3.q) it5.next();
                        ((C0246c) Z5.get(Integer.parseInt(c8.f8277b.f8279b.E(qVar4.f12304a.f12280a).F()))).d = (int) ((long) v3.m.t(qVar4.f12305b).f12296a.i());
                    } else {
                        C1011c cVar4 = (C1011c) this.f9345b;
                        cVar4.f11767j0.setAdapter(new C0640p(cVar4.f11762e0, Z5, 2, 0, (byte) 0));
                        b.w(false);
                        return;
                    }
                }
            case 14:
                boolean g5 = cVar.g();
                C1033b bVar2 = (C1033b) this.f9345b;
                if (g5) {
                    int size2 = bVar2.f11861m0.size();
                    C0586b c9 = cVar.c();
                    boolean z4 = false;
                    while (true) {
                        Iterator it6 = c9.f8276a;
                        if (it6.hasNext()) {
                            v3.q qVar5 = (v3.q) it6.next();
                            c9.f8277b.f8279b.E(qVar5.f12304a.f12280a);
                            u uVar = (u) r3.b.c(cls3, v3.m.t(qVar5.f12305b).f12296a.getValue());
                            if (uVar != null) {
                                if (!z4) {
                                    if (o.getLocationObject().getCurrentCity() == 0) {
                                        bVar2.f11863o0 = uVar.getLocationObject().getSortByCityPlaceLevelLastSeen();
                                    } else {
                                        bVar2.f11863o0 = uVar.getLocationObject().getSortByCityPlaceLastSeen();
                                    }
                                    z4 = true;
                                }
                                if (o.getLocationObject().getCurrentCity() == 0 && uVar.getMainStatesObject().getLevel() < o.getMainStatesObject().getLevel() - 5) {
                                    bVar2.f11865q0 = true;
                                } else if (uVar.getLocationObject().getCurrentCity() != o.getLocationObject().getCurrentCity()) {
                                    bVar2.f11865q0 = true;
                                } else if (!a.t(uVar.getAccountObject().getId())) {
                                    bVar2.f11861m0.add(size2, Y4.i.a(uVar));
                                }
                            }
                        } else {
                            bVar2.f11862n0.notifyDataSetChanged();
                            if (cVar.d() < 10 || bVar2.f11865q0) {
                                z3 = false;
                                bVar2.f11864p0 = false;
                            } else {
                                z3 = false;
                            }
                            b.w(z3);
                            return;
                        }
                    }
                } else {
                    bVar2.f11864p0 = false;
                    v0.e(bVar2.f11852d0, MyApplication.f7090a.getApplicationContext().getString(R.string.no_more_items));
                    b.M0(R.raw.error_loading);
                    b.w(false);
                    return;
                }
                break;
            case 15:
                u uVar2 = (u) cVar2.f(cls3);
                g gVar2 = (g) this.f9345b;
                gVar2.f11908f1 = uVar2;
                if (uVar2 != null) {
                    uVar2.getMainStatesObject().setHealthCurrent(com.bumptech.glide.d.h0(gVar2.f11908f1.getMainStatesObject(), gVar2.f11908f1.getGymObject(), gVar2.f11908f1.getSkillsObject(), gVar2.f11908f1.getArmingObject(), gVar2.f11908f1.getSchoolObject()));
                    gVar2.f11912i0.setText(gVar2.f11908f1.getMainStatesObject().getNickName());
                    I1.b.v(gVar2.f11916k0, gVar2.f11908f1.getMainStatesObject().getProfilePicUrl());
                    if (b.k0(gVar2.f11908f1.getMainStatesObject().getVipEndTime())) {
                        gVar2.f11916k0.setBackgroundResource(R.drawable.profile_pic_frame_vip);
                    } else {
                        gVar2.f11916k0.setBackgroundResource(R.drawable.profile_pic_frame_default);
                    }
                    if (gVar2.f11908f1.getArmingObject().getGunId() == -1) {
                        gVar2.f11926p0.setImageResource(R.drawable.stock_empty_frame);
                    } else {
                        if (gVar2.f11908f1.getArmingObject().getGunLevel() > 0) {
                            d6 = D.v(gVar2.f11908f1.getArmingObject().getGunId(), 1, gVar2.f11908f1.getArmingObject().getGunLevel(), false);
                            gVar2.f11928q0.setVisibility(0);
                            gVar2.f11930r0.setText(String.valueOf(gVar2.f11908f1.getArmingObject().getGunLevel()));
                        } else {
                            d6 = D.j(gVar2.f11908f1.getArmingObject().getGunId(), 1, false);
                            gVar2.f11928q0.setVisibility(8);
                        }
                        gVar2.f11926p0.setImageResource(d6.d);
                        ConstraintLayout constraintLayout = gVar2.s0;
                        constraintLayout.setOnClickListener(new u4.e(this, constraintLayout, d6, 0));
                    }
                    if (gVar2.f11908f1.getArmingObject().getArmorId() == -1) {
                        gVar2.f11941x0.setImageResource(R.drawable.stock_empty_frame);
                    } else {
                        if (gVar2.f11908f1.getArmingObject().getArmorLevel() > 0) {
                            d = D.v(gVar2.f11908f1.getArmingObject().getArmorId(), 1, gVar2.f11908f1.getArmingObject().getArmorLevel(), false);
                            gVar2.f11942y0.setVisibility(0);
                            gVar2.f11943z0.setText(String.valueOf(gVar2.f11908f1.getArmingObject().getArmorLevel()));
                        } else {
                            d = D.b(gVar2.f11908f1.getArmingObject().getArmorId(), 1, false);
                            gVar2.f11942y0.setVisibility(8);
                        }
                        gVar2.f11941x0.setImageResource(d.d);
                        ConstraintLayout constraintLayout2 = gVar2.f11877A0;
                        constraintLayout2.setOnClickListener(new u4.e(this, constraintLayout2, d, 1));
                    }
                    if (gVar2.f11908f1.getArmingObject().getSpecialEquipmentId() == -1) {
                        gVar2.f11879C0.setImageResource(R.drawable.stock_empty_frame);
                    } else {
                        D s6 = D.s(gVar2.f11908f1.getArmingObject().getSpecialEquipmentId(), 0, 1);
                        gVar2.f11879C0.setImageResource(s6.d);
                        ImageView imageView = gVar2.f11879C0;
                        imageView.setOnClickListener(new u4.e(this, imageView, s6, 2));
                    }
                    if (gVar2.f11908f1.getArmingObject().getBioChemicalId() == -1) {
                        gVar2.f11881E0.setImageResource(R.drawable.stock_empty_frame);
                    } else {
                        D s7 = D.s(gVar2.f11908f1.getArmingObject().getBioChemicalId(), 0, 1);
                        gVar2.f11881E0.setImageResource(s7.d);
                        ImageView imageView2 = gVar2.f11881E0;
                        imageView2.setOnClickListener(new u4.e(this, imageView2, s7, 3));
                    }
                    gVar2.f11913i1 = gVar2.f11908f1.getMainStatesObject().getHealthCurrent();
                    gVar2.f11915j1 = com.bumptech.glide.d.q0(gVar2.f11908f1.getMainStatesObject(), gVar2.f11908f1.getGymObject(), gVar2.f11908f1.getSkillsObject(), gVar2.f11908f1.getArmingObject(), gVar2.f11908f1.getSchoolObject());
                    long j8 = gVar2.f11915j1;
                    long j9 = gVar2.f11913i1;
                    if (j8 < j9) {
                        gVar2.f11915j1 = j9;
                    }
                    gVar2.e0(j9, gVar2.f11915j1, gVar2.f11884H0);
                    gVar2.f11902c1 = true;
                    g.W(gVar2);
                    return;
                }
                return;
            case 16:
                int i7 = (cVar.d() > 1 ? 1 : (cVar.d() == 1 ? 0 : -1));
                C1052a aVar2 = (C1052a) this.f9345b;
                if (i7 < 0) {
                    aVar2.f12328q0 = false;
                    v0.e(aVar2.f12315d0, MyApplication.f7090a.getApplicationContext().getString(R.string.no_more_items));
                    b.M0(R.raw.error_loading);
                    b.w(false);
                    return;
                }
                aVar2.f12324m0.clear();
                ArrayList arrayList5 = aVar2.f12325n0;
                arrayList5.clear();
                for (int i8 = 0; ((long) i8) < cVar.d(); i8++) {
                    aVar2.f12324m0.add((Object) null);
                }
                C0586b c10 = cVar.c();
                int i9 = 0;
                while (true) {
                    Iterator it7 = c10.f8276a;
                    if (it7.hasNext()) {
                        v3.q qVar6 = (v3.q) it7.next();
                        C0590f E9 = c10.f8277b.f8279b.E(qVar6.f12304a.f12280a);
                        try {
                            b5.m mVar = (b5.m) r3.b.c(b5.m.class, v3.m.t(qVar6.f12305b).f12296a.getValue());
                            if (((long) i9) == cVar.d() - 1) {
                                aVar2.f12327p0 = E9.F();
                            }
                            Y4.k kVar = new Y4.k(mVar);
                            C0592h.b().e().E(b.Z()).E("players").E(kVar.f4376b).E("mainStatesObject").d(new f((Object) this, (Object) kVar, i9, 21));
                        } catch (Exception e6) {
                            arrayList5.add(Integer.valueOf(i9));
                            a.r("Exception from try-catch inside ", "a", " class in loadOldItems method.", "a", e6);
                        }
                        i9++;
                    } else {
                        C1052a.V(aVar2);
                        if (cVar.d() < 10) {
                            aVar2.f12328q0 = false;
                            return;
                        }
                        return;
                    }
                }
            case 21:
                boolean g6 = cVar.g();
                C1101d dVar = (C1101d) this.f9345b;
                if (g6) {
                    int size3 = dVar.f12569j0.size();
                    C0586b c11 = cVar.c();
                    int i10 = 0;
                    while (true) {
                        Iterator it8 = c11.f8276a;
                        if (it8.hasNext()) {
                            v3.q qVar7 = (v3.q) it8.next();
                            c11.f8277b.f8279b.E(qVar7.f12304a.f12280a);
                            u uVar3 = (u) r3.b.c(cls3, v3.m.t(qVar7.f12305b).f12296a.getValue());
                            if (uVar3 != null) {
                                if (((long) i10) == cVar.d() - 1) {
                                    dVar.f12571l0 = uVar3.getLocationObject().getSortByCityPlaceLastSeen();
                                }
                                i10++;
                                dVar.f12569j0.add(size3, Y4.u.a(uVar3.getAccountObject().getId(), uVar3.getMainStatesObject(), uVar3.getLocationObject()));
                            }
                        } else {
                            dVar.f12570k0.notifyDataSetChanged();
                            if (cVar.d() < 10) {
                                dVar.f12572m0 = false;
                            }
                        }
                    }
                } else {
                    dVar.f12572m0 = false;
                    v0.e(dVar.f12563d0, MyApplication.f7090a.getApplicationContext().getString(R.string.no_more_items));
                    b.M0(R.raw.error_loading);
                }
                b.w(false);
                return;
            default:
                if (cVar.b() && (jVar2 = (j) cVar2.f(cls2)) != null) {
                    o.setLocationObject(jVar2);
                    ((C1105h) this.f9345b).W();
                    return;
                }
                return;
        }
    }

    public int v() {
        return ((C0804F) this.f9345b).E();
    }

    public int x(View view) {
        ((C0804F) this.f9345b).getClass();
        return view.getRight() + ((C0805G) view.getLayoutParams()).f9862b.right + ((C0805G) view.getLayoutParams()).rightMargin;
    }

    public /* synthetic */ C0724m(Object obj, int i2) {
        this.f9344a = i2;
        this.f9345b = obj;
    }

    private final void A(C0588d dVar) {
    }

    private final void C(C0588d dVar) {
    }

    private final void D(C0588d dVar) {
    }

    private final void f(C0588d dVar) {
    }

    private final void j(C0588d dVar) {
    }

    private final void n(C0588d dVar) {
    }

    private final void o(C0588d dVar) {
    }

    private final void p(C0588d dVar) {
    }

    private final void w(C0588d dVar) {
    }

    private final void y(C0588d dVar) {
    }

    private final void z(C0588d dVar) {
    }

    public void k(C0587c cVar) {
    }
}
