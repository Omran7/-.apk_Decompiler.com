package K;

import C.g;
import android.view.View;
import android.view.WindowInsets;

public class p0 extends o0 {

    /* renamed from: m  reason: collision with root package name */
    public g f1420m = null;

    public p0(v0 v0Var, WindowInsets windowInsets) {
        super(v0Var, windowInsets);
    }

    public v0 b() {
        return v0.g((View) null, this.f1417c.consumeStableInsets());
    }

    public v0 c() {
        return v0.g((View) null, this.f1417c.consumeSystemWindowInsets());
    }

    public final g h() {
        if (this.f1420m == null) {
            WindowInsets windowInsets = this.f1417c;
            this.f1420m = g.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f1420m;
    }

    public boolean m() {
        return this.f1417c.isConsumed();
    }

    public void q(g gVar) {
        this.f1420m = gVar;
    }
}
