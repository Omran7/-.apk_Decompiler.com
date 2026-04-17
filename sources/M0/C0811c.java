package m0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: m0.c  reason: case insensitive filesystem */
public final class C0811c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9939a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ T f9940b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f9941c;
    public final /* synthetic */ ViewPropertyAnimator d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C0816h f9942e;

    public C0811c(C0816h hVar, T t6, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f9942e = hVar;
        this.f9940b = t6;
        this.d = viewPropertyAnimator;
        this.f9941c = view;
    }

    public void onAnimationCancel(Animator animator) {
        switch (this.f9939a) {
            case 1:
                this.f9941c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.f9939a) {
            case 0:
                this.d.setListener((Animator.AnimatorListener) null);
                this.f9941c.setAlpha(1.0f);
                C0816h hVar = this.f9942e;
                T t6 = this.f9940b;
                hVar.c(t6);
                hVar.f9982q.remove(t6);
                hVar.i();
                return;
            default:
                this.d.setListener((Animator.AnimatorListener) null);
                C0816h hVar2 = this.f9942e;
                T t7 = this.f9940b;
                hVar2.c(t7);
                hVar2.f9980o.remove(t7);
                hVar2.i();
                return;
        }
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.f9939a) {
            case 0:
                this.f9942e.getClass();
                return;
            default:
                this.f9942e.getClass();
                return;
        }
    }

    public C0811c(C0816h hVar, T t6, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f9942e = hVar;
        this.f9940b = t6;
        this.f9941c = view;
        this.d = viewPropertyAnimator;
    }
}
