package m0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: m0.x  reason: case insensitive filesystem */
public final class C0831x {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f10067a;

    public /* synthetic */ C0831x(RecyclerView recyclerView) {
        this.f10067a = recyclerView;
    }

    public void a(int i2) {
        RecyclerView recyclerView = this.f10067a;
        View childAt = recyclerView.getChildAt(i2);
        if (childAt != null) {
            RecyclerView.I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i2);
    }
}
