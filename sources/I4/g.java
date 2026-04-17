package I4;

import android.view.View;
import androidx.fragment.app.C0269a;
import e5.C0509f;

public final class g extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1216a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f1217b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, View view, int i2) {
        super(view);
        this.f1216a = i2;
        this.f1217b = hVar;
    }

    public final void onClick(View view) {
        switch (this.f1216a) {
            case 0:
                super.onClick(view);
                h hVar = this.f1217b;
                hVar.f1224j0.clear();
                hVar.V();
                return;
            default:
                super.onClick(view);
                h hVar2 = this.f1217b;
                C0269a aVar = new C0269a(hVar2.p());
                aVar.h(hVar2);
                aVar.e(false);
                return;
        }
    }
}
