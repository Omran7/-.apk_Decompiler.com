package U0;

import android.os.SystemClock;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final double f3685a = (1.0d / Math.pow(10.0d, 6.0d));

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f3686b = 0;

    public static double a(long j6) {
        return ((double) (SystemClock.elapsedRealtimeNanos() - j6)) * f3685a;
    }
}
