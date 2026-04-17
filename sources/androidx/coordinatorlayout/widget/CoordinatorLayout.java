package androidx.coordinatorlayout.widget;

import A.h;
import H4.i;
import J.b;
import J.c;
import K.B;
import K.C0073m;
import K.C0074n;
import K.C0075o;
import K.C0076p;
import K.D;
import K.O;
import K.v0;
import R0.e;
import S3.z;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.mtma.criminal.city.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import k.C0724m;
import n.j;
import w.C1053a;
import x.C1089a;
import x.C1090b;
import x.C1091c;
import x.C1092d;
import x.C1093e;
import x.C1094f;

public class CoordinatorLayout extends ViewGroup implements C0073m, C0074n {

    /* renamed from: C  reason: collision with root package name */
    public static final String f4853C;

    /* renamed from: D  reason: collision with root package name */
    public static final Class[] f4854D = {Context.class, AttributeSet.class};

    /* renamed from: E  reason: collision with root package name */
    public static final ThreadLocal f4855E = new ThreadLocal();
    public static final i F = new i(14);

    /* renamed from: G  reason: collision with root package name */
    public static final c f4856G = new c(12);

    /* renamed from: A  reason: collision with root package name */
    public C0724m f4857A;

    /* renamed from: B  reason: collision with root package name */
    public final C0075o f4858B = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f4859a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final z f4860b = new z(20);

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f4861c = new ArrayList();
    public final ArrayList d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final int[] f4862e = new int[2];

    /* renamed from: f  reason: collision with root package name */
    public final int[] f4863f = new int[2];

    /* renamed from: p  reason: collision with root package name */
    public boolean f4864p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4865q;

    /* renamed from: r  reason: collision with root package name */
    public final int[] f4866r;

    /* renamed from: s  reason: collision with root package name */
    public View f4867s;

    /* renamed from: t  reason: collision with root package name */
    public View f4868t;

    /* renamed from: u  reason: collision with root package name */
    public e f4869u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f4870v;

    /* renamed from: w  reason: collision with root package name */
    public v0 f4871w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f4872x;

    /* renamed from: y  reason: collision with root package name */
    public Drawable f4873y;

    /* renamed from: z  reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f4874z;

    static {
        String str;
        Package packageR = CoordinatorLayout.class.getPackage();
        if (packageR != null) {
            str = packageR.getName();
        } else {
            str = null;
        }
        f4853C = str;
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [java.lang.Object, K.o] */
    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        int[] iArr = C1053a.f12332a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f4866r = intArray;
            float f6 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr2 = this.f4866r;
                iArr2[i2] = (int) (((float) iArr2[i2]) * f6);
            }
        }
        this.f4873y = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new C1091c(this));
        WeakHashMap weakHashMap = O.f1352a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) f4856G.a();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    public static void l(int i2, Rect rect, Rect rect2, C1092d dVar, int i5, int i6) {
        int i7;
        int i8;
        int i9 = dVar.f12493c;
        if (i9 == 0) {
            i9 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i9, i2);
        int i10 = dVar.d;
        if ((i10 & 7) == 0) {
            i10 |= 8388611;
        }
        if ((i10 & 112) == 0) {
            i10 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i10, i2);
        int i11 = absoluteGravity & 7;
        int i12 = absoluteGravity & 112;
        int i13 = absoluteGravity2 & 7;
        int i14 = absoluteGravity2 & 112;
        if (i13 == 1) {
            i7 = rect.left + (rect.width() / 2);
        } else if (i13 != 5) {
            i7 = rect.left;
        } else {
            i7 = rect.right;
        }
        if (i14 == 16) {
            i8 = rect.top + (rect.height() / 2);
        } else if (i14 != 80) {
            i8 = rect.top;
        } else {
            i8 = rect.bottom;
        }
        if (i11 == 1) {
            i7 -= i5 / 2;
        } else if (i11 != 5) {
            i7 -= i5;
        }
        if (i12 == 16) {
            i8 -= i6 / 2;
        } else if (i12 != 80) {
            i8 -= i6;
        }
        rect2.set(i7, i8, i5 + i7, i6 + i8);
    }

    public static C1092d n(View view) {
        C1092d dVar = (C1092d) view.getLayoutParams();
        if (!dVar.f12492b) {
            C1090b bVar = null;
            for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                bVar = (C1090b) cls.getAnnotation(C1090b.class);
                if (bVar != null) {
                    break;
                }
            }
            if (bVar != null) {
                try {
                    C1089a aVar = (C1089a) bVar.value().getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                    C1089a aVar2 = dVar.f12491a;
                    if (aVar2 != aVar) {
                        if (aVar2 != null) {
                            aVar2.e();
                        }
                        dVar.f12491a = aVar;
                        dVar.f12492b = true;
                        if (aVar != null) {
                            aVar.c(dVar);
                        }
                    }
                } catch (Exception e6) {
                    Log.e("CoordinatorLayout", "Default behavior class " + bVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e6);
                }
            }
            dVar.f12492b = true;
        }
        return dVar;
    }

    public static void u(View view, int i2) {
        C1092d dVar = (C1092d) view.getLayoutParams();
        int i5 = dVar.f12496i;
        if (i5 != i2) {
            WeakHashMap weakHashMap = O.f1352a;
            view.offsetLeftAndRight(i2 - i5);
            dVar.f12496i = i2;
        }
    }

    public static void v(View view, int i2) {
        C1092d dVar = (C1092d) view.getLayoutParams();
        int i5 = dVar.f12497j;
        if (i5 != i2) {
            WeakHashMap weakHashMap = O.f1352a;
            view.offsetTopAndBottom(i2 - i5);
            dVar.f12497j = i2;
        }
    }

    public final void a(View view, View view2, int i2, int i5) {
        C0075o oVar = this.f4858B;
        if (i5 == 1) {
            oVar.f1412b = i2;
        } else {
            oVar.f1411a = i2;
        }
        this.f4868t = view2;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            ((C1092d) getChildAt(i6).getLayoutParams()).getClass();
        }
    }

    public final void b(View view, int i2) {
        C0075o oVar = this.f4858B;
        if (i2 == 1) {
            oVar.f1412b = 0;
        } else {
            oVar.f1411a = 0;
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C1092d dVar = (C1092d) childAt.getLayoutParams();
            if (dVar.a(i2)) {
                C1089a aVar = dVar.f12491a;
                if (aVar != null) {
                    aVar.p(childAt, view, i2);
                }
                if (i2 == 0) {
                    dVar.f12500m = false;
                } else if (i2 == 1) {
                    dVar.f12501n = false;
                }
            }
        }
        this.f4868t = null;
    }

    public final void c(View view, int i2, int i5, int[] iArr, int i6) {
        C1089a aVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z3 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 8) {
                int i10 = i6;
            } else {
                C1092d dVar = (C1092d) childAt.getLayoutParams();
                if (dVar.a(i6) && (aVar = dVar.f12491a) != null) {
                    int[] iArr2 = this.f4862e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    int[] iArr3 = iArr2;
                    aVar.j(this, childAt, view, i2, i5, iArr2, i6);
                    if (i2 > 0) {
                        min = Math.max(i7, iArr3[0]);
                    } else {
                        min = Math.min(i7, iArr3[0]);
                    }
                    i7 = min;
                    if (i5 > 0) {
                        min2 = Math.max(i8, iArr3[1]);
                    } else {
                        min2 = Math.min(i8, iArr3[1]);
                    }
                    i8 = min2;
                    z3 = true;
                }
            }
        }
        iArr[0] = i7;
        iArr[1] = i8;
        if (z3) {
            p(1);
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof C1092d) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public final void d(View view, int i2, int i5, int i6, int i7, int i8, int[] iArr) {
        C1089a aVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z3 = false;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 8) {
                int i12 = i8;
            } else {
                C1092d dVar = (C1092d) childAt.getLayoutParams();
                if (dVar.a(i8) && (aVar = dVar.f12491a) != null) {
                    int[] iArr2 = this.f4862e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aVar.k(this, childAt, i5, i6, i7, iArr2);
                    if (i6 > 0) {
                        min = Math.max(i9, iArr2[0]);
                    } else {
                        min = Math.min(i9, iArr2[0]);
                    }
                    i9 = min;
                    if (i7 > 0) {
                        min2 = Math.max(i10, iArr2[1]);
                    } else {
                        min2 = Math.min(i10, iArr2[1]);
                    }
                    i10 = min2;
                    z3 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i9;
        iArr[1] = iArr[1] + i10;
        if (z3) {
            p(1);
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j6) {
        C1089a aVar = ((C1092d) view.getLayoutParams()).f12491a;
        if (aVar != null) {
            aVar.getClass();
        }
        return super.drawChild(canvas, view, j6);
    }

    public final void drawableStateChanged() {
        boolean z3;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f4873y;
        if (drawable == null || !drawable.isStateful()) {
            z3 = false;
        } else {
            z3 = drawable.setState(drawableState);
        }
        if (z3) {
            invalidate();
        }
    }

    public final void e(View view, int i2, int i5, int i6, int i7, int i8) {
        d(view, i2, i5, i6, i7, 0, this.f4863f);
    }

    public final boolean f(View view, View view2, int i2, int i5) {
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C1092d dVar = (C1092d) childAt.getLayoutParams();
                C1089a aVar = dVar.f12491a;
                if (aVar != null) {
                    boolean o6 = aVar.o(childAt, i2, i5);
                    z3 |= o6;
                    if (i5 == 0) {
                        dVar.f12500m = o6;
                    } else if (i5 == 1) {
                        dVar.f12501n = o6;
                    }
                } else if (i5 == 0) {
                    dVar.f12500m = false;
                } else if (i5 == 1) {
                    dVar.f12501n = false;
                }
            }
        }
        return z3;
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1092d();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1092d(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.f4859a);
    }

    public final v0 getLastWindowInsets() {
        return this.f4871w;
    }

    public int getNestedScrollAxes() {
        C0075o oVar = this.f4858B;
        return oVar.f1412b | oVar.f1411a;
    }

    public Drawable getStatusBarBackground() {
        return this.f4873y;
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(C1092d dVar, Rect rect, int i2, int i5) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + dVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - dVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + dVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i5) - dVar.bottomMargin));
        rect.set(max, max2, i2 + max, i5 + max2);
    }

    public final void i(View view, Rect rect, boolean z3) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z3) {
            k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        j jVar = (j) this.f4860b.f2712c;
        int i2 = jVar.f10226c;
        ArrayList arrayList = null;
        for (int i5 = 0; i5 < i2; i5++) {
            ArrayList arrayList2 = (ArrayList) jVar.j(i5);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(jVar.f(i5));
            }
        }
        ArrayList arrayList3 = this.d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = C1094f.f12504a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = C1094f.f12504a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        C1094f.a(this, view, matrix);
        ThreadLocal threadLocal3 = C1094f.f12505b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i2) {
        int[] iArr = this.f4866r;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        } else if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i2 + " out of range for " + this);
            return 0;
        }
    }

    public final boolean o(View view, int i2, int i5) {
        c cVar = f4856G;
        Rect g = g();
        k(view, g);
        try {
            return g.contains(i2, i5);
        } finally {
            g.setEmpty();
            cVar.c(g);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.f4870v) {
            if (this.f4869u == null) {
                this.f4869u = new e(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f4869u);
        }
        if (this.f4871w == null) {
            WeakHashMap weakHashMap = O.f1352a;
            if (getFitsSystemWindows()) {
                B.c(this);
            }
        }
        this.f4865q = true;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.f4870v && this.f4869u != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f4869u);
        }
        View view = this.f4868t;
        if (view != null) {
            b(view, 0);
        }
        this.f4865q = false;
    }

    public final void onDraw(Canvas canvas) {
        int i2;
        super.onDraw(canvas);
        if (this.f4872x && this.f4873y != null) {
            v0 v0Var = this.f4871w;
            if (v0Var != null) {
                i2 = v0Var.d();
            } else {
                i2 = 0;
            }
            if (i2 > 0) {
                this.f4873y.setBounds(0, 0, getWidth(), i2);
                this.f4873y.draw(canvas);
            }
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean r6 = r(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            t(true);
        }
        return r6;
    }

    public final void onLayout(boolean z3, int i2, int i5, int i6, int i7) {
        C1089a aVar;
        WeakHashMap weakHashMap = O.f1352a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f4859a;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            View view = (View) arrayList.get(i8);
            if (view.getVisibility() != 8 && ((aVar = ((C1092d) view.getLayoutParams()).f12491a) == null || !aVar.g(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0186, code lost:
        if (r0.h(r32, r20, r25, r8, r26) == false) goto L_0x01a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0189  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r33, int r34) {
        /*
            r32 = this;
            r6 = r32
            r7 = 1
            r32.s()
            int r0 = r32.getChildCount()
            r8 = 0
            r1 = r8
        L_0x000c:
            if (r1 >= r0) goto L_0x0031
            android.view.View r2 = r6.getChildAt(r1)
            S3.z r3 = r6.f4860b
            java.lang.Object r3 = r3.f2712c
            n.j r3 = (n.j) r3
            int r4 = r3.f10226c
            r5 = r8
        L_0x001b:
            if (r5 >= r4) goto L_0x002f
            java.lang.Object r9 = r3.j(r5)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 == 0) goto L_0x002d
            boolean r9 = r9.contains(r2)
            if (r9 == 0) goto L_0x002d
            r0 = r7
            goto L_0x0032
        L_0x002d:
            int r5 = r5 + r7
            goto L_0x001b
        L_0x002f:
            int r1 = r1 + r7
            goto L_0x000c
        L_0x0031:
            r0 = r8
        L_0x0032:
            boolean r1 = r6.f4870v
            if (r0 == r1) goto L_0x0066
            if (r0 == 0) goto L_0x0053
            boolean r0 = r6.f4865q
            if (r0 == 0) goto L_0x0050
            R0.e r0 = r6.f4869u
            if (r0 != 0) goto L_0x0047
            R0.e r0 = new R0.e
            r0.<init>((androidx.coordinatorlayout.widget.CoordinatorLayout) r6)
            r6.f4869u = r0
        L_0x0047:
            android.view.ViewTreeObserver r0 = r32.getViewTreeObserver()
            R0.e r1 = r6.f4869u
            r0.addOnPreDrawListener(r1)
        L_0x0050:
            r6.f4870v = r7
            goto L_0x0066
        L_0x0053:
            boolean r0 = r6.f4865q
            if (r0 == 0) goto L_0x0064
            R0.e r0 = r6.f4869u
            if (r0 == 0) goto L_0x0064
            android.view.ViewTreeObserver r0 = r32.getViewTreeObserver()
            R0.e r1 = r6.f4869u
            r0.removeOnPreDrawListener(r1)
        L_0x0064:
            r6.f4870v = r8
        L_0x0066:
            int r9 = r32.getPaddingLeft()
            int r0 = r32.getPaddingTop()
            int r10 = r32.getPaddingRight()
            int r1 = r32.getPaddingBottom()
            java.util.WeakHashMap r2 = K.O.f1352a
            int r11 = r32.getLayoutDirection()
            if (r11 != r7) goto L_0x0080
            r12 = r7
            goto L_0x0081
        L_0x0080:
            r12 = r8
        L_0x0081:
            int r13 = android.view.View.MeasureSpec.getMode(r33)
            int r14 = android.view.View.MeasureSpec.getSize(r33)
            int r15 = android.view.View.MeasureSpec.getMode(r34)
            int r16 = android.view.View.MeasureSpec.getSize(r34)
            int r17 = r9 + r10
            int r18 = r0 + r1
            int r0 = r32.getSuggestedMinimumWidth()
            int r1 = r32.getSuggestedMinimumHeight()
            K.v0 r2 = r6.f4871w
            if (r2 == 0) goto L_0x00aa
            boolean r2 = r32.getFitsSystemWindows()
            if (r2 == 0) goto L_0x00aa
            r19 = r7
            goto L_0x00ac
        L_0x00aa:
            r19 = r8
        L_0x00ac:
            java.util.ArrayList r5 = r6.f4859a
            int r4 = r5.size()
            r3 = r0
            r2 = r1
            r0 = r8
            r1 = r0
        L_0x00b6:
            if (r1 >= r4) goto L_0x01eb
            java.lang.Object r20 = r5.get(r1)
            android.view.View r20 = (android.view.View) r20
            int r7 = r20.getVisibility()
            r8 = 8
            if (r7 != r8) goto L_0x00d7
            r22 = r1
            r28 = r4
            r29 = r5
            r23 = r9
            r24 = r10
            r27 = r11
            r1 = 1
            r21 = 0
            goto L_0x01d9
        L_0x00d7:
            android.view.ViewGroup$LayoutParams r7 = r20.getLayoutParams()
            x.d r7 = (x.C1092d) r7
            int r8 = r7.f12494e
            if (r8 < 0) goto L_0x011e
            if (r13 == 0) goto L_0x011e
            int r8 = r6.m(r8)
            r22 = r0
            int r0 = r7.f12493c
            if (r0 != 0) goto L_0x00f0
            r0 = 8388661(0x800035, float:1.1755018E-38)
        L_0x00f0:
            int r0 = android.view.Gravity.getAbsoluteGravity(r0, r11)
            r0 = r0 & 7
            r23 = r1
            r1 = 3
            if (r0 != r1) goto L_0x00fd
            if (r12 == 0) goto L_0x0102
        L_0x00fd:
            r1 = 5
            if (r0 != r1) goto L_0x010c
            if (r12 == 0) goto L_0x010c
        L_0x0102:
            int r0 = r14 - r10
            int r0 = r0 - r8
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
        L_0x010a:
            r8 = r0
            goto L_0x0124
        L_0x010c:
            if (r0 != r1) goto L_0x0110
            if (r12 == 0) goto L_0x0115
        L_0x0110:
            r1 = 3
            if (r0 != r1) goto L_0x011c
            if (r12 == 0) goto L_0x011c
        L_0x0115:
            int r8 = r8 - r9
            r1 = 0
            int r0 = java.lang.Math.max(r1, r8)
            goto L_0x010a
        L_0x011c:
            r1 = 0
            goto L_0x0123
        L_0x011e:
            r22 = r0
            r23 = r1
            goto L_0x011c
        L_0x0123:
            r8 = r1
        L_0x0124:
            if (r19 == 0) goto L_0x0159
            boolean r0 = r20.getFitsSystemWindows()
            if (r0 != 0) goto L_0x0159
            K.v0 r0 = r6.f4871w
            int r0 = r0.b()
            K.v0 r1 = r6.f4871w
            int r1 = r1.c()
            int r1 = r1 + r0
            K.v0 r0 = r6.f4871w
            int r0 = r0.d()
            r24 = r2
            K.v0 r2 = r6.f4871w
            int r2 = r2.a()
            int r2 = r2 + r0
            int r0 = r14 - r1
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r1 = r16 - r2
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r15)
            r25 = r0
            r26 = r1
            goto L_0x015f
        L_0x0159:
            r24 = r2
            r25 = r33
            r26 = r34
        L_0x015f:
            x.a r0 = r7.f12491a
            if (r0 == 0) goto L_0x0189
            r2 = r22
            r22 = r23
            r21 = 0
            r1 = r32
            r23 = r9
            r9 = r2
            r30 = r24
            r24 = r10
            r10 = r30
            r2 = r20
            r27 = r11
            r11 = r3
            r3 = r25
            r28 = r4
            r4 = r8
            r29 = r5
            r5 = r26
            boolean r0 = r0.h(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x01ad
            goto L_0x01a0
        L_0x0189:
            r28 = r4
            r29 = r5
            r27 = r11
            r21 = 0
            r11 = r3
            r30 = r23
            r23 = r9
            r9 = r22
            r22 = r30
            r31 = r24
            r24 = r10
            r10 = r31
        L_0x01a0:
            r5 = 0
            r0 = r32
            r1 = r20
            r2 = r25
            r3 = r8
            r4 = r26
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
        L_0x01ad:
            int r0 = r20.getMeasuredWidth()
            int r0 = r0 + r17
            int r1 = r7.leftMargin
            int r0 = r0 + r1
            int r1 = r7.rightMargin
            int r0 = r0 + r1
            int r0 = java.lang.Math.max(r11, r0)
            int r1 = r20.getMeasuredHeight()
            int r1 = r1 + r18
            int r2 = r7.topMargin
            int r1 = r1 + r2
            int r2 = r7.bottomMargin
            int r1 = r1 + r2
            int r1 = java.lang.Math.max(r10, r1)
            int r2 = r20.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r9, r2)
            r3 = r0
            r0 = r2
            r2 = r1
            r1 = 1
        L_0x01d9:
            int r4 = r22 + 1
            r7 = r1
            r1 = r4
            r8 = r21
            r9 = r23
            r10 = r24
            r11 = r27
            r4 = r28
            r5 = r29
            goto L_0x00b6
        L_0x01eb:
            r9 = r0
            r10 = r2
            r11 = r3
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r9
            r1 = r33
            int r0 = android.view.View.resolveSizeAndState(r11, r1, r0)
            int r1 = r9 << 16
            r2 = r34
            int r1 = android.view.View.resolveSizeAndState(r10, r2, r1)
            r6.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public final boolean onNestedFling(View view, float f6, float f7, boolean z3) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                C1092d dVar = (C1092d) childAt.getLayoutParams();
                if (dVar.a(0)) {
                    C1089a aVar = dVar.f12491a;
                }
            }
        }
        return false;
    }

    public final boolean onNestedPreFling(View view, float f6, float f7) {
        C1089a aVar;
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                C1092d dVar = (C1092d) childAt.getLayoutParams();
                if (dVar.a(0) && (aVar = dVar.f12491a) != null) {
                    z3 |= aVar.i(view);
                }
            }
        }
        return z3;
    }

    public final void onNestedPreScroll(View view, int i2, int i5, int[] iArr) {
        c(view, i2, i5, iArr, 0);
    }

    public final void onNestedScroll(View view, int i2, int i5, int i6, int i7) {
        e(view, i2, i5, i6, i7, 0);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        a(view, view2, i2, 0);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C1093e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1093e eVar = (C1093e) parcelable;
        super.onRestoreInstanceState(eVar.f2792a);
        SparseArray sparseArray = eVar.f12503c;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            C1089a aVar = n(childAt).f12491a;
            if (!(id == -1 || aVar == null || (parcelable2 = (Parcelable) sparseArray.get(id)) == null)) {
                aVar.m(childAt, parcelable2);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.os.Parcelable, T.c, x.e] */
    public final Parcelable onSaveInstanceState() {
        Parcelable n2;
        ? cVar = new T.c(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            C1089a aVar = ((C1092d) childAt.getLayoutParams()).f12491a;
            if (!(id == -1 || aVar == null || (n2 = aVar.n(childAt)) == null)) {
                sparseArray.append(id, n2);
            }
        }
        cVar.f12503c = sparseArray;
        return cVar;
    }

    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return f(view, view2, i2, 0);
    }

    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f4867s
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0017
            boolean r3 = r0.r(r1, r4)
            if (r3 == 0) goto L_0x0015
            goto L_0x0018
        L_0x0015:
            r6 = r5
            goto L_0x002a
        L_0x0017:
            r3 = r5
        L_0x0018:
            android.view.View r6 = r0.f4867s
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            x.d r6 = (x.C1092d) r6
            x.a r6 = r6.f12491a
            if (r6 == 0) goto L_0x0015
            android.view.View r7 = r0.f4867s
            boolean r6 = r6.q(r7, r1)
        L_0x002a:
            android.view.View r7 = r0.f4867s
            r8 = 0
            if (r7 != 0) goto L_0x0035
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x0048
        L_0x0035:
            if (r3 == 0) goto L_0x0048
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x0048:
            if (r8 == 0) goto L_0x004d
            r8.recycle()
        L_0x004d:
            if (r2 == r4) goto L_0x0052
            r1 = 3
            if (r2 != r1) goto L_0x0055
        L_0x0052:
            r0.t(r5)
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x004b A[EDGE_INSN: B:127:0x004b->B:8:0x004b ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p(int r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            java.util.WeakHashMap r7 = K.O.f1352a
            int r7 = r25.getLayoutDirection()
            java.util.ArrayList r14 = r0.f4859a
            int r15 = r14.size()
            android.graphics.Rect r13 = g()
            android.graphics.Rect r12 = g()
            android.graphics.Rect r11 = g()
            r9 = 0
        L_0x001d:
            J.c r8 = f4856G
            if (r9 >= r15) goto L_0x0303
            java.lang.Object r16 = r14.get(r9)
            r2 = r16
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r16 = r2.getLayoutParams()
            r3 = r16
            x.d r3 = (x.C1092d) r3
            if (r1 != 0) goto L_0x004e
            int r4 = r2.getVisibility()
            r5 = 8
            if (r4 != r5) goto L_0x004e
            r5 = r1
            r6 = r7
            r21 = r9
            r8 = r11
            r4 = r12
            r7 = r13
            r13 = r14
            r1 = r15
            r9 = 48
            r10 = 0
            r11 = 80
            r12 = 3
            r14 = 5
        L_0x004b:
            r15 = 1
            goto L_0x02f7
        L_0x004e:
            r4 = 0
        L_0x004f:
            if (r4 >= r9) goto L_0x0114
            java.lang.Object r5 = r14.get(r4)
            android.view.View r5 = (android.view.View) r5
            android.view.View r6 = r3.f12499l
            if (r6 != r5) goto L_0x00ec
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            x.d r5 = (x.C1092d) r5
            android.view.View r6 = r5.f12498k
            if (r6 == 0) goto L_0x00ec
            android.graphics.Rect r6 = g()
            android.graphics.Rect r10 = g()
            r18 = r14
            android.graphics.Rect r14 = g()
            r19 = r8
            android.view.View r8 = r5.f12498k
            r0.k(r8, r6)
            r8 = 0
            r0.i(r2, r10, r8)
            r17 = r15
            int r15 = r2.getMeasuredWidth()
            int r1 = r2.getMeasuredHeight()
            r20 = r3
            r3 = r19
            r19 = r8
            r8 = r7
            r21 = r9
            r9 = r6
            r19 = r7
            r7 = r10
            r10 = r14
            r22 = r11
            r11 = r5
            r23 = r12
            r12 = r15
            r24 = r13
            r13 = r1
            l(r8, r9, r10, r11, r12, r13)
            int r8 = r14.left
            int r9 = r7.left
            if (r8 != r9) goto L_0x00b1
            int r8 = r14.top
            int r9 = r7.top
            if (r8 == r9) goto L_0x00af
            goto L_0x00b1
        L_0x00af:
            r10 = 0
            goto L_0x00b2
        L_0x00b1:
            r10 = 1
        L_0x00b2:
            r0.h(r5, r14, r15, r1)
            int r1 = r14.left
            int r8 = r7.left
            int r1 = r1 - r8
            int r8 = r14.top
            int r9 = r7.top
            int r8 = r8 - r9
            if (r1 == 0) goto L_0x00c6
            java.util.WeakHashMap r9 = K.O.f1352a
            r2.offsetLeftAndRight(r1)
        L_0x00c6:
            if (r8 == 0) goto L_0x00cd
            java.util.WeakHashMap r1 = K.O.f1352a
            r2.offsetTopAndBottom(r8)
        L_0x00cd:
            if (r10 == 0) goto L_0x00d8
            x.a r1 = r5.f12491a
            if (r1 == 0) goto L_0x00d8
            android.view.View r5 = r5.f12498k
            r1.d(r0, r2, r5)
        L_0x00d8:
            r6.setEmpty()
            r3.c(r6)
            r7.setEmpty()
            r3.c(r7)
            r14.setEmpty()
            r3.c(r14)
        L_0x00ea:
            r1 = 1
            goto L_0x00fe
        L_0x00ec:
            r20 = r3
            r19 = r7
            r3 = r8
            r21 = r9
            r22 = r11
            r23 = r12
            r24 = r13
            r18 = r14
            r17 = r15
            goto L_0x00ea
        L_0x00fe:
            int r4 = r4 + r1
            r1 = r26
            r8 = r3
            r15 = r17
            r14 = r18
            r7 = r19
            r3 = r20
            r9 = r21
            r11 = r22
            r12 = r23
            r13 = r24
            goto L_0x004f
        L_0x0114:
            r20 = r3
            r19 = r7
            r3 = r8
            r21 = r9
            r22 = r11
            r4 = r12
            r24 = r13
            r18 = r14
            r17 = r15
            r1 = 1
            r0.i(r2, r4, r1)
            r1 = r20
            int r5 = r1.g
            if (r5 == 0) goto L_0x018b
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x018b
            int r5 = r1.g
            r6 = r19
            int r5 = android.view.Gravity.getAbsoluteGravity(r5, r6)
            r7 = r5 & 112(0x70, float:1.57E-43)
            r8 = 48
            if (r7 == r8) goto L_0x015b
            r8 = 80
            if (r7 == r8) goto L_0x0149
            r7 = r24
            goto L_0x0167
        L_0x0149:
            r7 = r24
            int r8 = r7.bottom
            int r9 = r25.getHeight()
            int r10 = r4.top
            int r9 = r9 - r10
            int r8 = java.lang.Math.max(r8, r9)
            r7.bottom = r8
            goto L_0x0167
        L_0x015b:
            r7 = r24
            int r8 = r7.top
            int r9 = r4.bottom
            int r8 = java.lang.Math.max(r8, r9)
            r7.top = r8
        L_0x0167:
            r5 = r5 & 7
            r8 = 3
            if (r5 == r8) goto L_0x0180
            r8 = 5
            if (r5 == r8) goto L_0x0170
            goto L_0x018f
        L_0x0170:
            int r5 = r7.right
            int r8 = r25.getWidth()
            int r9 = r4.left
            int r8 = r8 - r9
            int r5 = java.lang.Math.max(r5, r8)
            r7.right = r5
            goto L_0x018f
        L_0x0180:
            int r5 = r7.left
            int r8 = r4.right
            int r5 = java.lang.Math.max(r5, r8)
            r7.left = r5
            goto L_0x018f
        L_0x018b:
            r6 = r19
            r7 = r24
        L_0x018f:
            int r1 = r1.h
            if (r1 == 0) goto L_0x02a2
            int r1 = r2.getVisibility()
            if (r1 != 0) goto L_0x02a2
            java.util.WeakHashMap r1 = K.O.f1352a
            boolean r1 = r2.isLaidOut()
            if (r1 != 0) goto L_0x01a3
            goto L_0x02a2
        L_0x01a3:
            int r1 = r2.getWidth()
            if (r1 <= 0) goto L_0x02a2
            int r1 = r2.getHeight()
            if (r1 > 0) goto L_0x01b1
            goto L_0x02a2
        L_0x01b1:
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            x.d r1 = (x.C1092d) r1
            x.a r5 = r1.f12491a
            android.graphics.Rect r8 = g()
            android.graphics.Rect r9 = g()
            int r10 = r2.getLeft()
            int r11 = r2.getTop()
            int r12 = r2.getRight()
            int r13 = r2.getBottom()
            r9.set(r10, r11, r12, r13)
            if (r5 == 0) goto L_0x0207
            boolean r5 = r5.a(r2)
            if (r5 == 0) goto L_0x0207
            boolean r5 = r9.contains(r8)
            if (r5 == 0) goto L_0x01e3
            goto L_0x020a
        L_0x01e3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Rect should be within the child's bounds. Rect:"
            r2.<init>(r3)
            java.lang.String r3 = r8.toShortString()
            r2.append(r3)
            java.lang.String r3 = " | Bounds:"
            r2.append(r3)
            java.lang.String r3 = r9.toShortString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0207:
            r8.set(r9)
        L_0x020a:
            r9.setEmpty()
            r3.c(r9)
            boolean r5 = r8.isEmpty()
            if (r5 == 0) goto L_0x021e
            r8.setEmpty()
            r3.c(r8)
            goto L_0x02a2
        L_0x021e:
            int r5 = r1.h
            int r5 = android.view.Gravity.getAbsoluteGravity(r5, r6)
            r9 = 48
            r10 = r5 & 48
            if (r10 != r9) goto L_0x023e
            int r10 = r8.top
            int r11 = r1.topMargin
            int r10 = r10 - r11
            int r11 = r1.f12497j
            int r10 = r10 - r11
            int r11 = r7.top
            if (r10 >= r11) goto L_0x023e
            int r11 = r11 - r10
            v(r2, r11)
            r10 = 1
        L_0x023b:
            r11 = 80
            goto L_0x0240
        L_0x023e:
            r10 = 0
            goto L_0x023b
        L_0x0240:
            r12 = r5 & 80
            if (r12 != r11) goto L_0x025a
            int r12 = r25.getHeight()
            int r13 = r8.bottom
            int r12 = r12 - r13
            int r13 = r1.bottomMargin
            int r12 = r12 - r13
            int r13 = r1.f12497j
            int r12 = r12 + r13
            int r13 = r7.bottom
            if (r12 >= r13) goto L_0x025a
            int r12 = r12 - r13
            v(r2, r12)
            r10 = 1
        L_0x025a:
            if (r10 != 0) goto L_0x0262
            r10 = 0
            v(r2, r10)
        L_0x0260:
            r12 = 3
            goto L_0x0264
        L_0x0262:
            r10 = 0
            goto L_0x0260
        L_0x0264:
            r13 = r5 & 3
            if (r13 != r12) goto L_0x027b
            int r13 = r8.left
            int r14 = r1.leftMargin
            int r13 = r13 - r14
            int r14 = r1.f12496i
            int r13 = r13 - r14
            int r14 = r7.left
            if (r13 >= r14) goto L_0x027b
            int r14 = r14 - r13
            u(r2, r14)
            r13 = 1
        L_0x0279:
            r14 = 5
            goto L_0x027d
        L_0x027b:
            r13 = r10
            goto L_0x0279
        L_0x027d:
            r5 = r5 & r14
            if (r5 != r14) goto L_0x0296
            int r5 = r25.getWidth()
            int r15 = r8.right
            int r5 = r5 - r15
            int r15 = r1.rightMargin
            int r5 = r5 - r15
            int r1 = r1.f12496i
            int r5 = r5 + r1
            int r1 = r7.right
            if (r5 >= r1) goto L_0x0296
            int r5 = r5 - r1
            u(r2, r5)
            r13 = 1
        L_0x0296:
            if (r13 != 0) goto L_0x029b
            u(r2, r10)
        L_0x029b:
            r8.setEmpty()
            r3.c(r8)
            goto L_0x02a9
        L_0x02a2:
            r9 = 48
            r10 = 0
            r11 = 80
            r12 = 3
            r14 = 5
        L_0x02a9:
            r1 = 2
            r5 = r26
            if (r5 == r1) goto L_0x02d4
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            x.d r1 = (x.C1092d) r1
            android.graphics.Rect r1 = r1.f12502o
            r8 = r22
            r8.set(r1)
            boolean r1 = r8.equals(r4)
            if (r1 == 0) goto L_0x02c7
            r1 = r17
            r13 = r18
            goto L_0x004b
        L_0x02c7:
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            x.d r1 = (x.C1092d) r1
            android.graphics.Rect r1 = r1.f12502o
            r1.set(r4)
        L_0x02d2:
            r1 = 1
            goto L_0x02d7
        L_0x02d4:
            r8 = r22
            goto L_0x02d2
        L_0x02d7:
            int r2 = r21 + 1
            r1 = r17
        L_0x02db:
            r13 = r18
            if (r2 >= r1) goto L_0x004b
            java.lang.Object r3 = r13.get(r2)
            android.view.View r3 = (android.view.View) r3
            android.view.ViewGroup$LayoutParams r15 = r3.getLayoutParams()
            x.d r15 = (x.C1092d) r15
            x.a r15 = r15.f12491a
            if (r15 == 0) goto L_0x02f2
            r15.b(r3)
        L_0x02f2:
            r15 = 1
            int r2 = r2 + r15
            r18 = r13
            goto L_0x02db
        L_0x02f7:
            int r2 = r21 + 1
            r15 = r1
            r9 = r2
            r12 = r4
            r1 = r5
            r11 = r8
            r14 = r13
            r13 = r7
            r7 = r6
            goto L_0x001d
        L_0x0303:
            r3 = r8
            r8 = r11
            r4 = r12
            r7 = r13
            r7.setEmpty()
            r3.c(r7)
            r4.setEmpty()
            r3.c(r4)
            r8.setEmpty()
            r3.c(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.p(int):void");
    }

    public final void q(View view, int i2) {
        int i5;
        C1092d dVar = (C1092d) view.getLayoutParams();
        View view2 = dVar.f12498k;
        if (view2 != null || dVar.f12495f == -1) {
            c cVar = f4856G;
            if (view2 != null) {
                Rect g = g();
                Rect g5 = g();
                try {
                    k(view2, g);
                    C1092d dVar2 = (C1092d) view.getLayoutParams();
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    l(i2, g, g5, dVar2, measuredWidth, measuredHeight);
                    h(dVar2, g5, measuredWidth, measuredHeight);
                    view.layout(g5.left, g5.top, g5.right, g5.bottom);
                } finally {
                    g.setEmpty();
                    cVar.c(g);
                    g5.setEmpty();
                    cVar.c(g5);
                }
            } else {
                int i6 = dVar.f12494e;
                if (i6 >= 0) {
                    C1092d dVar3 = (C1092d) view.getLayoutParams();
                    int i7 = dVar3.f12493c;
                    if (i7 == 0) {
                        i7 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i7, i2);
                    int i8 = absoluteGravity & 7;
                    int i9 = absoluteGravity & 112;
                    int width = getWidth();
                    int height = getHeight();
                    int measuredWidth2 = view.getMeasuredWidth();
                    int measuredHeight2 = view.getMeasuredHeight();
                    if (i2 == 1) {
                        i6 = width - i6;
                    }
                    int m6 = m(i6) - measuredWidth2;
                    if (i8 == 1) {
                        m6 += measuredWidth2 / 2;
                    } else if (i8 == 5) {
                        m6 += measuredWidth2;
                    }
                    if (i9 == 16) {
                        i5 = measuredHeight2 / 2;
                    } else if (i9 != 80) {
                        i5 = 0;
                    } else {
                        i5 = measuredHeight2;
                    }
                    int max = Math.max(getPaddingLeft() + dVar3.leftMargin, Math.min(m6, ((width - getPaddingRight()) - measuredWidth2) - dVar3.rightMargin));
                    int max2 = Math.max(getPaddingTop() + dVar3.topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight2) - dVar3.bottomMargin));
                    view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                    return;
                }
                C1092d dVar4 = (C1092d) view.getLayoutParams();
                Rect g6 = g();
                g6.set(getPaddingLeft() + dVar4.leftMargin, getPaddingTop() + dVar4.topMargin, (getWidth() - getPaddingRight()) - dVar4.rightMargin, (getHeight() - getPaddingBottom()) - dVar4.bottomMargin);
                if (this.f4871w != null) {
                    WeakHashMap weakHashMap = O.f1352a;
                    if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                        g6.left = this.f4871w.b() + g6.left;
                        g6.top = this.f4871w.d() + g6.top;
                        g6.right -= this.f4871w.c();
                        g6.bottom -= this.f4871w.a();
                    }
                }
                Rect g7 = g();
                int i10 = dVar4.f12493c;
                if ((i10 & 7) == 0) {
                    i10 |= 8388611;
                }
                if ((i10 & 112) == 0) {
                    i10 |= 48;
                }
                Gravity.apply(i10, view.getMeasuredWidth(), view.getMeasuredHeight(), g6, g7, i2);
                view.layout(g7.left, g7.top, g7.right, g7.bottom);
                g6.setEmpty();
                cVar.c(g6);
                g7.setEmpty();
                cVar.c(g7);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    public final boolean r(MotionEvent motionEvent, int i2) {
        int i5;
        MotionEvent motionEvent2 = motionEvent;
        int i6 = i2;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f4861c;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i7 = childCount - 1; i7 >= 0; i7--) {
            if (isChildrenDrawingOrderEnabled) {
                i5 = getChildDrawingOrder(childCount, i7);
            } else {
                i5 = i7;
            }
            arrayList.add(getChildAt(i5));
        }
        i iVar = F;
        if (iVar != null) {
            Collections.sort(arrayList, iVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent3 = null;
        boolean z3 = false;
        for (int i8 = 0; i8 < size; i8++) {
            View view = (View) arrayList.get(i8);
            C1089a aVar = ((C1092d) view.getLayoutParams()).f12491a;
            if (z3 && actionMasked != 0) {
                if (aVar != null) {
                    if (motionEvent3 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i6 == 0) {
                        aVar.f(this, view, motionEvent3);
                    } else if (i6 == 1) {
                        aVar.q(view, motionEvent3);
                    }
                }
            } else if (!z3 && aVar != null) {
                if (i6 == 0) {
                    z3 = aVar.f(this, view, motionEvent2);
                } else if (i6 == 1) {
                    z3 = aVar.q(view, motionEvent2);
                }
                if (z3) {
                    this.f4867s = view;
                }
            }
        }
        arrayList.clear();
        return z3;
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        C1089a aVar = ((C1092d) view.getLayoutParams()).f12491a;
        if (aVar != null) {
            aVar.l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z3);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        super.requestDisallowInterceptTouchEvent(z3);
        if (z3 && !this.f4864p) {
            t(false);
            this.f4864p = true;
        }
    }

    public final void s() {
        b bVar;
        ArrayList arrayList = this.f4859a;
        arrayList.clear();
        z zVar = this.f4860b;
        j jVar = (j) zVar.f2712c;
        int i2 = jVar.f10226c;
        int i5 = 0;
        while (true) {
            bVar = (b) zVar.f2711b;
            if (i5 >= i2) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) jVar.j(i5);
            if (arrayList2 != null) {
                arrayList2.clear();
                bVar.c(arrayList2);
            }
            i5++;
        }
        jVar.clear();
        int childCount = getChildCount();
        int i6 = 0;
        loop1:
        while (true) {
            j jVar2 = (j) zVar.f2712c;
            if (i6 < childCount) {
                View childAt = getChildAt(i6);
                C1092d n2 = n(childAt);
                int i7 = n2.f12495f;
                if (i7 == -1) {
                    n2.f12499l = null;
                    n2.f12498k = null;
                } else {
                    View view = n2.f12498k;
                    if (view != null && view.getId() == i7) {
                        View view2 = n2.f12498k;
                        ViewParent parent = view2.getParent();
                        while (parent != this) {
                            if (parent == null || parent == childAt) {
                                n2.f12499l = null;
                                n2.f12498k = null;
                            } else {
                                if (parent instanceof View) {
                                    view2 = (View) parent;
                                }
                                parent = parent.getParent();
                            }
                        }
                        n2.f12499l = view2;
                    }
                    View findViewById = findViewById(i7);
                    n2.f12498k = findViewById;
                    if (findViewById != null) {
                        if (findViewById != this) {
                            ViewParent parent2 = findViewById.getParent();
                            while (true) {
                                if (parent2 == this || parent2 == null) {
                                    n2.f12499l = findViewById;
                                } else if (parent2 != childAt) {
                                    if (parent2 instanceof View) {
                                        findViewById = (View) parent2;
                                    }
                                    parent2 = parent2.getParent();
                                } else if (isInEditMode()) {
                                    n2.f12499l = null;
                                    n2.f12498k = null;
                                } else {
                                    throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                                }
                            }
                        } else if (isInEditMode()) {
                            n2.f12499l = null;
                            n2.f12498k = null;
                        } else {
                            throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                        }
                    } else if (isInEditMode()) {
                        n2.f12499l = null;
                        n2.f12498k = null;
                    } else {
                        throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i7) + " to anchor view " + childAt);
                    }
                }
                if (!jVar2.containsKey(childAt)) {
                    jVar2.put(childAt, (Object) null);
                }
                for (int i8 = 0; i8 < childCount; i8++) {
                    if (i8 != i6) {
                        View childAt2 = getChildAt(i8);
                        if (childAt2 != n2.f12499l) {
                            WeakHashMap weakHashMap = O.f1352a;
                            int layoutDirection = getLayoutDirection();
                            int absoluteGravity = Gravity.getAbsoluteGravity(((C1092d) childAt2.getLayoutParams()).g, layoutDirection);
                            if (absoluteGravity == 0 || (Gravity.getAbsoluteGravity(n2.h, layoutDirection) & absoluteGravity) != absoluteGravity) {
                                C1089a aVar = n2.f12491a;
                                if (aVar != null) {
                                    aVar.b(childAt);
                                }
                            }
                        }
                        if (!jVar2.containsKey(childAt2) && !jVar2.containsKey(childAt2)) {
                            jVar2.put(childAt2, (Object) null);
                        }
                        if (jVar2.containsKey(childAt2) && jVar2.containsKey(childAt)) {
                            ArrayList arrayList3 = (ArrayList) jVar2.get(childAt2);
                            if (arrayList3 == null) {
                                arrayList3 = (ArrayList) bVar.a();
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                jVar2.put(childAt2, arrayList3);
                            }
                            arrayList3.add(childAt);
                        }
                    }
                }
                i6++;
            } else {
                ArrayList arrayList4 = (ArrayList) zVar.d;
                arrayList4.clear();
                HashSet hashSet = (HashSet) zVar.f2713e;
                hashSet.clear();
                int i9 = jVar2.f10226c;
                for (int i10 = 0; i10 < i9; i10++) {
                    zVar.p(jVar2.f(i10), arrayList4, hashSet);
                }
                arrayList.addAll(arrayList4);
                Collections.reverse(arrayList);
                return;
            }
        }
        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
    }

    public void setFitsSystemWindows(boolean z3) {
        super.setFitsSystemWindows(z3);
        w();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f4874z = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z3;
        Drawable drawable2 = this.f4873y;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f4873y = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f4873y.setState(getDrawableState());
                }
                Drawable drawable4 = this.f4873y;
                WeakHashMap weakHashMap = O.f1352a;
                D.b.b(drawable4, getLayoutDirection());
                Drawable drawable5 = this.f4873y;
                if (getVisibility() == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                drawable5.setVisible(z3, false);
                this.f4873y.setCallback(this);
            }
            WeakHashMap weakHashMap2 = O.f1352a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i2) {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(int i2) {
        Drawable drawable;
        if (i2 != 0) {
            drawable = h.getDrawable(getContext(), i2);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    public void setVisibility(int i2) {
        boolean z3;
        super.setVisibility(i2);
        if (i2 == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Drawable drawable = this.f4873y;
        if (drawable != null && drawable.isVisible() != z3) {
            this.f4873y.setVisible(z3, false);
        }
    }

    public final void t(boolean z3) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C1089a aVar = ((C1092d) childAt.getLayoutParams()).f12491a;
            if (aVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z3) {
                    aVar.f(this, childAt, obtain);
                } else {
                    aVar.q(childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            ((C1092d) getChildAt(i5).getLayoutParams()).getClass();
        }
        this.f4867s = null;
        this.f4864p = false;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f4873y) {
            return true;
        }
        return false;
    }

    public final void w() {
        WeakHashMap weakHashMap = O.f1352a;
        if (getFitsSystemWindows()) {
            if (this.f4857A == null) {
                this.f4857A = new C0724m(this, 19);
            }
            D.u(this, this.f4857A);
            setSystemUiVisibility(1280);
            return;
        }
        D.u(this, (C0076p) null);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C1092d) {
            return new C1092d((C1092d) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C1092d((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C1092d(layoutParams);
    }
}
