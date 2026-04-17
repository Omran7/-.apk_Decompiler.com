package v2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: v2.c  reason: case insensitive filesystem */
public final class C1044c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12168a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1045d f12169b;

    public /* synthetic */ C1044c(C1045d dVar, int i2) {
        this.f12168a = i2;
        this.f12169b = dVar;
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.f12168a) {
            case 1:
                this.f12169b.f12218b.h(false);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.f12168a) {
            case 0:
                this.f12169b.f12218b.h(true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
