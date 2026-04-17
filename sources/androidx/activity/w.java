package androidx.activity;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import kotlin.jvm.internal.j;
import x5.a;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final w f4672a = new Object();

    public final OnBackInvokedCallback a(a aVar) {
        j.e(aVar, "onBackInvoked");
        return new v(aVar, 0);
    }

    public final void b(Object obj, int i2, Object obj2) {
        j.e(obj, "dispatcher");
        j.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i2, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        j.e(obj, "dispatcher");
        j.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
