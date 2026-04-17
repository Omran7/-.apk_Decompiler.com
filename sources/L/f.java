package L;

import android.view.accessibility.AccessibilityNodeInfo;

public abstract class f {
    public static Object a(int i2, float f6, float f7, float f8) {
        return new AccessibilityNodeInfo.RangeInfo(i2, f6, f7, f8);
    }

    public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
