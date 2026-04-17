package T1;

import H.j;
import com.google.android.gms.internal.measurement.zzcy;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

public final class A0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2797a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zzcy f2798b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f2799c;

    public /* synthetic */ A0(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcy zzcy, int i2) {
        this.f2797a = i2;
        this.f2798b = zzcy;
        this.f2799c = appMeasurementDynamiteService;
    }

    public final void run() {
        boolean z3;
        switch (this.f2797a) {
            case 0:
                C0219w1 r6 = this.f2799c.f6266a.r();
                r6.o();
                r6.p();
                r6.F(new j(r6, r6.C(false), this.f2798b, 9, false));
                return;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.f2799c;
                Y1 y12 = appMeasurementDynamiteService.f6266a.f3499u;
                C0212u0.i(y12);
                C0212u0 u0Var = appMeasurementDynamiteService.f6266a;
                if (u0Var.f3483K == null || !u0Var.f3483K.booleanValue()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                y12.K(this.f2798b, z3);
                return;
        }
    }
}
