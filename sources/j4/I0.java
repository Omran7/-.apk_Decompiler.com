package j4;

import android.view.View;
import android.widget.ImageView;
import e5.C0505b;
import e5.C0509f;

public final class I0 extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8893a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0505b f8894b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ M0 f8895c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I0(M0 m02, ImageView imageView, C0505b bVar, int i2) {
        super(imageView);
        this.f8893a = i2;
        this.f8895c = m02;
        this.f8894b = bVar;
    }

    public final void onClick(View view) {
        switch (this.f8893a) {
            case 0:
                super.onClick(view);
                this.f8894b.dismiss();
                this.f8895c.h = false;
                return;
            case 1:
                super.onClick(view);
                this.f8894b.dismiss();
                this.f8895c.f8925j = false;
                return;
            default:
                super.onClick(view);
                this.f8894b.dismiss();
                this.f8895c.f8924i = false;
                return;
        }
    }
}
