package D0;

import U3.c;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;

public final class g {

    /* renamed from: e  reason: collision with root package name */
    public static final int f495e;

    /* renamed from: a  reason: collision with root package name */
    public final Context f496a;

    /* renamed from: b  reason: collision with root package name */
    public final ActivityManager f497b;

    /* renamed from: c  reason: collision with root package name */
    public final c f498c;
    public final float d = ((float) f495e);

    static {
        int i2;
        if (Build.VERSION.SDK_INT < 26) {
            i2 = 4;
        } else {
            i2 = 1;
        }
        f495e = i2;
    }

    public g(Context context) {
        this.f496a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f497b = activityManager;
        this.f498c = new c((Object) context.getResources().getDisplayMetrics(), 7);
        if (Build.VERSION.SDK_INT >= 26 && activityManager.isLowRamDevice()) {
            this.d = 0.0f;
        }
    }
}
