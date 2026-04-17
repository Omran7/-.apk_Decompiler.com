package com.mtma.criminal.city.fragments.gangBase;

import F3.h;
import J.a;
import R2.b;
import T1.A;
import X4.d;
import Y4.D;
import android.content.Context;
import c1.i;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.C0451v;
import d5.o;
import java.util.HashMap;

/* renamed from: com.mtma.criminal.city.fragments.gangBase.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0421a implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7157a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f7158b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f7159c;
    public final /* synthetic */ Object d;

    public /* synthetic */ C0421a(Object obj, Object obj2, Object obj3, int i2) {
        this.f7157a = i2;
        this.f7158b = obj;
        this.f7159c = obj2;
        this.d = obj3;
    }

    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f7157a) {
            case 0:
                C0423c cVar = (C0423c) this.f7158b;
                cVar.getClass();
                A a6 = new A((Object) cVar, 24);
                HashMap hashMap = new HashMap();
                hashMap.put("serverNumber", Integer.valueOf(o.getAccountObject().getCurrentOpenedServer()));
                hashMap.put("gangBossId", o.getAccountObject().getId());
                hashMap.put("gangBossName", o.getMainStatesObject().getNickName());
                hashMap.put("gangName", (String) this.f7159c);
                hashMap.put("gangTag", (String) this.d);
                h.b().a("createNewGang").q(hashMap).addOnCompleteListener(new C0451v(a6, 1));
                return;
            default:
                boolean booleanValue = bool.booleanValue();
                Context context = (Context) this.d;
                if (booleanValue) {
                    D d6 = (D) this.f7158b;
                    i iVar = new i((Object) (d) this.f7159c, (Object) d6, (Object) context, 3);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("serverNumber", Integer.valueOf(o.getAccountObject().getCurrentOpenedServer()));
                    hashMap2.put("playerId", o.getAccountObject().getId());
                    hashMap2.put("materialType", Integer.valueOf(d6.f4294b));
                    hashMap2.put("materialId", Integer.valueOf(d6.f4293a));
                    hashMap2.put("materialLevel", Integer.valueOf(d6.f4298i));
                    hashMap2.put("isGun", Boolean.valueOf(d6.f4307r));
                    h.b().a("useMaterialInArming").q(hashMap2).addOnCompleteListener(new H4.d((Object) iVar, 16));
                    return;
                }
                b.w(false);
                com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.no_internet_connection, context, (String) null);
                return;
        }
    }
}
