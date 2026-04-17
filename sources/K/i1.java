package k;

import android.os.Build;
import java.lang.reflect.Method;

public abstract class i1 {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f9315a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f9316b;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f9317c;

    static {
        boolean z3;
        if (Build.VERSION.SDK_INT >= 27) {
            z3 = true;
        } else {
            z3 = false;
        }
        f9317c = z3;
    }
}
