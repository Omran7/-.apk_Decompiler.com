package r0;

import android.animation.ValueAnimator;

/* renamed from: r0.b  reason: case insensitive filesystem */
public final class C0941b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0943d f11129a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0944e f11130b;

    public C0941b(C0944e eVar, C0943d dVar) {
        this.f11130b = eVar;
        this.f11129a = dVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C0944e eVar = this.f11130b;
        eVar.getClass();
        C0943d dVar = this.f11129a;
        C0944e.d(floatValue, dVar);
        eVar.a(floatValue, dVar, false);
        eVar.invalidateSelf();
    }
}
