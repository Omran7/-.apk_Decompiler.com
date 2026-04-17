package K;

import C.g;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

public final class a0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i0 f1364a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v0 f1365b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ v0 f1366c;
    public final /* synthetic */ int d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ View f1367e;

    public a0(i0 i0Var, v0 v0Var, v0 v0Var2, int i2, View view) {
        this.f1364a = i0Var;
        this.f1365b = v0Var;
        this.f1366c = v0Var2;
        this.d = i2;
        this.f1367e = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        n0 n0Var;
        float f6;
        i0 i0Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        i0 i0Var2 = this.f1364a;
        i0Var2.f1397a.d(animatedFraction);
        float b6 = i0Var2.f1397a.b();
        PathInterpolator pathInterpolator = d0.f1381e;
        int i2 = Build.VERSION.SDK_INT;
        v0 v0Var = this.f1365b;
        if (i2 >= 30) {
            n0Var = new m0(v0Var);
        } else if (i2 >= 29) {
            n0Var = new l0(v0Var);
        } else {
            n0Var = new k0(v0Var);
        }
        int i5 = 1;
        while (i5 <= 256) {
            int i6 = this.d & i5;
            t0 t0Var = v0Var.f1432a;
            if (i6 == 0) {
                n0Var.c(i5, t0Var.f(i5));
                f6 = b6;
                i0Var = i0Var2;
            } else {
                g f7 = t0Var.f(i5);
                g f8 = this.f1366c.f1432a.f(i5);
                float f9 = 1.0f - b6;
                f6 = b6;
                i0Var = i0Var2;
                n0Var.c(i5, v0.e(f7, (int) (((double) (((float) (f7.f374a - f8.f374a)) * f9)) + 0.5d), (int) (((double) (((float) (f7.f375b - f8.f375b)) * f9)) + 0.5d), (int) (((double) (((float) (f7.f376c - f8.f376c)) * f9)) + 0.5d), (int) (((double) (((float) (f7.d - f8.d)) * f9)) + 0.5d)));
            }
            i5 <<= 1;
            b6 = f6;
            i0Var2 = i0Var;
        }
        d0.g(this.f1367e, n0Var.b(), Collections.singletonList(i0Var2));
    }
}
