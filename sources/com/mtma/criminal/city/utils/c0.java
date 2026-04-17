package com.mtma.criminal.city.utils;

import F3.h;
import J.a;
import Z4.q;
import d5.o;
import java.util.HashMap;
import k.C0724m;

public final /* synthetic */ class c0 implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f7395a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f7396b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f7397c;
    public final /* synthetic */ long d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C0724m f7398e;

    public /* synthetic */ c0(String str, String str2, String str3, long j6, C0724m mVar) {
        this.f7395a = str;
        this.f7396b = str2;
        this.f7397c = str3;
        this.d = j6;
        this.f7398e = mVar;
    }

    public final void accept(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C0724m mVar = this.f7398e;
        if (booleanValue) {
            HashMap hashMap = new HashMap();
            hashMap.put("serverNumber", Integer.valueOf(o.getAccountObject().getCurrentOpenedServer()));
            hashMap.put("playerId", o.getAccountObject().getId());
            hashMap.put("productId", this.f7395a);
            hashMap.put("orderId", this.f7396b);
            hashMap.put("purchaseToken", this.f7397c);
            hashMap.put("purchaseTime", Long.valueOf(this.d));
            h.b().a("purchaseProduct").q(hashMap).addOnCompleteListener(new C0451v(mVar, 7));
            return;
        }
        mVar.E(new q());
    }
}
