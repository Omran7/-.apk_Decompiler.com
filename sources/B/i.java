package B;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public abstract class i {
    public static Drawable a(Resources resources, int i2, Resources.Theme theme) {
        return resources.getDrawable(i2, theme);
    }

    public static Drawable b(Resources resources, int i2, int i5, Resources.Theme theme) {
        return resources.getDrawableForDensity(i2, i5, theme);
    }
}
