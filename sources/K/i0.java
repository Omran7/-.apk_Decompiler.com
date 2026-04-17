package K;

import android.os.Build;
import android.view.animation.Interpolator;

public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public h0 f1397a;

    public i0(int i2, Interpolator interpolator, long j6) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f1397a = new g0(e0.i(i2, interpolator, j6));
        } else {
            this.f1397a = new h0(i2, interpolator, j6);
        }
    }
}
