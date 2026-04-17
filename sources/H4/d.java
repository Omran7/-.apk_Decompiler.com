package H4;

import A2.f;
import F3.e;
import F3.r;
import K4.h;
import K4.k;
import P4.g;
import P4.s;
import P4.v;
import P4.w;
import R2.b;
import X4.j;
import Z4.l;
import Z4.n;
import Z4.p;
import Z4.t;
import Z4.u;
import android.util.Log;
import android.widget.LinearLayout;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0286s;
import com.bumptech.glide.c;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.StartActivity;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.B;
import com.mtma.criminal.city.utils.C0436f;
import com.mtma.criminal.city.utils.C0453x;
import com.mtma.criminal.city.utils.Q;
import com.mtma.criminal.city.utils.v0;
import d5.o;
import e3.C0496d;
import e3.C0500h;
import e3.m;
import f3.C0528e;
import f3.C0532i;
import h0.C0552a;
import i3.C0590f;
import i3.C0592h;
import j4.S;
import j4.V;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import x1.i;

public final class d implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1023a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1024b;

    public /* synthetic */ d(Object obj, int i2) {
        this.f1023a = i2;
        this.f1024b = obj;
    }

    public final void onComplete(Task task) {
        List list;
        Class<n> cls = n.class;
        Class<l> cls2 = l.class;
        Object obj = this.f1024b;
        switch (this.f1023a) {
            case 0:
                e eVar = (e) obj;
                ((h) ((g) ((g) ((f) eVar.f1026b).d).f1032c).f1032c).f1038h0.setText("");
                b.w(false);
                for (C0286s sVar : ((h) ((g) ((g) ((f) eVar.f1026b).d).f1032c).f1032c).p().f5000c.v()) {
                    if (sVar instanceof j) {
                        j jVar = (j) sVar;
                        h hVar = (h) ((g) ((g) ((f) eVar.f1026b).d).f1032c).f1032c;
                        String str = hVar.f1046p0;
                        String nickName = hVar.f1047q0.getNickName();
                        int i2 = 0;
                        while (true) {
                            ArrayList arrayList = jVar.f1059j0;
                            if (i2 >= arrayList.size()) {
                                return;
                            }
                            if (((b5.l) arrayList.get(i2)).getPlayerId().equals(str)) {
                                ((b5.l) arrayList.get(i2)).setPlayerName(nickName);
                                ((b5.l) arrayList.get(i2)).setLastMessageTimeInMilli(Long.valueOf(c.f5744o * 1000));
                                arrayList.sort(new i(0));
                                jVar.f1060k0.notifyDataSetChanged();
                                jVar.V();
                                return;
                            }
                            i2++;
                        }
                    }
                }
                return;
            case 1:
                b.w(false);
                b.M0(R.raw.add_new_item);
                k kVar = ((K4.b) obj).f1504b;
                v0.e(kVar.f1553d0, kVar.n().getString(R.string.toast_successfully));
                return;
            case 2:
                b.w(false);
                b.M0(R.raw.add_new_item);
                k kVar2 = (k) obj;
                v0.e(kVar2.f1553d0, kVar2.n().getString(R.string.toast_successfully));
                return;
            case 3:
                b.w(false);
                b.M0(R.raw.add_new_item);
                k kVar3 = ((K4.b) ((i) obj).f12553b).f1504b;
                v0.e(kVar3.f1553d0, kVar3.n().getString(R.string.toast_successfully));
                return;
            case 4:
                B4.d dVar = (B4.d) obj;
                if (task.isSuccessful()) {
                    C0592h.b().e().E("Users").E(o.getAccountObject().getFirebaseId()).E("password").I((String) dVar.f352c).addOnSuccessListener(new e(this, 4));
                    return;
                }
                b.w(false);
                a.n(MyApplication.f7090a, R.string.unknown_error, ((g) dVar.d).f2207d0, (String) null);
                return;
            case 5:
                b.w(false);
                g gVar = (g) obj;
                if (task.isSuccessful()) {
                    c.s0(gVar.f2207d0, MyApplication.f7090a.getApplicationContext().getString(R.string.reset_password_link_sent_successfully), (String) null);
                    b.M0(R.raw.add_new_item);
                    return;
                }
                a.n(MyApplication.f7090a, R.string.unknown_error, gVar.f2207d0, (String) null);
                return;
            case zzaky.zzf.zzf /*6*/:
                E4.b bVar = (E4.b) obj;
                o.getAccountObject().setEmail((String) bVar.f625b);
                o.getAccountObject().setUserName((String) bVar.d);
                P4.l lVar = (P4.l) bVar.f627e;
                for (C0286s sVar2 : lVar.p().f5000c.v()) {
                    if ((sVar2 instanceof s) || (sVar2 instanceof P4.l)) {
                        C0269a aVar = new C0269a(lVar.p());
                        aVar.h(sVar2);
                        aVar.e(false);
                    }
                }
                C0269a aVar2 = new C0269a(lVar.p());
                aVar2.f(R.id.activity_main_body_frame_layout, new s(lVar.f2248d0), (String) null, 1);
                aVar2.c();
                aVar2.e(false);
                b.N0();
                b.w(false);
                a.n(MyApplication.f7090a, R.string.description_after_success_save_account_data, lVar.f2248d0, (String) null);
                return;
            case zzaky.zzf.zzg /*7*/:
                h hVar2 = (h) obj;
                if (task.isSuccessful()) {
                    C0590f E6 = C0592h.b().e().E("Users").E(o.getAccountObject().getFirebaseId()).E("emailVerified");
                    Boolean bool = Boolean.FALSE;
                    E6.I(bool);
                    C0590f E7 = C0592h.b().e().E("Users").E(o.getAccountObject().getFirebaseId()).E("canChangeEmail");
                    Boolean bool2 = Boolean.TRUE;
                    E7.I(bool2);
                    C0592h.b().e().E("Users").E(o.getAccountObject().getFirebaseId()).E("email").I((String) ((B4.d) ((d) hVar2.f1523c).f1024b).f351b);
                    a.c(C0592h.b().e(), "players").E(o.getAccountObject().getId()).E("accountObject").E("canChangeEmail").I(bool2);
                    o.getAccountObject().setCanChangeEmail(true);
                    a.c(C0592h.b().e(), "players").E(o.getAccountObject().getId()).E("accountObject").E("emailVerified").I(bool);
                    o.getAccountObject().setEmailVerified(false);
                    a.d(a.c(C0592h.b().e(), "players"), "accountObject", "email").I((String) ((B4.d) ((d) hVar2.f1523c).f1024b).f351b).addOnSuccessListener(new e(this, 5));
                    return;
                }
                b.w(false);
                a.n(MyApplication.f7090a, R.string.unknown_error, ((w) ((B4.d) ((d) hVar2.f1523c).f1024b).d).f2290d0, (String) null);
                return;
            case 8:
                B4.d dVar2 = (B4.d) obj;
                if (task.isSuccessful()) {
                    C0532i iVar = (C0532i) task.getResult();
                    if (iVar == null || (list = iVar.f7943a) == null || list.size() <= 0) {
                        m mVar = FirebaseAuth.getInstance().f6866f;
                        if (mVar != null) {
                            String email = o.getAccountObject().getEmail();
                            String str2 = (String) dVar2.f352c;
                            I.d(email);
                            I.d(str2);
                            mVar.x(new C0496d(email, str2, (String) null, (String) null, false)).addOnCompleteListener(new h(this, mVar, 2));
                            return;
                        }
                        b.w(false);
                        a.n(MyApplication.f7090a, R.string.unknown_error, ((w) dVar2.d).f2290d0, (String) null);
                        return;
                    }
                    b.w(false);
                    a.n(MyApplication.f7090a, R.string.email_address_already_exist, ((w) dVar2.d).f2290d0, (String) null);
                    return;
                }
                b.w(false);
                a.n(MyApplication.f7090a, R.string.unknown_error, ((w) dVar2.d).f2290d0, (String) null);
                return;
            case 9:
                v vVar = (v) obj;
                if (!task.isSuccessful()) {
                    b.w(false);
                    w.V(vVar.f2289b);
                    return;
                } else if (((C0528e) FirebaseAuth.getInstance().f6866f).f7921b.f7918p) {
                    w wVar = vVar.f2289b;
                    wVar.getClass();
                    C0590f E8 = C0592h.b().e().E("Users").E(o.getAccountObject().getFirebaseId()).E("emailVerified");
                    Boolean bool3 = Boolean.TRUE;
                    E8.I(bool3);
                    C0592h.b().e().E("Users").E(o.getAccountObject().getFirebaseId()).E("canChangeEmail").I(Boolean.FALSE);
                    a.c(C0592h.b().e(), "players").E(o.getAccountObject().getId()).E("accountObject").E("emailVerified").I(bool3).addOnSuccessListener(new e(wVar, 6));
                    return;
                } else {
                    b.w(false);
                    w.V(vVar.f2289b);
                    return;
                }
            case 10:
                b.w(false);
                R4.d dVar3 = (R4.d) obj;
                v0.e(dVar3.f2528d0, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_saved_successfully));
                C0269a aVar3 = new C0269a(dVar3.p());
                aVar3.h(dVar3);
                aVar3.e(false);
                return;
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                X4.d dVar4 = (X4.d) obj;
                ((LinearLayout) ((P4.d) dVar4.f4210c).f2199k0).setVisibility(8);
                boolean isSuccessful = task.isSuccessful();
                P4.d dVar5 = (P4.d) dVar4.f4210c;
                if (isSuccessful) {
                    dVar5.f2196h0 = false;
                    c.s0((StartActivity) dVar5.f2197i0, MyApplication.f7090a.getApplicationContext().getString(R.string.reset_password_link_sent_successfully), (String) null);
                    return;
                }
                dVar5.f2196h0 = false;
                c.s0((StartActivity) dVar5.f2197i0, MyApplication.f7090a.getApplicationContext().getString(R.string.unknown_error_try_again), (String) null);
                return;
            case 12:
                X4.h hVar3 = (X4.h) obj;
                if (!task.isSuccessful()) {
                    hVar3.f4231q0 = false;
                    hVar3.f4230p0.setVisibility(8);
                    c.s0(hVar3.f4218d0, MyApplication.f7090a.getApplicationContext().getString(R.string.unknown_error_try_again), (String) null);
                    return;
                } else if (task.getResult() != null) {
                    Z3.d dVar6 = new Z3.d();
                    Z4.i iVar2 = (Z4.i) dVar6.b(Z4.i.class, dVar6.e((Map) ((r) task.getResult()).f784a));
                    if (iVar2 == null) {
                        hVar3.f4231q0 = false;
                        hVar3.f4230p0.setVisibility(8);
                        c.s0(hVar3.f4218d0, MyApplication.f7090a.getApplicationContext().getString(R.string.unknown_error_try_again), (String) null);
                        return;
                    } else if (iVar2.isNameAlreadyExist) {
                        hVar3.f4231q0 = false;
                        hVar3.f4230p0.setVisibility(8);
                        c.s0(hVar3.f4218d0, MyApplication.f7090a.getApplicationContext().getString(R.string.name_already_exist), (String) null);
                        return;
                    } else if (iVar2.isReachToMaximumAccountsOnDevice) {
                        hVar3.f4231q0 = false;
                        hVar3.f4230p0.setVisibility(8);
                        c.s0(hVar3.f4218d0, MyApplication.f7090a.getApplicationContext().getString(R.string.reach_to_maximum_accounts_on_current_device), (String) null);
                        return;
                    } else if (iVar2.hasError) {
                        hVar3.f4231q0 = false;
                        hVar3.f4230p0.setVisibility(8);
                        c.s0(hVar3.f4218d0, MyApplication.f7090a.getApplicationContext().getString(R.string.unknown_error_try_again), (String) null);
                        StringBuilder t6 = C0552a.t("There is error occur when call the  cloud functions inside : ", "h", " , inside the startSignUpAsGuest method, and the error : \n");
                        t6.append(iVar2.errorMessage);
                        Log.e("h", t6.toString());
                        return;
                    } else if (iVar2.isAccountCreatedSuccessfully) {
                        FirebaseAuth instance = FirebaseAuth.getInstance();
                        String str3 = iVar2.customToken;
                        instance.getClass();
                        I.d(str3);
                        instance.f6865e.zza(instance.f6862a, str3, instance.f6867i, (f3.v) new C0500h(instance)).addOnCompleteListener(new h(this, iVar2, 3));
                        return;
                    } else {
                        return;
                    }
                } else {
                    hVar3.f4231q0 = false;
                    hVar3.f4230p0.setVisibility(8);
                    c.s0(hVar3.f4218d0, MyApplication.f7090a.getApplicationContext().getString(R.string.unknown_error_try_again), (String) null);
                    return;
                }
            case 13:
                ((com.mtma.criminal.city.activities.r) ((d) obj).f1024b).f7077a.f7036Q = true;
                return;
            case 14:
                com.mtma.criminal.city.activities.r rVar = (com.mtma.criminal.city.activities.r) obj;
                if (!task.isSuccessful()) {
                    StartActivity startActivity = rVar.f7077a;
                    startActivity.s(new j(startActivity.f7028I));
                    return;
                } else if (task.getResult() != null) {
                    Map map = (Map) ((r) task.getResult()).f784a;
                    if (map.containsKey("hasError")) {
                        StartActivity startActivity2 = rVar.f7077a;
                        startActivity2.s(new j(startActivity2.f7028I));
                        return;
                    } else if (map.containsKey("customToken")) {
                        FirebaseAuth instance2 = FirebaseAuth.getInstance();
                        String str4 = (String) map.get("customToken");
                        instance2.getClass();
                        I.d(str4);
                        instance2.f6865e.zza(instance2.f6862a, str4, instance2.f6867i, (f3.v) new C0500h(instance2)).addOnCompleteListener(new d((Object) this, 13));
                        return;
                    } else {
                        StartActivity startActivity3 = rVar.f7077a;
                        startActivity3.s(new j(startActivity3.f7028I));
                        return;
                    }
                } else {
                    StartActivity startActivity4 = rVar.f7077a;
                    startActivity4.s(new j(startActivity4.f7028I));
                    return;
                }
            case 15:
                e eVar2 = (e) obj;
                if (!task.isSuccessful()) {
                    eVar2.i(new Z4.h());
                    return;
                } else if (task.getResult() != null) {
                    Z3.d dVar7 = new Z3.d();
                    Z4.h hVar4 = (Z4.h) dVar7.b(Z4.h.class, dVar7.e((Map) ((r) task.getResult()).f784a));
                    if (hVar4 != null) {
                        eVar2.i(hVar4);
                        if (hVar4.isAllProcessSuccess) {
                            Q.h(132, o.getAccountObject().getId());
                            return;
                        }
                        return;
                    }
                    eVar2.i(new Z4.h());
                    return;
                } else {
                    eVar2.i(new Z4.h());
                    return;
                }
            case 16:
                c1.i iVar3 = (c1.i) obj;
                if (!task.isSuccessful()) {
                    iVar3.F(new u());
                    return;
                } else if (task.getResult() != null) {
                    Z3.d dVar8 = new Z3.d();
                    u uVar = (u) dVar8.b(u.class, dVar8.e((Map) ((r) task.getResult()).f784a));
                    if (uVar != null) {
                        iVar3.F(uVar);
                        return;
                    } else {
                        iVar3.F(new u());
                        return;
                    }
                } else {
                    iVar3.F(new u());
                    return;
                }
            case 17:
                B0.l lVar2 = (B0.l) obj;
                if (!task.isSuccessful()) {
                    lVar2.o(new Z4.c());
                    return;
                } else if (task.getResult() != null) {
                    Z3.d dVar9 = new Z3.d();
                    Z4.c cVar = (Z4.c) dVar9.b(Z4.c.class, dVar9.e((Map) ((r) task.getResult()).f784a));
                    if (cVar != null) {
                        lVar2.o(cVar);
                        return;
                    } else {
                        lVar2.o(new Z4.c());
                        return;
                    }
                } else {
                    lVar2.o(new Z4.c());
                    return;
                }
            case 18:
                B b6 = (B) ((c1.i) obj).f5606c;
                if (b6 != null) {
                    b6.c(true, true);
                    return;
                }
                return;
            case 19:
                ((C0436f) obj).f7408e.c(true);
                return;
            case 20:
                S s6 = (S) obj;
                if (!task.isSuccessful()) {
                    s6.b(new Z4.o());
                    return;
                } else if (task.getResult() != null) {
                    Z3.d dVar10 = new Z3.d();
                    Z4.o oVar = (Z4.o) dVar10.b(Z4.o.class, dVar10.e((Map) ((r) task.getResult()).f784a));
                    if (oVar != null) {
                        s6.b(oVar);
                        return;
                    } else {
                        s6.b(new Z4.o());
                        return;
                    }
                } else {
                    s6.b(new Z4.o());
                    return;
                }
            case 21:
                f fVar = (f) obj;
                if (!task.isSuccessful()) {
                    fVar.s(new Z4.g());
                    return;
                } else if (task.getResult() != null) {
                    Z3.d dVar11 = new Z3.d();
                    Z4.g gVar2 = (Z4.g) dVar11.b(Z4.g.class, dVar11.e((Map) ((r) task.getResult()).f784a));
                    if (gVar2 != null) {
                        fVar.s(gVar2);
                        return;
                    } else {
                        fVar.s(new Z4.g());
                        return;
                    }
                } else {
                    fVar.s(new Z4.g());
                    return;
                }
            case 22:
                V v6 = (V) obj;
                if (!task.isSuccessful()) {
                    v6.a(new Z4.k());
                    return;
                } else if (task.getResult() != null) {
                    Z3.d dVar12 = new Z3.d();
                    Z4.k kVar4 = (Z4.k) dVar12.b(Z4.k.class, dVar12.e((Map) ((r) task.getResult()).f784a));
                    if (kVar4 != null) {
                        v6.a(kVar4);
                        return;
                    } else {
                        v6.a(new Z4.k());
                        return;
                    }
                } else {
                    v6.a(new Z4.k());
                    return;
                }
            case 23:
                com.mtma.criminal.city.fragments.gangBase.I i5 = (com.mtma.criminal.city.fragments.gangBase.I) obj;
                if (!task.isSuccessful()) {
                    i5.q(new t());
                    return;
                } else if (task.getResult() != null) {
                    Z3.d dVar13 = new Z3.d();
                    t tVar = (t) dVar13.b(t.class, dVar13.e((Map) ((r) task.getResult()).f784a));
                    if (tVar != null) {
                        i5.q(tVar);
                        return;
                    } else {
                        i5.q(new t());
                        return;
                    }
                } else {
                    i5.q(new t());
                    return;
                }
            case 24:
                B b7 = (B) obj;
                if (!task.isSuccessful()) {
                    b7.b(new p());
                    return;
                } else if (task.getResult() != null) {
                    Z3.d dVar14 = new Z3.d();
                    p pVar = (p) dVar14.b(p.class, dVar14.e((Map) ((r) task.getResult()).f784a));
                    if (pVar != null) {
                        b7.b(pVar);
                        return;
                    } else {
                        b7.b(new p());
                        return;
                    }
                } else {
                    b7.b(new p());
                    return;
                }
            case 25:
                S s7 = (S) obj;
                if (!task.isSuccessful()) {
                    s7.a(new n());
                    return;
                } else if (task.getResult() != null) {
                    Z3.d dVar15 = new Z3.d();
                    n nVar = (n) dVar15.b(cls, dVar15.e((Map) ((r) task.getResult()).f784a));
                    if (nVar != null) {
                        s7.a(nVar);
                        return;
                    } else {
                        s7.a(new n());
                        return;
                    }
                } else {
                    s7.a(new n());
                    return;
                }
            case 26:
                B b8 = (B) obj;
                if (!task.isSuccessful()) {
                    b8.a(new n());
                    return;
                } else if (task.getResult() != null) {
                    Z3.d dVar16 = new Z3.d();
                    n nVar2 = (n) dVar16.b(cls, dVar16.e((Map) ((r) task.getResult()).f784a));
                    if (nVar2 != null) {
                        b8.a(nVar2);
                        return;
                    } else {
                        b8.a(new n());
                        return;
                    }
                } else {
                    b8.a(new n());
                    return;
                }
            case 27:
                C0453x xVar = (C0453x) obj;
                if (!task.isSuccessful()) {
                    xVar.a(new l());
                    return;
                } else if (task.getResult() != null) {
                    Z3.d dVar17 = new Z3.d();
                    l lVar3 = (l) dVar17.b(cls2, dVar17.e((Map) ((r) task.getResult()).f784a));
                    if (lVar3 != null) {
                        xVar.a(lVar3);
                        return;
                    } else {
                        xVar.a(new l());
                        return;
                    }
                } else {
                    xVar.a(new l());
                    return;
                }
            case 28:
                com.mtma.criminal.city.fragments.gangBase.k kVar5 = (com.mtma.criminal.city.fragments.gangBase.k) obj;
                if (!task.isSuccessful()) {
                    kVar5.a(new l());
                    return;
                } else if (task.getResult() != null) {
                    Z3.d dVar18 = new Z3.d();
                    l lVar4 = (l) dVar18.b(cls2, dVar18.e((Map) ((r) task.getResult()).f784a));
                    if (lVar4 != null) {
                        kVar5.a(lVar4);
                        return;
                    } else {
                        kVar5.a(new l());
                        return;
                    }
                } else {
                    kVar5.a(new l());
                    return;
                }
            default:
                com.mtma.criminal.city.fragments.gangBase.I i6 = (com.mtma.criminal.city.fragments.gangBase.I) obj;
                if (!task.isSuccessful()) {
                    i6.p(new Z4.f());
                    return;
                } else if (task.getResult() != null) {
                    Z3.d dVar19 = new Z3.d();
                    Z4.f fVar2 = (Z4.f) dVar19.b(Z4.f.class, dVar19.e((Map) ((r) task.getResult()).f784a));
                    if (fVar2 != null) {
                        i6.p(fVar2);
                        return;
                    } else {
                        i6.p(new Z4.f());
                        return;
                    }
                } else {
                    i6.p(new Z4.f());
                    return;
                }
        }
    }

    public d(C0436f fVar, d5.k kVar) {
        this.f1023a = 19;
        this.f1024b = fVar;
    }
}
