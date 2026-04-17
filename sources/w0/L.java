package W0;

import android.graphics.RectF;
import kotlin.jvm.internal.j;

public final class L {

    /* renamed from: a  reason: collision with root package name */
    public final RectF f3887a = new RectF();

    /* renamed from: b  reason: collision with root package name */
    public final RectF f3888b = new RectF();

    /* renamed from: c  reason: collision with root package name */
    public float f3889c;
    public float d;

    /* renamed from: e  reason: collision with root package name */
    public float f3890e;

    /* renamed from: f  reason: collision with root package name */
    public float f3891f;
    public float g;
    public float h;

    /* renamed from: i  reason: collision with root package name */
    public float f3892i;

    /* renamed from: j  reason: collision with root package name */
    public float f3893j;

    /* renamed from: k  reason: collision with root package name */
    public float f3894k = 1.0f;

    /* renamed from: l  reason: collision with root package name */
    public float f3895l = 1.0f;

    public static float a(float f6, float f7, float f8, float f9) {
        return Math.max(Math.abs(f6 - f8), Math.abs(f7 - f9));
    }

    public static boolean d(float f6, float f7, float f8, float f9, float f10, float f11) {
        if (f6 <= f8 || f6 >= f10 || f7 <= f9 || f7 >= f11) {
            return false;
        }
        return true;
    }

    public final M b(float f6, float f7, boolean z3) {
        RectF rectF = this.f3887a;
        float f8 = (float) 6;
        float width = rectF.width() / f8;
        float f9 = rectF.left;
        float f10 = f9 + width;
        float f11 = (float) 5;
        float f12 = (width * f11) + f9;
        float height = rectF.height() / f8;
        float f13 = rectF.top;
        float f14 = f13 + height;
        float f15 = (f11 * height) + f13;
        if (f6 < f10) {
            if (f7 < f14) {
                return M.f3896a;
            }
            if (f7 < f15) {
                return M.f3899e;
            }
            return M.f3898c;
        } else if (f6 < f12) {
            if (f7 < f14) {
                return M.f3900f;
            }
            if (f7 >= f15) {
                return M.f3902q;
            }
            if (z3) {
                return M.f3903r;
            }
            return null;
        } else if (f7 < f14) {
            return M.f3897b;
        } else {
            if (f7 < f15) {
                return M.f3901p;
            }
            return M.d;
        }
    }

    public final RectF c() {
        RectF rectF = this.f3888b;
        rectF.set(this.f3887a);
        return rectF;
    }

    public final void e(RectF rectF) {
        j.e(rectF, "rect");
        this.f3887a.set(rectF);
    }
}
