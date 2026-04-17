package r0;

import android.graphics.drawable.ShapeDrawable;
import android.view.animation.Animation;
import android.widget.ImageView;

/* renamed from: r0.a  reason: case insensitive filesystem */
public final class C0940a extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    public Animation.AnimationListener f11127a;

    /* renamed from: b  reason: collision with root package name */
    public int f11128b;

    public final void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f11127a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public final void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f11127a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    public final void onMeasure(int i2, int i5) {
        super.onMeasure(i2, i5);
    }

    public final void setBackgroundColor(int i2) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i2);
            this.f11128b = i2;
        }
    }
}
