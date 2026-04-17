package K;

import C.g;
import android.view.View;
import android.view.WindowInsets;

public class r0 extends q0 {

    /* renamed from: n  reason: collision with root package name */
    public g f1421n = null;

    /* renamed from: o  reason: collision with root package name */
    public g f1422o = null;

    /* renamed from: p  reason: collision with root package name */
    public g f1423p = null;

    public r0(v0 v0Var, WindowInsets windowInsets) {
        super(v0Var, windowInsets);
    }

    public g g() {
        if (this.f1422o == null) {
            this.f1422o = g.c(this.f1417c.getMandatorySystemGestureInsets());
        }
        return this.f1422o;
    }

    public g i() {
        if (this.f1421n == null) {
            this.f1421n = g.c(this.f1417c.getSystemGestureInsets());
        }
        return this.f1421n;
    }

    public g k() {
        if (this.f1423p == null) {
            this.f1423p = g.c(this.f1417c.getTappableElementInsets());
        }
        return this.f1423p;
    }

    public v0 l(int i2, int i5, int i6, int i7) {
        return v0.g((View) null, this.f1417c.inset(i2, i5, i6, i7));
    }

    public void q(g gVar) {
    }
}
