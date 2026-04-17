package P4;

import android.view.View;
import androidx.fragment.app.C0269a;
import e5.C0509f;

public final class r extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2270a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s f2271b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(s sVar, View view, int i2) {
        super(view);
        this.f2270a = i2;
        this.f2271b = sVar;
    }

    public final void onClick(View view) {
        switch (this.f2270a) {
            case 0:
                super.onClick(view);
                s sVar = this.f2271b;
                s.V(sVar, new l(sVar.f2272d0));
                return;
            default:
                super.onClick(view);
                s sVar2 = this.f2271b;
                C0269a aVar = new C0269a(sVar2.p());
                aVar.h(sVar2);
                aVar.e(false);
                return;
        }
    }
}
