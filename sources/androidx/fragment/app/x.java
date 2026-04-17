package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

public final class x implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ O f5205a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ y f5206b;

    public x(y yVar, O o6) {
        this.f5206b = yVar;
        this.f5205a = o6;
    }

    public final void onViewAttachedToWindow(View view) {
        O o6 = this.f5205a;
        o6.k();
        C0276h.f((ViewGroup) o6.f5048c.f5159N.getParent(), this.f5206b.f5207a.D()).e();
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
