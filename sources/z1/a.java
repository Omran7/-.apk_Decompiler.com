package Z1;

import a0.C0254a;
import a0.C0255b;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import o3.d;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final LinearInterpolator f4469a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static final C0254a f4470b = new C0254a(1);

    /* renamed from: c  reason: collision with root package name */
    public static final C0254a f4471c = new C0254a(0);
    public static final C0254a d = new C0255b(C0254a.f4538e);

    /* JADX WARNING: type inference failed for: r0v3, types: [a0.a, a0.b] */
    static {
        new DecelerateInterpolator();
    }

    public static float a(float f6, float f7, float f8) {
        return d.a(f7, f6, f8, f6);
    }

    public static float b(float f6, float f7, float f8, float f9, float f10) {
        if (f10 <= f8) {
            return f6;
        }
        if (f10 >= f9) {
            return f7;
        }
        return a(f6, f7, (f10 - f8) / (f9 - f8));
    }

    public static int c(int i2, int i5, float f6) {
        return Math.round(f6 * ((float) (i5 - i2))) + i2;
    }
}
