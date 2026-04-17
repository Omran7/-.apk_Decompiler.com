package U;

import K.C0062b;
import K.O;
import L.j;
import T1.B;
import T1.C;
import U3.c;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.common.api.f;
import com.google.android.material.chip.Chip;
import h2.d;
import java.util.ArrayList;
import java.util.WeakHashMap;

public abstract class b extends C0062b {

    /* renamed from: n  reason: collision with root package name */
    public static final Rect f3638n = new Rect(f.API_PRIORITY_OTHER, f.API_PRIORITY_OTHER, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o  reason: collision with root package name */
    public static final B f3639o = new B(22);

    /* renamed from: p  reason: collision with root package name */
    public static final C f3640p = new C(22);
    public final Rect d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final Rect f3641e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final Rect f3642f = new Rect();
    public final int[] g = new int[2];
    public final AccessibilityManager h;

    /* renamed from: i  reason: collision with root package name */
    public final Chip f3643i;

    /* renamed from: j  reason: collision with root package name */
    public a f3644j;

    /* renamed from: k  reason: collision with root package name */
    public int f3645k = Integer.MIN_VALUE;

    /* renamed from: l  reason: collision with root package name */
    public int f3646l = Integer.MIN_VALUE;

    /* renamed from: m  reason: collision with root package name */
    public int f3647m = Integer.MIN_VALUE;

    public b(Chip chip) {
        if (chip != null) {
            this.f3643i = chip;
            this.h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
            chip.setFocusable(true);
            WeakHashMap weakHashMap = O.f1352a;
            if (chip.getImportantForAccessibility() == 0) {
                chip.setImportantForAccessibility(1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    public final c b(View view) {
        if (this.f3644j == null) {
            this.f3644j = new a(this);
        }
        return this.f3644j;
    }

    public final void d(View view, j jVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f1369a;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f1702a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((d) this).f8056q;
        accessibilityNodeInfo.setCheckable(chip.d());
        accessibilityNodeInfo.setClickable(chip.isClickable());
        accessibilityNodeInfo.setClassName(chip.getAccessibilityClassName());
        jVar.k(chip.getText());
    }

    public final boolean j(int i2) {
        if (this.f3646l != i2) {
            return false;
        }
        this.f3646l = Integer.MIN_VALUE;
        d dVar = (d) this;
        if (i2 == 1) {
            Chip chip = dVar.f8056q;
            chip.f6384v = false;
            chip.refreshDrawableState();
        }
        q(i2, 8);
        return true;
    }

    public final j k(int i2) {
        boolean z3;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        j jVar = new j(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        obtain.setClassName("android.view.View");
        Rect rect = f3638n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        Chip chip = this.f3643i;
        obtain.setParent(chip);
        o(i2, jVar);
        if (jVar.g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f3641e;
        jVar.f(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((actions & 128) == 0) {
                obtain.setPackageName(chip.getContext().getPackageName());
                jVar.f1703b = i2;
                obtain.setSource(chip, i2);
                if (this.f3645k == i2) {
                    obtain.setAccessibilityFocused(true);
                    jVar.a(128);
                } else {
                    obtain.setAccessibilityFocused(false);
                    jVar.a(64);
                }
                if (this.f3646l == i2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    jVar.a(2);
                } else if (obtain.isFocusable()) {
                    jVar.a(1);
                }
                obtain.setFocused(z3);
                int[] iArr = this.g;
                chip.getLocationOnScreen(iArr);
                Rect rect3 = this.d;
                obtain.getBoundsInScreen(rect3);
                if (rect3.equals(rect)) {
                    jVar.f(rect3);
                    rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
                }
                Rect rect4 = this.f3642f;
                if (chip.getLocalVisibleRect(rect4)) {
                    rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
                    if (rect3.intersect(rect4)) {
                        obtain.setBoundsInScreen(rect3);
                        if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                            ViewParent parent = chip.getParent();
                            while (true) {
                                if (parent instanceof View) {
                                    View view = (View) parent;
                                    if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                        break;
                                    }
                                    parent = view.getParent();
                                } else if (parent != null) {
                                    obtain.setVisibleToUser(true);
                                }
                            }
                        }
                    }
                }
                return jVar;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    public abstract void l(ArrayList arrayList);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: L.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: L.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: L.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: L.j} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m(int r20, android.graphics.Rect r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = 1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.l(r4)
            n.k r5 = new n.k
            r5.<init>()
            r7 = 0
        L_0x0015:
            int r8 = r4.size()
            if (r7 >= r8) goto L_0x0038
            java.lang.Object r8 = r4.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            L.j r8 = r0.k(r8)
            java.lang.Object r9 = r4.get(r7)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r5.g(r9, r8)
            int r7 = r7 + r3
            goto L_0x0015
        L_0x0038:
            int r4 = r0.f3646l
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r8) goto L_0x0040
            r4 = 0
            goto L_0x0046
        L_0x0040:
            java.lang.Object r4 = r5.d(r4)
            L.j r4 = (L.j) r4
        L_0x0046:
            T1.B r9 = f3639o
            T1.C r10 = f3640p
            com.google.android.material.chip.Chip r11 = r0.f3643i
            r12 = 2
            if (r1 == r3) goto L_0x015e
            if (r1 == r12) goto L_0x015e
            r12 = 130(0x82, float:1.82E-43)
            r14 = 66
            r15 = 33
            r7 = 17
            if (r1 == r7) goto L_0x006a
            if (r1 == r15) goto L_0x006a
            if (r1 == r14) goto L_0x006a
            if (r1 != r12) goto L_0x0062
            goto L_0x006a
        L_0x0062:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L_0x006a:
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            int r6 = r0.f3646l
            java.lang.String r13 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            if (r6 == r8) goto L_0x007f
            L.j r2 = r0.n(r6)
            r2.f(r3)
        L_0x007c:
            r18 = -1
            goto L_0x00b8
        L_0x007f:
            if (r2 == 0) goto L_0x0085
            r3.set(r2)
            goto L_0x007c
        L_0x0085:
            int r2 = r11.getWidth()
            int r6 = r11.getHeight()
            if (r1 == r7) goto L_0x00b2
            if (r1 == r15) goto L_0x00ab
            if (r1 == r14) goto L_0x00a3
            if (r1 != r12) goto L_0x009d
            r6 = -1
            r11 = 0
            r3.set(r11, r6, r2, r6)
            r18 = r6
            goto L_0x00b8
        L_0x009d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r13)
            throw r1
        L_0x00a3:
            r2 = -1
            r11 = 0
            r3.set(r2, r11, r2, r6)
            r18 = r2
            goto L_0x00b8
        L_0x00ab:
            r11 = 0
            r18 = -1
            r3.set(r11, r6, r2, r6)
            goto L_0x00b8
        L_0x00b2:
            r11 = 0
            r18 = -1
            r3.set(r2, r11, r2, r6)
        L_0x00b8:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r3)
            if (r1 == r7) goto L_0x00ee
            if (r1 == r15) goto L_0x00e3
            if (r1 == r14) goto L_0x00d7
            if (r1 != r12) goto L_0x00d1
            int r6 = r3.height()
            r7 = 1
            int r6 = r6 + r7
            int r6 = -r6
            r14 = 0
            r2.offset(r14, r6)
            goto L_0x00f8
        L_0x00d1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r13)
            throw r1
        L_0x00d7:
            r7 = 1
            r14 = 0
            int r6 = r3.width()
            int r6 = r6 + r7
            int r6 = -r6
            r2.offset(r6, r14)
            goto L_0x00f8
        L_0x00e3:
            r7 = 1
            r14 = 0
            int r6 = r3.height()
            int r6 = r6 + r7
            r2.offset(r14, r6)
            goto L_0x00f8
        L_0x00ee:
            r7 = 1
            r14 = 0
            int r6 = r3.width()
            int r6 = r6 + r7
            r2.offset(r6, r14)
        L_0x00f8:
            r10.getClass()
            int r6 = r5.h()
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r11 = r14
            r16 = 0
        L_0x0107:
            if (r11 >= r6) goto L_0x015a
            java.lang.Object r10 = r5.i(r11)
            L.j r10 = (L.j) r10
            if (r10 != r4) goto L_0x0112
            goto L_0x0157
        L_0x0112:
            r9.getClass()
            r10.f(r7)
            boolean r12 = K1.e.Z(r1, r3, r7)
            if (r12 != 0) goto L_0x011f
            goto L_0x0157
        L_0x011f:
            boolean r12 = K1.e.Z(r1, r3, r2)
            if (r12 != 0) goto L_0x0126
            goto L_0x0152
        L_0x0126:
            boolean r12 = K1.e.e(r1, r3, r7, r2)
            if (r12 == 0) goto L_0x012d
            goto L_0x0152
        L_0x012d:
            boolean r12 = K1.e.e(r1, r3, r2, r7)
            if (r12 == 0) goto L_0x0134
            goto L_0x0157
        L_0x0134:
            int r12 = K1.e.i0(r1, r3, r7)
            int r13 = K1.e.k0(r1, r3, r7)
            int r15 = r12 * 13
            int r15 = r15 * r12
            int r13 = r13 * r13
            int r13 = r13 + r15
            int r12 = K1.e.i0(r1, r3, r2)
            int r15 = K1.e.k0(r1, r3, r2)
            int r17 = r12 * 13
            int r17 = r17 * r12
            int r15 = r15 * r15
            int r15 = r15 + r17
            if (r13 >= r15) goto L_0x0157
        L_0x0152:
            r2.set(r7)
            r16 = r10
        L_0x0157:
            r13 = 1
            int r11 = r11 + r13
            goto L_0x0107
        L_0x015a:
            r1 = r16
            goto L_0x01cd
        L_0x015e:
            r13 = r3
            r14 = 0
            r18 = -1
            java.util.WeakHashMap r2 = K.O.f1352a
            int r2 = r11.getLayoutDirection()
            if (r2 != r13) goto L_0x016c
            r2 = 1
            goto L_0x016d
        L_0x016c:
            r2 = r14
        L_0x016d:
            r10.getClass()
            int r3 = r5.h()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r3)
            r11 = r14
        L_0x017a:
            if (r11 >= r3) goto L_0x0188
            java.lang.Object r7 = r5.i(r11)
            L.j r7 = (L.j) r7
            r6.add(r7)
            r7 = 1
            int r11 = r11 + r7
            goto L_0x017a
        L_0x0188:
            r7 = 1
            U.c r3 = new U.c
            r3.<init>(r2, r9)
            java.util.Collections.sort(r6, r3)
            if (r1 == r7) goto L_0x01b4
            if (r1 != r12) goto L_0x01ac
            int r1 = r6.size()
            if (r4 != 0) goto L_0x019e
            r2 = r18
            goto L_0x01a2
        L_0x019e:
            int r2 = r6.lastIndexOf(r4)
        L_0x01a2:
            int r2 = r2 + r7
            if (r2 >= r1) goto L_0x01aa
            java.lang.Object r7 = r6.get(r2)
            goto L_0x01c8
        L_0x01aa:
            r7 = 0
            goto L_0x01c8
        L_0x01ac:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}."
            r1.<init>(r2)
            throw r1
        L_0x01b4:
            int r1 = r6.size()
            if (r4 != 0) goto L_0x01bc
        L_0x01ba:
            r2 = 1
            goto L_0x01c1
        L_0x01bc:
            int r1 = r6.indexOf(r4)
            goto L_0x01ba
        L_0x01c1:
            int r1 = r1 - r2
            if (r1 < 0) goto L_0x01aa
            java.lang.Object r7 = r6.get(r1)
        L_0x01c8:
            r16 = r7
            L.j r16 = (L.j) r16
            goto L_0x015a
        L_0x01cd:
            if (r1 != 0) goto L_0x01d0
            goto L_0x01ed
        L_0x01d0:
            boolean r2 = r5.f10227a
            if (r2 == 0) goto L_0x01d7
            n.h.a(r5)
        L_0x01d7:
            int r2 = r5.d
            r6 = r14
        L_0x01da:
            if (r6 >= r2) goto L_0x01e7
            java.lang.Object[] r3 = r5.f10229c
            r3 = r3[r6]
            if (r3 != r1) goto L_0x01e4
            r13 = r6
            goto L_0x01e9
        L_0x01e4:
            r3 = 1
            int r6 = r6 + r3
            goto L_0x01da
        L_0x01e7:
            r13 = r18
        L_0x01e9:
            int r8 = r5.f(r13)
        L_0x01ed:
            boolean r1 = r0.p(r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: U.b.m(int, android.graphics.Rect):boolean");
    }

    public final j n(int i2) {
        if (i2 != -1) {
            return k(i2);
        }
        Chip chip = this.f3643i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(chip);
        j jVar = new j(obtain);
        WeakHashMap weakHashMap = O.f1352a;
        chip.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (obtain.getChildCount() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                jVar.f1702a.addChild(chip, ((Integer) arrayList.get(i5)).intValue());
            }
            return jVar;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    public abstract void o(int i2, j jVar);

    public final boolean p(int i2) {
        int i5;
        Chip chip = this.f3643i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i5 = this.f3646l) == i2) {
            return false;
        }
        if (i5 != Integer.MIN_VALUE) {
            j(i5);
        }
        if (i2 == Integer.MIN_VALUE) {
            return false;
        }
        this.f3646l = i2;
        d dVar = (d) this;
        if (i2 == 1) {
            Chip chip2 = dVar.f8056q;
            chip2.f6384v = true;
            chip2.refreshDrawableState();
        }
        q(i2, 8);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r0 = r5.f3643i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(int r6, int r7) {
        /*
            r5 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == r0) goto L_0x008b
            android.view.accessibility.AccessibilityManager r0 = r5.h
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto L_0x000e
            goto L_0x008b
        L_0x000e:
            com.google.android.material.chip.Chip r0 = r5.f3643i
            android.view.ViewParent r1 = r0.getParent()
            if (r1 != 0) goto L_0x0017
            return
        L_0x0017:
            r2 = -1
            if (r6 == r2) goto L_0x0081
            android.view.accessibility.AccessibilityEvent r7 = android.view.accessibility.AccessibilityEvent.obtain(r7)
            L.j r2 = r5.n(r6)
            java.util.List r3 = r7.getText()
            java.lang.CharSequence r4 = r2.g()
            r3.add(r4)
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.f1702a
            java.lang.CharSequence r3 = r2.getContentDescription()
            r7.setContentDescription(r3)
            boolean r3 = r2.isScrollable()
            r7.setScrollable(r3)
            boolean r3 = r2.isPassword()
            r7.setPassword(r3)
            boolean r3 = r2.isEnabled()
            r7.setEnabled(r3)
            boolean r3 = r2.isChecked()
            r7.setChecked(r3)
            java.util.List r3 = r7.getText()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x006b
            java.lang.CharSequence r3 = r7.getContentDescription()
            if (r3 == 0) goto L_0x0063
            goto L_0x006b
        L_0x0063:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r7 = "Callbacks must add text or a content description in populateEventForVirtualViewId()"
            r6.<init>(r7)
            throw r6
        L_0x006b:
            java.lang.CharSequence r2 = r2.getClassName()
            r7.setClassName(r2)
            r7.setSource(r0, r6)
            android.content.Context r6 = r0.getContext()
            java.lang.String r6 = r6.getPackageName()
            r7.setPackageName(r6)
            goto L_0x0088
        L_0x0081:
            android.view.accessibility.AccessibilityEvent r7 = android.view.accessibility.AccessibilityEvent.obtain(r7)
            r0.onInitializeAccessibilityEvent(r7)
        L_0x0088:
            r1.requestSendAccessibilityEvent(r0, r7)
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U.b.q(int, int):void");
    }
}
