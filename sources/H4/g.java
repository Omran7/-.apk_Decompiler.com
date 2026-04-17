package H4;

import I3.i;
import R2.b;
import T1.A;
import Y4.C0248e;
import Y4.n;
import b5.j;
import b5.k;
import b5.l;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.C0451v;
import com.mtma.criminal.city.utils.v0;
import d5.o;
import f3.C0523A;
import f3.C0528e;
import i3.C0590f;
import i3.C0592h;
import j4.C0615b0;
import j4.C0645v;
import java.util.Iterator;

public final class g implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1030a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1031b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f1032c;

    public /* synthetic */ g(Object obj, Object obj2, int i2) {
        this.f1030a = i2;
        this.f1032c = obj;
        this.f1031b = obj2;
    }

    public final void onSuccess(Object obj) {
        Object obj2 = this.f1032c;
        Object obj3 = this.f1031b;
        switch (this.f1030a) {
            case 0:
                Void voidR = (Void) obj;
                g gVar = (g) obj2;
                j jVar = new j(o.getAccountObject().getId(), (String) gVar.f1031b, false, d.I0());
                String str = c.f5744o + ((h) gVar.f1032c).f1044n0.G().F();
                ((C0590f) obj3).E("chatMessages").E(o.getAccountObject().getId()).E(str).I(jVar).addOnSuccessListener(new f(this, str, jVar, 0));
                return;
            case 1:
                Void voidR2 = (Void) obj;
                C0590f E6 = a.x(C0592h.d().e(), "messages").E(((h) obj2).f1046p0);
                E6.E("chatData").E(o.getAccountObject().getId()).I(new l(o.getAccountObject().getId(), o.getMainStatesObject().getNickName(), false)).addOnSuccessListener(new g(this, E6, 0));
                return;
            case 2:
                FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) obj3;
                firebaseInstanceId.getClass();
                String str2 = ((I3.d) obj).f1168a;
                i iVar = (i) obj2;
                if (iVar == null || !str2.equals(iVar.f1182a)) {
                    Iterator it2 = firebaseInstanceId.h.iterator();
                    while (it2.hasNext()) {
                        S3.o oVar = (S3.o) it2.next();
                        oVar.getClass();
                        U3.c cVar = FirebaseMessaging.f6901l;
                        oVar.f2688a.f(str2);
                    }
                    return;
                }
                return;
            case 3:
                Void voidR3 = (Void) obj;
                e eVar = (e) obj2;
                ((C0590f) obj3).E("chatMessages").E(o.getAccountObject().getId()).E((String) ((B4.d) eVar.f1026b).f351b).I((j) ((B4.d) eVar.f1026b).f352c).addOnSuccessListener(new e(this, 2));
                return;
            case 4:
                C0528e eVar2 = ((C0523A) obj).f7909a;
                if (eVar2 != null) {
                    String str3 = eVar2.f7921b.f7913a;
                    C0592h.b().f("Users").E(str3).E("password").I((String) obj3);
                    C0592h.b().f("Users").E(str3).d(new A((Object) this, 11));
                    return;
                }
                return;
            case 5:
                Void voidR4 = (Void) obj;
                a.c(C0592h.b().e(), "players").E((String) obj3).E("notificationObject").E("hasUnReadPrivateMessage").I(Boolean.TRUE).addOnSuccessListener(new e(this, 12));
                return;
            case zzaky.zzf.zzf /*6*/:
                Void voidR5 = (Void) obj;
                String str4 = (String) obj3;
                C0590f E7 = a.c(C0592h.b().e(), "players").E(str4).E("notificationObject").E("hasUnReadNotification");
                Boolean bool = Boolean.TRUE;
                E7.I(bool);
                if (((k) obj2).getType() == 0) {
                    o3.d.d(C0592h.b().e(), "players", str4, "notificationObject", "hasUnSeenMedal").I(bool);
                    return;
                }
                return;
            case zzaky.zzf.zzg /*7*/:
                Void voidR6 = (Void) obj;
                e eVar3 = (e) obj2;
                ((C0590f) obj3).E("chatMessages").E(o.getAccountObject().getId()).E((String) ((B4.d) eVar3.f1026b).f351b).I((j) ((B4.d) eVar3.f1026b).f352c).addOnSuccessListener(new e(this, 18));
                return;
            case 8:
                Void voidR7 = (Void) obj;
                C0645v vVar = (C0645v) obj2;
                vVar.remove((C0248e) obj3);
                vVar.notifyDataSetChanged();
                b.w(false);
                v0.e(vVar.f9109a, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_successfully));
                b.M0(R.raw.add_new_item);
                return;
            case 9:
                Void voidR8 = (Void) obj;
                n nVar = (n) obj3;
                c.k0(nVar.f4401a, new k(28, o.getGangObject().getId(), o.getGangObject().getName()));
                C0615b0 b0Var = (C0615b0) obj2;
                b0Var.remove(nVar);
                b0Var.notifyDataSetChanged();
                b.w(false);
                b.M0(R.raw.add_new_item);
                v0.e(b0Var.f8978b, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_successfully));
                return;
            default:
                Void voidR9 = (Void) obj;
                I1.b.B0((String) obj3);
                C0451v vVar2 = (C0451v) obj2;
                l4.i iVar2 = (l4.i) vVar2.f7481b;
                iVar2.f9810h0.setImageBitmap(iVar2.f9800W0);
                l4.i iVar3 = (l4.i) vVar2.f7481b;
                iVar3.f9800W0 = null;
                b.w(false);
                v0.e(iVar3.f9806d0, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_successfully));
                b.M0(R.raw.add_new_item);
                return;
        }
    }

    public /* synthetic */ g(Object obj, Object obj2, int i2, boolean z3) {
        this.f1030a = i2;
        this.f1031b = obj;
        this.f1032c = obj2;
    }
}
