package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.internal.k;
import x5.a;

public final class r extends k implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final r f4664a = new k(0);

    public final Object invoke() {
        Class<InputMethodManager> cls = InputMethodManager.class;
        try {
            cls.getDeclaredField("mServedView").setAccessible(true);
            cls.getDeclaredField("mNextServedView").setAccessible(true);
            cls.getDeclaredField("mH").setAccessible(true);
            return new Object();
        } catch (NoSuchFieldException unused) {
            return s.f4665p;
        }
    }
}
