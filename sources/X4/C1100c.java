package x4;

import R2.b;
import android.view.View;
import android.widget.RelativeLayout;
import com.bumptech.glide.c;
import com.mtma.criminal.city.utils.U;
import d5.o;
import e5.C0505b;
import e5.C0509f;

/* renamed from: x4.c  reason: case insensitive filesystem */
public final class C1100c extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f12560a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0505b f12561b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C1101d f12562c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1100c(C1101d dVar, RelativeLayout relativeLayout, long j6, C0505b bVar) {
        super(relativeLayout);
        this.f12562c = dVar;
        this.f12560a = j6;
        this.f12561b = bVar;
    }

    public final void onClick(View view) {
        super.onClick(view);
        long cash = o.getMoneyObject().getCash();
        long j6 = this.f12560a;
        int i2 = (j6 > cash ? 1 : (j6 == cash ? 0 : -1));
        C1101d dVar = this.f12562c;
        if (i2 > 0) {
            c.x0(dVar.f12563d0);
        } else {
            dVar.getClass();
            b.w(true);
            U.g(o.getAccountObject().getId(), "cash", -j6, new C1098a(dVar));
        }
        this.f12561b.dismiss();
        dVar.f12576q0 = false;
    }
}
