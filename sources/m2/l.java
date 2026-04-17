package m2;

import K.B;
import K.O;
import android.view.View;
import java.util.WeakHashMap;

public final class l implements View.OnAttachStateChangeListener {
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap weakHashMap = O.f1352a;
        B.c(view);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
