package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.G;
import kotlin.jvm.internal.j;

public abstract class E {
    public static void a(Activity activity, C0302m mVar) {
        C0309u h;
        j.e(activity, "activity");
        j.e(mVar, "event");
        if ((activity instanceof C0307s) && (h = ((C0307s) activity).h()) != null) {
            h.d(mVar);
        }
    }

    public static void b(Activity activity) {
        j.e(activity, "activity");
        if (Build.VERSION.SDK_INT >= 29) {
            G.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new G.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new Fragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
