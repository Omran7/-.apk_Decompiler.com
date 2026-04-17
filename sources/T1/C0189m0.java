package T1;

import B0.C0009h;
import android.text.TextUtils;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzgo;
import n.e;
import n.i;

/* renamed from: T1.m0  reason: case insensitive filesystem */
public final class C0189m0 extends i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0192n0 f3379a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0189m0(C0192n0 n0Var) {
        super(20);
        this.f3379a = n0Var;
    }

    public final Object create(Object obj) {
        String str = (String) obj;
        I.d(str);
        C0192n0 n0Var = this.f3379a;
        boolean B6 = ((C0212u0) n0Var.f398a).f3494p.B((String) null, H.f2929n1);
        C0189m0 m0Var = n0Var.f3406s;
        if (B6) {
            n0Var.p();
            I.d(str);
            C0191n nVar = n0Var.f2982b.f3062c;
            T1.L(nVar);
            C0009h n02 = nVar.n0(str);
            if (n02 == null) {
                return null;
            }
            Z z3 = ((C0212u0) n0Var.f398a).f3496r;
            C0212u0.k(z3);
            z3.f3180w.b(str, "Populate EES config from database on cache miss. appId");
            n0Var.x(str, n0Var.u(str, (byte[]) n02.f228b));
            return (zzc) m0Var.snapshot().get(str);
        }
        n0Var.p();
        I.d(str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        e eVar = n0Var.f3404q;
        zzgo zzgo = (zzgo) eVar.get(str);
        if (zzgo == null || zzgo.zza() == 0) {
            return null;
        }
        if (!eVar.containsKey(str) || eVar.get(str) == null) {
            n0Var.w(str);
        } else {
            n0Var.x(str, (zzgo) eVar.get(str));
        }
        return (zzc) m0Var.snapshot().get(str);
    }
}
