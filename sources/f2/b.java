package f2;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;
import m0.C0827t;
import m0.C0829v;
import m0.N;

public final class b extends C0827t {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f7902q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f7903r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Context context, int i2) {
        super(context);
        this.f7902q = i2;
        this.f7903r = obj;
    }

    public int b(View view, int i2) {
        switch (this.f7902q) {
            case 0:
                ((CarouselLayoutManager) this.f7903r).getClass();
                return 0;
            default:
                return super.b(view, i2);
        }
    }

    public int c(View view, int i2) {
        switch (this.f7902q) {
            case 0:
                ((CarouselLayoutManager) this.f7903r).getClass();
                return 0;
            default:
                return super.c(view, i2);
        }
    }

    public float d(DisplayMetrics displayMetrics) {
        switch (this.f7902q) {
            case 1:
                return 100.0f / ((float) displayMetrics.densityDpi);
            default:
                return super.d(displayMetrics);
        }
    }

    public int e(int i2) {
        switch (this.f7902q) {
            case 1:
                return Math.min(100, super.e(i2));
            default:
                return super.e(i2);
        }
    }

    public PointF f(int i2) {
        switch (this.f7902q) {
            case 0:
                ((CarouselLayoutManager) this.f7903r).getClass();
                return null;
            default:
                return super.f(i2);
        }
    }

    public void h(View view, N n2) {
        switch (this.f7902q) {
            case 1:
                C0829v vVar = (C0829v) this.f7903r;
                int[] a6 = vVar.a(vVar.f10063a.getLayoutManager(), view);
                int i2 = a6[0];
                int i5 = a6[1];
                int ceil = (int) Math.ceil(((double) e(Math.max(Math.abs(i2), Math.abs(i5)))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f10056j;
                    n2.f9870a = i2;
                    n2.f9871b = i5;
                    n2.f9872c = ceil;
                    n2.f9873e = decelerateInterpolator;
                    n2.f9874f = true;
                    return;
                }
                return;
            default:
                super.h(view, n2);
                return;
        }
    }
}
