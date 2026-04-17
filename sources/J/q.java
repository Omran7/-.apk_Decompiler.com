package j;

import android.view.MenuItem;

public final class q implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f8778a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r f8779b;

    public q(r rVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f8779b = rVar;
        this.f8778a = onMenuItemClickListener;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f8778a.onMenuItemClick(this.f8779b.j(menuItem));
    }
}
