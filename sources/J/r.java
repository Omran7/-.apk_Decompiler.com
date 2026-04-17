package j;

import E.a;
import E2.f;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

public final class r extends f implements MenuItem {

    /* renamed from: c  reason: collision with root package name */
    public final a f8780c;
    public Method d;

    public r(Context context, a aVar) {
        super(context);
        if (aVar != null) {
            this.f8780c = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final boolean collapseActionView() {
        return this.f8780c.collapseActionView();
    }

    public final boolean expandActionView() {
        return this.f8780c.expandActionView();
    }

    public final ActionProvider getActionProvider() {
        n a6 = this.f8780c.a();
        if (a6 != null) {
            return a6.f8773b;
        }
        return null;
    }

    public final View getActionView() {
        View actionView = this.f8780c.getActionView();
        if (actionView instanceof o) {
            return (View) ((o) actionView).f8775a;
        }
        return actionView;
    }

    public final int getAlphabeticModifiers() {
        return this.f8780c.getAlphabeticModifiers();
    }

    public final char getAlphabeticShortcut() {
        return this.f8780c.getAlphabeticShortcut();
    }

    public final CharSequence getContentDescription() {
        return this.f8780c.getContentDescription();
    }

    public final int getGroupId() {
        return this.f8780c.getGroupId();
    }

    public final Drawable getIcon() {
        return this.f8780c.getIcon();
    }

    public final ColorStateList getIconTintList() {
        return this.f8780c.getIconTintList();
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f8780c.getIconTintMode();
    }

    public final Intent getIntent() {
        return this.f8780c.getIntent();
    }

    public final int getItemId() {
        return this.f8780c.getItemId();
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f8780c.getMenuInfo();
    }

    public final int getNumericModifiers() {
        return this.f8780c.getNumericModifiers();
    }

    public final char getNumericShortcut() {
        return this.f8780c.getNumericShortcut();
    }

    public final int getOrder() {
        return this.f8780c.getOrder();
    }

    public final SubMenu getSubMenu() {
        return this.f8780c.getSubMenu();
    }

    public final CharSequence getTitle() {
        return this.f8780c.getTitle();
    }

    public final CharSequence getTitleCondensed() {
        return this.f8780c.getTitleCondensed();
    }

    public final CharSequence getTooltipText() {
        return this.f8780c.getTooltipText();
    }

    public final boolean hasSubMenu() {
        return this.f8780c.hasSubMenu();
    }

    public final boolean isActionViewExpanded() {
        return this.f8780c.isActionViewExpanded();
    }

    public final boolean isCheckable() {
        return this.f8780c.isCheckable();
    }

    public final boolean isChecked() {
        return this.f8780c.isChecked();
    }

    public final boolean isEnabled() {
        return this.f8780c.isEnabled();
    }

    public final boolean isVisible() {
        return this.f8780c.isVisible();
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        n nVar = new n(this, actionProvider);
        if (actionProvider == null) {
            nVar = null;
        }
        this.f8780c.b(nVar);
        return this;
    }

    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new o(view);
        }
        this.f8780c.setActionView(view);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c3) {
        this.f8780c.setAlphabeticShortcut(c3);
        return this;
    }

    public final MenuItem setCheckable(boolean z3) {
        this.f8780c.setCheckable(z3);
        return this;
    }

    public final MenuItem setChecked(boolean z3) {
        this.f8780c.setChecked(z3);
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f8780c.setContentDescription(charSequence);
        return this;
    }

    public final MenuItem setEnabled(boolean z3) {
        this.f8780c.setEnabled(z3);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f8780c.setIcon(drawable);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f8780c.setIconTintList(colorStateList);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f8780c.setIconTintMode(mode);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f8780c.setIntent(intent);
        return this;
    }

    public final MenuItem setNumericShortcut(char c3) {
        this.f8780c.setNumericShortcut(c3);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        p pVar;
        if (onActionExpandListener != null) {
            pVar = new p(this, onActionExpandListener);
        } else {
            pVar = null;
        }
        this.f8780c.setOnActionExpandListener(pVar);
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        q qVar;
        if (onMenuItemClickListener != null) {
            qVar = new q(this, onMenuItemClickListener);
        } else {
            qVar = null;
        }
        this.f8780c.setOnMenuItemClickListener(qVar);
        return this;
    }

    public final MenuItem setShortcut(char c3, char c6) {
        this.f8780c.setShortcut(c3, c6);
        return this;
    }

    public final void setShowAsAction(int i2) {
        this.f8780c.setShowAsAction(i2);
    }

    public final MenuItem setShowAsActionFlags(int i2) {
        this.f8780c.setShowAsActionFlags(i2);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f8780c.setTitle(charSequence);
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f8780c.setTitleCondensed(charSequence);
        return this;
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f8780c.setTooltipText(charSequence);
        return this;
    }

    public final MenuItem setVisible(boolean z3) {
        return this.f8780c.setVisible(z3);
    }

    public final MenuItem setAlphabeticShortcut(char c3, int i2) {
        this.f8780c.setAlphabeticShortcut(c3, i2);
        return this;
    }

    public final MenuItem setIcon(int i2) {
        this.f8780c.setIcon(i2);
        return this;
    }

    public final MenuItem setNumericShortcut(char c3, int i2) {
        this.f8780c.setNumericShortcut(c3, i2);
        return this;
    }

    public final MenuItem setShortcut(char c3, char c6, int i2, int i5) {
        this.f8780c.setShortcut(c3, c6, i2, i5);
        return this;
    }

    public final MenuItem setTitle(int i2) {
        this.f8780c.setTitle(i2);
        return this;
    }

    public final MenuItem setActionView(int i2) {
        a aVar = this.f8780c;
        aVar.setActionView(i2);
        View actionView = aVar.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            aVar.setActionView(new o(actionView));
        }
        return this;
    }
}
