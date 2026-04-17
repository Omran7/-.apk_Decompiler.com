package T1;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzgo;

public final class Q1 extends K1 {
    public static final boolean r(String str) {
        String str2 = (String) H.f2943t.a((Object) null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String trim : str2.split(",")) {
            if (str.equalsIgnoreCase(trim.trim())) {
                return true;
            }
        }
        return false;
    }

    public final String p(String str) {
        C0192n0 n0Var = this.f2982b.f3060a;
        T1.L(n0Var);
        String E6 = n0Var.E(str);
        if (TextUtils.isEmpty(E6)) {
            return (String) H.f2939r.a((Object) null);
        }
        Uri parse = Uri.parse((String) H.f2939r.a((Object) null));
        Uri.Builder buildUpon = parse.buildUpon();
        String authority = parse.getAuthority();
        buildUpon.authority(E6 + "." + authority);
        return buildUpon.build().toString();
    }

    public final boolean q(String str, String str2) {
        T1 t12 = this.f2982b;
        C0192n0 n0Var = t12.f3060a;
        T1.L(n0Var);
        zzgo D4 = n0Var.D(str);
        if (D4 == null) {
            return false;
        }
        C0191n nVar = t12.f3062c;
        T1.L(nVar);
        V l02 = nVar.l0(str);
        if (l02 == null) {
            return false;
        }
        if (!D4.zzv() || D4.zzi().zza() != 100) {
            Y1 y12 = ((C0212u0) this.f398a).f3499u;
            C0212u0.i(y12);
            if (!y12.e0(str, l02.i())) {
                if (TextUtils.isEmpty(str2) || Math.abs(str2.hashCode() % 100) >= D4.zzi().zza()) {
                    return false;
                }
                return true;
            }
        }
        return true;
    }
}
