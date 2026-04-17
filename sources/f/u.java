package f;

import L.d;
import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.v;
import java.util.Objects;

public abstract class u {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, z zVar) {
        Objects.requireNonNull(zVar);
        v vVar = new v(zVar, 1);
        d.k(obj).registerOnBackInvokedCallback(1000000, vVar);
        return vVar;
    }

    public static void c(Object obj, Object obj2) {
        d.k(obj).unregisterOnBackInvokedCallback(d.h(obj2));
    }
}
