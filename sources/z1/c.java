package Z1;

import android.animation.TimeInterpolator;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public long f4474a;

    /* renamed from: b  reason: collision with root package name */
    public long f4475b;

    /* renamed from: c  reason: collision with root package name */
    public TimeInterpolator f4476c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f4477e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f4476c;
        if (timeInterpolator != null) {
            return timeInterpolator;
        }
        return a.f4470b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f4474a == cVar.f4474a && this.f4475b == cVar.f4475b && this.d == cVar.d && this.f4477e == cVar.f4477e) {
            return a().getClass().equals(cVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f4474a;
        long j7 = this.f4475b;
        return ((((a().getClass().hashCode() + (((((int) (j6 ^ (j6 >>> 32))) * 31) + ((int) ((j7 >>> 32) ^ j7))) * 31)) * 31) + this.d) * 31) + this.f4477e;
    }

    public final String toString() {
        return "\n" + c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f4474a + " duration: " + this.f4475b + " interpolator: " + a().getClass() + " repeatCount: " + this.d + " repeatMode: " + this.f4477e + "}\n";
    }
}
