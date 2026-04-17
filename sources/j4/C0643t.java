package j4;

import android.view.View;
import android.widget.RelativeLayout;
import e5.C0505b;
import e5.C0509f;

/* renamed from: j4.t  reason: case insensitive filesystem */
public final class C0643t extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9096a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0505b f9097b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0645v f9098c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0643t(C0645v vVar, RelativeLayout relativeLayout, C0505b bVar, int i2) {
        super(relativeLayout);
        this.f9096a = i2;
        this.f9098c = vVar;
        this.f9097b = bVar;
    }

    public final void onClick(View view) {
        switch (this.f9096a) {
            case 0:
                super.onClick(view);
                this.f9097b.dismiss();
                this.f9098c.f9113f = false;
                return;
            case 1:
                super.onClick(view);
                this.f9097b.dismiss();
                this.f9098c.g = false;
                return;
            case 2:
                super.onClick(view);
                this.f9097b.dismiss();
                this.f9098c.f9111c = false;
                return;
            case 3:
                super.onClick(view);
                this.f9097b.dismiss();
                this.f9098c.d = false;
                return;
            default:
                super.onClick(view);
                this.f9097b.dismiss();
                this.f9098c.f9112e = false;
                return;
        }
    }
}
