package T1;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.I;
import java.util.Objects;

public final /* synthetic */ class U0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0157b1 f3078a;

    public /* synthetic */ U0(C0157b1 b1Var) {
        this.f3078a = b1Var;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        C0157b1 b1Var = this.f3078a;
        C0212u0 u0Var = (C0212u0) b1Var.f398a;
        boolean B6 = u0Var.f3494p.B((String) null, H.f2917j1);
        Z z3 = u0Var.f3496r;
        if (!B6) {
            if (Objects.equals(str, "IABTCF_TCString")) {
                C0212u0.k(z3);
                z3.f3180w.a("IABTCF_TCString change picked up in listener.");
                V0 v02 = b1Var.f3243E;
                I.g(v02);
                v02.c(500);
            }
        } else if (Objects.equals(str, "IABTCF_TCString") || Objects.equals(str, "IABTCF_gdprApplies") || Objects.equals(str, "IABTCF_EnableAdvertiserConsentMode")) {
            C0212u0.k(z3);
            z3.f3180w.a("IABTCF_TCString change picked up in listener.");
            V0 v03 = b1Var.f3243E;
            I.g(v03);
            v03.c(500);
        }
    }
}
