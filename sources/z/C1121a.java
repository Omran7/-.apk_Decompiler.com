package z;

import android.app.Activity;
import android.app.SharedElementCallback;

/* renamed from: z.a  reason: case insensitive filesystem */
public abstract class C1121a {
    public static void a(Object obj) {
        ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
    }

    public static void b(Activity activity, String[] strArr, int i2) {
        activity.requestPermissions(strArr, i2);
    }

    public static boolean c(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }
}
