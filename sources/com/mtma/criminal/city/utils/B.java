package com.mtma.criminal.city.utils;

import R2.b;
import S3.t;
import a1.C0258c;
import com.google.android.gms.tasks.OnSuccessListener;
import d5.k;
import d5.o;

public final class B implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7342a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t f7343b;

    public /* synthetic */ B(t tVar, int i2) {
        this.f7342a = i2;
        this.f7343b = tVar;
    }

    public final void onSuccess(Object obj) {
        switch (this.f7342a) {
            case 0:
                Void voidR = (Void) obj;
                k mainStatesObject = o.getMainStatesObject();
                C0258c cVar = (C0258c) this.f7343b.f2700b;
                mainStatesObject.setCourageDoubleEffectEndTime(b.K(cVar.f4550b) + cVar.f4551c);
                return;
            default:
                Void voidR2 = (Void) obj;
                k mainStatesObject2 = o.getMainStatesObject();
                C0258c cVar2 = (C0258c) this.f7343b.f2700b;
                mainStatesObject2.setHealthDoubleEffectEndTime(b.K(cVar2.f4550b) + cVar2.f4551c);
                return;
        }
    }
}
