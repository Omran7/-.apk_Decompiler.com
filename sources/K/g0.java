package K;

import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

public final class g0 extends h0 {

    /* renamed from: e  reason: collision with root package name */
    public final WindowInsetsAnimation f1392e;

    public g0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, (Interpolator) null, 0);
        this.f1392e = windowInsetsAnimation;
    }

    public final long a() {
        return this.f1392e.getDurationMillis();
    }

    public final float b() {
        return this.f1392e.getInterpolatedFraction();
    }

    public final int c() {
        return this.f1392e.getTypeMask();
    }

    public final void d(float f6) {
        this.f1392e.setFraction(f6);
    }
}
