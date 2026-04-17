package com.mtma.criminal.city.utils;

import R2.b;
import R2.l;
import S3.t;
import X4.d;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.tasks.OnFailureListener;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import f3.C0531h;
import h0.C0552a;
import j4.C0615b0;

/* renamed from: com.mtma.criminal.city.utils.w  reason: case insensitive filesystem */
public final class C0452w implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7485a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f7486b;

    public /* synthetic */ C0452w(Object obj, int i2) {
        this.f7485a = i2;
        this.f7486b = obj;
    }

    public final void onFailure(Exception exc) {
        long j6;
        switch (this.f7485a) {
            case 0:
                ((C0454y) ((d) ((t) this.f7486b).f2700b).f4210c).f(false, true, false, true, false);
                return;
            case 1:
                b.w(false);
                a.n(MyApplication.f7090a, R.string.unknown_error_try_again, ((h0) this.f7486b).f7420b, (String) null);
                return;
            case 2:
                if (exc instanceof l) {
                    C1.a aVar = C0531h.f7938f;
                    aVar.e("Failure to refresh token; scheduling refresh after failure", new Object[0]);
                    C0531h hVar = (C0531h) ((B2.a) this.f7486b).f343c;
                    int i2 = (int) hVar.f7940b;
                    if (i2 == 30 || i2 == 60 || i2 == 120 || i2 == 240 || i2 == 480) {
                        j6 = 2 * hVar.f7940b;
                    } else if (i2 != 960) {
                        j6 = 30;
                    } else {
                        j6 = 960;
                    }
                    hVar.f7940b = j6;
                    hVar.f7939a = (hVar.f7940b * 1000) + System.currentTimeMillis();
                    aVar.e(C0552a.m("Scheduling refresh for ", hVar.f7939a), new Object[0]);
                    hVar.d.postDelayed(hVar.f7942e, hVar.f7940b * 1000);
                    return;
                }
                return;
            default:
                b.w(false);
                a.n(MyApplication.f7090a, R.string.unknown_error_try_again, ((C0615b0) this.f7486b).f8978b, (String) null);
                return;
        }
    }
}
