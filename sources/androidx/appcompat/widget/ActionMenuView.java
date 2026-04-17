package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.fragment.app.D;
import com.google.android.gms.common.api.f;
import j.j;
import j.k;
import j.m;
import j.w;
import j.y;
import j4.p0;
import k.C0710f;
import k.C0716i;
import k.C0718j;
import k.C0720k;
import k.C0722l;
import k.C0724m;
import k.C0726n;
import k.C0747x0;
import k.C0749y0;
import k.i1;

public class ActionMenuView extends C0749y0 implements j, y {

    /* renamed from: A  reason: collision with root package name */
    public int f4766A = 0;

    /* renamed from: B  reason: collision with root package name */
    public boolean f4767B;

    /* renamed from: C  reason: collision with root package name */
    public C0718j f4768C;

    /* renamed from: D  reason: collision with root package name */
    public p0 f4769D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f4770E;
    public int F;

    /* renamed from: G  reason: collision with root package name */
    public final int f4771G;

    /* renamed from: H  reason: collision with root package name */
    public final int f4772H;

    /* renamed from: I  reason: collision with root package name */
    public C0726n f4773I;

    /* renamed from: y  reason: collision with root package name */
    public k f4774y;

    /* renamed from: z  reason: collision with root package name */
    public Context f4775z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f6 = context.getResources().getDisplayMetrics().density;
        this.f4771G = (int) (56.0f * f6);
        this.f4772H = (int) (f6 * 4.0f);
        this.f4775z = context;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [k.l, android.widget.LinearLayout$LayoutParams] */
    public static C0722l j() {
        ? layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.f9339a = false;
        layoutParams.gravity = 16;
        return layoutParams;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.widget.LinearLayout$LayoutParams] */
    /* JADX WARNING: type inference failed for: r0v3, types: [k.l, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static k.C0722l k(android.view.ViewGroup.LayoutParams r1) {
        /*
            if (r1 == 0) goto L_0x0020
            boolean r0 = r1 instanceof k.C0722l
            if (r0 == 0) goto L_0x0012
            k.l r0 = new k.l
            k.l r1 = (k.C0722l) r1
            r0.<init>(r1)
            boolean r1 = r1.f9339a
            r0.f9339a = r1
            goto L_0x0017
        L_0x0012:
            k.l r0 = new k.l
            r0.<init>(r1)
        L_0x0017:
            int r1 = r0.gravity
            if (r1 > 0) goto L_0x001f
            r1 = 16
            r0.gravity = r1
        L_0x001f:
            return r0
        L_0x0020:
            k.l r1 = j()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.k(android.view.ViewGroup$LayoutParams):k.l");
    }

    public final void a(k kVar) {
        this.f4774y = kVar;
    }

    public final boolean c(m mVar) {
        return this.f4774y.q(mVar, (w) null, 0);
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0722l;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final /* bridge */ /* synthetic */ C0747x0 f() {
        return j();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, k.x0] */
    public final C0747x0 g(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public Menu getMenu() {
        if (this.f4774y == null) {
            Context context = getContext();
            k kVar = new k(context);
            this.f4774y = kVar;
            kVar.f8729e = new C0724m(this, 0);
            C0718j jVar = new C0718j(context);
            this.f4768C = jVar;
            jVar.f9333u = true;
            jVar.f9334v = true;
            jVar.f9326e = new D(18);
            this.f4774y.b(jVar, this.f4775z);
            C0718j jVar2 = this.f4768C;
            jVar2.f9329q = this;
            this.f4774y = jVar2.f9325c;
        }
        return this.f4774y;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0718j jVar = this.f4768C;
        C0716i iVar = jVar.f9330r;
        if (iVar != null) {
            return iVar.getDrawable();
        }
        if (jVar.f9332t) {
            return jVar.f9331s;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f4766A;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final /* bridge */ /* synthetic */ C0747x0 h(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i2) {
        boolean z3 = false;
        if (i2 == 0) {
            return false;
        }
        View childAt = getChildAt(i2 - 1);
        View childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof C0720k)) {
            z3 = ((C0720k) childAt).a();
        }
        if (i2 <= 0 || !(childAt2 instanceof C0720k)) {
            return z3;
        }
        return z3 | ((C0720k) childAt2).c();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0718j jVar = this.f4768C;
        if (jVar != null) {
            jVar.e();
            if (this.f4768C.f()) {
                this.f4768C.c();
                this.f4768C.l();
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0718j jVar = this.f4768C;
        if (jVar != null) {
            jVar.c();
            C0710f fVar = jVar.f9320C;
            if (fVar != null && fVar.b()) {
                fVar.f8788i.dismiss();
            }
        }
    }

    public final void onLayout(boolean z3, int i2, int i5, int i6, int i7) {
        boolean z4;
        int i8;
        int i9;
        int i10;
        if (!this.f4770E) {
            super.onLayout(z3, i2, i5, i6, i7);
            return;
        }
        int childCount = getChildCount();
        int i11 = (i7 - i5) / 2;
        int dividerWidth = getDividerWidth();
        int i12 = i6 - i2;
        int paddingRight = (i12 - getPaddingRight()) - getPaddingLeft();
        boolean z5 = i1.f9315a;
        if (getLayoutDirection() == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                C0722l lVar = (C0722l) childAt.getLayoutParams();
                if (lVar.f9339a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i15)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z4) {
                        i9 = getPaddingLeft() + lVar.leftMargin;
                        i10 = i9 + measuredWidth;
                    } else {
                        i10 = (getWidth() - getPaddingRight()) - lVar.rightMargin;
                        i9 = i10 - measuredWidth;
                    }
                    int i16 = i11 - (measuredHeight / 2);
                    childAt.layout(i9, i16, i10, measuredHeight + i16);
                    paddingRight -= measuredWidth;
                    i13 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + lVar.leftMargin) + lVar.rightMargin;
                    l(i15);
                    i14++;
                }
            }
        }
        if (childCount == 1 && i13 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i17 = (i12 / 2) - (measuredWidth2 / 2);
            int i18 = i11 - (measuredHeight2 / 2);
            childAt2.layout(i17, i18, measuredWidth2 + i17, measuredHeight2 + i18);
            return;
        }
        int i19 = i14 - (i13 ^ 1);
        if (i19 > 0) {
            i8 = paddingRight / i19;
        } else {
            i8 = 0;
        }
        int max = Math.max(0, i8);
        if (z4) {
            int width = getWidth() - getPaddingRight();
            for (int i20 = 0; i20 < childCount; i20++) {
                View childAt3 = getChildAt(i20);
                C0722l lVar2 = (C0722l) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !lVar2.f9339a) {
                    int i21 = width - lVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i22 = i11 - (measuredHeight3 / 2);
                    childAt3.layout(i21 - measuredWidth3, i22, i21, measuredHeight3 + i22);
                    width = i21 - ((measuredWidth3 + lVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i23 = 0; i23 < childCount; i23++) {
            View childAt4 = getChildAt(i23);
            C0722l lVar3 = (C0722l) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !lVar3.f9339a) {
                int i24 = paddingLeft + lVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i25 = i11 - (measuredHeight4 / 2);
                childAt4.layout(i24, i25, i24 + measuredWidth4, measuredHeight4 + i25);
                paddingLeft = measuredWidth4 + lVar3.rightMargin + max + i24;
            }
        }
    }

    public final void onMeasure(int i2, int i5) {
        boolean z3;
        int i6;
        boolean z4;
        boolean z5;
        boolean z6;
        int i7;
        boolean z7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z8;
        int i12;
        int i13;
        boolean z9;
        int i14;
        ActionMenuItemView actionMenuItemView;
        boolean z10;
        int i15;
        boolean z11;
        k kVar;
        boolean z12 = this.f4770E;
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f4770E = z3;
        if (z12 != z3) {
            this.F = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (!(!this.f4770E || (kVar = this.f4774y) == null || size == this.F)) {
            this.F = size;
            kVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.f4770E || childCount <= 0) {
            int i16 = i5;
            for (int i17 = 0; i17 < childCount; i17++) {
                C0722l lVar = (C0722l) getChildAt(i17).getLayoutParams();
                lVar.rightMargin = 0;
                lVar.leftMargin = 0;
            }
            super.onMeasure(i2, i5);
            return;
        }
        int mode = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i2);
        int size3 = View.MeasureSpec.getSize(i5);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, paddingBottom, -2);
        int i18 = size2 - paddingRight;
        int i19 = this.f4771G;
        int i20 = i18 / i19;
        int i21 = i18 % i19;
        if (i20 == 0) {
            setMeasuredDimension(i18, 0);
            return;
        }
        int i22 = (i21 / i20) + i19;
        int childCount2 = getChildCount();
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        boolean z13 = false;
        int i27 = 0;
        long j6 = 0;
        while (true) {
            i6 = this.f4772H;
            if (i26 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i26);
            int i28 = size3;
            int i29 = i18;
            if (childAt.getVisibility() == 8) {
                i12 = mode;
                i13 = paddingBottom;
            } else {
                boolean z14 = childAt instanceof ActionMenuItemView;
                int i30 = i24 + 1;
                if (z14) {
                    childAt.setPadding(i6, 0, i6, 0);
                }
                C0722l lVar2 = (C0722l) childAt.getLayoutParams();
                lVar2.f9343f = false;
                lVar2.f9341c = 0;
                lVar2.f9340b = 0;
                lVar2.d = false;
                lVar2.leftMargin = 0;
                lVar2.rightMargin = 0;
                if (!z14 || TextUtils.isEmpty(((ActionMenuItemView) childAt).getText())) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                lVar2.f9342e = z9;
                if (lVar2.f9339a) {
                    i14 = 1;
                } else {
                    i14 = i20;
                }
                int i31 = i30;
                C0722l lVar3 = (C0722l) childAt.getLayoutParams();
                i12 = mode;
                i13 = paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                if (z14) {
                    actionMenuItemView = (ActionMenuItemView) childAt;
                } else {
                    actionMenuItemView = null;
                }
                if (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (i14 <= 0 || (z10 && i14 < 2)) {
                    i15 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i14 * i22, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i15 = measuredWidth / i22;
                    if (measuredWidth % i22 != 0) {
                        i15++;
                    }
                    if (z10 && i15 < 2) {
                        i15 = 2;
                    }
                }
                if (lVar3.f9339a || !z10) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                lVar3.d = z11;
                lVar3.f9340b = i15;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i15 * i22, 1073741824), makeMeasureSpec);
                i25 = Math.max(i25, i15);
                if (lVar2.d) {
                    i27++;
                }
                if (lVar2.f9339a) {
                    z13 = true;
                }
                i20 -= i15;
                i23 = Math.max(i23, childAt.getMeasuredHeight());
                if (i15 == 1) {
                    j6 |= (long) (1 << i26);
                }
                i24 = i31;
            }
            i26++;
            size3 = i28;
            i18 = i29;
            paddingBottom = i13;
            mode = i12;
        }
        int i32 = mode;
        int i33 = i18;
        int i34 = size3;
        if (!z13 || i24 != 2) {
            z4 = false;
        } else {
            z4 = true;
        }
        boolean z15 = false;
        while (true) {
            if (i27 <= 0 || i20 <= 0) {
                z5 = z15;
            } else {
                int i35 = f.API_PRIORITY_OTHER;
                int i36 = 0;
                int i37 = 0;
                long j7 = 0;
                while (i37 < childCount2) {
                    C0722l lVar4 = (C0722l) getChildAt(i37).getLayoutParams();
                    boolean z16 = z15;
                    if (lVar4.d) {
                        int i38 = lVar4.f9340b;
                        if (i38 < i35) {
                            j7 = 1 << i37;
                            i35 = i38;
                            i36 = 1;
                        } else if (i38 == i35) {
                            j7 |= 1 << i37;
                            i36++;
                        }
                    }
                    i37++;
                    z15 = z16;
                }
                z5 = z15;
                j6 |= j7;
                if (i36 > i20) {
                    break;
                }
                int i39 = i35 + 1;
                int i40 = 0;
                while (i40 < childCount2) {
                    View childAt2 = getChildAt(i40);
                    C0722l lVar5 = (C0722l) childAt2.getLayoutParams();
                    int i41 = i23;
                    int i42 = childMeasureSpec;
                    int i43 = childCount2;
                    long j8 = (long) (1 << i40);
                    if ((j7 & j8) != 0) {
                        if (!z4 || !lVar5.f9342e) {
                            z8 = true;
                        } else {
                            z8 = true;
                            if (i20 == 1) {
                                childAt2.setPadding(i6 + i22, 0, i6, 0);
                            }
                        }
                        lVar5.f9340b += z8 ? 1 : 0;
                        lVar5.f9343f = z8;
                        i20--;
                    } else if (lVar5.f9340b == i39) {
                        j6 |= j8;
                    }
                    i40++;
                    childMeasureSpec = i42;
                    i23 = i41;
                    childCount2 = i43;
                }
                z15 = true;
            }
        }
        z5 = z15;
        int i44 = i23;
        int i45 = childMeasureSpec;
        int i46 = childCount2;
        if (z13 || i24 != 1) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (i20 <= 0 || j6 == 0 || (i20 >= i24 - 1 && !z6 && i25 <= 1)) {
            i7 = i46;
            z7 = z5;
        } else {
            float bitCount = (float) Long.bitCount(j6);
            if (!z6) {
                if ((j6 & 1) != 0 && !((C0722l) getChildAt(0).getLayoutParams()).f9342e) {
                    bitCount -= 0.5f;
                }
                int i47 = i46 - 1;
                if ((j6 & ((long) (1 << i47))) != 0 && !((C0722l) getChildAt(i47).getLayoutParams()).f9342e) {
                    bitCount -= 0.5f;
                }
            }
            if (bitCount > 0.0f) {
                i11 = (int) (((float) (i20 * i22)) / bitCount);
            } else {
                i11 = 0;
            }
            boolean z17 = z5;
            i7 = i46;
            for (int i48 = 0; i48 < i7; i48++) {
                if ((j6 & ((long) (1 << i48))) != 0) {
                    View childAt3 = getChildAt(i48);
                    C0722l lVar6 = (C0722l) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        lVar6.f9341c = i11;
                        lVar6.f9343f = true;
                        if (i48 == 0 && !lVar6.f9342e) {
                            lVar6.leftMargin = (-i11) / 2;
                        }
                        z17 = true;
                    } else {
                        if (lVar6.f9339a) {
                            lVar6.f9341c = i11;
                            lVar6.f9343f = true;
                            lVar6.rightMargin = (-i11) / 2;
                            z17 = true;
                        } else {
                            if (i48 != 0) {
                                lVar6.leftMargin = i11 / 2;
                            }
                            if (i48 != i7 - 1) {
                                lVar6.rightMargin = i11 / 2;
                            }
                        }
                    }
                }
            }
            z7 = z17;
        }
        if (z7) {
            int i49 = 0;
            while (i49 < i7) {
                View childAt4 = getChildAt(i49);
                C0722l lVar7 = (C0722l) childAt4.getLayoutParams();
                if (!lVar7.f9343f) {
                    i10 = i45;
                } else {
                    i10 = i45;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((lVar7.f9340b * i22) + lVar7.f9341c, 1073741824), i10);
                }
                i49++;
                i45 = i10;
            }
        }
        if (i32 != 1073741824) {
            i9 = i33;
            i8 = i44;
        } else {
            i8 = i34;
            i9 = i33;
        }
        setMeasuredDimension(i9, i8);
    }

    public void setExpandedActionViewsExclusive(boolean z3) {
        this.f4768C.f9338z = z3;
    }

    public void setOnMenuItemClickListener(C0726n nVar) {
        this.f4773I = nVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0718j jVar = this.f4768C;
        C0716i iVar = jVar.f9330r;
        if (iVar != null) {
            iVar.setImageDrawable(drawable);
            return;
        }
        jVar.f9332t = true;
        jVar.f9331s = drawable;
    }

    public void setOverflowReserved(boolean z3) {
        this.f4767B = z3;
    }

    public void setPopupTheme(int i2) {
        if (this.f4766A != i2) {
            this.f4766A = i2;
            if (i2 == 0) {
                this.f4775z = getContext();
            } else {
                this.f4775z = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setPresenter(C0718j jVar) {
        this.f4768C = jVar;
        jVar.f9329q = this;
        this.f4774y = jVar.f9325c;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }
}
