package j4;

import A2.f;
import F3.h;
import H4.d;
import K1.e;
import P4.a;
import R2.b;
import Y4.C;
import Y4.l;
import Y4.n;
import Y4.u;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import com.bumptech.glide.c;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.I;
import d5.o;
import e5.C0505b;
import e5.C0509f;
import i3.C0592h;
import java.util.HashMap;

public final class Y extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8960a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f8961b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0505b f8962c;
    public final /* synthetic */ Object d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ArrayAdapter f8963e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(ArrayAdapter arrayAdapter, RelativeLayout relativeLayout, int i2, Object obj, C0505b bVar, int i5) {
        super(relativeLayout);
        this.f8960a = i5;
        this.f8963e = arrayAdapter;
        this.f8961b = i2;
        this.d = obj;
        this.f8962c = bVar;
    }

    public final void onClick(View view) {
        switch (this.f8960a) {
            case 0:
                super.onClick(view);
                l lVar = (l) this.d;
                Z z3 = (Z) this.f8963e;
                int i2 = this.f8961b;
                if (i2 == 1) {
                    z3.getClass();
                    b.w(true);
                    String str = lVar.f4385a;
                    String str2 = lVar.f4386b;
                    V v6 = new V(z3, lVar);
                    HashMap hashMap = new HashMap();
                    hashMap.put("serverNumber", Integer.valueOf(o.getAccountObject().getCurrentOpenedServer()));
                    hashMap.put("playerId", o.getAccountObject().getId());
                    hashMap.put("playerName", o.getMainStatesObject().getNickName());
                    hashMap.put("firedPlayerId", str);
                    hashMap.put("firedPlayerName", str2);
                    hashMap.put("gangId", o.getGangObject().getId());
                    h.b().a("fireMemberFromGang").q(hashMap).addOnCompleteListener(new d((Object) v6, 22));
                } else if (i2 == 2) {
                    z3.getClass();
                    b.w(true);
                    String str3 = lVar.f4385a;
                    String str4 = lVar.f4386b;
                    I i5 = new I(z3, 28);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("serverNumber", Integer.valueOf(o.getAccountObject().getCurrentOpenedServer()));
                    hashMap2.put("playerId", o.getAccountObject().getId());
                    hashMap2.put("playerName", o.getMainStatesObject().getNickName());
                    hashMap2.put("newBossId", str3);
                    hashMap2.put("newBossName", str4);
                    hashMap2.put("gangId", o.getGangObject().getId());
                    h.b().a("transferBossPosition").q(hashMap2).addOnCompleteListener(new d((Object) i5, 23));
                }
                this.f8962c.dismiss();
                z3.f8967e = false;
                return;
            case 1:
                super.onClick(view);
                C0615b0 b0Var = (C0615b0) this.f8963e;
                b0Var.getClass();
                b.w(true);
                int i6 = b0Var.f8979c;
                n nVar = (n) this.d;
                int i7 = this.f8961b;
                if (i6 == -1) {
                    C0592h.b().e().E(b.Z()).E("gangs").E("gangsData").E(o.getGangObject().getId()).E("membersWithPositions").E(o.getAccountObject().getId()).d(new f((Object) b0Var, i7, (Object) nVar, 14));
                } else if (i6 != 0 && i6 != 1 && i6 != 2 && i6 != 3) {
                    b.w(false);
                    c.s0(b0Var.f8978b, MyApplication.f7090a.getApplicationContext().getString(R.string.dialog_gang_position_not_allowed_to_take_action), (String) null);
                } else if (i7 == 0) {
                    com.bumptech.glide.d.a(nVar.f4401a, nVar.f4402b, o.getGangObject().getId(), o.getGangObject().getName(), new X4.d(b0Var, nVar, 24));
                } else if (i7 == 1) {
                    b0Var.b(nVar);
                }
                this.f8962c.dismiss();
                b0Var.d = false;
                return;
            case 2:
                super.onClick(view);
                int i8 = ((C) this.d).f4285a;
                C0617c0 c0Var = (C0617c0) this.f8963e;
                c0Var.getClass();
                b.w(true);
                S s6 = new S(c0Var, this.f8961b, i8);
                HashMap hashMap3 = new HashMap();
                hashMap3.put("serverNumber", Integer.valueOf(o.getAccountObject().getCurrentOpenedServer()));
                hashMap3.put("playerId", o.getAccountObject().getId());
                hashMap3.put("playerName", o.getMainStatesObject().getNickName());
                hashMap3.put("gangId", o.getGangObject().getId());
                hashMap3.put("skillId", Integer.valueOf(i8));
                h.b().a("improveSkillLevel").q(hashMap3).addOnCompleteListener(new d((Object) s6, 25));
                this.f8962c.dismiss();
                c0Var.g = false;
                return;
            default:
                super.onClick(view);
                u uVar = (u) this.d;
                int i9 = this.f8961b;
                C0637m0 m0Var = (C0637m0) this.f8963e;
                if (i9 != 0) {
                    if (o.getMoneyObject().getCash() < e.r(uVar.f4439i, m0Var.f9053b)) {
                        c.x0(m0Var.f9052a);
                    } else {
                        b.w(true);
                        String str5 = uVar.f4434a;
                        C0633k0 k0Var = new C0633k0(m0Var, uVar, 0);
                        HashMap hashMap4 = new HashMap();
                        hashMap4.put("serverNumber", Integer.valueOf(o.getAccountObject().getCurrentOpenedServer()));
                        hashMap4.put("playerId", o.getAccountObject().getId());
                        hashMap4.put("playerName", o.getMainStatesObject().getNickName());
                        hashMap4.put("prisonerId", str5);
                        h.b().a("payBailoutPrison").q(hashMap4).addOnCompleteListener(new a(k0Var, 9));
                    }
                } else if (o.getMainStatesObject().getPowerCurrent() < 10) {
                    c.p(m0Var.f9052a, 2001);
                } else {
                    m0Var.getClass();
                    b.w(true);
                    String str6 = uVar.f4434a;
                    C0633k0 k0Var2 = new C0633k0(m0Var, uVar, 1);
                    HashMap hashMap5 = new HashMap();
                    hashMap5.put("serverNumber", Integer.valueOf(o.getAccountObject().getCurrentOpenedServer()));
                    hashMap5.put("playerId", o.getAccountObject().getId());
                    hashMap5.put("playerName", o.getMainStatesObject().getNickName());
                    hashMap5.put("prisonerId", str6);
                    h.b().a("jailbreakFromPrison").q(hashMap5).addOnCompleteListener(new a(k0Var2, 8));
                }
                this.f8962c.dismiss();
                m0Var.f9054c = false;
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(ArrayAdapter arrayAdapter, RelativeLayout relativeLayout, Object obj, int i2, C0505b bVar, int i5) {
        super(relativeLayout);
        this.f8960a = i5;
        this.f8963e = arrayAdapter;
        this.d = obj;
        this.f8961b = i2;
        this.f8962c = bVar;
    }
}
