package androidx.fragment.app;

import android.view.View;
import androidx.lifecycle.C0302m;
import androidx.lifecycle.C0306q;
import androidx.lifecycle.C0307s;

class Fragment$6 implements C0306q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0286s f4980a;

    public Fragment$6(C0286s sVar) {
        this.f4980a = sVar;
    }

    public final void a(C0307s sVar, C0302m mVar) {
        View view;
        if (mVar == C0302m.ON_STOP && (view = this.f4980a.f5159N) != null) {
            view.cancelPendingInputEvents();
        }
    }
}
