package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import kotlin.jvm.internal.j;

public final class C extends C0296g {
    final /* synthetic */ D this$0;

    public static final class a extends C0296g {
        final /* synthetic */ D this$0;

        public a(D d) {
            this.this$0 = d;
        }

        public void onActivityPostResumed(Activity activity) {
            j.e(activity, "activity");
            this.this$0.b();
        }

        public void onActivityPostStarted(Activity activity) {
            j.e(activity, "activity");
            D d = this.this$0;
            int i2 = d.f5212a + 1;
            d.f5212a = i2;
            if (i2 == 1 && d.d) {
                d.f5216f.d(C0302m.ON_START);
                d.d = false;
            }
        }
    }

    public C(D d) {
        this.this$0 = d;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        j.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i2 = G.f5221b;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            j.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((G) findFragmentByTag).f5222a = this.this$0.f5218q;
        }
    }

    public void onActivityPaused(Activity activity) {
        j.e(activity, "activity");
        D d = this.this$0;
        int i2 = d.f5213b - 1;
        d.f5213b = i2;
        if (i2 == 0) {
            Handler handler = d.f5215e;
            j.b(handler);
            handler.postDelayed(d.f5217p, 700);
        }
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        j.e(activity, "activity");
        B.a(activity, new a(this.this$0));
    }

    public void onActivityStopped(Activity activity) {
        j.e(activity, "activity");
        D d = this.this$0;
        int i2 = d.f5212a - 1;
        d.f5212a = i2;
        if (i2 == 0 && d.f5214c) {
            d.f5216f.d(C0302m.ON_STOP);
            d.d = true;
        }
    }
}
