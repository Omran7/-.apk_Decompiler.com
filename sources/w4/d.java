package W4;

import android.view.View;
import android.widget.RelativeLayout;
import com.mtma.criminal.city.R;
import e5.C0509f;

public final class d extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f4095a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f4096b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(g gVar, RelativeLayout relativeLayout, boolean z3) {
        super(relativeLayout);
        this.f4096b = gVar;
        this.f4095a = z3;
    }

    public final void onClick(View view) {
        super.onClick(view);
        boolean z3 = this.f4095a;
        g gVar = this.f4096b;
        if (z3) {
            gVar.a0(gVar.r(R.string.confirm_to_get_promotion), 1, true);
        } else {
            gVar.a0(gVar.r(R.string.can_not_get_promotion), -1, false);
        }
    }
}
