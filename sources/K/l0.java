package K;

import C.e;
import C.g;
import android.view.View;
import android.view.WindowInsets;

public class l0 extends n0 {

    /* renamed from: c  reason: collision with root package name */
    public final WindowInsets.Builder f1408c;

    public l0() {
        this.f1408c = e.e();
    }

    public v0 b() {
        a();
        v0 g = v0.g((View) null, this.f1408c.build());
        g.f1432a.o(this.f1410b);
        return g;
    }

    public void d(g gVar) {
        this.f1408c.setMandatorySystemGestureInsets(gVar.d());
    }

    public void e(g gVar) {
        this.f1408c.setStableInsets(gVar.d());
    }

    public void f(g gVar) {
        this.f1408c.setSystemGestureInsets(gVar.d());
    }

    public void g(g gVar) {
        this.f1408c.setSystemWindowInsets(gVar.d());
    }

    public void h(g gVar) {
        this.f1408c.setTappableElementInsets(gVar.d());
    }

    public l0(v0 v0Var) {
        super(v0Var);
        WindowInsets.Builder builder;
        WindowInsets f6 = v0Var.f();
        if (f6 != null) {
            builder = e.f(f6);
        } else {
            builder = e.e();
        }
        this.f1408c = builder;
    }
}
