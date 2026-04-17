package w0;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.gms.internal.play_billing.zzav;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzr;

/* renamed from: w0.l  reason: case insensitive filesystem */
public final /* synthetic */ class C1065l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1068o f12382a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f12383b;

    public /* synthetic */ C1065l(C1068o oVar, int i2) {
        this.f12382a = oVar;
        this.f12383b = i2;
    }

    public final void a(zzr zzr) {
        String str;
        C1068o oVar = this.f12382a;
        int i2 = this.f12383b;
        oVar.getClass();
        try {
            if (oVar.f12388B != null) {
                zzav zzav = oVar.f12388B;
                String packageName = oVar.f12391z.getPackageName();
                switch (i2) {
                    case 2:
                        str = "LAUNCH_BILLING_FLOW";
                        break;
                    case 3:
                        str = "ACKNOWLEDGE_PURCHASE";
                        break;
                    case 4:
                        str = "CONSUME_ASYNC";
                        break;
                    case 5:
                        str = "IS_FEATURE_SUPPORTED";
                        break;
                    case zzaky.zzf.zzf:
                        str = "START_CONNECTION";
                        break;
                    case zzaky.zzf.zzg:
                        str = "QUERY_PRODUCT_DETAILS_ASYNC";
                        break;
                    default:
                        str = "QUERY_SKU_DETAILS_ASYNC";
                        break;
                }
                zzav.zza(packageName, str, new C1066m(zzr));
                return;
            }
            throw null;
        } catch (Exception e6) {
            oVar.A(107, 28, C1073t.f12406q);
            zze.zzm("BillingClientTesting", "An error occurred while retrieving billing override.", e6);
            zzr.zzb(0);
        }
    }
}
