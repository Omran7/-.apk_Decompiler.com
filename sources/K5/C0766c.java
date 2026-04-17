package k5;

import E2.d;
import android.view.View;
import it.sephiroth.android.library.widget.HListView;

/* renamed from: k5.c  reason: case insensitive filesystem */
public final class C0766c extends d implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f9486c;
    public final /* synthetic */ C0773j d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0766c(C0773j jVar, int i2) {
        super(jVar);
        this.f9486c = i2;
        this.d = jVar;
    }

    public final void run() {
        int i2;
        boolean z3;
        boolean z4;
        switch (this.f9486c) {
            case 0:
                HListView hListView = (HListView) this.d;
                if (hListView.isPressed() && (i2 = hListView.f9589v) >= 0) {
                    View childAt = hListView.getChildAt(i2 - hListView.f9578a);
                    if (!hListView.f9586s) {
                        if (E()) {
                            z3 = hListView.F(hListView.f9589v);
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            hListView.setPressed(false);
                            childAt.setPressed(false);
                            return;
                        }
                        return;
                    }
                    hListView.setPressed(false);
                    if (childAt != null) {
                        childAt.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                C0773j jVar = this.d;
                View childAt2 = jVar.getChildAt(jVar.f9555i0 - jVar.f9578a);
                if (childAt2 != null) {
                    int i5 = jVar.f9555i0;
                    jVar.f9529Q.getItemId(i5);
                    if (!E() || jVar.f9586s) {
                        z4 = false;
                    } else {
                        z4 = jVar.F(i5);
                    }
                    if (z4) {
                        jVar.f9558l0 = -1;
                        jVar.setPressed(false);
                        childAt2.setPressed(false);
                        return;
                    }
                    jVar.f9558l0 = 2;
                    return;
                }
                return;
        }
    }
}
