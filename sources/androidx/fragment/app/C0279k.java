package androidx.fragment.app;

import I1.b;
import android.app.Dialog;
import android.view.View;

/* renamed from: androidx.fragment.app.k  reason: case insensitive filesystem */
public final class C0279k extends b {

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ C0283o f5115p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ C0280l f5116q;

    public C0279k(C0280l lVar, C0283o oVar) {
        this.f5116q = lVar;
        this.f5115p = oVar;
    }

    public final View v0(int i2) {
        C0283o oVar = this.f5115p;
        if (oVar.y0()) {
            return oVar.v0(i2);
        }
        Dialog dialog = this.f5116q.f5126m0;
        if (dialog != null) {
            return dialog.findViewById(i2);
        }
        return null;
    }

    public final boolean y0() {
        if (this.f5115p.y0() || this.f5116q.f5130q0) {
            return true;
        }
        return false;
    }
}
