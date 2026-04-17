package R4;

import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0286s;
import androidx.fragment.app.I;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import e5.C0509f;
import f.C0518i;
import o3.d;

public final class f extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2551a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f2552b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, View view, int i2) {
        super(view);
        this.f2551a = i2;
        this.f2552b = gVar;
    }

    public final void onClick(View view) {
        switch (this.f2551a) {
            case 0:
                super.onClick(view);
                g gVar = this.f2552b;
                int visibility = gVar.f2571j0.getVisibility();
                MainActivity mainActivity = gVar.f2565d0;
                if (visibility == 8) {
                    gVar.f2571j0.setVisibility(0);
                    gVar.f2571j0.setAnimation(AnimationUtils.loadAnimation(mainActivity, R.anim.from_bottom_to_position));
                    return;
                }
                gVar.f2571j0.setAnimation(AnimationUtils.loadAnimation(mainActivity, R.anim.from_position_to_bottom));
                gVar.f2571j0.setVisibility(8);
                return;
            case 1:
                super.onClick(view);
                g gVar2 = this.f2552b;
                I l6 = gVar2.f2565d0.l();
                C0269a b6 = d.b(l6, l6);
                b6.f(R.id.activity_main_body_frame_layout, new d(gVar2.f2565d0), (String) null, 1);
                a.j(b6, false);
                return;
            default:
                super.onClick(view);
                g gVar3 = this.f2552b;
                if (gVar3.f2571j0.getVisibility() == 0) {
                    gVar3.f2571j0.setVisibility(8);
                    gVar3.f2571j0.setAnimation(AnimationUtils.loadAnimation(gVar3.f2565d0, R.anim.from_position_to_bottom));
                    return;
                }
                e eVar = gVar3.f2579r0;
                if (eVar != null) {
                    gVar3.f2578q0.u(eVar);
                    gVar3.f2578q0 = null;
                    gVar3.f2579r0 = null;
                }
                C0518i iVar = (C0518i) view.getContext();
                for (C0286s sVar : iVar.l().f5000c.v()) {
                    if ((sVar instanceof i) || (sVar instanceof g)) {
                        I l7 = iVar.l();
                        l7.getClass();
                        C0269a aVar = new C0269a(l7);
                        aVar.h(sVar);
                        aVar.e(false);
                    }
                }
                return;
        }
    }
}
