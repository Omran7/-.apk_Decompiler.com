package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import h0.C0552a;

/* renamed from: androidx.fragment.app.d  reason: case insensitive filesystem */
public final class C0272d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f5100a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f5101b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f5102c;
    public final /* synthetic */ U d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C0274f f5103e;

    public C0272d(ViewGroup viewGroup, View view, boolean z3, U u6, C0274f fVar) {
        this.f5100a = viewGroup;
        this.f5101b = view;
        this.f5102c = z3;
        this.d = u6;
        this.f5103e = fVar;
    }

    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f5100a;
        View view = this.f5101b;
        viewGroup.endViewTransition(view);
        U u6 = this.d;
        if (this.f5102c) {
            C0552a.a(view, u6.f5064a);
        }
        this.f5103e.d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + u6 + " has ended.");
        }
    }
}
