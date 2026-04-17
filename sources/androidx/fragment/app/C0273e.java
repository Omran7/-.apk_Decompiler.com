package androidx.fragment.app;

import B0.C0004c;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: androidx.fragment.app.e  reason: case insensitive filesystem */
public final class C0273e implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ U f5104a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f5105b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f5106c;
    public final /* synthetic */ C0274f d;

    public C0273e(U u6, ViewGroup viewGroup, View view, C0274f fVar) {
        this.f5104a = u6;
        this.f5105b = viewGroup;
        this.f5106c = view;
        this.d = fVar;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f5105b.post(new C0004c((Object) this, 16));
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f5104a + " has ended.");
        }
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f5104a + " has reached onAnimationStart.");
        }
    }
}
