package k;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: k.m0  reason: case insensitive filesystem */
public abstract class C0725m0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f9346a = {16842912};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f9347b = new int[0];

    static {
        new Rect();
    }

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 && i2 < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            int[] state = drawable.getState();
            if (state == null || state.length == 0) {
                drawable.setState(f9346a);
            } else {
                drawable.setState(f9347b);
            }
            drawable.setState(state);
        }
    }

    public static PorterDuff.Mode b(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
