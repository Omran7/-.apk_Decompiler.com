package t0;

import android.os.Build;

public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f11693a;

    static {
        boolean z3;
        if (Build.VERSION.SDK_INT >= 28) {
            z3 = true;
        } else {
            z3 = false;
        }
        f11693a = z3;
    }
}
