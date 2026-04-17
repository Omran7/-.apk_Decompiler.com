package z;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import j3.g;

/* renamed from: z.c  reason: case insensitive filesystem */
public final class C1123c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public Object f12747a;

    /* renamed from: b  reason: collision with root package name */
    public Activity f12748b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12749c;
    public boolean d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12750e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f12751f = false;

    public C1123c(Activity activity) {
        this.f12748b = activity;
        this.f12749c = activity.hashCode();
    }

    public final void onActivityDestroyed(Activity activity) {
        if (this.f12748b == activity) {
            this.f12748b = null;
            this.f12750e = true;
        }
    }

    public final void onActivityPaused(Activity activity) {
        if (this.f12750e && !this.f12751f && !this.d) {
            Object obj = this.f12747a;
            try {
                Object obj2 = C1124d.f12754c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f12749c) {
                    C1124d.g.postAtFrontOfQueue(new g(C1124d.f12753b.get(activity), obj2, 19));
                    this.f12751f = true;
                    this.f12747a = null;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th);
            }
        }
    }

    public final void onActivityStarted(Activity activity) {
        if (this.f12748b == activity) {
            this.d = true;
        }
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
