package K4;

import J4.a;
import L4.d;
import M4.e;
import android.view.View;
import androidx.fragment.app.C0269a;
import d5.o;
import e5.C0509f;

public final class n extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1581a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o f1582b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, View view, int i2) {
        super(view);
        this.f1581a = i2;
        this.f1582b = oVar;
    }

    public final void onClick(View view) {
        switch (this.f1581a) {
            case 0:
                super.onClick(view);
                o oVar = this.f1582b;
                o.V(oVar, new d(oVar.f1583d0));
                return;
            case 1:
                super.onClick(view);
                o oVar2 = this.f1582b;
                o.V(oVar2, new a(oVar2.f1583d0, 3));
                return;
            case 2:
                super.onClick(view);
                o oVar3 = this.f1582b;
                o.V(oVar3, new N4.a(oVar3.f1583d0));
                oVar3.f1593n0.setVisibility(8);
                return;
            case 3:
                super.onClick(view);
                o oVar4 = this.f1582b;
                o.V(oVar4, new e(oVar4.f1583d0));
                oVar4.f1594o0.setVisibility(8);
                return;
            case 4:
                super.onClick(view);
                o oVar5 = this.f1582b;
                o.V(oVar5, new k(oVar5.f1583d0, o.getAccountObject().getId()));
                return;
            default:
                super.onClick(view);
                o oVar6 = this.f1582b;
                C0269a aVar = new C0269a(oVar6.p());
                aVar.h(oVar6);
                aVar.c();
                aVar.e(false);
                return;
        }
    }
}
