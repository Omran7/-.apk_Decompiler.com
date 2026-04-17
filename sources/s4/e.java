package S4;

import R2.b;
import android.content.Context;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0286s;
import androidx.fragment.app.I;
import com.mtma.criminal.city.R;
import e5.C0509f;
import f.C0518i;
import java.util.Iterator;
import o3.d;

public final class e extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2755a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f2756b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, View view, int i2) {
        super(view);
        this.f2755a = i2;
        this.f2756b = fVar;
    }

    public final void onClick(View view) {
        switch (this.f2755a) {
            case 0:
                super.onClick(view);
                f fVar = this.f2756b;
                if (fVar.f2774j0.getVisibility() == 8) {
                    fVar.f2774j0.setVisibility(0);
                    fVar.f2774j0.setAnimation(AnimationUtils.loadAnimation(fVar.f2768d0, R.anim.from_bottom_to_position));
                    return;
                }
                fVar.f2774j0.setAnimation(AnimationUtils.loadAnimation(fVar.f2768d0, R.anim.from_position_to_bottom));
                fVar.f2774j0.setVisibility(8);
                return;
            default:
                super.onClick(view);
                f fVar2 = this.f2756b;
                int visibility = fVar2.f2774j0.getVisibility();
                Context context = fVar2.f2768d0;
                if (visibility == 0) {
                    fVar2.f2774j0.setVisibility(8);
                    fVar2.f2774j0.setAnimation(AnimationUtils.loadAnimation(context, R.anim.from_position_to_bottom));
                    return;
                }
                C0518i iVar = (C0518i) view.getContext();
                Iterator it2 = iVar.l().f5000c.v().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C0286s sVar = (C0286s) it2.next();
                        if (sVar instanceof f) {
                            I l6 = iVar.l();
                            l6.getClass();
                            C0269a aVar = new C0269a(l6);
                            aVar.h(sVar);
                            aVar.e(false);
                        }
                    }
                }
                I l7 = iVar.l();
                C0269a b6 = d.b(l7, l7);
                b6.i(R.id.fragment_store_frame_layout, new d(context));
                b6.c();
                b6.e(false);
                b.N0();
                return;
        }
    }
}
