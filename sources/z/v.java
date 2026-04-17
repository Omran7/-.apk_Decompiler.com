package z;

import android.app.Notification;
import android.content.Context;

public abstract class v {
    public static Notification.Builder a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static Notification.Builder b(Notification.Builder builder, int i2) {
        return builder.setBadgeIconType(i2);
    }

    public static Notification.Builder c(Notification.Builder builder, boolean z3) {
        return builder.setColorized(z3);
    }

    public static Notification.Builder d(Notification.Builder builder, int i2) {
        return builder.setGroupAlertBehavior(i2);
    }

    public static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
        return builder.setSettingsText(charSequence);
    }

    public static Notification.Builder f(Notification.Builder builder, String str) {
        return builder.setShortcutId(str);
    }

    public static Notification.Builder g(Notification.Builder builder, long j6) {
        return builder.setTimeoutAfter(j6);
    }
}
