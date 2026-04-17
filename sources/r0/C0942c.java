package r0;

import android.animation.Animator;

/* renamed from: r0.c  reason: case insensitive filesystem */
public final class C0942c implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0943d f11131a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0944e f11132b;

    public C0942c(C0944e eVar, C0943d dVar) {
        this.f11132b = eVar;
        this.f11131a = dVar;
    }

    public final void onAnimationRepeat(Animator animator) {
        C0944e eVar = this.f11132b;
        C0943d dVar = this.f11131a;
        eVar.a(1.0f, dVar, true);
        dVar.f11140k = dVar.f11136e;
        dVar.f11141l = dVar.f11137f;
        dVar.f11142m = dVar.g;
        dVar.a((dVar.f11139j + 1) % dVar.f11138i.length);
        if (eVar.f11158f) {
            eVar.f11158f = false;
            animator.cancel();
            animator.setDuration(1332);
            animator.start();
            if (dVar.f11143n) {
                dVar.f11143n = false;
                return;
            }
            return;
        }
        eVar.f11157e += 1.0f;
    }

    public final void onAnimationStart(Animator animator) {
        this.f11132b.f11157e = 0.0f;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
    }
}
