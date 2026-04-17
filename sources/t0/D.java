package t0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.c;

public final class D extends AnimatorListenerAdapter implements k {

    /* renamed from: a  reason: collision with root package name */
    public final View f11613a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11614b;

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f11615c;
    public final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11616e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f11617f = false;

    public D(View view, int i2) {
        this.f11613a = view;
        this.f11614b = i2;
        this.f11615c = (ViewGroup) view.getParent();
        this.d = true;
        g(true);
    }

    public final void c() {
        g(false);
        if (!this.f11617f) {
            w.b(this.f11613a, this.f11614b);
        }
    }

    public final void d() {
        g(true);
        if (!this.f11617f) {
            w.b(this.f11613a, 0);
        }
    }

    public final void f(m mVar) {
        mVar.y(this);
    }

    public final void g(boolean z3) {
        ViewGroup viewGroup;
        if (this.d && this.f11616e != z3 && (viewGroup = this.f11615c) != null) {
            this.f11616e = z3;
            c.C0(viewGroup, z3);
        }
    }

    public final void onAnimationCancel(Animator animator) {
        this.f11617f = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f11617f) {
            w.b(this.f11613a, this.f11614b);
            ViewGroup viewGroup = this.f11615c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationStart(Animator animator, boolean z3) {
        if (z3) {
            w.b(this.f11613a, 0);
            ViewGroup viewGroup = this.f11615c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    public final void onAnimationEnd(Animator animator, boolean z3) {
        if (!z3) {
            if (!this.f11617f) {
                w.b(this.f11613a, this.f11614b);
                ViewGroup viewGroup = this.f11615c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }
    }

    public final void b(m mVar) {
    }

    public final void e(m mVar) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }
}
