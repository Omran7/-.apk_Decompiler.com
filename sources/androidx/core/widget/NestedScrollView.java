package androidx.core.widget;

import K.C0067g;
import K.C0072l;
import K.C0074n;
import K.C0075o;
import K.D;
import K.O;
import Q.e;
import Q.h;
import Q.i;
import Q.j;
import Q.k;
import U3.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.google.android.gms.common.api.f;
import com.mtma.criminal.city.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

public class NestedScrollView extends FrameLayout implements C0074n {

    /* renamed from: K  reason: collision with root package name */
    public static final float f4888K = ((float) (Math.log(0.78d) / Math.log(0.9d)));

    /* renamed from: L  reason: collision with root package name */
    public static final h f4889L = new h(0);

    /* renamed from: M  reason: collision with root package name */
    public static final int[] f4890M = {16843130};

    /* renamed from: A  reason: collision with root package name */
    public int f4891A = -1;

    /* renamed from: B  reason: collision with root package name */
    public final int[] f4892B = new int[2];

    /* renamed from: C  reason: collision with root package name */
    public final int[] f4893C = new int[2];

    /* renamed from: D  reason: collision with root package name */
    public int f4894D;

    /* renamed from: E  reason: collision with root package name */
    public int f4895E;
    public k F;

    /* renamed from: G  reason: collision with root package name */
    public final C0075o f4896G;

    /* renamed from: H  reason: collision with root package name */
    public final C0072l f4897H;

    /* renamed from: I  reason: collision with root package name */
    public float f4898I;

    /* renamed from: J  reason: collision with root package name */
    public final C0067g f4899J = new C0067g(getContext(), new c((Object) this, 23));

    /* renamed from: a  reason: collision with root package name */
    public final float f4900a;

    /* renamed from: b  reason: collision with root package name */
    public long f4901b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f4902c = new Rect();
    public final OverScroller d;

    /* renamed from: e  reason: collision with root package name */
    public final EdgeEffect f4903e;

    /* renamed from: f  reason: collision with root package name */
    public final EdgeEffect f4904f;

    /* renamed from: p  reason: collision with root package name */
    public int f4905p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4906q = true;

    /* renamed from: r  reason: collision with root package name */
    public boolean f4907r = false;

    /* renamed from: s  reason: collision with root package name */
    public View f4908s = null;

    /* renamed from: t  reason: collision with root package name */
    public boolean f4909t = false;

    /* renamed from: u  reason: collision with root package name */
    public VelocityTracker f4910u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f4911v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f4912w = true;

    /* renamed from: x  reason: collision with root package name */
    public final int f4913x;

    /* renamed from: y  reason: collision with root package name */
    public final int f4914y;

    /* renamed from: z  reason: collision with root package name */
    public final int f4915z;

    /* JADX WARNING: type inference failed for: r7v2, types: [java.lang.Object, K.o] */
    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.nestedScrollViewStyle);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            edgeEffect = e.a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f4903e = edgeEffect;
        if (i2 >= 31) {
            edgeEffect2 = e.a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f4904f = edgeEffect2;
        this.f4900a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f4913x = viewConfiguration.getScaledTouchSlop();
        this.f4914y = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4915z = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4890M, R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f4896G = new Object();
        this.f4897H = new C0072l(this);
        setNestedScrollingEnabled(true);
        O.l(this, f4889L);
    }

    public static boolean m(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !m((View) parent, nestedScrollView)) {
            return false;
        }
        return true;
    }

    public final void a(View view, View view2, int i2, int i5) {
        C0075o oVar = this.f4896G;
        if (i5 == 1) {
            oVar.f1412b = i2;
        } else {
            oVar.f1411a = i2;
        }
        w(2, i5);
    }

    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void b(View view, int i2) {
        C0075o oVar = this.f4896G;
        if (i2 == 1) {
            oVar.f1412b = 0;
        } else {
            oVar.f1411a = 0;
        }
        y(i2);
    }

    public final void c(View view, int i2, int i5, int[] iArr, int i6) {
        i(i2, i5, i6, iArr, (int[]) null);
    }

    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void computeScroll() {
        /*
            r14 = this;
            android.widget.OverScroller r0 = r14.d
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            android.widget.OverScroller r0 = r14.d
            r0.computeScrollOffset()
            android.widget.OverScroller r0 = r14.d
            int r0 = r0.getCurrY()
            int r1 = r14.f4895E
            int r1 = r0 - r1
            int r2 = r14.getHeight()
            android.widget.EdgeEffect r3 = r14.f4904f
            android.widget.EdgeEffect r4 = r14.f4903e
            r5 = 1056964608(0x3f000000, float:0.5)
            r6 = 0
            r7 = 1082130432(0x40800000, float:4.0)
            if (r1 <= 0) goto L_0x0047
            float r8 = K1.e.v(r4)
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0047
            int r6 = -r1
            float r6 = (float) r6
            float r6 = r6 * r7
            float r8 = (float) r2
            float r6 = r6 / r8
            int r2 = -r2
            float r2 = (float) r2
            float r2 = r2 / r7
            float r5 = K1.e.m0(r4, r6, r5)
            float r5 = r5 * r2
            int r2 = java.lang.Math.round(r5)
            if (r2 == r1) goto L_0x0045
            r4.finish()
        L_0x0045:
            int r1 = r1 - r2
            goto L_0x0065
        L_0x0047:
            if (r1 >= 0) goto L_0x0065
            float r8 = K1.e.v(r3)
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0065
            float r6 = (float) r1
            float r6 = r6 * r7
            float r2 = (float) r2
            float r6 = r6 / r2
            float r2 = r2 / r7
            float r5 = K1.e.m0(r3, r6, r5)
            float r5 = r5 * r2
            int r2 = java.lang.Math.round(r5)
            if (r2 == r1) goto L_0x0045
            r3.finish()
            goto L_0x0045
        L_0x0065:
            r14.f4895E = r0
            int[] r0 = r14.f4893C
            r2 = 1
            r11 = 0
            r0[r2] = r11
            r8 = 1
            r6 = 0
            r10 = 0
            r5 = r14
            r7 = r1
            r9 = r0
            r5.i(r6, r7, r8, r9, r10)
            r5 = r0[r2]
            int r1 = r1 - r5
            int r13 = r14.getScrollRange()
            if (r1 == 0) goto L_0x00a2
            int r5 = r14.getScrollY()
            int r6 = r14.getScrollX()
            r14.q(r1, r6, r5, r13)
            int r6 = r14.getScrollY()
            int r7 = r6 - r5
            int r1 = r1 - r7
            r0[r2] = r11
            r6 = 0
            r8 = 0
            K.l r5 = r14.f4897H
            int[] r10 = r14.f4892B
            r11 = 1
            r9 = r1
            r12 = r0
            r5.d(r6, r7, r8, r9, r10, r11, r12)
            r0 = r0[r2]
            int r1 = r1 - r0
        L_0x00a2:
            if (r1 == 0) goto L_0x00d9
            int r0 = r14.getOverScrollMode()
            if (r0 == 0) goto L_0x00ae
            if (r0 != r2) goto L_0x00d1
            if (r13 <= 0) goto L_0x00d1
        L_0x00ae:
            if (r1 >= 0) goto L_0x00c1
            boolean r0 = r4.isFinished()
            if (r0 == 0) goto L_0x00d1
            android.widget.OverScroller r0 = r14.d
            float r0 = r0.getCurrVelocity()
            int r0 = (int) r0
            r4.onAbsorb(r0)
            goto L_0x00d1
        L_0x00c1:
            boolean r0 = r3.isFinished()
            if (r0 == 0) goto L_0x00d1
            android.widget.OverScroller r0 = r14.d
            float r0 = r0.getCurrVelocity()
            int r0 = (int) r0
            r3.onAbsorb(r0)
        L_0x00d1:
            android.widget.OverScroller r0 = r14.d
            r0.abortAnimation()
            r14.y(r2)
        L_0x00d9:
            android.widget.OverScroller r0 = r14.d
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x00e5
            r14.postInvalidateOnAnimation()
            goto L_0x00e8
        L_0x00e5:
            r14.y(r2)
        L_0x00e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return bottom + (scrollY - max);
        }
        return bottom;
    }

    public final void d(View view, int i2, int i5, int i6, int i7, int i8, int[] iArr) {
        o(i7, i8, iArr);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent) || j(keyEvent)) {
            return true;
        }
        return false;
    }

    public final boolean dispatchNestedFling(float f6, float f7, boolean z3) {
        return this.f4897H.a(f6, f7, z3);
    }

    public final boolean dispatchNestedPreFling(float f6, float f7) {
        return this.f4897H.b(f6, f7);
    }

    public final boolean dispatchNestedPreScroll(int i2, int i5, int[] iArr, int[] iArr2) {
        return this.f4897H.c(i2, i5, 0, iArr, iArr2);
    }

    public final boolean dispatchNestedScroll(int i2, int i5, int i6, int i7, int[] iArr) {
        return this.f4897H.d(i2, i5, i6, i7, iArr, 0, (int[]) null);
    }

    public final void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f4903e;
        int i5 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (i.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i2 = getPaddingLeft();
            } else {
                i2 = 0;
            }
            if (i.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate((float) i2, (float) min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f4904f;
        if (!edgeEffect2.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (i.a(this)) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i5 = getPaddingLeft();
            }
            if (i.a(this)) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i5 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            edgeEffect2.setSize(width2, height2);
            if (edgeEffect2.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save2);
        }
    }

    public final void e(View view, int i2, int i5, int i6, int i7, int i8) {
        o(i7, i8, (int[]) null);
    }

    public final boolean f(View view, View view2, int i2, int i5) {
        return (i2 & 2) != 0;
    }

    public final boolean g(int i2) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !n(findNextFocus, maxScrollAmount, getHeight())) {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            t(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f4902c;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            t(h(rect), 0, 1, true);
            findNextFocus.requestFocus(i2);
        }
        if (findFocus != null && findFocus.isFocused() && !n(findFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        C0075o oVar = this.f4896G;
        return oVar.f1412b | oVar.f1411a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f4898I == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f4898I = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f4898I;
    }

    public final int h(Rect rect) {
        int i2;
        int i5;
        int i6;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i2 = i7 - verticalFadingEdgeLength;
        } else {
            i2 = i7;
        }
        int i8 = rect.bottom;
        if (i8 > i2 && rect.top > scrollY) {
            if (rect.height() > height) {
                i6 = rect.top - scrollY;
            } else {
                i6 = rect.bottom - i2;
            }
            return Math.min(i6, (childAt.getBottom() + layoutParams.bottomMargin) - i7);
        } else if (rect.top >= scrollY || i8 >= i2) {
            return 0;
        } else {
            if (rect.height() > height) {
                i5 = 0 - (i2 - rect.bottom);
            } else {
                i5 = 0 - (scrollY - rect.top);
            }
            return Math.max(i5, -getScrollY());
        }
    }

    public final boolean hasNestedScrollingParent() {
        return this.f4897H.f(0);
    }

    public final boolean i(int i2, int i5, int i6, int[] iArr, int[] iArr2) {
        return this.f4897H.c(i2, i5, i6, iArr, (int[]) null);
    }

    public final boolean isNestedScrollingEnabled() {
        return this.f4897H.d;
    }

    public final boolean j(KeyEvent keyEvent) {
        this.f4902c.setEmpty();
        int i2 = 130;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 19) {
                    if (keyCode != 20) {
                        if (keyCode == 62) {
                            if (keyEvent.isShiftPressed()) {
                                i2 = 33;
                            }
                            r(i2);
                            return false;
                        } else if (keyCode == 92) {
                            return l(33);
                        } else {
                            if (keyCode == 93) {
                                return l(130);
                            }
                            if (keyCode == 122) {
                                r(33);
                                return false;
                            } else if (keyCode != 123) {
                                return false;
                            } else {
                                r(130);
                                return false;
                            }
                        }
                    } else if (keyEvent.isAltPressed()) {
                        return l(130);
                    } else {
                        return g(130);
                    }
                } else if (keyEvent.isAltPressed()) {
                    return l(33);
                } else {
                    return g(33);
                }
            }
        }
        if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        }
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
        if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
            return false;
        }
        return true;
    }

    public final void k(int i2) {
        if (getChildCount() > 0) {
            this.d.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, f.API_PRIORITY_OTHER, 0, 0);
            w(2, 1);
            this.f4895E = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    public final boolean l(int i2) {
        boolean z3;
        int childCount;
        if (i2 == 130) {
            z3 = true;
        } else {
            z3 = false;
        }
        int height = getHeight();
        Rect rect = this.f4902c;
        rect.top = 0;
        rect.bottom = height;
        if (z3 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return s(i2, rect.top, rect.bottom);
    }

    public final void measureChild(View view, int i2, int i5) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public final void measureChildWithMargins(View view, int i2, int i5, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final boolean n(View view, int i2, int i5) {
        Rect rect = this.f4902c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        if (rect.bottom + i2 < getScrollY() || rect.top - i2 > getScrollY() + i5) {
            return false;
        }
        return true;
    }

    public final void o(int i2, int i5, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f4897H.d(0, scrollY2, 0, i2 - scrollY2, (int[]) null, i5, iArr);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4907r = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:141:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r3 = 1
            int r4 = r27.getAction()
            r5 = 8
            if (r4 != r5) goto L_0x0351
            boolean r4 = r0.f4909t
            if (r4 != 0) goto L_0x0351
            int r4 = r27.getSource()
            r5 = 2
            r4 = r4 & r5
            if (r4 != r5) goto L_0x001b
            r4 = r3
            goto L_0x001c
        L_0x001b:
            r4 = 0
        L_0x001c:
            r7 = 0
            r8 = 4194304(0x400000, float:5.877472E-39)
            r9 = 26
            if (r4 == 0) goto L_0x002f
            r4 = 9
            float r10 = r1.getAxisValue(r4)
            float r11 = r27.getX()
            int r11 = (int) r11
            goto L_0x0045
        L_0x002f:
            int r4 = r27.getSource()
            r4 = r4 & r8
            if (r4 != r8) goto L_0x0042
            float r10 = r1.getAxisValue(r9)
            int r4 = r26.getWidth()
            int r11 = r4 / 2
            r4 = r9
            goto L_0x0045
        L_0x0042:
            r10 = r7
            r4 = 0
            r11 = 0
        L_0x0045:
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0351
            float r12 = r26.getVerticalScrollFactorCompat()
            float r12 = r12 * r10
            int r10 = (int) r12
            int r12 = r27.getSource()
            r13 = 8194(0x2002, float:1.1482E-41)
            r12 = r12 & r13
            if (r12 != r13) goto L_0x005a
            r12 = r3
            goto L_0x005b
        L_0x005a:
            r12 = 0
        L_0x005b:
            int r10 = -r10
            r0.t(r10, r11, r3, r12)
            if (r4 == 0) goto L_0x034f
            K.g r10 = r0.f4899J
            r10.getClass()
            int r11 = r27.getSource()
            int r12 = r27.getDeviceId()
            int r13 = r10.f1391f
            int[] r14 = r10.h
            r5 = 34
            if (r13 != r11) goto L_0x0083
            int r13 = r10.g
            if (r13 != r12) goto L_0x0083
            int r13 = r10.f1390e
            if (r13 == r4) goto L_0x007f
            goto L_0x0083
        L_0x007f:
            r2 = 0
            r6 = 0
            goto L_0x013f
        L_0x0083:
            android.content.Context r13 = r10.f1387a
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r13)
            int r7 = r27.getDeviceId()
            int r15 = r27.getSource()
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.String r6 = "android"
            java.lang.String r9 = "dimen"
            r8 = -1
            if (r3 < r5) goto L_0x00a2
            java.lang.reflect.Method r21 = K.T.f1357a
            int r7 = K.S.b(r2, r7, r4, r15)
        L_0x00a0:
            r5 = 0
            goto L_0x00e3
        L_0x00a2:
            java.lang.reflect.Method r21 = K.T.f1357a
            android.view.InputDevice r7 = android.view.InputDevice.getDevice(r7)
            if (r7 == 0) goto L_0x00df
            android.view.InputDevice$MotionRange r7 = r7.getMotionRange(r4, r15)
            if (r7 == 0) goto L_0x00df
            android.content.res.Resources r7 = r13.getResources()
            r5 = 4194304(0x400000, float:5.877472E-39)
            if (r15 != r5) goto L_0x00c3
            r5 = 26
            if (r4 != r5) goto L_0x00c3
            java.lang.String r5 = "config_viewMinRotaryEncoderFlingVelocity"
            int r5 = r7.getIdentifier(r5, r9, r6)
            goto L_0x00c4
        L_0x00c3:
            r5 = r8
        L_0x00c4:
            java.util.Objects.requireNonNull(r2)
            if (r5 == r8) goto L_0x00da
            if (r5 == 0) goto L_0x00d6
            int r5 = r7.getDimensionPixelSize(r5)
            if (r5 >= 0) goto L_0x00d4
            r5 = 2147483647(0x7fffffff, float:NaN)
        L_0x00d4:
            r7 = r5
            goto L_0x00a0
        L_0x00d6:
            r7 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x00a0
        L_0x00da:
            int r5 = r2.getScaledMinimumFlingVelocity()
            goto L_0x00d4
        L_0x00df:
            r5 = 0
            r7 = 2147483647(0x7fffffff, float:NaN)
        L_0x00e3:
            r14[r5] = r7
            int r5 = r27.getDeviceId()
            int r7 = r27.getSource()
            r15 = 34
            if (r3 < r15) goto L_0x00f7
            int r2 = K.S.a(r2, r5, r4, r7)
        L_0x00f5:
            r3 = 1
            goto L_0x0135
        L_0x00f7:
            android.view.InputDevice r3 = android.view.InputDevice.getDevice(r5)
            if (r3 == 0) goto L_0x0105
            android.view.InputDevice$MotionRange r3 = r3.getMotionRange(r4, r7)
            if (r3 == 0) goto L_0x0105
            r3 = 1
            goto L_0x0106
        L_0x0105:
            r3 = 0
        L_0x0106:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != 0) goto L_0x010c
        L_0x010a:
            r2 = r5
            goto L_0x00f5
        L_0x010c:
            android.content.res.Resources r3 = r13.getResources()
            r13 = 4194304(0x400000, float:5.877472E-39)
            if (r7 != r13) goto L_0x011f
            r7 = 26
            if (r4 != r7) goto L_0x011f
            java.lang.String r7 = "config_viewMaxRotaryEncoderFlingVelocity"
            int r6 = r3.getIdentifier(r7, r9, r6)
            goto L_0x0120
        L_0x011f:
            r6 = r8
        L_0x0120:
            java.util.Objects.requireNonNull(r2)
            if (r6 == r8) goto L_0x0130
            if (r6 == 0) goto L_0x010a
            int r2 = r3.getDimensionPixelSize(r6)
            if (r2 >= 0) goto L_0x012e
            goto L_0x010a
        L_0x012e:
            r5 = r2
            goto L_0x010a
        L_0x0130:
            int r2 = r2.getScaledMaximumFlingVelocity()
            goto L_0x00f5
        L_0x0135:
            r14[r3] = r2
            r10.f1391f = r11
            r10.g = r12
            r10.f1390e = r4
            r2 = 0
            r6 = 1
        L_0x013f:
            r3 = r14[r2]
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r3 != r2) goto L_0x0152
            android.view.VelocityTracker r1 = r10.f1389c
            if (r1 == 0) goto L_0x034d
            r1.recycle()
            r1 = 0
            r10.f1389c = r1
            goto L_0x034d
        L_0x0152:
            android.view.VelocityTracker r2 = r10.f1389c
            if (r2 != 0) goto L_0x015c
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r10.f1389c = r2
        L_0x015c:
            android.view.VelocityTracker r2 = r10.f1389c
            java.util.Map r3 = K.C0081v.f1430a
            r2.addMovement(r1)
            int r3 = android.os.Build.VERSION.SDK_INT
            r5 = 34
            if (r3 < r5) goto L_0x016a
            goto L_0x01c5
        L_0x016a:
            int r3 = r27.getSource()
            r5 = 4194304(0x400000, float:5.877472E-39)
            if (r3 != r5) goto L_0x01c5
            java.util.Map r3 = K.C0081v.f1430a
            boolean r5 = r3.containsKey(r2)
            if (r5 != 0) goto L_0x0182
            K.w r5 = new K.w
            r5.<init>()
            r3.put(r2, r5)
        L_0x0182:
            java.lang.Object r3 = r3.get(r2)
            K.w r3 = (K.C0082w) r3
            r3.getClass()
            long r7 = r27.getEventTime()
            int r5 = r3.d
            long[] r9 = r3.f1434b
            if (r5 == 0) goto L_0x01a7
            int r5 = r3.f1436e
            r11 = r9[r5]
            long r11 = r7 - r11
            r22 = 40
            int r5 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r5 <= 0) goto L_0x01a7
            r5 = 0
            r3.d = r5
            r5 = 0
            r3.f1435c = r5
        L_0x01a7:
            int r5 = r3.f1436e
            r11 = 1
            int r5 = r5 + r11
            r12 = 20
            int r5 = r5 % r12
            r3.f1436e = r5
            int r13 = r3.d
            if (r13 == r12) goto L_0x01b7
            int r13 = r13 + r11
            r3.d = r13
        L_0x01b7:
            r11 = 26
            float r1 = r1.getAxisValue(r11)
            float[] r11 = r3.f1433a
            r11[r5] = r1
            int r1 = r3.f1436e
            r9[r1] = r7
        L_0x01c5:
            r1 = 1000(0x3e8, float:1.401E-42)
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2.computeCurrentVelocity(r1, r3)
            java.util.Map r5 = K.C0081v.f1430a
            java.lang.Object r5 = r5.get(r2)
            K.w r5 = (K.C0082w) r5
            if (r5 == 0) goto L_0x02c6
            int r7 = r5.d
            r8 = 2
            if (r7 >= r8) goto L_0x01e2
        L_0x01dc:
            r24 = r2
            r2 = r1
            r1 = 0
            goto L_0x029d
        L_0x01e2:
            int r8 = r5.f1436e
            r9 = 20
            int r11 = r8 + 20
            r12 = 1
            int r7 = r7 - r12
            int r11 = r11 - r7
            int r11 = r11 % r9
            long[] r7 = r5.f1434b
            r8 = r7[r8]
        L_0x01f0:
            r12 = r7[r11]
            long r22 = r8 - r12
            r24 = 100
            int r15 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1))
            if (r15 <= 0) goto L_0x0206
            int r12 = r5.d
            r15 = 1
            int r12 = r12 - r15
            r5.d = r12
            int r11 = r11 + r15
            r17 = 20
            int r11 = r11 % 20
            goto L_0x01f0
        L_0x0206:
            r15 = 1
            r17 = 20
            int r8 = r5.d
            r9 = 2
            if (r8 >= r9) goto L_0x020f
            goto L_0x01dc
        L_0x020f:
            float[] r3 = r5.f1433a
            if (r8 != r9) goto L_0x0228
            int r11 = r11 + r15
            int r11 = r11 % 20
            r8 = r7[r11]
            int r7 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x021d
            goto L_0x01dc
        L_0x021d:
            r3 = r3[r11]
            long r8 = r8 - r12
            float r7 = (float) r8
            float r3 = r3 / r7
            r24 = r2
            r2 = r1
            r1 = r3
            goto L_0x029d
        L_0x0228:
            r8 = 0
            r9 = 0
            r12 = 0
        L_0x022b:
            int r13 = r5.d
            r15 = 1
            int r13 = r13 - r15
            r16 = 1073741824(0x40000000, float:2.0)
            r18 = 1065353216(0x3f800000, float:1.0)
            r20 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r9 >= r13) goto L_0x0284
            int r13 = r9 + r11
            r17 = 20
            int r19 = r13 % 20
            r22 = r7[r19]
            int r13 = r13 + r15
            int r13 = r13 % 20
            r24 = r7[r13]
            int r19 = (r24 > r22 ? 1 : (r24 == r22 ? 0 : -1))
            if (r19 != 0) goto L_0x024d
            r24 = r2
            r13 = r3
            r2 = r15
            goto L_0x027d
        L_0x024d:
            int r12 = r12 + r15
            r15 = 0
            int r24 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r24 >= 0) goto L_0x0255
            r18 = r20
        L_0x0255:
            float r15 = java.lang.Math.abs(r8)
            float r15 = r15 * r16
            r24 = r2
            double r1 = (double) r15
            double r1 = java.lang.Math.sqrt(r1)
            float r1 = (float) r1
            float r18 = r18 * r1
            r1 = r3[r13]
            r15 = r7[r13]
            r13 = r3
            long r2 = r15 - r22
            float r2 = (float) r2
            float r1 = r1 / r2
            float r2 = r1 - r18
            float r1 = java.lang.Math.abs(r1)
            float r1 = r1 * r2
            float r1 = r1 + r8
            r2 = 1
            if (r12 != r2) goto L_0x027c
            r3 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r3
        L_0x027c:
            r8 = r1
        L_0x027d:
            int r9 = r9 + r2
            r3 = r13
            r2 = r24
            r1 = 1000(0x3e8, float:1.401E-42)
            goto L_0x022b
        L_0x0284:
            r24 = r2
            r1 = 0
            int r2 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r2 >= 0) goto L_0x028d
            r18 = r20
        L_0x028d:
            float r1 = java.lang.Math.abs(r8)
            float r1 = r1 * r16
            double r1 = (double) r1
            double r1 = java.lang.Math.sqrt(r1)
            float r1 = (float) r1
            float r1 = r1 * r18
            r2 = 1000(0x3e8, float:1.401E-42)
        L_0x029d:
            float r2 = (float) r2
            float r1 = r1 * r2
            r5.f1435c = r1
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            float r3 = java.lang.Math.abs(r2)
            float r3 = -r3
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x02b5
            float r1 = java.lang.Math.abs(r2)
            float r1 = -r1
            r5.f1435c = r1
            goto L_0x02c8
        L_0x02b5:
            float r1 = r5.f1435c
            float r3 = java.lang.Math.abs(r2)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x02c8
            float r1 = java.lang.Math.abs(r2)
            r5.f1435c = r1
            goto L_0x02c8
        L_0x02c6:
            r24 = r2
        L_0x02c8:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            if (r1 < r2) goto L_0x02d5
            r1 = r24
            float r1 = K.C0080u.a(r1, r4)
            goto L_0x02f9
        L_0x02d5:
            r1 = r24
            if (r4 != 0) goto L_0x02de
            float r1 = r1.getXVelocity()
            goto L_0x02f9
        L_0x02de:
            r2 = 1
            if (r4 != r2) goto L_0x02e6
            float r1 = r1.getYVelocity()
            goto L_0x02f9
        L_0x02e6:
            java.util.Map r2 = K.C0081v.f1430a
            java.lang.Object r1 = r2.get(r1)
            K.w r1 = (K.C0082w) r1
            if (r1 == 0) goto L_0x02f8
            r2 = 26
            if (r4 == r2) goto L_0x02f5
            goto L_0x02f8
        L_0x02f5:
            float r1 = r1.f1435c
            goto L_0x02f9
        L_0x02f8:
            r1 = 0
        L_0x02f9:
            U3.c r2 = r10.f1388b
            java.lang.Object r2 = r2.f3713b
            androidx.core.widget.NestedScrollView r2 = (androidx.core.widget.NestedScrollView) r2
            float r3 = r2.getVerticalScrollFactorCompat()
            float r3 = -r3
            float r1 = r1 * r3
            float r3 = java.lang.Math.signum(r1)
            if (r6 != 0) goto L_0x031a
            float r4 = r10.d
            float r4 = java.lang.Math.signum(r4)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x031f
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x031f
        L_0x031a:
            android.widget.OverScroller r3 = r2.d
            r3.abortAnimation()
        L_0x031f:
            float r3 = java.lang.Math.abs(r1)
            r4 = 0
            r4 = r14[r4]
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x032c
            goto L_0x034d
        L_0x032c:
            r3 = 1
            r4 = r14[r3]
            int r3 = -r4
            float r3 = (float) r3
            float r4 = (float) r4
            float r1 = java.lang.Math.min(r1, r4)
            float r1 = java.lang.Math.max(r3, r1)
            r3 = 0
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 != 0) goto L_0x0341
            r7 = r3
            goto L_0x034b
        L_0x0341:
            android.widget.OverScroller r3 = r2.d
            r3.abortAnimation()
            int r3 = (int) r1
            r2.k(r3)
            r7 = r1
        L_0x034b:
            r10.d = r7
        L_0x034d:
            r1 = 1
            goto L_0x0350
        L_0x034f:
            r1 = r3
        L_0x0350:
            return r1
        L_0x0351:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z3 = true;
        if (action == 2 && this.f4909t) {
            return true;
        }
        int i2 = action & 255;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    int i5 = this.f4891A;
                    if (i5 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i5);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i5 + " in onInterceptTouchEvent");
                        } else {
                            int y6 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y6 - this.f4905p) > this.f4913x && (2 & getNestedScrollAxes()) == 0) {
                                this.f4909t = true;
                                this.f4905p = y6;
                                if (this.f4910u == null) {
                                    this.f4910u = VelocityTracker.obtain();
                                }
                                this.f4910u.addMovement(motionEvent);
                                this.f4894D = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i2 != 3) {
                    if (i2 == 6) {
                        p(motionEvent);
                    }
                }
            }
            this.f4909t = false;
            this.f4891A = -1;
            VelocityTracker velocityTracker = this.f4910u;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f4910u = null;
            }
            if (this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            y(0);
        } else {
            int y7 = (int) motionEvent.getY();
            int x6 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y7 >= childAt.getTop() - scrollY && y7 < childAt.getBottom() - scrollY && x6 >= childAt.getLeft() && x6 < childAt.getRight()) {
                    this.f4905p = y7;
                    this.f4891A = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f4910u;
                    if (velocityTracker2 == null) {
                        this.f4910u = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f4910u.addMovement(motionEvent);
                    this.d.computeScrollOffset();
                    if (!x(motionEvent) && this.d.isFinished()) {
                        z3 = false;
                    }
                    this.f4909t = z3;
                    w(2, 0);
                }
            }
            if (!x(motionEvent) && this.d.isFinished()) {
                z3 = false;
            }
            this.f4909t = z3;
            VelocityTracker velocityTracker3 = this.f4910u;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f4910u = null;
            }
        }
        return this.f4909t;
    }

    public final void onLayout(boolean z3, int i2, int i5, int i6, int i7) {
        int i8;
        super.onLayout(z3, i2, i5, i6, i7);
        int i9 = 0;
        this.f4906q = false;
        View view = this.f4908s;
        if (view != null && m(view, this)) {
            View view2 = this.f4908s;
            Rect rect = this.f4902c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h = h(rect);
            if (h != 0) {
                scrollBy(0, h);
            }
        }
        this.f4908s = null;
        if (!this.f4907r) {
            if (this.F != null) {
                scrollTo(getScrollX(), this.F.f2332a);
                this.F = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i8 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i8 = 0;
            }
            int paddingTop = ((i7 - i5) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i8 && scrollY >= 0) {
                i9 = paddingTop + scrollY > i8 ? i8 - paddingTop : scrollY;
            }
            if (i9 != scrollY) {
                scrollTo(getScrollX(), i9);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f4907r = true;
    }

    public final void onMeasure(int i2, int i5) {
        super.onMeasure(i2, i5);
        if (this.f4911v && View.MeasureSpec.getMode(i5) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public final boolean onNestedFling(View view, float f6, float f7, boolean z3) {
        if (z3) {
            return false;
        }
        dispatchNestedFling(0.0f, f7, true);
        k((int) f7);
        return true;
    }

    public final boolean onNestedPreFling(View view, float f6, float f7) {
        return this.f4897H.b(f6, f7);
    }

    public final void onNestedPreScroll(View view, int i2, int i5, int[] iArr) {
        i(i2, i5, 0, iArr, (int[]) null);
    }

    public final void onNestedScroll(View view, int i2, int i5, int i6, int i7) {
        o(i7, 0, (int[]) null);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        a(view, view2, i2, 0);
    }

    public final void onOverScrolled(int i2, int i5, boolean z3, boolean z4) {
        super.scrollTo(i2, i5);
    }

    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        View view;
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, (View) null, i2);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        }
        if (view != null && n(view, 0, getHeight())) {
            return view.requestFocus(i2, rect);
        }
        return false;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.getSuperState());
        this.F = kVar;
        requestLayout();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, Q.k] */
    public final Parcelable onSaveInstanceState() {
        ? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f2332a = getScrollY();
        return baseSavedState;
    }

    public final void onScrollChanged(int i2, int i5, int i6, int i7) {
        super.onScrollChanged(i2, i5, i6, i7);
    }

    public final void onSizeChanged(int i2, int i5, int i6, int i7) {
        super.onSizeChanged(i2, i5, i6, i7);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && n(findFocus, 0, i7)) {
            Rect rect = this.f4902c;
            findFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findFocus, rect);
            int h = h(rect);
            if (h == 0) {
                return;
            }
            if (this.f4912w) {
                v(0, h, false);
            } else {
                scrollBy(0, h);
            }
        }
    }

    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return f(view, view2, i2, 0);
    }

    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        MotionEvent motionEvent2 = motionEvent;
        if (this.f4910u == null) {
            this.f4910u = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4894D = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f6 = 0.0f;
        obtain.offsetLocation(0.0f, (float) this.f4894D);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f4904f;
            EdgeEffect edgeEffect2 = this.f4903e;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f4910u;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f4915z);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f4891A);
                if (Math.abs(yVelocity) >= this.f4914y) {
                    if (K1.e.v(edgeEffect2) != 0.0f) {
                        if (u(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            k(-yVelocity);
                        }
                    } else if (K1.e.v(edgeEffect) != 0.0f) {
                        int i2 = -yVelocity;
                        if (u(edgeEffect, i2)) {
                            edgeEffect.onAbsorb(i2);
                        } else {
                            k(i2);
                        }
                    } else {
                        int i5 = -yVelocity;
                        float f7 = (float) i5;
                        if (!this.f4897H.b(0.0f, f7)) {
                            dispatchNestedFling(0.0f, f7, true);
                            k(i5);
                        }
                    }
                } else if (this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f4891A = -1;
                this.f4909t = false;
                VelocityTracker velocityTracker2 = this.f4910u;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f4910u = null;
                }
                y(0);
                this.f4903e.onRelease();
                this.f4904f.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent2.findPointerIndex(this.f4891A);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f4891A + " in onTouchEvent");
                } else {
                    int y6 = (int) motionEvent2.getY(findPointerIndex);
                    int i6 = this.f4905p - y6;
                    float x6 = motionEvent2.getX(findPointerIndex) / ((float) getWidth());
                    float height = ((float) i6) / ((float) getHeight());
                    if (K1.e.v(edgeEffect2) != 0.0f) {
                        float f8 = -K1.e.m0(edgeEffect2, -height, x6);
                        if (K1.e.v(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f6 = f8;
                    } else if (K1.e.v(edgeEffect) != 0.0f) {
                        float m02 = K1.e.m0(edgeEffect, height, 1.0f - x6);
                        if (K1.e.v(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f6 = m02;
                    }
                    int round = Math.round(f6 * ((float) getHeight()));
                    if (round != 0) {
                        invalidate();
                    }
                    int i7 = i6 - round;
                    if (!this.f4909t && Math.abs(i7) > this.f4913x) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f4909t = true;
                        i7 = i7 > 0 ? i7 - this.f4913x : i7 + this.f4913x;
                    }
                    if (this.f4909t) {
                        int t6 = t(i7, (int) motionEvent2.getX(findPointerIndex), 0, false);
                        this.f4905p = y6 - t6;
                        this.f4894D += t6;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f4909t && getChildCount() > 0 && this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f4891A = -1;
                this.f4909t = false;
                VelocityTracker velocityTracker3 = this.f4910u;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f4910u = null;
                }
                y(0);
                this.f4903e.onRelease();
                this.f4904f.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f4905p = (int) motionEvent2.getY(actionIndex);
                this.f4891A = motionEvent2.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                p(motionEvent);
                this.f4905p = (int) motionEvent2.getY(motionEvent2.findPointerIndex(this.f4891A));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            if (this.f4909t && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.d.isFinished()) {
                this.d.abortAnimation();
                y(1);
            }
            int pointerId = motionEvent2.getPointerId(0);
            this.f4905p = (int) motionEvent.getY();
            this.f4891A = pointerId;
            w(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f4910u;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final void p(MotionEvent motionEvent) {
        int i2;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4891A) {
            if (actionIndex == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.f4905p = (int) motionEvent.getY(i2);
            this.f4891A = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.f4910u;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean q(int i2, int i5, int i6, int i7) {
        boolean z3;
        boolean z4;
        int overScrollMode = getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i8 = i6 + i2;
        if (i5 <= 0 && i5 >= 0) {
            z3 = false;
        } else {
            i5 = 0;
            z3 = true;
        }
        if (i8 <= i7) {
            if (i8 < 0) {
                i7 = 0;
            } else {
                i7 = i8;
                z4 = false;
                if (z4 && !this.f4897H.f(1)) {
                    this.d.springBack(i5, i7, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i5, i7);
                if (z3 && !z4) {
                    return false;
                }
            }
        }
        z4 = true;
        this.d.springBack(i5, i7, 0, 0, 0, getScrollRange());
        super.scrollTo(i5, i7);
        return z3 ? true : true;
    }

    public final void r(int i2) {
        boolean z3;
        if (i2 == 130) {
            z3 = true;
        } else {
            z3 = false;
        }
        int height = getHeight();
        Rect rect = this.f4902c;
        if (z3) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i5 = rect.top;
        int i6 = height + i5;
        rect.bottom = i6;
        s(i2, i5, i6);
    }

    public final void requestChildFocus(View view, View view2) {
        if (!this.f4906q) {
            Rect rect = this.f4902c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h = h(rect);
            if (h != 0) {
                scrollBy(0, h);
            }
        } else {
            this.f4908s = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        boolean z4;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h = h(rect);
        if (h != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (z3) {
                scrollBy(0, h);
            } else {
                v(0, h, false);
            }
        }
        return z4;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        VelocityTracker velocityTracker;
        if (z3 && (velocityTracker = this.f4910u) != null) {
            velocityTracker.recycle();
            this.f4910u = null;
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    public final void requestLayout() {
        this.f4906q = true;
        super.requestLayout();
    }

    public final boolean s(int i2, int i5, int i6) {
        boolean z3;
        boolean z4;
        int i7;
        boolean z5;
        boolean z6;
        int i8 = i2;
        int i9 = i5;
        int i10 = i6;
        int height = getHeight();
        int scrollY = getScrollY();
        int i11 = height + scrollY;
        if (i8 == 33) {
            z3 = true;
        } else {
            z3 = false;
        }
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z7 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view2 = focusables.get(i12);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i9 < bottom && top < i10) {
                if (i9 >= top || bottom >= i10) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (view == null) {
                    view = view2;
                    z7 = z5;
                } else {
                    if ((!z3 || top >= view.getTop()) && (z3 || bottom <= view.getBottom())) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    if (z7) {
                        if (z5) {
                            if (!z6) {
                            }
                        }
                    } else if (z5) {
                        view = view2;
                        z7 = true;
                    } else if (!z6) {
                    }
                    view = view2;
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i9 < scrollY || i10 > i11) {
            if (z3) {
                i7 = i9 - scrollY;
            } else {
                i7 = i10 - i11;
            }
            t(i7, 0, 1, true);
            z4 = true;
        } else {
            z4 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i8);
        }
        return z4;
    }

    public final void scrollTo(int i2, int i5) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i2 < 0) {
                i2 = 0;
            } else if (width + i2 > width2) {
                i2 = width2 - width;
            }
            if (height >= height2 || i5 < 0) {
                i5 = 0;
            } else if (height + i5 > height2) {
                i5 = height2 - height;
            }
            if (i2 != getScrollX() || i5 != getScrollY()) {
                super.scrollTo(i2, i5);
            }
        }
    }

    public void setFillViewport(boolean z3) {
        if (z3 != this.f4911v) {
            this.f4911v = z3;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z3) {
        C0072l lVar = this.f4897H;
        if (lVar.d) {
            WeakHashMap weakHashMap = O.f1352a;
            D.z(lVar.f1406c);
        }
        lVar.d = z3;
    }

    public void setSmoothScrollingEnabled(boolean z3) {
        this.f4912w = z3;
    }

    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public final boolean startNestedScroll(int i2) {
        return this.f4897H.g(i2, 0);
    }

    public final void stopNestedScroll() {
        y(0);
    }

    public final int t(int i2, int i5, int i6, boolean z3) {
        int i7;
        int i8;
        boolean z4;
        boolean z5;
        boolean z6;
        VelocityTracker velocityTracker;
        int i9 = i5;
        int i10 = i6;
        if (i10 == 1) {
            w(2, i10);
        }
        boolean c3 = this.f4897H.c(0, i2, i6, this.f4893C, this.f4892B);
        int[] iArr = this.f4893C;
        int[] iArr2 = this.f4892B;
        if (c3) {
            i8 = i2 - iArr[1];
            i7 = iArr2[1];
        } else {
            i8 = i2;
            i7 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        if ((overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!q(i8, 0, scrollY, scrollRange) || this.f4897H.f(i10)) {
            z5 = false;
        } else {
            z5 = true;
        }
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        int i11 = scrollRange;
        this.f4897H.d(0, scrollY2, 0, i8 - scrollY2, this.f4892B, i6, iArr);
        int i12 = i7 + iArr2[1];
        int i13 = i8 - iArr[1];
        int i14 = scrollY + i13;
        EdgeEffect edgeEffect = this.f4904f;
        EdgeEffect edgeEffect2 = this.f4903e;
        if (i14 < 0) {
            if (z4) {
                K1.e.m0(edgeEffect2, ((float) (-i13)) / ((float) getHeight()), ((float) i9) / ((float) getWidth()));
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i14 > i11 && z4) {
            K1.e.m0(edgeEffect, ((float) i13) / ((float) getHeight()), 1.0f - (((float) i9) / ((float) getWidth())));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (!edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
            postInvalidateOnAnimation();
            z6 = false;
        } else {
            z6 = z5;
        }
        if (z6 && i10 == 0 && (velocityTracker = this.f4910u) != null) {
            velocityTracker.clear();
        }
        if (i10 == 1) {
            y(i10);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i12;
    }

    public final boolean u(EdgeEffect edgeEffect, int i2) {
        if (i2 > 0) {
            return true;
        }
        float v6 = K1.e.v(edgeEffect) * ((float) getHeight());
        float f6 = this.f4900a * 0.015f;
        double log = Math.log((double) ((((float) Math.abs(-i2)) * 0.35f) / f6));
        double d6 = (double) f4888K;
        if (((float) (Math.exp((d6 / (d6 - 1.0d)) * log) * ((double) f6))) < v6) {
            return true;
        }
        return false;
    }

    public final void v(int i2, int i5, boolean z3) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f4901b > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.d;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i5 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, 250);
                if (z3) {
                    w(2, 1);
                } else {
                    y(1);
                }
                this.f4895E = getScrollY();
                postInvalidateOnAnimation();
            } else {
                if (!this.d.isFinished()) {
                    this.d.abortAnimation();
                    y(1);
                }
                scrollBy(i2, i5);
            }
            this.f4901b = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public final void w(int i2, int i5) {
        this.f4897H.g(2, i5);
    }

    public final boolean x(MotionEvent motionEvent) {
        boolean z3;
        EdgeEffect edgeEffect = this.f4903e;
        if (K1.e.v(edgeEffect) != 0.0f) {
            K1.e.m0(edgeEffect, 0.0f, motionEvent.getX() / ((float) getWidth()));
            z3 = true;
        } else {
            z3 = false;
        }
        EdgeEffect edgeEffect2 = this.f4904f;
        if (K1.e.v(edgeEffect2) == 0.0f) {
            return z3;
        }
        K1.e.m0(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    public final void y(int i2) {
        this.f4897H.h(i2);
    }

    public final void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(j jVar) {
    }
}
