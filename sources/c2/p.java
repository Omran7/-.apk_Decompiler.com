package C2;

import O2.Z;
import O2.f0;
import O2.g0;
import O2.h0;
import O2.i0;
import O2.j0;
import O2.k0;
import O2.r0;
import java.nio.charset.Charset;

public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f454a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static k0 a(g0 g0Var) {
        h0 B6 = k0.B();
        int D4 = g0Var.D();
        B6.e();
        k0.y((k0) B6.f6859b, D4);
        for (f0 f0Var : g0Var.C()) {
            i0 D6 = j0.D();
            String D7 = f0Var.C().D();
            D6.e();
            j0.y((j0) D6.f6859b, D7);
            Z F = f0Var.F();
            D6.e();
            j0.A((j0) D6.f6859b, F);
            r0 E6 = f0Var.E();
            D6.e();
            j0.z((j0) D6.f6859b, E6);
            int D8 = f0Var.D();
            D6.e();
            j0.B((j0) D6.f6859b, D8);
            B6.e();
            k0.z((k0) B6.f6859b, (j0) D6.b());
        }
        return (k0) B6.b();
    }
}
