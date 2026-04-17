package T1;

import G1.b;
import com.google.android.gms.common.internal.I;

public final class S1 {

    /* renamed from: a  reason: collision with root package name */
    public final T1 f3036a;

    /* renamed from: b  reason: collision with root package name */
    public int f3037b = 1;

    /* renamed from: c  reason: collision with root package name */
    public long f3038c = a();

    public S1(T1 t12) {
        this.f3036a = t12;
    }

    public final long a() {
        T1 t12 = this.f3036a;
        I.g(t12);
        long longValue = ((Long) H.f2947v.a((Object) null)).longValue();
        long longValue2 = ((Long) H.f2949w.a((Object) null)).longValue();
        for (int i2 = 1; i2 < this.f3037b; i2++) {
            longValue += longValue;
            if (longValue >= longValue2) {
                break;
            }
        }
        ((b) t12.g()).getClass();
        return Math.min(longValue, longValue2) + System.currentTimeMillis();
    }
}
