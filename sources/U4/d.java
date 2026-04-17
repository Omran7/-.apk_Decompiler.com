package u4;

import Y4.D;
import android.view.View;
import e5.C0509f;
import j4.p0;

public final class d extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11869a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ D f11870b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p0 f11871c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(p0 p0Var, View view, D d, int i2) {
        super(view);
        this.f11869a = i2;
        this.f11871c = p0Var;
        this.f11870b = d;
    }

    public final void onClick(View view) {
        switch (this.f11869a) {
            case 0:
                super.onClick(view);
                g.V((g) this.f11871c.f9075b, view, this.f11870b);
                return;
            case 1:
                super.onClick(view);
                g.V((g) this.f11871c.f9075b, view, this.f11870b);
                return;
            case 2:
                super.onClick(view);
                g.V((g) this.f11871c.f9075b, view, this.f11870b);
                return;
            default:
                super.onClick(view);
                g.V((g) this.f11871c.f9075b, view, this.f11870b);
                return;
        }
    }
}
