package j;

import android.view.MenuItem;

public final class p implements MenuItem.OnActionExpandListener {

    /* renamed from: a  reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f8776a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r f8777b;

    public p(r rVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f8777b = rVar;
        this.f8776a = onActionExpandListener;
    }

    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f8776a.onMenuItemActionCollapse(this.f8777b.j(menuItem));
    }

    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f8776a.onMenuItemActionExpand(this.f8777b.j(menuItem));
    }
}
