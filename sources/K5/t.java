package k5;

import android.content.Context;
import android.util.Log;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import o3.d;

public final class t {

    /* renamed from: p  reason: collision with root package name */
    public static final float f9628p = ((float) (Math.log(0.78d) / Math.log(0.9d)));

    /* renamed from: q  reason: collision with root package name */
    public static final float[] f9629q = new float[101];

    /* renamed from: r  reason: collision with root package name */
    public static final float[] f9630r = new float[101];

    /* renamed from: a  reason: collision with root package name */
    public int f9631a;

    /* renamed from: b  reason: collision with root package name */
    public int f9632b;

    /* renamed from: c  reason: collision with root package name */
    public int f9633c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public float f9634e;

    /* renamed from: f  reason: collision with root package name */
    public float f9635f;
    public long g;
    public int h;

    /* renamed from: i  reason: collision with root package name */
    public int f9636i;

    /* renamed from: j  reason: collision with root package name */
    public int f9637j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f9638k = true;

    /* renamed from: l  reason: collision with root package name */
    public int f9639l;

    /* renamed from: m  reason: collision with root package name */
    public float f9640m = ViewConfiguration.getScrollFriction();

    /* renamed from: n  reason: collision with root package name */
    public int f9641n = 0;

    /* renamed from: o  reason: collision with root package name */
    public final float f9642o;

    static {
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16 = 0.0f;
        float f17 = 0.0f;
        for (int i2 = 0; i2 < 100; i2++) {
            float f18 = ((float) i2) / 100.0f;
            float f19 = 1.0f;
            while (true) {
                f6 = 2.0f;
                f7 = ((f19 - f16) / 2.0f) + f16;
                f8 = 3.0f;
                f9 = 1.0f - f7;
                f10 = f7 * 3.0f * f9;
                f11 = f7 * f7 * f7;
                float f20 = (((f7 * 0.35000002f) + (f9 * 0.175f)) * f10) + f11;
                float f21 = f20;
                if (((double) Math.abs(f20 - f18)) < 1.0E-5d) {
                    break;
                } else if (f21 > f18) {
                    f19 = f7;
                } else {
                    f16 = f7;
                }
            }
            f9629q[i2] = (((f9 * 0.5f) + f7) * f10) + f11;
            float f22 = 1.0f;
            while (true) {
                f12 = ((f22 - f17) / f6) + f17;
                f13 = 1.0f - f12;
                f14 = f12 * f8 * f13;
                f15 = f12 * f12 * f12;
                float f23 = (((f13 * 0.5f) + f12) * f14) + f15;
                if (((double) Math.abs(f23 - f18)) < 1.0E-5d) {
                    break;
                }
                if (f23 > f18) {
                    f22 = f12;
                } else {
                    f17 = f12;
                }
                f6 = 2.0f;
                f8 = 3.0f;
            }
            f9630r[i2] = (((f12 * 0.35000002f) + (f13 * 0.175f)) * f14) + f15;
        }
        float[] fArr = f9629q;
        f9630r[100] = 1.0f;
        fArr[100] = 1.0f;
    }

    public t(Context context) {
        this.f9642o = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
    }

    public final void a(int i2, int i5, int i6) {
        float abs = Math.abs(((float) (i6 - i2)) / ((float) (i5 - i2)));
        int i7 = (int) (abs * 100.0f);
        if (i7 < 100) {
            float f6 = ((float) i7) / 100.0f;
            int i8 = i7 + 1;
            float[] fArr = f9630r;
            float f7 = fArr[i7];
            this.h = (int) (((float) this.h) * d.a(fArr[i8], f7, (abs - f6) / ((((float) i8) / 100.0f) - f6), f7));
        }
    }

    public final boolean b() {
        float f6;
        int i2 = this.f9641n;
        if (i2 == 0) {
            int i5 = this.h;
            if (i5 >= this.f9636i) {
                return false;
            }
            this.f9631a = this.f9633c;
            int i6 = (int) this.f9634e;
            this.d = i6;
            if (i6 > 0) {
                f6 = -2000.0f;
            } else {
                f6 = 2000.0f;
            }
            this.f9635f = f6;
            this.g += (long) i5;
            d();
        } else if (i2 == 1) {
            return false;
        } else {
            if (i2 == 2) {
                this.g += (long) this.h;
                g(this.f9633c, this.f9631a);
            }
        }
        h();
        return true;
    }

    public final void c(int i2, int i5, int i6, int i7, int i8) {
        double d6;
        this.f9639l = i8;
        this.f9638k = false;
        this.d = i5;
        float f6 = (float) i5;
        this.f9634e = f6;
        this.f9636i = 0;
        this.h = 0;
        this.g = AnimationUtils.currentAnimationTimeMillis();
        this.f9631a = i2;
        this.f9632b = i2;
        if (i2 > i7 || i2 < i6) {
            f(i2, i6, i7, i5);
            return;
        }
        this.f9641n = 0;
        if (i5 != 0) {
            int exp = (int) (Math.exp(Math.log((double) ((((float) Math.abs(i5)) * 0.35f) / (this.f9640m * this.f9642o))) / (((double) f9628p) - 1.0d)) * 1000.0d);
            this.f9636i = exp;
            this.h = exp;
            double log = Math.log((double) ((((float) Math.abs(i5)) * 0.35f) / (this.f9640m * this.f9642o)));
            double d7 = (double) f9628p;
            d6 = Math.exp((d7 / (d7 - 1.0d)) * log) * ((double) (this.f9640m * this.f9642o));
        } else {
            d6 = 0.0d;
        }
        int signum = (int) (d6 * ((double) Math.signum(f6)));
        this.f9637j = signum;
        int i9 = i2 + signum;
        this.f9633c = i9;
        if (i9 < i6) {
            a(this.f9631a, i9, i6);
            this.f9633c = i6;
        }
        int i10 = this.f9633c;
        if (i10 > i7) {
            a(this.f9631a, i10, i7);
            this.f9633c = i7;
        }
    }

    public final void d() {
        int i2 = this.d;
        float abs = ((float) (i2 * i2)) / (Math.abs(this.f9635f) * 2.0f);
        float signum = Math.signum((float) this.d);
        int i5 = this.f9639l;
        if (abs > ((float) i5)) {
            float f6 = -signum;
            int i6 = this.d;
            this.f9635f = ((f6 * ((float) i6)) * ((float) i6)) / (((float) i5) * 2.0f);
            abs = (float) i5;
        }
        this.f9639l = (int) abs;
        this.f9641n = 2;
        int i7 = this.f9631a;
        int i8 = this.d;
        if (i8 <= 0) {
            abs = -abs;
        }
        this.f9633c = i7 + ((int) abs);
        this.h = -((int) ((((float) i8) * 1000.0f) / this.f9635f));
    }

    public final boolean e(int i2) {
        this.f9638k = true;
        this.f9633c = i2;
        this.f9631a = i2;
        this.d = 0;
        this.g = AnimationUtils.currentAnimationTimeMillis();
        this.h = 0;
        if (i2 < 0) {
            g(i2, 0);
        } else if (i2 > 0) {
            g(i2, 0);
        }
        return !this.f9638k;
    }

    public final void f(int i2, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        float f6;
        boolean z3 = true;
        if (i2 <= i5 || i2 >= i6) {
            if (i2 <= i6) {
                z3 = false;
            }
            if (z3) {
                i8 = i6;
            } else {
                i8 = i5;
            }
            int i11 = i2 - i8;
            if (i11 * i7 >= 0) {
                if (i7 != 0) {
                    i11 = i7;
                }
                if (i11 > 0) {
                    f6 = -2000.0f;
                } else {
                    f6 = 2000.0f;
                }
                this.f9635f = f6;
                float sqrt = (float) Math.sqrt((((double) (((((float) (i7 * i7)) / 2.0f) / Math.abs(f6)) + ((float) Math.abs(i8 - i2)))) * 2.0d) / ((double) Math.abs(this.f9635f)));
                this.g -= (long) ((int) ((sqrt - (((float) (-i7)) / f6)) * 1000.0f));
                this.f9631a = i8;
                this.d = (int) ((-this.f9635f) * sqrt);
                d();
                return;
            }
            double log = Math.log((double) ((((float) Math.abs(i7)) * 0.35f) / (this.f9640m * this.f9642o)));
            double d6 = (double) f9628p;
            if (Math.exp((d6 / (d6 - 1.0d)) * log) * ((double) (this.f9640m * this.f9642o)) > ((double) Math.abs(i11))) {
                if (z3) {
                    i9 = i5;
                } else {
                    i9 = i2;
                }
                if (z3) {
                    i10 = i2;
                } else {
                    i10 = i6;
                }
                c(i2, i7, i9, i10, this.f9639l);
                return;
            }
            g(i2, i8);
            return;
        }
        Log.e("OverScroller", "startAfterEdge called from a valid position");
        this.f9638k = true;
    }

    public final void g(int i2, int i5) {
        float f6;
        this.f9638k = false;
        this.f9641n = 1;
        this.f9631a = i2;
        this.f9633c = i5;
        int i6 = i2 - i5;
        if (i6 > 0) {
            f6 = -2000.0f;
        } else {
            f6 = 2000.0f;
        }
        this.f9635f = f6;
        this.d = -i6;
        this.f9639l = Math.abs(i6);
        this.h = (int) (Math.sqrt((((double) i6) * -2.0d) / ((double) this.f9635f)) * 1000.0d);
    }

    public final boolean h() {
        double d6;
        float f6;
        float f7;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.g;
        int i2 = this.h;
        if (currentAnimationTimeMillis > ((long) i2)) {
            return false;
        }
        int i5 = this.f9641n;
        if (i5 == 0) {
            float f8 = (float) this.f9636i;
            float f9 = ((float) currentAnimationTimeMillis) / f8;
            int i6 = (int) (f9 * 100.0f);
            if (i6 < 100) {
                float f10 = ((float) i6) / 100.0f;
                int i7 = i6 + 1;
                float[] fArr = f9629q;
                float f11 = fArr[i6];
                f6 = (fArr[i7] - f11) / ((((float) i7) / 100.0f) - f10);
                f7 = d.a(f9, f10, f6, f11);
            } else {
                f7 = 1.0f;
                f6 = 0.0f;
            }
            float f12 = (float) this.f9637j;
            this.f9634e = ((f6 * f12) / f8) * 1000.0f;
            d6 = (double) (f7 * f12);
        } else if (i5 == 1) {
            float f13 = ((float) currentAnimationTimeMillis) / ((float) i2);
            float f14 = f13 * f13;
            float signum = Math.signum((float) this.d) * ((float) this.f9639l);
            this.f9634e = ((-f13) + f14) * signum * 6.0f;
            d6 = (double) (((3.0f * f14) - ((2.0f * f13) * f14)) * signum);
        } else if (i5 != 2) {
            d6 = 0.0d;
        } else {
            float f15 = ((float) currentAnimationTimeMillis) / 1000.0f;
            float f16 = (float) this.d;
            float f17 = this.f9635f * f15;
            this.f9634e = f17 + f16;
            d6 = (double) (((f17 * f15) / 2.0f) + (f16 * f15));
        }
        this.f9632b = this.f9631a + ((int) Math.round(d6));
        return true;
    }
}
