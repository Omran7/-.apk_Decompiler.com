package K;

import android.view.View;
import android.view.ViewParent;

public abstract class U {
    public static boolean a(ViewParent viewParent, View view, float f6, float f7, boolean z3) {
        return viewParent.onNestedFling(view, f6, f7, z3);
    }

    public static boolean b(ViewParent viewParent, View view, float f6, float f7) {
        return viewParent.onNestedPreFling(view, f6, f7);
    }

    public static void c(ViewParent viewParent, View view, int i2, int i5, int[] iArr) {
        viewParent.onNestedPreScroll(view, i2, i5, iArr);
    }

    public static void d(ViewParent viewParent, View view, int i2, int i5, int i6, int i7) {
        viewParent.onNestedScroll(view, i2, i5, i6, i7);
    }

    public static void e(ViewParent viewParent, View view, View view2, int i2) {
        viewParent.onNestedScrollAccepted(view, view2, i2);
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int i2) {
        return viewParent.onStartNestedScroll(view, view2, i2);
    }

    public static void g(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }
}
