package K;

import N.a;
import android.view.View;
import android.view.autofill.AutofillId;
import com.mtma.criminal.city.R;
import java.util.Objects;
import n.j;

public abstract class H {
    /* JADX WARNING: type inference failed for: r0v1, types: [android.view.View$OnUnhandledKeyEventListener, java.lang.Object] */
    public static void a(View view, M m6) {
        j jVar = (j) view.getTag(R.id.tag_unhandled_key_listeners);
        if (jVar == null) {
            jVar = new j(0);
            view.setTag(R.id.tag_unhandled_key_listeners, jVar);
        }
        Objects.requireNonNull(m6);
        ? obj = new Object();
        jVar.put(m6, obj);
        view.addOnUnhandledKeyEventListener(obj);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, M m6) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        j jVar = (j) view.getTag(R.id.tag_unhandled_key_listeners);
        if (jVar != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) jVar.get(m6)) != null) {
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }
    }

    public static <T> T f(View view, int i2) {
        return view.requireViewById(i2);
    }

    public static void g(View view, boolean z3) {
        view.setAccessibilityHeading(z3);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, a aVar) {
        view.setAutofillId((AutofillId) null);
    }

    public static void j(View view, boolean z3) {
        view.setScreenReaderFocusable(z3);
    }
}
