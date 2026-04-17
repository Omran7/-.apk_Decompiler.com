package K;

import android.animation.Animator;
import android.view.View;
import java.lang.ref.WeakReference;

public final class X {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f1362a;

    public X(View view) {
        this.f1362a = new WeakReference(view);
    }

    public final void a(float f6) {
        View view = (View) this.f1362a.get();
        if (view != null) {
            view.animate().alpha(f6);
        }
    }

    public final void b() {
        View view = (View) this.f1362a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j6) {
        View view = (View) this.f1362a.get();
        if (view != null) {
            view.animate().setDuration(j6);
        }
    }

    public final void d(Y y6) {
        View view = (View) this.f1362a.get();
        if (view == null) {
            return;
        }
        if (y6 != null) {
            view.animate().setListener(new W(y6, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    public final void e(float f6) {
        View view = (View) this.f1362a.get();
        if (view != null) {
            view.animate().translationY(f6);
        }
    }
}
