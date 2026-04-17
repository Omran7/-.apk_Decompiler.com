package r0;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public final class h extends Animation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11163a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f11164b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f11165c;

    public h(SwipeRefreshLayout swipeRefreshLayout, int i2, int i5) {
        this.f11165c = swipeRefreshLayout;
        this.f11163a = i2;
        this.f11164b = i5;
    }

    public final void applyTransformation(float f6, Transformation transformation) {
        C0944e eVar = this.f11165c.f5420I;
        int i2 = this.f11163a;
        eVar.setAlpha((int) ((((float) (this.f11164b - i2)) * f6) + ((float) i2)));
    }
}
