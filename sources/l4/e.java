package l4;

import R2.b;
import android.view.View;
import android.widget.RelativeLayout;
import e5.C0505b;
import e5.C0509f;

public final class e extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9768a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0505b f9769b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i f9770c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(i iVar, RelativeLayout relativeLayout, C0505b bVar, int i2) {
        super(relativeLayout);
        this.f9768a = i2;
        this.f9770c = iVar;
        this.f9769b = bVar;
    }

    public final void onClick(View view) {
        switch (this.f9768a) {
            case 0:
                super.onClick(view);
                this.f9769b.dismiss();
                i iVar = this.f9770c;
                iVar.f9802Z0 = false;
                b.w(true);
                iVar.f9792N0.E("profilePicUrl").I("no_profile_pic").addOnSuccessListener(new H4.e(this, 27));
                return;
            default:
                super.onClick(view);
                this.f9769b.dismiss();
                this.f9770c.f9802Z0 = false;
                return;
        }
    }
}
