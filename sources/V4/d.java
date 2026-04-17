package V4;

import R2.b;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.C0269a;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import d5.o;
import e5.C0509f;

public final class d extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3795a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f3796b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(h hVar, View view, int i2) {
        super(view);
        this.f3795a = i2;
        this.f3796b = hVar;
    }

    public final void onClick(View view) {
        int i2;
        switch (this.f3795a) {
            case 0:
                super.onClick(view);
                h hVar = this.f3796b;
                if (hVar.f3815K0.getVisibility() == 0) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                hVar.f3815K0.setVisibility(i2);
                hVar.L0.setVisibility(i2);
                hVar.f3816M0.setVisibility(i2);
                hVar.f3817N0.setVisibility(i2);
                return;
            case 1:
                super.onClick(view);
                h.X(this.f3796b);
                return;
            case 2:
                super.onClick(view);
                h hVar2 = this.f3796b;
                int visibility = hVar2.f3849w0.getVisibility();
                Context context = hVar2.f3831d0;
                if (visibility == 0) {
                    a.k(MyApplication.f7090a, R.string.select_weapon_first, context);
                    return;
                } else if (hVar2.f3822T0 >= 12) {
                    a.k(MyApplication.f7090a, R.string.weapon_reach_maximum_level, context);
                    return;
                } else if (o.getMoneyObject().getCash() < hVar2.f3827Z0) {
                    c.x0(context);
                    return;
                } else if (hVar2.f3824V0 < hVar2.X0) {
                    a.n(MyApplication.f7090a, R.string.do_not_have_enough_palladium, context, (String) null);
                    return;
                } else if (o.getUpgradeObject().getEmblem() < hVar2.f3826Y0) {
                    a.n(MyApplication.f7090a, R.string.do_not_have_enough_emblems, context, (String) null);
                    return;
                } else {
                    b.w(true);
                    android.support.v4.media.session.a.i0(new b(hVar2, 0));
                    return;
                }
            case 3:
                super.onClick(view);
                h.X(this.f3796b);
                return;
            default:
                super.onClick(view);
                h hVar3 = this.f3796b;
                C0269a aVar = new C0269a(hVar3.p());
                aVar.h(hVar3);
                aVar.e(false);
                return;
        }
    }
}
