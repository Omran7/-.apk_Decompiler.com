package b2;

import K.O;
import R2.b;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* renamed from: b2.a  reason: case insensitive filesystem */
public final class C0316a extends b {

    /* renamed from: t  reason: collision with root package name */
    public int f5510t;

    /* renamed from: u  reason: collision with root package name */
    public int f5511u = -1;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f5512v;

    public C0316a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f5512v = swipeDismissBehavior;
    }

    public final boolean X0(View view, int i2) {
        int i5 = this.f5511u;
        if ((i5 == -1 || i5 == i2) && this.f5512v.r(view)) {
            return true;
        }
        return false;
    }

    public final int d0(View view) {
        return view.getWidth();
    }

    public final int i(View view, int i2) {
        boolean z3;
        int i5;
        int i6;
        int width;
        WeakHashMap weakHashMap = O.f1352a;
        if (view.getLayoutDirection() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i7 = this.f5512v.d;
        if (i7 != 0) {
            if (i7 != 1) {
                i6 = this.f5510t - view.getWidth();
                i5 = view.getWidth() + this.f5510t;
            } else if (z3) {
                i6 = this.f5510t;
                width = view.getWidth();
            } else {
                i6 = this.f5510t - view.getWidth();
                i5 = this.f5510t;
            }
            return Math.min(Math.max(i6, i2), i5);
        } else if (z3) {
            i6 = this.f5510t - view.getWidth();
            i5 = this.f5510t;
            return Math.min(Math.max(i6, i2), i5);
        } else {
            i6 = this.f5510t;
            width = view.getWidth();
        }
        i5 = width + i6;
        return Math.min(Math.max(i6, i2), i5);
    }

    public final int j(View view, int i2) {
        return view.getTop();
    }

    public final void q0(View view, int i2) {
        this.f5511u = i2;
        this.f5510t = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f5512v;
            swipeDismissBehavior.f6286c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f6286c = false;
        }
    }

    public final void r0(int i2) {
        this.f5512v.getClass();
    }

    public final void s0(View view, int i2, int i5) {
        SwipeDismissBehavior swipeDismissBehavior = this.f5512v;
        float width = ((float) view.getWidth()) * swipeDismissBehavior.f6287e;
        float width2 = ((float) view.getWidth()) * swipeDismissBehavior.f6288f;
        float abs = (float) Math.abs(i2 - this.f5510t);
        if (abs <= width) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - width) / (width2 - width))), 1.0f));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (java.lang.Math.abs(r1) >= java.lang.Math.round(((float) r9.getWidth()) * 0.5f)) goto L_0x0055;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t0(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f5511u = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 1
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.f5512v
            r4 = 0
            if (r1 == 0) goto L_0x0039
            java.util.WeakHashMap r5 = K.O.f1352a
            int r5 = r9.getLayoutDirection()
            if (r5 != r2) goto L_0x001a
            r5 = r2
            goto L_0x001b
        L_0x001a:
            r5 = r4
        L_0x001b:
            int r6 = r3.d
            r7 = 2
            if (r6 != r7) goto L_0x0021
            goto L_0x0055
        L_0x0021:
            if (r6 != 0) goto L_0x002d
            if (r5 == 0) goto L_0x002a
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x0069
            goto L_0x0055
        L_0x002a:
            if (r1 <= 0) goto L_0x0069
            goto L_0x0055
        L_0x002d:
            if (r6 != r2) goto L_0x0069
            if (r5 == 0) goto L_0x0034
            if (r1 <= 0) goto L_0x0069
            goto L_0x0055
        L_0x0034:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x0069
            goto L_0x0055
        L_0x0039:
            int r1 = r9.getLeft()
            int r5 = r8.f5510t
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            r3.getClass()
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L_0x0069
        L_0x0055:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L_0x0064
            int r10 = r9.getLeft()
            int r0 = r8.f5510t
            if (r10 >= r0) goto L_0x0062
            goto L_0x0064
        L_0x0062:
            int r0 = r0 + r11
            goto L_0x006c
        L_0x0064:
            int r10 = r8.f5510t
            int r0 = r10 - r11
            goto L_0x006c
        L_0x0069:
            int r0 = r8.f5510t
            r2 = r4
        L_0x006c:
            U.e r10 = r3.f6284a
            int r11 = r9.getTop()
            boolean r10 = r10.o(r0, r11)
            if (r10 == 0) goto L_0x0082
            B2.a r10 = new B2.a
            r10.<init>((com.google.android.material.behavior.SwipeDismissBehavior) r3, (android.view.View) r9, (boolean) r2)
            java.util.WeakHashMap r11 = K.O.f1352a
            r9.postOnAnimation(r10)
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.C0316a.t0(android.view.View, float, float):void");
    }
}
