package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import kotlin.jvm.internal.j;

public abstract class B {
    public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        j.e(activity, "activity");
        j.e(activityLifecycleCallbacks, "callback");
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
