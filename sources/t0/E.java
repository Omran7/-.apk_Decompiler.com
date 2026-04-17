package t0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;
import com.mtma.criminal.city.R;

public final class E extends AnimatorListenerAdapter implements k {

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f11618a;

    /* renamed from: b  reason: collision with root package name */
    public final View f11619b;

    /* renamed from: c  reason: collision with root package name */
    public final View f11620c;
    public boolean d = true;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ h f11621e;

    public E(h hVar, FrameLayout frameLayout, View view, View view2) {
        this.f11621e = hVar;
        this.f11618a = frameLayout;
        this.f11619b = view;
        this.f11620c = view2;
    }

    public final void b(m mVar) {
        if (this.d) {
            g();
        }
    }

    public final void f(m mVar) {
        mVar.y(this);
    }

    public final void g() {
        this.f11620c.setTag(R.id.save_overlay_view, (Object) null);
        this.f11618a.getOverlay().remove(this.f11619b);
        this.d = false;
    }

    public final void onAnimationEnd(Animator animator) {
        g();
    }

    public final void onAnimationPause(Animator animator) {
        this.f11618a.getOverlay().remove(this.f11619b);
    }

    public final void onAnimationResume(Animator animator) {
        View view = this.f11619b;
        if (view.getParent() == null) {
            this.f11618a.getOverlay().add(view);
        } else {
            this.f11621e.c();
        }
    }

    public final void onAnimationStart(Animator animator, boolean z3) {
        if (z3) {
            View view = this.f11620c;
            View view2 = this.f11619b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f11618a.getOverlay().add(view2);
            this.d = true;
        }
    }

    public final void onAnimationEnd(Animator animator, boolean z3) {
        if (!z3) {
            g();
        }
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void e(m mVar) {
    }
}
