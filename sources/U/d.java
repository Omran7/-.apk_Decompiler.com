package U;

import android.view.animation.Interpolator;

public final class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3651a;

    public /* synthetic */ d(int i2) {
        this.f3651a = i2;
    }

    public final float getInterpolation(float f6) {
        switch (this.f3651a) {
            case 0:
                float f7 = f6 - 1.0f;
                return (f7 * f7 * f7 * f7 * f7) + 1.0f;
            case 1:
                return Math.abs(f6 - 1.0f);
            default:
                float f8 = f6 - 1.0f;
                return (f8 * f8 * f8 * f8 * f8) + 1.0f;
        }
    }
}
