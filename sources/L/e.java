package L;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

public final class e {

    /* renamed from: e  reason: collision with root package name */
    public static final e f1691e = new e(16);

    /* renamed from: f  reason: collision with root package name */
    public static final e f1692f = new e(4096);
    public static final e g = new e(8192);
    public static final e h = new e(262144);

    /* renamed from: i  reason: collision with root package name */
    public static final e f1693i = new e(524288);

    /* renamed from: j  reason: collision with root package name */
    public static final e f1694j = new e(1048576);

    /* renamed from: k  reason: collision with root package name */
    public static final e f1695k = new e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, (String) null, (t) null, (Class) null);

    /* renamed from: l  reason: collision with root package name */
    public static final e f1696l = new e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, (String) null, (t) null, (Class) null);

    /* renamed from: a  reason: collision with root package name */
    public final Object f1697a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1698b;

    /* renamed from: c  reason: collision with root package name */
    public final Class f1699c;
    public final t d;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        new e(1);
        new e(2);
        new e(4);
        new e(8);
        new e(32);
        new e(64);
        new e(128);
        Class<m> cls = m.class;
        new e(256, cls);
        new e(512, cls);
        Class<n> cls2 = n.class;
        new e(1024, cls2);
        new e(2048, cls2);
        new e(16384);
        new e(32768);
        new e(65536);
        new e(131072, r.class);
        new e(2097152, s.class);
        int i2 = Build.VERSION.SDK_INT;
        new e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, (String) null, (t) null, (Class) null);
        new e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, (String) null, (t) null, p.class);
        new e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, (String) null, (t) null, (Class) null);
        new e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, (String) null, (t) null, (Class) null);
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14 = null;
        if (i2 >= 29) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
        } else {
            accessibilityAction = null;
        }
        new e(accessibilityAction, 16908358, (String) null, (t) null, (Class) null);
        if (i2 >= 29) {
            accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
        } else {
            accessibilityAction2 = null;
        }
        new e(accessibilityAction2, 16908359, (String) null, (t) null, (Class) null);
        if (i2 >= 29) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction3 = null;
        }
        new e(accessibilityAction3, 16908360, (String) null, (t) null, (Class) null);
        if (i2 >= 29) {
            accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
        } else {
            accessibilityAction4 = null;
        }
        new e(accessibilityAction4, 16908361, (String) null, (t) null, (Class) null);
        new e(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, (String) null, (t) null, (Class) null);
        new e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, (String) null, (t) null, q.class);
        if (i2 >= 26) {
            accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        } else {
            accessibilityAction5 = null;
        }
        new e(accessibilityAction5, 16908354, (String) null, (t) null, o.class);
        if (i2 >= 28) {
            accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
        } else {
            accessibilityAction6 = null;
        }
        new e(accessibilityAction6, 16908356, (String) null, (t) null, (Class) null);
        if (i2 >= 28) {
            accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
        } else {
            accessibilityAction7 = null;
        }
        new e(accessibilityAction7, 16908357, (String) null, (t) null, (Class) null);
        if (i2 >= 30) {
            accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
        } else {
            accessibilityAction8 = null;
        }
        new e(accessibilityAction8, 16908362, (String) null, (t) null, (Class) null);
        if (i2 >= 30) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
        } else {
            accessibilityAction9 = null;
        }
        new e(accessibilityAction9, 16908372, (String) null, (t) null, (Class) null);
        if (i2 >= 32) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        } else {
            accessibilityAction10 = null;
        }
        new e(accessibilityAction10, 16908373, (String) null, (t) null, (Class) null);
        if (i2 >= 32) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
        } else {
            accessibilityAction11 = null;
        }
        new e(accessibilityAction11, 16908374, (String) null, (t) null, (Class) null);
        if (i2 >= 32) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
        } else {
            accessibilityAction12 = null;
        }
        new e(accessibilityAction12, 16908375, (String) null, (t) null, (Class) null);
        if (i2 >= 33) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
        } else {
            accessibilityAction13 = null;
        }
        new e(accessibilityAction13, 16908376, (String) null, (t) null, (Class) null);
        if (i2 >= 34) {
            accessibilityAction14 = h.a();
        }
        new e(accessibilityAction14, 16908382, (String) null, (t) null, (Class) null);
    }

    public e(int i2) {
        this((Object) null, i2, (String) null, (t) null, (Class) null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f1697a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof e)) {
            return false;
        }
        Object obj2 = ((e) obj).f1697a;
        Object obj3 = this.f1697a;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        } else if (!obj3.equals(obj2)) {
            return false;
        } else {
            return true;
        }
    }

    public final int hashCode() {
        Object obj = this.f1697a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String d6 = j.d(this.f1698b);
        if (d6.equals("ACTION_UNKNOWN")) {
            Object obj = this.f1697a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d6 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(d6);
        return sb.toString();
    }

    public e(int i2, Class cls) {
        this((Object) null, i2, (String) null, (t) null, cls);
    }

    public e(Object obj, int i2, String str, t tVar, Class cls) {
        this.f1698b = i2;
        this.d = tVar;
        if (obj == null) {
            this.f1697a = new AccessibilityNodeInfo.AccessibilityAction(i2, str);
        } else {
            this.f1697a = obj;
        }
        this.f1699c = cls;
    }
}
