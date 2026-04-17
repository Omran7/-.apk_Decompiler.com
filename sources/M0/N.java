package m0;

import android.util.Log;
import android.view.animation.BaseInterpolator;
import androidx.recyclerview.widget.RecyclerView;

public final class N {

    /* renamed from: a  reason: collision with root package name */
    public int f9870a;

    /* renamed from: b  reason: collision with root package name */
    public int f9871b;

    /* renamed from: c  reason: collision with root package name */
    public int f9872c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public BaseInterpolator f9873e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f9874f;
    public int g;

    public final void a(RecyclerView recyclerView) {
        int i2 = this.d;
        if (i2 >= 0) {
            this.d = -1;
            recyclerView.M(i2);
            this.f9874f = false;
        } else if (this.f9874f) {
            BaseInterpolator baseInterpolator = this.f9873e;
            if (baseInterpolator == null || this.f9872c >= 1) {
                int i5 = this.f9872c;
                if (i5 >= 1) {
                    recyclerView.f5362i0.b(this.f9870a, this.f9871b, i5, baseInterpolator);
                    int i6 = this.g + 1;
                    this.g = i6;
                    if (i6 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f9874f = false;
                    return;
                }
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        } else {
            this.g = 0;
        }
    }
}
