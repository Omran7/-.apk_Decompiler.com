package androidx.fragment.app;

import I1.b;
import android.view.View;

/* renamed from: androidx.fragment.app.o  reason: case insensitive filesystem */
public final class C0283o extends b {

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ C0286s f5133p;

    public C0283o(C0286s sVar) {
        this.f5133p = sVar;
    }

    public final View v0(int i2) {
        C0286s sVar = this.f5133p;
        View view = sVar.f5159N;
        if (view != null) {
            return view.findViewById(i2);
        }
        throw new IllegalStateException("Fragment " + sVar + " does not have a view");
    }

    public final boolean y0() {
        if (this.f5133p.f5159N != null) {
            return true;
        }
        return false;
    }
}
