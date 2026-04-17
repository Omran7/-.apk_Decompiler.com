package K;

import android.view.ViewConfiguration;

public abstract class S {
    public static int a(ViewConfiguration viewConfiguration, int i2, int i5, int i6) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i2, i5, i6);
    }

    public static int b(ViewConfiguration viewConfiguration, int i2, int i5, int i6) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i2, i5, i6);
    }
}
