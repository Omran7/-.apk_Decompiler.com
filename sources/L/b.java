package L;

import F3.e;
import K.O;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;
import v2.i;

public final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final e f1690a;

    public b(e eVar) {
        this.f1690a = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f1690a.equals(((b) obj).f1690a);
    }

    public final int hashCode() {
        return this.f1690a.hashCode();
    }

    public final void onTouchExplorationStateChanged(boolean z3) {
        int i2;
        i iVar = (i) this.f1690a.f739b;
        AutoCompleteTextView autoCompleteTextView = iVar.h;
        if (autoCompleteTextView != null && !K1.e.c0(autoCompleteTextView)) {
            if (z3) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            WeakHashMap weakHashMap = O.f1352a;
            iVar.d.setImportantForAccessibility(i2);
        }
    }
}
