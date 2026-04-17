package v2;

import android.animation.ValueAnimator;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: v2.b  reason: case insensitive filesystem */
public final /* synthetic */ class C1043b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12166a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1045d f12167b;

    public /* synthetic */ C1043b(C1045d dVar, int i2) {
        this.f12166a = i2;
        this.f12167b = dVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12166a) {
            case 0:
                C1045d dVar = this.f12167b;
                dVar.getClass();
                dVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                C1045d dVar2 = this.f12167b;
                dVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = dVar2.d;
                checkableImageButton.setScaleX(floatValue);
                checkableImageButton.setScaleY(floatValue);
                return;
        }
    }
}
