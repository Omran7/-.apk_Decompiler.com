package com.mtma.criminal.city.activities;

import J.a;
import R2.i;
import Z2.e;
import i3.C0592h;

public final /* synthetic */ class q implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7075a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ StartActivity f7076b;

    public /* synthetic */ q(StartActivity startActivity, int i2) {
        this.f7075a = i2;
        this.f7076b = startActivity;
    }

    public final void accept(Object obj) {
        StartActivity startActivity = this.f7076b;
        Boolean bool = (Boolean) obj;
        switch (this.f7075a) {
            case 0:
                boolean z3 = StartActivity.f7025b0;
                startActivity.getClass();
                if (bool.booleanValue()) {
                    ((e) i.e().c(e.class)).b(true).addOnSuccessListener(new H4.e(startActivity, 9));
                    return;
                } else {
                    startActivity.q();
                    return;
                }
            default:
                boolean z4 = StartActivity.f7025b0;
                startActivity.getClass();
                if (bool.booleanValue()) {
                    C0592h.b().e().E("BetaVersion").E("allowed_devices").E(K1.e.u()).d(new t(startActivity, 1));
                    return;
                } else {
                    startActivity.q();
                    return;
                }
        }
    }
}
