package P4;

import R2.b;
import android.os.Handler;
import android.view.View;
import android.widget.RelativeLayout;
import e5.C0505b;
import e5.C0509f;

public final class p extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2266a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0505b f2267b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ s f2268c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(s sVar, RelativeLayout relativeLayout, C0505b bVar, int i2) {
        super(relativeLayout);
        this.f2266a = i2;
        this.f2268c = sVar;
        this.f2267b = bVar;
    }

    public final void onClick(View view) {
        switch (this.f2266a) {
            case 0:
                super.onClick(view);
                this.f2267b.dismiss();
                this.f2268c.f2281m0 = false;
                return;
            case 1:
                super.onClick(view);
                this.f2267b.dismiss();
                this.f2268c.f2282n0 = false;
                b.w(true);
                new Handler().postDelayed(new q(0), 1200);
                return;
            default:
                super.onClick(view);
                this.f2267b.dismiss();
                this.f2268c.f2282n0 = false;
                return;
        }
    }
}
