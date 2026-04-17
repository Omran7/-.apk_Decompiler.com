package com.mtma.criminal.city.fragments.gangBase;

import F3.h;
import R2.b;
import android.content.Context;
import android.view.View;
import com.bumptech.glide.d;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import d5.o;
import e5.C0505b;
import e5.C0509f;
import java.util.HashMap;

public final class C extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7106a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0505b f7107b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ D f7108c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(D d, View view, C0505b bVar, int i2) {
        super(view);
        this.f7106a = i2;
        this.f7108c = d;
        this.f7107b = bVar;
    }

    public final void onClick(View view) {
        switch (this.f7106a) {
            case 0:
                super.onClick(view);
                this.f7107b.dismiss();
                this.f7108c.f7120o0 = false;
                return;
            case 1:
                super.onClick(view);
                D d = this.f7108c;
                int i2 = d.f7110e0;
                Context context = d.f7109d0;
                if (i2 >= 6) {
                    a.m(MyApplication.f7090a, R.string.dialog_gang_reach_maximum_level, context, view);
                    return;
                } else if (o.getGangObject().getPosition() != 0) {
                    a.m(MyApplication.f7090a, R.string.dialog_gang_only_boss_can_take_that_action, context, view);
                    return;
                } else if (d.f7111f0 < d.t0(d.f7110e0)) {
                    a.m(MyApplication.f7090a, R.string.dialog_gang_has_not_members_number_improvement_requirements, context, view);
                    return;
                } else if (d.f7112g0 < d.u0(d.f7110e0)) {
                    a.m(MyApplication.f7090a, R.string.dialog_gang_has_not_respect_improvement_requirements, context, view);
                    return;
                } else if (d.f7113h0 < d.s0(d.f7110e0)) {
                    a.m(MyApplication.f7090a, R.string.dialog_gang_not_has_enough_cash, context, view);
                    return;
                } else {
                    this.f7107b.dismiss();
                    d.f7120o0 = false;
                    b.w(true);
                    B b6 = new B(d);
                    HashMap hashMap = new HashMap();
                    hashMap.put("serverNumber", Integer.valueOf(o.getAccountObject().getCurrentOpenedServer()));
                    hashMap.put("playerId", o.getAccountObject().getId());
                    hashMap.put("playerName", o.getMainStatesObject().getNickName());
                    hashMap.put("gangId", o.getGangObject().getId());
                    h.b().a("improveGangLevel").q(hashMap).addOnCompleteListener(new H4.d((Object) b6, 26));
                    return;
                }
            case 2:
                super.onClick(view);
                this.f7107b.dismiss();
                this.f7108c.f7121p0 = false;
                return;
            case 3:
                super.onClick(view);
                this.f7107b.dismiss();
                D d6 = this.f7108c;
                d6.f7122q0 = false;
                b.w(true);
                B b7 = new B(d6);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("serverNumber", Integer.valueOf(o.getAccountObject().getCurrentOpenedServer()));
                hashMap2.put("playerId", o.getAccountObject().getId());
                hashMap2.put("gangId", o.getGangObject().getId());
                h.b().a("dissolutionGang").q(hashMap2).addOnCompleteListener(new H4.d((Object) b7, 24));
                return;
            default:
                super.onClick(view);
                this.f7107b.dismiss();
                this.f7108c.f7122q0 = false;
                return;
        }
    }
}
