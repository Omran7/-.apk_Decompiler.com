package f;

import K.B;
import K.O;
import K.Y;
import R2.b;
import X4.d;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

public final class r extends b {

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ int f7801t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Object f7802u;

    public /* synthetic */ r(Object obj, int i2) {
        this.f7801t = i2;
        this.f7802u = obj;
    }

    public final void b() {
        Object obj = this.f7802u;
        switch (this.f7801t) {
            case 0:
                o oVar = (o) obj;
                oVar.f7798b.f7829E.setAlpha(1.0f);
                z zVar = oVar.f7798b;
                zVar.f7831H.d((Y) null);
                zVar.f7831H = null;
                return;
            case 1:
                z zVar2 = (z) obj;
                zVar2.f7829E.setAlpha(1.0f);
                zVar2.f7831H.d((Y) null);
                zVar2.f7831H = null;
                return;
            default:
                d dVar = (d) obj;
                ((z) dVar.f4210c).f7829E.setVisibility(8);
                z zVar3 = (z) dVar.f4210c;
                PopupWindow popupWindow = zVar3.F;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (zVar3.f7829E.getParent() instanceof View) {
                    WeakHashMap weakHashMap = O.f1352a;
                    B.c((View) zVar3.f7829E.getParent());
                }
                zVar3.f7829E.e();
                zVar3.f7831H.d((Y) null);
                zVar3.f7831H = null;
                ViewGroup viewGroup = zVar3.f7833J;
                WeakHashMap weakHashMap2 = O.f1352a;
                B.c(viewGroup);
                return;
        }
    }

    public void g() {
        Object obj = this.f7802u;
        switch (this.f7801t) {
            case 0:
                ((o) obj).f7798b.f7829E.setVisibility(0);
                return;
            case 1:
                z zVar = (z) obj;
                zVar.f7829E.setVisibility(0);
                if (zVar.f7829E.getParent() instanceof View) {
                    WeakHashMap weakHashMap = O.f1352a;
                    B.c((View) zVar.f7829E.getParent());
                    return;
                }
                return;
            default:
                return;
        }
    }
}
