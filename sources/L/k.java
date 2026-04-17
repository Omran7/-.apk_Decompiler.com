package L;

import U3.c;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

public class k extends AccessibilityNodeProvider {

    /* renamed from: a  reason: collision with root package name */
    public final c f1704a;

    public k(c cVar) {
        this.f1704a = cVar;
    }

    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        j g = this.f1704a.g(i2);
        if (g == null) {
            return null;
        }
        return g.f1702a;
    }

    public final List findAccessibilityNodeInfosByText(String str, int i2) {
        this.f1704a.getClass();
        return null;
    }

    public final AccessibilityNodeInfo findFocus(int i2) {
        j i5 = this.f1704a.i(i2);
        if (i5 == null) {
            return null;
        }
        return i5.f1702a;
    }

    public final boolean performAction(int i2, int i5, Bundle bundle) {
        return this.f1704a.w(i2, i5, bundle);
    }
}
