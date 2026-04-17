package k;

import android.graphics.Rect;
import android.widget.PopupWindow;

/* renamed from: k.B0  reason: case insensitive filesystem */
public abstract class C0653B0 {
    public static void a(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }

    public static void b(PopupWindow popupWindow, boolean z3) {
        popupWindow.setIsClippedToScreen(z3);
    }
}
