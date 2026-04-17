package f;

import K.O;
import K.X;
import android.view.ViewGroup;

public final class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7797a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ z f7798b;

    public /* synthetic */ o(z zVar, int i2) {
        this.f7797a = i2;
        this.f7798b = zVar;
    }

    public final void run() {
        boolean z3;
        ViewGroup viewGroup;
        switch (this.f7797a) {
            case 0:
                z zVar = this.f7798b;
                if ((zVar.f7858i0 & 1) != 0) {
                    zVar.u(0);
                }
                if ((zVar.f7858i0 & 4096) != 0) {
                    zVar.u(108);
                }
                zVar.f7857h0 = false;
                zVar.f7858i0 = 0;
                return;
            default:
                z zVar2 = this.f7798b;
                zVar2.F.showAtLocation(zVar2.f7829E, 55, 0, 0);
                X x6 = zVar2.f7831H;
                if (x6 != null) {
                    x6.b();
                }
                if (!zVar2.f7832I || (viewGroup = zVar2.f7833J) == null || !viewGroup.isLaidOut()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    zVar2.f7829E.setAlpha(0.0f);
                    X a6 = O.a(zVar2.f7829E);
                    a6.a(1.0f);
                    zVar2.f7831H = a6;
                    a6.d(new r(this, 0));
                    return;
                }
                zVar2.f7829E.setAlpha(1.0f);
                zVar2.f7829E.setVisibility(0);
                return;
        }
    }
}
