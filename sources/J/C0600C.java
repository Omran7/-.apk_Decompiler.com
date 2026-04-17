package j;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.google.android.gms.internal.measurement.a;

/* renamed from: j.C  reason: case insensitive filesystem */
public final class C0600C extends k implements SubMenu {

    /* renamed from: I  reason: collision with root package name */
    public final k f8662I;

    /* renamed from: J  reason: collision with root package name */
    public final m f8663J;

    public C0600C(Context context, k kVar, m mVar) {
        super(context);
        this.f8662I = kVar;
        this.f8663J = mVar;
    }

    public final boolean d(m mVar) {
        return this.f8662I.d(mVar);
    }

    public final boolean e(k kVar, MenuItem menuItem) {
        if (super.e(kVar, menuItem) || this.f8662I.e(kVar, menuItem)) {
            return true;
        }
        return false;
    }

    public final boolean f(m mVar) {
        return this.f8662I.f(mVar);
    }

    public final MenuItem getItem() {
        return this.f8663J;
    }

    public final String j() {
        int i2;
        m mVar = this.f8663J;
        if (mVar != null) {
            i2 = mVar.f8756a;
        } else {
            i2 = 0;
        }
        if (i2 == 0) {
            return null;
        }
        return a.f(i2, "android:menu:actionviewstates:");
    }

    public final k k() {
        return this.f8662I.k();
    }

    public final boolean m() {
        return this.f8662I.m();
    }

    public final boolean n() {
        return this.f8662I.n();
    }

    public final boolean o() {
        return this.f8662I.o();
    }

    public final void setGroupDividerEnabled(boolean z3) {
        this.f8662I.setGroupDividerEnabled(z3);
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        u(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.f8663J.setIcon(drawable);
        return this;
    }

    public final void setQwertyMode(boolean z3) {
        this.f8662I.setQwertyMode(z3);
    }

    public final SubMenu setHeaderIcon(int i2) {
        u(0, (CharSequence) null, i2, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(int i2) {
        u(i2, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setIcon(int i2) {
        this.f8663J.setIcon(i2);
        return this;
    }
}
