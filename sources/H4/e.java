package H4;

import A2.f;
import B4.d;
import K4.h;
import K4.k;
import P4.g;
import P4.w;
import R2.b;
import T1.A;
import Y4.D;
import a3.C0261a;
import android.content.Context;
import androidx.fragment.app.C0286s;
import b5.j;
import b5.l;
import com.bumptech.glide.c;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.StartActivity;
import com.mtma.criminal.city.activities.q;
import com.mtma.criminal.city.activities.t;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.C0423c;
import com.mtma.criminal.city.fragments.gangBase.I;
import com.mtma.criminal.city.utils.C0454y;
import com.mtma.criminal.city.utils.G;
import com.mtma.criminal.city.utils.Q;
import com.mtma.criminal.city.utils.U;
import com.mtma.criminal.city.utils.h0;
import com.mtma.criminal.city.utils.v0;
import d5.C0473f;
import d5.o;
import f.C0518i;
import i3.C0590f;
import i3.C0592h;
import i3.n;
import j4.C0624g;
import j4.C0626h;
import j4.C0642s;
import j4.C0645v;
import j4.F;
import j4.H;
import java.util.ArrayList;
import java.util.HashMap;
import x1.i;

public final class e implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1025a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1026b;

    public /* synthetic */ e(Object obj, int i2) {
        this.f1025a = i2;
        this.f1026b = obj;
    }

    public final void onSuccess(Object obj) {
        boolean z3;
        int i2;
        Object obj2 = this.f1026b;
        switch (this.f1025a) {
            case 0:
                Void voidR = (Void) obj;
                f fVar = (f) obj2;
                ((h) ((g) ((g) fVar.d).f1032c).f1032c).f1044n0.E(fVar.f1028b).I((j) fVar.f1029c).addOnCompleteListener(new d((Object) this, 0));
                return;
            case 1:
                Void voidR2 = (Void) obj;
                b.w(false);
                a.l(MyApplication.f7090a, R.string.toast_successfully, ((k) obj2).f1553d0, R.raw.add_new_item);
                return;
            case 2:
                Void voidR3 = (Void) obj;
                b.w(false);
                a.l(MyApplication.f7090a, R.string.toast_successfully, ((k) ((f) ((d) ((e) ((g) obj2).f1032c).f1026b).d).d).f1553d0, R.raw.add_new_item);
                return;
            case 3:
                Void voidR4 = (Void) obj;
                C0590f E6 = a.x(C0592h.d().e(), "messages").E(((k) ((f) ((d) obj2).d).d).f1554e0);
                E6.E("chatData").E(o.getAccountObject().getId()).I(new l(o.getAccountObject().getId(), o.getMainStatesObject().getNickName(), false)).addOnSuccessListener(new g(this, E6, 3));
                return;
            case 4:
                Void voidR5 = (Void) obj;
                d dVar = (d) obj2;
                ((g) ((d) dVar.f1024b).d).f2213j0.setText("");
                d dVar2 = (d) dVar.f1024b;
                ((g) dVar2.d).f2213j0.clearFocus();
                g gVar = (g) dVar2.d;
                gVar.f2214k0.setText("");
                gVar.f2214k0.clearFocus();
                gVar.f2215l0.setText("");
                gVar.f2215l0.clearFocus();
                b.w(false);
                c.s0(gVar.f2207d0, MyApplication.f7090a.getApplicationContext().getString(R.string.password_changed_successfully), (String) null);
                b.M0(R.raw.add_new_item);
                return;
            case 5:
                Void voidR6 = (Void) obj;
                d dVar3 = (d) obj2;
                o.getAccountObject().setEmail((String) ((d) ((d) ((h) dVar3.f1024b).f1523c).f1024b).f351b);
                h hVar = (h) dVar3.f1024b;
                ((w) ((d) ((d) hVar.f1523c).f1024b).d).W();
                d dVar4 = (d) hVar.f1523c;
                ((w) ((d) dVar4.f1024b).d).f2301o0.setText("");
                ((w) ((d) dVar4.f1024b).d).f2301o0.clearFocus();
                ((w) ((d) dVar4.f1024b).d).f2302p0.setText("");
                ((w) ((d) dVar4.f1024b).d).f2302p0.clearFocus();
                b.w(false);
                c.s0(((w) ((d) dVar4.f1024b).d).f2290d0, MyApplication.f7090a.getApplicationContext().getString(R.string.email_changed_successfully), (String) null);
                b.M0(R.raw.add_new_item);
                return;
            case zzaky.zzf.zzf /*6*/:
                Void voidR7 = (Void) obj;
                o.getAccountObject().setEmailVerified(true);
                a.d(a.c(C0592h.b().e(), "players"), "accountObject", "canChangeEmail").I(Boolean.FALSE);
                o.getAccountObject().setCanChangeEmail(false);
                if (!o.getAccountObject().isGotVerifiedReward()) {
                    U.g(o.getAccountObject().getId(), "check", 5000, new i((Object) this, 28));
                    return;
                }
                return;
            case zzaky.zzf.zzg /*7*/:
                Void voidR8 = (Void) obj;
                T4.d dVar5 = (T4.d) obj2;
                o.getStockObject().setMuseumBackgroundIdSelected(dVar5.f3601r0);
                dVar5.f3591h0.setImageResource(android.support.v4.media.session.a.X(dVar5.f3601r0));
                b.w(false);
                v0.e(dVar5.f3587d0, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_successfully));
                b.M0(R.raw.add_new_item);
                return;
            case 8:
                Void voidR9 = (Void) obj;
                o.getAccountObject().setDeviceId(K1.e.u());
                ((t) ((c1.i) obj2).d).f7081b.f7038S = true;
                return;
            case 9:
                StartActivity startActivity = (StartActivity) obj2;
                if (((Z2.c) obj).f4484b != null) {
                    c.A0(startActivity.f7028I);
                    return;
                }
                boolean z4 = StartActivity.f7025b0;
                startActivity.getClass();
                android.support.v4.media.session.a.i0(new q(startActivity, 1));
                return;
            case 10:
                Void voidR10 = (Void) obj;
                b.w(false);
                h hVar2 = (h) obj2;
                a.l(MyApplication.f7090a, R.string.toast_successfully, ((C0423c) ((A) hVar2.f1523c).f2796b).f7162d0, R.raw.add_new_item);
                o.setGangObject(((Z4.j) hVar2.f1522b).gangObject);
                C0423c.V((C0423c) ((A) hVar2.f1523c).f2796b);
                return;
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                Void voidR11 = (Void) obj;
                a.c(C0592h.b().e(), "players").E((String) obj2).E("notificationObject").E("hasUnReadPrivateMessage").I(Boolean.TRUE);
                return;
            case 12:
                Void voidR12 = (Void) obj;
                ((TaskCompletionSource) ((g) obj2).f1032c).setResult(Boolean.TRUE);
                return;
            case 13:
                Void voidR13 = (Void) obj;
                ((TaskCompletionSource) obj2).setResult(Boolean.TRUE);
                return;
            case 14:
                Void voidR14 = (Void) obj;
                S3.t tVar = (S3.t) obj2;
                String id = o.getAccountObject().getId();
                String nickName = o.getMainStatesObject().getNickName();
                HashMap hashMap = new HashMap();
                hashMap.put("type", 0);
                hashMap.put("idString", id);
                hashMap.put("name", nickName);
                hashMap.put("unixTimeInMilli", n.f8294a);
                C0592h.d().e().E(b.a0()).E("gangs").E("gangNotifications").E((String) ((X4.d) tVar.f2700b).f4209b).G().I(hashMap);
                ((C0454y) ((X4.d) tVar.f2700b).f4210c).f(true, true, false, true, false);
                return;
            case 15:
                Void voidR15 = (Void) obj;
                f fVar2 = (f) obj2;
                String str = ((G) fVar2.d).f7356c;
                ArrayList arrayList = Q.f7375a;
                o3.d.d(C0592h.b().e(), "players", str, "medalsObject", "allMedalsList").d(new C0261a(str, 3));
                G g = (G) fVar2.d;
                String str2 = g.f7356c;
                int i5 = g.d;
                int i6 = fVar2.f29b;
                c.k0(str2, new b5.k(0, i5, i6));
                long c3 = (long) Q.c(i5, i6);
                int i7 = (c3 > -100 ? 1 : (c3 == -100 ? 0 : -1));
                String str3 = g.f7356c;
                if (i7 != 0) {
                    long j6 = g.f7355b;
                    if (j6 >= c3) {
                        Q.a(i5, str3, j6);
                    }
                }
                android.support.v4.media.session.a.C0(1, 1, 1, str3);
                return;
            case 16:
                Void voidR16 = (Void) obj;
                o.getSkillsObject().setMeritsSkills(new HashMap());
                b.w(false);
                h0 h0Var = (h0) obj2;
                a.l(MyApplication.f7090a, R.string.toast_successfully, h0Var.f7420b, R.raw.add_new_item);
                for (C0286s sVar : ((C0518i) h0Var.f7420b).l().f5000c.v()) {
                    if (sVar instanceof l4.i) {
                        ((l4.i) sVar).d0();
                        return;
                    }
                }
                return;
            case 17:
                Void voidR17 = (Void) obj;
                b.w(false);
                a.l(MyApplication.f7090a, R.string.toast_successfully, ((C0626h) obj2).f9018b, R.raw.add_new_item);
                return;
            case 18:
                Void voidR18 = (Void) obj;
                b.w(false);
                a.l(MyApplication.f7090a, R.string.toast_successfully, ((C0624g) ((d) ((e) ((g) obj2).f1032c).f1026b).d).d.f9018b, R.raw.add_new_item);
                return;
            case 19:
                Void voidR19 = (Void) obj;
                C0590f E7 = a.x(C0592h.d().e(), "messages").E(((C0624g) ((d) obj2).d).f9012c);
                E7.E("chatData").E(o.getAccountObject().getId()).I(new l(o.getAccountObject().getId(), o.getMainStatesObject().getNickName(), false)).addOnSuccessListener(new g(this, E7, 7));
                return;
            case 20:
                Void voidR20 = (Void) obj;
                C0642s sVar2 = (C0642s) obj2;
                sVar2.d.remove(sVar2.f9089b);
                C0645v vVar = sVar2.d;
                vVar.notifyDataSetChanged();
                b.w(false);
                v0.e(vVar.f9109a, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_successfully));
                b.M0(R.raw.add_new_item);
                return;
            case 21:
                Void voidR21 = (Void) obj;
                C0642s sVar3 = (C0642s) obj2;
                sVar3.d.remove(sVar3.f9089b);
                C0645v vVar2 = sVar3.d;
                vVar2.notifyDataSetChanged();
                b.w(false);
                v0.e(vVar2.f9109a, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_successfully));
                b.M0(R.raw.add_new_item);
                return;
            case 22:
                Void voidR22 = (Void) obj;
                b.w(false);
                b.M0(R.raw.money_get);
                B0.l lVar = (B0.l) obj2;
                v0.e(((F) lVar.f247c).f8871c.f8875b, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_successfully));
                Q.b(66, o.getAccountObject().getId(), ((F) lVar.f247c).f8870b.h);
                Q.b(60, o.getAccountObject().getId(), (long) (lVar.f246b + 1));
                com.bumptech.glide.d.i1();
                return;
            case 23:
                Void voidR23 = (Void) obj;
                F f6 = (F) obj2;
                if (!f6.f8870b.f4359i) {
                    z3 = false;
                    if (D.s(o.getArmingObject().getSpecialEquipmentId(), 0, 1).f4313x == 2) {
                        android.support.v4.media.session.a.u0(15, false, new I(this, 27));
                    }
                } else {
                    z3 = false;
                }
                b.w(z3);
                b.M0(R.raw.add_new_item);
                j4.G g5 = f6.f8871c;
                v0.e(g5.f8875b, g5.getContext().getString(R.string.toast_successfully));
                com.bumptech.glide.d.d(c.f5744o);
                Q.b(59, o.getAccountObject().getId(), (long) b.N((C0473f) null));
                for (C0286s sVar4 : ((C0518i) g5.f8875b).l().f5000c.v()) {
                    if (sVar4 instanceof K4.o) {
                        ((K4.o) sVar4).Z();
                        return;
                    }
                }
                return;
            case 24:
                Void voidR24 = (Void) obj;
                B0.l lVar2 = (B0.l) obj2;
                int i8 = lVar2.f246b;
                ((Y4.g) ((H) lVar2.f247c).getItem(i8)).f4353f = true;
                H h = (H) lVar2.f247c;
                h.notifyDataSetChanged();
                o.getEstateObject().getFixedModificationList().set(i8, Boolean.TRUE);
                long j7 = (long) 1;
                Q.b(61, o.getAccountObject().getId(), j7);
                Q.b(59, o.getAccountObject().getId(), (long) b.N((C0473f) null));
                com.bumptech.glide.d.i1();
                if (h.getCount() == 5 && i8 == 2) {
                    int i9 = h.f8884c;
                    if (i9 == 14) {
                        Q.b(63, o.getAccountObject().getId(), j7);
                    } else if (i9 == 15) {
                        Q.b(64, o.getAccountObject().getId(), j7);
                    } else if (i9 == 16) {
                        Q.b(65, o.getAccountObject().getId(), j7);
                    }
                    int J5 = K1.e.J(1, 3);
                    if (J5 == 1) {
                        i2 = 30010;
                    } else if (J5 == 2) {
                        i2 = 30011;
                    } else {
                        i2 = 30012;
                    }
                    int i10 = i2;
                    android.support.v4.media.session.a.B0(i10, 15, 0, 1, new K1.h(i10), o.getAccountObject().getId(), "count", false);
                }
                b.w(false);
                b.M0(R.raw.money_get);
                String string = h.getContext().getString(R.string.toast_successfully);
                Context context = h.f8883b;
                v0.e(context, string);
                for (C0286s sVar5 : ((C0518i) context).l().f5000c.v()) {
                    if (sVar5 instanceof K4.o) {
                        ((K4.o) sVar5).Z();
                        return;
                    }
                }
                return;
            case 25:
                Void voidR25 = (Void) obj;
                b.w(false);
                e eVar = (e) obj2;
                Context context2 = ((C0626h) ((f) eVar.f1026b).d).f9018b;
                Context applicationContext = MyApplication.f7090a.getApplicationContext();
                f fVar3 = (f) eVar.f1026b;
                int i11 = fVar3.f29b;
                c.s0(context2, applicationContext.getString(R.string.success_delete_chat, new Object[]{((l) ((C0626h) fVar3.d).getItem(i11)).getPlayerName()}), (String) null);
                C0626h hVar3 = (C0626h) fVar3.d;
                hVar3.remove((l) hVar3.getItem(i11));
                hVar3.notifyDataSetChanged();
                return;
            case 26:
                Void voidR26 = (Void) obj;
                f fVar4 = (f) obj2;
                C0590f E8 = ((C0590f) fVar4.f30c).E("chatMessages");
                C0626h hVar4 = (C0626h) fVar4.d;
                int i12 = fVar4.f29b;
                E8.E(((l) hVar4.getItem(i12)).getPlayerId()).I((Object) null);
                ((C0590f) fVar4.f30c).E("chatData").E(((l) hVar4.getItem(i12)).getPlayerId()).I((Object) null).addOnSuccessListener(new e(this, 25));
                return;
            default:
                Void voidR27 = (Void) obj;
                b.w(false);
                v0.e(((l4.e) obj2).f9770c.f9806d0, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_successfully));
                b.M0(R.raw.add_new_item);
                return;
        }
    }
}
