package androidx.appcompat.widget;

import B0.C0009h;
import K.O;
import K4.m;
import R2.b;
import T.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.B;
import c1.i;
import com.mtma.criminal.city.R;
import e.C0476a;
import i.h;
import j.k;
import j4.p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k.C0675M0;
import k.C0688T0;
import k.C0690U0;
import k.C0692V0;
import k.C0694W0;
import k.C0696X0;
import k.C0698Y0;
import k.C0703b0;
import k.C0718j;
import k.C0723l0;
import k.C0724m;
import k.C0737s0;
import k.C0748y;
import k.C0750z;
import k.Z0;
import k.a1;
import k.i1;

public class Toolbar extends ViewGroup {

    /* renamed from: A  reason: collision with root package name */
    public int f4790A;

    /* renamed from: B  reason: collision with root package name */
    public int f4791B;

    /* renamed from: C  reason: collision with root package name */
    public C0675M0 f4792C;

    /* renamed from: D  reason: collision with root package name */
    public int f4793D;

    /* renamed from: E  reason: collision with root package name */
    public int f4794E;
    public final int F;

    /* renamed from: G  reason: collision with root package name */
    public CharSequence f4795G;

    /* renamed from: H  reason: collision with root package name */
    public CharSequence f4796H;

    /* renamed from: I  reason: collision with root package name */
    public ColorStateList f4797I;

    /* renamed from: J  reason: collision with root package name */
    public ColorStateList f4798J;

    /* renamed from: K  reason: collision with root package name */
    public boolean f4799K;

    /* renamed from: L  reason: collision with root package name */
    public boolean f4800L;

    /* renamed from: M  reason: collision with root package name */
    public final ArrayList f4801M;

    /* renamed from: N  reason: collision with root package name */
    public final ArrayList f4802N;

    /* renamed from: O  reason: collision with root package name */
    public final int[] f4803O;

    /* renamed from: P  reason: collision with root package name */
    public final C0009h f4804P;

    /* renamed from: Q  reason: collision with root package name */
    public ArrayList f4805Q;

    /* renamed from: R  reason: collision with root package name */
    public final C0724m f4806R;

    /* renamed from: S  reason: collision with root package name */
    public a1 f4807S;

    /* renamed from: T  reason: collision with root package name */
    public C0718j f4808T;

    /* renamed from: U  reason: collision with root package name */
    public C0692V0 f4809U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f4810V;

    /* renamed from: W  reason: collision with root package name */
    public OnBackInvokedCallback f4811W;

    /* renamed from: a  reason: collision with root package name */
    public ActionMenuView f4812a;

    /* renamed from: a0  reason: collision with root package name */
    public OnBackInvokedDispatcher f4813a0;

    /* renamed from: b  reason: collision with root package name */
    public C0703b0 f4814b;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f4815b0;

    /* renamed from: c  reason: collision with root package name */
    public C0703b0 f4816c;

    /* renamed from: c0  reason: collision with root package name */
    public final C0737s0 f4817c0;
    public C0748y d;

    /* renamed from: e  reason: collision with root package name */
    public C0750z f4818e;

    /* renamed from: f  reason: collision with root package name */
    public final Drawable f4819f;

    /* renamed from: p  reason: collision with root package name */
    public final CharSequence f4820p;

    /* renamed from: q  reason: collision with root package name */
    public C0748y f4821q;

    /* renamed from: r  reason: collision with root package name */
    public View f4822r;

    /* renamed from: s  reason: collision with root package name */
    public Context f4823s;

    /* renamed from: t  reason: collision with root package name */
    public int f4824t;

    /* renamed from: u  reason: collision with root package name */
    public int f4825u;

    /* renamed from: v  reason: collision with root package name */
    public int f4826v;

    /* renamed from: w  reason: collision with root package name */
    public final int f4827w;

    /* renamed from: x  reason: collision with root package name */
    public final int f4828x;

    /* renamed from: y  reason: collision with root package name */
    public int f4829y;

    /* renamed from: z  reason: collision with root package name */
    public int f4830z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i2 = 0; i2 < menu.size(); i2++) {
            arrayList.add(menu.getItem(i2));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new h(getContext());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.ViewGroup$MarginLayoutParams, k.W0] */
    public static C0694W0 h() {
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.f9241b = 0;
        marginLayoutParams.f9240a = 8388627;
        return marginLayoutParams;
    }

    public static C0694W0 i(ViewGroup.LayoutParams layoutParams) {
        boolean z3 = layoutParams instanceof C0694W0;
        if (z3) {
            C0694W0 w02 = (C0694W0) layoutParams;
            C0694W0 w03 = new C0694W0(w02);
            w03.f9241b = 0;
            w03.f9241b = w02.f9241b;
            return w03;
        } else if (z3) {
            C0694W0 w04 = new C0694W0((C0694W0) layoutParams);
            w04.f9241b = 0;
            return w04;
        } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            C0694W0 w05 = new C0694W0((ViewGroup.LayoutParams) marginLayoutParams);
            w05.f9241b = 0;
            w05.leftMargin = marginLayoutParams.leftMargin;
            w05.topMargin = marginLayoutParams.topMargin;
            w05.rightMargin = marginLayoutParams.rightMargin;
            w05.bottomMargin = marginLayoutParams.bottomMargin;
            return w05;
        } else {
            C0694W0 w06 = new C0694W0(layoutParams);
            w06.f9241b = 0;
            return w06;
        }
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i2, ArrayList arrayList) {
        boolean z3;
        if (getLayoutDirection() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        arrayList.clear();
        if (z3) {
            for (int i5 = childCount - 1; i5 >= 0; i5--) {
                View childAt = getChildAt(i5);
                C0694W0 w02 = (C0694W0) childAt.getLayoutParams();
                if (w02.f9241b == 0 && t(childAt)) {
                    int i6 = w02.f9240a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i6, layoutDirection) & 7;
                    if (!(absoluteGravity2 == 1 || absoluteGravity2 == 3 || absoluteGravity2 == 5)) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt2 = getChildAt(i7);
            C0694W0 w03 = (C0694W0) childAt2.getLayoutParams();
            if (w03.f9241b == 0 && t(childAt2)) {
                int i8 = w03.f9240a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i8, layoutDirection2) & 7;
                if (!(absoluteGravity3 == 1 || absoluteGravity3 == 3 || absoluteGravity3 == 5)) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z3) {
        C0694W0 w02;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            w02 = h();
        } else if (!checkLayoutParams(layoutParams)) {
            w02 = i(layoutParams);
        } else {
            w02 = (C0694W0) layoutParams;
        }
        w02.f9241b = 1;
        if (!z3 || this.f4822r == null) {
            addView(view, w02);
            return;
        }
        view.setLayoutParams(w02);
        this.f4802N.add(view);
    }

    public final void c() {
        if (this.f4821q == null) {
            C0748y yVar = new C0748y(getContext(), (AttributeSet) null, R.attr.toolbarNavigationButtonStyle);
            this.f4821q = yVar;
            yVar.setImageDrawable(this.f4819f);
            this.f4821q.setContentDescription(this.f4820p);
            C0694W0 h = h();
            h.f9240a = (this.f4827w & 112) | 8388611;
            h.f9241b = 2;
            this.f4821q.setLayoutParams(h);
            this.f4821q.setOnClickListener(new m(this, 4));
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!super.checkLayoutParams(layoutParams) || !(layoutParams instanceof C0694W0)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [k.M0, java.lang.Object] */
    public final void d() {
        if (this.f4792C == null) {
            ? obj = new Object();
            obj.f9204a = 0;
            obj.f9205b = 0;
            obj.f9206c = Integer.MIN_VALUE;
            obj.d = Integer.MIN_VALUE;
            obj.f9207e = 0;
            obj.f9208f = 0;
            obj.g = false;
            obj.h = false;
            this.f4792C = obj;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f4812a;
        if (actionMenuView.f4774y == null) {
            k kVar = (k) actionMenuView.getMenu();
            if (this.f4809U == null) {
                this.f4809U = new C0692V0(this);
            }
            this.f4812a.setExpandedActionViewsExclusive(true);
            kVar.b(this.f4809U, this.f4823s);
            u();
        }
    }

    public final void f() {
        if (this.f4812a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), (AttributeSet) null);
            this.f4812a = actionMenuView;
            actionMenuView.setPopupTheme(this.f4824t);
            this.f4812a.setOnMenuItemClickListener(this.f4806R);
            ActionMenuView actionMenuView2 = this.f4812a;
            p0 p0Var = new p0(this, 6);
            actionMenuView2.getClass();
            actionMenuView2.f4769D = p0Var;
            C0694W0 h = h();
            h.f9240a = (this.f4827w & 112) | 8388613;
            this.f4812a.setLayoutParams(h);
            b(this.f4812a, false);
        }
    }

    public final void g() {
        if (this.d == null) {
            this.d = new C0748y(getContext(), (AttributeSet) null, R.attr.toolbarNavigationButtonStyle);
            C0694W0 h = h();
            h.f9240a = (this.f4827w & 112) | 8388611;
            this.d.setLayoutParams(h);
        }
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C0748y yVar = this.f4821q;
        if (yVar != null) {
            return yVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0748y yVar = this.f4821q;
        if (yVar != null) {
            return yVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0675M0 m02 = this.f4792C;
        if (m02 == null) {
            return 0;
        }
        if (m02.g) {
            return m02.f9204a;
        }
        return m02.f9205b;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.f4794E;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        return getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0675M0 m02 = this.f4792C;
        if (m02 != null) {
            return m02.f9204a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0675M0 m02 = this.f4792C;
        if (m02 != null) {
            return m02.f9205b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0675M0 m02 = this.f4792C;
        if (m02 == null) {
            return 0;
        }
        if (m02.g) {
            return m02.f9205b;
        }
        return m02.f9204a;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.f4793D;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        k kVar;
        ActionMenuView actionMenuView = this.f4812a;
        if (actionMenuView == null || (kVar = actionMenuView.f4774y) == null || !kVar.hasVisibleItems()) {
            return getContentInsetEnd();
        }
        return Math.max(getContentInsetEnd(), Math.max(this.f4794E, 0));
    }

    public int getCurrentContentInsetLeft() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f4793D, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        C0750z zVar = this.f4818e;
        if (zVar != null) {
            return zVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0750z zVar = this.f4818e;
        if (zVar != null) {
            return zVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f4812a.getMenu();
    }

    public View getNavButtonView() {
        return this.d;
    }

    public CharSequence getNavigationContentDescription() {
        C0748y yVar = this.d;
        if (yVar != null) {
            return yVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0748y yVar = this.d;
        if (yVar != null) {
            return yVar.getDrawable();
        }
        return null;
    }

    public C0718j getOuterActionMenuPresenter() {
        return this.f4808T;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f4812a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f4823s;
    }

    public int getPopupTheme() {
        return this.f4824t;
    }

    public CharSequence getSubtitle() {
        return this.f4796H;
    }

    public final TextView getSubtitleTextView() {
        return this.f4816c;
    }

    public CharSequence getTitle() {
        return this.f4795G;
    }

    public int getTitleMarginBottom() {
        return this.f4791B;
    }

    public int getTitleMarginEnd() {
        return this.f4830z;
    }

    public int getTitleMarginStart() {
        return this.f4829y;
    }

    public int getTitleMarginTop() {
        return this.f4790A;
    }

    public final TextView getTitleTextView() {
        return this.f4814b;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [k.a1, java.lang.Object] */
    public C0723l0 getWrapper() {
        boolean z3;
        Drawable drawable;
        if (this.f4807S == null) {
            ? obj = new Object();
            obj.f9267n = 0;
            obj.f9257a = this;
            obj.h = getTitle();
            obj.f9262i = getSubtitle();
            if (obj.h != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            obj.g = z3;
            obj.f9261f = getNavigationIcon();
            String str = null;
            i A6 = i.A(getContext(), (AttributeSet) null, C0476a.f7532a, R.attr.actionBarStyle);
            obj.f9268o = A6.n(15);
            TypedArray typedArray = (TypedArray) A6.f5606c;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                obj.g = true;
                obj.h = text;
                if ((obj.f9258b & 8) != 0) {
                    Toolbar toolbar = obj.f9257a;
                    toolbar.setTitle(text);
                    if (obj.g) {
                        O.m(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                obj.f9262i = text2;
                if ((obj.f9258b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable n2 = A6.n(20);
            if (n2 != null) {
                obj.f9260e = n2;
                obj.c();
            }
            Drawable n6 = A6.n(17);
            if (n6 != null) {
                obj.d = n6;
                obj.c();
            }
            if (obj.f9261f == null && (drawable = obj.f9268o) != null) {
                obj.f9261f = drawable;
                int i2 = obj.f9258b & 4;
                Toolbar toolbar2 = obj.f9257a;
                if (i2 != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            obj.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, this, false);
                View view = obj.f9259c;
                if (!(view == null || (obj.f9258b & 16) == 0)) {
                    removeView(view);
                }
                obj.f9259c = inflate;
                if (!(inflate == null || (obj.f9258b & 16) == 0)) {
                    addView(inflate);
                }
                obj.a(obj.f9258b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.f4792C.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f4825u = resourceId2;
                C0703b0 b0Var = this.f4814b;
                if (b0Var != null) {
                    b0Var.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f4826v = resourceId3;
                C0703b0 b0Var2 = this.f4816c;
                if (b0Var2 != null) {
                    b0Var2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            A6.G();
            if (R.string.abc_action_bar_up_description != obj.f9267n) {
                obj.f9267n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i5 = obj.f9267n;
                    if (i5 != 0) {
                        str = getContext().getString(i5);
                    }
                    obj.f9263j = str;
                    obj.b();
                }
            }
            obj.f9263j = getNavigationContentDescription();
            setNavigationOnClickListener(new Z0(obj));
            this.f4807S = obj;
        }
        return this.f4807S;
    }

    public final int j(View view, int i2) {
        int i5;
        C0694W0 w02 = (C0694W0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 > 0) {
            i5 = (measuredHeight - i2) / 2;
        } else {
            i5 = 0;
        }
        int i6 = w02.f9240a & 112;
        if (!(i6 == 16 || i6 == 48 || i6 == 80)) {
            i6 = this.F & 112;
        }
        if (i6 == 48) {
            return getPaddingTop() - i5;
        }
        if (i6 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - w02.bottomMargin) - i5;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i7 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i8 = w02.topMargin;
        if (i7 < i8) {
            i7 = i8;
        } else {
            int i9 = (((height - paddingBottom) - measuredHeight) - i7) - paddingTop;
            int i10 = w02.bottomMargin;
            if (i9 < i10) {
                i7 = Math.max(0, i7 - (i10 - i9));
            }
        }
        return paddingTop + i7;
    }

    public void m(int i2) {
        getMenuInflater().inflate(i2, getMenu());
    }

    public final void n() {
        Iterator it2 = this.f4805Q.iterator();
        while (it2.hasNext()) {
            getMenu().removeItem(((MenuItem) it2.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it3 = ((CopyOnWriteArrayList) this.f4804P.f229c).iterator();
        while (it3.hasNext()) {
            ((B) it3.next()).f4973a.j();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f4805Q = currentMenuItems2;
    }

    public final boolean o(View view) {
        if (view.getParent() == this || this.f4802N.contains(view)) {
            return true;
        }
        return false;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        u();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f4817c0);
        u();
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f4800L = false;
        }
        if (!this.f4800L) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f4800L = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f4800L = false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0298 A[LOOP:0: B:102:0x0296->B:103:0x0298, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02b5 A[LOOP:1: B:105:0x02b3->B:106:0x02b5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02d3 A[LOOP:2: B:108:0x02d1->B:109:0x02d3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0321 A[LOOP:3: B:116:0x031f->B:117:0x0321, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0221  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.getLayoutDirection()
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L_0x000c
            r1 = r3
            goto L_0x000d
        L_0x000c:
            r1 = r2
        L_0x000d:
            int r4 = r18.getWidth()
            int r5 = r18.getHeight()
            int r6 = r18.getPaddingLeft()
            int r7 = r18.getPaddingRight()
            int r8 = r18.getPaddingTop()
            int r9 = r18.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f4803O
            r11[r3] = r2
            r11[r2] = r2
            java.util.WeakHashMap r12 = K.O.f1352a
            int r12 = r18.getMinimumHeight()
            if (r12 < 0) goto L_0x003c
            int r13 = r23 - r21
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003d
        L_0x003c:
            r12 = r2
        L_0x003d:
            k.y r13 = r0.d
            boolean r13 = r0.t(r13)
            if (r13 == 0) goto L_0x0058
            if (r1 == 0) goto L_0x0050
            k.y r13 = r0.d
            int r13 = r0.q(r13, r10, r12, r11)
            r14 = r13
            r13 = r6
            goto L_0x005a
        L_0x0050:
            k.y r13 = r0.d
            int r13 = r0.p(r13, r6, r12, r11)
        L_0x0056:
            r14 = r10
            goto L_0x005a
        L_0x0058:
            r13 = r6
            goto L_0x0056
        L_0x005a:
            k.y r15 = r0.f4821q
            boolean r15 = r0.t(r15)
            if (r15 == 0) goto L_0x0071
            if (r1 == 0) goto L_0x006b
            k.y r15 = r0.f4821q
            int r14 = r0.q(r15, r14, r12, r11)
            goto L_0x0071
        L_0x006b:
            k.y r15 = r0.f4821q
            int r13 = r0.p(r15, r13, r12, r11)
        L_0x0071:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f4812a
            boolean r15 = r0.t(r15)
            if (r15 == 0) goto L_0x0088
            if (r1 == 0) goto L_0x0082
            androidx.appcompat.widget.ActionMenuView r15 = r0.f4812a
            int r13 = r0.p(r15, r13, r12, r11)
            goto L_0x0088
        L_0x0082:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f4812a
            int r14 = r0.q(r15, r14, r12, r11)
        L_0x0088:
            int r15 = r18.getCurrentContentInsetLeft()
            int r16 = r18.getCurrentContentInsetRight()
            int r3 = r15 - r13
            int r3 = java.lang.Math.max(r2, r3)
            r11[r2] = r3
            int r3 = r10 - r14
            int r3 = r16 - r3
            int r3 = java.lang.Math.max(r2, r3)
            r17 = 1
            r11[r17] = r3
            int r3 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f4822r
            boolean r13 = r0.t(r13)
            if (r13 == 0) goto L_0x00c5
            if (r1 == 0) goto L_0x00bf
            android.view.View r13 = r0.f4822r
            int r10 = r0.q(r13, r10, r12, r11)
            goto L_0x00c5
        L_0x00bf:
            android.view.View r13 = r0.f4822r
            int r3 = r0.p(r13, r3, r12, r11)
        L_0x00c5:
            k.z r13 = r0.f4818e
            boolean r13 = r0.t(r13)
            if (r13 == 0) goto L_0x00dc
            if (r1 == 0) goto L_0x00d6
            k.z r13 = r0.f4818e
            int r10 = r0.q(r13, r10, r12, r11)
            goto L_0x00dc
        L_0x00d6:
            k.z r13 = r0.f4818e
            int r3 = r0.p(r13, r3, r12, r11)
        L_0x00dc:
            k.b0 r13 = r0.f4814b
            boolean r13 = r0.t(r13)
            k.b0 r14 = r0.f4816c
            boolean r14 = r0.t(r14)
            if (r13 == 0) goto L_0x0101
            k.b0 r15 = r0.f4814b
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            k.W0 r15 = (k.C0694W0) r15
            int r2 = r15.topMargin
            r22 = r7
            k.b0 r7 = r0.f4814b
            int r7 = r7.getMeasuredHeight()
            int r7 = r7 + r2
            int r2 = r15.bottomMargin
            int r2 = r2 + r7
            goto L_0x0104
        L_0x0101:
            r22 = r7
            r2 = 0
        L_0x0104:
            if (r14 == 0) goto L_0x011e
            k.b0 r7 = r0.f4816c
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            k.W0 r7 = (k.C0694W0) r7
            int r15 = r7.topMargin
            r16 = r4
            k.b0 r4 = r0.f4816c
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r15
            int r7 = r7.bottomMargin
            int r4 = r4 + r7
            int r2 = r2 + r4
            goto L_0x0120
        L_0x011e:
            r16 = r4
        L_0x0120:
            if (r13 != 0) goto L_0x012b
            if (r14 == 0) goto L_0x0125
            goto L_0x012b
        L_0x0125:
            r17 = r6
            r21 = r12
            goto L_0x028a
        L_0x012b:
            if (r13 == 0) goto L_0x0130
            k.b0 r4 = r0.f4814b
            goto L_0x0132
        L_0x0130:
            k.b0 r4 = r0.f4816c
        L_0x0132:
            if (r14 == 0) goto L_0x0137
            k.b0 r7 = r0.f4816c
            goto L_0x0139
        L_0x0137:
            k.b0 r7 = r0.f4814b
        L_0x0139:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            k.W0 r4 = (k.C0694W0) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            k.W0 r7 = (k.C0694W0) r7
            if (r13 == 0) goto L_0x014f
            k.b0 r15 = r0.f4814b
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0159
        L_0x014f:
            if (r14 == 0) goto L_0x015d
            k.b0 r15 = r0.f4816c
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015d
        L_0x0159:
            r17 = r6
            r15 = 1
            goto L_0x0160
        L_0x015d:
            r17 = r6
            r15 = 0
        L_0x0160:
            int r6 = r0.F
            r6 = r6 & 112(0x70, float:1.57E-43)
            r21 = r12
            r12 = 48
            if (r6 == r12) goto L_0x01a2
            r12 = 80
            if (r6 == r12) goto L_0x0196
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r2
            int r6 = r6 / 2
            int r12 = r4.topMargin
            r23 = r3
            int r3 = r0.f4790A
            int r12 = r12 + r3
            if (r6 >= r12) goto L_0x017f
            r6 = r12
            goto L_0x0194
        L_0x017f:
            int r5 = r5 - r9
            int r5 = r5 - r2
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.f4791B
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x0194
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x0194:
            int r8 = r8 + r6
            goto L_0x01af
        L_0x0196:
            r23 = r3
            int r5 = r5 - r9
            int r3 = r7.bottomMargin
            int r5 = r5 - r3
            int r3 = r0.f4791B
            int r5 = r5 - r3
            int r8 = r5 - r2
            goto L_0x01af
        L_0x01a2:
            r23 = r3
            int r2 = r18.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.f4790A
            int r8 = r2 + r3
        L_0x01af:
            if (r1 == 0) goto L_0x0221
            if (r15 == 0) goto L_0x01b7
            int r1 = r0.f4829y
        L_0x01b5:
            r2 = 1
            goto L_0x01b9
        L_0x01b7:
            r1 = 0
            goto L_0x01b5
        L_0x01b9:
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01ef
            k.b0 r1 = r0.f4814b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            k.W0 r1 = (k.C0694W0) r1
            k.b0 r2 = r0.f4814b
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            k.b0 r3 = r0.f4814b
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            k.b0 r4 = r0.f4814b
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f4830z
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01f0
        L_0x01ef:
            r2 = r10
        L_0x01f0:
            if (r14 == 0) goto L_0x0216
            k.b0 r1 = r0.f4816c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            k.W0 r1 = (k.C0694W0) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            k.b0 r1 = r0.f4816c
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            k.b0 r3 = r0.f4816c
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            k.b0 r4 = r0.f4816c
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.f4830z
            int r1 = r10 - r1
            goto L_0x0217
        L_0x0216:
            r1 = r10
        L_0x0217:
            if (r15 == 0) goto L_0x021e
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L_0x021e:
            r3 = r23
            goto L_0x028a
        L_0x0221:
            if (r15 == 0) goto L_0x0227
            int r1 = r0.f4829y
        L_0x0225:
            r2 = 0
            goto L_0x0229
        L_0x0227:
            r1 = 0
            goto L_0x0225
        L_0x0229:
            r3 = r11[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r3 = r3 + r23
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x025e
            k.b0 r1 = r0.f4814b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            k.W0 r1 = (k.C0694W0) r1
            k.b0 r2 = r0.f4814b
            int r2 = r2.getMeasuredWidth()
            int r2 = r2 + r3
            k.b0 r4 = r0.f4814b
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            k.b0 r5 = r0.f4814b
            r5.layout(r3, r8, r2, r4)
            int r5 = r0.f4830z
            int r2 = r2 + r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x025f
        L_0x025e:
            r2 = r3
        L_0x025f:
            if (r14 == 0) goto L_0x0283
            k.b0 r1 = r0.f4816c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            k.W0 r1 = (k.C0694W0) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            k.b0 r1 = r0.f4816c
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 + r3
            k.b0 r4 = r0.f4816c
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            k.b0 r5 = r0.f4816c
            r5.layout(r3, r8, r1, r4)
            int r4 = r0.f4830z
            int r1 = r1 + r4
            goto L_0x0284
        L_0x0283:
            r1 = r3
        L_0x0284:
            if (r15 == 0) goto L_0x028a
            int r3 = java.lang.Math.max(r2, r1)
        L_0x028a:
            java.util.ArrayList r1 = r0.f4801M
            r2 = 3
            r0.a(r2, r1)
            int r2 = r1.size()
            r4 = r3
            r3 = 0
        L_0x0296:
            if (r3 >= r2) goto L_0x02a7
            java.lang.Object r5 = r1.get(r3)
            android.view.View r5 = (android.view.View) r5
            r12 = r21
            int r4 = r0.p(r5, r4, r12, r11)
            r5 = 1
            int r3 = r3 + r5
            goto L_0x0296
        L_0x02a7:
            r12 = r21
            r5 = 1
            r2 = 5
            r0.a(r2, r1)
            int r2 = r1.size()
            r3 = 0
        L_0x02b3:
            if (r3 >= r2) goto L_0x02c1
            java.lang.Object r6 = r1.get(r3)
            android.view.View r6 = (android.view.View) r6
            int r10 = r0.q(r6, r10, r12, r11)
            int r3 = r3 + r5
            goto L_0x02b3
        L_0x02c1:
            r0.a(r5, r1)
            r2 = 0
            r3 = r11[r2]
            r2 = r11[r5]
            int r5 = r1.size()
            r6 = r2
            r7 = r3
            r2 = 0
            r3 = 0
        L_0x02d1:
            if (r2 >= r5) goto L_0x0304
            java.lang.Object r8 = r1.get(r2)
            android.view.View r8 = (android.view.View) r8
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            k.W0 r9 = (k.C0694W0) r9
            int r13 = r9.leftMargin
            int r13 = r13 - r7
            int r7 = r9.rightMargin
            int r7 = r7 - r6
            r6 = 0
            int r9 = java.lang.Math.max(r6, r13)
            int r14 = java.lang.Math.max(r6, r7)
            int r13 = -r13
            int r13 = java.lang.Math.max(r6, r13)
            int r7 = -r7
            int r7 = java.lang.Math.max(r6, r7)
            int r8 = r8.getMeasuredWidth()
            int r8 = r8 + r9
            int r8 = r8 + r14
            int r3 = r3 + r8
            r8 = 1
            int r2 = r2 + r8
            r6 = r7
            r7 = r13
            goto L_0x02d1
        L_0x0304:
            r6 = 0
            int r2 = r16 - r17
            int r2 = r2 - r22
            int r2 = r2 / 2
            int r2 = r2 + r17
            int r5 = r3 / 2
            int r2 = r2 - r5
            int r3 = r3 + r2
            if (r2 >= r4) goto L_0x0314
            goto L_0x031b
        L_0x0314:
            if (r3 <= r10) goto L_0x031a
            int r3 = r3 - r10
            int r4 = r2 - r3
            goto L_0x031b
        L_0x031a:
            r4 = r2
        L_0x031b:
            int r2 = r1.size()
        L_0x031f:
            if (r6 >= r2) goto L_0x032e
            java.lang.Object r3 = r1.get(r6)
            android.view.View r3 = (android.view.View) r3
            int r4 = r0.p(r3, r4, r12, r11)
            r3 = 1
            int r6 = r6 + r3
            goto L_0x031f
        L_0x032e:
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public final void onMeasure(int i2, int i5) {
        char c3;
        char c6;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z3 = i1.f9315a;
        int i13 = 0;
        if (getLayoutDirection() == 1) {
            c6 = 1;
            c3 = 0;
        } else {
            c3 = 1;
            c6 = 0;
        }
        if (t(this.d)) {
            s(this.d, i2, 0, i5, this.f4828x);
            i8 = k(this.d) + this.d.getMeasuredWidth();
            i7 = Math.max(0, l(this.d) + this.d.getMeasuredHeight());
            i6 = View.combineMeasuredStates(0, this.d.getMeasuredState());
        } else {
            i8 = 0;
            i7 = 0;
            i6 = 0;
        }
        if (t(this.f4821q)) {
            s(this.f4821q, i2, 0, i5, this.f4828x);
            i8 = k(this.f4821q) + this.f4821q.getMeasuredWidth();
            i7 = Math.max(i7, l(this.f4821q) + this.f4821q.getMeasuredHeight());
            i6 = View.combineMeasuredStates(i6, this.f4821q.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i8);
        int max2 = Math.max(0, currentContentInsetStart - i8);
        int[] iArr = this.f4803O;
        iArr[c6] = max2;
        if (t(this.f4812a)) {
            s(this.f4812a, i2, max, i5, this.f4828x);
            i9 = k(this.f4812a) + this.f4812a.getMeasuredWidth();
            i7 = Math.max(i7, l(this.f4812a) + this.f4812a.getMeasuredHeight());
            i6 = View.combineMeasuredStates(i6, this.f4812a.getMeasuredState());
        } else {
            i9 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i9);
        iArr[c3] = Math.max(0, currentContentInsetEnd - i9);
        if (t(this.f4822r)) {
            max3 += r(this.f4822r, i2, max3, i5, 0, iArr);
            i7 = Math.max(i7, l(this.f4822r) + this.f4822r.getMeasuredHeight());
            i6 = View.combineMeasuredStates(i6, this.f4822r.getMeasuredState());
        }
        if (t(this.f4818e)) {
            max3 += r(this.f4818e, i2, max3, i5, 0, iArr);
            i7 = Math.max(i7, l(this.f4818e) + this.f4818e.getMeasuredHeight());
            i6 = View.combineMeasuredStates(i6, this.f4818e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (((C0694W0) childAt.getLayoutParams()).f9241b == 0 && t(childAt)) {
                View view = childAt;
                max3 += r(childAt, i2, max3, i5, 0, iArr);
                i7 = Math.max(i7, l(view) + view.getMeasuredHeight());
                i6 = View.combineMeasuredStates(i6, view.getMeasuredState());
            }
        }
        int i15 = this.f4790A + this.f4791B;
        int i16 = this.f4829y + this.f4830z;
        if (t(this.f4814b)) {
            r(this.f4814b, i2, max3 + i16, i5, i15, iArr);
            int k6 = k(this.f4814b) + this.f4814b.getMeasuredWidth();
            i10 = l(this.f4814b) + this.f4814b.getMeasuredHeight();
            i12 = View.combineMeasuredStates(i6, this.f4814b.getMeasuredState());
            i11 = k6;
        } else {
            i10 = 0;
            i12 = i6;
            i11 = 0;
        }
        if (t(this.f4816c)) {
            i11 = Math.max(i11, r(this.f4816c, i2, max3 + i16, i5, i10 + i15, iArr));
            i10 = l(this.f4816c) + this.f4816c.getMeasuredHeight() + i10;
            i12 = View.combineMeasuredStates(i12, this.f4816c.getMeasuredState());
        } else {
            int i17 = i12;
        }
        int max4 = Math.max(i7, i10);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i11, getSuggestedMinimumWidth()), i2, -16777216 & i12);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i5, i12 << 16);
        if (this.f4810V) {
            int childCount2 = getChildCount();
            int i18 = 0;
            while (true) {
                if (i18 >= childCount2) {
                    break;
                }
                View childAt2 = getChildAt(i18);
                if (t(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i18++;
            }
        }
        i13 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i13);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        k kVar;
        MenuItem findItem;
        if (!(parcelable instanceof C0698Y0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0698Y0 y02 = (C0698Y0) parcelable;
        super.onRestoreInstanceState(y02.f2792a);
        ActionMenuView actionMenuView = this.f4812a;
        if (actionMenuView != null) {
            kVar = actionMenuView.f4774y;
        } else {
            kVar = null;
        }
        int i2 = y02.f9252c;
        if (!(i2 == 0 || this.f4809U == null || kVar == null || (findItem = kVar.findItem(i2)) == null)) {
            findItem.expandActionView();
        }
        if (y02.d) {
            C0737s0 s0Var = this.f4817c0;
            removeCallbacks(s0Var);
            post(s0Var);
        }
    }

    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        d();
        C0675M0 m02 = this.f4792C;
        boolean z3 = true;
        if (i2 != 1) {
            z3 = false;
        }
        if (z3 != m02.g) {
            m02.g = z3;
            if (!m02.h) {
                m02.f9204a = m02.f9207e;
                m02.f9205b = m02.f9208f;
            } else if (z3) {
                int i5 = m02.d;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = m02.f9207e;
                }
                m02.f9204a = i5;
                int i6 = m02.f9206c;
                if (i6 == Integer.MIN_VALUE) {
                    i6 = m02.f9208f;
                }
                m02.f9205b = i6;
            } else {
                int i7 = m02.f9206c;
                if (i7 == Integer.MIN_VALUE) {
                    i7 = m02.f9207e;
                }
                m02.f9204a = i7;
                int i8 = m02.d;
                if (i8 == Integer.MIN_VALUE) {
                    i8 = m02.f9208f;
                }
                m02.f9205b = i8;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.os.Parcelable, T.c, k.Y0] */
    public final Parcelable onSaveInstanceState() {
        boolean z3;
        C0718j jVar;
        j.m mVar;
        ? cVar = new c(super.onSaveInstanceState());
        C0692V0 v02 = this.f4809U;
        if (!(v02 == null || (mVar = v02.f9238b) == null)) {
            cVar.f9252c = mVar.f8756a;
        }
        ActionMenuView actionMenuView = this.f4812a;
        if (actionMenuView == null || (jVar = actionMenuView.f4768C) == null || !jVar.f()) {
            z3 = false;
        } else {
            z3 = true;
        }
        cVar.d = z3;
        return cVar;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4799K = false;
        }
        if (!this.f4799K) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f4799K = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f4799K = false;
        }
        return true;
    }

    public final int p(View view, int i2, int i5, int[] iArr) {
        C0694W0 w02 = (C0694W0) view.getLayoutParams();
        int i6 = w02.leftMargin - iArr[0];
        int max = Math.max(0, i6) + i2;
        iArr[0] = Math.max(0, -i6);
        int j6 = j(view, i5);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j6, max + measuredWidth, view.getMeasuredHeight() + j6);
        return measuredWidth + w02.rightMargin + max;
    }

    public final int q(View view, int i2, int i5, int[] iArr) {
        C0694W0 w02 = (C0694W0) view.getLayoutParams();
        int i6 = w02.rightMargin - iArr[1];
        int max = i2 - Math.max(0, i6);
        iArr[1] = Math.max(0, -i6);
        int j6 = j(view, i5);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j6, max, view.getMeasuredHeight() + j6);
        return max - (measuredWidth + w02.leftMargin);
    }

    public final int r(View view, int i2, int i5, int i6, int i7, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i8 = marginLayoutParams.leftMargin - iArr[0];
        int i9 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i9) + Math.max(0, i8);
        iArr[0] = Math.max(0, -i8);
        iArr[1] = Math.max(0, -i9);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + max + i5, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i6, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i7, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void s(View view, int i2, int i5, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i6, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i7 >= 0) {
            if (mode != 0) {
                i7 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i7);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z3) {
        if (this.f4815b0 != z3) {
            this.f4815b0 = z3;
            u();
        }
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(b.J(getContext(), i2));
    }

    public void setCollapsible(boolean z3) {
        this.f4810V = z3;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f4794E) {
            this.f4794E = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f4793D) {
            this.f4793D = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(b.J(getContext(), i2));
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(b.J(getContext(), i2));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.d.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f4812a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.f4824t != i2) {
            this.f4824t = i2;
            if (i2 == 0) {
                this.f4823s = getContext();
            } else {
                this.f4823s = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitleMarginBottom(int i2) {
        this.f4791B = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.f4830z = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.f4829y = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.f4790A = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public final boolean t(View view) {
        if (view == null || view.getParent() != this || view.getVisibility() == 8) {
            return false;
        }
        return true;
    }

    public final void u() {
        boolean z3;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a6 = C0690U0.a(this);
            C0692V0 v02 = this.f4809U;
            if (v02 == null || v02.f9238b == null || a6 == null || !isAttachedToWindow() || !this.f4815b0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3 && this.f4813a0 == null) {
                if (this.f4811W == null) {
                    this.f4811W = C0690U0.b(new C0688T0(this, 0));
                }
                C0690U0.c(a6, this.f4811W);
                this.f4813a0 = a6;
            } else if (!z3 && (onBackInvokedDispatcher = this.f4813a0) != null) {
                C0690U0.d(onBackInvokedDispatcher, this.f4811W);
                this.f4813a0 = null;
            }
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.F = 8388627;
        this.f4801M = new ArrayList();
        this.f4802N = new ArrayList();
        this.f4803O = new int[2];
        this.f4804P = new C0009h((Runnable) new C0688T0(this, 1));
        this.f4805Q = new ArrayList();
        this.f4806R = new C0724m(this, 1);
        this.f4817c0 = new C0737s0(this, 2);
        Context context2 = getContext();
        int[] iArr = C0476a.f7551w;
        i A6 = i.A(context2, attributeSet, iArr, R.attr.toolbarStyle);
        O.k(this, context, iArr, attributeSet, (TypedArray) A6.f5606c, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) A6.f5606c;
        this.f4825u = typedArray.getResourceId(28, 0);
        this.f4826v = typedArray.getResourceId(19, 0);
        this.F = typedArray.getInteger(0, 8388627);
        this.f4827w = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f4791B = dimensionPixelOffset;
        this.f4790A = dimensionPixelOffset;
        this.f4830z = dimensionPixelOffset;
        this.f4829y = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f4829y = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f4830z = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f4790A = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f4791B = dimensionPixelOffset5;
        }
        this.f4828x = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        C0675M0 m02 = this.f4792C;
        m02.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            m02.f9207e = dimensionPixelSize;
            m02.f9204a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            m02.f9208f = dimensionPixelSize2;
            m02.f9205b = dimensionPixelSize2;
        }
        if (!(dimensionPixelOffset6 == Integer.MIN_VALUE && dimensionPixelOffset7 == Integer.MIN_VALUE)) {
            m02.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f4793D = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f4794E = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f4819f = A6.n(4);
        this.f4820p = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f4823s = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable n2 = A6.n(16);
        if (n2 != null) {
            setNavigationIcon(n2);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable n6 = A6.n(11);
        if (n6 != null) {
            setLogo(n6);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(A6.m(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(A6.m(20));
        }
        if (typedArray.hasValue(14)) {
            m(typedArray.getResourceId(14, 0));
        }
        A6.G();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, k.W0] */
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f9240a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0476a.f7533b);
        marginLayoutParams.f9240a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        marginLayoutParams.f9241b = 0;
        return marginLayoutParams;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C0748y yVar = this.f4821q;
        if (yVar != null) {
            yVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f4821q.setImageDrawable(drawable);
            return;
        }
        C0748y yVar = this.f4821q;
        if (yVar != null) {
            yVar.setImageDrawable(this.f4819f);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f4818e == null) {
                this.f4818e = new C0750z(getContext(), (AttributeSet) null, 0);
            }
            if (!o(this.f4818e)) {
                b(this.f4818e, true);
            }
        } else {
            C0750z zVar = this.f4818e;
            if (zVar != null && o(zVar)) {
                removeView(this.f4818e);
                this.f4802N.remove(this.f4818e);
            }
        }
        C0750z zVar2 = this.f4818e;
        if (zVar2 != null) {
            zVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f4818e == null) {
            this.f4818e = new C0750z(getContext(), (AttributeSet) null, 0);
        }
        C0750z zVar = this.f4818e;
        if (zVar != null) {
            zVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        C0748y yVar = this.d;
        if (yVar != null) {
            yVar.setContentDescription(charSequence);
            com.bumptech.glide.c.o0(this.d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.d)) {
                b(this.d, true);
            }
        } else {
            C0748y yVar = this.d;
            if (yVar != null && o(yVar)) {
                removeView(this.d);
                this.f4802N.remove(this.d);
            }
        }
        C0748y yVar2 = this.d;
        if (yVar2 != null) {
            yVar2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f4816c == null) {
                Context context = getContext();
                C0703b0 b0Var = new C0703b0(context, (AttributeSet) null);
                this.f4816c = b0Var;
                b0Var.setSingleLine();
                this.f4816c.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f4826v;
                if (i2 != 0) {
                    this.f4816c.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f4798J;
                if (colorStateList != null) {
                    this.f4816c.setTextColor(colorStateList);
                }
            }
            if (!o(this.f4816c)) {
                b(this.f4816c, true);
            }
        } else {
            C0703b0 b0Var2 = this.f4816c;
            if (b0Var2 != null && o(b0Var2)) {
                removeView(this.f4816c);
                this.f4802N.remove(this.f4816c);
            }
        }
        C0703b0 b0Var3 = this.f4816c;
        if (b0Var3 != null) {
            b0Var3.setText(charSequence);
        }
        this.f4796H = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f4798J = colorStateList;
        C0703b0 b0Var = this.f4816c;
        if (b0Var != null) {
            b0Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f4814b == null) {
                Context context = getContext();
                C0703b0 b0Var = new C0703b0(context, (AttributeSet) null);
                this.f4814b = b0Var;
                b0Var.setSingleLine();
                this.f4814b.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f4825u;
                if (i2 != 0) {
                    this.f4814b.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f4797I;
                if (colorStateList != null) {
                    this.f4814b.setTextColor(colorStateList);
                }
            }
            if (!o(this.f4814b)) {
                b(this.f4814b, true);
            }
        } else {
            C0703b0 b0Var2 = this.f4814b;
            if (b0Var2 != null && o(b0Var2)) {
                removeView(this.f4814b);
                this.f4802N.remove(this.f4814b);
            }
        }
        C0703b0 b0Var3 = this.f4814b;
        if (b0Var3 != null) {
            b0Var3.setText(charSequence);
        }
        this.f4795G = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f4797I = colorStateList;
        C0703b0 b0Var = this.f4814b;
        if (b0Var != null) {
            b0Var.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(C0696X0 x02) {
    }
}
