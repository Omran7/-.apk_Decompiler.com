package androidx.recyclerview.widget;

import F3.k;
import G.l;
import K.C0072l;
import K.C0075o;
import K.D;
import K.O;
import K4.u;
import T.c;
import U.d;
import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.BaseInterpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.emoji2.text.v;
import c1.i;
import com.google.android.gms.common.api.f;
import com.google.crypto.tink.shaded.protobuf.C0407l;
import com.mtma.criminal.city.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.C0737s0;
import k5.C0770g;
import m0.C0799A;
import m0.C0800B;
import m0.C0801C;
import m0.C0802D;
import m0.C0804F;
import m0.C0805G;
import m0.C0806H;
import m0.C0807I;
import m0.C0808J;
import m0.C0809a;
import m0.C0819k;
import m0.C0821m;
import m0.C0827t;
import m0.C0830w;
import m0.C0831x;
import m0.C0832y;
import m0.K;
import m0.L;
import m0.M;
import m0.P;
import m0.Q;
import m0.S;
import m0.T;
import m0.V;
import m0.a0;
import m0.f0;
import n.g;
import n.j;

public class RecyclerView extends ViewGroup {

    /* renamed from: B0  reason: collision with root package name */
    public static final int[] f5323B0 = {16843830};

    /* renamed from: C0  reason: collision with root package name */
    public static final Class[] f5324C0;

    /* renamed from: D0  reason: collision with root package name */
    public static final d f5325D0 = new d(2);

    /* renamed from: A  reason: collision with root package name */
    public boolean f5326A;

    /* renamed from: A0  reason: collision with root package name */
    public final C0830w f5327A0;

    /* renamed from: B  reason: collision with root package name */
    public int f5328B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f5329C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f5330D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f5331E;
    public int F;

    /* renamed from: G  reason: collision with root package name */
    public final AccessibilityManager f5332G;

    /* renamed from: H  reason: collision with root package name */
    public boolean f5333H;

    /* renamed from: I  reason: collision with root package name */
    public boolean f5334I;

    /* renamed from: J  reason: collision with root package name */
    public int f5335J;

    /* renamed from: K  reason: collision with root package name */
    public int f5336K;

    /* renamed from: L  reason: collision with root package name */
    public C0800B f5337L;

    /* renamed from: M  reason: collision with root package name */
    public EdgeEffect f5338M;

    /* renamed from: N  reason: collision with root package name */
    public EdgeEffect f5339N;

    /* renamed from: O  reason: collision with root package name */
    public EdgeEffect f5340O;

    /* renamed from: P  reason: collision with root package name */
    public EdgeEffect f5341P;

    /* renamed from: Q  reason: collision with root package name */
    public C0801C f5342Q;

    /* renamed from: R  reason: collision with root package name */
    public int f5343R;

    /* renamed from: S  reason: collision with root package name */
    public int f5344S;

    /* renamed from: T  reason: collision with root package name */
    public VelocityTracker f5345T;

    /* renamed from: U  reason: collision with root package name */
    public int f5346U;

    /* renamed from: V  reason: collision with root package name */
    public int f5347V;

    /* renamed from: W  reason: collision with root package name */
    public int f5348W;

    /* renamed from: a  reason: collision with root package name */
    public final v f5349a;

    /* renamed from: a0  reason: collision with root package name */
    public int f5350a0;

    /* renamed from: b  reason: collision with root package name */
    public final C0770g f5351b;

    /* renamed from: b0  reason: collision with root package name */
    public int f5352b0;

    /* renamed from: c  reason: collision with root package name */
    public M f5353c;

    /* renamed from: c0  reason: collision with root package name */
    public C0806H f5354c0;
    public final k d;

    /* renamed from: d0  reason: collision with root package name */
    public final int f5355d0;

    /* renamed from: e  reason: collision with root package name */
    public final i f5356e;

    /* renamed from: e0  reason: collision with root package name */
    public final int f5357e0;

    /* renamed from: f  reason: collision with root package name */
    public final a0 f5358f;

    /* renamed from: f0  reason: collision with root package name */
    public final float f5359f0;

    /* renamed from: g0  reason: collision with root package name */
    public final float f5360g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f5361h0;

    /* renamed from: i0  reason: collision with root package name */
    public final S f5362i0;

    /* renamed from: j0  reason: collision with root package name */
    public C0821m f5363j0;

    /* renamed from: k0  reason: collision with root package name */
    public final C0407l f5364k0;

    /* renamed from: l0  reason: collision with root package name */
    public final P f5365l0;

    /* renamed from: m0  reason: collision with root package name */
    public C0807I f5366m0;

    /* renamed from: n0  reason: collision with root package name */
    public ArrayList f5367n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f5368o0;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5369p;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f5370p0;

    /* renamed from: q  reason: collision with root package name */
    public final Rect f5371q;

    /* renamed from: q0  reason: collision with root package name */
    public final C0831x f5372q0;

    /* renamed from: r  reason: collision with root package name */
    public final Rect f5373r;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f5374r0;

    /* renamed from: s  reason: collision with root package name */
    public final RectF f5375s;
    public V s0;

    /* renamed from: t  reason: collision with root package name */
    public C0832y f5376t;

    /* renamed from: t0  reason: collision with root package name */
    public final int[] f5377t0;

    /* renamed from: u  reason: collision with root package name */
    public C0804F f5378u;

    /* renamed from: u0  reason: collision with root package name */
    public C0072l f5379u0;

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList f5380v;

    /* renamed from: v0  reason: collision with root package name */
    public final int[] f5381v0;

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList f5382w;

    /* renamed from: w0  reason: collision with root package name */
    public final int[] f5383w0;

    /* renamed from: x  reason: collision with root package name */
    public C0819k f5384x;

    /* renamed from: x0  reason: collision with root package name */
    public final int[] f5385x0;

    /* renamed from: y  reason: collision with root package name */
    public boolean f5386y;

    /* renamed from: y0  reason: collision with root package name */
    public final ArrayList f5387y0;

    /* renamed from: z  reason: collision with root package name */
    public boolean f5388z;

    /* renamed from: z0  reason: collision with root package name */
    public final C0737s0 f5389z0;

    static {
        Class cls = Integer.TYPE;
        f5324C0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    public static RecyclerView D(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView D4 = D(viewGroup.getChildAt(i2));
            if (D4 != null) {
                return D4;
            }
        }
        return null;
    }

    public static T I(View view) {
        if (view == null) {
            return null;
        }
        return ((C0805G) view.getLayoutParams()).f9861a;
    }

    private C0072l getScrollingChildHelper() {
        if (this.f5379u0 == null) {
            this.f5379u0 = new C0072l(this);
        }
        return this.f5379u0;
    }

    public static void j(T t6) {
        WeakReference weakReference = t6.f9894b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != t6.f9893a) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                } else {
                    return;
                }
            }
            t6.f9894b = null;
        }
    }

    public final View A(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean B(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f5382w;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0819k kVar = (C0819k) arrayList.get(i2);
            int i5 = kVar.f10009v;
            if (i5 == 1) {
                boolean d6 = kVar.d(motionEvent.getX(), motionEvent.getY());
                boolean c3 = kVar.c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (d6 || c3)) {
                    if (c3) {
                        kVar.f10010w = 1;
                        kVar.f10003p = (float) ((int) motionEvent.getX());
                    } else if (d6) {
                        kVar.f10010w = 2;
                        kVar.f10000m = (float) ((int) motionEvent.getY());
                    }
                    kVar.f(2);
                }
            } else if (i5 != 2) {
                continue;
            }
            if (action != 3) {
                this.f5384x = kVar;
                return true;
            }
        }
        return false;
    }

    public final void C(int[] iArr) {
        int k6 = this.f5356e.k();
        if (k6 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = f.API_PRIORITY_OTHER;
        int i5 = Integer.MIN_VALUE;
        for (int i6 = 0; i6 < k6; i6++) {
            T I6 = I(this.f5356e.j(i6));
            if (!I6.p()) {
                int b6 = I6.b();
                if (b6 < i2) {
                    i2 = b6;
                }
                if (b6 > i5) {
                    i5 = b6;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i5;
    }

    public final T E(int i2) {
        T t6 = null;
        if (this.f5333H) {
            return null;
        }
        int v6 = this.f5356e.v();
        for (int i5 = 0; i5 < v6; i5++) {
            T I6 = I(this.f5356e.t(i5));
            if (I6 != null && !I6.i() && F(I6) == i2) {
                if (!((ArrayList) this.f5356e.d).contains(I6.f9893a)) {
                    return I6;
                }
                t6 = I6;
            }
        }
        return t6;
    }

    public final int F(T t6) {
        if (t6.d(524) || !t6.f()) {
            return -1;
        }
        k kVar = this.d;
        int i2 = t6.f9895c;
        ArrayList arrayList = (ArrayList) kVar.f770c;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            C0809a aVar = (C0809a) arrayList.get(i5);
            int i6 = aVar.f9921a;
            if (i6 != 1) {
                if (i6 == 2) {
                    int i7 = aVar.f9922b;
                    if (i7 <= i2) {
                        int i8 = aVar.f9923c;
                        if (i7 + i8 > i2) {
                            return -1;
                        }
                        i2 -= i8;
                    } else {
                        continue;
                    }
                } else if (i6 == 8) {
                    int i9 = aVar.f9922b;
                    if (i9 == i2) {
                        i2 = aVar.f9923c;
                    } else {
                        if (i9 < i2) {
                            i2--;
                        }
                        if (aVar.f9923c <= i2) {
                            i2++;
                        }
                    }
                }
            } else if (aVar.f9922b <= i2) {
                i2 += aVar.f9923c;
            }
        }
        return i2;
    }

    public final long G(T t6) {
        if (this.f5376t.f10069b) {
            return t6.f9896e;
        }
        return (long) t6.f9895c;
    }

    public final T H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return I(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect J(View view) {
        C0805G g = (C0805G) view.getLayoutParams();
        boolean z3 = g.f9863c;
        Rect rect = g.f9862b;
        if (!z3) {
            return rect;
        }
        if (this.f5365l0.g && (g.f9861a.l() || g.f9861a.g())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f5380v;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Rect rect2 = this.f5371q;
            rect2.set(0, 0, 0, 0);
            ((C0802D) arrayList.get(i2)).getClass();
            ((C0805G) view.getLayoutParams()).f9861a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        g.f9863c = false;
        return rect;
    }

    public final boolean K() {
        if (!this.f5326A || this.f5333H || this.d.k()) {
            return true;
        }
        return false;
    }

    public final boolean L() {
        if (this.f5335J > 0) {
            return true;
        }
        return false;
    }

    public final void M(int i2) {
        if (this.f5378u != null) {
            setScrollState(2);
            this.f5378u.n0(i2);
            awakenScrollBars();
        }
    }

    public final void N() {
        int v6 = this.f5356e.v();
        for (int i2 = 0; i2 < v6; i2++) {
            ((C0805G) this.f5356e.t(i2).getLayoutParams()).f9863c = true;
        }
        ArrayList arrayList = (ArrayList) this.f5351b.f9494e;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            C0805G g = (C0805G) ((T) arrayList.get(i5)).f9893a.getLayoutParams();
            if (g != null) {
                g.f9863c = true;
            }
        }
    }

    public final void O(int i2, int i5, boolean z3) {
        int i6 = i2 + i5;
        int v6 = this.f5356e.v();
        for (int i7 = 0; i7 < v6; i7++) {
            T I6 = I(this.f5356e.t(i7));
            if (I6 != null && !I6.p()) {
                int i8 = I6.f9895c;
                P p6 = this.f5365l0;
                if (i8 >= i6) {
                    I6.m(-i5, z3);
                    p6.f9879f = true;
                } else if (i8 >= i2) {
                    I6.a(8);
                    I6.m(-i5, z3);
                    I6.f9895c = i2 - 1;
                    p6.f9879f = true;
                }
            }
        }
        C0770g gVar = this.f5351b;
        ArrayList arrayList = (ArrayList) gVar.f9494e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            T t6 = (T) arrayList.get(size);
            if (t6 != null) {
                int i9 = t6.f9895c;
                if (i9 >= i6) {
                    t6.m(-i5, z3);
                } else if (i9 >= i2) {
                    t6.a(8);
                    gVar.g(size);
                }
            }
        }
        requestLayout();
    }

    public final void P() {
        this.f5335J++;
    }

    public final void Q(boolean z3) {
        int i2;
        AccessibilityManager accessibilityManager;
        int i5 = this.f5335J - 1;
        this.f5335J = i5;
        if (i5 < 1) {
            this.f5335J = 0;
            if (z3) {
                int i6 = this.F;
                this.F = 0;
                if (!(i6 == 0 || (accessibilityManager = this.f5332G) == null || !accessibilityManager.isEnabled())) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i6);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.f5387y0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    T t6 = (T) arrayList.get(size);
                    if (t6.f9893a.getParent() == this && !t6.p() && (i2 = t6.f9906q) != -1) {
                        WeakHashMap weakHashMap = O.f1352a;
                        t6.f9893a.setImportantForAccessibility(i2);
                        t6.f9906q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void R(MotionEvent motionEvent) {
        int i2;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5344S) {
            if (actionIndex == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.f5344S = motionEvent.getPointerId(i2);
            int x6 = (int) (motionEvent.getX(i2) + 0.5f);
            this.f5348W = x6;
            this.f5346U = x6;
            int y6 = (int) (motionEvent.getY(i2) + 0.5f);
            this.f5350a0 = y6;
            this.f5347V = y6;
        }
    }

    public final void S() {
        if (!this.f5374r0 && this.f5386y) {
            WeakHashMap weakHashMap = O.f1352a;
            postOnAnimation(this.f5389z0);
            this.f5374r0 = true;
        }
    }

    public final void T(T t6, C0075o oVar) {
        t6.f9899j &= -8193;
        boolean z3 = this.f5365l0.h;
        a0 a0Var = this.f5358f;
        if (z3 && t6.l() && !t6.i() && !t6.p()) {
            ((g) a0Var.f9926c).d(t6, G(t6));
        }
        j jVar = (j) a0Var.f9925b;
        f0 f0Var = (f0) jVar.get(t6);
        if (f0Var == null) {
            f0Var = f0.a();
            jVar.put(t6, f0Var);
        }
        f0Var.f9967b = oVar;
        f0Var.f9966a |= 4;
    }

    public final void U(View view, View view2) {
        View view3;
        boolean z3;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f5371q;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0805G) {
            C0805G g = (C0805G) layoutParams;
            if (!g.f9863c) {
                int i2 = rect.left;
                Rect rect2 = g.f9862b;
                rect.left = i2 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        C0804F f6 = this.f5378u;
        boolean z4 = !this.f5326A;
        if (view2 == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        f6.k0(this, view, this.f5371q, z4, z3);
    }

    public final void V() {
        VelocityTracker velocityTracker = this.f5345T;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z3 = false;
        c0(0);
        EdgeEffect edgeEffect = this.f5338M;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z3 = this.f5338M.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f5339N;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z3 |= this.f5339N.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f5340O;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z3 |= this.f5340O.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f5341P;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z3 |= this.f5341P.isFinished();
        }
        if (z3) {
            WeakHashMap weakHashMap = O.f1352a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean W(int r19, int r20, android.view.MotionEvent r21) {
        /*
            r18 = this;
            r8 = r18
            r9 = r19
            r10 = r20
            r18.m()
            m0.y r0 = r8.f5376t
            int[] r11 = r8.f5385x0
            r12 = 1
            r13 = 0
            if (r0 == 0) goto L_0x0027
            r11[r13] = r13
            r11[r12] = r13
            r8.X(r9, r10, r11)
            r0 = r11[r13]
            r1 = r11[r12]
            int r2 = r9 - r0
            int r3 = r10 - r1
            r14 = r0
            r15 = r1
            r16 = r2
            r17 = r3
            goto L_0x002d
        L_0x0027:
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
        L_0x002d:
            java.util.ArrayList r0 = r8.f5380v
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0038
            r18.invalidate()
        L_0x0038:
            r11[r13] = r13
            r11[r12] = r13
            int[] r5 = r8.f5381v0
            r6 = 0
            r0 = r18
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r7 = r11
            r0.s(r1, r2, r3, r4, r5, r6, r7)
            r0 = r11[r13]
            int r1 = r16 - r0
            r2 = r11[r12]
            int r3 = r17 - r2
            if (r0 != 0) goto L_0x005a
            if (r2 == 0) goto L_0x0058
            goto L_0x005a
        L_0x0058:
            r0 = r13
            goto L_0x005b
        L_0x005a:
            r0 = r12
        L_0x005b:
            int r2 = r8.f5348W
            int[] r4 = r8.f5381v0
            r5 = r4[r13]
            int r2 = r2 - r5
            r8.f5348W = r2
            int r2 = r8.f5350a0
            r4 = r4[r12]
            int r2 = r2 - r4
            r8.f5350a0 = r2
            int[] r2 = r8.f5383w0
            r6 = r2[r13]
            int r6 = r6 + r5
            r2[r13] = r6
            r5 = r2[r12]
            int r5 = r5 + r4
            r2[r12] = r5
            int r2 = r18.getOverScrollMode()
            r4 = 2
            if (r2 == r4) goto L_0x0118
            if (r21 == 0) goto L_0x0115
            int r2 = r21.getSource()
            r4 = 8194(0x2002, float:1.1482E-41)
            r2 = r2 & r4
            if (r2 != r4) goto L_0x008b
            goto L_0x0115
        L_0x008b:
            float r2 = r21.getX()
            float r1 = (float) r1
            float r4 = r21.getY()
            float r3 = (float) r3
            r5 = 0
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r6 >= 0) goto L_0x00b5
            r18.v()
            android.widget.EdgeEffect r6 = r8.f5338M
            float r11 = -r1
            int r12 = r18.getWidth()
            float r12 = (float) r12
            float r11 = r11 / r12
            int r12 = r18.getHeight()
            float r12 = (float) r12
            float r4 = r4 / r12
            float r4 = r7 - r4
            Q.d.a(r6, r11, r4)
        L_0x00b3:
            r4 = 1
            goto L_0x00d0
        L_0x00b5:
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x00cf
            r18.w()
            android.widget.EdgeEffect r6 = r8.f5340O
            int r11 = r18.getWidth()
            float r11 = (float) r11
            float r11 = r1 / r11
            int r12 = r18.getHeight()
            float r12 = (float) r12
            float r4 = r4 / r12
            Q.d.a(r6, r11, r4)
            goto L_0x00b3
        L_0x00cf:
            r4 = r13
        L_0x00d0:
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x00eb
            r18.x()
            android.widget.EdgeEffect r4 = r8.f5339N
            float r6 = -r3
            int r7 = r18.getHeight()
            float r7 = (float) r7
            float r6 = r6 / r7
            int r7 = r18.getWidth()
            float r7 = (float) r7
            float r2 = r2 / r7
            Q.d.a(r4, r6, r2)
        L_0x00e9:
            r4 = 1
            goto L_0x0106
        L_0x00eb:
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x0106
            r18.u()
            android.widget.EdgeEffect r4 = r8.f5341P
            int r6 = r18.getHeight()
            float r6 = (float) r6
            float r6 = r3 / r6
            int r11 = r18.getWidth()
            float r11 = (float) r11
            float r2 = r2 / r11
            float r7 = r7 - r2
            Q.d.a(r4, r6, r7)
            goto L_0x00e9
        L_0x0106:
            if (r4 != 0) goto L_0x0110
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0110
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0115
        L_0x0110:
            java.util.WeakHashMap r1 = K.O.f1352a
            r18.postInvalidateOnAnimation()
        L_0x0115:
            r18.l(r19, r20)
        L_0x0118:
            if (r14 != 0) goto L_0x011c
            if (r15 == 0) goto L_0x011f
        L_0x011c:
            r8.t(r14, r15)
        L_0x011f:
            boolean r1 = r18.awakenScrollBars()
            if (r1 != 0) goto L_0x0128
            r18.invalidate()
        L_0x0128:
            if (r0 != 0) goto L_0x0131
            if (r14 != 0) goto L_0x0131
            if (r15 == 0) goto L_0x012f
            goto L_0x0131
        L_0x012f:
            r12 = r13
            goto L_0x0132
        L_0x0131:
            r12 = 1
        L_0x0132:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.W(int, int, android.view.MotionEvent):boolean");
    }

    public final void X(int i2, int i5, int[] iArr) {
        int i6;
        int i7;
        T t6;
        i iVar = this.f5356e;
        a0();
        P();
        int i8 = l.f807a;
        Trace.beginSection("RV Scroll");
        P p6 = this.f5365l0;
        z(p6);
        C0770g gVar = this.f5351b;
        if (i2 != 0) {
            i6 = this.f5378u.m0(i2, gVar, p6);
        } else {
            i6 = 0;
        }
        if (i5 != 0) {
            i7 = this.f5378u.o0(i5, gVar, p6);
        } else {
            i7 = 0;
        }
        Trace.endSection();
        int k6 = iVar.k();
        for (int i9 = 0; i9 < k6; i9++) {
            View j6 = iVar.j(i9);
            T H6 = H(j6);
            if (!(H6 == null || (t6 = H6.f9898i) == null)) {
                int left = j6.getLeft();
                int top = j6.getTop();
                View view = t6.f9893a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        Q(true);
        b0(false);
        if (iArr != null) {
            iArr[0] = i6;
            iArr[1] = i7;
        }
    }

    public final void Y(int i2) {
        C0827t tVar;
        if (!this.f5330D) {
            setScrollState(0);
            S s6 = this.f5362i0;
            s6.f9891p.removeCallbacks(s6);
            s6.f9888c.abortAnimation();
            C0804F f6 = this.f5378u;
            if (!(f6 == null || (tVar = f6.f9852e) == null)) {
                tVar.i();
            }
            C0804F f7 = this.f5378u;
            if (f7 == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            f7.n0(i2);
            awakenScrollBars();
        }
    }

    public final void Z(int i2, int i5, boolean z3) {
        C0804F f6 = this.f5378u;
        if (f6 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f5330D) {
            int i6 = 0;
            if (!f6.d()) {
                i2 = 0;
            }
            if (!this.f5378u.e()) {
                i5 = 0;
            }
            if (i2 != 0 || i5 != 0) {
                if (z3) {
                    if (i2 != 0) {
                        i6 = 1;
                    }
                    if (i5 != 0) {
                        i6 |= 2;
                    }
                    getScrollingChildHelper().g(i6, 1);
                }
                this.f5362i0.b(i2, i5, Integer.MIN_VALUE, (BaseInterpolator) null);
            }
        }
    }

    public final void a0() {
        int i2 = this.f5328B + 1;
        this.f5328B = i2;
        if (i2 == 1 && !this.f5330D) {
            this.f5329C = false;
        }
    }

    public final void addFocusables(ArrayList arrayList, int i2, int i5) {
        C0804F f6 = this.f5378u;
        if (f6 != null) {
            f6.getClass();
        }
        super.addFocusables(arrayList, i2, i5);
    }

    public final void b0(boolean z3) {
        if (this.f5328B < 1) {
            this.f5328B = 1;
        }
        if (!z3 && !this.f5330D) {
            this.f5329C = false;
        }
        if (this.f5328B == 1) {
            if (z3 && this.f5329C && !this.f5330D && this.f5378u != null && this.f5376t != null) {
                o();
            }
            if (!this.f5330D) {
                this.f5329C = false;
            }
        }
        this.f5328B--;
    }

    public final void c0(int i2) {
        getScrollingChildHelper().h(i2);
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof C0805G) || !this.f5378u.f((C0805G) layoutParams)) {
            return false;
        }
        return true;
    }

    public final int computeHorizontalScrollExtent() {
        C0804F f6 = this.f5378u;
        if (f6 != null && f6.d()) {
            return this.f5378u.j(this.f5365l0);
        }
        return 0;
    }

    public final int computeHorizontalScrollOffset() {
        C0804F f6 = this.f5378u;
        if (f6 != null && f6.d()) {
            return this.f5378u.k(this.f5365l0);
        }
        return 0;
    }

    public final int computeHorizontalScrollRange() {
        C0804F f6 = this.f5378u;
        if (f6 != null && f6.d()) {
            return this.f5378u.l(this.f5365l0);
        }
        return 0;
    }

    public final int computeVerticalScrollExtent() {
        C0804F f6 = this.f5378u;
        if (f6 != null && f6.e()) {
            return this.f5378u.m(this.f5365l0);
        }
        return 0;
    }

    public final int computeVerticalScrollOffset() {
        C0804F f6 = this.f5378u;
        if (f6 != null && f6.e()) {
            return this.f5378u.n(this.f5365l0);
        }
        return 0;
    }

    public final int computeVerticalScrollRange() {
        C0804F f6 = this.f5378u;
        if (f6 != null && f6.e()) {
            return this.f5378u.o(this.f5365l0);
        }
        return 0;
    }

    public final boolean dispatchNestedFling(float f6, float f7, boolean z3) {
        return getScrollingChildHelper().a(f6, f7, z3);
    }

    public final boolean dispatchNestedPreFling(float f6, float f7) {
        return getScrollingChildHelper().b(f6, f7);
    }

    public final boolean dispatchNestedPreScroll(int i2, int i5, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i5, 0, iArr, iArr2);
    }

    public final boolean dispatchNestedScroll(int i2, int i5, int i6, int i7, int[] iArr) {
        return getScrollingChildHelper().d(i2, i5, i6, i7, iArr, 0, (int[]) null);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public final void draw(Canvas canvas) {
        boolean z3;
        int i2;
        boolean z4;
        boolean z5;
        int i5;
        boolean z6 = true;
        super.draw(canvas);
        ArrayList arrayList = this.f5380v;
        int size = arrayList.size();
        boolean z7 = false;
        for (int i6 = 0; i6 < size; i6++) {
            ((C0802D) arrayList.get(i6)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.f5338M;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z3 = false;
        } else {
            int save = canvas.save();
            if (this.f5369p) {
                i5 = getPaddingBottom();
            } else {
                i5 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + i5), 0.0f);
            EdgeEffect edgeEffect2 = this.f5338M;
            if (edgeEffect2 == null || !edgeEffect2.draw(canvas)) {
                z3 = false;
            } else {
                z3 = true;
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f5339N;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f5369p) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f5339N;
            if (edgeEffect4 == null || !edgeEffect4.draw(canvas)) {
                z5 = false;
            } else {
                z5 = true;
            }
            z3 |= z5;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f5340O;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.f5369p) {
                i2 = getPaddingTop();
            } else {
                i2 = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate((float) (-i2), (float) (-width));
            EdgeEffect edgeEffect6 = this.f5340O;
            if (edgeEffect6 == null || !edgeEffect6.draw(canvas)) {
                z4 = false;
            } else {
                z4 = true;
            }
            z3 |= z4;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f5341P;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f5369p) {
                canvas.translate((float) (getPaddingRight() + (-getWidth())), (float) (getPaddingBottom() + (-getHeight())));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.f5341P;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z7 = true;
            }
            z3 |= z7;
            canvas.restoreToCount(save4);
        }
        if (z3 || this.f5342Q == null || arrayList.size() <= 0 || !this.f5342Q.f()) {
            z6 = z3;
        }
        if (z6) {
            WeakHashMap weakHashMap = O.f1352a;
            postInvalidateOnAnimation();
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j6) {
        return super.drawChild(canvas, view, j6);
    }

    public final void f(T t6) {
        boolean z3;
        View view = t6.f9893a;
        if (view.getParent() == this) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f5351b.o(H(view));
        if (t6.k()) {
            this.f5356e.b(view, -1, view.getLayoutParams(), true);
        } else if (!z3) {
            this.f5356e.a(view, -1, true);
        } else {
            i iVar = this.f5356e;
            int indexOfChild = ((C0831x) iVar.f5605b).f10067a.indexOfChild(view);
            if (indexOfChild >= 0) {
                ((u) iVar.f5606c).o(indexOfChild);
                iVar.x(view);
                return;
            }
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x015e, code lost:
        if (r7 > 0) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x017c, code lost:
        if (r5 > 0) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x017f, code lost:
        if (r7 < 0) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0182, code lost:
        if (r5 < 0) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x018a, code lost:
        if ((r5 * r6) < 0) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0192, code lost:
        if ((r5 * r6) > 0) goto L_0x0195;
     */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            m0.F r3 = r0.f5378u
            r3.getClass()
            m0.y r3 = r0.f5376t
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0021
            m0.F r3 = r0.f5378u
            if (r3 == 0) goto L_0x0021
            boolean r3 = r16.L()
            if (r3 != 0) goto L_0x0021
            boolean r3 = r0.f5330D
            if (r3 != 0) goto L_0x0021
            r3 = r4
            goto L_0x0022
        L_0x0021:
            r3 = r5
        L_0x0022:
            android.view.FocusFinder r6 = android.view.FocusFinder.getInstance()
            m0.P r7 = r0.f5365l0
            k5.g r8 = r0.f5351b
            r9 = 17
            r11 = 33
            r13 = 0
            r14 = 2
            if (r3 == 0) goto L_0x0093
            if (r2 == r14) goto L_0x0036
            if (r2 != r4) goto L_0x0093
        L_0x0036:
            m0.F r3 = r0.f5378u
            boolean r3 = r3.e()
            if (r3 == 0) goto L_0x004c
            if (r2 != r14) goto L_0x0043
            r3 = 130(0x82, float:1.82E-43)
            goto L_0x0044
        L_0x0043:
            r3 = r11
        L_0x0044:
            android.view.View r3 = r6.findNextFocus(r0, r1, r3)
            if (r3 != 0) goto L_0x004c
            r3 = r4
            goto L_0x004d
        L_0x004c:
            r3 = r5
        L_0x004d:
            if (r3 != 0) goto L_0x0077
            m0.F r15 = r0.f5378u
            boolean r15 = r15.d()
            if (r15 == 0) goto L_0x0077
            m0.F r3 = r0.f5378u
            int r3 = r3.C()
            if (r3 != r4) goto L_0x0061
            r3 = r4
            goto L_0x0062
        L_0x0061:
            r3 = r5
        L_0x0062:
            if (r2 != r14) goto L_0x0066
            r15 = r4
            goto L_0x0067
        L_0x0066:
            r15 = r5
        L_0x0067:
            r3 = r3 ^ r15
            if (r3 == 0) goto L_0x006d
            r3 = 66
            goto L_0x006e
        L_0x006d:
            r3 = r9
        L_0x006e:
            android.view.View r3 = r6.findNextFocus(r0, r1, r3)
            if (r3 != 0) goto L_0x0076
            r3 = r4
            goto L_0x0077
        L_0x0076:
            r3 = r5
        L_0x0077:
            if (r3 == 0) goto L_0x008e
            r16.m()
            android.view.View r3 = r16.A(r17)
            if (r3 != 0) goto L_0x0083
            return r13
        L_0x0083:
            r16.a0()
            m0.F r3 = r0.f5378u
            r3.S(r1, r2, r8, r7)
            r0.b0(r5)
        L_0x008e:
            android.view.View r3 = r6.findNextFocus(r0, r1, r2)
            goto L_0x00b3
        L_0x0093:
            android.view.View r6 = r6.findNextFocus(r0, r1, r2)
            if (r6 != 0) goto L_0x00b2
            if (r3 == 0) goto L_0x00b2
            r16.m()
            android.view.View r3 = r16.A(r17)
            if (r3 != 0) goto L_0x00a5
            return r13
        L_0x00a5:
            r16.a0()
            m0.F r3 = r0.f5378u
            android.view.View r3 = r3.S(r1, r2, r8, r7)
            r0.b0(r5)
            goto L_0x00b3
        L_0x00b2:
            r3 = r6
        L_0x00b3:
            if (r3 == 0) goto L_0x00ca
            boolean r6 = r3.hasFocusable()
            if (r6 != 0) goto L_0x00ca
            android.view.View r4 = r16.getFocusedChild()
            if (r4 != 0) goto L_0x00c6
            android.view.View r1 = super.focusSearch(r17, r18)
            return r1
        L_0x00c6:
            r0.U(r3, r13)
            return r1
        L_0x00ca:
            if (r3 == 0) goto L_0x0195
            if (r3 != r0) goto L_0x00d0
            goto L_0x0195
        L_0x00d0:
            android.view.View r6 = r0.A(r3)
            if (r6 != 0) goto L_0x00d9
            r4 = r5
            goto L_0x0196
        L_0x00d9:
            if (r1 != 0) goto L_0x00dd
            goto L_0x0196
        L_0x00dd:
            android.view.View r6 = r16.A(r17)
            if (r6 != 0) goto L_0x00e5
            goto L_0x0196
        L_0x00e5:
            int r6 = r17.getWidth()
            int r7 = r17.getHeight()
            android.graphics.Rect r8 = r0.f5371q
            r8.set(r5, r5, r6, r7)
            int r6 = r3.getWidth()
            int r7 = r3.getHeight()
            android.graphics.Rect r13 = r0.f5373r
            r13.set(r5, r5, r6, r7)
            r0.offsetDescendantRectToMyCoords(r1, r8)
            r0.offsetDescendantRectToMyCoords(r3, r13)
            m0.F r6 = r0.f5378u
            int r6 = r6.C()
            if (r6 != r4) goto L_0x010f
            r6 = -1
            goto L_0x0110
        L_0x010f:
            r6 = r4
        L_0x0110:
            int r15 = r8.left
            int r5 = r13.left
            if (r15 < r5) goto L_0x011a
            int r7 = r8.right
            if (r7 > r5) goto L_0x0122
        L_0x011a:
            int r7 = r8.right
            int r12 = r13.right
            if (r7 >= r12) goto L_0x0122
            r5 = r4
            goto L_0x012f
        L_0x0122:
            int r7 = r8.right
            int r12 = r13.right
            if (r7 > r12) goto L_0x012a
            if (r15 < r12) goto L_0x012e
        L_0x012a:
            if (r15 <= r5) goto L_0x012e
            r5 = -1
            goto L_0x012f
        L_0x012e:
            r5 = 0
        L_0x012f:
            int r7 = r8.top
            int r12 = r13.top
            if (r7 < r12) goto L_0x0139
            int r15 = r8.bottom
            if (r15 > r12) goto L_0x0141
        L_0x0139:
            int r15 = r8.bottom
            int r10 = r13.bottom
            if (r15 >= r10) goto L_0x0141
            r7 = r4
            goto L_0x014e
        L_0x0141:
            int r8 = r8.bottom
            int r10 = r13.bottom
            if (r8 > r10) goto L_0x0149
            if (r7 < r10) goto L_0x014d
        L_0x0149:
            if (r7 <= r12) goto L_0x014d
            r7 = -1
            goto L_0x014e
        L_0x014d:
            r7 = 0
        L_0x014e:
            if (r2 == r4) goto L_0x018d
            if (r2 == r14) goto L_0x0185
            if (r2 == r9) goto L_0x0182
            if (r2 == r11) goto L_0x017f
            r6 = 66
            if (r2 == r6) goto L_0x017c
            r6 = 130(0x82, float:1.82E-43)
            if (r2 != r6) goto L_0x0161
            if (r7 <= 0) goto L_0x0195
            goto L_0x0196
        L_0x0161:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Invalid direction: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r16.y()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x017c:
            if (r5 <= 0) goto L_0x0195
            goto L_0x0196
        L_0x017f:
            if (r7 >= 0) goto L_0x0195
            goto L_0x0196
        L_0x0182:
            if (r5 >= 0) goto L_0x0195
            goto L_0x0196
        L_0x0185:
            if (r7 > 0) goto L_0x0196
            if (r7 != 0) goto L_0x0195
            int r5 = r5 * r6
            if (r5 < 0) goto L_0x0195
            goto L_0x0196
        L_0x018d:
            if (r7 < 0) goto L_0x0196
            if (r7 != 0) goto L_0x0195
            int r5 = r5 * r6
            if (r5 > 0) goto L_0x0195
            goto L_0x0196
        L_0x0195:
            r4 = 0
        L_0x0196:
            if (r4 == 0) goto L_0x0199
            goto L_0x019d
        L_0x0199:
            android.view.View r3 = super.focusSearch(r17, r18)
        L_0x019d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g(C0802D d6) {
        C0804F f6 = this.f5378u;
        if (f6 != null) {
            f6.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f5380v;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(d6);
        N();
        requestLayout();
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C0804F f6 = this.f5378u;
        if (f6 != null) {
            return f6.r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C0804F f6 = this.f5378u;
        if (f6 != null) {
            return f6.s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public C0832y getAdapter() {
        return this.f5376t;
    }

    public int getBaseline() {
        C0804F f6 = this.f5378u;
        if (f6 == null) {
            return super.getBaseline();
        }
        f6.getClass();
        return -1;
    }

    public final int getChildDrawingOrder(int i2, int i5) {
        return super.getChildDrawingOrder(i2, i5);
    }

    public boolean getClipToPadding() {
        return this.f5369p;
    }

    public V getCompatAccessibilityDelegate() {
        return this.s0;
    }

    public C0800B getEdgeEffectFactory() {
        return this.f5337L;
    }

    public C0801C getItemAnimator() {
        return this.f5342Q;
    }

    public int getItemDecorationCount() {
        return this.f5380v.size();
    }

    public C0804F getLayoutManager() {
        return this.f5378u;
    }

    public int getMaxFlingVelocity() {
        return this.f5357e0;
    }

    public int getMinFlingVelocity() {
        return this.f5355d0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public C0806H getOnFlingListener() {
        return this.f5354c0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f5361h0;
    }

    public K getRecycledViewPool() {
        return this.f5351b.e();
    }

    public int getScrollState() {
        return this.f5343R;
    }

    public final void h(C0807I i2) {
        if (this.f5367n0 == null) {
            this.f5367n0 = new ArrayList();
        }
        this.f5367n0.add(i2);
    }

    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(String str) {
        if (L()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + y());
            }
            throw new IllegalStateException(str);
        } else if (this.f5336K > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + y()));
        }
    }

    public final boolean isAttachedToWindow() {
        return this.f5386y;
    }

    public final boolean isLayoutSuppressed() {
        return this.f5330D;
    }

    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void k() {
        int v6 = this.f5356e.v();
        for (int i2 = 0; i2 < v6; i2++) {
            T I6 = I(this.f5356e.t(i2));
            if (!I6.p()) {
                I6.d = -1;
                I6.g = -1;
            }
        }
        C0770g gVar = this.f5351b;
        ArrayList arrayList = (ArrayList) gVar.f9494e;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            T t6 = (T) arrayList.get(i5);
            t6.d = -1;
            t6.g = -1;
        }
        ArrayList arrayList2 = gVar.f9491a;
        int size2 = arrayList2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            T t7 = (T) arrayList2.get(i6);
            t7.d = -1;
            t7.g = -1;
        }
        ArrayList arrayList3 = gVar.f9492b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i7 = 0; i7 < size3; i7++) {
                T t8 = (T) gVar.f9492b.get(i7);
                t8.d = -1;
                t8.g = -1;
            }
        }
    }

    public final void l(int i2, int i5) {
        boolean z3;
        EdgeEffect edgeEffect = this.f5338M;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z3 = false;
        } else {
            this.f5338M.onRelease();
            z3 = this.f5338M.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f5340O;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.f5340O.onRelease();
            z3 |= this.f5340O.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f5339N;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i5 > 0) {
            this.f5339N.onRelease();
            z3 |= this.f5339N.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f5341P;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i5 < 0) {
            this.f5341P.onRelease();
            z3 |= this.f5341P.isFinished();
        }
        if (z3) {
            WeakHashMap weakHashMap = O.f1352a;
            postInvalidateOnAnimation();
        }
    }

    public final void m() {
        k kVar = this.d;
        if (!this.f5326A || this.f5333H) {
            int i2 = l.f807a;
            Trace.beginSection("RV FullInvalidate");
            o();
            Trace.endSection();
        } else if (kVar.k()) {
            kVar.getClass();
            if (kVar.k()) {
                int i5 = l.f807a;
                Trace.beginSection("RV FullInvalidate");
                o();
                Trace.endSection();
            }
        }
    }

    public final void n(int i2, int i5) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = O.f1352a;
        setMeasuredDimension(C0804F.g(i2, paddingRight, getMinimumWidth()), C0804F.g(i5, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARNING: type inference failed for: r13v7, types: [java.lang.Object, K.o] */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x031f, code lost:
        if (((java.util.ArrayList) r0.f5356e.d).contains(getFocusedChild()) == false) goto L_0x03e0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x03c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o() {
        /*
            r19 = this;
            r0 = r19
            m0.y r1 = r0.f5376t
            java.lang.String r2 = "RecyclerView"
            if (r1 != 0) goto L_0x000e
            java.lang.String r1 = "No adapter attached; skipping layout"
            android.util.Log.e(r2, r1)
            return
        L_0x000e:
            m0.F r1 = r0.f5378u
            if (r1 != 0) goto L_0x0018
            java.lang.String r1 = "No layout manager attached; skipping layout"
            android.util.Log.e(r2, r1)
            return
        L_0x0018:
            m0.P r1 = r0.f5365l0
            r3 = 0
            r1.f9880i = r3
            int r4 = r1.d
            r5 = 1
            if (r4 != r5) goto L_0x002e
            r19.p()
            m0.F r4 = r0.f5378u
            r4.p0(r0)
            r19.q()
            goto L_0x0068
        L_0x002e:
            F3.k r4 = r0.d
            java.lang.Object r6 = r4.d
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x0045
            java.lang.Object r4 = r4.f770c
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0045
            goto L_0x0060
        L_0x0045:
            m0.F r4 = r0.f5378u
            int r4 = r4.f9859n
            int r6 = r19.getWidth()
            if (r4 != r6) goto L_0x0060
            m0.F r4 = r0.f5378u
            int r4 = r4.f9860o
            int r6 = r19.getHeight()
            if (r4 == r6) goto L_0x005a
            goto L_0x0060
        L_0x005a:
            m0.F r4 = r0.f5378u
            r4.p0(r0)
            goto L_0x0068
        L_0x0060:
            m0.F r4 = r0.f5378u
            r4.p0(r0)
            r19.q()
        L_0x0068:
            r4 = 4
            r1.a(r4)
            r19.a0()
            r19.P()
            r1.d = r5
            boolean r6 = r1.f9881j
            k5.g r8 = r0.f5351b
            m0.a0 r9 = r0.f5358f
            if (r6 == 0) goto L_0x0282
            c1.i r6 = r0.f5356e
            int r6 = r6.k()
            int r6 = r6 - r5
        L_0x0083:
            if (r6 < 0) goto L_0x01b6
            c1.i r10 = r0.f5356e
            android.view.View r10 = r10.j(r6)
            m0.T r10 = I(r10)
            boolean r11 = r10.p()
            if (r11 == 0) goto L_0x0097
            goto L_0x01b1
        L_0x0097:
            long r11 = r0.G(r10)
            m0.C r13 = r0.f5342Q
            r13.getClass()
            K.o r13 = new K.o
            r13.<init>()
            r13.a(r10)
            java.lang.Object r14 = r9.f9926c
            n.g r14 = (n.g) r14
            java.lang.Object r14 = r14.b(r11)
            m0.T r14 = (m0.T) r14
            if (r14 == 0) goto L_0x01ae
            boolean r15 = r14.p()
            if (r15 != 0) goto L_0x01ae
            java.lang.Object r15 = r9.f9925b
            n.j r15 = (n.j) r15
            java.lang.Object r16 = r15.get(r14)
            r7 = r16
            m0.f0 r7 = (m0.f0) r7
            if (r7 == 0) goto L_0x00cf
            int r7 = r7.f9966a
            r7 = r7 & r5
            if (r7 == 0) goto L_0x00cf
            r7 = r5
            goto L_0x00d0
        L_0x00cf:
            r7 = r3
        L_0x00d0:
            java.lang.Object r15 = r15.get(r10)
            m0.f0 r15 = (m0.f0) r15
            if (r15 == 0) goto L_0x00df
            int r15 = r15.f9966a
            r15 = r15 & r5
            if (r15 == 0) goto L_0x00df
            r15 = r5
            goto L_0x00e0
        L_0x00df:
            r15 = r3
        L_0x00e0:
            if (r7 == 0) goto L_0x00e9
            if (r14 != r10) goto L_0x00e9
            r9.d(r10, r13)
            goto L_0x01b1
        L_0x00e9:
            K.o r5 = r9.s(r14, r4)
            r9.d(r10, r13)
            r13 = 8
            K.o r13 = r9.s(r10, r13)
            if (r5 != 0) goto L_0x0186
            c1.i r5 = r0.f5356e
            int r5 = r5.k()
            r7 = r3
        L_0x00ff:
            if (r7 >= r5) goto L_0x0165
            c1.i r13 = r0.f5356e
            android.view.View r13 = r13.j(r7)
            m0.T r13 = I(r13)
            if (r13 != r10) goto L_0x010e
            goto L_0x0162
        L_0x010e:
            long r17 = r0.G(r13)
            int r15 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r15 != 0) goto L_0x0162
            m0.y r1 = r0.f5376t
            java.lang.String r2 = " \n View Holder 2:"
            if (r1 == 0) goto L_0x0141
            boolean r1 = r1.f10069b
            if (r1 == 0) goto L_0x0141
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            r3.<init>(r4)
            r3.append(r13)
            r3.append(r2)
            r3.append(r10)
            java.lang.String r2 = r19.y()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x0141:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"
            r3.<init>(r4)
            r3.append(r13)
            r3.append(r2)
            r3.append(r10)
            java.lang.String r2 = r19.y()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x0162:
            int r7 = r7 + 1
            goto L_0x00ff
        L_0x0165:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder "
            r5.<init>(r7)
            r5.append(r14)
            java.lang.String r7 = " cannot be found but it is necessary for "
            r5.append(r7)
            r5.append(r10)
            java.lang.String r7 = r19.y()
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r2, r5)
            goto L_0x01b1
        L_0x0186:
            r14.o(r3)
            if (r7 == 0) goto L_0x018e
            r0.f(r14)
        L_0x018e:
            if (r14 == r10) goto L_0x01a2
            if (r15 == 0) goto L_0x0195
            r0.f(r10)
        L_0x0195:
            r14.h = r10
            r0.f(r14)
            r8.o(r14)
            r10.o(r3)
            r10.f9898i = r14
        L_0x01a2:
            m0.C r7 = r0.f5342Q
            boolean r5 = r7.a(r14, r10, r5, r13)
            if (r5 == 0) goto L_0x01b1
            r19.S()
            goto L_0x01b1
        L_0x01ae:
            r9.d(r10, r13)
        L_0x01b1:
            int r6 = r6 + -1
            r5 = 1
            goto L_0x0083
        L_0x01b6:
            java.lang.Object r2 = r9.f9925b
            n.j r2 = (n.j) r2
            int r4 = r2.f10226c
            r5 = 1
            int r4 = r4 - r5
        L_0x01be:
            if (r4 < 0) goto L_0x0282
            java.lang.Object r5 = r2.f(r4)
            r11 = r5
            m0.T r11 = (m0.T) r11
            java.lang.Object r5 = r2.h(r4)
            m0.f0 r5 = (m0.f0) r5
            int r6 = r5.f9966a
            r7 = r6 & 3
            r10 = 3
            m0.w r12 = r0.f5327A0
            if (r7 != r10) goto L_0x01e4
            androidx.recyclerview.widget.RecyclerView r6 = r12.f10066a
            m0.F r7 = r6.f5378u
            android.view.View r10 = r11.f9893a
            k5.g r6 = r6.f5351b
            r7.i0(r10, r6)
        L_0x01e1:
            r7 = 0
            goto L_0x0272
        L_0x01e4:
            r7 = r6 & 1
            if (r7 == 0) goto L_0x01fe
            K.o r6 = r5.f9967b
            if (r6 != 0) goto L_0x01f8
            androidx.recyclerview.widget.RecyclerView r6 = r12.f10066a
            m0.F r7 = r6.f5378u
            android.view.View r10 = r11.f9893a
            k5.g r6 = r6.f5351b
            r7.i0(r10, r6)
            goto L_0x01e1
        L_0x01f8:
            K.o r7 = r5.f9968c
            r12.g(r11, r6, r7)
            goto L_0x01e1
        L_0x01fe:
            r7 = r6 & 14
            r10 = 14
            if (r7 != r10) goto L_0x020c
            K.o r6 = r5.f9967b
            K.o r7 = r5.f9968c
            r12.f(r11, r6, r7)
            goto L_0x01e1
        L_0x020c:
            r7 = r6 & 12
            r10 = 12
            if (r7 != r10) goto L_0x0259
            K.o r6 = r5.f9967b
            K.o r7 = r5.f9968c
            r12.getClass()
            r11.o(r3)
            androidx.recyclerview.widget.RecyclerView r15 = r12.f10066a
            boolean r10 = r15.f5333H
            if (r10 == 0) goto L_0x022e
            m0.C r10 = r15.f5342Q
            boolean r6 = r10.a(r11, r11, r6, r7)
            if (r6 == 0) goto L_0x0257
            r15.S()
            goto L_0x0257
        L_0x022e:
            m0.C r10 = r15.f5342Q
            m0.h r10 = (m0.C0816h) r10
            r10.getClass()
            int r12 = r6.f1411a
            int r14 = r7.f1411a
            if (r12 != r14) goto L_0x0248
            int r13 = r6.f1412b
            int r3 = r7.f1412b
            if (r13 == r3) goto L_0x0242
            goto L_0x0248
        L_0x0242:
            r10.c(r11)
            r6 = r15
            r3 = 0
            goto L_0x0252
        L_0x0248:
            int r13 = r6.f1412b
            int r3 = r7.f1412b
            r6 = r15
            r15 = r3
            boolean r3 = r10.g(r11, r12, r13, r14, r15)
        L_0x0252:
            if (r3 == 0) goto L_0x0257
            r6.S()
        L_0x0257:
            r3 = 0
            goto L_0x01e1
        L_0x0259:
            r3 = r6 & 4
            if (r3 == 0) goto L_0x0265
            K.o r3 = r5.f9967b
            r7 = 0
            r12.g(r11, r3, r7)
        L_0x0263:
            r3 = 0
            goto L_0x0272
        L_0x0265:
            r7 = 0
            r3 = r6 & 8
            if (r3 == 0) goto L_0x0263
            K.o r3 = r5.f9967b
            K.o r6 = r5.f9968c
            r12.f(r11, r3, r6)
            goto L_0x0263
        L_0x0272:
            r5.f9966a = r3
            r5.f9967b = r7
            r5.f9968c = r7
            J.b r3 = m0.f0.d
            r3.c(r5)
            int r4 = r4 + -1
            r3 = 0
            goto L_0x01be
        L_0x0282:
            r7 = 0
            m0.F r2 = r0.f5378u
            r2.h0(r8)
            int r2 = r1.f9878e
            r1.f9876b = r2
            r3 = 0
            r0.f5333H = r3
            r0.f5334I = r3
            r1.f9881j = r3
            r1.f9882k = r3
            m0.F r2 = r0.f5378u
            r2.f9853f = r3
            java.util.ArrayList r2 = r8.f9492b
            if (r2 == 0) goto L_0x02a0
            r2.clear()
        L_0x02a0:
            m0.F r2 = r0.f5378u
            boolean r4 = r2.f9856k
            if (r4 == 0) goto L_0x02ad
            r2.f9855j = r3
            r2.f9856k = r3
            r8.p()
        L_0x02ad:
            m0.F r2 = r0.f5378u
            r2.c0(r1)
            r2 = 1
            r0.Q(r2)
            r0.b0(r3)
            java.lang.Object r2 = r9.f9925b
            n.j r2 = (n.j) r2
            r2.clear()
            java.lang.Object r2 = r9.f9926c
            n.g r2 = (n.g) r2
            r2.a()
            int[] r2 = r0.f5377t0
            r4 = r2[r3]
            r5 = 1
            r6 = r2[r5]
            r0.C(r2)
            r8 = r2[r3]
            if (r8 != r4) goto L_0x02dc
            r2 = r2[r5]
            if (r2 == r6) goto L_0x02da
            goto L_0x02dc
        L_0x02da:
            r5 = r3
            goto L_0x02dd
        L_0x02dc:
            r5 = 1
        L_0x02dd:
            if (r5 == 0) goto L_0x02e2
            r0.t(r3, r3)
        L_0x02e2:
            boolean r2 = r0.f5361h0
            r4 = -1
            r6 = -1
            if (r2 == 0) goto L_0x03e0
            m0.y r2 = r0.f5376t
            if (r2 == 0) goto L_0x03e0
            boolean r2 = r19.hasFocus()
            if (r2 == 0) goto L_0x03e0
            int r2 = r19.getDescendantFocusability()
            r8 = 393216(0x60000, float:5.51013E-40)
            if (r2 == r8) goto L_0x03e0
            int r2 = r19.getDescendantFocusability()
            r8 = 131072(0x20000, float:1.83671E-40)
            if (r2 != r8) goto L_0x030b
            boolean r2 = r19.isFocused()
            if (r2 == 0) goto L_0x030b
            goto L_0x03e0
        L_0x030b:
            boolean r2 = r19.isFocused()
            if (r2 != 0) goto L_0x0323
            android.view.View r2 = r19.getFocusedChild()
            c1.i r8 = r0.f5356e
            java.lang.Object r8 = r8.d
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            boolean r2 = r8.contains(r2)
            if (r2 != 0) goto L_0x0323
            goto L_0x03e0
        L_0x0323:
            long r8 = r1.f9884m
            int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0369
            m0.y r2 = r0.f5376t
            boolean r2 = r2.f10069b
            if (r2 == 0) goto L_0x0369
            if (r2 != 0) goto L_0x0332
            goto L_0x0369
        L_0x0332:
            c1.i r2 = r0.f5356e
            int r2 = r2.v()
            r10 = r3
            r11 = r7
        L_0x033a:
            if (r10 >= r2) goto L_0x036a
            c1.i r12 = r0.f5356e
            android.view.View r12 = r12.t(r10)
            m0.T r12 = I(r12)
            if (r12 == 0) goto L_0x0366
            boolean r13 = r12.i()
            if (r13 != 0) goto L_0x0366
            long r13 = r12.f9896e
            int r13 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r13 != 0) goto L_0x0366
            c1.i r11 = r0.f5356e
            java.lang.Object r11 = r11.d
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            android.view.View r13 = r12.f9893a
            boolean r11 = r11.contains(r13)
            if (r11 == 0) goto L_0x0364
            r11 = r12
            goto L_0x0366
        L_0x0364:
            r11 = r12
            goto L_0x036a
        L_0x0366:
            int r10 = r10 + 1
            goto L_0x033a
        L_0x0369:
            r11 = r7
        L_0x036a:
            if (r11 == 0) goto L_0x0383
            c1.i r2 = r0.f5356e
            java.lang.Object r2 = r2.d
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            android.view.View r8 = r11.f9893a
            boolean r2 = r2.contains(r8)
            if (r2 != 0) goto L_0x0383
            boolean r2 = r8.hasFocusable()
            if (r2 != 0) goto L_0x0381
            goto L_0x0383
        L_0x0381:
            r7 = r8
            goto L_0x03c7
        L_0x0383:
            c1.i r2 = r0.f5356e
            int r2 = r2.k()
            if (r2 <= 0) goto L_0x03c7
            int r2 = r1.f9883l
            if (r2 == r6) goto L_0x0390
            r3 = r2
        L_0x0390:
            int r2 = r1.b()
            r8 = r3
        L_0x0395:
            if (r8 >= r2) goto L_0x03ab
            m0.T r9 = r0.E(r8)
            if (r9 != 0) goto L_0x039e
            goto L_0x03ab
        L_0x039e:
            android.view.View r9 = r9.f9893a
            boolean r10 = r9.hasFocusable()
            if (r10 == 0) goto L_0x03a8
            r7 = r9
            goto L_0x03c7
        L_0x03a8:
            int r8 = r8 + 1
            goto L_0x0395
        L_0x03ab:
            int r2 = java.lang.Math.min(r2, r3)
            r3 = 1
            int r2 = r2 - r3
        L_0x03b1:
            if (r2 < 0) goto L_0x03c7
            m0.T r3 = r0.E(r2)
            if (r3 != 0) goto L_0x03ba
            goto L_0x03c7
        L_0x03ba:
            android.view.View r3 = r3.f9893a
            boolean r8 = r3.hasFocusable()
            if (r8 == 0) goto L_0x03c4
            r7 = r3
            goto L_0x03c7
        L_0x03c4:
            int r2 = r2 + -1
            goto L_0x03b1
        L_0x03c7:
            if (r7 == 0) goto L_0x03e0
            int r2 = r1.f9885n
            long r8 = (long) r2
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x03dd
            android.view.View r2 = r7.findViewById(r2)
            if (r2 == 0) goto L_0x03dd
            boolean r3 = r2.isFocusable()
            if (r3 == 0) goto L_0x03dd
            r7 = r2
        L_0x03dd:
            r7.requestFocus()
        L_0x03e0:
            r1.f9884m = r4
            r1.f9883l = r6
            r1.f9885n = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o():void");
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [m0.m, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005a, code lost:
        if (r1 >= 30.0f) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f5335J = r0
            r1 = 1
            r5.f5386y = r1
            boolean r2 = r5.f5326A
            if (r2 == 0) goto L_0x0015
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L_0x0015
            r2 = r1
            goto L_0x0016
        L_0x0015:
            r2 = r0
        L_0x0016:
            r5.f5326A = r2
            m0.F r2 = r5.f5378u
            if (r2 == 0) goto L_0x0021
            r2.g = r1
            r2.Q(r5)
        L_0x0021:
            r5.f5374r0 = r0
            java.lang.ThreadLocal r0 = m0.C0821m.f10018e
            java.lang.Object r1 = r0.get()
            m0.m r1 = (m0.C0821m) r1
            r5.f5363j0 = r1
            if (r1 != 0) goto L_0x006b
            m0.m r1 = new m0.m
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f10020a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.d = r2
            r5.f5363j0 = r1
            java.util.WeakHashMap r1 = K.O.f1352a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L_0x005d
            if (r1 == 0) goto L_0x005d
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x005d
            goto L_0x005f
        L_0x005d:
            r1 = 1114636288(0x42700000, float:60.0)
        L_0x005f:
            m0.m r2 = r5.f5363j0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f10022c = r3
            r0.set(r2)
        L_0x006b:
            m0.m r0 = r5.f5363j0
            java.util.ArrayList r0 = r0.f10020a
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    public final void onDetachedFromWindow() {
        C0827t tVar;
        super.onDetachedFromWindow();
        C0801C c3 = this.f5342Q;
        if (c3 != null) {
            c3.e();
        }
        setScrollState(0);
        S s6 = this.f5362i0;
        s6.f9891p.removeCallbacks(s6);
        s6.f9888c.abortAnimation();
        C0804F f6 = this.f5378u;
        if (!(f6 == null || (tVar = f6.f9852e) == null)) {
            tVar.i();
        }
        this.f5386y = false;
        C0804F f7 = this.f5378u;
        if (f7 != null) {
            f7.g = false;
            f7.R(this);
        }
        this.f5387y0.clear();
        removeCallbacks(this.f5389z0);
        this.f5358f.getClass();
        do {
        } while (f0.d.a() != null);
        C0821m mVar = this.f5363j0;
        if (mVar != null) {
            mVar.f10020a.remove(this);
            this.f5363j0 = null;
        }
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f5380v;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0802D) arrayList.get(i2)).a(this);
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f6;
        float f7;
        if (this.f5378u != null && !this.f5330D && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.f5378u.e()) {
                    f7 = -motionEvent.getAxisValue(9);
                } else {
                    f7 = 0.0f;
                }
                if (this.f5378u.d()) {
                    f6 = motionEvent.getAxisValue(10);
                    if (!(f7 == 0.0f && f6 == 0.0f)) {
                        W((int) (f6 * this.f5359f0), (int) (f7 * this.f5360g0), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f5378u.e()) {
                        f7 = -axisValue;
                    } else if (this.f5378u.d()) {
                        f6 = axisValue;
                        f7 = 0.0f;
                        W((int) (f6 * this.f5359f0), (int) (f7 * this.f5360g0), motionEvent);
                    }
                }
                f7 = 0.0f;
                f6 = 0.0f;
                W((int) (f6 * this.f5359f0), (int) (f7 * this.f5360g0), motionEvent);
            }
            f6 = 0.0f;
            W((int) (f6 * this.f5359f0), (int) (f7 * this.f5360g0), motionEvent);
        }
        return false;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        if (this.f5330D) {
            return false;
        }
        this.f5384x = null;
        if (B(motionEvent)) {
            V();
            setScrollState(0);
            return true;
        }
        C0804F f6 = this.f5378u;
        if (f6 == null) {
            return false;
        }
        boolean d6 = f6.d();
        boolean e6 = this.f5378u.e();
        if (this.f5345T == null) {
            this.f5345T = VelocityTracker.obtain();
        }
        this.f5345T.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f5331E) {
                this.f5331E = false;
            }
            this.f5344S = motionEvent.getPointerId(0);
            int x6 = (int) (motionEvent.getX() + 0.5f);
            this.f5348W = x6;
            this.f5346U = x6;
            int y6 = (int) (motionEvent.getY() + 0.5f);
            this.f5350a0 = y6;
            this.f5347V = y6;
            if (this.f5343R == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                c0(1);
            }
            int[] iArr = this.f5383w0;
            iArr[1] = 0;
            iArr[0] = 0;
            if (e6) {
                d6 |= true;
            }
            getScrollingChildHelper().g(d6 ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.f5345T.clear();
            c0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f5344S);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f5344S + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x7 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y7 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f5343R != 1) {
                int i2 = x7 - this.f5346U;
                int i5 = y7 - this.f5347V;
                if (!d6 || Math.abs(i2) <= this.f5352b0) {
                    z3 = false;
                } else {
                    this.f5348W = x7;
                    z3 = true;
                }
                if (e6 && Math.abs(i5) > this.f5352b0) {
                    this.f5350a0 = y7;
                    z3 = true;
                }
                if (z3) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            V();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.f5344S = motionEvent.getPointerId(actionIndex);
            int x8 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f5348W = x8;
            this.f5346U = x8;
            int y8 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f5350a0 = y8;
            this.f5347V = y8;
        } else if (actionMasked == 6) {
            R(motionEvent);
        }
        if (this.f5343R == 1) {
            return true;
        }
        return false;
    }

    public final void onLayout(boolean z3, int i2, int i5, int i6, int i7) {
        int i8 = l.f807a;
        Trace.beginSection("RV OnLayout");
        o();
        Trace.endSection();
        this.f5326A = true;
    }

    public final void onMeasure(int i2, int i5) {
        C0804F f6 = this.f5378u;
        if (f6 == null) {
            n(i2, i5);
            return;
        }
        boolean L6 = f6.L();
        P p6 = this.f5365l0;
        if (L6) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i5);
            this.f5378u.f9850b.n(i2, i5);
            if ((mode != 1073741824 || mode2 != 1073741824) && this.f5376t != null) {
                if (p6.d == 1) {
                    p();
                }
                this.f5378u.q0(i2, i5);
                p6.f9880i = true;
                q();
                this.f5378u.s0(i2, i5);
                if (this.f5378u.v0()) {
                    this.f5378u.q0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    p6.f9880i = true;
                    q();
                    this.f5378u.s0(i2, i5);
                }
            }
        } else if (this.f5388z) {
            this.f5378u.f9850b.n(i2, i5);
        } else if (p6.f9882k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            C0832y yVar = this.f5376t;
            if (yVar != null) {
                p6.f9878e = yVar.a();
            } else {
                p6.f9878e = 0;
            }
            a0();
            this.f5378u.f9850b.n(i2, i5);
            b0(false);
            p6.g = false;
        }
    }

    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (L()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof M)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        M m6 = (M) parcelable;
        this.f5353c = m6;
        super.onRestoreInstanceState(m6.f2792a);
        C0804F f6 = this.f5378u;
        if (f6 != null && (parcelable2 = this.f5353c.f9869c) != null) {
            f6.d0(parcelable2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [m0.M, android.os.Parcelable, T.c] */
    public final Parcelable onSaveInstanceState() {
        ? cVar = new c(super.onSaveInstanceState());
        M m6 = this.f5353c;
        if (m6 != null) {
            cVar.f9869c = m6.f9869c;
        } else {
            C0804F f6 = this.f5378u;
            if (f6 != null) {
                cVar.f9869c = f6.e0();
            } else {
                cVar.f9869c = null;
            }
        }
        return cVar;
    }

    public final void onSizeChanged(int i2, int i5, int i6, int i7) {
        super.onSizeChanged(i2, i5, i6, i7);
        if (i2 != i6 || i5 != i7) {
            this.f5341P = null;
            this.f5339N = null;
            this.f5340O = null;
            this.f5338M = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:235:0x0417  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0423  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0477  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0213  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            r23 = this;
            r6 = r23
            r7 = r24
            boolean r0 = r6.f5330D
            r8 = 0
            if (r0 != 0) goto L_0x000d
            boolean r0 = r6.f5331E
            if (r0 == 0) goto L_0x0011
        L_0x000d:
            r0 = r6
            r2 = r8
            goto L_0x04b9
        L_0x0011:
            m0.k r0 = r6.f5384x
            r9 = 1
            r1 = 2
            r2 = 0
            r3 = 3
            r4 = 0
            if (r0 != 0) goto L_0x0029
            int r0 = r24.getAction()
            if (r0 != 0) goto L_0x0023
            r0 = r8
            goto L_0x0130
        L_0x0023:
            boolean r0 = r23.B(r24)
            goto L_0x0130
        L_0x0029:
            int r5 = r0.f10009v
            if (r5 != 0) goto L_0x002f
            goto L_0x0125
        L_0x002f:
            int r5 = r24.getAction()
            if (r5 != 0) goto L_0x006f
            float r5 = r24.getX()
            float r10 = r24.getY()
            boolean r5 = r0.d(r5, r10)
            float r10 = r24.getX()
            float r11 = r24.getY()
            boolean r10 = r0.c(r10, r11)
            if (r5 != 0) goto L_0x0051
            if (r10 == 0) goto L_0x0125
        L_0x0051:
            if (r10 == 0) goto L_0x005e
            r0.f10010w = r9
            float r5 = r24.getX()
            int r5 = (int) r5
            float r5 = (float) r5
            r0.f10003p = r5
            goto L_0x006a
        L_0x005e:
            if (r5 == 0) goto L_0x006a
            r0.f10010w = r1
            float r5 = r24.getY()
            int r5 = (int) r5
            float r5 = (float) r5
            r0.f10000m = r5
        L_0x006a:
            r0.f(r1)
            goto L_0x0125
        L_0x006f:
            int r5 = r24.getAction()
            if (r5 != r9) goto L_0x0084
            int r5 = r0.f10009v
            if (r5 != r1) goto L_0x0084
            r0.f10000m = r4
            r0.f10003p = r4
            r0.f(r9)
            r0.f10010w = r8
            goto L_0x0125
        L_0x0084:
            int r5 = r24.getAction()
            if (r5 != r1) goto L_0x0125
            int r5 = r0.f10009v
            if (r5 != r1) goto L_0x0125
            r0.g()
            int r5 = r0.f10010w
            r10 = 1073741824(0x40000000, float:2.0)
            int r11 = r0.f9992b
            if (r5 != r9) goto L_0x00dd
            float r5 = r24.getX()
            int[] r14 = r0.f10012y
            r14[r8] = r11
            int r12 = r0.f10004q
            int r12 = r12 - r11
            r14[r9] = r12
            float r13 = (float) r11
            float r12 = (float) r12
            float r5 = java.lang.Math.min(r12, r5)
            float r5 = java.lang.Math.max(r13, r5)
            int r12 = r0.f10002o
            float r12 = (float) r12
            float r12 = r12 - r5
            float r12 = java.lang.Math.abs(r12)
            int r12 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x00bd
            goto L_0x00dd
        L_0x00bd:
            float r12 = r0.f10003p
            androidx.recyclerview.widget.RecyclerView r13 = r0.f10006s
            int r15 = r13.computeHorizontalScrollRange()
            androidx.recyclerview.widget.RecyclerView r13 = r0.f10006s
            int r16 = r13.computeHorizontalScrollOffset()
            int r13 = r0.f10004q
            r17 = r13
            r13 = r5
            int r12 = m0.C0819k.e(r12, r13, r14, r15, r16, r17)
            if (r12 == 0) goto L_0x00db
            androidx.recyclerview.widget.RecyclerView r13 = r0.f10006s
            r13.scrollBy(r12, r8)
        L_0x00db:
            r0.f10003p = r5
        L_0x00dd:
            int r5 = r0.f10010w
            if (r5 != r1) goto L_0x0125
            float r5 = r24.getY()
            int[] r14 = r0.f10011x
            r14[r8] = r11
            int r12 = r0.f10005r
            int r12 = r12 - r11
            r14[r9] = r12
            float r11 = (float) r11
            float r12 = (float) r12
            float r5 = java.lang.Math.min(r12, r5)
            float r5 = java.lang.Math.max(r11, r5)
            int r11 = r0.f9999l
            float r11 = (float) r11
            float r11 = r11 - r5
            float r11 = java.lang.Math.abs(r11)
            int r10 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r10 >= 0) goto L_0x0105
            goto L_0x0125
        L_0x0105:
            float r12 = r0.f10000m
            androidx.recyclerview.widget.RecyclerView r10 = r0.f10006s
            int r15 = r10.computeVerticalScrollRange()
            androidx.recyclerview.widget.RecyclerView r10 = r0.f10006s
            int r16 = r10.computeVerticalScrollOffset()
            int r10 = r0.f10005r
            r13 = r5
            r17 = r10
            int r10 = m0.C0819k.e(r12, r13, r14, r15, r16, r17)
            if (r10 == 0) goto L_0x0123
            androidx.recyclerview.widget.RecyclerView r11 = r0.f10006s
            r11.scrollBy(r8, r10)
        L_0x0123:
            r0.f10000m = r5
        L_0x0125:
            int r0 = r24.getAction()
            if (r0 == r3) goto L_0x012d
            if (r0 != r9) goto L_0x012f
        L_0x012d:
            r6.f5384x = r2
        L_0x012f:
            r0 = r9
        L_0x0130:
            if (r0 == 0) goto L_0x0139
            r23.V()
            r6.setScrollState(r8)
            return r9
        L_0x0139:
            m0.F r0 = r6.f5378u
            if (r0 != 0) goto L_0x013e
            return r8
        L_0x013e:
            boolean r10 = r0.d()
            m0.F r0 = r6.f5378u
            boolean r11 = r0.e()
            android.view.VelocityTracker r0 = r6.f5345T
            if (r0 != 0) goto L_0x0152
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.f5345T = r0
        L_0x0152:
            int r0 = r24.getActionMasked()
            int r5 = r24.getActionIndex()
            int[] r12 = r6.f5383w0
            if (r0 != 0) goto L_0x0162
            r12[r9] = r8
            r12[r8] = r8
        L_0x0162:
            android.view.MotionEvent r13 = android.view.MotionEvent.obtain(r24)
            r14 = r12[r8]
            float r14 = (float) r14
            r15 = r12[r9]
            float r15 = (float) r15
            r13.offsetLocation(r14, r15)
            r14 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x0483
            java.lang.String r15 = "RecyclerView"
            if (r0 == r9) goto L_0x0291
            if (r0 == r1) goto L_0x01ac
            if (r0 == r3) goto L_0x01a5
            r1 = 5
            if (r0 == r1) goto L_0x018a
            r1 = 6
            if (r0 == r1) goto L_0x0186
        L_0x0181:
            r0 = r6
            r21 = r13
            goto L_0x04ad
        L_0x0186:
            r23.R(r24)
            goto L_0x0181
        L_0x018a:
            int r0 = r7.getPointerId(r5)
            r6.f5344S = r0
            float r0 = r7.getX(r5)
            float r0 = r0 + r14
            int r0 = (int) r0
            r6.f5348W = r0
            r6.f5346U = r0
            float r0 = r7.getY(r5)
            float r0 = r0 + r14
            int r0 = (int) r0
            r6.f5350a0 = r0
            r6.f5347V = r0
            goto L_0x0181
        L_0x01a5:
            r23.V()
            r6.setScrollState(r8)
            goto L_0x0181
        L_0x01ac:
            int r0 = r6.f5344S
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x01cd
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Error processing scroll; pointer index for id "
            r0.<init>(r1)
            int r1 = r6.f5344S
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r15, r0)
            return r8
        L_0x01cd:
            float r1 = r7.getX(r0)
            float r1 = r1 + r14
            int r15 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r14
            int r14 = (int) r0
            int r0 = r6.f5348W
            int r0 = r0 - r15
            int r1 = r6.f5350a0
            int r1 = r1 - r14
            int r2 = r6.f5343R
            if (r2 == r9) goto L_0x0216
            if (r10 == 0) goto L_0x01fa
            if (r0 <= 0) goto L_0x01ef
            int r2 = r6.f5352b0
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x01f6
        L_0x01ef:
            int r2 = r6.f5352b0
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x01f6:
            if (r0 == 0) goto L_0x01fa
            r2 = r9
            goto L_0x01fb
        L_0x01fa:
            r2 = r8
        L_0x01fb:
            if (r11 == 0) goto L_0x0211
            if (r1 <= 0) goto L_0x0207
            int r3 = r6.f5352b0
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x020e
        L_0x0207:
            int r3 = r6.f5352b0
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x020e:
            if (r1 == 0) goto L_0x0211
            r2 = r9
        L_0x0211:
            if (r2 == 0) goto L_0x0216
            r6.setScrollState(r9)
        L_0x0216:
            r16 = r0
            r17 = r1
            int r0 = r6.f5343R
            if (r0 != r9) goto L_0x0181
            int[] r5 = r6.f5385x0
            r5[r8] = r8
            r5[r9] = r8
            if (r10 == 0) goto L_0x0229
            r1 = r16
            goto L_0x022a
        L_0x0229:
            r1 = r8
        L_0x022a:
            if (r11 == 0) goto L_0x022f
            r2 = r17
            goto L_0x0230
        L_0x022f:
            r2 = r8
        L_0x0230:
            int[] r4 = r6.f5381v0
            r3 = 0
            r0 = r23
            r18 = r4
            r4 = r5
            r19 = r5
            r5 = r18
            boolean r0 = r0.r(r1, r2, r3, r4, r5)
            int[] r1 = r6.f5381v0
            if (r0 == 0) goto L_0x0261
            r0 = r19[r8]
            int r16 = r16 - r0
            r0 = r19[r9]
            int r17 = r17 - r0
            r0 = r12[r8]
            r2 = r1[r8]
            int r0 = r0 + r2
            r12[r8] = r0
            r0 = r12[r9]
            r2 = r1[r9]
            int r0 = r0 + r2
            r12[r9] = r0
            android.view.ViewParent r0 = r23.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x0261:
            r0 = r16
            r2 = r17
            r3 = r1[r8]
            int r15 = r15 - r3
            r6.f5348W = r15
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.f5350a0 = r14
            if (r10 == 0) goto L_0x0273
            r1 = r0
            goto L_0x0274
        L_0x0273:
            r1 = r8
        L_0x0274:
            if (r11 == 0) goto L_0x0277
            r8 = r2
        L_0x0277:
            boolean r1 = r6.W(r1, r8, r7)
            if (r1 == 0) goto L_0x0284
            android.view.ViewParent r1 = r23.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x0284:
            m0.m r1 = r6.f5363j0
            if (r1 == 0) goto L_0x0181
            if (r0 != 0) goto L_0x028c
            if (r2 == 0) goto L_0x0181
        L_0x028c:
            r1.a(r6, r0, r2)
            goto L_0x0181
        L_0x0291:
            android.view.VelocityTracker r0 = r6.f5345T
            r0.addMovement(r13)
            android.view.VelocityTracker r0 = r6.f5345T
            int r3 = r6.f5357e0
            float r5 = (float) r3
            r7 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r7, r5)
            if (r10 == 0) goto L_0x02ac
            android.view.VelocityTracker r0 = r6.f5345T
            int r5 = r6.f5344S
            float r0 = r0.getXVelocity(r5)
            float r0 = -r0
            goto L_0x02ad
        L_0x02ac:
            r0 = r4
        L_0x02ad:
            if (r11 == 0) goto L_0x02b9
            android.view.VelocityTracker r5 = r6.f5345T
            int r7 = r6.f5344S
            float r5 = r5.getYVelocity(r7)
            float r5 = -r5
            goto L_0x02ba
        L_0x02b9:
            r5 = r4
        L_0x02ba:
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x02c9
            int r7 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x02c3
            goto L_0x02c9
        L_0x02c3:
            r0 = r6
            r1 = r8
            r21 = r13
            goto L_0x047a
        L_0x02c9:
            int r0 = (int) r0
            int r5 = (int) r5
            m0.F r7 = r6.f5378u
            if (r7 != 0) goto L_0x02d9
            java.lang.String r0 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r15, r0)
        L_0x02d4:
            r0 = r6
            r21 = r13
            goto L_0x0479
        L_0x02d9:
            boolean r10 = r6.f5330D
            if (r10 == 0) goto L_0x02de
        L_0x02dd:
            goto L_0x02d4
        L_0x02de:
            boolean r7 = r7.d()
            m0.F r10 = r6.f5378u
            boolean r10 = r10.e()
            int r11 = r6.f5355d0
            if (r7 == 0) goto L_0x02f2
            int r12 = java.lang.Math.abs(r0)
            if (r12 >= r11) goto L_0x02f3
        L_0x02f2:
            r0 = r8
        L_0x02f3:
            if (r10 == 0) goto L_0x02fb
            int r12 = java.lang.Math.abs(r5)
            if (r12 >= r11) goto L_0x02fc
        L_0x02fb:
            r5 = r8
        L_0x02fc:
            if (r0 != 0) goto L_0x0301
            if (r5 != 0) goto L_0x0301
            goto L_0x02dd
        L_0x0301:
            float r11 = (float) r0
            float r12 = (float) r5
            boolean r14 = r6.dispatchNestedPreFling(r11, r12)
            if (r14 != 0) goto L_0x02d4
            if (r7 != 0) goto L_0x0310
            if (r10 == 0) goto L_0x030e
            goto L_0x0310
        L_0x030e:
            r14 = r8
            goto L_0x0311
        L_0x0310:
            r14 = r9
        L_0x0311:
            r6.dispatchNestedFling(r11, r12, r14)
            m0.H r11 = r6.f5354c0
            if (r11 == 0) goto L_0x041f
            m0.v r11 = (m0.C0829v) r11
            androidx.recyclerview.widget.RecyclerView r12 = r11.f10063a
            m0.F r12 = r12.getLayoutManager()
            if (r12 != 0) goto L_0x0324
            goto L_0x041f
        L_0x0324:
            androidx.recyclerview.widget.RecyclerView r15 = r11.f10063a
            m0.y r15 = r15.getAdapter()
            if (r15 != 0) goto L_0x032e
            goto L_0x041f
        L_0x032e:
            androidx.recyclerview.widget.RecyclerView r15 = r11.f10063a
            int r15 = r15.getMinFlingVelocity()
            int r2 = java.lang.Math.abs(r5)
            if (r2 > r15) goto L_0x0340
            int r2 = java.lang.Math.abs(r0)
            if (r2 <= r15) goto L_0x041f
        L_0x0340:
            boolean r2 = r12 instanceof m0.O
            if (r2 != 0) goto L_0x0346
            goto L_0x041f
        L_0x0346:
            if (r2 != 0) goto L_0x034a
            r15 = 0
            goto L_0x0356
        L_0x034a:
            f2.b r15 = new f2.b
            androidx.recyclerview.widget.RecyclerView r8 = r11.f10063a
            android.content.Context r8 = r8.getContext()
            r1 = 1
            r15.<init>(r11, r8, r1)
        L_0x0356:
            if (r15 != 0) goto L_0x035a
            goto L_0x041f
        L_0x035a:
            int r1 = r12.B()
            if (r1 != 0) goto L_0x0366
        L_0x0360:
            r21 = r13
        L_0x0362:
            r1 = -1
        L_0x0363:
            r2 = -1
            goto L_0x0414
        L_0x0366:
            boolean r19 = r12.e()
            if (r19 == 0) goto L_0x0371
            androidx.emoji2.text.g r11 = r11.e(r12)
            goto L_0x037d
        L_0x0371:
            boolean r19 = r12.d()
            if (r19 == 0) goto L_0x037c
            androidx.emoji2.text.g r11 = r11.d(r12)
            goto L_0x037d
        L_0x037c:
            r11 = 0
        L_0x037d:
            if (r11 != 0) goto L_0x0380
            goto L_0x0360
        L_0x0380:
            int r8 = r12.v()
            r19 = -2147483648(0xffffffff80000000, float:-0.0)
            r20 = 2147483647(0x7fffffff, float:NaN)
            r21 = r13
            r9 = r19
            r13 = r20
            r4 = 0
            r16 = 0
            r19 = 0
        L_0x0394:
            if (r4 >= r8) goto L_0x03b8
            r22 = r8
            android.view.View r8 = r12.u(r4)
            if (r8 != 0) goto L_0x039f
            goto L_0x03b1
        L_0x039f:
            int r6 = m0.C0829v.b(r8, r11)
            if (r6 > 0) goto L_0x03aa
            if (r6 <= r9) goto L_0x03aa
            r9 = r6
            r19 = r8
        L_0x03aa:
            if (r6 < 0) goto L_0x03b1
            if (r6 >= r13) goto L_0x03b1
            r13 = r6
            r16 = r8
        L_0x03b1:
            int r4 = r4 + 1
            r6 = r23
            r8 = r22
            goto L_0x0394
        L_0x03b8:
            boolean r4 = r12.d()
            if (r4 == 0) goto L_0x03c4
            if (r0 <= 0) goto L_0x03c2
        L_0x03c0:
            r4 = 1
            goto L_0x03c7
        L_0x03c2:
            r4 = 0
            goto L_0x03c7
        L_0x03c4:
            if (r5 <= 0) goto L_0x03c2
            goto L_0x03c0
        L_0x03c7:
            if (r4 == 0) goto L_0x03d0
            if (r16 == 0) goto L_0x03d0
            int r1 = m0.C0804F.H(r16)
            goto L_0x0363
        L_0x03d0:
            if (r4 != 0) goto L_0x03d9
            if (r19 == 0) goto L_0x03d9
            int r1 = m0.C0804F.H(r19)
            goto L_0x0363
        L_0x03d9:
            if (r4 == 0) goto L_0x03dd
            r16 = r19
        L_0x03dd:
            if (r16 != 0) goto L_0x03e0
            goto L_0x0362
        L_0x03e0:
            int r6 = m0.C0804F.H(r16)
            int r8 = r12.B()
            if (r2 == 0) goto L_0x0404
            r2 = r12
            m0.O r2 = (m0.O) r2
            r9 = 1
            int r8 = r8 - r9
            android.graphics.PointF r2 = r2.a(r8)
            if (r2 == 0) goto L_0x0404
            float r8 = r2.x
            r9 = 0
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 < 0) goto L_0x0402
            float r2 = r2.y
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x0404
        L_0x0402:
            r2 = 1
            goto L_0x0405
        L_0x0404:
            r2 = 0
        L_0x0405:
            if (r2 != r4) goto L_0x0409
            r2 = -1
            goto L_0x040a
        L_0x0409:
            r2 = 1
        L_0x040a:
            int r2 = r2 + r6
            if (r2 < 0) goto L_0x0362
            if (r2 < r1) goto L_0x0411
            goto L_0x0362
        L_0x0411:
            r1 = r2
            goto L_0x0363
        L_0x0414:
            if (r1 != r2) goto L_0x0417
            goto L_0x0421
        L_0x0417:
            r15.f10050a = r1
            r12.y0(r15)
            r0 = r23
            goto L_0x047d
        L_0x041f:
            r21 = r13
        L_0x0421:
            if (r14 == 0) goto L_0x0477
            if (r10 == 0) goto L_0x0427
            r7 = r7 | 2
        L_0x0427:
            K.l r1 = r23.getScrollingChildHelper()
            r2 = 1
            r1.g(r7, r2)
            int r1 = -r3
            int r0 = java.lang.Math.min(r0, r3)
            int r9 = java.lang.Math.max(r1, r0)
            int r0 = java.lang.Math.min(r5, r3)
            int r10 = java.lang.Math.max(r1, r0)
            r0 = r23
            m0.S r1 = r0.f5362i0
            androidx.recyclerview.widget.RecyclerView r2 = r1.f9891p
            r3 = 2
            r2.setScrollState(r3)
            r3 = 0
            r1.f9887b = r3
            r1.f9886a = r3
            android.view.animation.Interpolator r3 = r1.d
            U.d r4 = f5325D0
            if (r3 == r4) goto L_0x0462
            r1.d = r4
            android.widget.OverScroller r3 = new android.widget.OverScroller
            android.content.Context r2 = r2.getContext()
            r3.<init>(r2, r4)
            r1.f9888c = r3
        L_0x0462:
            android.widget.OverScroller r6 = r1.f9888c
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 2147483647(0x7fffffff, float:NaN)
            r7 = 0
            r8 = 0
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r14 = 2147483647(0x7fffffff, float:NaN)
            r6.fling(r7, r8, r9, r10, r11, r12, r13, r14)
            r1.a()
            goto L_0x047d
        L_0x0477:
            r0 = r23
        L_0x0479:
            r1 = 0
        L_0x047a:
            r0.setScrollState(r1)
        L_0x047d:
            r23.V()
            r2 = r21
            goto L_0x04b4
        L_0x0483:
            r0 = r6
            r1 = r8
            r21 = r13
            int r2 = r7.getPointerId(r1)
            r0.f5344S = r2
            float r1 = r24.getX()
            float r1 = r1 + r14
            int r1 = (int) r1
            r0.f5348W = r1
            r0.f5346U = r1
            float r1 = r24.getY()
            float r1 = r1 + r14
            int r1 = (int) r1
            r0.f5350a0 = r1
            r0.f5347V = r1
            if (r11 == 0) goto L_0x04a5
            r10 = r10 | 2
        L_0x04a5:
            K.l r1 = r23.getScrollingChildHelper()
            r2 = 0
            r1.g(r10, r2)
        L_0x04ad:
            android.view.VelocityTracker r1 = r0.f5345T
            r2 = r21
            r1.addMovement(r2)
        L_0x04b4:
            r2.recycle()
            r1 = 1
            return r1
        L_0x04b9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [java.lang.Object, K.o] */
    /* JADX WARNING: type inference failed for: r8v7, types: [java.lang.Object, K.o] */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x03d7  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x0226 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0186  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p() {
        /*
            r22 = this;
            r0 = r22
            m0.P r1 = r0.f5365l0
            r2 = 1
            r1.a(r2)
            r0.z(r1)
            r3 = 0
            r1.f9880i = r3
            r22.a0()
            m0.a0 r4 = r0.f5358f
            java.lang.Object r5 = r4.f9925b
            n.j r5 = (n.j) r5
            r5.clear()
            java.lang.Object r5 = r4.f9926c
            n.g r5 = (n.g) r5
            r5.a()
            r22.P()
            boolean r6 = r0.f5333H
            if (r6 == 0) goto L_0x0041
            F3.k r6 = r0.d
            java.lang.Object r7 = r6.f770c
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r6.o(r7)
            java.lang.Object r7 = r6.d
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r6.o(r7)
            boolean r6 = r0.f5334I
            if (r6 == 0) goto L_0x0041
            m0.F r6 = r0.f5378u
            r6.X()
        L_0x0041:
            m0.C r6 = r0.f5342Q
            if (r6 == 0) goto L_0x0320
            m0.F r6 = r0.f5378u
            boolean r6 = r6.z0()
            if (r6 == 0) goto L_0x0320
            F3.k r6 = r0.d
            java.lang.Object r7 = r6.f770c
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.lang.Object r8 = r6.f772f
            j4.p0 r8 = (j4.p0) r8
            r8.getClass()
        L_0x005a:
            int r9 = r7.size()
            r10 = 1
            int r9 = r9 - r10
            r12 = 0
        L_0x0061:
            r13 = -1
            r14 = 8
            if (r9 < 0) goto L_0x0077
            java.lang.Object r15 = r7.get(r9)
            m0.a r15 = (m0.C0809a) r15
            int r15 = r15.f9921a
            if (r15 != r14) goto L_0x0073
            if (r12 == 0) goto L_0x0074
            goto L_0x0078
        L_0x0073:
            r12 = r10
        L_0x0074:
            int r9 = r9 + -1
            goto L_0x0061
        L_0x0077:
            r9 = r13
        L_0x0078:
            r12 = 4
            r15 = 2
            if (r9 == r13) goto L_0x022a
            int r14 = r9 + 1
            java.lang.Object r16 = r7.get(r9)
            r11 = r16
            m0.a r11 = (m0.C0809a) r11
            java.lang.Object r16 = r7.get(r14)
            r13 = r16
            m0.a r13 = (m0.C0809a) r13
            int r2 = r13.f9921a
            if (r2 == r10) goto L_0x01fb
            r18 = 0
            java.lang.Object r3 = r8.f9075b
            F3.k r3 = (F3.k) r3
            if (r2 == r15) goto L_0x00ff
            if (r2 == r12) goto L_0x009e
            goto L_0x0226
        L_0x009e:
            int r2 = r11.f9923c
            int r15 = r13.f9922b
            if (r2 >= r15) goto L_0x00a9
            int r15 = r15 + -1
            r13.f9922b = r15
            goto L_0x00ba
        L_0x00a9:
            int r10 = r13.f9923c
            int r15 = r15 + r10
            if (r2 >= r15) goto L_0x00ba
            int r10 = r10 + -1
            r13.f9923c = r10
            int r2 = r11.f9922b
            r10 = 1
            m0.a r2 = r3.m(r12, r2, r10)
            goto L_0x00bc
        L_0x00ba:
            r2 = r18
        L_0x00bc:
            int r10 = r11.f9922b
            int r15 = r13.f9922b
            if (r10 > r15) goto L_0x00c7
            int r15 = r15 + 1
            r13.f9922b = r15
            goto L_0x00d9
        L_0x00c7:
            int r12 = r13.f9923c
            int r15 = r15 + r12
            if (r10 >= r15) goto L_0x00d9
            int r15 = r15 - r10
            int r10 = r10 + 1
            r12 = 4
            m0.a r18 = r3.m(r12, r10, r15)
            int r10 = r13.f9923c
            int r10 = r10 - r15
            r13.f9923c = r10
        L_0x00d9:
            r10 = r18
            r7.set(r14, r11)
            int r11 = r13.f9923c
            if (r11 <= 0) goto L_0x00e6
            r7.set(r9, r13)
            goto L_0x00f3
        L_0x00e6:
            r7.remove(r9)
            r3.getClass()
            java.lang.Object r3 = r3.f769b
            J.b r3 = (J.b) r3
            r3.c(r13)
        L_0x00f3:
            if (r2 == 0) goto L_0x00f8
            r7.add(r9, r2)
        L_0x00f8:
            if (r10 == 0) goto L_0x0226
            r7.add(r9, r10)
            goto L_0x0226
        L_0x00ff:
            int r2 = r11.f9922b
            int r10 = r11.f9923c
            if (r2 >= r10) goto L_0x0117
            int r12 = r13.f9922b
            if (r12 != r2) goto L_0x0113
            int r12 = r13.f9923c
            int r2 = r10 - r2
            if (r12 != r2) goto L_0x0113
            r2 = 0
        L_0x0110:
            r17 = 1
            goto L_0x0126
        L_0x0113:
            r2 = 0
        L_0x0114:
            r17 = 0
            goto L_0x0126
        L_0x0117:
            int r12 = r13.f9922b
            int r15 = r10 + 1
            if (r12 != r15) goto L_0x0124
            int r12 = r13.f9923c
            int r2 = r2 - r10
            if (r12 != r2) goto L_0x0124
            r2 = 1
            goto L_0x0110
        L_0x0124:
            r2 = 1
            goto L_0x0114
        L_0x0126:
            int r12 = r13.f9922b
            if (r10 >= r12) goto L_0x012f
            int r12 = r12 + -1
            r13.f9922b = r12
            goto L_0x0151
        L_0x012f:
            int r15 = r13.f9923c
            int r12 = r12 + r15
            if (r10 >= r12) goto L_0x0151
            int r15 = r15 + -1
            r13.f9923c = r15
            r2 = 2
            r11.f9921a = r2
            r2 = 1
            r11.f9923c = r2
            int r2 = r13.f9923c
            if (r2 != 0) goto L_0x0226
            r7.remove(r14)
            r3.getClass()
            java.lang.Object r2 = r3.f769b
            J.b r2 = (J.b) r2
            r2.c(r13)
            goto L_0x0226
        L_0x0151:
            int r10 = r11.f9922b
            int r12 = r13.f9922b
            if (r10 > r12) goto L_0x015c
            int r12 = r12 + 1
            r13.f9922b = r12
            goto L_0x0170
        L_0x015c:
            int r15 = r13.f9923c
            int r12 = r12 + r15
            if (r10 >= r12) goto L_0x0170
            int r12 = r12 - r10
            int r10 = r10 + 1
            r15 = 2
            m0.a r18 = r3.m(r15, r10, r12)
            int r10 = r11.f9922b
            int r12 = r13.f9922b
            int r10 = r10 - r12
            r13.f9923c = r10
        L_0x0170:
            r10 = r18
            if (r17 == 0) goto L_0x0186
            r7.set(r9, r13)
            r7.remove(r14)
            r3.getClass()
            java.lang.Object r2 = r3.f769b
            J.b r2 = (J.b) r2
            r2.c(r11)
            goto L_0x0226
        L_0x0186:
            if (r2 == 0) goto L_0x01b7
            if (r10 == 0) goto L_0x01a0
            int r2 = r11.f9922b
            int r3 = r10.f9922b
            if (r2 <= r3) goto L_0x0195
            int r3 = r10.f9923c
            int r2 = r2 - r3
            r11.f9922b = r2
        L_0x0195:
            int r2 = r11.f9923c
            int r3 = r10.f9922b
            if (r2 <= r3) goto L_0x01a0
            int r3 = r10.f9923c
            int r2 = r2 - r3
            r11.f9923c = r2
        L_0x01a0:
            int r2 = r11.f9922b
            int r3 = r13.f9922b
            if (r2 <= r3) goto L_0x01ab
            int r3 = r13.f9923c
            int r2 = r2 - r3
            r11.f9922b = r2
        L_0x01ab:
            int r2 = r11.f9923c
            int r3 = r13.f9922b
            if (r2 <= r3) goto L_0x01e5
            int r3 = r13.f9923c
            int r2 = r2 - r3
            r11.f9923c = r2
            goto L_0x01e5
        L_0x01b7:
            if (r10 == 0) goto L_0x01cf
            int r2 = r11.f9922b
            int r3 = r10.f9922b
            if (r2 < r3) goto L_0x01c4
            int r3 = r10.f9923c
            int r2 = r2 - r3
            r11.f9922b = r2
        L_0x01c4:
            int r2 = r11.f9923c
            int r3 = r10.f9922b
            if (r2 < r3) goto L_0x01cf
            int r3 = r10.f9923c
            int r2 = r2 - r3
            r11.f9923c = r2
        L_0x01cf:
            int r2 = r11.f9922b
            int r3 = r13.f9922b
            if (r2 < r3) goto L_0x01da
            int r3 = r13.f9923c
            int r2 = r2 - r3
            r11.f9922b = r2
        L_0x01da:
            int r2 = r11.f9923c
            int r3 = r13.f9922b
            if (r2 < r3) goto L_0x01e5
            int r3 = r13.f9923c
            int r2 = r2 - r3
            r11.f9923c = r2
        L_0x01e5:
            r7.set(r9, r13)
            int r2 = r11.f9922b
            int r3 = r11.f9923c
            if (r2 == r3) goto L_0x01f2
            r7.set(r14, r11)
            goto L_0x01f5
        L_0x01f2:
            r7.remove(r14)
        L_0x01f5:
            if (r10 == 0) goto L_0x0226
            r7.add(r9, r10)
            goto L_0x0226
        L_0x01fb:
            int r2 = r11.f9923c
            int r3 = r13.f9922b
            if (r2 >= r3) goto L_0x0204
            r17 = -1
            goto L_0x0206
        L_0x0204:
            r17 = 0
        L_0x0206:
            int r10 = r11.f9922b
            if (r10 >= r3) goto L_0x020c
            int r17 = r17 + 1
        L_0x020c:
            if (r3 > r10) goto L_0x0213
            int r3 = r13.f9923c
            int r10 = r10 + r3
            r11.f9922b = r10
        L_0x0213:
            int r3 = r13.f9922b
            if (r3 > r2) goto L_0x021c
            int r10 = r13.f9923c
            int r2 = r2 + r10
            r11.f9923c = r2
        L_0x021c:
            int r3 = r3 + r17
            r13.f9922b = r3
            r7.set(r9, r13)
            r7.set(r14, r11)
        L_0x0226:
            r2 = 1
            r3 = 0
            goto L_0x005a
        L_0x022a:
            int r2 = r7.size()
            r3 = 0
        L_0x022f:
            if (r3 >= r2) goto L_0x031c
            java.lang.Object r8 = r7.get(r3)
            m0.a r8 = (m0.C0809a) r8
            int r9 = r8.f9921a
            r10 = 1
            if (r9 == r10) goto L_0x0310
            java.lang.Object r10 = r6.f771e
            m0.w r10 = (m0.C0830w) r10
            r11 = 2
            if (r9 == r11) goto L_0x02aa
            r11 = 4
            if (r9 == r11) goto L_0x0251
            if (r9 == r14) goto L_0x024d
        L_0x0248:
            r9 = 2
            r19 = 1
            goto L_0x0316
        L_0x024d:
            r6.n(r8)
            goto L_0x0248
        L_0x0251:
            int r9 = r8.f9922b
            int r11 = r8.f9923c
            int r11 = r11 + r9
            r12 = r9
            r13 = 0
            r15 = -1
        L_0x0259:
            if (r9 >= r11) goto L_0x028e
            m0.T r21 = r10.b(r9)
            if (r21 != 0) goto L_0x0267
            boolean r21 = r6.a(r9)
            if (r21 == 0) goto L_0x0269
        L_0x0267:
            r14 = 4
            goto L_0x027b
        L_0x0269:
            r14 = 1
            if (r15 != r14) goto L_0x0277
            r14 = 4
            m0.a r12 = r6.m(r14, r12, r13)
            r6.n(r12)
            r12 = r9
            r13 = 0
            goto L_0x0278
        L_0x0277:
            r14 = 4
        L_0x0278:
            r14 = 1
            r15 = 0
            goto L_0x0288
        L_0x027b:
            if (r15 != 0) goto L_0x0286
            m0.a r12 = r6.m(r14, r12, r13)
            r6.d(r12)
            r12 = r9
            r13 = 0
        L_0x0286:
            r14 = 1
            r15 = 1
        L_0x0288:
            int r13 = r13 + r14
            int r9 = r9 + 1
            r14 = 8
            goto L_0x0259
        L_0x028e:
            int r9 = r8.f9923c
            if (r13 == r9) goto L_0x029f
            java.lang.Object r9 = r6.f769b
            J.b r9 = (J.b) r9
            r9.c(r8)
            r9 = 4
            m0.a r8 = r6.m(r9, r12, r13)
            goto L_0x02a0
        L_0x029f:
            r9 = 4
        L_0x02a0:
            if (r15 != 0) goto L_0x02a6
            r6.d(r8)
            goto L_0x0248
        L_0x02a6:
            r6.n(r8)
            goto L_0x0248
        L_0x02aa:
            r9 = 4
            int r11 = r8.f9922b
            int r12 = r8.f9923c
            int r12 = r12 + r11
            r13 = r11
            r14 = 0
            r15 = -1
        L_0x02b3:
            if (r13 >= r12) goto L_0x02f2
            m0.T r20 = r10.b(r13)
            if (r20 != 0) goto L_0x02c1
            boolean r20 = r6.a(r13)
            if (r20 == 0) goto L_0x02c3
        L_0x02c1:
            r9 = 2
            goto L_0x02d4
        L_0x02c3:
            r9 = 1
            if (r15 != r9) goto L_0x02d0
            r9 = 2
            m0.a r15 = r6.m(r9, r11, r14)
            r6.n(r15)
            r15 = 1
            goto L_0x02d2
        L_0x02d0:
            r9 = 2
            r15 = 0
        L_0x02d2:
            r9 = 0
            goto L_0x02e2
        L_0x02d4:
            if (r15 != 0) goto L_0x02df
            m0.a r15 = r6.m(r9, r11, r14)
            r6.d(r15)
            r9 = 1
            goto L_0x02e0
        L_0x02df:
            r9 = 0
        L_0x02e0:
            r15 = r9
            r9 = 1
        L_0x02e2:
            if (r15 == 0) goto L_0x02ea
            int r13 = r13 - r14
            int r12 = r12 - r14
            r14 = 1
        L_0x02e7:
            r19 = 1
            goto L_0x02ed
        L_0x02ea:
            int r14 = r14 + 1
            goto L_0x02e7
        L_0x02ed:
            int r13 = r13 + 1
            r15 = r9
            r9 = 4
            goto L_0x02b3
        L_0x02f2:
            r19 = 1
            int r9 = r8.f9923c
            if (r14 == r9) goto L_0x0305
            java.lang.Object r9 = r6.f769b
            J.b r9 = (J.b) r9
            r9.c(r8)
            r9 = 2
            m0.a r8 = r6.m(r9, r11, r14)
            goto L_0x0306
        L_0x0305:
            r9 = 2
        L_0x0306:
            if (r15 != 0) goto L_0x030c
            r6.d(r8)
            goto L_0x0316
        L_0x030c:
            r6.n(r8)
            goto L_0x0316
        L_0x0310:
            r19 = r10
            r9 = 2
            r6.n(r8)
        L_0x0316:
            int r3 = r3 + 1
            r14 = 8
            goto L_0x022f
        L_0x031c:
            r7.clear()
            goto L_0x0325
        L_0x0320:
            F3.k r2 = r0.d
            r2.b()
        L_0x0325:
            boolean r2 = r0.f5368o0
            r3 = 1
            r6 = 0
            if (r2 != 0) goto L_0x0332
            boolean r2 = r0.f5370p0
            if (r2 == 0) goto L_0x0330
            goto L_0x0332
        L_0x0330:
            r2 = r6
            goto L_0x0333
        L_0x0332:
            r2 = r3
        L_0x0333:
            boolean r7 = r0.f5326A
            if (r7 == 0) goto L_0x0351
            m0.C r7 = r0.f5342Q
            if (r7 == 0) goto L_0x0351
            boolean r7 = r0.f5333H
            if (r7 != 0) goto L_0x0347
            if (r2 != 0) goto L_0x0347
            m0.F r8 = r0.f5378u
            boolean r8 = r8.f9853f
            if (r8 == 0) goto L_0x0351
        L_0x0347:
            if (r7 == 0) goto L_0x034f
            m0.y r7 = r0.f5376t
            boolean r7 = r7.f10069b
            if (r7 == 0) goto L_0x0351
        L_0x034f:
            r7 = r3
            goto L_0x0352
        L_0x0351:
            r7 = r6
        L_0x0352:
            m0.P r8 = r0.f5365l0
            r8.f9881j = r7
            if (r7 == 0) goto L_0x036b
            if (r2 == 0) goto L_0x036b
            boolean r2 = r0.f5333H
            if (r2 != 0) goto L_0x036b
            m0.C r2 = r0.f5342Q
            if (r2 == 0) goto L_0x036b
            m0.F r2 = r0.f5378u
            boolean r2 = r2.z0()
            if (r2 == 0) goto L_0x036b
            goto L_0x036c
        L_0x036b:
            r3 = r6
        L_0x036c:
            r8.f9882k = r3
            boolean r2 = r0.f5361h0
            r3 = 0
            if (r2 == 0) goto L_0x0382
            boolean r2 = r22.hasFocus()
            if (r2 == 0) goto L_0x0382
            m0.y r2 = r0.f5376t
            if (r2 == 0) goto L_0x0382
            android.view.View r2 = r22.getFocusedChild()
            goto L_0x0383
        L_0x0382:
            r2 = r3
        L_0x0383:
            if (r2 != 0) goto L_0x0386
            goto L_0x0391
        L_0x0386:
            android.view.View r2 = r0.A(r2)
            if (r2 != 0) goto L_0x038d
            goto L_0x0391
        L_0x038d:
            m0.T r3 = r0.H(r2)
        L_0x0391:
            r6 = -1
            r2 = -1
            if (r3 != 0) goto L_0x039d
            r1.f9884m = r6
            r1.f9883l = r2
            r1.f9885n = r2
            goto L_0x03ea
        L_0x039d:
            m0.y r8 = r0.f5376t
            boolean r8 = r8.f10069b
            if (r8 == 0) goto L_0x03a5
            long r6 = r3.f9896e
        L_0x03a5:
            r1.f9884m = r6
            boolean r6 = r0.f5333H
            if (r6 == 0) goto L_0x03ad
        L_0x03ab:
            r6 = r2
            goto L_0x03bf
        L_0x03ad:
            boolean r6 = r3.i()
            if (r6 == 0) goto L_0x03b6
            int r6 = r3.d
            goto L_0x03bf
        L_0x03b6:
            androidx.recyclerview.widget.RecyclerView r6 = r3.f9907r
            if (r6 != 0) goto L_0x03bb
            goto L_0x03ab
        L_0x03bb:
            int r6 = r6.F(r3)
        L_0x03bf:
            r1.f9883l = r6
            android.view.View r3 = r3.f9893a
            int r6 = r3.getId()
        L_0x03c7:
            boolean r7 = r3.isFocused()
            if (r7 != 0) goto L_0x03e8
            boolean r7 = r3 instanceof android.view.ViewGroup
            if (r7 == 0) goto L_0x03e8
            boolean r7 = r3.hasFocus()
            if (r7 == 0) goto L_0x03e8
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r3 = r3.getFocusedChild()
            int r7 = r3.getId()
            if (r7 == r2) goto L_0x03c7
            int r6 = r3.getId()
            goto L_0x03c7
        L_0x03e8:
            r1.f9885n = r6
        L_0x03ea:
            boolean r3 = r1.f9881j
            if (r3 == 0) goto L_0x03f4
            boolean r3 = r0.f5370p0
            if (r3 == 0) goto L_0x03f4
            r3 = 1
            goto L_0x03f5
        L_0x03f4:
            r3 = 0
        L_0x03f5:
            r1.h = r3
            r3 = 0
            r0.f5370p0 = r3
            r0.f5368o0 = r3
            boolean r3 = r1.f9882k
            r1.g = r3
            m0.y r3 = r0.f5376t
            int r3 = r3.a()
            r1.f9878e = r3
            int[] r3 = r0.f5377t0
            r0.C(r3)
            boolean r3 = r1.f9881j
            java.lang.Object r4 = r4.f9925b
            n.j r4 = (n.j) r4
            if (r3 == 0) goto L_0x048b
            c1.i r3 = r0.f5356e
            int r3 = r3.k()
            r6 = 0
        L_0x041c:
            if (r6 >= r3) goto L_0x048b
            c1.i r7 = r0.f5356e
            android.view.View r7 = r7.j(r6)
            m0.T r7 = I(r7)
            boolean r8 = r7.p()
            if (r8 != 0) goto L_0x0488
            boolean r8 = r7.g()
            if (r8 == 0) goto L_0x043b
            m0.y r8 = r0.f5376t
            boolean r8 = r8.f10069b
            if (r8 != 0) goto L_0x043b
            goto L_0x0488
        L_0x043b:
            m0.C r8 = r0.f5342Q
            m0.C0801C.b(r7)
            r7.c()
            r8.getClass()
            K.o r8 = new K.o
            r8.<init>()
            r8.a(r7)
            java.lang.Object r9 = r4.get(r7)
            m0.f0 r9 = (m0.f0) r9
            if (r9 != 0) goto L_0x045d
            m0.f0 r9 = m0.f0.a()
            r4.put(r7, r9)
        L_0x045d:
            r9.f9967b = r8
            int r8 = r9.f9966a
            r8 = r8 | 4
            r9.f9966a = r8
            boolean r8 = r1.h
            if (r8 == 0) goto L_0x0488
            boolean r8 = r7.l()
            if (r8 == 0) goto L_0x0488
            boolean r8 = r7.i()
            if (r8 != 0) goto L_0x0488
            boolean r8 = r7.p()
            if (r8 != 0) goto L_0x0488
            boolean r8 = r7.g()
            if (r8 != 0) goto L_0x0488
            long r8 = r0.G(r7)
            r5.d(r7, r8)
        L_0x0488:
            int r6 = r6 + 1
            goto L_0x041c
        L_0x048b:
            boolean r3 = r1.f9882k
            r5 = 2
            if (r3 == 0) goto L_0x0528
            c1.i r3 = r0.f5356e
            int r3 = r3.v()
            r6 = 0
        L_0x0497:
            if (r6 >= r3) goto L_0x04b4
            c1.i r7 = r0.f5356e
            android.view.View r7 = r7.t(r6)
            m0.T r7 = I(r7)
            boolean r8 = r7.p()
            if (r8 != 0) goto L_0x04b1
            int r8 = r7.d
            if (r8 != r2) goto L_0x04b1
            int r8 = r7.f9895c
            r7.d = r8
        L_0x04b1:
            int r6 = r6 + 1
            goto L_0x0497
        L_0x04b4:
            boolean r2 = r1.f9879f
            r3 = 0
            r1.f9879f = r3
            m0.F r3 = r0.f5378u
            k5.g r6 = r0.f5351b
            r3.b0(r6, r1)
            r1.f9879f = r2
            r3 = 0
        L_0x04c3:
            c1.i r2 = r0.f5356e
            int r2 = r2.k()
            if (r3 >= r2) goto L_0x0523
            c1.i r2 = r0.f5356e
            android.view.View r2 = r2.j(r3)
            m0.T r2 = I(r2)
            boolean r6 = r2.p()
            if (r6 == 0) goto L_0x04dc
            goto L_0x0520
        L_0x04dc:
            java.lang.Object r6 = r4.get(r2)
            m0.f0 r6 = (m0.f0) r6
            if (r6 == 0) goto L_0x04eb
            int r6 = r6.f9966a
            r6 = r6 & 4
            if (r6 == 0) goto L_0x04eb
            goto L_0x0520
        L_0x04eb:
            m0.C0801C.b(r2)
            r6 = 8192(0x2000, float:1.14794E-41)
            boolean r6 = r2.d(r6)
            m0.C r7 = r0.f5342Q
            r2.c()
            r7.getClass()
            K.o r7 = new K.o
            r7.<init>()
            r7.a(r2)
            if (r6 == 0) goto L_0x050a
            r0.T(r2, r7)
            goto L_0x0520
        L_0x050a:
            java.lang.Object r6 = r4.get(r2)
            m0.f0 r6 = (m0.f0) r6
            if (r6 != 0) goto L_0x0519
            m0.f0 r6 = m0.f0.a()
            r4.put(r2, r6)
        L_0x0519:
            int r2 = r6.f9966a
            r2 = r2 | r5
            r6.f9966a = r2
            r6.f9967b = r7
        L_0x0520:
            int r3 = r3 + 1
            goto L_0x04c3
        L_0x0523:
            r22.k()
        L_0x0526:
            r2 = 1
            goto L_0x052c
        L_0x0528:
            r22.k()
            goto L_0x0526
        L_0x052c:
            r0.Q(r2)
            r2 = 0
            r0.b0(r2)
            r1.d = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p():void");
    }

    public final void q() {
        boolean z3;
        a0();
        P();
        P p6 = this.f5365l0;
        p6.a(6);
        this.d.b();
        p6.f9878e = this.f5376t.a();
        p6.f9877c = 0;
        p6.g = false;
        this.f5378u.b0(this.f5351b, p6);
        p6.f9879f = false;
        this.f5353c = null;
        if (!p6.f9881j || this.f5342Q == null) {
            z3 = false;
        } else {
            z3 = true;
        }
        p6.f9881j = z3;
        p6.d = 4;
        Q(true);
        b0(false);
    }

    public final boolean r(int i2, int i5, int i6, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i5, i6, iArr, iArr2);
    }

    public final void removeDetachedView(View view, boolean z3) {
        T I6 = I(view);
        if (I6 != null) {
            if (I6.k()) {
                I6.f9899j &= -257;
            } else if (!I6.p()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + I6 + y());
            }
        }
        view.clearAnimation();
        I(view);
        super.removeDetachedView(view, z3);
    }

    public final void requestChildFocus(View view, View view2) {
        C0827t tVar = this.f5378u.f9852e;
        if ((tVar == null || !tVar.f10053e) && !L() && view2 != null) {
            U(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        return this.f5378u.k0(this, view, rect, z3, false);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        ArrayList arrayList = this.f5382w;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0819k) arrayList.get(i2)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    public final void requestLayout() {
        if (this.f5328B != 0 || this.f5330D) {
            this.f5329C = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(int i2, int i5, int i6, int i7, int[] iArr, int i8, int[] iArr2) {
        getScrollingChildHelper().d(i2, i5, i6, i7, iArr, i8, iArr2);
    }

    public final void scrollBy(int i2, int i5) {
        C0804F f6 = this.f5378u;
        if (f6 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f5330D) {
            boolean d6 = f6.d();
            boolean e6 = this.f5378u.e();
            if (d6 || e6) {
                if (!d6) {
                    i2 = 0;
                }
                if (!e6) {
                    i5 = 0;
                }
                W(i2, i5, (MotionEvent) null);
            }
        }
    }

    public final void scrollTo(int i2, int i5) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i2;
        if (L()) {
            int i5 = 0;
            if (accessibilityEvent != null) {
                i2 = accessibilityEvent.getContentChangeTypes();
            } else {
                i2 = 0;
            }
            if (i2 != 0) {
                i5 = i2;
            }
            this.F |= i5;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(V v6) {
        this.s0 = v6;
        O.l(this, v6);
    }

    public void setAdapter(C0832y yVar) {
        setLayoutFrozen(false);
        C0832y yVar2 = this.f5376t;
        v vVar = this.f5349a;
        if (yVar2 != null) {
            yVar2.f10068a.unregisterObserver(vVar);
            this.f5376t.getClass();
        }
        C0801C c3 = this.f5342Q;
        if (c3 != null) {
            c3.e();
        }
        C0804F f6 = this.f5378u;
        C0770g gVar = this.f5351b;
        if (f6 != null) {
            f6.g0(gVar);
            this.f5378u.h0(gVar);
        }
        gVar.f9491a.clear();
        gVar.f();
        k kVar = this.d;
        kVar.o((ArrayList) kVar.f770c);
        kVar.o((ArrayList) kVar.d);
        C0832y yVar3 = this.f5376t;
        this.f5376t = yVar;
        if (yVar != null) {
            yVar.f10068a.registerObserver(vVar);
        }
        C0832y yVar4 = this.f5376t;
        gVar.f9491a.clear();
        gVar.f();
        K e6 = gVar.e();
        if (yVar3 != null) {
            e6.f9868b--;
        }
        if (e6.f9868b == 0) {
            int i2 = 0;
            while (true) {
                SparseArray sparseArray = e6.f9867a;
                if (i2 >= sparseArray.size()) {
                    break;
                }
                ((C0808J) sparseArray.valueAt(i2)).f9864a.clear();
                i2++;
            }
        }
        if (yVar4 != null) {
            e6.f9868b++;
        }
        this.f5365l0.f9879f = true;
        this.f5334I |= false;
        this.f5333H = true;
        int v6 = this.f5356e.v();
        for (int i5 = 0; i5 < v6; i5++) {
            T I6 = I(this.f5356e.t(i5));
            if (I6 != null && !I6.p()) {
                I6.a(6);
            }
        }
        N();
        C0770g gVar2 = this.f5351b;
        ArrayList arrayList = (ArrayList) gVar2.f9494e;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            T t6 = (T) arrayList.get(i6);
            if (t6 != null) {
                t6.a(6);
                t6.a(1024);
            }
        }
        C0832y yVar5 = ((RecyclerView) gVar2.h).f5376t;
        if (yVar5 == null || !yVar5.f10069b) {
            gVar2.f();
        }
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C0799A a6) {
        if (a6 != null) {
            setChildrenDrawingOrderEnabled(false);
        }
    }

    public void setClipToPadding(boolean z3) {
        if (z3 != this.f5369p) {
            this.f5341P = null;
            this.f5339N = null;
            this.f5340O = null;
            this.f5338M = null;
        }
        this.f5369p = z3;
        super.setClipToPadding(z3);
        if (this.f5326A) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0800B b6) {
        b6.getClass();
        this.f5337L = b6;
        this.f5341P = null;
        this.f5339N = null;
        this.f5340O = null;
        this.f5338M = null;
    }

    public void setHasFixedSize(boolean z3) {
        this.f5388z = z3;
    }

    public void setItemAnimator(C0801C c3) {
        C0801C c6 = this.f5342Q;
        if (c6 != null) {
            c6.e();
            this.f5342Q.f9841a = null;
        }
        this.f5342Q = c3;
        if (c3 != null) {
            c3.f9841a = this.f5372q0;
        }
    }

    public void setItemViewCacheSize(int i2) {
        C0770g gVar = this.f5351b;
        gVar.f9493c = i2;
        gVar.p();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z3) {
        suppressLayout(z3);
    }

    public void setLayoutManager(C0804F f6) {
        RecyclerView recyclerView;
        C0827t tVar;
        if (f6 != this.f5378u) {
            setScrollState(0);
            S s6 = this.f5362i0;
            s6.f9891p.removeCallbacks(s6);
            s6.f9888c.abortAnimation();
            C0804F f7 = this.f5378u;
            if (!(f7 == null || (tVar = f7.f9852e) == null)) {
                tVar.i();
            }
            C0804F f8 = this.f5378u;
            C0770g gVar = this.f5351b;
            if (f8 != null) {
                C0801C c3 = this.f5342Q;
                if (c3 != null) {
                    c3.e();
                }
                this.f5378u.g0(gVar);
                this.f5378u.h0(gVar);
                gVar.f9491a.clear();
                gVar.f();
                if (this.f5386y) {
                    C0804F f9 = this.f5378u;
                    f9.g = false;
                    f9.R(this);
                }
                this.f5378u.t0((RecyclerView) null);
                this.f5378u = null;
            } else {
                gVar.f9491a.clear();
                gVar.f();
            }
            i iVar = this.f5356e;
            ((u) iVar.f5606c).n();
            ArrayList arrayList = (ArrayList) iVar.d;
            int size = arrayList.size() - 1;
            while (true) {
                recyclerView = ((C0831x) iVar.f5605b).f10067a;
                if (size < 0) {
                    break;
                }
                T I6 = I((View) arrayList.get(size));
                if (I6 != null) {
                    int i2 = I6.f9905p;
                    if (recyclerView.L()) {
                        I6.f9906q = i2;
                        recyclerView.f5387y0.add(I6);
                    } else {
                        WeakHashMap weakHashMap = O.f1352a;
                        I6.f9893a.setImportantForAccessibility(i2);
                    }
                    I6.f9905p = 0;
                }
                arrayList.remove(size);
                size--;
            }
            int childCount = recyclerView.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = recyclerView.getChildAt(i5);
                I(childAt);
                childAt.clearAnimation();
            }
            recyclerView.removeAllViews();
            this.f5378u = f6;
            if (f6 != null) {
                if (f6.f9850b == null) {
                    f6.t0(this);
                    if (this.f5386y) {
                        C0804F f10 = this.f5378u;
                        f10.g = true;
                        f10.Q(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + f6 + " is already attached to a RecyclerView:" + f6.f9850b.y());
                }
            }
            gVar.p();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z3) {
        C0072l scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            WeakHashMap weakHashMap = O.f1352a;
            D.z(scrollingChildHelper.f1406c);
        }
        scrollingChildHelper.d = z3;
    }

    public void setOnFlingListener(C0806H h) {
        this.f5354c0 = h;
    }

    @Deprecated
    public void setOnScrollListener(C0807I i2) {
        this.f5366m0 = i2;
    }

    public void setPreserveFocusAfterLayout(boolean z3) {
        this.f5361h0 = z3;
    }

    public void setRecycledViewPool(K k6) {
        C0770g gVar = this.f5351b;
        K k7 = (K) gVar.g;
        if (k7 != null) {
            k7.f9868b--;
        }
        gVar.g = k6;
        if (k6 != null && ((RecyclerView) gVar.h).getAdapter() != null) {
            ((K) gVar.g).f9868b++;
        }
    }

    public void setScrollState(int i2) {
        C0827t tVar;
        if (i2 != this.f5343R) {
            this.f5343R = i2;
            if (i2 != 2) {
                S s6 = this.f5362i0;
                s6.f9891p.removeCallbacks(s6);
                s6.f9888c.abortAnimation();
                C0804F f6 = this.f5378u;
                if (!(f6 == null || (tVar = f6.f9852e) == null)) {
                    tVar.i();
                }
            }
            C0804F f7 = this.f5378u;
            if (f7 != null) {
                f7.f0(i2);
            }
            C0807I i5 = this.f5366m0;
            if (i5 != null) {
                i5.a(this, i2);
            }
            ArrayList arrayList = this.f5367n0;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((C0807I) this.f5367n0.get(size)).a(this, i2);
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
            } else {
                this.f5352b0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f5352b0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(Q q6) {
        this.f5351b.getClass();
    }

    public final boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().g(i2, 0);
    }

    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    public final void suppressLayout(boolean z3) {
        C0827t tVar;
        if (z3 != this.f5330D) {
            i("Do not suppressLayout in layout or scroll");
            if (!z3) {
                this.f5330D = false;
                if (!(!this.f5329C || this.f5378u == null || this.f5376t == null)) {
                    requestLayout();
                }
                this.f5329C = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f5330D = true;
            this.f5331E = true;
            setScrollState(0);
            S s6 = this.f5362i0;
            s6.f9891p.removeCallbacks(s6);
            s6.f9888c.abortAnimation();
            C0804F f6 = this.f5378u;
            if (f6 != null && (tVar = f6.f9852e) != null) {
                tVar.i();
            }
        }
    }

    public final void t(int i2, int i5) {
        this.f5336K++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i5);
        C0807I i6 = this.f5366m0;
        if (i6 != null) {
            i6.b(this, i2, i5);
        }
        ArrayList arrayList = this.f5367n0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C0807I) this.f5367n0.get(size)).b(this, i2, i5);
            }
        }
        this.f5336K--;
    }

    public final void u() {
        if (this.f5341P == null) {
            this.f5337L.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.f5341P = edgeEffect;
            if (this.f5369p) {
                edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public final void v() {
        if (this.f5338M == null) {
            this.f5337L.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.f5338M = edgeEffect;
            if (this.f5369p) {
                edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final void w() {
        if (this.f5340O == null) {
            this.f5337L.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.f5340O = edgeEffect;
            if (this.f5369p) {
                edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final void x() {
        if (this.f5339N == null) {
            this.f5337L.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.f5339N = edgeEffect;
            if (this.f5369p) {
                edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public final String y() {
        return " " + super.toString() + ", adapter:" + this.f5376t + ", layout:" + this.f5378u + ", context:" + getContext();
    }

    public final void z(P p6) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f5362i0.f9888c;
            overScroller.getFinalX();
            overScroller.getCurrX();
            p6.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        p6.getClass();
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [m0.B, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v9, types: [java.lang.Object, m0.C, m0.h] */
    /* JADX WARNING: type inference failed for: r1v12, types: [com.google.crypto.tink.shaded.protobuf.l, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v13, types: [m0.P, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x03e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RecyclerView(android.content.Context r22, android.util.AttributeSet r23, int r24) {
        /*
            r21 = this;
            r10 = r21
            r11 = r22
            r12 = r23
            r13 = r24
            r0 = 7
            r21.<init>(r22, r23, r24)
            androidx.emoji2.text.v r1 = new androidx.emoji2.text.v
            r1.<init>((androidx.recyclerview.widget.RecyclerView) r10)
            r10.f5349a = r1
            k5.g r1 = new k5.g
            r1.<init>((androidx.recyclerview.widget.RecyclerView) r10)
            r10.f5351b = r1
            m0.a0 r1 = new m0.a0
            r1.<init>()
            r10.f5358f = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r10.f5371q = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r10.f5373r = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r10.f5375s = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r10.f5380v = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r10.f5382w = r1
            r14 = 0
            r10.f5328B = r14
            r10.f5333H = r14
            r10.f5334I = r14
            r10.f5335J = r14
            r10.f5336K = r14
            m0.B r1 = new m0.B
            r1.<init>()
            r10.f5337L = r1
            m0.h r1 = new m0.h
            r1.<init>()
            r15 = 0
            r1.f9841a = r15
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f9842b = r2
            r2 = 120(0x78, double:5.93E-322)
            r1.f9843c = r2
            r1.d = r2
            r2 = 250(0xfa, double:1.235E-321)
            r1.f9844e = r2
            r1.f9845f = r2
            r9 = 1
            r1.g = r9
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.h = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f9974i = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f9975j = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f9976k = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f9977l = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f9978m = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f9979n = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f9980o = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f9981p = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f9982q = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f9983r = r2
            r10.f5342Q = r1
            r10.f5343R = r14
            r7 = -1
            r10.f5344S = r7
            r1 = 1
            r10.f5359f0 = r1
            r10.f5360g0 = r1
            r10.f5361h0 = r9
            m0.S r1 = new m0.S
            r1.<init>(r10)
            r10.f5362i0 = r1
            com.google.crypto.tink.shaded.protobuf.l r1 = new com.google.crypto.tink.shaded.protobuf.l
            r1.<init>()
            r10.f5364k0 = r1
            m0.P r1 = new m0.P
            r1.<init>()
            r1.f9875a = r7
            r1.f9876b = r14
            r1.f9877c = r14
            r1.d = r9
            r1.f9878e = r14
            r1.f9879f = r14
            r1.g = r14
            r1.h = r14
            r1.f9880i = r14
            r1.f9881j = r14
            r1.f9882k = r14
            r10.f5365l0 = r1
            r10.f5368o0 = r14
            r10.f5370p0 = r14
            m0.x r1 = new m0.x
            r1.<init>(r10)
            r10.f5372q0 = r1
            r10.f5374r0 = r14
            r8 = 2
            int[] r2 = new int[r8]
            r10.f5377t0 = r2
            int[] r2 = new int[r8]
            r10.f5381v0 = r2
            int[] r2 = new int[r8]
            r10.f5383w0 = r2
            int[] r2 = new int[r8]
            r10.f5385x0 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r10.f5387y0 = r2
            k.s0 r2 = new k.s0
            r2.<init>(r10, r0)
            r10.f5389z0 = r2
            m0.w r2 = new m0.w
            r2.<init>(r10)
            r10.f5327A0 = r2
            r10.setScrollContainer(r9)
            r10.setFocusableInTouchMode(r9)
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r22)
            int r3 = r2.getScaledTouchSlop()
            r10.f5352b0 = r3
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 < r4) goto L_0x014a
            java.lang.reflect.Method r5 = K.T.f1357a
            float r5 = K.P.a(r2)
            goto L_0x014e
        L_0x014a:
            float r5 = K.T.a(r2, r11)
        L_0x014e:
            r10.f5359f0 = r5
            if (r3 < r4) goto L_0x0157
            float r5 = K.P.b(r2)
            goto L_0x015b
        L_0x0157:
            float r5 = K.T.a(r2, r11)
        L_0x015b:
            r10.f5360g0 = r5
            int r5 = r2.getScaledMinimumFlingVelocity()
            r10.f5355d0 = r5
            int r2 = r2.getScaledMaximumFlingVelocity()
            r10.f5357e0 = r2
            int r2 = r21.getOverScrollMode()
            if (r2 != r8) goto L_0x0171
            r2 = r9
            goto L_0x0172
        L_0x0171:
            r2 = r14
        L_0x0172:
            r10.setWillNotDraw(r2)
            m0.C r2 = r10.f5342Q
            r2.f9841a = r1
            F3.k r1 = new F3.k
            m0.w r2 = new m0.w
            r2.<init>(r10)
            r1.<init>((m0.C0830w) r2)
            r10.d = r1
            c1.i r1 = new c1.i
            m0.x r2 = new m0.x
            r2.<init>(r10)
            r1.<init>((m0.C0831x) r2)
            r10.f5356e = r1
            java.util.WeakHashMap r1 = K.O.f1352a
            if (r3 < r4) goto L_0x019a
            int r1 = K.F.c(r21)
            goto L_0x019b
        L_0x019a:
            r1 = r14
        L_0x019b:
            r6 = 8
            if (r1 != 0) goto L_0x01a4
            if (r3 < r4) goto L_0x01a4
            K.F.m(r10, r6)
        L_0x01a4:
            int r1 = r21.getImportantForAccessibility()
            if (r1 != 0) goto L_0x01ad
            r10.setImportantForAccessibility(r9)
        L_0x01ad:
            android.content.Context r1 = r21.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            r10.f5332G = r1
            m0.V r1 = new m0.V
            r1.<init>(r10)
            r10.setAccessibilityDelegateCompat(r1)
            int[] r4 = l0.a.f9663a
            android.content.res.TypedArray r5 = r11.obtainStyledAttributes(r12, r4, r13, r14)
            r2 = 29
            if (r3 < r2) goto L_0x01e0
            r1 = r21
            r3 = r2
            r2 = r22
            r3 = r4
            r4 = r23
            r16 = r5
            r15 = r6
            r6 = r24
            r1.saveAttributeDataForStyleable(r2, r3, r4, r5, r6, 0)
            r6 = r16
            goto L_0x01e2
        L_0x01e0:
            r15 = r6
            r6 = r5
        L_0x01e2:
            java.lang.String r15 = r6.getString(r15)
            int r1 = r6.getInt(r8, r7)
            if (r1 != r7) goto L_0x01f1
            r1 = 262144(0x40000, float:3.67342E-40)
            r10.setDescendantFocusability(r1)
        L_0x01f1:
            boolean r1 = r6.getBoolean(r9, r9)
            r10.f5369p = r1
            r7 = 3
            boolean r1 = r6.getBoolean(r7, r14)
            r5 = 4
            if (r1 == 0) goto L_0x026a
            r1 = 6
            android.graphics.drawable.Drawable r1 = r6.getDrawable(r1)
            r3 = r1
            android.graphics.drawable.StateListDrawable r3 = (android.graphics.drawable.StateListDrawable) r3
            android.graphics.drawable.Drawable r4 = r6.getDrawable(r0)
            android.graphics.drawable.Drawable r0 = r6.getDrawable(r5)
            android.graphics.drawable.StateListDrawable r0 = (android.graphics.drawable.StateListDrawable) r0
            r1 = 5
            android.graphics.drawable.Drawable r16 = r6.getDrawable(r1)
            if (r3 == 0) goto L_0x0252
            if (r4 == 0) goto L_0x0252
            if (r0 == 0) goto L_0x0252
            if (r16 == 0) goto L_0x0252
            android.content.Context r1 = r21.getContext()
            android.content.res.Resources r1 = r1.getResources()
            m0.k r2 = new m0.k
            r5 = 2131099794(0x7f060092, float:1.7811951E38)
            int r18 = r1.getDimensionPixelSize(r5)
            r5 = 2131099796(0x7f060094, float:1.7811955E38)
            int r19 = r1.getDimensionPixelSize(r5)
            r5 = 2131099795(0x7f060093, float:1.7811953E38)
            int r20 = r1.getDimensionPixelOffset(r5)
            r1 = r2
            r2 = r21
            r5 = r0
            r0 = r6
            r6 = r16
            r16 = r7
            r7 = r18
            r17 = r8
            r8 = r19
            r9 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x026f
        L_0x0252:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Trying to set fast scroller without both required drawables."
            r1.<init>(r2)
            java.lang.String r2 = r21.y()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x026a:
            r0 = r6
            r16 = r7
            r17 = r8
        L_0x026f:
            r0.recycle()
            java.lang.String r1 = ": Could not instantiate the LayoutManager: "
            if (r15 == 0) goto L_0x03da
            java.lang.String r0 = r15.trim()
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x03da
            char r2 = r0.charAt(r14)
            r3 = 46
            if (r2 != r3) goto L_0x029d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r22.getPackageName()
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
        L_0x029b:
            r2 = r0
            goto L_0x02c3
        L_0x029d:
            java.lang.String r2 = "."
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x02a6
            goto L_0x029b
        L_0x02a6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class<androidx.recyclerview.widget.RecyclerView> r4 = androidx.recyclerview.widget.RecyclerView.class
            java.lang.Package r4 = r4.getPackage()
            java.lang.String r4 = r4.getName()
            r2.append(r4)
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L_0x029b
        L_0x02c3:
            boolean r0 = r21.isInEditMode()     // Catch:{ ClassNotFoundException -> 0x02de, InvocationTargetException -> 0x02db, InstantiationException -> 0x02d8, IllegalAccessException -> 0x02d5, ClassCastException -> 0x02d2 }
            if (r0 == 0) goto L_0x02e1
            java.lang.Class r0 = r21.getClass()     // Catch:{ ClassNotFoundException -> 0x02de, InvocationTargetException -> 0x02db, InstantiationException -> 0x02d8, IllegalAccessException -> 0x02d5, ClassCastException -> 0x02d2 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x02de, InvocationTargetException -> 0x02db, InstantiationException -> 0x02d8, IllegalAccessException -> 0x02d5, ClassCastException -> 0x02d2 }
            goto L_0x02e5
        L_0x02d2:
            r0 = move-exception
            goto L_0x0348
        L_0x02d5:
            r0 = move-exception
            goto L_0x0366
        L_0x02d8:
            r0 = move-exception
            goto L_0x0384
        L_0x02db:
            r0 = move-exception
            goto L_0x03a0
        L_0x02de:
            r0 = move-exception
            goto L_0x03bc
        L_0x02e1:
            java.lang.ClassLoader r0 = r22.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x02de, InvocationTargetException -> 0x02db, InstantiationException -> 0x02d8, IllegalAccessException -> 0x02d5, ClassCastException -> 0x02d2 }
        L_0x02e5:
            java.lang.Class r0 = java.lang.Class.forName(r2, r14, r0)     // Catch:{ ClassNotFoundException -> 0x02de, InvocationTargetException -> 0x02db, InstantiationException -> 0x02d8, IllegalAccessException -> 0x02d5, ClassCastException -> 0x02d2 }
            java.lang.Class<m0.F> r3 = m0.C0804F.class
            java.lang.Class r3 = r0.asSubclass(r3)     // Catch:{ ClassNotFoundException -> 0x02de, InvocationTargetException -> 0x02db, InstantiationException -> 0x02d8, IllegalAccessException -> 0x02d5, ClassCastException -> 0x02d2 }
            java.lang.Class[] r0 = f5324C0     // Catch:{ NoSuchMethodException -> 0x030f }
            java.lang.reflect.Constructor r0 = r3.getConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x030f }
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ NoSuchMethodException -> 0x030f }
            r4[r14] = r11     // Catch:{ NoSuchMethodException -> 0x030f }
            r7 = 1
            r4[r7] = r12     // Catch:{ NoSuchMethodException -> 0x030b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r24)     // Catch:{ NoSuchMethodException -> 0x030b }
            r4[r17] = r5     // Catch:{ NoSuchMethodException -> 0x030b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r14)     // Catch:{ NoSuchMethodException -> 0x030b }
            r4[r16] = r5     // Catch:{ NoSuchMethodException -> 0x030b }
        L_0x0309:
            r15 = r4
            goto L_0x0317
        L_0x030b:
            r0 = move-exception
        L_0x030c:
            r5 = r0
            r4 = 0
            goto L_0x0312
        L_0x030f:
            r0 = move-exception
            r7 = 1
            goto L_0x030c
        L_0x0312:
            java.lang.reflect.Constructor r0 = r3.getConstructor(r4)     // Catch:{ NoSuchMethodException -> 0x0325 }
            goto L_0x0309
        L_0x0317:
            r0.setAccessible(r7)     // Catch:{ ClassNotFoundException -> 0x02de, InvocationTargetException -> 0x02db, InstantiationException -> 0x02d8, IllegalAccessException -> 0x02d5, ClassCastException -> 0x02d2 }
            java.lang.Object r0 = r0.newInstance(r15)     // Catch:{ ClassNotFoundException -> 0x02de, InvocationTargetException -> 0x02db, InstantiationException -> 0x02d8, IllegalAccessException -> 0x02d5, ClassCastException -> 0x02d2 }
            m0.F r0 = (m0.C0804F) r0     // Catch:{ ClassNotFoundException -> 0x02de, InvocationTargetException -> 0x02db, InstantiationException -> 0x02d8, IllegalAccessException -> 0x02d5, ClassCastException -> 0x02d2 }
            r10.setLayoutManager(r0)     // Catch:{ ClassNotFoundException -> 0x02de, InvocationTargetException -> 0x02db, InstantiationException -> 0x02d8, IllegalAccessException -> 0x02d5, ClassCastException -> 0x02d2 }
            goto L_0x03db
        L_0x0325:
            r0 = move-exception
            r3 = r0
            r3.initCause(r5)     // Catch:{ ClassNotFoundException -> 0x02de, InvocationTargetException -> 0x02db, InstantiationException -> 0x02d8, IllegalAccessException -> 0x02d5, ClassCastException -> 0x02d2 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ ClassNotFoundException -> 0x02de, InvocationTargetException -> 0x02db, InstantiationException -> 0x02d8, IllegalAccessException -> 0x02d5, ClassCastException -> 0x02d2 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x02de, InvocationTargetException -> 0x02db, InstantiationException -> 0x02d8, IllegalAccessException -> 0x02d5, ClassCastException -> 0x02d2 }
            r4.<init>()     // Catch:{ ClassNotFoundException -> 0x02de, InvocationTargetException -> 0x02db, InstantiationException -> 0x02d8, IllegalAccessException -> 0x02d5, ClassCastException -> 0x02d2 }
            java.lang.String r5 = r23.getPositionDescription()     // Catch:{ ClassNotFoundException -> 0x02de, InvocationTargetException -> 0x02db, InstantiationException -> 0x02d8, IllegalAccessException -> 0x02d5, ClassCastException -> 0x02d2 }
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x02de, InvocationTargetException -> 0x02db, InstantiationException -> 0x02d8, IllegalAccessException -> 0x02d5, ClassCastException -> 0x02d2 }
            java.lang.String r5 = ": Error creating LayoutManager "
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x02de, InvocationTargetException -> 0x02db, InstantiationException -> 0x02d8, IllegalAccessException -> 0x02d5, ClassCastException -> 0x02d2 }
            r4.append(r2)     // Catch:{ ClassNotFoundException -> 0x02de, InvocationTargetException -> 0x02db, InstantiationException -> 0x02d8, IllegalAccessException -> 0x02d5, ClassCastException -> 0x02d2 }
            java.lang.String r4 = r4.toString()     // Catch:{ ClassNotFoundException -> 0x02de, InvocationTargetException -> 0x02db, InstantiationException -> 0x02d8, IllegalAccessException -> 0x02d5, ClassCastException -> 0x02d2 }
            r0.<init>(r4, r3)     // Catch:{ ClassNotFoundException -> 0x02de, InvocationTargetException -> 0x02db, InstantiationException -> 0x02d8, IllegalAccessException -> 0x02d5, ClassCastException -> 0x02d2 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x02de, InvocationTargetException -> 0x02db, InstantiationException -> 0x02d8, IllegalAccessException -> 0x02d5, ClassCastException -> 0x02d2 }
        L_0x0348:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r23.getPositionDescription()
            r3.append(r4)
            java.lang.String r4 = ": Class is not a LayoutManager "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x0366:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r23.getPositionDescription()
            r3.append(r4)
            java.lang.String r4 = ": Cannot access non-public constructor "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x0384:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r23.getPositionDescription()
            r4.append(r5)
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            r3.<init>(r1, r0)
            throw r3
        L_0x03a0:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r23.getPositionDescription()
            r4.append(r5)
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            r3.<init>(r1, r0)
            throw r3
        L_0x03bc:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r23.getPositionDescription()
            r3.append(r4)
            java.lang.String r4 = ": Unable to find LayoutManager "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x03da:
            r7 = 1
        L_0x03db:
            int r0 = android.os.Build.VERSION.SDK_INT
            int[] r3 = f5323B0
            android.content.res.TypedArray r8 = r11.obtainStyledAttributes(r12, r3, r13, r14)
            r1 = 29
            if (r0 < r1) goto L_0x03f3
            r1 = r21
            r2 = r22
            r4 = r23
            r5 = r8
            r6 = r24
            r1.saveAttributeDataForStyleable(r2, r3, r4, r5, r6, 0)
        L_0x03f3:
            boolean r0 = r8.getBoolean(r14, r7)
            r8.recycle()
            r10.setNestedScrollingEnabled(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0804F f6 = this.f5378u;
        if (f6 != null) {
            return f6.t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    public void setRecyclerListener(L l6) {
    }
}
