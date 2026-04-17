package T1;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzde;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

public final class V1 implements M0 {

    /* renamed from: a  reason: collision with root package name */
    public final zzde f3128a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f3129b;

    public V1(AppMeasurementDynamiteService appMeasurementDynamiteService, zzde zzde) {
        this.f3129b = appMeasurementDynamiteService;
        this.f3128a = zzde;
    }

    public final void a(String str, String str2, Bundle bundle, long j6) {
        try {
            this.f3128a.zzf(str, str2, bundle, j6);
        } catch (RemoteException e6) {
            C0212u0 u0Var = this.f3129b.f6266a;
            if (u0Var != null) {
                Z z3 = u0Var.f3496r;
                C0212u0.k(z3);
                z3.f3175r.b(e6, "Event listener threw exception");
            }
        }
    }
}
