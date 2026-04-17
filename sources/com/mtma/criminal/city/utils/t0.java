package com.mtma.criminal.city.utils;

import K.W;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

public final class t0 extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7472a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f7473b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f7474c;

    public /* synthetic */ t0(View view, ViewGroup viewGroup, int i2) {
        this.f7472a = i2;
        this.f7474c = view;
        this.f7473b = viewGroup;
    }

    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f7473b;
        View view = this.f7474c;
        switch (this.f7472a) {
            case 0:
                super.onAnimationEnd(animator);
                viewGroup.removeView(view);
                return;
            case 1:
                super.onAnimationEnd(animator);
                viewGroup.removeView(view);
                return;
            case 2:
                super.onAnimationEnd(animator);
                viewGroup.removeView(view);
                return;
            case 3:
                super.onAnimationEnd(animator);
                viewGroup.removeView(view);
                return;
            case 4:
                super.onAnimationEnd(animator);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{-200.0f});
                ofFloat.setRepeatCount(0);
                ofFloat.setDuration(1000);
                ofFloat.start();
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f});
                ofFloat2.setRepeatCount(0);
                ofFloat2.setDuration(1000);
                ofFloat2.start();
                ofFloat2.addListener(new W((Object) this, 5));
                return;
            default:
                super.onAnimationEnd(animator);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{-150.0f});
                ofFloat3.setRepeatCount(0);
                ofFloat3.setDuration(1000);
                ofFloat3.start();
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f});
                ofFloat4.setRepeatCount(0);
                ofFloat4.setDuration(1000);
                ofFloat4.start();
                ofFloat4.addListener(new W((Object) this, 6));
                return;
        }
    }

    public /* synthetic */ t0(ViewGroup viewGroup, View view, int i2) {
        this.f7472a = i2;
        this.f7473b = viewGroup;
        this.f7474c = view;
    }
}
