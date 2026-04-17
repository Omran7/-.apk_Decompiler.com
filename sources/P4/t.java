package P4;

import R2.b;
import R2.i;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.mtma.criminal.city.utils.K;
import d5.o;
import e3.m;
import e5.C0505b;
import e5.C0509f;
import f3.C0528e;

public final class t extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2283a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0505b f2284b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ w f2285c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(w wVar, RelativeLayout relativeLayout, C0505b bVar, int i2) {
        super(relativeLayout);
        this.f2283a = i2;
        this.f2285c = wVar;
        this.f2284b = bVar;
    }

    public final void onClick(View view) {
        switch (this.f2283a) {
            case 0:
                super.onClick(view);
                this.f2284b.dismiss();
                this.f2285c.f2308w0 = false;
                return;
            case 1:
                super.onClick(view);
                this.f2284b.dismiss();
                w wVar = this.f2285c;
                wVar.f2307v0 = false;
                b.w(true);
                FirebaseAuth.getInstance().a(o.getAccountObject().getEmail()).addOnCompleteListener(new u(wVar, 1));
                return;
            case 2:
                super.onClick(view);
                this.f2284b.dismiss();
                this.f2285c.f2307v0 = false;
                return;
            default:
                super.onClick(view);
                this.f2284b.dismiss();
                w wVar2 = this.f2285c;
                wVar2.f2308w0 = false;
                b.w(true);
                m mVar = FirebaseAuth.getInstance().f6866f;
                if (mVar != null) {
                    FirebaseAuth.getInstance(i.f(((C0528e) mVar).f7922c)).c(mVar, false).continueWithTask(new K(mVar, 17)).addOnCompleteListener(new u(wVar2, 0));
                    return;
                }
                return;
        }
    }
}
