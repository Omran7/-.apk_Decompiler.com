package z;

import android.app.Notification;

public abstract class y {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z3) {
        return builder.setAuthenticationRequired(z3);
    }

    public static Notification.Builder b(Notification.Builder builder, int i2) {
        return builder.setForegroundServiceBehavior(i2);
    }
}
