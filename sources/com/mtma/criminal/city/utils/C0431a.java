package com.mtma.criminal.city.utils;

import F4.a;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

/* renamed from: com.mtma.criminal.city.utils.a  reason: case insensitive filesystem */
public final class C0431a implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ImageView f7386a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ float f7387b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ float f7388c;

    public C0431a(ImageView imageView, float f6, float f7) {
        this.f7386a = imageView;
        this.f7387b = f6;
        this.f7388c = f7;
    }

    public final void onAnimationEnd(Animation animation) {
        ImageView imageView = this.f7386a;
        imageView.clearAnimation();
        float f6 = this.f7387b;
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -(f6 - 10.0f), this.f7388c, 0.0f);
        rotateAnimation.setDuration((long) (3.0f * f6));
        rotateAnimation.setRepeatCount(1);
        rotateAnimation.setFillAfter(true);
        rotateAnimation.setRepeatMode(2);
        imageView.startAnimation(rotateAnimation);
        rotateAnimation.setAnimationListener(new a(this, 2));
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
