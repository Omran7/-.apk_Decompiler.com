package k;

import android.transition.Transition;
import android.widget.PopupWindow;

/* renamed from: k.F0  reason: case insensitive filesystem */
public abstract class C0661F0 {
    public static void a(PopupWindow popupWindow, Transition transition) {
        popupWindow.setEnterTransition(transition);
    }

    public static void b(PopupWindow popupWindow, Transition transition) {
        popupWindow.setExitTransition(transition);
    }
}
