package K;

import android.view.animation.Interpolator;

public abstract class h0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f1393a;

    /* renamed from: b  reason: collision with root package name */
    public float f1394b;

    /* renamed from: c  reason: collision with root package name */
    public final Interpolator f1395c;
    public final long d;

    public h0(int i2, Interpolator interpolator, long j6) {
        this.f1393a = i2;
        this.f1395c = interpolator;
        this.d = j6;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.f1395c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f1394b);
        }
        return this.f1394b;
    }

    public int c() {
        return this.f1393a;
    }

    public void d(float f6) {
        this.f1394b = f6;
    }
}
