package Q;

import android.widget.PopupWindow;

public abstract class l {
    public static boolean a(PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }

    public static int b(PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }

    public static void c(PopupWindow popupWindow, boolean z3) {
        popupWindow.setOverlapAnchor(z3);
    }

    public static void d(PopupWindow popupWindow, int i2) {
        popupWindow.setWindowLayoutType(i2);
    }
}
