package com.mtma.criminal.city.utils;

import U0.k;
import androidx.fragment.app.D;
import com.google.android.gms.tasks.OnSuccessListener;
import d5.C0473f;
import d5.o;

/* renamed from: com.mtma.criminal.city.utils.m  reason: case insensitive filesystem */
public final class C0443m implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7434a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f7435b;

    public /* synthetic */ C0443m(k kVar, int i2) {
        this.f7434a = i2;
        this.f7435b = kVar;
    }

    public final void onSuccess(Object obj) {
        switch (this.f7434a) {
            case 0:
                Void voidR = (Void) obj;
                o.getEstateObject().setLastTimeDailyTaxPaidInMilli(Long.valueOf(this.f7435b.f3689a));
                return;
            default:
                Void voidR2 = (Void) obj;
                C0473f estateObject = o.getEstateObject();
                k kVar = this.f7435b;
                estateObject.setLastTimeDailyTaxPaidInMilli(Long.valueOf(kVar.f3690b * 1000));
                D d = (D) kVar.f3691c;
                if (d != null) {
                    d.l(true);
                    return;
                }
                return;
        }
    }
}
