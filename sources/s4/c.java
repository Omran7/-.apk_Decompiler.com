package S4;

import R4.i;
import android.content.Context;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0286s;
import androidx.fragment.app.I;
import com.mtma.criminal.city.R;
import e5.C0509f;
import f.C0518i;

public final class c extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2717a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f2718b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, View view, int i2) {
        super(view);
        this.f2717a = i2;
        this.f2718b = dVar;
    }

    public final void onClick(View view) {
        switch (this.f2717a) {
            case 0:
                super.onClick(view);
                d dVar = this.f2718b;
                if (dVar.f2739j0.getVisibility() == 8) {
                    dVar.f2739j0.setVisibility(0);
                    dVar.f2739j0.setAnimation(AnimationUtils.loadAnimation(dVar.f2733d0, R.anim.from_bottom_to_position));
                    return;
                }
                dVar.f2739j0.setAnimation(AnimationUtils.loadAnimation(dVar.f2733d0, R.anim.from_position_to_bottom));
                dVar.f2739j0.setVisibility(8);
                return;
            default:
                super.onClick(view);
                d dVar2 = this.f2718b;
                int visibility = dVar2.f2739j0.getVisibility();
                Context context = dVar2.f2733d0;
                if (visibility == 0) {
                    dVar2.f2739j0.setVisibility(8);
                    dVar2.f2739j0.setAnimation(AnimationUtils.loadAnimation(context, R.anim.from_position_to_bottom));
                    return;
                }
                a aVar = dVar2.f2746q0;
                if (aVar != null) {
                    dVar2.f2745p0.u(aVar);
                    dVar2.f2745p0 = null;
                    dVar2.f2746q0 = null;
                }
                C0518i iVar = (C0518i) context;
                for (C0286s sVar : iVar.l().f5000c.v()) {
                    if ((sVar instanceof i) || (sVar instanceof d)) {
                        I l6 = iVar.l();
                        l6.getClass();
                        C0269a aVar2 = new C0269a(l6);
                        aVar2.h(sVar);
                        aVar2.e(false);
                    }
                }
                return;
        }
    }
}
