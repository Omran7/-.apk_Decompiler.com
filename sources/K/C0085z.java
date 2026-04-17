package K;

import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: K.z  reason: case insensitive filesystem */
public final class C0085z implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final WeakHashMap f1441a = new WeakHashMap();

    public final void onGlobalLayout() {
        boolean z3;
        int i2;
        if (Build.VERSION.SDK_INT < 28) {
            for (Map.Entry entry : this.f1441a.entrySet()) {
                View view = (View) entry.getKey();
                boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
                if (!view.isShown() || view.getWindowVisibility() != 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (booleanValue != z3) {
                    if (z3) {
                        i2 = 16;
                    } else {
                        i2 = 32;
                    }
                    O.g(view, i2);
                    entry.setValue(Boolean.valueOf(z3));
                }
            }
        }
    }

    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
