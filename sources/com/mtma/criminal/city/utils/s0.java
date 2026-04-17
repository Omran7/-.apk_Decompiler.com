package com.mtma.criminal.city.utils;

import K.W;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

public final class s0 extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7466a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f7467b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f7468c;
    public final /* synthetic */ ViewGroup d;

    public /* synthetic */ s0(String str, View view, ViewGroup viewGroup, int i2) {
        this.f7466a = i2;
        this.f7467b = str;
        this.f7468c = view;
        this.d = viewGroup;
    }

    public final void onAnimationEnd(Animator animator) {
        View view = this.f7468c;
        long j6 = 1000;
        String str = this.f7467b;
        switch (this.f7466a) {
            case 0:
                super.onAnimationEnd(animator);
                if (str.length() > 45) {
                    j6 = 3000;
                } else if (str.length() > 30) {
                    j6 = 2000;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{-150.0f});
                ofFloat.setRepeatCount(0);
                ofFloat.setDuration(j6);
                ofFloat.start();
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f});
                ofFloat2.setRepeatCount(0);
                ofFloat2.setDuration(j6);
                ofFloat2.start();
                ofFloat2.addListener(new W((Object) this, 3));
                return;
            default:
                super.onAnimationEnd(animator);
                if (str.length() > 45) {
                    j6 = 3000;
                } else if (str.length() > 30) {
                    j6 = 2000;
                }
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{-150.0f});
                ofFloat3.setRepeatCount(0);
                ofFloat3.setDuration(j6);
                ofFloat3.start();
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f});
                ofFloat4.setRepeatCount(0);
                ofFloat4.setDuration(j6);
                ofFloat4.start();
                ofFloat4.addListener(new W((Object) this, 4));
                return;
        }
    }
}
