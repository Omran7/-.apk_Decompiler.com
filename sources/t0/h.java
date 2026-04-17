package t0;

import android.animation.ObjectAnimator;
import android.view.View;
import com.mtma.criminal.city.R;
import java.util.HashMap;

public final class h extends m {

    /* renamed from: K  reason: collision with root package name */
    public static final String[] f11648K = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: J  reason: collision with root package name */
    public final int f11649J;

    public h(int i2) {
        this();
        this.f11649J = i2;
    }

    public static void J(u uVar) {
        int visibility = uVar.f11695b.getVisibility();
        HashMap hashMap = uVar.f11694a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = uVar.f11695b;
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public static float L(u uVar, float f6) {
        Float f7;
        if (uVar == null || (f7 = (Float) uVar.f11694a.get("android:fade:transitionAlpha")) == null) {
            return f6;
        }
        return f7.floatValue();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [t0.F, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0095 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static t0.F M(t0.u r8, t0.u r9) {
        /*
            t0.F r0 = new t0.F
            r0.<init>()
            r1 = 0
            r0.f11622a = r1
            r0.f11623b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L_0x002f
            java.util.HashMap r6 = r8.f11694a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L_0x002f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f11624c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f11625e = r6
            goto L_0x0033
        L_0x002f:
            r0.f11624c = r3
            r0.f11625e = r2
        L_0x0033:
            if (r9 == 0) goto L_0x0052
            java.util.HashMap r6 = r9.f11694a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L_0x0052
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f11626f = r2
            goto L_0x0056
        L_0x0052:
            r0.d = r3
            r0.f11626f = r2
        L_0x0056:
            r2 = 1
            if (r8 == 0) goto L_0x008a
            if (r9 == 0) goto L_0x008a
            int r8 = r0.f11624c
            int r9 = r0.d
            if (r8 != r9) goto L_0x0068
            android.view.ViewGroup r3 = r0.f11625e
            android.view.ViewGroup r4 = r0.f11626f
            if (r3 != r4) goto L_0x0068
            return r0
        L_0x0068:
            if (r8 == r9) goto L_0x0078
            if (r8 != 0) goto L_0x0071
            r0.f11623b = r1
            r0.f11622a = r2
            goto L_0x009f
        L_0x0071:
            if (r9 != 0) goto L_0x009f
            r0.f11623b = r2
            r0.f11622a = r2
            goto L_0x009f
        L_0x0078:
            android.view.ViewGroup r8 = r0.f11626f
            if (r8 != 0) goto L_0x0081
            r0.f11623b = r1
            r0.f11622a = r2
            goto L_0x009f
        L_0x0081:
            android.view.ViewGroup r8 = r0.f11625e
            if (r8 != 0) goto L_0x009f
            r0.f11623b = r2
            r0.f11622a = r2
            goto L_0x009f
        L_0x008a:
            if (r8 != 0) goto L_0x0095
            int r8 = r0.d
            if (r8 != 0) goto L_0x0095
            r0.f11623b = r2
            r0.f11622a = r2
            goto L_0x009f
        L_0x0095:
            if (r9 != 0) goto L_0x009f
            int r8 = r0.f11624c
            if (r8 != 0) goto L_0x009f
            r0.f11623b = r1
            r0.f11622a = r2
        L_0x009f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.h.M(t0.u, t0.u):t0.F");
    }

    public final ObjectAnimator K(View view, float f6, float f7) {
        if (f6 == f7) {
            return null;
        }
        w.f11697a.b1(view, f6);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, w.f11698b, new float[]{f7});
        g gVar = new g(view);
        ofFloat.addListener(gVar);
        p().a(gVar);
        return ofFloat;
    }

    public final void d(u uVar) {
        J(uVar);
    }

    public final void g(u uVar) {
        J(uVar);
        View view = uVar.f11695b;
        Float f6 = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f6 == null) {
            if (view.getVisibility() == 0) {
                f6 = Float.valueOf(w.f11697a.F0(view));
            } else {
                f6 = Float.valueOf(0.0f);
            }
        }
        uVar.f11694a.put("android:fade:transitionAlpha", f6);
    }

    /* JADX WARNING: type inference failed for: r16v8, types: [android.view.ViewParent] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (M(o(r3, false), s(r3, false)).f11622a != false) goto L_0x0049;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator l(android.widget.FrameLayout r21, t0.u r22, t0.u r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            int r4 = r0.f11649J
            t0.F r5 = M(r22, r23)
            boolean r6 = r5.f11622a
            if (r6 == 0) goto L_0x001b
            android.view.ViewGroup r6 = r5.f11625e
            if (r6 != 0) goto L_0x001f
            android.view.ViewGroup r6 = r5.f11626f
            if (r6 == 0) goto L_0x001b
            goto L_0x001f
        L_0x001b:
            r4 = r0
            r0 = 0
            goto L_0x02c5
        L_0x001f:
            boolean r6 = r5.f11623b
            r8 = 0
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            r11 = 1
            if (r6 == 0) goto L_0x0059
            r1 = r4 & 1
            if (r1 != r11) goto L_0x0049
            if (r3 != 0) goto L_0x002f
            goto L_0x0049
        L_0x002f:
            android.view.View r1 = r3.f11695b
            if (r2 != 0) goto L_0x004b
            android.view.ViewParent r3 = r1.getParent()
            android.view.View r3 = (android.view.View) r3
            t0.u r4 = r0.o(r3, r10)
            t0.u r3 = r0.s(r3, r10)
            t0.F r3 = M(r4, r3)
            boolean r3 = r3.f11622a
            if (r3 == 0) goto L_0x004b
        L_0x0049:
            r7 = 0
            goto L_0x0058
        L_0x004b:
            t0.B r3 = t0.w.f11697a
            r3.getClass()
            float r2 = L(r2, r8)
            android.animation.ObjectAnimator r7 = r0.K(r1, r2, r9)
        L_0x0058:
            return r7
        L_0x0059:
            int r5 = r5.d
            r6 = 2
            r4 = r4 & r6
            if (r4 == r6) goto L_0x0063
        L_0x005f:
            r4 = r0
        L_0x0060:
            r7 = 0
            goto L_0x02c4
        L_0x0063:
            if (r2 != 0) goto L_0x0066
            goto L_0x005f
        L_0x0066:
            if (r3 == 0) goto L_0x006b
            android.view.View r4 = r3.f11695b
            goto L_0x006c
        L_0x006b:
            r4 = 0
        L_0x006c:
            android.view.View r12 = r2.f11695b
            r13 = 2131298387(0x7f090853, float:1.8214746E38)
            java.lang.Object r14 = r12.getTag(r13)
            android.view.View r14 = (android.view.View) r14
            if (r14 == 0) goto L_0x007f
            r18 = r5
            r10 = r11
            r7 = 0
            goto L_0x0208
        L_0x007f:
            if (r4 == 0) goto L_0x0096
            android.view.ViewParent r14 = r4.getParent()
            if (r14 != 0) goto L_0x0088
            goto L_0x0096
        L_0x0088:
            r14 = 4
            if (r5 != r14) goto L_0x008c
            goto L_0x008e
        L_0x008c:
            if (r12 != r4) goto L_0x0092
        L_0x008e:
            r14 = r4
            r15 = r10
            r4 = 0
            goto L_0x009a
        L_0x0092:
            r15 = r11
            r4 = 0
        L_0x0094:
            r14 = 0
            goto L_0x009a
        L_0x0096:
            if (r4 == 0) goto L_0x0092
            r15 = r10
            goto L_0x0094
        L_0x009a:
            if (r15 == 0) goto L_0x0202
            android.view.ViewParent r15 = r12.getParent()
            if (r15 != 0) goto L_0x00a8
            r18 = r5
            r7 = r14
            r14 = r12
            goto L_0x0208
        L_0x00a8:
            android.view.ViewParent r15 = r12.getParent()
            boolean r15 = r15 instanceof android.view.View
            if (r15 == 0) goto L_0x0202
            android.view.ViewParent r15 = r12.getParent()
            android.view.View r15 = (android.view.View) r15
            t0.u r7 = r0.s(r15, r11)
            t0.u r13 = r0.o(r15, r11)
            t0.F r7 = M(r7, r13)
            boolean r7 = r7.f11622a
            if (r7 != 0) goto L_0x01ed
            boolean r4 = t0.t.f11693a
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            int r7 = r15.getScrollX()
            int r7 = -r7
            float r7 = (float) r7
            int r13 = r15.getScrollY()
            int r13 = -r13
            float r13 = (float) r13
            r4.setTranslate(r7, r13)
            t0.B r7 = t0.w.f11697a
            r7.u1(r12, r4)
            r7.v1(r1, r4)
            android.graphics.RectF r7 = new android.graphics.RectF
            int r13 = r12.getWidth()
            float r13 = (float) r13
            int r15 = r12.getHeight()
            float r15 = (float) r15
            r7.<init>(r8, r8, r13, r15)
            r4.mapRect(r7)
            float r13 = r7.left
            int r13 = java.lang.Math.round(r13)
            float r15 = r7.top
            int r15 = java.lang.Math.round(r15)
            float r8 = r7.right
            int r8 = java.lang.Math.round(r8)
            float r6 = r7.bottom
            int r6 = java.lang.Math.round(r6)
            android.widget.ImageView r11 = new android.widget.ImageView
            android.content.Context r10 = r12.getContext()
            r11.<init>(r10)
            android.widget.ImageView$ScaleType r10 = android.widget.ImageView.ScaleType.CENTER_CROP
            r11.setScaleType(r10)
            boolean r10 = r12.isAttachedToWindow()
            if (r1 == 0) goto L_0x012b
            boolean r16 = r21.isAttachedToWindow()
            if (r16 == 0) goto L_0x012b
            r16 = 1
            goto L_0x012d
        L_0x012b:
            r16 = 0
        L_0x012d:
            if (r10 != 0) goto L_0x0156
            if (r16 != 0) goto L_0x0138
            r18 = r5
            r16 = r14
            r0 = 0
            goto L_0x01cf
        L_0x0138:
            android.view.ViewParent r16 = r12.getParent()
            r9 = r16
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            int r16 = r9.indexOfChild(r12)
            r17 = r9
            android.view.ViewGroupOverlay r9 = r21.getOverlay()
            r9.add(r12)
            r9 = r17
            r19 = r16
            r16 = r14
            r14 = r19
            goto L_0x015a
        L_0x0156:
            r16 = r14
            r9 = 0
            r14 = 0
        L_0x015a:
            float r17 = r7.width()
            r18 = r5
            int r5 = java.lang.Math.round(r17)
            float r17 = r7.height()
            int r3 = java.lang.Math.round(r17)
            if (r5 <= 0) goto L_0x01c2
            if (r3 <= 0) goto L_0x01c2
            int r0 = r5 * r3
            float r0 = (float) r0
            r17 = 1233125376(0x49800000, float:1048576.0)
            float r0 = r17 / r0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r2, r0)
            float r2 = (float) r5
            float r2 = r2 * r0
            int r2 = java.lang.Math.round(r2)
            float r3 = (float) r3
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            float r5 = r7.left
            float r5 = -r5
            float r7 = r7.top
            float r7 = -r7
            r4.postTranslate(r5, r7)
            r4.postScale(r0, r0)
            boolean r0 = t0.t.f11693a
            if (r0 == 0) goto L_0x01b0
            android.graphics.Picture r0 = new android.graphics.Picture
            r0.<init>()
            android.graphics.Canvas r2 = r0.beginRecording(r2, r3)
            r2.concat(r4)
            r12.draw(r2)
            r0.endRecording()
            android.graphics.Bitmap r0 = t0.s.a(r0)
            goto L_0x01c3
        L_0x01b0:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r3, r0)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r0)
            r2.concat(r4)
            r12.draw(r2)
            goto L_0x01c3
        L_0x01c2:
            r0 = 0
        L_0x01c3:
            if (r10 != 0) goto L_0x01cf
            android.view.ViewGroupOverlay r2 = r21.getOverlay()
            r2.remove(r12)
            r9.addView(r12, r14)
        L_0x01cf:
            if (r0 == 0) goto L_0x01d4
            r11.setImageBitmap(r0)
        L_0x01d4:
            int r0 = r8 - r13
            r2 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r3 = r6 - r15
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            r11.measure(r0, r2)
            r11.layout(r13, r15, r8, r6)
            r14 = r11
        L_0x01e9:
            r7 = r16
            r10 = 0
            goto L_0x0208
        L_0x01ed:
            r18 = r5
            r16 = r14
            int r0 = r15.getId()
            android.view.ViewParent r2 = r15.getParent()
            if (r2 != 0) goto L_0x0206
            r2 = -1
            if (r0 == r2) goto L_0x0206
            r1.findViewById(r0)
            goto L_0x0206
        L_0x0202:
            r18 = r5
            r16 = r14
        L_0x0206:
            r14 = r4
            goto L_0x01e9
        L_0x0208:
            if (r14 == 0) goto L_0x0283
            r0 = r22
            if (r10 != 0) goto L_0x0241
            java.util.HashMap r2 = r0.f11694a
            java.lang.String r3 = "android:visibility:screenLocation"
            java.lang.Object r2 = r2.get(r3)
            int[] r2 = (int[]) r2
            r3 = 0
            r4 = r2[r3]
            r5 = 1
            r2 = r2[r5]
            r6 = 2
            int[] r6 = new int[r6]
            r1.getLocationOnScreen(r6)
            r3 = r6[r3]
            int r4 = r4 - r3
            int r3 = r14.getLeft()
            int r4 = r4 - r3
            r14.offsetLeftAndRight(r4)
            r3 = r6[r5]
            int r2 = r2 - r3
            int r3 = r14.getTop()
            int r2 = r2 - r3
            r14.offsetTopAndBottom(r2)
            android.view.ViewGroupOverlay r2 = r21.getOverlay()
            r2.add(r14)
        L_0x0241:
            t0.B r2 = t0.w.f11697a
            r2.getClass()
            r3 = 1065353216(0x3f800000, float:1.0)
            float r0 = L(r0, r3)
            r5 = 0
            r4 = r20
            android.animation.ObjectAnimator r7 = r4.K(r14, r0, r5)
            if (r7 != 0) goto L_0x025e
            r5 = r23
            float r0 = L(r5, r3)
            r2.b1(r14, r0)
        L_0x025e:
            if (r10 != 0) goto L_0x02c4
            if (r7 != 0) goto L_0x026a
            android.view.ViewGroupOverlay r0 = r21.getOverlay()
            r0.remove(r14)
            goto L_0x02c4
        L_0x026a:
            r0 = 2131298387(0x7f090853, float:1.8214746E38)
            r12.setTag(r0, r14)
            t0.E r0 = new t0.E
            r0.<init>(r4, r1, r14, r12)
            r7.addListener(r0)
            r7.addPauseListener(r0)
            t0.m r1 = r20.p()
            r1.a(r0)
            goto L_0x02c4
        L_0x0283:
            r4 = r20
            r0 = r22
            r5 = r23
            if (r7 == 0) goto L_0x0060
            int r1 = r7.getVisibility()
            r2 = 0
            t0.w.b(r7, r2)
            t0.B r2 = t0.w.f11697a
            r2.getClass()
            r3 = 1065353216(0x3f800000, float:1.0)
            float r0 = L(r0, r3)
            r6 = 0
            android.animation.ObjectAnimator r0 = r4.K(r7, r0, r6)
            if (r0 != 0) goto L_0x02ac
            float r3 = L(r5, r3)
            r2.b1(r7, r3)
        L_0x02ac:
            if (r0 == 0) goto L_0x02c0
            t0.D r1 = new t0.D
            r2 = r18
            r1.<init>(r7, r2)
            r0.addListener(r1)
            t0.m r2 = r20.p()
            r2.a(r1)
            goto L_0x02c3
        L_0x02c0:
            t0.w.b(r7, r1)
        L_0x02c3:
            r7 = r0
        L_0x02c4:
            return r7
        L_0x02c5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.h.l(android.widget.FrameLayout, t0.u, t0.u):android.animation.Animator");
    }

    public final String[] r() {
        return f11648K;
    }

    public final boolean t(u uVar, u uVar2) {
        if (uVar == null && uVar2 == null) {
            return false;
        }
        if (uVar != null && uVar2 != null && uVar2.f11694a.containsKey("android:visibility:visibility") != uVar.f11694a.containsKey("android:visibility:visibility")) {
            return false;
        }
        F M6 = M(uVar, uVar2);
        if (!M6.f11622a) {
            return false;
        }
        if (M6.f11624c == 0 || M6.d == 0) {
            return true;
        }
        return false;
    }

    public h() {
        this.f11649J = 3;
    }
}
