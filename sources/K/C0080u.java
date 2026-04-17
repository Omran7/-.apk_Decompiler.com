package K;

import android.view.VelocityTracker;

/* renamed from: K.u  reason: case insensitive filesystem */
public abstract class C0080u {
    public static float a(VelocityTracker velocityTracker, int i2) {
        return velocityTracker.getAxisVelocity(i2);
    }

    public static float b(VelocityTracker velocityTracker, int i2, int i5) {
        return velocityTracker.getAxisVelocity(i2, i5);
    }

    public static boolean c(VelocityTracker velocityTracker, int i2) {
        return velocityTracker.isAxisSupported(i2);
    }
}
