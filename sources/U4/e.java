package u4;

import Y4.D;
import android.view.View;
import e5.C0509f;
import k.C0724m;

public final class e extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11872a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ D f11873b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0724m f11874c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(C0724m mVar, View view, D d, int i2) {
        super(view);
        this.f11872a = i2;
        this.f11874c = mVar;
        this.f11873b = d;
    }

    public final void onClick(View view) {
        switch (this.f11872a) {
            case 0:
                super.onClick(view);
                g.V((g) this.f11874c.f9345b, view, this.f11873b);
                return;
            case 1:
                super.onClick(view);
                g.V((g) this.f11874c.f9345b, view, this.f11873b);
                return;
            case 2:
                super.onClick(view);
                g.V((g) this.f11874c.f9345b, view, this.f11873b);
                return;
            default:
                super.onClick(view);
                g.V((g) this.f11874c.f9345b, view, this.f11873b);
                return;
        }
    }
}
