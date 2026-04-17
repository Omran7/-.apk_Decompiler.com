package t0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
import android.view.View;
import com.mtma.criminal.city.R;

public final class g extends AnimatorListenerAdapter implements k {

    /* renamed from: a  reason: collision with root package name */
    public final View f11646a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f11647b = false;

    public g(View view) {
        this.f11646a = view;
    }

    public final void c() {
        float f6;
        View view = this.f11646a;
        if (view.getVisibility() == 0) {
            f6 = w.f11697a.F0(view);
        } else {
            f6 = 0.0f;
        }
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(f6));
    }

    public final void d() {
        this.f11646a.setTag(R.id.transition_pause_alpha, (Object) null);
    }

    public final void onAnimationCancel(Animator animator) {
        w.f11697a.b1(this.f11646a, 1.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    public final void onAnimationStart(Animator animator) {
        View view = this.f11646a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f11647b = true;
            view.setLayerType(2, (Paint) null);
        }
    }

    public final void onAnimationEnd(Animator animator, boolean z3) {
        boolean z4 = this.f11647b;
        View view = this.f11646a;
        if (z4) {
            view.setLayerType(0, (Paint) null);
        }
        if (!z3) {
            C0979B b6 = w.f11697a;
            b6.b1(view, 1.0f);
            b6.getClass();
        }
    }

    public final void a(m mVar) {
    }

    public final void b(m mVar) {
    }

    public final void e(m mVar) {
    }

    public final void f(m mVar) {
    }
}
