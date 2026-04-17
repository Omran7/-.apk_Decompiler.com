package k;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: k.b  reason: case insensitive filesystem */
public final class C0702b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9269a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f9270b;

    public /* synthetic */ C0702b(ActionBarOverlayLayout actionBarOverlayLayout, int i2) {
        this.f9269a = i2;
        this.f9270b = actionBarOverlayLayout;
    }

    public final void run() {
        switch (this.f9269a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f9270b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.F = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f4745G);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f9270b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.F = actionBarOverlayLayout2.d.animate().translationY((float) (-actionBarOverlayLayout2.d.getHeight())).setListener(actionBarOverlayLayout2.f4745G);
                return;
        }
    }
}
