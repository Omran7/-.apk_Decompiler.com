package d2;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import m0.C0819k;
import s2.f;
import s2.g;

/* renamed from: d2.a  reason: case insensitive filesystem */
public final class C0462a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7515a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f7516b;

    public /* synthetic */ C0462a(Object obj, int i2) {
        this.f7515a = i2;
        this.f7516b = obj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f7515a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = ((BottomSheetBehavior) this.f7516b).f6323i;
                if (gVar != null) {
                    f fVar = gVar.f11459a;
                    if (fVar.f11446i != floatValue) {
                        fVar.f11446i = floatValue;
                        gVar.f11462e = true;
                        gVar.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int floatValue2 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0819k kVar = (C0819k) this.f7516b;
                kVar.f9993c.setAlpha(floatValue2);
                kVar.d.setAlpha(floatValue2);
                kVar.f10006s.invalidate();
                return;
            default:
                ((TextInputLayout) this.f7516b).f6517E0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
