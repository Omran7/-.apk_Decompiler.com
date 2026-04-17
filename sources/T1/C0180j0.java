package T1;

import D0.e;
import I1.c;
import android.text.TextUtils;
import android.util.Log;

/* renamed from: T1.j0  reason: case insensitive filesystem */
public final class C0180j0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3353a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final C0212u0 f3354b;

    public C0180j0(C0212u0 u0Var) {
        this.f3354b = u0Var;
    }

    public final boolean a() {
        switch (this.f3353a) {
            case 0:
                C0212u0 u0Var = this.f3354b;
                try {
                    e a6 = c.a(u0Var.f3489a);
                    if (a6 == null) {
                        Z z3 = u0Var.f3496r;
                        C0212u0.k(z3);
                        z3.f3180w.a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                        return false;
                    } else if (a6.i(128, "com.android.vending").versionCode >= 80837300) {
                        return true;
                    } else {
                        return false;
                    }
                } catch (Exception e6) {
                    Z z4 = u0Var.f3496r;
                    C0212u0.k(z4);
                    z4.f3180w.b(e6, "Failed to retrieve Play Store version for Install Referrer");
                    return false;
                }
            default:
                C0212u0 u0Var2 = this.f3354b;
                if (TextUtils.isEmpty(u0Var2.f3490b)) {
                    Z z5 = u0Var2.f3496r;
                    C0212u0.k(z5);
                    if (Log.isLoggable(z5.z(), 3)) {
                        return true;
                    }
                }
                return false;
        }
    }

    public C0180j0(T1 t12) {
        this.f3354b = t12.f3070u;
    }
}
