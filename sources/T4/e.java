package T4;

import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.I;
import com.mtma.criminal.city.R;
import e5.C0509f;
import f.C0518i;

public final class e extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3602a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f3603b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, View view, int i2) {
        super(view);
        this.f3602a = i2;
        this.f3603b = fVar;
    }

    public final void onClick(View view) {
        switch (this.f3602a) {
            case 0:
                super.onClick(view);
                f fVar = this.f3603b;
                if (fVar.f3623k0.getVisibility() == 8) {
                    fVar.f3623k0.setVisibility(0);
                    fVar.f3623k0.setAnimation(AnimationUtils.loadAnimation(fVar.f3616d0, R.anim.from_bottom_to_position));
                    return;
                }
                fVar.f3623k0.setAnimation(AnimationUtils.loadAnimation(fVar.f3616d0, R.anim.from_position_to_bottom));
                fVar.f3623k0.setVisibility(8);
                return;
            default:
                super.onClick(view);
                f fVar2 = this.f3603b;
                if (fVar2.f3623k0.getVisibility() == 0) {
                    fVar2.f3623k0.setVisibility(8);
                    fVar2.f3623k0.setAnimation(AnimationUtils.loadAnimation(fVar2.f3616d0, R.anim.from_position_to_bottom));
                    return;
                }
                I l6 = ((C0518i) view.getContext()).l();
                l6.getClass();
                C0269a aVar = new C0269a(l6);
                aVar.h(fVar2);
                aVar.e(false);
                return;
        }
    }
}
