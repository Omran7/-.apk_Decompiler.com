package C0;

import android.app.NotificationChannel;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;

public abstract /* synthetic */ class h {
    public static /* synthetic */ NotificationChannel c(String str) {
        return new NotificationChannel("fcm_fallback_notification_channel", str, 3);
    }

    public static /* bridge */ /* synthetic */ boolean y(Drawable drawable) {
        return drawable instanceof AdaptiveIconDrawable;
    }
}
