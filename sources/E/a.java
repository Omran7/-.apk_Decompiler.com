package E;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import j.n;

public interface a extends MenuItem {
    n a();

    a b(n nVar);

    int getAlphabeticModifiers();

    CharSequence getContentDescription();

    ColorStateList getIconTintList();

    PorterDuff.Mode getIconTintMode();

    int getNumericModifiers();

    CharSequence getTooltipText();

    MenuItem setAlphabeticShortcut(char c3, int i2);

    a setContentDescription(CharSequence charSequence);

    MenuItem setIconTintList(ColorStateList colorStateList);

    MenuItem setIconTintMode(PorterDuff.Mode mode);

    MenuItem setNumericShortcut(char c3, int i2);

    MenuItem setShortcut(char c3, char c6, int i2, int i5);

    a setTooltipText(CharSequence charSequence);
}
