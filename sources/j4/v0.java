package j4;

import android.view.View;
import e5.C0505b;
import e5.C0509f;

public final class v0 extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9114a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0505b f9115b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ A0 f9116c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(A0 a02, View view, C0505b bVar, int i2) {
        super(view);
        this.f9114a = i2;
        this.f9116c = a02;
        this.f9115b = bVar;
    }

    public final void onClick(View view) {
        switch (this.f9114a) {
            case 0:
                super.onClick(view);
                this.f9115b.dismiss();
                this.f9116c.d = false;
                return;
            case 1:
                super.onClick(view);
                this.f9115b.dismiss();
                this.f9116c.f8841c = false;
                return;
            case 2:
                super.onClick(view);
                this.f9115b.dismiss();
                this.f9116c.f8842e = false;
                return;
            default:
                super.onClick(view);
                this.f9115b.dismiss();
                this.f9116c.d = false;
                return;
        }
    }
}
