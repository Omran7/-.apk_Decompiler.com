package L;

import android.view.accessibility.AccessibilityNodeInfo;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final AccessibilityNodeInfo.CollectionItemInfo f1700a;

    public i(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f1700a = collectionItemInfo;
    }

    public static i a(int i2, int i5, int i6, boolean z3, int i7) {
        return new i(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i5, i6, i7, false, z3));
    }
}
