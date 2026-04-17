package W4;

import android.view.View;
import android.widget.RelativeLayout;
import e5.C0505b;
import e5.C0509f;

public final class f extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4100a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0505b f4101b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f4102c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, RelativeLayout relativeLayout, C0505b bVar, int i2) {
        super(relativeLayout);
        this.f4100a = i2;
        this.f4102c = gVar;
        this.f4101b = bVar;
    }

    public final void onClick(View view) {
        switch (this.f4100a) {
            case 0:
                super.onClick(view);
                this.f4101b.dismiss();
                this.f4102c.f4117q0 = false;
                return;
            default:
                super.onClick(view);
                this.f4101b.dismiss();
                this.f4102c.f4117q0 = false;
                return;
        }
    }
}
