package x;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: x.c  reason: case insensitive filesystem */
public final class C1091c implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f12490a;

    public C1091c(CoordinatorLayout coordinatorLayout) {
        this.f12490a = coordinatorLayout;
    }

    public final void onChildViewAdded(View view, View view2) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f12490a.f4874z;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    public final void onChildViewRemoved(View view, View view2) {
        CoordinatorLayout coordinatorLayout = this.f12490a;
        coordinatorLayout.p(2);
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.f4874z;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
