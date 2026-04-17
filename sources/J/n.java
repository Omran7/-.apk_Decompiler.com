package j;

import android.view.ActionProvider;
import com.mtma.criminal.city.utils.K;

public final class n implements ActionProvider.VisibilityListener {

    /* renamed from: a  reason: collision with root package name */
    public K f8772a;

    /* renamed from: b  reason: collision with root package name */
    public final ActionProvider f8773b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ r f8774c;

    public n(r rVar, ActionProvider actionProvider) {
        this.f8774c = rVar;
        this.f8773b = actionProvider;
    }

    public final void onActionProviderVisibilityChanged(boolean z3) {
        K k6 = this.f8772a;
        if (k6 != null) {
            k kVar = ((m) k6.f7360b).f8768w;
            kVar.f8732q = true;
            kVar.p(true);
        }
    }
}
