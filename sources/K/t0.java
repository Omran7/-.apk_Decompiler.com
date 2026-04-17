package K;

import C.g;
import android.os.Build;
import android.view.View;
import java.util.Objects;

public class t0 {

    /* renamed from: b  reason: collision with root package name */
    public static final v0 f1428b;

    /* renamed from: a  reason: collision with root package name */
    public final v0 f1429a;

    static {
        n0 n0Var;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            n0Var = new m0();
        } else if (i2 >= 29) {
            n0Var = new l0();
        } else {
            n0Var = new k0();
        }
        f1428b = n0Var.b().f1432a.a().f1432a.b().f1432a.c();
    }

    public t0(v0 v0Var) {
        this.f1429a = v0Var;
    }

    public v0 a() {
        return this.f1429a;
    }

    public v0 b() {
        return this.f1429a;
    }

    public v0 c() {
        return this.f1429a;
    }

    public C0069i e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        if (n() != t0Var.n() || m() != t0Var.m() || !Objects.equals(j(), t0Var.j()) || !Objects.equals(h(), t0Var.h()) || !Objects.equals(e(), t0Var.e())) {
            return false;
        }
        return true;
    }

    public g f(int i2) {
        return g.f373e;
    }

    public g g() {
        return j();
    }

    public g h() {
        return g.f373e;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e()});
    }

    public g i() {
        return j();
    }

    public g j() {
        return g.f373e;
    }

    public g k() {
        return j();
    }

    public v0 l(int i2, int i5, int i6, int i7) {
        return f1428b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void d(View view) {
    }

    public void o(g[] gVarArr) {
    }

    public void p(v0 v0Var) {
    }

    public void q(g gVar) {
    }
}
