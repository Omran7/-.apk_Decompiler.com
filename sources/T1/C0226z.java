package T1;

import android.os.Bundle;
import java.util.Iterator;
import n.b;
import n.e;
import n.j;

/* renamed from: T1.z  reason: case insensitive filesystem */
public final class C0226z extends D {

    /* renamed from: b  reason: collision with root package name */
    public final e f3550b = new j(0);

    /* renamed from: c  reason: collision with root package name */
    public final e f3551c = new j(0);
    public long d;

    /* JADX WARNING: type inference failed for: r2v1, types: [n.e, n.j] */
    /* JADX WARNING: type inference failed for: r2v2, types: [n.e, n.j] */
    public C0226z(C0212u0 u0Var) {
        super(u0Var);
    }

    public final void p(String str, long j6) {
        C0212u0 u0Var = (C0212u0) this.f398a;
        if (str == null || str.length() == 0) {
            Z z3 = u0Var.f3496r;
            C0212u0.k(z3);
            z3.f3172f.a("Ad unit id must be a non-empty string");
            return;
        }
        C0203r0 r0Var = u0Var.f3497s;
        C0212u0.k(r0Var);
        r0Var.y(new C0152a(this, str, j6, 0));
    }

    public final void q(String str, long j6) {
        C0212u0 u0Var = (C0212u0) this.f398a;
        if (str == null || str.length() == 0) {
            Z z3 = u0Var.f3496r;
            C0212u0.k(z3);
            z3.f3172f.a("Ad unit id must be a non-empty string");
            return;
        }
        C0203r0 r0Var = u0Var.f3497s;
        C0212u0.k(r0Var);
        r0Var.y(new C0152a(this, str, j6, 1));
    }

    public final void r(long j6) {
        C0190m1 m1Var = ((C0212u0) this.f398a).f3502x;
        C0212u0.j(m1Var);
        C0181j1 v6 = m1Var.v(false);
        e eVar = this.f3550b;
        Iterator it2 = ((b) eVar.keySet()).iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            t(str, j6 - ((Long) eVar.get(str)).longValue(), v6);
        }
        if (!eVar.isEmpty()) {
            s(j6 - this.d, v6);
        }
        u(j6);
    }

    public final void s(long j6, C0181j1 j1Var) {
        C0212u0 u0Var = (C0212u0) this.f398a;
        if (j1Var == null) {
            Z z3 = u0Var.f3496r;
            C0212u0.k(z3);
            z3.f3180w.a("Not logging ad exposure. No active activity");
        } else if (j6 < 1000) {
            Z z4 = u0Var.f3496r;
            C0212u0.k(z4);
            z4.f3180w.b(Long.valueOf(j6), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j6);
            Y1.E(j1Var, bundle, true);
            C0157b1 b1Var = u0Var.f3503y;
            C0212u0.j(b1Var);
            b1Var.z("am", "_xa", bundle);
        }
    }

    public final void t(String str, long j6, C0181j1 j1Var) {
        C0212u0 u0Var = (C0212u0) this.f398a;
        if (j1Var == null) {
            Z z3 = u0Var.f3496r;
            C0212u0.k(z3);
            z3.f3180w.a("Not logging ad unit exposure. No active activity");
        } else if (j6 < 1000) {
            Z z4 = u0Var.f3496r;
            C0212u0.k(z4);
            z4.f3180w.b(Long.valueOf(j6), "Not logging ad unit exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j6);
            Y1.E(j1Var, bundle, true);
            C0157b1 b1Var = u0Var.f3503y;
            C0212u0.j(b1Var);
            b1Var.z("am", "_xu", bundle);
        }
    }

    public final void u(long j6) {
        e eVar = this.f3550b;
        Iterator it2 = ((b) eVar.keySet()).iterator();
        while (it2.hasNext()) {
            eVar.put((String) it2.next(), Long.valueOf(j6));
        }
        if (!eVar.isEmpty()) {
            this.d = j6;
        }
    }
}
