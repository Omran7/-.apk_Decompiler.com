package j;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import i.C0572b;

public final class o extends FrameLayout implements C0572b {

    /* renamed from: a  reason: collision with root package name */
    public final CollapsibleActionView f8775a;

    public o(View view) {
        super(view.getContext());
        this.f8775a = (CollapsibleActionView) view;
        addView(view);
    }
}
