package j;

import E.a;
import R2.b;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.LinearLayout;
import com.mtma.criminal.city.utils.K;
import java.util.ArrayList;

public final class m implements a {

    /* renamed from: A  reason: collision with root package name */
    public CharSequence f8745A;

    /* renamed from: B  reason: collision with root package name */
    public ColorStateList f8746B = null;

    /* renamed from: C  reason: collision with root package name */
    public PorterDuff.Mode f8747C = null;

    /* renamed from: D  reason: collision with root package name */
    public boolean f8748D = false;

    /* renamed from: E  reason: collision with root package name */
    public boolean f8749E = false;
    public boolean F = false;

    /* renamed from: G  reason: collision with root package name */
    public int f8750G = 16;

    /* renamed from: H  reason: collision with root package name */
    public int f8751H;

    /* renamed from: I  reason: collision with root package name */
    public View f8752I;

    /* renamed from: J  reason: collision with root package name */
    public n f8753J;

    /* renamed from: K  reason: collision with root package name */
    public MenuItem.OnActionExpandListener f8754K;

    /* renamed from: L  reason: collision with root package name */
    public boolean f8755L = false;

    /* renamed from: a  reason: collision with root package name */
    public final int f8756a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8757b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8758c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f8759e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f8760f;

    /* renamed from: p  reason: collision with root package name */
    public Intent f8761p;

    /* renamed from: q  reason: collision with root package name */
    public char f8762q;

    /* renamed from: r  reason: collision with root package name */
    public int f8763r = 4096;

    /* renamed from: s  reason: collision with root package name */
    public char f8764s;

    /* renamed from: t  reason: collision with root package name */
    public int f8765t = 4096;

    /* renamed from: u  reason: collision with root package name */
    public Drawable f8766u;

    /* renamed from: v  reason: collision with root package name */
    public int f8767v = 0;

    /* renamed from: w  reason: collision with root package name */
    public final k f8768w;

    /* renamed from: x  reason: collision with root package name */
    public C0600C f8769x;

    /* renamed from: y  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f8770y;

    /* renamed from: z  reason: collision with root package name */
    public CharSequence f8771z;

    public m(k kVar, int i2, int i5, int i6, int i7, CharSequence charSequence, int i8) {
        this.f8768w = kVar;
        this.f8756a = i5;
        this.f8757b = i2;
        this.f8758c = i6;
        this.d = i7;
        this.f8759e = charSequence;
        this.f8751H = i8;
    }

    public static void c(int i2, int i5, String str, StringBuilder sb) {
        if ((i2 & i5) == i5) {
            sb.append(str);
        }
    }

    public final n a() {
        return this.f8753J;
    }

    public final a b(n nVar) {
        this.f8752I = null;
        this.f8753J = nVar;
        this.f8768w.p(true);
        n nVar2 = this.f8753J;
        if (nVar2 != null) {
            nVar2.f8772a = new K(this, 21);
            nVar2.f8773b.setVisibilityListener(nVar2);
        }
        return this;
    }

    public final boolean collapseActionView() {
        if ((this.f8751H & 8) == 0) {
            return false;
        }
        if (this.f8752I == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f8754K;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f8768w.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.F && (this.f8748D || this.f8749E)) {
            drawable = drawable.mutate();
            if (this.f8748D) {
                D.a.h(drawable, this.f8746B);
            }
            if (this.f8749E) {
                D.a.i(drawable, this.f8747C);
            }
            this.F = false;
        }
        return drawable;
    }

    public final boolean e() {
        n nVar;
        if ((this.f8751H & 8) == 0) {
            return false;
        }
        if (this.f8752I == null && (nVar = this.f8753J) != null) {
            this.f8752I = nVar.f8773b.onCreateActionView(this);
        }
        if (this.f8752I != null) {
            return true;
        }
        return false;
    }

    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f8754K;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f8768w.f(this);
        }
        return false;
    }

    public final boolean f() {
        if ((this.f8750G & 32) == 32) {
            return true;
        }
        return false;
    }

    public final void g(boolean z3) {
        if (z3) {
            this.f8750G |= 32;
        } else {
            this.f8750G &= -33;
        }
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final View getActionView() {
        View view = this.f8752I;
        if (view != null) {
            return view;
        }
        n nVar = this.f8753J;
        if (nVar == null) {
            return null;
        }
        View onCreateActionView = nVar.f8773b.onCreateActionView(this);
        this.f8752I = onCreateActionView;
        return onCreateActionView;
    }

    public final int getAlphabeticModifiers() {
        return this.f8765t;
    }

    public final char getAlphabeticShortcut() {
        return this.f8764s;
    }

    public final CharSequence getContentDescription() {
        return this.f8771z;
    }

    public final int getGroupId() {
        return this.f8757b;
    }

    public final Drawable getIcon() {
        Drawable drawable = this.f8766u;
        if (drawable != null) {
            return d(drawable);
        }
        int i2 = this.f8767v;
        if (i2 == 0) {
            return null;
        }
        Drawable J5 = b.J(this.f8768w.f8726a, i2);
        this.f8767v = 0;
        this.f8766u = J5;
        return d(J5);
    }

    public final ColorStateList getIconTintList() {
        return this.f8746B;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f8747C;
    }

    public final Intent getIntent() {
        return this.f8761p;
    }

    public final int getItemId() {
        return this.f8756a;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.f8763r;
    }

    public final char getNumericShortcut() {
        return this.f8762q;
    }

    public final int getOrder() {
        return this.f8758c;
    }

    public final SubMenu getSubMenu() {
        return this.f8769x;
    }

    public final CharSequence getTitle() {
        return this.f8759e;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f8760f;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f8759e;
    }

    public final CharSequence getTooltipText() {
        return this.f8745A;
    }

    public final boolean hasSubMenu() {
        if (this.f8769x != null) {
            return true;
        }
        return false;
    }

    public final boolean isActionViewExpanded() {
        return this.f8755L;
    }

    public final boolean isCheckable() {
        if ((this.f8750G & 1) == 1) {
            return true;
        }
        return false;
    }

    public final boolean isChecked() {
        if ((this.f8750G & 2) == 2) {
            return true;
        }
        return false;
    }

    public final boolean isEnabled() {
        if ((this.f8750G & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isVisible() {
        n nVar = this.f8753J;
        if (nVar == null || !nVar.f8773b.overridesItemVisibility()) {
            if ((this.f8750G & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.f8750G & 8) != 0 || !this.f8753J.f8773b.isVisible()) {
            return false;
        } else {
            return true;
        }
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public final MenuItem setActionView(View view) {
        int i2;
        this.f8752I = view;
        this.f8753J = null;
        if (view != null && view.getId() == -1 && (i2 = this.f8756a) > 0) {
            view.setId(i2);
        }
        k kVar = this.f8768w;
        kVar.f8735t = true;
        kVar.p(true);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c3) {
        if (this.f8764s == c3) {
            return this;
        }
        this.f8764s = Character.toLowerCase(c3);
        this.f8768w.p(false);
        return this;
    }

    public final MenuItem setCheckable(boolean z3) {
        int i2 = this.f8750G;
        boolean z4 = z3 | (i2 & true);
        this.f8750G = z4 ? 1 : 0;
        if (i2 != z4) {
            this.f8768w.p(false);
        }
        return this;
    }

    public final MenuItem setChecked(boolean z3) {
        boolean z4;
        int i2;
        int i5 = this.f8750G;
        int i6 = 2;
        if ((i5 & 4) != 0) {
            k kVar = this.f8768w;
            kVar.getClass();
            ArrayList arrayList = kVar.f8730f;
            int size = arrayList.size();
            kVar.w();
            for (int i7 = 0; i7 < size; i7++) {
                m mVar = (m) arrayList.get(i7);
                if (mVar.f8757b == this.f8757b && (mVar.f8750G & 4) != 0 && mVar.isCheckable()) {
                    if (mVar == this) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    int i8 = mVar.f8750G;
                    int i9 = i8 & -3;
                    if (z4) {
                        i2 = 2;
                    } else {
                        i2 = 0;
                    }
                    int i10 = i2 | i9;
                    mVar.f8750G = i10;
                    if (i8 != i10) {
                        mVar.f8768w.p(false);
                    }
                }
            }
            kVar.v();
        } else {
            int i11 = i5 & -3;
            if (!z3) {
                i6 = 0;
            }
            int i12 = i11 | i6;
            this.f8750G = i12;
            if (i5 != i12) {
                this.f8768w.p(false);
            }
        }
        return this;
    }

    public final MenuItem setEnabled(boolean z3) {
        if (z3) {
            this.f8750G |= 16;
        } else {
            this.f8750G &= -17;
        }
        this.f8768w.p(false);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f8767v = 0;
        this.f8766u = drawable;
        this.F = true;
        this.f8768w.p(false);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f8746B = colorStateList;
        this.f8748D = true;
        this.F = true;
        this.f8768w.p(false);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f8747C = mode;
        this.f8749E = true;
        this.F = true;
        this.f8768w.p(false);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f8761p = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c3) {
        if (this.f8762q == c3) {
            return this;
        }
        this.f8762q = c3;
        this.f8768w.p(false);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f8754K = onActionExpandListener;
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f8770y = onMenuItemClickListener;
        return this;
    }

    public final MenuItem setShortcut(char c3, char c6) {
        this.f8762q = c3;
        this.f8764s = Character.toLowerCase(c6);
        this.f8768w.p(false);
        return this;
    }

    public final void setShowAsAction(int i2) {
        int i5 = i2 & 3;
        if (i5 == 0 || i5 == 1 || i5 == 2) {
            this.f8751H = i2;
            k kVar = this.f8768w;
            kVar.f8735t = true;
            kVar.p(true);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public final MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f8759e = charSequence;
        this.f8768w.p(false);
        C0600C c3 = this.f8769x;
        if (c3 != null) {
            c3.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f8760f = charSequence;
        this.f8768w.p(false);
        return this;
    }

    public final MenuItem setVisible(boolean z3) {
        int i2;
        int i5 = this.f8750G;
        int i6 = i5 & -9;
        if (z3) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        int i7 = i2 | i6;
        this.f8750G = i7;
        if (i5 != i7) {
            k kVar = this.f8768w;
            kVar.f8732q = true;
            kVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f8759e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final a setContentDescription(CharSequence charSequence) {
        this.f8771z = charSequence;
        this.f8768w.p(false);
        return this;
    }

    public final a setTooltipText(CharSequence charSequence) {
        this.f8745A = charSequence;
        this.f8768w.p(false);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c3, int i2) {
        if (this.f8764s == c3 && this.f8765t == i2) {
            return this;
        }
        this.f8764s = Character.toLowerCase(c3);
        this.f8765t = KeyEvent.normalizeMetaState(i2);
        this.f8768w.p(false);
        return this;
    }

    public final MenuItem setNumericShortcut(char c3, int i2) {
        if (this.f8762q == c3 && this.f8763r == i2) {
            return this;
        }
        this.f8762q = c3;
        this.f8763r = KeyEvent.normalizeMetaState(i2);
        this.f8768w.p(false);
        return this;
    }

    public final MenuItem setShortcut(char c3, char c6, int i2, int i5) {
        this.f8762q = c3;
        this.f8763r = KeyEvent.normalizeMetaState(i2);
        this.f8764s = Character.toLowerCase(c6);
        this.f8765t = KeyEvent.normalizeMetaState(i5);
        this.f8768w.p(false);
        return this;
    }

    public final MenuItem setIcon(int i2) {
        this.f8766u = null;
        this.f8767v = i2;
        this.F = true;
        this.f8768w.p(false);
        return this;
    }

    public final MenuItem setTitle(int i2) {
        setTitle((CharSequence) this.f8768w.f8726a.getString(i2));
        return this;
    }

    public final MenuItem setActionView(int i2) {
        int i5;
        Context context = this.f8768w.f8726a;
        View inflate = LayoutInflater.from(context).inflate(i2, new LinearLayout(context), false);
        this.f8752I = inflate;
        this.f8753J = null;
        if (inflate != null && inflate.getId() == -1 && (i5 = this.f8756a) > 0) {
            inflate.setId(i5);
        }
        k kVar = this.f8768w;
        kVar.f8735t = true;
        kVar.p(true);
        return this;
    }
}
