package v;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f12024a;

    /* renamed from: b  reason: collision with root package name */
    public int f12025b;

    /* renamed from: c  reason: collision with root package name */
    public int f12026c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f12027e;

    /* renamed from: f  reason: collision with root package name */
    public int f12028f;
    public int g;
    public final /* synthetic */ ConstraintLayout h;

    public f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.f12024a = constraintLayout2;
    }

    public static boolean a(int i2, int i5, int i6) {
        if (i2 == i5) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        if (mode2 == 1073741824 && ((mode == Integer.MIN_VALUE || mode == 0) && i6 == size)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ed, code lost:
        if (r10 == 2) goto L_0x00f1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0123  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(s.d r18, t.C0976b r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            if (r1 != 0) goto L_0x0009
            return
        L_0x0009:
            int r3 = r1.f11325g0
            r4 = 8
            r5 = 0
            if (r3 != r4) goto L_0x0017
            r2.f11570e = r5
            r2.f11571f = r5
            r2.g = r5
            return
        L_0x0017:
            s.d r3 = r1.f11307T
            if (r3 != 0) goto L_0x001c
            return
        L_0x001c:
            v.r r3 = androidx.constraintlayout.widget.ConstraintLayout.f4837y
            androidx.constraintlayout.widget.ConstraintLayout r3 = r0.h
            r3.getClass()
            int r4 = r2.f11567a
            int r6 = r2.f11568b
            int r7 = r2.f11569c
            int r8 = r2.d
            int r9 = r0.f12025b
            int r10 = r0.f12026c
            int r9 = r9 + r10
            int r10 = r0.d
            android.view.View r11 = r1.f11324f0
            int r12 = q.C0928e.c(r4)
            s.c r13 = r1.f11298K
            s.c r14 = r1.f11296I
            r15 = 1
            r5 = 2
            if (r12 == 0) goto L_0x00a8
            if (r12 == r15) goto L_0x009e
            if (r12 == r5) goto L_0x005e
            r7 = 3
            if (r12 == r7) goto L_0x004a
            r7 = 0
            goto L_0x00af
        L_0x004a:
            int r7 = r0.f12028f
            if (r14 == 0) goto L_0x0051
            int r12 = r14.g
            goto L_0x0052
        L_0x0051:
            r12 = 0
        L_0x0052:
            if (r13 == 0) goto L_0x0057
            int r5 = r13.g
            int r12 = r12 + r5
        L_0x0057:
            int r10 = r10 + r12
            r5 = -1
            int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r10, r5)
            goto L_0x00af
        L_0x005e:
            int r5 = r0.f12028f
            r7 = -2
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r10, r7)
            int r7 = r1.f11344r
            if (r7 != r15) goto L_0x006b
            r7 = r15
            goto L_0x006c
        L_0x006b:
            r7 = 0
        L_0x006c:
            int r10 = r2.f11573j
            r12 = 2
            if (r10 == r15) goto L_0x0073
            if (r10 != r12) goto L_0x0091
        L_0x0073:
            int r10 = r11.getMeasuredHeight()
            int r15 = r18.k()
            if (r10 != r15) goto L_0x007f
            r10 = 1
            goto L_0x0080
        L_0x007f:
            r10 = 0
        L_0x0080:
            int r15 = r2.f11573j
            if (r15 == r12) goto L_0x0093
            if (r7 == 0) goto L_0x0093
            if (r7 == 0) goto L_0x008a
            if (r10 != 0) goto L_0x0093
        L_0x008a:
            boolean r7 = r18.A()
            if (r7 == 0) goto L_0x0091
            goto L_0x0093
        L_0x0091:
            r7 = r5
            goto L_0x00af
        L_0x0093:
            int r5 = r18.q()
            r12 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r12)
            goto L_0x0091
        L_0x009e:
            r12 = 1073741824(0x40000000, float:2.0)
            int r5 = r0.f12028f
            r7 = -2
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r10, r7)
            goto L_0x0091
        L_0x00a8:
            r12 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r12)
            goto L_0x0091
        L_0x00af:
            int r5 = q.C0928e.c(r6)
            if (r5 == 0) goto L_0x0123
            r10 = 1
            if (r5 == r10) goto L_0x0119
            r8 = 2
            if (r5 == r8) goto L_0x00d9
            r8 = 3
            if (r5 == r8) goto L_0x00c1
            r5 = 0
            goto L_0x0129
        L_0x00c1:
            int r5 = r0.g
            if (r14 == 0) goto L_0x00ca
            s.c r8 = r1.f11297J
            int r8 = r8.g
            goto L_0x00cb
        L_0x00ca:
            r8 = 0
        L_0x00cb:
            if (r13 == 0) goto L_0x00d2
            s.c r10 = r1.f11299L
            int r10 = r10.g
            int r8 = r8 + r10
        L_0x00d2:
            int r9 = r9 + r8
            r8 = -1
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r9, r8)
            goto L_0x0129
        L_0x00d9:
            int r5 = r0.g
            r8 = -2
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r9, r8)
            int r8 = r1.f11345s
            r9 = 1
            if (r8 != r9) goto L_0x00e7
            r8 = r9
            goto L_0x00e8
        L_0x00e7:
            r8 = 0
        L_0x00e8:
            int r10 = r2.f11573j
            if (r10 == r9) goto L_0x00f0
            r9 = 2
            if (r10 != r9) goto L_0x0129
            goto L_0x00f1
        L_0x00f0:
            r9 = 2
        L_0x00f1:
            int r10 = r11.getMeasuredWidth()
            int r12 = r18.q()
            if (r10 != r12) goto L_0x00fd
            r10 = 1
            goto L_0x00fe
        L_0x00fd:
            r10 = 0
        L_0x00fe:
            int r12 = r2.f11573j
            if (r12 == r9) goto L_0x010e
            if (r8 == 0) goto L_0x010e
            if (r8 == 0) goto L_0x0108
            if (r10 != 0) goto L_0x010e
        L_0x0108:
            boolean r8 = r18.B()
            if (r8 == 0) goto L_0x0129
        L_0x010e:
            int r5 = r18.k()
            r10 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r10)
            goto L_0x0129
        L_0x0119:
            r10 = 1073741824(0x40000000, float:2.0)
            int r5 = r0.g
            r8 = -2
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r9, r8)
            goto L_0x0129
        L_0x0123:
            r10 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r10)
        L_0x0129:
            s.d r8 = r1.f11307T
            s.e r8 = (s.e) r8
            if (r8 == 0) goto L_0x0198
            int r9 = r3.f4845r
            r10 = 256(0x100, float:3.59E-43)
            boolean r9 = s.j.c(r9, r10)
            if (r9 == 0) goto L_0x0198
            int r9 = r11.getMeasuredWidth()
            int r10 = r18.q()
            if (r9 != r10) goto L_0x0198
            int r9 = r11.getMeasuredWidth()
            int r10 = r8.q()
            if (r9 >= r10) goto L_0x0198
            int r9 = r11.getMeasuredHeight()
            int r10 = r18.k()
            if (r9 != r10) goto L_0x0198
            int r9 = r11.getMeasuredHeight()
            int r8 = r8.k()
            if (r9 >= r8) goto L_0x0198
            int r8 = r11.getBaseline()
            int r9 = r1.f11315a0
            if (r8 != r9) goto L_0x0198
            boolean r8 = r18.z()
            if (r8 != 0) goto L_0x0198
            int r8 = r1.f11294G
            int r9 = r18.q()
            boolean r8 = a(r8, r7, r9)
            if (r8 == 0) goto L_0x0198
            int r8 = r1.f11295H
            int r9 = r18.k()
            boolean r8 = a(r8, r5, r9)
            if (r8 == 0) goto L_0x0198
            int r3 = r18.q()
            r2.f11570e = r3
            int r3 = r18.k()
            r2.f11571f = r3
            int r1 = r1.f11315a0
            r2.g = r1
            return
        L_0x0198:
            r8 = 3
            if (r4 != r8) goto L_0x019d
            r9 = 1
            goto L_0x019e
        L_0x019d:
            r9 = 0
        L_0x019e:
            if (r6 != r8) goto L_0x01a2
            r8 = 1
            goto L_0x01a3
        L_0x01a2:
            r8 = 0
        L_0x01a3:
            r10 = 4
            r12 = 1
            if (r6 == r10) goto L_0x01ac
            if (r6 != r12) goto L_0x01aa
            goto L_0x01ac
        L_0x01aa:
            r6 = 0
            goto L_0x01ad
        L_0x01ac:
            r6 = r12
        L_0x01ad:
            if (r4 == r10) goto L_0x01b4
            if (r4 != r12) goto L_0x01b2
            goto L_0x01b4
        L_0x01b2:
            r10 = 0
            goto L_0x01b5
        L_0x01b4:
            r10 = 1
        L_0x01b5:
            r4 = 0
            if (r9 == 0) goto L_0x01c0
            float r12 = r1.f11310W
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x01c0
            r12 = 1
            goto L_0x01c1
        L_0x01c0:
            r12 = 0
        L_0x01c1:
            if (r8 == 0) goto L_0x01cb
            float r13 = r1.f11310W
            int r4 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x01cb
            r4 = 1
            goto L_0x01cc
        L_0x01cb:
            r4 = 0
        L_0x01cc:
            if (r11 != 0) goto L_0x01cf
            return
        L_0x01cf:
            android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
            v.e r13 = (v.e) r13
            int r14 = r2.f11573j
            r15 = 1
            if (r14 == r15) goto L_0x01f1
            r15 = 2
            if (r14 == r15) goto L_0x01f1
            if (r9 == 0) goto L_0x01f1
            int r9 = r1.f11344r
            if (r9 != 0) goto L_0x01f1
            if (r8 == 0) goto L_0x01f1
            int r8 = r1.f11345s
            if (r8 == 0) goto L_0x01ea
            goto L_0x01f1
        L_0x01ea:
            r0 = 0
            r3 = -1
            r8 = 0
            r10 = 0
            r15 = 0
            goto L_0x0295
        L_0x01f1:
            boolean r8 = r11 instanceof v.s
            if (r8 == 0) goto L_0x0203
            boolean r8 = r1 instanceof s.g
            if (r8 == 0) goto L_0x0203
            r8 = r1
            s.g r8 = (s.g) r8
            r9 = r11
            v.s r9 = (v.s) r9
            r9.j(r8, r7, r5)
            goto L_0x0206
        L_0x0203:
            r11.measure(r7, r5)
        L_0x0206:
            r1.f11294G = r7
            r1.f11295H = r5
            r8 = 0
            r1.g = r8
            int r8 = r11.getMeasuredWidth()
            int r9 = r11.getMeasuredHeight()
            int r14 = r11.getBaseline()
            int r15 = r1.f11347u
            if (r15 <= 0) goto L_0x0222
            int r15 = java.lang.Math.max(r15, r8)
            goto L_0x0223
        L_0x0222:
            r15 = r8
        L_0x0223:
            int r0 = r1.f11348v
            if (r0 <= 0) goto L_0x022b
            int r15 = java.lang.Math.min(r0, r15)
        L_0x022b:
            int r0 = r1.f11350x
            if (r0 <= 0) goto L_0x0236
            int r0 = java.lang.Math.max(r0, r9)
            r16 = r5
            goto L_0x0239
        L_0x0236:
            r16 = r5
            r0 = r9
        L_0x0239:
            int r5 = r1.f11351y
            if (r5 <= 0) goto L_0x0241
            int r0 = java.lang.Math.min(r5, r0)
        L_0x0241:
            int r3 = r3.f4845r
            r5 = 1
            boolean r3 = s.j.c(r3, r5)
            if (r3 != 0) goto L_0x0262
            r3 = 1056964608(0x3f000000, float:0.5)
            if (r12 == 0) goto L_0x0258
            if (r6 == 0) goto L_0x0258
            float r4 = r1.f11310W
            float r5 = (float) r0
            float r5 = r5 * r4
            float r5 = r5 + r3
            int r3 = (int) r5
            r15 = r3
            goto L_0x0262
        L_0x0258:
            if (r4 == 0) goto L_0x0262
            if (r10 == 0) goto L_0x0262
            float r0 = r1.f11310W
            float r4 = (float) r15
            float r4 = r4 / r0
            float r4 = r4 + r3
            int r0 = (int) r4
        L_0x0262:
            if (r8 != r15) goto L_0x026b
            if (r9 == r0) goto L_0x0267
            goto L_0x026b
        L_0x0267:
            r8 = r14
            r3 = -1
            r10 = 0
            goto L_0x0295
        L_0x026b:
            r3 = 1073741824(0x40000000, float:2.0)
            if (r8 == r15) goto L_0x0273
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r3)
        L_0x0273:
            if (r9 == r0) goto L_0x027a
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L_0x027c
        L_0x027a:
            r5 = r16
        L_0x027c:
            r11.measure(r7, r5)
            r1.f11294G = r7
            r1.f11295H = r5
            r10 = 0
            r1.g = r10
            int r8 = r11.getMeasuredWidth()
            int r0 = r11.getMeasuredHeight()
            int r3 = r11.getBaseline()
            r15 = r8
            r8 = r3
            r3 = -1
        L_0x0295:
            if (r8 == r3) goto L_0x0299
            r3 = 1
            goto L_0x029a
        L_0x0299:
            r3 = r10
        L_0x029a:
            int r4 = r2.f11569c
            if (r15 != r4) goto L_0x02a5
            int r4 = r2.d
            if (r0 == r4) goto L_0x02a3
            goto L_0x02a5
        L_0x02a3:
            r5 = r10
            goto L_0x02a6
        L_0x02a5:
            r5 = 1
        L_0x02a6:
            r2.f11572i = r5
            boolean r4 = r13.f11990c0
            if (r4 == 0) goto L_0x02ae
            r10 = 1
            goto L_0x02af
        L_0x02ae:
            r10 = r3
        L_0x02af:
            if (r10 == 0) goto L_0x02bb
            r3 = -1
            if (r8 == r3) goto L_0x02bb
            int r1 = r1.f11315a0
            if (r1 == r8) goto L_0x02bb
            r1 = 1
            r2.f11572i = r1
        L_0x02bb:
            r2.f11570e = r15
            r2.f11571f = r0
            r2.h = r10
            r2.g = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.f.b(s.d, t.b):void");
    }
}
