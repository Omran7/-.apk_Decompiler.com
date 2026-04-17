package P4;

import H4.d;
import R2.b;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.firebase.auth.FirebaseAuth;
import d5.o;
import e5.C0505b;
import e5.C0509f;

public final class f extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2204a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0505b f2205b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f2206c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, RelativeLayout relativeLayout, C0505b bVar, int i2) {
        super(relativeLayout);
        this.f2204a = i2;
        this.f2206c = gVar;
        this.f2205b = bVar;
    }

    public final void onClick(View view) {
        switch (this.f2204a) {
            case 0:
                super.onClick(view);
                this.f2205b.dismiss();
                g gVar = this.f2206c;
                gVar.f2218o0 = false;
                b.w(true);
                FirebaseAuth.getInstance().a(o.getAccountObject().getEmail()).addOnCompleteListener(new d((Object) gVar, 5));
                return;
            default:
                super.onClick(view);
                this.f2205b.dismiss();
                this.f2206c.f2218o0 = false;
                return;
        }
    }
}
