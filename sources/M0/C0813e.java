package m0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: m0.e  reason: case insensitive filesystem */
public final class C0813e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9957a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0814f f9958b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f9959c;
    public final /* synthetic */ View d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C0816h f9960e;

    public /* synthetic */ C0813e(C0816h hVar, C0814f fVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i2) {
        this.f9957a = i2;
        this.f9960e = hVar;
        this.f9958b = fVar;
        this.f9959c = viewPropertyAnimator;
        this.d = view;
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.f9957a) {
            case 0:
                this.f9959c.setListener((Animator.AnimatorListener) null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0814f fVar = this.f9958b;
                T t6 = fVar.f9961a;
                C0816h hVar = this.f9960e;
                hVar.c(t6);
                hVar.f9983r.remove(fVar.f9961a);
                hVar.i();
                return;
            default:
                this.f9959c.setListener((Animator.AnimatorListener) null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0814f fVar2 = this.f9958b;
                T t7 = fVar2.f9962b;
                C0816h hVar2 = this.f9960e;
                hVar2.c(t7);
                hVar2.f9983r.remove(fVar2.f9962b);
                hVar2.i();
                return;
        }
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.f9957a) {
            case 0:
                T t6 = this.f9958b.f9961a;
                this.f9960e.getClass();
                return;
            default:
                T t7 = this.f9958b.f9962b;
                this.f9960e.getClass();
                return;
        }
    }
}
