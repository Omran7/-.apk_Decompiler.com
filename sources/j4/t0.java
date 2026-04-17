package j4;

import android.view.View;
import e5.C0505b;
import e5.C0509f;

public final class t0 extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9099a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0505b f9100b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Z f9101c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(Z z3, View view, C0505b bVar, int i2) {
        super(view);
        this.f9099a = i2;
        this.f9101c = z3;
        this.f9100b = bVar;
    }

    public final void onClick(View view) {
        switch (this.f9099a) {
            case 0:
                super.onClick(view);
                this.f9100b.dismiss();
                this.f9101c.f8967e = false;
                return;
            default:
                super.onClick(view);
                this.f9100b.dismiss();
                this.f9101c.f8968f = false;
                return;
        }
    }
}
