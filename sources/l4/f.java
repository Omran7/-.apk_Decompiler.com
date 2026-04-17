package l4;

import android.view.ViewTreeObserver;

public final class f implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9771a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f9772b;

    public /* synthetic */ f(i iVar, int i2) {
        this.f9771a = i2;
        this.f9772b = iVar;
    }

    public final void onGlobalLayout() {
        switch (this.f9771a) {
            case 0:
                i iVar = this.f9772b;
                iVar.L0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                iVar.f9795R0 = iVar.L0.getMeasuredWidth();
                iVar.Z();
                return;
            default:
                i iVar2 = this.f9772b;
                iVar2.f9815m0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                iVar2.f9794Q0 = iVar2.f9815m0.getMeasuredWidth();
                iVar2.a0();
                iVar2.X();
                i.W(iVar2);
                iVar2.Y();
                return;
        }
    }
}
