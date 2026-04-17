package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.C0302m;
import androidx.lifecycle.C0306q;
import androidx.lifecycle.C0307s;
import k.C0738t;
import kotlin.jvm.internal.j;

public final /* synthetic */ class e implements C0306q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4618a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4619b;

    public /* synthetic */ e(Object obj, int i2) {
        this.f4618a = i2;
        this.f4619b = obj;
    }

    public final void a(C0307s sVar, C0302m mVar) {
        Window window;
        View peekDecorView;
        switch (this.f4618a) {
            case 0:
                o oVar = (o) this.f4619b;
                if (mVar == C0302m.ON_STOP && (window = oVar.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    return;
                }
                return;
            case 1:
                o oVar2 = (o) this.f4619b;
                if (mVar == C0302m.ON_DESTROY) {
                    oVar2.f4643b.f12820b = null;
                    if (!oVar2.isChangingConfigurations()) {
                        oVar2.e().a();
                    }
                    k kVar = oVar2.f4646f;
                    o oVar3 = kVar.d;
                    oVar3.getWindow().getDecorView().removeCallbacks(kVar);
                    oVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(kVar);
                    return;
                }
                return;
            default:
                C0738t tVar = (C0738t) this.f4619b;
                j.e(tVar, "this$0");
                if (mVar == C0302m.ON_START) {
                    tVar.f9376e = true;
                    return;
                } else if (mVar == C0302m.ON_STOP) {
                    tVar.f9376e = false;
                    return;
                } else {
                    return;
                }
        }
    }
}
