package T1;

import S3.r;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

public final /* synthetic */ class T0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3039a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0157b1 f3040b;

    public /* synthetic */ T0(C0157b1 b1Var, int i2) {
        this.f3039a = i2;
        this.f3040b = b1Var;
    }

    public final void run() {
        String str;
        switch (this.f3039a) {
            case 0:
                C0157b1 b1Var = this.f3040b;
                b1Var.o();
                C0212u0 u0Var = (C0212u0) b1Var.f398a;
                C0174h0 h0Var = u0Var.f3495q;
                C0212u0.i(h0Var);
                boolean b6 = h0Var.f3314D.b();
                Z z3 = u0Var.f3496r;
                if (!b6) {
                    C0174h0 h0Var2 = u0Var.f3495q;
                    C0212u0.i(h0Var2);
                    C0171g0 g0Var = h0Var2.f3315E;
                    long a6 = g0Var.a();
                    g0Var.b(1 + a6);
                    if (a6 >= 5) {
                        C0212u0.k(z3);
                        z3.f3175r.a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        h0Var2.f3314D.a(true);
                        return;
                    }
                    if (b1Var.f3241C == null) {
                        b1Var.f3241C = new V0(b1Var, u0Var, 3);
                    }
                    b1Var.f3241C.c(0);
                    return;
                }
                C0212u0.k(z3);
                z3.f3179v.a("Deferred Deep Link already retrieved. Not fetching again.");
                return;
            case 1:
                this.f3040b.w();
                return;
            case 2:
                C0206s0 s0Var = this.f3040b.f3239A;
                C0212u0 u0Var2 = s0Var.f3464a;
                C0203r0 r0Var = u0Var2.f3497s;
                C0212u0.k(r0Var);
                r0Var.o();
                if (s0Var.c()) {
                    boolean d = s0Var.d();
                    C0157b1 b1Var2 = u0Var2.f3503y;
                    C0174h0 h0Var3 = u0Var2.f3495q;
                    if (d) {
                        C0212u0.i(h0Var3);
                        h0Var3.f3316G.D((String) null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1);
                        C0212u0.j(b1Var2);
                        b1Var2.z("auto", "_cmpx", bundle);
                    } else {
                        C0212u0.i(h0Var3);
                        r rVar = h0Var3.f3316G;
                        String C6 = rVar.C();
                        if (TextUtils.isEmpty(C6)) {
                            Z z4 = u0Var2.f3496r;
                            C0212u0.k(z4);
                            z4.f3173p.a("Cache still valid but referrer not found");
                        } else {
                            long a7 = h0Var3.f3317H.a() / 3600000;
                            Uri parse = Uri.parse(C6);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(parse.getPath(), bundle2);
                            for (String next : parse.getQueryParameterNames()) {
                                bundle2.putString(next, parse.getQueryParameter(next));
                            }
                            ((Bundle) pair.second).putLong("_cc", (a7 - 1) * 3600000);
                            Object obj = pair.first;
                            if (obj == null) {
                                str = "app";
                            } else {
                                str = (String) obj;
                            }
                            C0212u0.j(b1Var2);
                            b1Var2.z(str, "_cmp", (Bundle) pair.second);
                        }
                        rVar.D((String) null);
                    }
                    C0212u0.i(h0Var3);
                    h0Var3.f3317H.b(0);
                    return;
                }
                return;
            default:
                this.f3040b.w();
                return;
        }
    }
}
