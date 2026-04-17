package k5;

import android.content.Context;
import android.util.FloatMath;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import com.google.android.gms.common.api.f;
import o3.d;

public final class u {

    /* renamed from: e  reason: collision with root package name */
    public static final float f9643e = (1.0f / e(1.0f));

    /* renamed from: a  reason: collision with root package name */
    public int f9644a;

    /* renamed from: b  reason: collision with root package name */
    public final t f9645b;

    /* renamed from: c  reason: collision with root package name */
    public final t f9646c;
    public LinearInterpolator d = null;

    public u(Context context) {
        this.f9645b = new t(context);
        this.f9646c = new t(context);
    }

    public static float e(float f6) {
        float f7;
        float f8 = f6 * 8.0f;
        if (f8 < 1.0f) {
            f7 = f8 - (1.0f - ((float) Math.exp((double) (-f8))));
        } else {
            f7 = d.a(1.0f, (float) Math.exp((double) (1.0f - f8)), 0.63212055f, 0.36787945f);
        }
        return f7 * f9643e;
    }

    public final boolean a() {
        float f6;
        if (d()) {
            return false;
        }
        int i2 = this.f9644a;
        t tVar = this.f9645b;
        t tVar2 = this.f9646c;
        if (i2 == 0) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - tVar.g;
            int i5 = tVar.h;
            if (currentAnimationTimeMillis < ((long) i5)) {
                float f7 = ((float) currentAnimationTimeMillis) / ((float) i5);
                LinearInterpolator linearInterpolator = this.d;
                if (linearInterpolator == null) {
                    f6 = e(f7);
                } else {
                    f6 = linearInterpolator.getInterpolation(f7);
                }
                int i6 = tVar.f9631a;
                tVar.f9632b = Math.round(((float) (tVar.f9633c - i6)) * f6) + i6;
                int i7 = tVar2.f9631a;
                tVar2.f9632b = Math.round(f6 * ((float) (tVar2.f9633c - i7))) + i7;
            } else {
                tVar.f9632b = tVar.f9633c;
                tVar.f9638k = true;
                tVar2.f9632b = tVar2.f9633c;
                tVar2.f9638k = true;
            }
        } else if (i2 == 1) {
            if (!tVar.f9638k && !tVar.h() && !tVar.b()) {
                tVar.f9632b = tVar.f9633c;
                tVar.f9638k = true;
            }
            if (!tVar2.f9638k && !tVar2.h() && !tVar2.b()) {
                tVar2.f9632b = tVar2.f9633c;
                tVar2.f9638k = true;
            }
        }
        return true;
    }

    public final void b(int i2, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        int i11 = 0;
        if (!d()) {
            float f6 = this.f9645b.f9634e;
            float f7 = this.f9646c.f9634e;
            i10 = i5;
            float f8 = (float) i10;
            if (Math.signum(f8) == Math.signum(f6)) {
                float f9 = (float) 0;
                if (Math.signum(f9) == Math.signum(f7)) {
                    i11 = (int) (f9 + f7);
                    i9 = (int) (f8 + f6);
                    this.f9644a = 1;
                    this.f9645b.c(i2, i9, i6, f.API_PRIORITY_OTHER, i8);
                    this.f9646c.c(0, i11, 0, i7, 0);
                }
            }
        } else {
            i10 = i5;
        }
        i9 = i10;
        this.f9644a = 1;
        this.f9645b.c(i2, i9, i6, f.API_PRIORITY_OTHER, i8);
        this.f9646c.c(0, i11, 0, i7, 0);
    }

    public final float c() {
        float f6 = this.f9645b.f9634e;
        float f7 = this.f9646c.f9634e;
        return FloatMath.sqrt((f7 * f7) + (f6 * f6));
    }

    public final boolean d() {
        if (!this.f9645b.f9638k || !this.f9646c.f9638k) {
            return false;
        }
        return true;
    }
}
