package K;

import android.animation.ValueAnimator;
import android.view.View;
import com.mtma.criminal.city.fragments.gangBase.I;
import f.J;
import v2.i;

public final /* synthetic */ class V implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1358a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1359b;

    public /* synthetic */ V(I i2, View view) {
        this.f1359b = i2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1358a) {
            case 0:
                ((View) ((J) ((I) this.f1359b).f7143b).f7739s.getParent()).invalidate();
                return;
            default:
                i iVar = (i) this.f1359b;
                iVar.getClass();
                iVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }

    public /* synthetic */ V(i iVar) {
        this.f1359b = iVar;
    }
}
