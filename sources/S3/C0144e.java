package S3;

import C0.h;
import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: S3.e  reason: case insensitive filesystem */
public abstract class C0144e {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicInteger f2664a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static boolean a(Resources resources, int i2) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!h.y(resources.getDrawable(i2, (Resources.Theme) null))) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i2);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i2 + ", treating it as an invalid icon");
            return false;
        }
    }
}
