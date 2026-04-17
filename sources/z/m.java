package z;

import android.app.Notification;
import android.graphics.drawable.Icon;

public abstract class m {
    public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
        bigPictureStyle.bigPicture(icon);
    }

    public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
        bigPictureStyle.setContentDescription(charSequence);
    }

    public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z3) {
        bigPictureStyle.showBigPictureWhenCollapsed(z3);
    }
}
