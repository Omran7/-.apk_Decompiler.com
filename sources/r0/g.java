package r0;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public final class g extends Animation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11161a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f11162b;

    public /* synthetic */ g(SwipeRefreshLayout swipeRefreshLayout, int i2) {
        this.f11161a = i2;
        this.f11162b = swipeRefreshLayout;
    }

    public final void applyTransformation(float f6, Transformation transformation) {
        switch (this.f11161a) {
            case 0:
                this.f11162b.setAnimationProgress(f6);
                return;
            case 1:
                this.f11162b.setAnimationProgress(1.0f - f6);
                return;
            case 2:
                SwipeRefreshLayout swipeRefreshLayout = this.f11162b;
                swipeRefreshLayout.getClass();
                int abs = swipeRefreshLayout.f5418G - Math.abs(swipeRefreshLayout.F);
                int i2 = swipeRefreshLayout.f5417E;
                swipeRefreshLayout.setTargetOffsetTopAndBottom((i2 + ((int) (((float) (abs - i2)) * f6))) - swipeRefreshLayout.f5415C.getTop());
                C0944e eVar = swipeRefreshLayout.f5420I;
                float f7 = 1.0f - f6;
                C0943d dVar = eVar.f11154a;
                if (f7 != dVar.f11145p) {
                    dVar.f11145p = f7;
                }
                eVar.invalidateSelf();
                return;
            default:
                this.f11162b.k(f6);
                return;
        }
    }
}
