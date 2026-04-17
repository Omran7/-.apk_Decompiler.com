package K;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* renamed from: K.k  reason: case insensitive filesystem */
public abstract class C0071k {
    public static int a(MenuItem menuItem) {
        return menuItem.getAlphabeticModifiers();
    }

    public static CharSequence b(MenuItem menuItem) {
        return menuItem.getContentDescription();
    }

    public static ColorStateList c(MenuItem menuItem) {
        return menuItem.getIconTintList();
    }

    public static PorterDuff.Mode d(MenuItem menuItem) {
        return menuItem.getIconTintMode();
    }

    public static int e(MenuItem menuItem) {
        return menuItem.getNumericModifiers();
    }

    public static CharSequence f(MenuItem menuItem) {
        return menuItem.getTooltipText();
    }

    public static MenuItem g(MenuItem menuItem, char c3, int i2) {
        return menuItem.setAlphabeticShortcut(c3, i2);
    }

    public static MenuItem h(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setContentDescription(charSequence);
    }

    public static MenuItem i(MenuItem menuItem, ColorStateList colorStateList) {
        return menuItem.setIconTintList(colorStateList);
    }

    public static MenuItem j(MenuItem menuItem, PorterDuff.Mode mode) {
        return menuItem.setIconTintMode(mode);
    }

    public static MenuItem k(MenuItem menuItem, char c3, int i2) {
        return menuItem.setNumericShortcut(c3, i2);
    }

    public static MenuItem l(MenuItem menuItem, char c3, char c6, int i2, int i5) {
        return menuItem.setShortcut(c3, c6, i2, i5);
    }

    public static MenuItem m(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setTooltipText(charSequence);
    }
}
