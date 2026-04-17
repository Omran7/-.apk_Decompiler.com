package K;

import C.g;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.mtma.criminal.city.R;

public abstract class D {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static v0 b(View view, v0 v0Var, Rect rect) {
        WindowInsets f6 = v0Var.f();
        if (f6 != null) {
            return v0.g(view, view.computeSystemWindowInsets(f6, rect));
        }
        rect.setEmpty();
        return v0Var;
    }

    public static boolean c(View view, float f6, float f7, boolean z3) {
        return view.dispatchNestedFling(f6, f7, z3);
    }

    public static boolean d(View view, float f6, float f7) {
        return view.dispatchNestedPreFling(f6, f7);
    }

    public static boolean e(View view, int i2, int i5, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i2, i5, iArr, iArr2);
    }

    public static boolean f(View view, int i2, int i5, int i6, int i7, int[] iArr) {
        return view.dispatchNestedScroll(i2, i5, i6, i7, iArr);
    }

    public static ColorStateList g(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode h(View view) {
        return view.getBackgroundTintMode();
    }

    public static float i(View view) {
        return view.getElevation();
    }

    public static v0 j(View view) {
        n0 n0Var;
        if (!j0.d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = j0.f1398a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) j0.f1399b.get(obj);
            Rect rect2 = (Rect) j0.f1400c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                n0Var = new m0();
            } else if (i2 >= 29) {
                n0Var = new l0();
            } else {
                n0Var = new k0();
            }
            n0Var.e(g.b(rect.left, rect.top, rect.right, rect.bottom));
            n0Var.g(g.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
            v0 b6 = n0Var.b();
            b6.f1432a.p(b6);
            b6.f1432a.d(view.getRootView());
            return b6;
        } catch (IllegalAccessException e6) {
            Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e6.getMessage(), e6);
            return null;
        }
    }

    public static String k(View view) {
        return view.getTransitionName();
    }

    public static float l(View view) {
        return view.getTranslationZ();
    }

    public static float m(View view) {
        return view.getZ();
    }

    public static boolean n(View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean o(View view) {
        return view.isImportantForAccessibility();
    }

    public static boolean p(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void s(View view, float f6) {
        view.setElevation(f6);
    }

    public static void t(View view, boolean z3) {
        view.setNestedScrollingEnabled(z3);
    }

    public static void u(View view, C0076p pVar) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, pVar);
        }
        if (pVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new C(view, pVar));
        }
    }

    public static void v(View view, String str) {
        view.setTransitionName(str);
    }

    public static void w(View view, float f6) {
        view.setTranslationZ(f6);
    }

    public static void x(View view, float f6) {
        view.setZ(f6);
    }

    public static boolean y(View view, int i2) {
        return view.startNestedScroll(i2);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }
}
