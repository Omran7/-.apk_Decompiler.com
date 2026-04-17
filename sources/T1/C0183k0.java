package T1;

import I3.h;
import com.google.android.gms.internal.measurement.zzn;
import com.google.android.gms.internal.measurement.zzu;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: T1.k0  reason: case insensitive filesystem */
public final /* synthetic */ class C0183k0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3363a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0192n0 f3364b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f3365c;

    public /* synthetic */ C0183k0(C0192n0 n0Var, String str, int i2) {
        this.f3363a = i2;
        this.f3364b = n0Var;
        this.f3365c = str;
    }

    public final Object call() {
        switch (this.f3363a) {
            case 0:
                return new zzn("internal.remoteConfig", new h((Object) this.f3364b, (Object) this.f3365c, 23));
            case 1:
                return new zzu("internal.appMetadata", new C0183k0(this.f3364b, this.f3365c, 2));
            default:
                C0192n0 n0Var = this.f3364b;
                C0191n nVar = n0Var.f2982b.f3062c;
                T1.L(nVar);
                String str = this.f3365c;
                V l02 = nVar.l0(str);
                HashMap hashMap = new HashMap();
                hashMap.put("platform", "android");
                hashMap.put("package_name", str);
                ((C0212u0) n0Var.f398a).f3494p.v();
                hashMap.put("gmp_version", 119002L);
                if (l02 != null) {
                    String e6 = l02.e();
                    if (e6 != null) {
                        hashMap.put("app_version", e6);
                    }
                    hashMap.put("app_version_int", Long.valueOf(l02.S()));
                    hashMap.put("dynamite_version", Long.valueOf(l02.T()));
                }
                return hashMap;
        }
    }
}
