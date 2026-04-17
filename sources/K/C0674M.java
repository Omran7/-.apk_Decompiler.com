package k;

import K4.e;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* renamed from: k.M  reason: case insensitive filesystem */
public final class C0674M implements PopupWindow.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f9202a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0676N f9203b;

    public C0674M(C0676N n2, e eVar) {
        this.f9203b = n2;
        this.f9202a = eVar;
    }

    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f9203b.f9213P.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f9202a);
        }
    }
}
