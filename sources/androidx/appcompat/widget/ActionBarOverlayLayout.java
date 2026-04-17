package androidx.appcompat.widget;

import C.g;
import K.B;
import K.C0073m;
import K.C0074n;
import K.C0075o;
import K.D;
import K.O;
import K.W;
import K.k0;
import K.l0;
import K.m0;
import K.n0;
import K.t0;
import K.v0;
import R2.b;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.google.android.gms.common.api.f;
import com.mtma.criminal.city.R;
import f.J;
import j.k;
import j.v;
import java.util.WeakHashMap;
import k.C0692V0;
import k.C0702b;
import k.C0704c;
import k.C0706d;
import k.C0708e;
import k.C0718j;
import k.C0721k0;
import k.C0723l0;
import k.a1;

public class ActionBarOverlayLayout extends ViewGroup implements C0721k0, C0073m, C0074n {

    /* renamed from: L  reason: collision with root package name */
    public static final int[] f4737L = {R.attr.actionBarSize, 16842841};

    /* renamed from: M  reason: collision with root package name */
    public static final v0 f4738M;

    /* renamed from: N  reason: collision with root package name */
    public static final Rect f4739N = new Rect();

    /* renamed from: A  reason: collision with root package name */
    public v0 f4740A;

    /* renamed from: B  reason: collision with root package name */
    public v0 f4741B;

    /* renamed from: C  reason: collision with root package name */
    public v0 f4742C;

    /* renamed from: D  reason: collision with root package name */
    public C0704c f4743D;

    /* renamed from: E  reason: collision with root package name */
    public OverScroller f4744E;
    public ViewPropertyAnimator F;

    /* renamed from: G  reason: collision with root package name */
    public final W f4745G;

    /* renamed from: H  reason: collision with root package name */
    public final C0702b f4746H;

    /* renamed from: I  reason: collision with root package name */
    public final C0702b f4747I;

    /* renamed from: J  reason: collision with root package name */
    public final C0075o f4748J;

    /* renamed from: K  reason: collision with root package name */
    public final C0708e f4749K;

    /* renamed from: a  reason: collision with root package name */
    public int f4750a;

    /* renamed from: b  reason: collision with root package name */
    public int f4751b = 0;

    /* renamed from: c  reason: collision with root package name */
    public ContentFrameLayout f4752c;
    public ActionBarContainer d;

    /* renamed from: e  reason: collision with root package name */
    public C0723l0 f4753e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f4754f;

    /* renamed from: p  reason: collision with root package name */
    public boolean f4755p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4756q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f4757r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f4758s;

    /* renamed from: t  reason: collision with root package name */
    public int f4759t;

    /* renamed from: u  reason: collision with root package name */
    public int f4760u;

    /* renamed from: v  reason: collision with root package name */
    public final Rect f4761v = new Rect();

    /* renamed from: w  reason: collision with root package name */
    public final Rect f4762w = new Rect();

    /* renamed from: x  reason: collision with root package name */
    public final Rect f4763x = new Rect();

    /* renamed from: y  reason: collision with root package name */
    public final Rect f4764y = new Rect();

    /* renamed from: z  reason: collision with root package name */
    public v0 f4765z;

    static {
        n0 n0Var;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            n0Var = new m0();
        } else if (i2 >= 29) {
            n0Var = new l0();
        } else {
            n0Var = new k0();
        }
        n0Var.g(g.b(0, 1, 0, 1));
        f4738M = n0Var.b();
    }

    /* JADX WARNING: type inference failed for: r3v14, types: [java.lang.Object, K.o] */
    /* JADX WARNING: type inference failed for: r3v15, types: [k.e, android.view.View] */
    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        v0 v0Var = v0.f1431b;
        this.f4765z = v0Var;
        this.f4740A = v0Var;
        this.f4741B = v0Var;
        this.f4742C = v0Var;
        this.f4745G = new W((Object) this, 7);
        this.f4746H = new C0702b(this, 0);
        this.f4747I = new C0702b(this, 1);
        i(context);
        this.f4748J = new Object();
        ? view = new View(context);
        view.setWillNotDraw(true);
        this.f4749K = view;
        addView(view);
    }

    public static boolean g(View view, Rect rect, boolean z3) {
        boolean z4;
        int i2;
        C0706d dVar = (C0706d) view.getLayoutParams();
        int i5 = dVar.leftMargin;
        int i6 = rect.left;
        if (i5 != i6) {
            dVar.leftMargin = i6;
            z4 = true;
        } else {
            z4 = false;
        }
        int i7 = dVar.topMargin;
        int i8 = rect.top;
        if (i7 != i8) {
            dVar.topMargin = i8;
            z4 = true;
        }
        int i9 = dVar.rightMargin;
        int i10 = rect.right;
        if (i9 != i10) {
            dVar.rightMargin = i10;
            z4 = true;
        }
        if (!z3 || dVar.bottomMargin == (i2 = rect.bottom)) {
            return z4;
        }
        dVar.bottomMargin = i2;
        return true;
    }

    public final void a(View view, View view2, int i2, int i5) {
        if (i5 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    public final void b(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    public final void c(View view, int i2, int i5, int[] iArr, int i6) {
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0706d;
    }

    public final void d(View view, int i2, int i5, int i6, int i7, int i8, int[] iArr) {
        e(view, i2, i5, i6, i7, i8);
    }

    public final void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.f4754f != null) {
            if (this.d.getVisibility() == 0) {
                i2 = (int) (this.d.getTranslationY() + ((float) this.d.getBottom()) + 0.5f);
            } else {
                i2 = 0;
            }
            this.f4754f.setBounds(0, i2, getWidth(), this.f4754f.getIntrinsicHeight() + i2);
            this.f4754f.draw(canvas);
        }
    }

    public final void e(View view, int i2, int i5, int i6, int i7, int i8) {
        if (i8 == 0) {
            onNestedScroll(view, i2, i5, i6, i7);
        }
    }

    public final boolean f(View view, View view2, int i2, int i5) {
        if (i5 != 0 || !onStartNestedScroll(view, view2, i2)) {
            return false;
        }
        return true;
    }

    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        C0075o oVar = this.f4748J;
        return oVar.f1412b | oVar.f1411a;
    }

    public CharSequence getTitle() {
        k();
        return ((a1) this.f4753e).f9257a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f4746H);
        removeCallbacks(this.f4747I);
        ViewPropertyAnimator viewPropertyAnimator = this.F;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f4737L);
        boolean z3 = false;
        this.f4750a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f4754f = drawable;
        if (drawable == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        obtainStyledAttributes.recycle();
        this.f4744E = new OverScroller(context);
    }

    public final void j(int i2) {
        k();
        if (i2 == 2) {
            ((a1) this.f4753e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i2 == 5) {
            ((a1) this.f4753e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i2 == 109) {
            setOverlayMode(true);
        }
    }

    public final void k() {
        C0723l0 l0Var;
        if (this.f4752c == null) {
            this.f4752c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof C0723l0) {
                l0Var = (C0723l0) findViewById;
            } else if (findViewById instanceof Toolbar) {
                l0Var = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
            }
            this.f4753e = l0Var;
        }
    }

    public final void l(k kVar, v vVar) {
        k();
        a1 a1Var = (a1) this.f4753e;
        C0718j jVar = a1Var.f9266m;
        Toolbar toolbar = a1Var.f9257a;
        if (jVar == null) {
            a1Var.f9266m = new C0718j(toolbar.getContext());
        }
        C0718j jVar2 = a1Var.f9266m;
        jVar2.f9326e = vVar;
        if (kVar != null || toolbar.f4812a != null) {
            toolbar.f();
            k kVar2 = toolbar.f4812a.f4774y;
            if (kVar2 != kVar) {
                if (kVar2 != null) {
                    kVar2.r(toolbar.f4808T);
                    kVar2.r(toolbar.f4809U);
                }
                if (toolbar.f4809U == null) {
                    toolbar.f4809U = new C0692V0(toolbar);
                }
                jVar2.f9338z = true;
                if (kVar != null) {
                    kVar.b(jVar2, toolbar.f4823s);
                    kVar.b(toolbar.f4809U, toolbar.f4823s);
                } else {
                    jVar2.g(toolbar.f4823s, (k) null);
                    toolbar.f4809U.g(toolbar.f4823s, (k) null);
                    jVar2.e();
                    toolbar.f4809U.e();
                }
                toolbar.f4812a.setPopupTheme(toolbar.f4824t);
                toolbar.f4812a.setPresenter(jVar2);
                toolbar.f4808T = jVar2;
                toolbar.u();
            }
        }
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        v0 g = v0.g(this, windowInsets);
        boolean g5 = g(this.d, new Rect(g.b(), g.d(), g.c(), g.a()), false);
        WeakHashMap weakHashMap = O.f1352a;
        Rect rect = this.f4761v;
        D.b(this, g, rect);
        int i2 = rect.left;
        int i5 = rect.top;
        int i6 = rect.right;
        int i7 = rect.bottom;
        t0 t0Var = g.f1432a;
        v0 l6 = t0Var.l(i2, i5, i6, i7);
        this.f4765z = l6;
        boolean z3 = true;
        if (!this.f4740A.equals(l6)) {
            this.f4740A = this.f4765z;
            g5 = true;
        }
        Rect rect2 = this.f4762w;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
        } else {
            z3 = g5;
        }
        if (z3) {
            requestLayout();
        }
        return t0Var.a().f1432a.c().f1432a.b().f();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = O.f1352a;
        B.c(this);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    public final void onLayout(boolean z3, int i2, int i5, int i6, int i7) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0706d dVar = (C0706d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i9 = dVar.leftMargin + paddingLeft;
                int i10 = dVar.topMargin + paddingTop;
                childAt.layout(i9, i10, measuredWidth + i9, measuredHeight + i10);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r13, int r14) {
        /*
            r12 = this;
            r12.k()
            androidx.appcompat.widget.ActionBarContainer r1 = r12.d
            r3 = 0
            r5 = 0
            r0 = r12
            r2 = r13
            r4 = r14
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.ActionBarContainer r0 = r12.d
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            k.d r0 = (k.C0706d) r0
            androidx.appcompat.widget.ActionBarContainer r1 = r12.d
            int r1 = r1.getMeasuredWidth()
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r0.rightMargin
            int r1 = r1 + r2
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            androidx.appcompat.widget.ActionBarContainer r3 = r12.d
            int r3 = r3.getMeasuredHeight()
            int r4 = r0.topMargin
            int r3 = r3 + r4
            int r0 = r0.bottomMargin
            int r3 = r3 + r0
            int r0 = java.lang.Math.max(r2, r3)
            androidx.appcompat.widget.ActionBarContainer r3 = r12.d
            int r3 = r3.getMeasuredState()
            int r3 = android.view.View.combineMeasuredStates(r2, r3)
            java.util.WeakHashMap r4 = K.O.f1352a
            int r4 = r12.getWindowSystemUiVisibility()
            r4 = r4 & 256(0x100, float:3.59E-43)
            r5 = 1
            if (r4 == 0) goto L_0x004d
            r4 = r5
            goto L_0x004e
        L_0x004d:
            r4 = r2
        L_0x004e:
            if (r4 == 0) goto L_0x0062
            int r6 = r12.f4750a
            boolean r7 = r12.f4756q
            if (r7 == 0) goto L_0x0074
            androidx.appcompat.widget.ActionBarContainer r7 = r12.d
            android.view.View r7 = r7.getTabContainer()
            if (r7 == 0) goto L_0x0074
            int r7 = r12.f4750a
            int r6 = r6 + r7
            goto L_0x0074
        L_0x0062:
            androidx.appcompat.widget.ActionBarContainer r6 = r12.d
            int r6 = r6.getVisibility()
            r7 = 8
            if (r6 == r7) goto L_0x0073
            androidx.appcompat.widget.ActionBarContainer r6 = r12.d
            int r6 = r6.getMeasuredHeight()
            goto L_0x0074
        L_0x0073:
            r6 = r2
        L_0x0074:
            android.graphics.Rect r7 = r12.f4761v
            android.graphics.Rect r8 = r12.f4763x
            r8.set(r7)
            K.v0 r7 = r12.f4765z
            r12.f4741B = r7
            boolean r7 = r12.f4755p
            if (r7 != 0) goto L_0x00aa
            if (r4 != 0) goto L_0x00aa
            k.e r4 = r12.f4749K
            K.v0 r7 = f4738M
            android.graphics.Rect r9 = r12.f4764y
            K.D.b(r4, r7, r9)
            android.graphics.Rect r4 = f4739N
            boolean r4 = r9.equals(r4)
            if (r4 != 0) goto L_0x00aa
            int r4 = r8.top
            int r4 = r4 + r6
            r8.top = r4
            int r4 = r8.bottom
            r8.bottom = r4
            K.v0 r4 = r12.f4741B
            K.t0 r4 = r4.f1432a
            K.v0 r2 = r4.l(r2, r6, r2, r2)
            r12.f4741B = r2
            goto L_0x00ed
        L_0x00aa:
            K.v0 r2 = r12.f4741B
            int r2 = r2.b()
            K.v0 r4 = r12.f4741B
            int r4 = r4.d()
            int r4 = r4 + r6
            K.v0 r6 = r12.f4741B
            int r6 = r6.c()
            K.v0 r7 = r12.f4741B
            int r7 = r7.a()
            C.g r2 = C.g.b(r2, r4, r6, r7)
            K.v0 r4 = r12.f4741B
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 30
            if (r6 < r7) goto L_0x00d5
            K.m0 r6 = new K.m0
            r6.<init>(r4)
            goto L_0x00e4
        L_0x00d5:
            r7 = 29
            if (r6 < r7) goto L_0x00df
            K.l0 r6 = new K.l0
            r6.<init>(r4)
            goto L_0x00e4
        L_0x00df:
            K.k0 r6 = new K.k0
            r6.<init>(r4)
        L_0x00e4:
            r6.g(r2)
            K.v0 r2 = r6.b()
            r12.f4741B = r2
        L_0x00ed:
            androidx.appcompat.widget.ContentFrameLayout r2 = r12.f4752c
            g(r2, r8, r5)
            K.v0 r2 = r12.f4742C
            K.v0 r4 = r12.f4741B
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0115
            K.v0 r2 = r12.f4741B
            r12.f4742C = r2
            androidx.appcompat.widget.ContentFrameLayout r4 = r12.f4752c
            android.view.WindowInsets r2 = r2.f()
            if (r2 == 0) goto L_0x0115
            android.view.WindowInsets r5 = K.B.a(r4, r2)
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x0115
            K.v0.g(r4, r5)
        L_0x0115:
            androidx.appcompat.widget.ContentFrameLayout r7 = r12.f4752c
            r9 = 0
            r11 = 0
            r6 = r12
            r8 = r13
            r10 = r14
            r6.measureChildWithMargins(r7, r8, r9, r10, r11)
            androidx.appcompat.widget.ContentFrameLayout r2 = r12.f4752c
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            k.d r2 = (k.C0706d) r2
            androidx.appcompat.widget.ContentFrameLayout r4 = r12.f4752c
            int r4 = r4.getMeasuredWidth()
            int r5 = r2.leftMargin
            int r4 = r4 + r5
            int r5 = r2.rightMargin
            int r4 = r4 + r5
            int r1 = java.lang.Math.max(r1, r4)
            androidx.appcompat.widget.ContentFrameLayout r4 = r12.f4752c
            int r4 = r4.getMeasuredHeight()
            int r5 = r2.topMargin
            int r4 = r4 + r5
            int r2 = r2.bottomMargin
            int r4 = r4 + r2
            int r0 = java.lang.Math.max(r0, r4)
            androidx.appcompat.widget.ContentFrameLayout r2 = r12.f4752c
            int r2 = r2.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r3, r2)
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r4 = r4 + r3
            int r4 = r4 + r1
            int r1 = r12.getPaddingTop()
            int r3 = r12.getPaddingBottom()
            int r3 = r3 + r1
            int r3 = r3 + r0
            int r0 = r12.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r3, r0)
            int r1 = r12.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r4, r1)
            int r13 = android.view.View.resolveSizeAndState(r1, r13, r2)
            int r1 = r2 << 16
            int r14 = android.view.View.resolveSizeAndState(r0, r14, r1)
            r12.setMeasuredDimension(r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    public final boolean onNestedFling(View view, float f6, float f7, boolean z3) {
        if (!this.f4757r || !z3) {
            return false;
        }
        this.f4744E.fling(0, 0, 0, (int) f7, 0, 0, Integer.MIN_VALUE, f.API_PRIORITY_OTHER);
        if (this.f4744E.getFinalY() > this.d.getHeight()) {
            h();
            this.f4747I.run();
        } else {
            h();
            this.f4746H.run();
        }
        this.f4758s = true;
        return true;
    }

    public final boolean onNestedPreFling(View view, float f6, float f7) {
        return false;
    }

    public final void onNestedPreScroll(View view, int i2, int i5, int[] iArr) {
    }

    public final void onNestedScroll(View view, int i2, int i5, int i6, int i7) {
        int i8 = this.f4759t + i5;
        this.f4759t = i8;
        setActionBarHideOffset(i8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = (f.J) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3) {
        /*
            r0 = this;
            K.o r1 = r0.f4748J
            r1.f1411a = r3
            int r1 = r0.getActionBarHideOffset()
            r0.f4759t = r1
            r0.h()
            k.c r1 = r0.f4743D
            if (r1 == 0) goto L_0x001d
            f.J r1 = (f.J) r1
            i.j r2 = r1.f7730H
            if (r2 == 0) goto L_0x001d
            r2.a()
            r2 = 0
            r1.f7730H = r2
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onNestedScrollAccepted(android.view.View, android.view.View, int):void");
    }

    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.d.getVisibility() != 0) {
            return false;
        }
        return this.f4757r;
    }

    public final void onStopNestedScroll(View view) {
        if (this.f4757r && !this.f4758s) {
            if (this.f4759t <= this.d.getHeight()) {
                h();
                postDelayed(this.f4746H, 600);
                return;
            }
            h();
            postDelayed(this.f4747I, 600);
        }
    }

    public final void onWindowSystemUiVisibilityChanged(int i2) {
        boolean z3;
        boolean z4;
        super.onWindowSystemUiVisibilityChanged(i2);
        k();
        int i5 = this.f4760u ^ i2;
        this.f4760u = i2;
        if ((i2 & 4) == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((i2 & 256) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        C0704c cVar = this.f4743D;
        if (cVar != null) {
            J j6 = (J) cVar;
            j6.f7727D = !z4;
            if (z3 || !z4) {
                if (j6.f7728E) {
                    j6.f7728E = false;
                    j6.W0(true);
                }
            } else if (!j6.f7728E) {
                j6.f7728E = true;
                j6.W0(true);
            }
        }
        if ((i5 & 256) != 0 && this.f4743D != null) {
            WeakHashMap weakHashMap = O.f1352a;
            B.c(this);
        }
    }

    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f4751b = i2;
        C0704c cVar = this.f4743D;
        if (cVar != null) {
            ((J) cVar).f7726C = i2;
        }
    }

    public void setActionBarHideOffset(int i2) {
        h();
        this.d.setTranslationY((float) (-Math.max(0, Math.min(i2, this.d.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C0704c cVar) {
        this.f4743D = cVar;
        if (getWindowToken() != null) {
            ((J) this.f4743D).f7726C = this.f4751b;
            int i2 = this.f4760u;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                WeakHashMap weakHashMap = O.f1352a;
                B.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z3) {
        this.f4756q = z3;
    }

    public void setHideOnContentScrollEnabled(boolean z3) {
        if (z3 != this.f4757r) {
            this.f4757r = z3;
            if (!z3) {
                h();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i2) {
        k();
        a1 a1Var = (a1) this.f4753e;
        a1Var.d = i2 != 0 ? b.J(a1Var.f9257a.getContext(), i2) : null;
        a1Var.c();
    }

    public void setLogo(int i2) {
        Drawable drawable;
        k();
        a1 a1Var = (a1) this.f4753e;
        if (i2 != 0) {
            drawable = b.J(a1Var.f9257a.getContext(), i2);
        } else {
            drawable = null;
        }
        a1Var.f9260e = drawable;
        a1Var.c();
    }

    public void setOverlayMode(boolean z3) {
        this.f4755p = z3;
    }

    public void setShowingForActionMode(boolean z3) {
    }

    public void setUiOptions(int i2) {
    }

    public void setWindowCallback(Window.Callback callback) {
        k();
        ((a1) this.f4753e).f9264k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        k();
        a1 a1Var = (a1) this.f4753e;
        if (!a1Var.g) {
            a1Var.h = charSequence;
            if ((a1Var.f9258b & 8) != 0) {
                Toolbar toolbar = a1Var.f9257a;
                toolbar.setTitle(charSequence);
                if (a1Var.g) {
                    O.m(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        a1 a1Var = (a1) this.f4753e;
        a1Var.d = drawable;
        a1Var.c();
    }
}
