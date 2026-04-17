package androidx.lifecycle;

import S3.t;
import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import kotlin.jvm.internal.j;

public class G extends Fragment {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f5221b = 0;

    /* renamed from: a  reason: collision with root package name */
    public t f5222a;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final F Companion = new Object();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            j.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            j.e(activity, "activity");
        }

        public void onActivityDestroyed(Activity activity) {
            j.e(activity, "activity");
        }

        public void onActivityPaused(Activity activity) {
            j.e(activity, "activity");
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            j.e(activity, "activity");
            int i2 = G.f5221b;
            E.a(activity, C0302m.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            j.e(activity, "activity");
            int i2 = G.f5221b;
            E.a(activity, C0302m.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            j.e(activity, "activity");
            int i2 = G.f5221b;
            E.a(activity, C0302m.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            j.e(activity, "activity");
            int i2 = G.f5221b;
            E.a(activity, C0302m.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            j.e(activity, "activity");
            int i2 = G.f5221b;
            E.a(activity, C0302m.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            j.e(activity, "activity");
            int i2 = G.f5221b;
            E.a(activity, C0302m.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
            j.e(activity, "activity");
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            j.e(activity, "activity");
            j.e(bundle, "bundle");
        }

        public void onActivityStarted(Activity activity) {
            j.e(activity, "activity");
        }

        public void onActivityStopped(Activity activity) {
            j.e(activity, "activity");
        }
    }

    public final void a(C0302m mVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            j.d(activity, "activity");
            E.a(activity, mVar);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(C0302m.ON_CREATE);
    }

    public final void onDestroy() {
        super.onDestroy();
        a(C0302m.ON_DESTROY);
        this.f5222a = null;
    }

    public final void onPause() {
        super.onPause();
        a(C0302m.ON_PAUSE);
    }

    public final void onResume() {
        super.onResume();
        t tVar = this.f5222a;
        if (tVar != null) {
            ((D) tVar.f2700b).b();
        }
        a(C0302m.ON_RESUME);
    }

    public final void onStart() {
        super.onStart();
        t tVar = this.f5222a;
        if (tVar != null) {
            D d = (D) tVar.f2700b;
            int i2 = d.f5212a + 1;
            d.f5212a = i2;
            if (i2 == 1 && d.d) {
                d.f5216f.d(C0302m.ON_START);
                d.d = false;
            }
        }
        a(C0302m.ON_START);
    }

    public final void onStop() {
        super.onStop();
        a(C0302m.ON_STOP);
    }
}
