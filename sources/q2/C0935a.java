package q2;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* renamed from: q2.a  reason: case insensitive filesystem */
public abstract class C0935a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f11083a = {16842910, 16842919};

    /* renamed from: b  reason: collision with root package name */
    public static final String f11084b = C0935a.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f11083a, 0)) != 0) {
            Log.w(f11084b, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean b(int[] iArr) {
        boolean z3 = false;
        boolean z4 = false;
        for (int i2 : iArr) {
            if (i2 == 16842910) {
                z3 = true;
            } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                z4 = true;
            }
        }
        if (!z3 || !z4) {
            return false;
        }
        return true;
    }
}
