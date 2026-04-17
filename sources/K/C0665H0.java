package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import j.h;
import j.k;
import j.m;

/* renamed from: k.H0  reason: case insensitive filesystem */
public final class C0665H0 extends C0739t0 {

    /* renamed from: v  reason: collision with root package name */
    public final int f9184v;

    /* renamed from: w  reason: collision with root package name */
    public final int f9185w;

    /* renamed from: x  reason: collision with root package name */
    public C0659E0 f9186x;

    /* renamed from: y  reason: collision with root package name */
    public m f9187y;

    public C0665H0(Context context, boolean z3) {
        super(context, z3);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f9184v = 21;
            this.f9185w = 22;
            return;
        }
        this.f9184v = 22;
        this.f9185w = 21;
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int i2;
        h hVar;
        m mVar;
        int pointToPosition;
        int i5;
        if (this.f9186x != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i2 = headerViewListAdapter.getHeadersCount();
                hVar = (h) headerViewListAdapter.getWrappedAdapter();
            } else {
                hVar = (h) adapter;
                i2 = 0;
            }
            if (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i5 = pointToPosition - i2) < 0 || i5 >= hVar.getCount()) {
                mVar = null;
            } else {
                mVar = hVar.getItem(i5);
            }
            m mVar2 = this.f9187y;
            if (mVar2 != mVar) {
                k kVar = hVar.f8714a;
                if (mVar2 != null) {
                    this.f9186x.g(kVar, mVar2);
                }
                this.f9187y = mVar;
                if (mVar != null) {
                    this.f9186x.k(kVar, mVar);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        h hVar;
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i2 == this.f9184v) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView == null || i2 != this.f9185w) {
            return super.onKeyDown(i2, keyEvent);
        } else {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                hVar = (h) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                hVar = (h) adapter;
            }
            hVar.f8714a.c(false);
            return true;
        }
    }

    public void setHoverListener(C0659E0 e02) {
        this.f9186x = e02;
    }

    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
