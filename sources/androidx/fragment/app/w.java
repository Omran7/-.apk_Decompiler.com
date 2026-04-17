package androidx.fragment.app;

import K.C0078s;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

public final class w extends AnimationSet implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f5201a;

    /* renamed from: b  reason: collision with root package name */
    public final View f5202b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5203c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5204e = true;

    public w(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f5201a = viewGroup;
        this.f5202b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    public final boolean getTransformation(long j6, Transformation transformation) {
        this.f5204e = true;
        if (this.f5203c) {
            return !this.d;
        }
        if (!super.getTransformation(j6, transformation)) {
            this.f5203c = true;
            C0078s.a(this.f5201a, this);
        }
        return true;
    }

    public final void run() {
        boolean z3 = this.f5203c;
        ViewGroup viewGroup = this.f5201a;
        if (z3 || !this.f5204e) {
            viewGroup.endViewTransition(this.f5202b);
            this.d = true;
            return;
        }
        this.f5204e = false;
        viewGroup.post(this);
    }

    public final boolean getTransformation(long j6, Transformation transformation, float f6) {
        this.f5204e = true;
        if (this.f5203c) {
            return !this.d;
        }
        if (!super.getTransformation(j6, transformation, f6)) {
            this.f5203c = true;
            C0078s.a(this.f5201a, this);
        }
        return true;
    }
}
