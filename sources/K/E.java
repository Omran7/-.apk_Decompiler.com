package K;

import android.view.View;
import android.view.WindowInsets;

public abstract class E {
    public static v0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        v0 g = v0.g((View) null, rootWindowInsets);
        t0 t0Var = g.f1432a;
        t0Var.p(g);
        t0Var.d(view.getRootView());
        return g;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i2) {
        view.setScrollIndicators(i2);
    }

    public static void d(View view, int i2, int i5) {
        view.setScrollIndicators(i2, i5);
    }
}
