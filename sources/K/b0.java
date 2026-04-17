package K;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import n.e;
import t0.m;

public final class b0 extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1371a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1372b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f1373c;

    public b0(i0 i0Var, View view) {
        this.f1372b = i0Var;
        this.f1373c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.f1371a) {
            case 0:
                ((i0) this.f1372b).f1397a.d(1.0f);
                d0.e((View) this.f1373c);
                return;
            default:
                ((e) this.f1372b).remove(animator);
                ((m) this.f1373c).f11680w.remove(animator);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.f1371a) {
            case 1:
                ((m) this.f1373c).f11680w.add(animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public b0(m mVar, e eVar) {
        this.f1373c = mVar;
        this.f1372b = eVar;
    }
}
