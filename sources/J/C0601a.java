package j;

import A.h;
import E.a;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: j.a  reason: case insensitive filesystem */
public final class C0601a implements a {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f8664a;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f8665b;

    /* renamed from: c  reason: collision with root package name */
    public Intent f8666c;
    public char d;

    /* renamed from: e  reason: collision with root package name */
    public int f8667e;

    /* renamed from: f  reason: collision with root package name */
    public char f8668f;

    /* renamed from: p  reason: collision with root package name */
    public int f8669p;

    /* renamed from: q  reason: collision with root package name */
    public Drawable f8670q;

    /* renamed from: r  reason: collision with root package name */
    public Context f8671r;

    /* renamed from: s  reason: collision with root package name */
    public CharSequence f8672s;

    /* renamed from: t  reason: collision with root package name */
    public CharSequence f8673t;

    /* renamed from: u  reason: collision with root package name */
    public ColorStateList f8674u;

    /* renamed from: v  reason: collision with root package name */
    public PorterDuff.Mode f8675v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f8676w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f8677x;

    /* renamed from: y  reason: collision with root package name */
    public int f8678y;

    public final n a() {
        return null;
    }

    public final a b(n nVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f8670q;
        if (drawable == null) {
            return;
        }
        if (this.f8676w || this.f8677x) {
            this.f8670q = drawable;
            Drawable mutate = drawable.mutate();
            this.f8670q = mutate;
            if (this.f8676w) {
                D.a.h(mutate, this.f8674u);
            }
            if (this.f8677x) {
                D.a.i(this.f8670q, this.f8675v);
            }
        }
    }

    public final boolean collapseActionView() {
        return false;
    }

    public final boolean expandActionView() {
        return false;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public final View getActionView() {
        return null;
    }

    public final int getAlphabeticModifiers() {
        return this.f8669p;
    }

    public final char getAlphabeticShortcut() {
        return this.f8668f;
    }

    public final CharSequence getContentDescription() {
        return this.f8672s;
    }

    public final int getGroupId() {
        return 0;
    }

    public final Drawable getIcon() {
        return this.f8670q;
    }

    public final ColorStateList getIconTintList() {
        return this.f8674u;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f8675v;
    }

    public final Intent getIntent() {
        return this.f8666c;
    }

    public final int getItemId() {
        return 16908332;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.f8667e;
    }

    public final char getNumericShortcut() {
        return this.d;
    }

    public final int getOrder() {
        return 0;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    public final CharSequence getTitle() {
        return this.f8664a;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f8665b;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f8664a;
    }

    public final CharSequence getTooltipText() {
        return this.f8673t;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    public final boolean isActionViewExpanded() {
        return false;
    }

    public final boolean isCheckable() {
        if ((this.f8678y & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isChecked() {
        if ((this.f8678y & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isEnabled() {
        if ((this.f8678y & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isVisible() {
        if ((this.f8678y & 8) == 0) {
            return true;
        }
        return false;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c3) {
        this.f8668f = Character.toLowerCase(c3);
        return this;
    }

    public final MenuItem setCheckable(boolean z3) {
        this.f8678y = z3 | (this.f8678y & true) ? 1 : 0;
        return this;
    }

    public final MenuItem setChecked(boolean z3) {
        int i2;
        int i5 = this.f8678y & -3;
        if (z3) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        this.f8678y = i2 | i5;
        return this;
    }

    public final a setContentDescription(CharSequence charSequence) {
        this.f8672s = charSequence;
        return this;
    }

    public final MenuItem setEnabled(boolean z3) {
        int i2;
        int i5 = this.f8678y & -17;
        if (z3) {
            i2 = 16;
        } else {
            i2 = 0;
        }
        this.f8678y = i2 | i5;
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f8670q = drawable;
        c();
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f8674u = colorStateList;
        this.f8676w = true;
        c();
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f8675v = mode;
        this.f8677x = true;
        c();
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f8666c = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c3) {
        this.d = c3;
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setShortcut(char c3, char c6) {
        this.d = c3;
        this.f8668f = Character.toLowerCase(c6);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f8664a = charSequence;
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f8665b = charSequence;
        return this;
    }

    public final a setTooltipText(CharSequence charSequence) {
        this.f8673t = charSequence;
        return this;
    }

    public final MenuItem setVisible(boolean z3) {
        int i2 = 8;
        int i5 = this.f8678y & 8;
        if (z3) {
            i2 = 0;
        }
        this.f8678y = i5 | i2;
        return this;
    }

    public final MenuItem setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c3, int i2) {
        this.f8668f = Character.toLowerCase(c3);
        this.f8669p = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    /* renamed from: setContentDescription  reason: collision with other method in class */
    public final MenuItem m20setContentDescription(CharSequence charSequence) {
        this.f8672s = charSequence;
        return this;
    }

    public final MenuItem setNumericShortcut(char c3, int i2) {
        this.d = c3;
        this.f8667e = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public final MenuItem setTitle(int i2) {
        this.f8664a = this.f8671r.getResources().getString(i2);
        return this;
    }

    /* renamed from: setTooltipText  reason: collision with other method in class */
    public final MenuItem m21setTooltipText(CharSequence charSequence) {
        this.f8673t = charSequence;
        return this;
    }

    public final MenuItem setIcon(int i2) {
        this.f8670q = h.getDrawable(this.f8671r, i2);
        c();
        return this;
    }

    public final MenuItem setShortcut(char c3, char c6, int i2, int i5) {
        this.d = c3;
        this.f8667e = KeyEvent.normalizeMetaState(i2);
        this.f8668f = Character.toLowerCase(c6);
        this.f8669p = KeyEvent.normalizeMetaState(i5);
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public final void setShowAsAction(int i2) {
    }

    public final MenuItem setShowAsActionFlags(int i2) {
        return this;
    }
}
