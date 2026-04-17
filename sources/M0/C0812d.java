package m0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: m0.d  reason: case insensitive filesystem */
public final class C0812d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ T f9948a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f9949b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f9950c;
    public final /* synthetic */ int d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f9951e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ C0816h f9952f;

    public C0812d(C0816h hVar, T t6, int i2, View view, int i5, ViewPropertyAnimator viewPropertyAnimator) {
        this.f9952f = hVar;
        this.f9948a = t6;
        this.f9949b = i2;
        this.f9950c = view;
        this.d = i5;
        this.f9951e = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        int i2 = this.f9949b;
        View view = this.f9950c;
        if (i2 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        this.f9951e.setListener((Animator.AnimatorListener) null);
        C0816h hVar = this.f9952f;
        T t6 = this.f9948a;
        hVar.c(t6);
        hVar.f9981p.remove(t6);
        hVar.i();
    }

    public final void onAnimationStart(Animator animator) {
        this.f9952f.getClass();
    }
}
