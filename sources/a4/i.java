package A4;

import H4.f;
import I3.h;
import K1.e;
import K4.k;
import K4.p;
import K4.v;
import P4.d;
import R2.b;
import Y4.C0246c;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b5.l;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.B;
import com.mtma.criminal.city.fragments.gangBase.D;
import com.mtma.criminal.city.utils.K;
import com.mtma.criminal.city.utils.U;
import com.mtma.criminal.city.utils.v0;
import d5.o;
import e5.C0505b;
import e5.C0509f;
import h0.C0552a;
import i3.C0590f;
import i3.C0592h;
import j4.C0626h;
import j4.C0641q;
import j4.F;
import j4.G;
import j4.Z;
import r4.j;

public final class i extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f82a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f83b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f84c;
    public final /* synthetic */ Object d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, View view, Object obj2, Object obj3, int i2) {
        super(view);
        this.f82a = i2;
        this.d = obj;
        this.f83b = obj2;
        this.f84c = obj3;
    }

    public final void onClick(View view) {
        long j6;
        int i2;
        View view2 = view;
        Object obj = this.f84c;
        Object obj2 = this.d;
        Object obj3 = this.f83b;
        switch (this.f82a) {
            case 0:
                super.onClick(view);
                String g = a.g((EditText) obj3);
                j jVar = (j) obj2;
                if (g.isEmpty()) {
                    a.k(MyApplication.f7090a, R.string.can_not_publish_empty_ad, jVar.f107d0);
                } else if (o.getMoneyObject().getCash() < 20000) {
                    c.x0(jVar.f107d0);
                } else {
                    jVar.getClass();
                    b.w(true);
                    U.g(o.getAccountObject().getId(), "cash", -20000, new c((Object) jVar, (Object) g, 0));
                }
                ((C0505b) obj).dismiss();
                jVar.f106W0 = false;
                return;
            case 1:
                super.onClick(view);
                String g5 = a.g((EditText) obj3);
                k kVar = (k) obj2;
                if (g5.isEmpty()) {
                    a.n(MyApplication.f7090a, R.string.can_not_send_empty_message, kVar.f1553d0, (String) null);
                    return;
                }
                ((C0505b) obj).dismiss();
                kVar.f1549V0 = false;
                b.w(true);
                C0590f E6 = a.x(C0592h.d().e(), "messages").E(o.getAccountObject().getId());
                String str = kVar.f1555f0;
                String str2 = kVar.f1554e0;
                E6.E("chatData").E(str2).I(new l(str2, str, true)).addOnSuccessListener(new f(kVar, g5, E6, 1));
                return;
            case 2:
                super.onClick(view);
                try {
                    j6 = Long.parseLong(((TextView) obj3).getText().toString().trim().replace(",", ""));
                } catch (Exception e6) {
                    C0552a.x(e6, "Exception from try-catch block when get integer from EditText (ignore it, default value added 0).", "v");
                    j6 = 0;
                }
                v vVar = (v) obj2;
                if (j6 == 0) {
                    a.m(MyApplication.f7090a, R.string.enter_cash_value_first, vVar.f1626d0, view2);
                    return;
                } else if (j6 > o.getMoneyObject().getCash()) {
                    a.m(MyApplication.f7090a, R.string.not_has_enough_cash_to_transaction, vVar.f1626d0, view2);
                    return;
                } else {
                    ((C0505b) obj).dismiss();
                    vVar.f1625N0 = false;
                    b.w(true);
                    android.support.v4.media.session.a.i0(new p(vVar, j6));
                    return;
                }
            case 3:
                super.onClick(view);
                String g6 = a.g((EditText) obj3);
                d dVar = (d) obj2;
                dVar.getClass();
                b.w(true);
                a.c(C0592h.b().e(), "players").E(o.getAccountObject().getId()).d(new h((Object) dVar, (Object) g6, 22));
                ((C0505b) obj).dismiss();
                dVar.f2196h0 = false;
                return;
            case 4:
                super.onClick(view);
                String g7 = a.g((EditText) obj3);
                D d6 = (D) obj2;
                if (g7.isEmpty()) {
                    a.m(MyApplication.f7090a, R.string.can_not_send_empty_message, d6.f7109d0, view2);
                    return;
                }
                ((C0505b) obj).dismiss();
                d6.f7121p0 = false;
                b.w(true);
                String id = o.getGangObject().getId();
                o3.d.d(C0592h.b().e(), "gangs", "gangsData", id, "membersWithPositions").d(new c1.i(4, (Object) new B(d6), g7, id));
                return;
            case 5:
                super.onClick(view);
                String replace = ((EditText) obj3).getText().toString().trim().replace("\n", "").replace("\t", "");
                Context context = (Context) obj2;
                if (replace.isEmpty()) {
                    a.m(MyApplication.f7090a, R.string.empty_name, context, view2);
                    return;
                } else if (replace.equals(o.getMainStatesObject().getNickName())) {
                    a.m(MyApplication.f7090a, R.string.same_name, context, view2);
                    return;
                } else {
                    ((C0505b) obj).dismiss();
                    e.g = false;
                    C0590f c3 = a.c(a.e(true), "players");
                    c3.q("mainStatesObject/nickName").i(replace).d(new c1.i((C0509f) this, c3, replace, 6));
                    return;
                }
            case zzaky.zzf.zzf /*6*/:
                super.onClick(view);
                G g8 = (G) obj2;
                int i5 = g8.f8876c;
                Y4.h hVar = (Y4.h) obj3;
                if (i5 == 0) {
                    b.w(true);
                    ((C0590f) g8.f8878f).E("allOwnEstates").d(new F(g8, hVar, 0));
                } else if (i5 == 1) {
                    b.w(true);
                    a.d(a.c(C0592h.b().e(), "players"), "estateObject", "allOwnEstates").H(new c1.i(hVar.f4354a, new F(g8, hVar, 1)));
                }
                ((C0505b) obj).dismiss();
                g8.d = false;
                return;
            case zzaky.zzf.zzg /*7*/:
                super.onClick(view);
                C0626h hVar2 = (C0626h) obj2;
                hVar2.getClass();
                b.w(true);
                com.bumptech.glide.d.V0((String) obj3, new K(hVar2, 23));
                ((C0505b) obj).dismiss();
                hVar2.f9019c = false;
                return;
            case 8:
                super.onClick(view);
                C0641q qVar = (C0641q) obj2;
                int i6 = qVar.f9078c;
                C0246c cVar = (C0246c) obj;
                ImageView imageView = (ImageView) obj3;
                Context context2 = qVar.f9077b;
                if (i6 == -1) {
                    v0.c(context2, imageView, MyApplication.f7090a.getApplicationContext().getString(cVar.f4333a));
                    return;
                } else {
                    v0.b(context2, i6, imageView, MyApplication.f7090a.getApplicationContext().getString(cVar.f4333a));
                    return;
                }
            case 9:
                super.onClick(view);
                Z z3 = (Z) obj2;
                int i7 = z3.f8966c;
                Y4.D d7 = (Y4.D) obj3;
                if (i7 == 3 || i7 == 4 || i7 == 5 || i7 == 8 || ((i7 == 9 && d7.f4293a == 3001) || i7 == 10 || i7 == 12 || i7 == 13 || i7 == 14)) {
                    Z.g(z3, d7.f4293a, 1);
                } else if (i7 == 6 || i7 == 7) {
                    Z.h(z3, d7.f4293a, 1);
                } else if (i7 == 9 && d7.f4293a == 3002) {
                    Z.i(z3, 1);
                } else if (i7 == 11) {
                    Z.h(z3, d7.f4293a, 1);
                }
                ((C0505b) obj).dismiss();
                z3.f8968f = false;
                return;
            default:
                super.onClick(view);
                try {
                    i2 = Integer.parseInt(((EditText) obj3).getText().toString().trim());
                } catch (Exception e7) {
                    C0552a.x(e7, "Exception from try-catch block when get integer from EditText (ignore it, default value added 0).", "j");
                    i2 = 0;
                }
                j jVar2 = (j) obj2;
                if (i2 < 1) {
                    a.k(MyApplication.f7090a, R.string.select_amount_first, jVar2.f11245d0);
                    return;
                }
                C0505b bVar = (C0505b) obj;
                if (o.getMoneyObject().getGold() < 5 * i2) {
                    bVar.dismiss();
                    jVar2.f11263w0 = false;
                    c.y0(jVar2.f11245d0);
                    return;
                }
                bVar.dismiss();
                jVar2.f11263w0 = false;
                I1.b.g(jVar2.f11245d0, i2, "gold", 5, new F3.e((Object) jVar2, 21));
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(RelativeLayout relativeLayout, EditText editText, Context context, C0505b bVar) {
        super(relativeLayout);
        this.f82a = 5;
        this.f83b = editText;
        this.d = context;
        this.f84c = bVar;
    }
}
