package com.mtma.criminal.city.fragments.gangBase;

import F3.h;
import R2.b;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.utils.C0451v;
import d5.o;
import e5.C0505b;
import e5.C0509f;
import java.util.HashMap;

/* renamed from: com.mtma.criminal.city.fragments.gangBase.f  reason: case insensitive filesystem */
public final class C0426f extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7176a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0505b f7177b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0429i f7178c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0426f(C0429i iVar, RelativeLayout relativeLayout, C0505b bVar, int i2) {
        super(relativeLayout);
        this.f7176a = i2;
        this.f7178c = iVar;
        this.f7177b = bVar;
    }

    public final void onClick(View view) {
        switch (this.f7176a) {
            case 0:
                super.onClick(view);
                this.f7177b.dismiss();
                this.f7178c.f7191H0 = false;
                a.e(true).E(b.Z()).E("gangs").E("gangsData").E(o.getGangObject().getId()).E("imageUrl").I("removed_gang_pic").addOnSuccessListener(new R.b(this, 5));
                return;
            case 1:
                super.onClick(view);
                this.f7177b.dismiss();
                this.f7178c.f7191H0 = false;
                return;
            case 2:
                super.onClick(view);
                C0429i iVar = this.f7178c;
                iVar.getClass();
                b.w(true);
                C0424d dVar = new C0424d(iVar);
                HashMap hashMap = new HashMap();
                hashMap.put("serverNumber", Integer.valueOf(o.getAccountObject().getCurrentOpenedServer()));
                hashMap.put("playerId", o.getAccountObject().getId());
                hashMap.put("playerName", o.getMainStatesObject().getNickName());
                hashMap.put("gangId", o.getGangObject().getId());
                hashMap.put("gangName", o.getGangObject().getName());
                h.b().a("leaveGang").q(hashMap).addOnCompleteListener(new C0451v(dVar, 0));
                this.f7177b.dismiss();
                iVar.f7192I0 = false;
                return;
            default:
                super.onClick(view);
                this.f7177b.dismiss();
                this.f7178c.f7192I0 = false;
                return;
        }
    }
}
