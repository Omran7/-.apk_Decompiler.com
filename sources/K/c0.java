package K;

import C.g;
import H.j;
import I3.e;
import I3.h;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.util.Objects;
import java.util.WeakHashMap;

public final class c0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a  reason: collision with root package name */
    public final e f1374a;

    /* renamed from: b  reason: collision with root package name */
    public v0 f1375b;

    public c0(View view, e eVar) {
        v0 v0Var;
        n0 n0Var;
        this.f1374a = eVar;
        WeakHashMap weakHashMap = O.f1352a;
        v0 a6 = E.a(view);
        if (a6 != null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                n0Var = new m0(a6);
            } else if (i2 >= 29) {
                n0Var = new l0(a6);
            } else {
                n0Var = new k0(a6);
            }
            v0Var = n0Var.b();
        } else {
            v0Var = null;
        }
        this.f1375b = v0Var;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        t0 t0Var;
        Interpolator interpolator;
        View view2 = view;
        WindowInsets windowInsets2 = windowInsets;
        if (!view.isLaidOut()) {
            this.f1375b = v0.g(view, windowInsets);
            return d0.i(view, windowInsets);
        }
        v0 g = v0.g(view, windowInsets);
        if (this.f1375b == null) {
            WeakHashMap weakHashMap = O.f1352a;
            this.f1375b = E.a(view);
        }
        if (this.f1375b == null) {
            this.f1375b = g;
            return d0.i(view, windowInsets);
        }
        e j6 = d0.j(view);
        if (j6 != null && Objects.equals((WindowInsets) j6.f1170b, windowInsets2)) {
            return d0.i(view, windowInsets);
        }
        v0 v0Var = this.f1375b;
        int i2 = 1;
        int i5 = 0;
        while (true) {
            t0Var = g.f1432a;
            if (i2 > 256) {
                break;
            }
            if (!t0Var.f(i2).equals(v0Var.f1432a.f(i2))) {
                i5 |= i2;
            }
            i2 <<= 1;
        }
        if (i5 == 0) {
            return d0.i(view, windowInsets);
        }
        v0 v0Var2 = this.f1375b;
        if ((i5 & 8) == 0) {
            interpolator = d0.g;
        } else if (t0Var.f(8).d > v0Var2.f1432a.f(8).d) {
            interpolator = d0.f1381e;
        } else {
            interpolator = d0.f1382f;
        }
        i0 i0Var = new i0(i5, interpolator, 160);
        i0Var.f1397a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(i0Var.f1397a.a());
        g f6 = t0Var.f(i5);
        g f7 = v0Var2.f1432a.f(i5);
        int min = Math.min(f6.f374a, f7.f374a);
        int i6 = f6.f375b;
        int i7 = f7.f375b;
        int min2 = Math.min(i6, i7);
        int i8 = f6.f376c;
        int i9 = f7.f376c;
        int min3 = Math.min(i8, i9);
        ValueAnimator valueAnimator = duration;
        int i10 = f6.d;
        int i11 = i5;
        int i12 = f7.d;
        h hVar = new h(g.b(min, min2, min3, Math.min(i10, i12)), g.b(Math.max(f6.f374a, f7.f374a), Math.max(i6, i7), Math.max(i8, i9), Math.max(i10, i12)), 15, false);
        d0.f(view2, windowInsets2, false);
        ValueAnimator valueAnimator2 = valueAnimator;
        valueAnimator2.addUpdateListener(new a0(i0Var, g, v0Var2, i11, view));
        valueAnimator2.addListener(new b0(i0Var, view2));
        C0078s.a(view2, new j(view2, i0Var, hVar, valueAnimator2));
        this.f1375b = g;
        return d0.i(view, windowInsets);
    }
}
