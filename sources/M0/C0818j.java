package m0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: m0.j  reason: case insensitive filesystem */
public final class C0818j extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f9985a = false;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0819k f9986b;

    public C0818j(C0819k kVar) {
        this.f9986b = kVar;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f9985a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f9985a) {
            this.f9985a = false;
            return;
        }
        C0819k kVar = this.f9986b;
        if (((Float) kVar.f10013z.getAnimatedValue()).floatValue() == 0.0f) {
            kVar.f9989A = 0;
            kVar.f(0);
            return;
        }
        kVar.f9989A = 2;
        kVar.f10006s.invalidate();
    }
}
