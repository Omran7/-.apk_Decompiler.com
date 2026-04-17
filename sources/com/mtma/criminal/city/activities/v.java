package com.mtma.criminal.city.activities;

import android.view.animation.Animation;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0286s;
import androidx.fragment.app.I;
import o3.d;

public final class v implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0286s f7085a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ StartActivity f7086b;

    public v(StartActivity startActivity, C0286s sVar) {
        this.f7086b = startActivity;
        this.f7085a = sVar;
    }

    public final void onAnimationEnd(Animation animation) {
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
        I l6 = this.f7086b.l();
        C0269a b6 = d.b(l6, l6);
        b6.h(this.f7085a);
        b6.e(false);
    }
}
