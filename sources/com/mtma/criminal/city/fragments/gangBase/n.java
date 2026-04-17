package com.mtma.criminal.city.fragments.gangBase;

import F3.h;
import R2.b;
import T1.A;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.fragment.app.C0286s;
import com.bumptech.glide.d;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.U;
import d5.o;
import e5.C0505b;
import e5.C0509f;
import java.util.HashMap;
import k.C0724m;
import o4.C0896a;
import o4.e;

public final class n extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7224a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7225b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f7226c;
    public final /* synthetic */ C0505b d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C0286s f7227e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(C0286s sVar, RelativeLayout relativeLayout, int i2, long j6, C0505b bVar, int i5) {
        super(relativeLayout);
        this.f7224a = i5;
        this.f7227e = sVar;
        this.f7225b = i2;
        this.f7226c = j6;
        this.d = bVar;
    }

    public final void onClick(View view) {
        switch (this.f7224a) {
            case 0:
                super.onClick(view);
                b.w(true);
                long j6 = this.f7226c;
                o oVar = (o) this.f7227e;
                int i2 = this.f7225b;
                if (i2 == 0) {
                    oVar.getClass();
                    d.W(0, j6, new k(oVar, 0));
                } else if (i2 == 1) {
                    oVar.getClass();
                    d.W(1, j6, new A((Object) oVar, 25));
                } else if (o.getGangObject().getPosition() != 0) {
                    b.w(true);
                    a.n(MyApplication.f7090a, R.string.dialog_gang_only_boss_can_take_that_action, oVar.f7229d0, (String) null);
                } else {
                    oVar.getClass();
                    k kVar = new k(oVar, 1);
                    HashMap hashMap = new HashMap();
                    hashMap.put("serverNumber", Integer.valueOf(o.getAccountObject().getCurrentOpenedServer()));
                    hashMap.put("playerId", o.getAccountObject().getId());
                    hashMap.put("playerName", o.getMainStatesObject().getNickName());
                    hashMap.put("gangId", o.getGangObject().getId());
                    hashMap.put("gangName", o.getGangObject().getName());
                    hashMap.put("withdrawalValue", Long.valueOf(j6));
                    h.b().a("withdrawalFromGang").q(hashMap).addOnCompleteListener(new H4.d((Object) kVar, 28));
                }
                this.d.dismiss();
                oVar.f7248x0 = false;
                return;
            default:
                super.onClick(view);
                b.w(true);
                int i5 = this.f7225b;
                long j7 = this.f7226c;
                e eVar = (e) this.f7227e;
                if (i5 == 0) {
                    eVar.getClass();
                    U.f(0, j7, new C0896a(eVar));
                } else {
                    eVar.getClass();
                    U.f(1, j7, new C0724m(eVar, 9));
                }
                this.d.dismiss();
                eVar.f10471w0 = false;
                return;
        }
    }
}
