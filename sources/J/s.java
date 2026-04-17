package j;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

public abstract class s implements C0598A, w, AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public Rect f8781a;

    public static int m(ListAdapter listAdapter, Context context, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i5 = 0;
        int i6 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i7 = 0; i7 < count; i7++) {
            int itemViewType = listAdapter.getItemViewType(i7);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i7, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i2) {
                return i2;
            }
            if (measuredWidth > i5) {
                i5 = measuredWidth;
            }
        }
        return i5;
    }

    public static boolean u(k kVar) {
        int size = kVar.f8730f.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = kVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(m mVar) {
        return false;
    }

    public final boolean i(m mVar) {
        return false;
    }

    public abstract void l(k kVar);

    public abstract void n(View view);

    public abstract void o(boolean z3);

    public final void onItemClick(AdapterView adapterView, View view, int i2, long j6) {
        h hVar;
        int i5;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            hVar = (h) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            hVar = (h) listAdapter;
        }
        k kVar = hVar.f8714a;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i2);
        if (!(this instanceof e)) {
            i5 = 0;
        } else {
            i5 = 4;
        }
        kVar.q(menuItem, this, i5);
    }

    public abstract void p(int i2);

    public abstract void q(int i2);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z3);

    public abstract void t(int i2);

    public final void g(Context context, k kVar) {
    }
}
