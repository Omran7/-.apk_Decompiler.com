package z;

import C0.a;
import D.c;
import S3.z;
import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

public final class n extends a {

    /* renamed from: b  reason: collision with root package name */
    public IconCompat f12765b;

    /* renamed from: c  reason: collision with root package name */
    public IconCompat f12766c;
    public boolean d;

    public final void h(z zVar) {
        Bitmap bitmap;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) zVar.f2712c).setBigContentTitle((CharSequence) null);
        IconCompat iconCompat = this.f12765b;
        Context context = (Context) zVar.f2711b;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                m.a(bigContentTitle, c.c(iconCompat, context));
            } else if (iconCompat.d() == 1) {
                IconCompat iconCompat2 = this.f12765b;
                int i2 = iconCompat2.f4881a;
                if (i2 == -1) {
                    Object obj = iconCompat2.f4882b;
                    if (obj instanceof Bitmap) {
                        bitmap = (Bitmap) obj;
                    } else {
                        bitmap = null;
                    }
                } else if (i2 == 1) {
                    bitmap = (Bitmap) iconCompat2.f4882b;
                } else if (i2 == 5) {
                    bitmap = IconCompat.a((Bitmap) iconCompat2.f4882b, true);
                } else {
                    throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmap);
            }
        }
        if (this.d) {
            IconCompat iconCompat3 = this.f12766c;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                l.a(bigContentTitle, c.c(iconCompat3, context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            m.c(bigContentTitle, false);
            m.b(bigContentTitle, (CharSequence) null);
        }
    }

    public final String j() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
