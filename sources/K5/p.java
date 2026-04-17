package k5;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import o3.d;

public final class p {

    /* renamed from: A  reason: collision with root package name */
    public final int f9594A;

    /* renamed from: B  reason: collision with root package name */
    public final int f9595B;

    /* renamed from: a  reason: collision with root package name */
    public final int f9596a;

    /* renamed from: b  reason: collision with root package name */
    public final Drawable f9597b;

    /* renamed from: c  reason: collision with root package name */
    public final Drawable f9598c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f9599e;

    /* renamed from: f  reason: collision with root package name */
    public int f9600f;
    public float g;
    public float h;

    /* renamed from: i  reason: collision with root package name */
    public float f9601i;

    /* renamed from: j  reason: collision with root package name */
    public float f9602j;

    /* renamed from: k  reason: collision with root package name */
    public float f9603k;

    /* renamed from: l  reason: collision with root package name */
    public float f9604l;

    /* renamed from: m  reason: collision with root package name */
    public float f9605m;

    /* renamed from: n  reason: collision with root package name */
    public float f9606n;

    /* renamed from: o  reason: collision with root package name */
    public float f9607o;

    /* renamed from: p  reason: collision with root package name */
    public float f9608p;

    /* renamed from: q  reason: collision with root package name */
    public float f9609q;

    /* renamed from: r  reason: collision with root package name */
    public float f9610r;

    /* renamed from: s  reason: collision with root package name */
    public long f9611s;

    /* renamed from: t  reason: collision with root package name */
    public float f9612t;

    /* renamed from: u  reason: collision with root package name */
    public final DecelerateInterpolator f9613u;

    /* renamed from: v  reason: collision with root package name */
    public int f9614v = 0;

    /* renamed from: w  reason: collision with root package name */
    public float f9615w;

    /* renamed from: x  reason: collision with root package name */
    public final Rect f9616x = new Rect();

    /* renamed from: y  reason: collision with root package name */
    public final int f9617y;

    /* renamed from: z  reason: collision with root package name */
    public final int f9618z;

    public p(Context context) {
        Resources resources = context.getResources();
        Drawable drawable = resources.getDrawable(2131165766);
        this.f9597b = drawable;
        Drawable drawable2 = resources.getDrawable(2131165767);
        this.f9598c = drawable2;
        this.f9596a = 1;
        this.f9617y = drawable.getIntrinsicHeight();
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        this.f9618z = intrinsicHeight;
        int intrinsicWidth = drawable2.getIntrinsicWidth();
        this.f9594A = intrinsicWidth;
        float f6 = (float) intrinsicHeight;
        float f7 = 4.0f * f6;
        this.f9595B = (int) (Math.min(((f6 * f7) / ((float) intrinsicWidth)) * 0.6f, f7) + 0.5f);
        float f8 = resources.getDisplayMetrics().density;
        this.f9613u = new DecelerateInterpolator();
    }

    public final boolean a(Canvas canvas) {
        float f6;
        float min = Math.min(((float) (AnimationUtils.currentAnimationTimeMillis() - this.f9611s)) / this.f9612t, 1.0f);
        float interpolation = this.f9613u.getInterpolation(min);
        float f7 = this.f9603k;
        this.g = d.a(this.f9604l, f7, interpolation, f7);
        float f8 = this.f9605m;
        float f9 = (this.f9606n - f8) * interpolation;
        this.h = f9 + f8;
        float f10 = this.f9607o;
        this.f9601i = d.a(this.f9608p, f10, interpolation, f10);
        float f11 = this.f9609q;
        float f12 = this.f9610r;
        this.f9602j = d.a(f12, f11, interpolation, f11);
        if (min >= 0.999f) {
            int i2 = this.f9614v;
            if (i2 == 1) {
                this.f9614v = 4;
                this.f9611s = AnimationUtils.currentAnimationTimeMillis();
                this.f9612t = 1000.0f;
                this.f9603k = this.g;
                this.f9605m = this.h;
                this.f9607o = this.f9601i;
                this.f9609q = this.f9602j;
                this.f9604l = 0.0f;
                this.f9606n = 0.0f;
                this.f9608p = 0.0f;
                this.f9610r = 0.0f;
            } else if (i2 == 2) {
                this.f9614v = 3;
                this.f9611s = AnimationUtils.currentAnimationTimeMillis();
                this.f9612t = 1000.0f;
                this.f9603k = this.g;
                this.f9605m = this.h;
                this.f9607o = this.f9601i;
                this.f9609q = this.f9602j;
                this.f9604l = 0.0f;
                this.f9606n = 0.0f;
                this.f9608p = 0.0f;
                this.f9610r = 0.0f;
            } else if (i2 == 3) {
                this.f9614v = 0;
            } else if (i2 == 4) {
                if (f12 != 0.0f) {
                    f6 = 1.0f / (f12 * f12);
                } else {
                    f6 = Float.MAX_VALUE;
                }
                this.h = (f9 * f6) + f8;
                this.f9614v = 3;
            }
        }
        Drawable drawable = this.f9598c;
        drawable.setAlpha((int) (Math.max(0.0f, Math.min(this.f9601i, 1.0f)) * 255.0f));
        float f13 = (float) this.f9618z;
        int min2 = (int) Math.min((((this.f9602j * f13) * f13) / ((float) this.f9594A)) * 0.6f, f13 * 4.0f);
        int i5 = this.f9596a;
        if (i5 == 0) {
            drawable.setBounds(0, 0, this.d, min2);
        } else {
            drawable.setBounds(0, 0, this.d, min2);
        }
        drawable.draw(canvas);
        Drawable drawable2 = this.f9597b;
        drawable2.setAlpha((int) (Math.max(0.0f, Math.min(this.g, 1.0f)) * 255.0f));
        int i6 = (int) (((float) this.f9617y) * this.h);
        if (i5 == 0) {
            drawable2.setBounds(0, 0, this.d, i6);
        } else {
            drawable2.setBounds(0, 0, this.d, i6);
        }
        drawable2.draw(canvas);
        if (this.f9614v == 3 && min2 == 0 && i6 == 0) {
            this.f9614v = 0;
        }
        if (this.f9614v != 0) {
            return true;
        }
        return false;
    }

    public final Rect b(boolean z3) {
        int i2 = this.d;
        Rect rect = this.f9616x;
        int i5 = 0;
        int i6 = this.f9595B;
        rect.set(0, 0, i2, i6);
        int i7 = this.f9599e;
        int i8 = this.f9600f;
        if (z3) {
            i5 = i6;
        }
        rect.offset(i7, i8 - i5);
        return rect;
    }

    public final boolean c() {
        if (this.f9614v == 0) {
            return true;
        }
        return false;
    }

    public final void d(int i2) {
        this.f9614v = 2;
        int max = Math.max(100, Math.abs(i2));
        this.f9611s = AnimationUtils.currentAnimationTimeMillis();
        this.f9612t = (((float) max) * 0.03f) + 0.1f;
        this.f9603k = 0.0f;
        this.f9605m = 0.0f;
        this.h = 0.0f;
        this.f9607o = 0.5f;
        this.f9609q = 0.0f;
        int i5 = max * 8;
        this.f9604l = (float) Math.max(0, Math.min(i5, 1));
        this.f9606n = Math.max(0.5f, Math.min((float) i5, 1.0f));
        this.f9610r = Math.min((((float) ((max / 100) * max)) * 1.5E-4f) + 0.025f, 1.75f);
        this.f9608p = Math.max(this.f9607o, Math.min(((float) (max * 16)) * 1.0E-5f, 1.0f));
    }

    public final void e(float f6) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = this.f9614v;
        if (i2 != 4 || ((float) (currentAnimationTimeMillis - this.f9611s)) >= this.f9612t) {
            if (i2 != 1) {
                this.f9602j = 1.0f;
            }
            this.f9614v = 1;
            this.f9611s = currentAnimationTimeMillis;
            this.f9612t = 167.0f;
            float f7 = this.f9615w + f6;
            this.f9615w = f7;
            float abs = Math.abs(f7);
            float max = Math.max(0.6f, Math.min(abs, 1.0f));
            this.f9603k = max;
            this.g = max;
            float max2 = Math.max(0.5f, Math.min(abs * 7.0f, 1.0f));
            this.f9605m = max2;
            this.h = max2;
            float min = Math.min(1.0f, (Math.abs(f6) * 1.1f) + this.f9601i);
            this.f9607o = min;
            this.f9601i = min;
            float abs2 = Math.abs(f6);
            if (f6 > 0.0f && this.f9615w < 0.0f) {
                abs2 = -abs2;
            }
            if (this.f9615w == 0.0f) {
                this.f9602j = 0.0f;
            }
            float min2 = Math.min(4.0f, Math.max(0.0f, (abs2 * 7.0f) + this.f9602j));
            this.f9609q = min2;
            this.f9602j = min2;
            this.f9604l = this.g;
            this.f9606n = this.h;
            this.f9608p = this.f9601i;
            this.f9610r = min2;
        }
    }

    public final void f() {
        this.f9615w = 0.0f;
        int i2 = this.f9614v;
        if (i2 == 1 || i2 == 4) {
            this.f9614v = 3;
            this.f9603k = this.g;
            this.f9605m = this.h;
            this.f9607o = this.f9601i;
            this.f9609q = this.f9602j;
            this.f9604l = 0.0f;
            this.f9606n = 0.0f;
            this.f9608p = 0.0f;
            this.f9610r = 0.0f;
            this.f9611s = AnimationUtils.currentAnimationTimeMillis();
            this.f9612t = 1000.0f;
        }
    }
}
