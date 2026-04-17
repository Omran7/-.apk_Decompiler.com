package K4;

import android.view.View;
import e5.C0505b;
import e5.C0509f;

public final class d extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1508a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0505b f1509b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k f1510c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(k kVar, View view, C0505b bVar, int i2) {
        super(view);
        this.f1508a = i2;
        this.f1510c = kVar;
        this.f1509b = bVar;
    }

    public final void onClick(View view) {
        switch (this.f1508a) {
            case 0:
                super.onClick(view);
                this.f1509b.dismiss();
                this.f1510c.f1549V0 = false;
                return;
            case 1:
                super.onClick(view);
                this.f1509b.dismiss();
                this.f1510c.f1551Y0 = false;
                return;
            default:
                super.onClick(view);
                this.f1509b.dismiss();
                this.f1510c.f1550W0 = false;
                return;
        }
    }
}
