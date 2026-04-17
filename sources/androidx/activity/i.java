package androidx.activity;

import android.app.Activity;
import android.window.OnBackInvokedDispatcher;
import kotlin.jvm.internal.j;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f4626a = new Object();

    public final OnBackInvokedDispatcher a(Activity activity) {
        j.e(activity, "activity");
        OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        j.d(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
        return onBackInvokedDispatcher;
    }
}
