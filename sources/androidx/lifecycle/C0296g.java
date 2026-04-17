package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.jvm.internal.j;

/* renamed from: androidx.lifecycle.g  reason: case insensitive filesystem */
public abstract class C0296g implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        j.e(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        j.e(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        j.e(activity, "activity");
    }

    public void onActivityResumed(Activity activity) {
        j.e(activity, "activity");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        j.e(activity, "activity");
        j.e(bundle, "outState");
    }

    public void onActivityStarted(Activity activity) {
        j.e(activity, "activity");
    }

    public void onActivityStopped(Activity activity) {
        j.e(activity, "activity");
    }
}
