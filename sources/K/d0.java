package K;

import I3.e;
import I3.h;
import a0.C0254a;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.mtma.criminal.city.R;
import java.util.List;

public final class d0 extends h0 {

    /* renamed from: e  reason: collision with root package name */
    public static final PathInterpolator f1381e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f  reason: collision with root package name */
    public static final C0254a f1382f = new C0254a(0);
    public static final DecelerateInterpolator g = new DecelerateInterpolator();

    public static void e(View view) {
        e j6 = j(view);
        if (j6 != null) {
            ((View) j6.f1171c).setTranslationY(0.0f);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                e(viewGroup.getChildAt(i2));
            }
        }
    }

    public static void f(View view, WindowInsets windowInsets, boolean z3) {
        e j6 = j(view);
        if (j6 != null) {
            j6.f1170b = windowInsets;
            if (!z3) {
                int[] iArr = (int[]) j6.d;
                ((View) j6.f1171c).getLocationOnScreen(iArr);
                z3 = true;
                j6.f1172e = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                f(viewGroup.getChildAt(i2), windowInsets, z3);
            }
        }
    }

    public static void g(View view, v0 v0Var, List list) {
        e j6 = j(view);
        if (j6 != null) {
            j6.f(v0Var, list);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                g(viewGroup.getChildAt(i2), v0Var, list);
            }
        }
    }

    public static void h(View view, h hVar) {
        e j6 = j(view);
        if (j6 != null) {
            View view2 = (View) j6.f1171c;
            int[] iArr = (int[]) j6.d;
            view2.getLocationOnScreen(iArr);
            int i2 = j6.f1172e - iArr[1];
            j6.f1173f = i2;
            view2.setTranslationY((float) i2);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                h(viewGroup.getChildAt(i5), hVar);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        if (view.getTag(R.id.tag_on_apply_window_listener) != null) {
            return windowInsets;
        }
        return view.onApplyWindowInsets(windowInsets);
    }

    public static e j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof c0) {
            return ((c0) tag).f1374a;
        }
        return null;
    }
}
