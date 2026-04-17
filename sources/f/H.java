package f;

import K.B;
import K.O;
import R2.b;
import X4.d;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

public final class H extends b {

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ int f7716t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ J f7717u;

    public /* synthetic */ H(J j6, int i2) {
        this.f7716t = i2;
        this.f7717u = j6;
    }

    public final void b() {
        View view;
        J j6 = this.f7717u;
        switch (this.f7716t) {
            case 0:
                if (j6.f7727D && (view = j6.f7742v) != null) {
                    view.setTranslationY(0.0f);
                    j6.f7739s.setTranslationY(0.0f);
                }
                j6.f7739s.setVisibility(8);
                j6.f7739s.setTransitioning(false);
                j6.f7730H = null;
                d dVar = j6.f7746z;
                if (dVar != null) {
                    dVar.J(j6.f7745y);
                    j6.f7745y = null;
                    j6.f7746z = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = j6.f7738r;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = O.f1352a;
                    B.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                j6.f7730H = null;
                j6.f7739s.requestLayout();
                return;
        }
    }
}
