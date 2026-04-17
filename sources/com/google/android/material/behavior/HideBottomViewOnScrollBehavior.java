package com.google.android.material.behavior;

import K.W;
import K1.e;
import Z1.a;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.mtma.criminal.city.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o3.d;
import x.C1089a;

public class HideBottomViewOnScrollBehavior<V extends View> extends C1089a {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet f6279a = new LinkedHashSet();

    /* renamed from: b  reason: collision with root package name */
    public int f6280b;

    /* renamed from: c  reason: collision with root package name */
    public int f6281c;
    public TimeInterpolator d;

    /* renamed from: e  reason: collision with root package name */
    public TimeInterpolator f6282e;

    /* renamed from: f  reason: collision with root package name */
    public int f6283f = 0;
    public int g = 2;
    public ViewPropertyAnimator h;

    public HideBottomViewOnScrollBehavior() {
    }

    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        this.f6283f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f6280b = e.n0(R.attr.motionDurationLong2, 225, view.getContext());
        this.f6281c = e.n0(R.attr.motionDurationMedium4, 175, view.getContext());
        this.d = e.o0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, a.d);
        this.f6282e = e.o0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, a.f4471c);
        return false;
    }

    public final void k(CoordinatorLayout coordinatorLayout, View view, int i2, int i5, int i6, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f6279a;
        if (i2 > 0) {
            if (this.g != 1) {
                ViewPropertyAnimator viewPropertyAnimator = this.h;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                this.g = 1;
                Iterator it2 = linkedHashSet.iterator();
                if (!it2.hasNext()) {
                    int i7 = this.f6283f;
                    this.h = view.animate().translationY((float) i7).setInterpolator(this.f6282e).setDuration((long) this.f6281c).setListener(new W((Object) this, 1));
                    return;
                }
                throw d.e(it2);
            }
        } else if (i2 < 0 && this.g != 2) {
            ViewPropertyAnimator viewPropertyAnimator2 = this.h;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                view.clearAnimation();
            }
            this.g = 2;
            Iterator it3 = linkedHashSet.iterator();
            if (!it3.hasNext()) {
                this.h = view.animate().translationY((float) 0).setInterpolator(this.d).setDuration((long) this.f6280b).setListener(new W((Object) this, 1));
                return;
            }
            throw d.e(it3);
        }
    }

    public boolean o(View view, int i2, int i5) {
        if (i2 == 2) {
            return true;
        }
        return false;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
