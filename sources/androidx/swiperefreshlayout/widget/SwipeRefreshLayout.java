package androidx.swiperefreshlayout.widget;

import K.C0072l;
import K.C0073m;
import K.C0074n;
import K.C0075o;
import K.D;
import K.O;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ListView;
import java.util.WeakHashMap;
import q0.C0930a;
import r0.C0940a;
import r0.C0943d;
import r0.C0944e;
import r0.C0945f;
import r0.g;
import r0.h;
import r0.i;
import r0.j;
import r0.k;

public class SwipeRefreshLayout extends ViewGroup implements C0074n, C0073m {

    /* renamed from: T  reason: collision with root package name */
    public static final int[] f5412T = {16842766};

    /* renamed from: A  reason: collision with root package name */
    public int f5413A = -1;

    /* renamed from: B  reason: collision with root package name */
    public final DecelerateInterpolator f5414B;

    /* renamed from: C  reason: collision with root package name */
    public final C0940a f5415C;

    /* renamed from: D  reason: collision with root package name */
    public int f5416D = -1;

    /* renamed from: E  reason: collision with root package name */
    public int f5417E;
    public final int F;

    /* renamed from: G  reason: collision with root package name */
    public final int f5418G;

    /* renamed from: H  reason: collision with root package name */
    public int f5419H;

    /* renamed from: I  reason: collision with root package name */
    public final C0944e f5420I;

    /* renamed from: J  reason: collision with root package name */
    public g f5421J;

    /* renamed from: K  reason: collision with root package name */
    public g f5422K;

    /* renamed from: L  reason: collision with root package name */
    public h f5423L;

    /* renamed from: M  reason: collision with root package name */
    public h f5424M;

    /* renamed from: N  reason: collision with root package name */
    public boolean f5425N;

    /* renamed from: O  reason: collision with root package name */
    public int f5426O;

    /* renamed from: P  reason: collision with root package name */
    public boolean f5427P;

    /* renamed from: Q  reason: collision with root package name */
    public final C0945f f5428Q = new C0945f(this, 0);

    /* renamed from: R  reason: collision with root package name */
    public final g f5429R = new g(this, 2);

    /* renamed from: S  reason: collision with root package name */
    public final g f5430S = new g(this, 3);

    /* renamed from: a  reason: collision with root package name */
    public View f5431a;

    /* renamed from: b  reason: collision with root package name */
    public j f5432b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5433c = false;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public float f5434e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    public float f5435f;

    /* renamed from: p  reason: collision with root package name */
    public final C0075o f5436p;

    /* renamed from: q  reason: collision with root package name */
    public final C0072l f5437q;

    /* renamed from: r  reason: collision with root package name */
    public final int[] f5438r = new int[2];

    /* renamed from: s  reason: collision with root package name */
    public final int[] f5439s = new int[2];

    /* renamed from: t  reason: collision with root package name */
    public final int[] f5440t = new int[2];

    /* renamed from: u  reason: collision with root package name */
    public boolean f5441u;

    /* renamed from: v  reason: collision with root package name */
    public final int f5442v;

    /* renamed from: w  reason: collision with root package name */
    public int f5443w;

    /* renamed from: x  reason: collision with root package name */
    public float f5444x;

    /* renamed from: y  reason: collision with root package name */
    public float f5445y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f5446z;

    /* JADX WARNING: type inference failed for: r2v12, types: [r0.a, android.widget.ImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v14, types: [java.lang.Object, K.o] */
    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f5442v = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f5414B = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f5426O = (int) (displayMetrics.density * 40.0f);
        ? imageView = new ImageView(getContext());
        float f6 = imageView.getContext().getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = imageView.getContext().obtainStyledAttributes(C0930a.f11074a);
        imageView.f11128b = obtainStyledAttributes.getColor(0, -328966);
        obtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap weakHashMap = O.f1352a;
        D.s(imageView, f6 * 4.0f);
        shapeDrawable.getPaint().setColor(imageView.f11128b);
        imageView.setBackground(shapeDrawable);
        this.f5415C = imageView;
        C0944e eVar = new C0944e(getContext());
        this.f5420I = eVar;
        eVar.c(1);
        this.f5415C.setImageDrawable(this.f5420I);
        this.f5415C.setVisibility(8);
        addView(this.f5415C);
        setChildrenDrawingOrderEnabled(true);
        int i2 = (int) (displayMetrics.density * 64.0f);
        this.f5418G = i2;
        this.f5434e = (float) i2;
        this.f5436p = new Object();
        this.f5437q = new C0072l(this);
        setNestedScrollingEnabled(true);
        int i5 = -this.f5426O;
        this.f5443w = i5;
        this.F = i5;
        k(1.0f);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f5412T);
        setEnabled(obtainStyledAttributes2.getBoolean(0, true));
        obtainStyledAttributes2.recycle();
    }

    private void setColorViewAlpha(int i2) {
        this.f5415C.getBackground().setAlpha(i2);
        this.f5420I.setAlpha(i2);
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
        if (i6 == 0) {
            onNestedPreScroll(view, i2, i5, iArr);
        }
    }

    public final void d(View view, int i2, int i5, int i6, int i7, int i8, int[] iArr) {
        int i9;
        if (i8 == 0) {
            int i10 = iArr[1];
            if (i8 == 0) {
                this.f5437q.d(i2, i5, i6, i7, this.f5439s, i8, iArr);
            }
            int i11 = i7 - (iArr[1] - i10);
            if (i11 == 0) {
                i9 = i7 + this.f5439s[1];
            } else {
                i9 = i11;
            }
            if (i9 < 0 && !g()) {
                float abs = this.f5435f + ((float) Math.abs(i9));
                this.f5435f = abs;
                j(abs);
                iArr[1] = iArr[1] + i11;
            }
        }
    }

    public final boolean dispatchNestedFling(float f6, float f7, boolean z3) {
        return this.f5437q.a(f6, f7, z3);
    }

    public final boolean dispatchNestedPreFling(float f6, float f7) {
        return this.f5437q.b(f6, f7);
    }

    public final boolean dispatchNestedPreScroll(int i2, int i5, int[] iArr, int[] iArr2) {
        return this.f5437q.c(i2, i5, 0, iArr, iArr2);
    }

    public final boolean dispatchNestedScroll(int i2, int i5, int i6, int i7, int[] iArr) {
        return this.f5437q.d(i2, i5, i6, i7, iArr, 0, (int[]) null);
    }

    public final void e(View view, int i2, int i5, int i6, int i7, int i8) {
        d(view, i2, i5, i6, i7, i8, this.f5440t);
    }

    public final boolean f(View view, View view2, int i2, int i5) {
        if (i5 == 0) {
            return onStartNestedScroll(view, view2, i2);
        }
        return false;
    }

    public final boolean g() {
        View view = this.f5431a;
        if (view instanceof ListView) {
            return ((ListView) view).canScrollList(-1);
        }
        return view.canScrollVertically(-1);
    }

    public final int getChildDrawingOrder(int i2, int i5) {
        int i6 = this.f5416D;
        if (i6 < 0) {
            return i5;
        }
        if (i5 == i2 - 1) {
            return i6;
        }
        if (i5 >= i6) {
            return i5 + 1;
        }
        return i5;
    }

    public int getNestedScrollAxes() {
        C0075o oVar = this.f5436p;
        return oVar.f1412b | oVar.f1411a;
    }

    public int getProgressCircleDiameter() {
        return this.f5426O;
    }

    public int getProgressViewEndOffset() {
        return this.f5418G;
    }

    public int getProgressViewStartOffset() {
        return this.F;
    }

    public final void h() {
        if (this.f5431a == null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (!childAt.equals(this.f5415C)) {
                    this.f5431a = childAt;
                    return;
                }
            }
        }
    }

    public final boolean hasNestedScrollingParent() {
        return this.f5437q.f(0);
    }

    public final void i(float f6) {
        if (f6 > this.f5434e) {
            m(true, true);
            return;
        }
        this.f5433c = false;
        C0944e eVar = this.f5420I;
        C0943d dVar = eVar.f11154a;
        dVar.f11136e = 0.0f;
        dVar.f11137f = 0.0f;
        eVar.invalidateSelf();
        C0945f fVar = new C0945f(this, 1);
        this.f5417E = this.f5443w;
        g gVar = this.f5430S;
        gVar.reset();
        gVar.setDuration(200);
        gVar.setInterpolator(this.f5414B);
        C0940a aVar = this.f5415C;
        aVar.f11127a = fVar;
        aVar.clearAnimation();
        this.f5415C.startAnimation(gVar);
        C0944e eVar2 = this.f5420I;
        C0943d dVar2 = eVar2.f11154a;
        if (dVar2.f11143n) {
            dVar2.f11143n = false;
        }
        eVar2.invalidateSelf();
    }

    public final boolean isNestedScrollingEnabled() {
        return this.f5437q.d;
    }

    public final void j(float f6) {
        h hVar;
        h hVar2;
        C0944e eVar = this.f5420I;
        C0943d dVar = eVar.f11154a;
        if (!dVar.f11143n) {
            dVar.f11143n = true;
        }
        eVar.invalidateSelf();
        float min = Math.min(1.0f, Math.abs(f6 / this.f5434e));
        float max = (((float) Math.max(((double) min) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f6) - this.f5434e;
        int i2 = this.f5419H;
        if (i2 <= 0) {
            i2 = this.f5418G;
        }
        float f7 = (float) i2;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f7 * 2.0f) / f7) / 4.0f);
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i5 = this.F + ((int) ((f7 * min) + (f7 * pow * 2.0f)));
        if (this.f5415C.getVisibility() != 0) {
            this.f5415C.setVisibility(0);
        }
        this.f5415C.setScaleX(1.0f);
        this.f5415C.setScaleY(1.0f);
        if (f6 < this.f5434e) {
            if (this.f5420I.f11154a.f11149t > 76 && ((hVar2 = this.f5423L) == null || !hVar2.hasStarted() || hVar2.hasEnded())) {
                h hVar3 = new h(this, this.f5420I.f11154a.f11149t, 76);
                hVar3.setDuration(300);
                C0940a aVar = this.f5415C;
                aVar.f11127a = null;
                aVar.clearAnimation();
                this.f5415C.startAnimation(hVar3);
                this.f5423L = hVar3;
            }
        } else if (this.f5420I.f11154a.f11149t < 255 && ((hVar = this.f5424M) == null || !hVar.hasStarted() || hVar.hasEnded())) {
            h hVar4 = new h(this, this.f5420I.f11154a.f11149t, 255);
            hVar4.setDuration(300);
            C0940a aVar2 = this.f5415C;
            aVar2.f11127a = null;
            aVar2.clearAnimation();
            this.f5415C.startAnimation(hVar4);
            this.f5424M = hVar4;
        }
        C0944e eVar2 = this.f5420I;
        float min2 = Math.min(0.8f, max * 0.8f);
        C0943d dVar2 = eVar2.f11154a;
        dVar2.f11136e = 0.0f;
        dVar2.f11137f = min2;
        eVar2.invalidateSelf();
        C0944e eVar3 = this.f5420I;
        float min3 = Math.min(1.0f, max);
        C0943d dVar3 = eVar3.f11154a;
        if (min3 != dVar3.f11145p) {
            dVar3.f11145p = min3;
        }
        eVar3.invalidateSelf();
        C0944e eVar4 = this.f5420I;
        eVar4.f11154a.g = ((pow * 2.0f) + ((max * 0.4f) - 16.0f)) * 0.5f;
        eVar4.invalidateSelf();
        setTargetOffsetTopAndBottom(i5 - this.f5443w);
    }

    public final void k(float f6) {
        int i2 = this.f5417E;
        setTargetOffsetTopAndBottom((i2 + ((int) (((float) (this.F - i2)) * f6))) - this.f5415C.getTop());
    }

    public final void l() {
        this.f5415C.clearAnimation();
        this.f5420I.stop();
        this.f5415C.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.F - this.f5443w);
        this.f5443w = this.f5415C.getTop();
    }

    public final void m(boolean z3, boolean z4) {
        if (this.f5433c != z3) {
            this.f5425N = z4;
            h();
            this.f5433c = z3;
            C0945f fVar = this.f5428Q;
            if (z3) {
                this.f5417E = this.f5443w;
                g gVar = this.f5429R;
                gVar.reset();
                gVar.setDuration(200);
                gVar.setInterpolator(this.f5414B);
                if (fVar != null) {
                    this.f5415C.f11127a = fVar;
                }
                this.f5415C.clearAnimation();
                this.f5415C.startAnimation(gVar);
                return;
            }
            g gVar2 = new g(this, 1);
            this.f5422K = gVar2;
            gVar2.setDuration(150);
            C0940a aVar = this.f5415C;
            aVar.f11127a = fVar;
            aVar.clearAnimation();
            this.f5415C.startAnimation(this.f5422K);
        }
    }

    public final void n(float f6) {
        float f7 = this.f5445y;
        float f8 = (float) this.d;
        if (f6 - f7 > f8 && !this.f5446z) {
            this.f5444x = f7 + f8;
            this.f5446z = true;
            this.f5420I.setAlpha(76);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        h();
        int actionMasked = motionEvent.getActionMasked();
        int i2 = 0;
        if (!isEnabled() || g() || this.f5433c || this.f5441u) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i5 = this.f5413A;
                    if (i5 == -1) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i5);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    n(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.f5413A) {
                            if (actionIndex == 0) {
                                i2 = 1;
                            }
                            this.f5413A = motionEvent.getPointerId(i2);
                        }
                    }
                }
            }
            this.f5446z = false;
            this.f5413A = -1;
        } else {
            setTargetOffsetTopAndBottom(this.F - this.f5415C.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f5413A = pointerId;
            this.f5446z = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f5445y = motionEvent.getY(findPointerIndex2);
        }
        return this.f5446z;
    }

    public final void onLayout(boolean z3, int i2, int i5, int i6, int i7) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f5431a == null) {
                h();
            }
            View view = this.f5431a;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.f5415C.getMeasuredWidth();
                int measuredHeight2 = this.f5415C.getMeasuredHeight();
                int i8 = measuredWidth / 2;
                int i9 = measuredWidth2 / 2;
                int i10 = this.f5443w;
                this.f5415C.layout(i8 - i9, i10, i8 + i9, measuredHeight2 + i10);
            }
        }
    }

    public final void onMeasure(int i2, int i5) {
        super.onMeasure(i2, i5);
        if (this.f5431a == null) {
            h();
        }
        View view = this.f5431a;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.f5415C.measure(View.MeasureSpec.makeMeasureSpec(this.f5426O, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f5426O, 1073741824));
            this.f5416D = -1;
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                if (getChildAt(i6) == this.f5415C) {
                    this.f5416D = i6;
                    return;
                }
            }
        }
    }

    public final boolean onNestedFling(View view, float f6, float f7, boolean z3) {
        return this.f5437q.a(f6, f7, z3);
    }

    public final boolean onNestedPreFling(View view, float f6, float f7) {
        return this.f5437q.b(f6, f7);
    }

    public final void onNestedPreScroll(View view, int i2, int i5, int[] iArr) {
        if (i5 > 0) {
            float f6 = this.f5435f;
            if (f6 > 0.0f) {
                float f7 = (float) i5;
                if (f7 > f6) {
                    iArr[1] = (int) f6;
                    this.f5435f = 0.0f;
                } else {
                    this.f5435f = f6 - f7;
                    iArr[1] = i5;
                }
                j(this.f5435f);
            }
        }
        int[] iArr2 = this.f5438r;
        if (dispatchNestedPreScroll(i2 - iArr[0], i5 - iArr[1], iArr2, (int[]) null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public final void onNestedScroll(View view, int i2, int i5, int i6, int i7) {
        d(view, i2, i5, i6, i7, 0, this.f5440t);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        this.f5436p.f1411a = i2;
        startNestedScroll(i2 & 2);
        this.f5435f = 0.0f;
        this.f5441u = true;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.getSuperState());
        setRefreshing(kVar.f11166a);
    }

    public final Parcelable onSaveInstanceState() {
        return new k(super.onSaveInstanceState(), this.f5433c);
    }

    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        if (!isEnabled() || this.f5433c || (i2 & 2) == 0) {
            return false;
        }
        return true;
    }

    public final void onStopNestedScroll(View view) {
        this.f5436p.f1411a = 0;
        this.f5441u = false;
        float f6 = this.f5435f;
        if (f6 > 0.0f) {
            i(f6);
            this.f5435f = 0.0f;
        }
        stopNestedScroll();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i2 = 0;
        if (!isEnabled() || g() || this.f5433c || this.f5441u) {
            return false;
        }
        if (actionMasked == 0) {
            this.f5413A = motionEvent.getPointerId(0);
            this.f5446z = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f5413A);
            if (findPointerIndex < 0) {
                Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.f5446z) {
                this.f5446z = false;
                i((motionEvent.getY(findPointerIndex) - this.f5444x) * 0.5f);
            }
            this.f5413A = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f5413A);
            if (findPointerIndex2 < 0) {
                Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y6 = motionEvent.getY(findPointerIndex2);
            n(y6);
            if (this.f5446z) {
                float f6 = (y6 - this.f5444x) * 0.5f;
                if (f6 <= 0.0f) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                j(f6);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.f5413A = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                int actionIndex2 = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex2) == this.f5413A) {
                    if (actionIndex2 == 0) {
                        i2 = 1;
                    }
                    this.f5413A = motionEvent.getPointerId(i2);
                }
            }
        }
        return true;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        ViewParent parent;
        View view = this.f5431a;
        if (view != null) {
            WeakHashMap weakHashMap = O.f1352a;
            if (!D.p(view)) {
                if (!this.f5427P && (parent = getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(z3);
                    return;
                }
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    public void setAnimationProgress(float f6) {
        this.f5415C.setScaleX(f6);
        this.f5415C.setScaleY(f6);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        h();
        C0944e eVar = this.f5420I;
        C0943d dVar = eVar.f11154a;
        dVar.f11138i = iArr;
        dVar.a(0);
        dVar.a(0);
        eVar.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr2[i2] = A.h.getColor(context, iArr[i2]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i2) {
        this.f5434e = (float) i2;
    }

    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
        if (!z3) {
            l();
        }
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z3) {
        this.f5427P = z3;
    }

    public void setNestedScrollingEnabled(boolean z3) {
        C0072l lVar = this.f5437q;
        if (lVar.d) {
            WeakHashMap weakHashMap = O.f1352a;
            D.z(lVar.f1406c);
        }
        lVar.d = z3;
    }

    public void setOnRefreshListener(j jVar) {
        this.f5432b = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i2) {
        setProgressBackgroundColorSchemeResource(i2);
    }

    public void setProgressBackgroundColorSchemeColor(int i2) {
        this.f5415C.setBackgroundColor(i2);
    }

    public void setProgressBackgroundColorSchemeResource(int i2) {
        setProgressBackgroundColorSchemeColor(A.h.getColor(getContext(), i2));
    }

    public void setRefreshing(boolean z3) {
        if (!z3 || this.f5433c == z3) {
            m(z3, false);
            return;
        }
        this.f5433c = z3;
        setTargetOffsetTopAndBottom((this.f5418G + this.F) - this.f5443w);
        this.f5425N = false;
        C0945f fVar = this.f5428Q;
        this.f5415C.setVisibility(0);
        this.f5420I.setAlpha(255);
        g gVar = new g(this, 0);
        this.f5421J = gVar;
        gVar.setDuration((long) this.f5442v);
        if (fVar != null) {
            this.f5415C.f11127a = fVar;
        }
        this.f5415C.clearAnimation();
        this.f5415C.startAnimation(this.f5421J);
    }

    public void setSize(int i2) {
        if (i2 == 0 || i2 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i2 == 0) {
                this.f5426O = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f5426O = (int) (displayMetrics.density * 40.0f);
            }
            this.f5415C.setImageDrawable((Drawable) null);
            this.f5420I.c(i2);
            this.f5415C.setImageDrawable(this.f5420I);
        }
    }

    public void setSlingshotDistance(int i2) {
        this.f5419H = i2;
    }

    public void setTargetOffsetTopAndBottom(int i2) {
        C0940a aVar = this.f5415C;
        aVar.bringToFront();
        WeakHashMap weakHashMap = O.f1352a;
        aVar.offsetTopAndBottom(i2);
        this.f5443w = aVar.getTop();
    }

    public final boolean startNestedScroll(int i2) {
        return this.f5437q.g(i2, 0);
    }

    public final void stopNestedScroll() {
        this.f5437q.h(0);
    }

    public void setOnChildScrollUpCallback(i iVar) {
    }
}
