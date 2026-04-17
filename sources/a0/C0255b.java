package a0;

import android.view.animation.Interpolator;
import o3.d;

/* renamed from: a0.b  reason: case insensitive filesystem */
public abstract class C0255b implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f4539a;

    /* renamed from: b  reason: collision with root package name */
    public final float f4540b;

    public C0255b(float[] fArr) {
        this.f4539a = fArr;
        this.f4540b = 1.0f / ((float) (fArr.length - 1));
    }

    public final float getInterpolation(float f6) {
        if (f6 >= 1.0f) {
            return 1.0f;
        }
        if (f6 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f4539a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f6), fArr.length - 2);
        float f7 = this.f4540b;
        float f8 = fArr[min];
        return d.a(fArr[min + 1], f8, (f6 - (((float) min) * f7)) / f7, f8);
    }
}
