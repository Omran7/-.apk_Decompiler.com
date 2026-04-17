package com.google.android.material.sidesheet;

import I1.b;
import K.O;
import U.e;
import Y1.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.common.api.internal.C0370y;
import com.mtma.criminal.city.utils.C0449t;
import d2.C0463b;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import o3.d;
import s2.g;
import s2.k;
import t2.C1006b;
import x.C1089a;
import x.C1092d;

public class SideSheetBehavior<V extends View> extends C1089a {

    /* renamed from: a  reason: collision with root package name */
    public b f6484a;

    /* renamed from: b  reason: collision with root package name */
    public final g f6485b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f6486c;
    public final k d;

    /* renamed from: e  reason: collision with root package name */
    public final C0370y f6487e = new C0370y(this);

    /* renamed from: f  reason: collision with root package name */
    public final float f6488f;
    public final boolean g = true;
    public int h = 5;

    /* renamed from: i  reason: collision with root package name */
    public e f6489i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f6490j;

    /* renamed from: k  reason: collision with root package name */
    public final float f6491k = 0.1f;

    /* renamed from: l  reason: collision with root package name */
    public int f6492l;

    /* renamed from: m  reason: collision with root package name */
    public int f6493m;

    /* renamed from: n  reason: collision with root package name */
    public int f6494n;

    /* renamed from: o  reason: collision with root package name */
    public int f6495o;

    /* renamed from: p  reason: collision with root package name */
    public WeakReference f6496p;

    /* renamed from: q  reason: collision with root package name */
    public WeakReference f6497q;

    /* renamed from: r  reason: collision with root package name */
    public final int f6498r = -1;

    /* renamed from: s  reason: collision with root package name */
    public VelocityTracker f6499s;

    /* renamed from: t  reason: collision with root package name */
    public int f6500t;

    /* renamed from: u  reason: collision with root package name */
    public final LinkedHashSet f6501u = new LinkedHashSet();

    /* renamed from: v  reason: collision with root package name */
    public final C0463b f6502v = new C0463b(this, 1);

    public SideSheetBehavior() {
    }

    public final void c(C1092d dVar) {
        this.f6496p = null;
        this.f6489i = null;
    }

    public final void e() {
        this.f6496p = null;
        this.f6489i = null;
    }

    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        e eVar;
        VelocityTracker velocityTracker;
        if ((view.isShown() || O.d(view) != null) && this.g) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0 && (velocityTracker = this.f6499s) != null) {
                velocityTracker.recycle();
                this.f6499s = null;
            }
            if (this.f6499s == null) {
                this.f6499s = VelocityTracker.obtain();
            }
            this.f6499s.addMovement(motionEvent);
            if (actionMasked == 0) {
                this.f6500t = (int) motionEvent.getX();
            } else if ((actionMasked == 1 || actionMasked == 3) && this.f6490j) {
                this.f6490j = false;
                return false;
            }
            if (this.f6490j || (eVar = this.f6489i) == null || !eVar.p(motionEvent)) {
                return false;
            }
            return true;
        }
        this.f6490j = true;
        return false;
    }

    /* JADX WARNING: type inference failed for: r3v18, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: type inference failed for: r3v26, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout r11, android.view.View r12, int r13) {
        /*
            r10 = this;
            r0 = 0
            r1 = 1
            s2.g r2 = r10.f6485b
            java.util.WeakHashMap r3 = K.O.f1352a
            boolean r3 = r11.getFitsSystemWindows()
            if (r3 == 0) goto L_0x0015
            boolean r3 = r12.getFitsSystemWindows()
            if (r3 != 0) goto L_0x0015
            r12.setFitsSystemWindows(r1)
        L_0x0015:
            java.lang.ref.WeakReference r3 = r10.f6496p
            r4 = 5
            r5 = 0
            if (r3 != 0) goto L_0x00ac
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r12)
            r10.f6496p = r3
            android.content.Context r3 = r12.getContext()
            r6 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.Interpolator r6 = M.a.b(r5, r5, r5, r6)
            r7 = 2130903939(0x7f030383, float:1.741471E38)
            K1.e.o0(r3, r7, r6)
            r6 = 2130903922(0x7f030372, float:1.7414676E38)
            r7 = 300(0x12c, float:4.2E-43)
            K1.e.n0(r6, r7, r3)
            r6 = 2130903927(0x7f030377, float:1.7414686E38)
            r7 = 150(0x96, float:2.1E-43)
            K1.e.n0(r6, r7, r3)
            r6 = 2130903926(0x7f030376, float:1.7414684E38)
            r7 = 100
            K1.e.n0(r6, r7, r3)
            android.content.res.Resources r3 = r12.getResources()
            r6 = 2131099827(0x7f0600b3, float:1.7812018E38)
            r3.getDimension(r6)
            r6 = 2131099826(0x7f0600b2, float:1.7812016E38)
            r3.getDimension(r6)
            r6 = 2131099828(0x7f0600b4, float:1.781202E38)
            r3.getDimension(r6)
            if (r2 == 0) goto L_0x0075
            r12.setBackground(r2)
            float r3 = r10.f6488f
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x0071
            float r3 = K.D.i(r12)
        L_0x0071:
            r2.i(r3)
            goto L_0x007c
        L_0x0075:
            android.content.res.ColorStateList r3 = r10.f6486c
            if (r3 == 0) goto L_0x007c
            K.D.q(r12, r3)
        L_0x007c:
            int r3 = r10.h
            if (r3 != r4) goto L_0x0082
            r3 = 4
            goto L_0x0083
        L_0x0082:
            r3 = r0
        L_0x0083:
            int r6 = r12.getVisibility()
            if (r6 == r3) goto L_0x008c
            r12.setVisibility(r3)
        L_0x008c:
            r10.u()
            int r3 = r12.getImportantForAccessibility()
            if (r3 != 0) goto L_0x0098
            r12.setImportantForAccessibility(r1)
        L_0x0098:
            java.lang.CharSequence r3 = K.O.d(r12)
            if (r3 != 0) goto L_0x00ac
            android.content.res.Resources r3 = r12.getResources()
            r6 = 2131888781(0x7f120a8d, float:1.9412207E38)
            java.lang.String r3 = r3.getString(r6)
            K.O.m(r12, r3)
        L_0x00ac:
            android.view.ViewGroup$LayoutParams r3 = r12.getLayoutParams()
            x.d r3 = (x.C1092d) r3
            int r3 = r3.f12493c
            int r3 = android.view.Gravity.getAbsoluteGravity(r3, r13)
            r6 = 3
            if (r3 != r6) goto L_0x00bd
            r3 = r1
            goto L_0x00be
        L_0x00bd:
            r3 = r0
        L_0x00be:
            I1.b r7 = r10.f6484a
            if (r7 == 0) goto L_0x00c8
            int r7 = r7.c0()
            if (r7 == r3) goto L_0x015c
        L_0x00c8:
            s2.k r7 = r10.d
            r8 = 0
            if (r3 != 0) goto L_0x0114
            t2.a r3 = new t2.a
            r3.<init>(r10, r1)
            r10.f6484a = r3
            if (r7 == 0) goto L_0x015c
            java.lang.ref.WeakReference r3 = r10.f6496p
            if (r3 == 0) goto L_0x00f1
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L_0x00f1
            android.view.ViewGroup$LayoutParams r9 = r3.getLayoutParams()
            boolean r9 = r9 instanceof x.C1092d
            if (r9 == 0) goto L_0x00f1
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            r8 = r3
            x.d r8 = (x.C1092d) r8
        L_0x00f1:
            if (r8 == 0) goto L_0x00f8
            int r3 = r8.rightMargin
            if (r3 <= 0) goto L_0x00f8
            goto L_0x015c
        L_0x00f8:
            s2.j r3 = r7.e()
            s2.a r7 = new s2.a
            r7.<init>(r5)
            r3.f11480f = r7
            s2.a r7 = new s2.a
            r7.<init>(r5)
            r3.g = r7
            s2.k r3 = r3.a()
            if (r2 == 0) goto L_0x015c
            r2.setShapeAppearanceModel(r3)
            goto L_0x015c
        L_0x0114:
            if (r3 != r1) goto L_0x01ff
            t2.a r3 = new t2.a
            r3.<init>(r10, r0)
            r10.f6484a = r3
            if (r7 == 0) goto L_0x015c
            java.lang.ref.WeakReference r3 = r10.f6496p
            if (r3 == 0) goto L_0x013a
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L_0x013a
            android.view.ViewGroup$LayoutParams r9 = r3.getLayoutParams()
            boolean r9 = r9 instanceof x.C1092d
            if (r9 == 0) goto L_0x013a
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            r8 = r3
            x.d r8 = (x.C1092d) r8
        L_0x013a:
            if (r8 == 0) goto L_0x0141
            int r3 = r8.leftMargin
            if (r3 <= 0) goto L_0x0141
            goto L_0x015c
        L_0x0141:
            s2.j r3 = r7.e()
            s2.a r7 = new s2.a
            r7.<init>(r5)
            r3.f11479e = r7
            s2.a r7 = new s2.a
            r7.<init>(r5)
            r3.h = r7
            s2.k r3 = r3.a()
            if (r2 == 0) goto L_0x015c
            r2.setShapeAppearanceModel(r3)
        L_0x015c:
            U.e r2 = r10.f6489i
            if (r2 != 0) goto L_0x016d
            U.e r2 = new U.e
            android.content.Context r3 = r11.getContext()
            d2.b r5 = r10.f6502v
            r2.<init>(r3, r11, r5)
            r10.f6489i = r2
        L_0x016d:
            I1.b r2 = r10.f6484a
            int r2 = r2.S(r12)
            r11.q(r12, r13)
            int r13 = r11.getWidth()
            r10.f6493m = r13
            I1.b r13 = r10.f6484a
            int r13 = r13.W(r11)
            r10.f6494n = r13
            int r13 = r12.getWidth()
            r10.f6492l = r13
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
            if (r13 == 0) goto L_0x0199
            I1.b r3 = r10.f6484a
            int r13 = r3.k(r13)
            goto L_0x019a
        L_0x0199:
            r13 = r0
        L_0x019a:
            r10.f6495o = r13
            int r13 = r10.h
            if (r13 == r1) goto L_0x01c4
            r3 = 2
            if (r13 == r3) goto L_0x01c4
            if (r13 == r6) goto L_0x01cc
            if (r13 != r4) goto L_0x01ae
            I1.b r13 = r10.f6484a
            int r0 = r13.M()
            goto L_0x01cc
        L_0x01ae:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Unexpected value: "
            r12.<init>(r13)
            int r13 = r10.h
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x01c4:
            I1.b r13 = r10.f6484a
            int r13 = r13.S(r12)
            int r0 = r2 - r13
        L_0x01cc:
            r12.offsetLeftAndRight(r0)
            java.lang.ref.WeakReference r12 = r10.f6497q
            if (r12 != 0) goto L_0x01e5
            int r12 = r10.f6498r
            r13 = -1
            if (r12 == r13) goto L_0x01e5
            android.view.View r11 = r11.findViewById(r12)
            if (r11 == 0) goto L_0x01e5
            java.lang.ref.WeakReference r12 = new java.lang.ref.WeakReference
            r12.<init>(r11)
            r10.f6497q = r12
        L_0x01e5:
            java.util.LinkedHashSet r11 = r10.f6501u
            java.util.Iterator r11 = r11.iterator()
        L_0x01eb:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x01fe
            java.lang.Object r12 = r11.next()
            if (r12 != 0) goto L_0x01f8
            goto L_0x01eb
        L_0x01f8:
            java.lang.ClassCastException r11 = new java.lang.ClassCastException
            r11.<init>()
            throw r11
        L_0x01fe:
            return r1
        L_0x01ff:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Invalid sheet edge position value: "
            java.lang.String r13 = ". Must be 0 or 1."
            java.lang.String r12 = h0.C0552a.k(r3, r12, r13)
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.g(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i2, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i6, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    public final void m(View view, Parcelable parcelable) {
        int i2 = ((C1006b) parcelable).f11747c;
        if (i2 == 1 || i2 == 2) {
            i2 = 5;
        }
        this.h = i2;
    }

    public final Parcelable n(View view) {
        return new C1006b(View.BaseSavedState.EMPTY_STATE, this);
    }

    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.h == 1 && actionMasked == 0) {
            return true;
        }
        if (s()) {
            this.f6489i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f6499s) != null) {
            velocityTracker.recycle();
            this.f6499s = null;
        }
        if (this.f6499s == null) {
            this.f6499s = VelocityTracker.obtain();
        }
        this.f6499s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.f6490j && s()) {
            float abs = Math.abs(((float) this.f6500t) - motionEvent.getX());
            e eVar = this.f6489i;
            if (abs > ((float) eVar.f3654b)) {
                eVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f6490j;
    }

    public final void r(int i2) {
        View view;
        int i5;
        if (this.h != i2) {
            this.h = i2;
            WeakReference weakReference = this.f6496p;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                if (this.h == 5) {
                    i5 = 4;
                } else {
                    i5 = 0;
                }
                if (view.getVisibility() != i5) {
                    view.setVisibility(i5);
                }
                Iterator it2 = this.f6501u.iterator();
                if (!it2.hasNext()) {
                    u();
                    return;
                }
                throw d.e(it2);
            }
        }
    }

    public final boolean s() {
        if (this.f6489i == null || (!this.g && this.h != 1)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r1.o(r0, r3.getTop()) != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        if (r3 != false) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L_0x0019
            r0 = 5
            if (r4 != r0) goto L_0x000d
            I1.b r0 = r2.f6484a
            int r0 = r0.M()
            goto L_0x001f
        L_0x000d:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Invalid state to get outer edge offset: "
            java.lang.String r4 = com.google.android.gms.internal.measurement.a.f(r4, r5)
            r3.<init>(r4)
            throw r3
        L_0x0019:
            I1.b r0 = r2.f6484a
            int r0 = r0.H()
        L_0x001f:
            U.e r1 = r2.f6489i
            if (r1 == 0) goto L_0x0057
            if (r5 == 0) goto L_0x0030
            int r3 = r3.getTop()
            boolean r3 = r1.o(r0, r3)
            if (r3 == 0) goto L_0x0057
            goto L_0x004d
        L_0x0030:
            int r5 = r3.getTop()
            r1.f3667r = r3
            r3 = -1
            r1.f3655c = r3
            r3 = 0
            boolean r3 = r1.h(r0, r5, r3, r3)
            if (r3 != 0) goto L_0x004b
            int r5 = r1.f3653a
            if (r5 != 0) goto L_0x004b
            android.view.View r5 = r1.f3667r
            if (r5 == 0) goto L_0x004b
            r5 = 0
            r1.f3667r = r5
        L_0x004b:
            if (r3 == 0) goto L_0x0057
        L_0x004d:
            r3 = 2
            r2.r(r3)
            com.google.android.gms.common.api.internal.y r3 = r2.f6487e
            r3.c(r4)
            goto L_0x005a
        L_0x0057:
            r2.r(r4)
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.t(android.view.View, int, boolean):void");
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.f6496p;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            O.i(view, 262144);
            O.g(view, 0);
            O.i(view, 1048576);
            O.g(view, 0);
            if (this.h != 5) {
                O.j(view, L.e.f1694j, new C0449t(this, 5, 3));
            }
            if (this.h != 3) {
                O.j(view, L.e.h, new C0449t(this, 3, 3));
            }
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f4266w);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f6486c = com.bumptech.glide.d.a0(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.d = k.b(context, attributeSet, 0, 2131952595).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f6498r = resourceId;
            WeakReference weakReference = this.f6497q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f6497q = null;
            WeakReference weakReference2 = this.f6496p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = O.f1352a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        k kVar = this.d;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f6485b = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f6486c;
            if (colorStateList != null) {
                this.f6485b.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f6485b.setTint(typedValue.data);
            }
        }
        this.f6488f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
