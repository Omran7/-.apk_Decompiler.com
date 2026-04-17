package U4;

import android.content.Context;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0286s;
import androidx.fragment.app.I;
import com.mtma.criminal.city.R;
import e5.C0509f;
import f.C0518i;

public final class b extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3722a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f3723b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, View view, int i2) {
        super(view);
        this.f3722a = i2;
        this.f3723b = cVar;
    }

    public final void onClick(View view) {
        switch (this.f3722a) {
            case 0:
                super.onClick(view);
                c cVar = this.f3723b;
                if (cVar.f3742k0.getVisibility() == 8) {
                    cVar.f3742k0.setVisibility(0);
                    cVar.f3742k0.setAnimation(AnimationUtils.loadAnimation(cVar.f3735d0, R.anim.from_bottom_to_position));
                    return;
                }
                cVar.f3742k0.setAnimation(AnimationUtils.loadAnimation(cVar.f3735d0, R.anim.from_position_to_bottom));
                cVar.f3742k0.setVisibility(8);
                return;
            default:
                super.onClick(view);
                c cVar2 = this.f3723b;
                int visibility = cVar2.f3742k0.getVisibility();
                Context context = cVar2.f3735d0;
                if (visibility == 0) {
                    cVar2.f3742k0.setVisibility(8);
                    cVar2.f3742k0.setAnimation(AnimationUtils.loadAnimation(context, R.anim.from_position_to_bottom));
                    return;
                }
                C0518i iVar = (C0518i) view.getContext();
                for (C0286s sVar : iVar.l().f5000c.v()) {
                    if ((sVar instanceof a) || (sVar instanceof c)) {
                        I l6 = iVar.l();
                        l6.getClass();
                        C0269a aVar = new C0269a(l6);
                        aVar.h(sVar);
                        aVar.e(false);
                    }
                }
                a aVar2 = new a(context);
                I l7 = iVar.l();
                l7.getClass();
                C0269a aVar3 = new C0269a(l7);
                aVar3.i(R.id.fragment_store_frame_layout, aVar2);
                aVar3.c();
                aVar3.e(false);
                R2.b.N0();
                return;
        }
    }
}
