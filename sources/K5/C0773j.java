package k5;

import H.j;
import T1.C0166e1;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.Checkable;
import android.widget.ListAdapter;
import com.google.android.gms.common.api.f;
import com.google.android.material.datepicker.i;
import com.mtma.criminal.city.R;
import f5.C0544a;
import h0.C0552a;
import h5.C0569a;
import h5.C0570b;
import it.sephiroth.android.library.widget.HListView;
import j5.a;
import java.util.ArrayList;
import k.C0737s0;
import n.g;
import n.h;
import n.k;
import o.C0890a;

/* renamed from: k5.j  reason: case insensitive filesystem */
public abstract class C0773j extends o implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnTouchModeChangeListener {

    /* renamed from: c1  reason: collision with root package name */
    public static final int[] f9505c1 = {0};

    /* renamed from: A0  reason: collision with root package name */
    public C0766c f9506A0;

    /* renamed from: B0  reason: collision with root package name */
    public C0769f f9507B0;

    /* renamed from: C0  reason: collision with root package name */
    public j f9508C0;

    /* renamed from: D0  reason: collision with root package name */
    public int f9509D0;

    /* renamed from: E0  reason: collision with root package name */
    public int f9510E0;

    /* renamed from: F0  reason: collision with root package name */
    public boolean f9511F0;

    /* renamed from: G0  reason: collision with root package name */
    public final int f9512G0;

    /* renamed from: H  reason: collision with root package name */
    public final a f9513H;

    /* renamed from: H0  reason: collision with root package name */
    public C0764a f9514H0;

    /* renamed from: I  reason: collision with root package name */
    public int f9515I;

    /* renamed from: I0  reason: collision with root package name */
    public final int f9516I0;

    /* renamed from: J  reason: collision with root package name */
    public ActionMode f9517J;

    /* renamed from: J0  reason: collision with root package name */
    public final int f9518J0;

    /* renamed from: K  reason: collision with root package name */
    public C0570b f9519K;

    /* renamed from: K0  reason: collision with root package name */
    public float f9520K0;

    /* renamed from: L  reason: collision with root package name */
    public int f9521L;
    public final boolean[] L0;

    /* renamed from: M  reason: collision with root package name */
    public k f9522M;

    /* renamed from: M0  reason: collision with root package name */
    public int f9523M0;

    /* renamed from: N  reason: collision with root package name */
    public g f9524N;

    /* renamed from: N0  reason: collision with root package name */
    public final int f9525N0;

    /* renamed from: O  reason: collision with root package name */
    public int f9526O;
    public final int O0;

    /* renamed from: P  reason: collision with root package name */
    public C0765b f9527P;

    /* renamed from: P0  reason: collision with root package name */
    public p f9528P0;

    /* renamed from: Q  reason: collision with root package name */
    public ListAdapter f9529Q;

    /* renamed from: Q0  reason: collision with root package name */
    public p f9530Q0;

    /* renamed from: R  reason: collision with root package name */
    public boolean f9531R;

    /* renamed from: R0  reason: collision with root package name */
    public int f9532R0;

    /* renamed from: S  reason: collision with root package name */
    public boolean f9533S;

    /* renamed from: S0  reason: collision with root package name */
    public int f9534S0;

    /* renamed from: T  reason: collision with root package name */
    public Drawable f9535T;

    /* renamed from: T0  reason: collision with root package name */
    public int f9536T0;

    /* renamed from: U  reason: collision with root package name */
    public int f9537U;

    /* renamed from: U0  reason: collision with root package name */
    public boolean f9538U0;

    /* renamed from: V  reason: collision with root package name */
    public final Rect f9539V;

    /* renamed from: V0  reason: collision with root package name */
    public i f9540V0;

    /* renamed from: W  reason: collision with root package name */
    public final C0770g f9541W;

    /* renamed from: W0  reason: collision with root package name */
    public int f9542W0;
    public int X0;

    /* renamed from: Y0  reason: collision with root package name */
    public boolean f9543Y0;

    /* renamed from: Z0  reason: collision with root package name */
    public int f9544Z0;

    /* renamed from: a0  reason: collision with root package name */
    public int f9545a0;

    /* renamed from: a1  reason: collision with root package name */
    public C0772i f9546a1;

    /* renamed from: b0  reason: collision with root package name */
    public int f9547b0;

    /* renamed from: b1  reason: collision with root package name */
    public float f9548b1;

    /* renamed from: c0  reason: collision with root package name */
    public int f9549c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f9550d0;

    /* renamed from: e0  reason: collision with root package name */
    public final Rect f9551e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f9552f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f9553g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f9554h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f9555i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f9556j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f9557k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f9558l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f9559m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f9560n0;

    /* renamed from: o0  reason: collision with root package name */
    public VelocityTracker f9561o0;

    /* renamed from: p0  reason: collision with root package name */
    public C0166e1 f9562p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f9563q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f9564r0;
    public boolean s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f9565t0;

    /* renamed from: u0  reason: collision with root package name */
    public Rect f9566u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f9567v0;

    /* renamed from: w0  reason: collision with root package name */
    public C0774k f9568w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f9569x0;

    /* renamed from: y0  reason: collision with root package name */
    public C0766c f9570y0;

    /* renamed from: z0  reason: collision with root package name */
    public C0764a f9571z0;

    static {
        new LinearInterpolator();
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [java.lang.Object, j5.a, C0.a] */
    public C0773j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.hlv_listViewStyle);
        boolean z3;
        int i2;
        int i5;
        int i6;
        boolean z4;
        boolean z5 = false;
        this.f9578a = 0;
        this.d = Long.MIN_VALUE;
        this.f9582f = false;
        this.f9585r = false;
        this.f9587t = -1;
        this.f9588u = Long.MIN_VALUE;
        this.f9589v = -1;
        this.f9590w = Long.MIN_VALUE;
        this.f9573B = -1;
        this.f9574C = Long.MIN_VALUE;
        this.f9577G = false;
        boolean z6 = true;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        if (!isInEditMode()) {
            this.f9572A = (AccessibilityManager) getContext().getSystemService("accessibility");
        }
        this.f9515I = 0;
        this.f9526O = 0;
        this.f9533S = false;
        this.f9537U = -1;
        this.f9539V = new Rect();
        this.f9541W = new C0770g((HListView) this);
        this.f9545a0 = 0;
        this.f9547b0 = 0;
        this.f9549c0 = 0;
        this.f9550d0 = 0;
        this.f9551e0 = new Rect();
        this.f9552f0 = 0;
        this.f9558l0 = -1;
        this.f9563q0 = 0;
        this.f9565t0 = true;
        this.f9567v0 = -1;
        Drawable drawable = null;
        this.f9568w0 = null;
        this.f9569x0 = -1;
        this.f9520K0 = 1.0f;
        this.L0 = new boolean[1];
        this.f9523M0 = -1;
        this.f9536T0 = 0;
        setClickable(true);
        setFocusableInTouchMode(true);
        setWillNotDraw(false);
        setAlwaysDrawnWithCacheEnabled(false);
        setScrollingCacheEnabled(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f9512G0 = viewConfiguration.getScaledTouchSlop();
        this.f9516I0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f9518J0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f9525N0 = viewConfiguration.getScaledOverscrollDistance();
        this.O0 = viewConfiguration.getScaledOverflingDistance();
        ? obj = new Object();
        obj.f398a = this;
        this.f9513H = obj;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C0544a.f7978a, R.attr.hlv_listViewStyle, 0);
        if (obtainStyledAttributes != null) {
            drawable = obtainStyledAttributes.getDrawable(0);
            boolean z7 = obtainStyledAttributes.getBoolean(1, false);
            z4 = obtainStyledAttributes.getBoolean(6, false);
            boolean z8 = obtainStyledAttributes.getBoolean(2, true);
            i6 = obtainStyledAttributes.getInt(7, 0);
            i5 = obtainStyledAttributes.getColor(3, 0);
            boolean z9 = obtainStyledAttributes.getBoolean(5, true);
            int i7 = obtainStyledAttributes.getInt(4, 0);
            obtainStyledAttributes.recycle();
            i2 = i7;
            z5 = z7;
            z3 = z9;
            z6 = z8;
        } else {
            i2 = 0;
            z4 = false;
            i6 = 0;
            i5 = 0;
            z3 = true;
        }
        if (drawable != null) {
            setSelector(drawable);
        }
        this.f9533S = z5;
        setStackFromRight(z4);
        setScrollingCacheEnabled(z6);
        setTranscriptMode(i6);
        setCacheColorHint(i5);
        setSmoothScrollbarEnabled(z3);
        setChoiceMode(i2);
    }

    public static View L(int i2, ArrayList arrayList) {
        int size = arrayList.size();
        if (size <= 0) {
            return null;
        }
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (((C0767d) view.getLayoutParams()).d == i2) {
                arrayList.remove(i5);
                return view;
            }
        }
        return (View) arrayList.remove(size - 1);
    }

    public abstract void A();

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View B(boolean[] r11, int r12) {
        /*
            r10 = this;
            r0 = 0
            r11[r0] = r0
            k5.g r1 = r10.f9541W
            java.lang.Object r2 = r1.g
            n.k r2 = (n.k) r2
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x000f
        L_0x000d:
            r5 = r4
            goto L_0x003b
        L_0x000f:
            boolean r5 = r2.f10227a
            if (r5 == 0) goto L_0x0016
            n.h.a(r2)
        L_0x0016:
            int[] r5 = r2.f10228b
            int r2 = r2.d
            int r2 = o.C0890a.a(r2, r12, r5)
            if (r2 >= 0) goto L_0x0021
            goto L_0x000d
        L_0x0021:
            java.lang.Object r5 = r1.g
            n.k r5 = (n.k) r5
            java.lang.Object r5 = r5.i(r2)
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r6 = r1.g
            n.k r6 = (n.k) r6
            java.lang.Object[] r7 = r6.f10229c
            r8 = r7[r2]
            java.lang.Object r9 = n.h.f10223b
            if (r8 == r9) goto L_0x003b
            r7[r2] = r9
            r6.f10227a = r3
        L_0x003b:
            if (r5 == 0) goto L_0x003e
            return r5
        L_0x003e:
            int r2 = r1.d
            if (r2 != r3) goto L_0x0049
            java.util.ArrayList r2 = r1.f9491a
            android.view.View r2 = L(r12, r2)
            goto L_0x0064
        L_0x0049:
            android.view.ViewGroup r2 = r1.h
            it.sephiroth.android.library.widget.HListView r2 = (it.sephiroth.android.library.widget.HListView) r2
            android.widget.ListAdapter r2 = r2.f9529Q
            int r2 = r2.getItemViewType(r12)
            if (r2 < 0) goto L_0x0063
            java.lang.Object r5 = r1.f9495f
            java.util.ArrayList[] r5 = (java.util.ArrayList[]) r5
            int r6 = r5.length
            if (r2 >= r6) goto L_0x0063
            r2 = r5[r2]
            android.view.View r2 = L(r12, r2)
            goto L_0x0064
        L_0x0063:
            r2 = r4
        L_0x0064:
            if (r2 == 0) goto L_0x0088
            android.widget.ListAdapter r4 = r10.f9529Q
            android.view.View r4 = r4.getView(r12, r2, r10)
            int r5 = r4.getImportantForAccessibility()
            if (r5 != 0) goto L_0x0075
            r4.setImportantForAccessibility(r3)
        L_0x0075:
            if (r4 == r2) goto L_0x0082
            r1.a(r2, r12)
            int r11 = r10.f9510E0
            if (r11 == 0) goto L_0x009e
            r4.setDrawingCacheBackgroundColor(r11)
            goto L_0x009e
        L_0x0082:
            r11[r0] = r3
            r4.onFinishTemporaryDetach()
            goto L_0x009e
        L_0x0088:
            android.widget.ListAdapter r11 = r10.f9529Q
            android.view.View r4 = r11.getView(r12, r4, r10)
            int r11 = r4.getImportantForAccessibility()
            if (r11 != 0) goto L_0x0097
            r4.setImportantForAccessibility(r3)
        L_0x0097:
            int r11 = r10.f9510E0
            if (r11 == 0) goto L_0x009e
            r4.setDrawingCacheBackgroundColor(r11)
        L_0x009e:
            boolean r11 = r10.f9531R
            if (r11 == 0) goto L_0x00c4
            android.view.ViewGroup$LayoutParams r11 = r4.getLayoutParams()
            if (r11 != 0) goto L_0x00af
            android.view.ViewGroup$LayoutParams r11 = r10.generateDefaultLayoutParams()
            k5.d r11 = (k5.C0767d) r11
            goto L_0x00bc
        L_0x00af:
            boolean r0 = r11 instanceof k5.C0767d
            if (r0 != 0) goto L_0x00ba
            k5.d r0 = new k5.d
            r0.<init>(r11)
            r11 = r0
            goto L_0x00bc
        L_0x00ba:
            k5.d r11 = (k5.C0767d) r11
        L_0x00bc:
            android.widget.ListAdapter r0 = r10.f9529Q
            r0.getItemId(r12)
            r4.setLayoutParams(r11)
        L_0x00c4:
            android.view.accessibility.AccessibilityManager r11 = r10.f9572A
            boolean r11 = r11.isEnabled()
            if (r11 == 0) goto L_0x00db
            com.google.android.material.datepicker.i r11 = r10.f9540V0
            if (r11 != 0) goto L_0x00db
            com.google.android.material.datepicker.i r11 = new com.google.android.material.datepicker.i
            r12 = r10
            it.sephiroth.android.library.widget.HListView r12 = (it.sephiroth.android.library.widget.HListView) r12
            r0 = 2
            r11.<init>(r12, r0)
            r10.f9540V0 = r11
        L_0x00db:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.C0773j.B(boolean[], int):android.view.View");
    }

    public final void C(int i2) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            getChildAt(i5).offsetLeftAndRight(i2);
        }
    }

    public final void D(MotionEvent motionEvent) {
        int i2;
        int action = (motionEvent.getAction() & 65280) >> 8;
        if (motionEvent.getPointerId(action) == this.f9523M0) {
            if (action == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.f9556j0 = (int) motionEvent.getX(i2);
            this.f9557k0 = (int) motionEvent.getY(i2);
            this.f9560n0 = 0;
            this.f9523M0 = motionEvent.getPointerId(i2);
        }
    }

    public final boolean E(int i2, long j6) {
        Object[] objArr;
        Object obj;
        int i5 = this.f9515I;
        if (i5 == 0) {
            return false;
        }
        if (i5 == 2 || (i5 == 3 && this.f9517J != null)) {
            boolean booleanValue = ((Boolean) this.f9522M.e(i2, Boolean.FALSE)).booleanValue();
            boolean z3 = !booleanValue;
            this.f9522M.g(i2, Boolean.valueOf(z3));
            if (this.f9524N != null && this.f9529Q.hasStableIds()) {
                if (!booleanValue) {
                    this.f9524N.d(Integer.valueOf(i2), this.f9529Q.getItemId(i2));
                } else {
                    g gVar = this.f9524N;
                    int b6 = C0890a.b(gVar.f10220b, gVar.d, this.f9529Q.getItemId(i2));
                    if (b6 >= 0 && (objArr = gVar.f10221c)[b6] != (obj = h.f10222a)) {
                        objArr[b6] = obj;
                        gVar.f10219a = true;
                    }
                }
            }
            if (!booleanValue) {
                this.f9521L++;
            } else {
                this.f9521L--;
            }
            ActionMode actionMode = this.f9517J;
            if (actionMode != null) {
                this.f9519K.a(actionMode, i2, j6, z3);
            }
        } else {
            if (i5 == 1) {
                if (!((Boolean) this.f9522M.e(i2, Boolean.FALSE)).booleanValue()) {
                    this.f9522M.b();
                    this.f9522M.g(i2, Boolean.TRUE);
                    if (this.f9524N != null && this.f9529Q.hasStableIds()) {
                        this.f9524N.a();
                        this.f9524N.d(Integer.valueOf(i2), this.f9529Q.getItemId(i2));
                    }
                    this.f9521L = 1;
                } else if (this.f9522M.h() == 0 || !((Boolean) this.f9522M.i(0)).booleanValue()) {
                    this.f9521L = 0;
                }
            }
            return true;
        }
        int i6 = this.f9578a;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            int i8 = i6 + i7;
            if (childAt instanceof Checkable) {
                ((Checkable) childAt).setChecked(((Boolean) this.f9522M.e(i8, Boolean.FALSE)).booleanValue());
            } else {
                childAt.setActivated(((Boolean) this.f9522M.e(i8, Boolean.FALSE)).booleanValue());
            }
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r14v1, types: [k5.k, java.lang.Object] */
    public final boolean F(int i2) {
        boolean z3;
        if (this.f9515I == 3) {
            if (this.f9517J == null) {
                ActionMode startActionMode = startActionMode(this.f9519K);
                this.f9517J = startActionMode;
                if (startActionMode != null) {
                    int i5 = this.f9515I;
                    if (i5 != 0) {
                        if (i5 == 2 || i5 == 3) {
                            boolean booleanValue = ((Boolean) this.f9522M.e(i2, Boolean.FALSE)).booleanValue();
                            this.f9522M.g(i2, Boolean.TRUE);
                            if (this.f9524N != null && this.f9529Q.hasStableIds()) {
                                this.f9524N.d(Integer.valueOf(i2), this.f9529Q.getItemId(i2));
                            }
                            if (!booleanValue) {
                                this.f9521L++;
                            }
                            if (this.f9517J != null) {
                                this.f9519K.a(this.f9517J, i2, this.f9529Q.getItemId(i2), true);
                            }
                        } else {
                            if (this.f9524N == null || !this.f9529Q.hasStableIds()) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            this.f9522M.b();
                            if (z3) {
                                this.f9524N.a();
                            }
                            this.f9522M.g(i2, Boolean.TRUE);
                            if (z3) {
                                this.f9524N.d(Integer.valueOf(i2), this.f9529Q.getItemId(i2));
                            }
                            this.f9521L = 1;
                        }
                        if (!this.f9585r && !this.f9577G) {
                            this.f9586s = true;
                            f();
                            requestLayout();
                        }
                    }
                    performHapticFeedback(0);
                }
            }
            return true;
        }
        this.f9568w0 = new Object();
        boolean showContextMenuForChild = super.showContextMenuForChild(this);
        if (showContextMenuForChild) {
            performHapticFeedback(0);
        }
        return showContextMenuForChild;
    }

    public final int G(int i2, int i5) {
        Rect rect = this.f9566u0;
        if (rect == null) {
            rect = new Rect();
            this.f9566u0 = rect;
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() == 0) {
                childAt.getHitRect(rect);
                if (rect.contains(i2, i5)) {
                    return this.f9578a + childCount;
                }
            }
        }
        return -1;
    }

    public final void H(View view, int i2) {
        if (i2 != -1) {
            this.f9537U = i2;
        }
        int left = view.getLeft();
        int top = view.getTop();
        int right = view.getRight();
        int bottom = view.getBottom();
        Rect rect = this.f9539V;
        rect.set(left, top, right, bottom);
        rect.set(rect.left - this.f9545a0, rect.top - this.f9547b0, rect.right + this.f9549c0, rect.bottom + this.f9550d0);
        boolean z3 = this.f9511F0;
        if (view.isEnabled() != z3) {
            this.f9511F0 = !z3;
            if (getSelectedItemPosition() != -1) {
                refreshDrawableState();
            }
        }
    }

    public abstract void I();

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean J() {
        /*
            r12 = this;
            int r0 = r12.getChildCount()
            r1 = 0
            if (r0 > 0) goto L_0x0008
            return r1
        L_0x0008:
            android.graphics.Rect r2 = r12.f9551e0
            int r3 = r2.left
            int r4 = r12.getRight()
            int r5 = r12.getLeft()
            int r4 = r4 - r5
            int r2 = r2.right
            int r4 = r4 - r2
            int r2 = r12.f9578a
            int r5 = r12.f9567v0
            r6 = 1
            if (r5 < r2) goto L_0x004a
            int r7 = r2 + r0
            if (r5 >= r7) goto L_0x004a
            int r0 = r5 - r2
            android.view.View r0 = r12.getChildAt(r0)
            int r7 = r0.getLeft()
            int r8 = r0.getRight()
            if (r7 >= r3) goto L_0x003a
            int r0 = r12.getHorizontalFadingEdgeLength()
            int r7 = r0 + r3
            goto L_0x0047
        L_0x003a:
            if (r8 <= r4) goto L_0x0047
            int r0 = r0.getMeasuredWidth()
            int r4 = r4 - r0
            int r0 = r12.getHorizontalFadingEdgeLength()
            int r7 = r4 - r0
        L_0x0047:
            r0 = r6
            goto L_0x00a6
        L_0x004a:
            if (r5 >= r2) goto L_0x0073
            r4 = r1
            r5 = r4
        L_0x004e:
            if (r4 >= r0) goto L_0x0070
            android.view.View r7 = r12.getChildAt(r4)
            int r7 = r7.getLeft()
            if (r4 != 0) goto L_0x0068
            if (r2 > 0) goto L_0x0061
            if (r7 >= r3) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            r5 = r7
            goto L_0x0068
        L_0x0061:
            int r5 = r12.getHorizontalFadingEdgeLength()
            int r5 = r5 + r3
            r3 = r5
            goto L_0x005f
        L_0x0068:
            if (r7 < r3) goto L_0x006d
            int r4 = r4 + r2
            r5 = r4
            goto L_0x0047
        L_0x006d:
            int r4 = r4 + 1
            goto L_0x004e
        L_0x0070:
            r7 = r5
            r5 = r2
            goto L_0x0047
        L_0x0073:
            int r3 = r12.f9592y
            int r5 = r2 + r0
            int r7 = r5 + -1
            int r0 = r0 - r6
            r9 = r0
            r8 = r1
        L_0x007c:
            if (r9 < 0) goto L_0x00a3
            android.view.View r10 = r12.getChildAt(r9)
            int r11 = r10.getLeft()
            int r10 = r10.getRight()
            if (r9 != r0) goto L_0x0099
            if (r5 < r3) goto L_0x0093
            if (r10 <= r4) goto L_0x0091
            goto L_0x0093
        L_0x0091:
            r8 = r11
            goto L_0x0099
        L_0x0093:
            int r8 = r12.getHorizontalFadingEdgeLength()
            int r4 = r4 - r8
            goto L_0x0091
        L_0x0099:
            if (r10 > r4) goto L_0x00a0
            int r5 = r2 + r9
            r0 = r1
            r7 = r11
            goto L_0x00a6
        L_0x00a0:
            int r9 = r9 + -1
            goto L_0x007c
        L_0x00a3:
            r0 = r1
            r5 = r7
            r7 = r8
        L_0x00a6:
            r3 = -1
            r12.f9567v0 = r3
            T1.e1 r4 = r12.f9562p0
            r12.removeCallbacks(r4)
            r12.f9558l0 = r3
            r12.t()
            r12.f9579b = r7
            int r0 = r12.e(r5, r0)
            if (r0 < r2) goto L_0x00ce
            int r2 = r12.getLastVisiblePosition()
            if (r0 > r2) goto L_0x00ce
            r2 = 4
            r12.f9526O = r2
            r12.R()
            r12.setSelectionInt(r0)
            r12.onScrollChanged(r1, r1, r1, r1)
            r3 = r0
        L_0x00ce:
            if (r3 < 0) goto L_0x00d1
            r1 = r6
        L_0x00d1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.C0773j.J():boolean");
    }

    public final boolean K() {
        if (this.f9589v >= 0 || !J()) {
            return false;
        }
        R();
        return true;
    }

    public final void M(int i2) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z3;
        VelocityTracker velocityTracker;
        ViewParent parent;
        int i15 = i2;
        int i16 = i15 - this.f9556j0;
        int i17 = i16 - this.f9560n0;
        int i18 = this.f9559m0;
        if (i18 != Integer.MIN_VALUE) {
            i5 = i15 - i18;
        } else {
            i5 = i17;
        }
        int i19 = this.f9558l0;
        if (i19 == 3) {
            if (i15 != i18) {
                if (Math.abs(i16) > this.f9512G0 && (parent = getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                int i20 = this.f9555i0;
                if (i20 >= 0) {
                    i13 = i20 - this.f9578a;
                } else {
                    i13 = getChildCount() / 2;
                }
                View childAt = getChildAt(i13);
                if (childAt != null) {
                    i14 = childAt.getLeft();
                } else {
                    i14 = 0;
                }
                if (i5 != 0) {
                    z3 = Q(i17, i5);
                } else {
                    z3 = false;
                }
                View childAt2 = getChildAt(i13);
                if (childAt2 != null) {
                    int left = childAt2.getLeft();
                    if (z3) {
                        int i21 = (-i5) - (left - i14);
                        overScrollBy(i21, 0, getScrollX(), 0, 0, 0, this.f9525N0, 0, true);
                        if (Math.abs(this.f9525N0) == Math.abs(getScrollX()) && (velocityTracker = this.f9561o0) != null) {
                            velocityTracker.clear();
                        }
                        int overScrollMode = getOverScrollMode();
                        if (overScrollMode == 0 || (overScrollMode == 1 && !u())) {
                            this.f9536T0 = 0;
                            this.f9558l0 = 5;
                            if (i16 > 0) {
                                this.f9528P0.e(((float) i21) / ((float) getWidth()));
                                if (!this.f9530Q0.c()) {
                                    this.f9530Q0.f();
                                }
                                invalidate(this.f9528P0.b(false));
                            } else if (i16 < 0) {
                                this.f9530Q0.e(((float) i21) / ((float) getWidth()));
                                if (!this.f9528P0.c()) {
                                    this.f9528P0.f();
                                }
                                invalidate(this.f9530Q0.b(true));
                            }
                        }
                    }
                    this.f9556j0 = i15;
                }
                this.f9559m0 = i15;
            }
        } else if (i19 == 5 && i15 != i18) {
            int scrollX = getScrollX();
            int i22 = scrollX - i5;
            if (i15 > this.f9559m0) {
                i6 = 1;
            } else {
                i6 = -1;
            }
            if (this.f9536T0 == 0) {
                this.f9536T0 = i6;
            }
            int i23 = -i5;
            if ((i22 >= 0 || scrollX < 0) && (i22 <= 0 || scrollX > 0)) {
                i7 = i23;
                i8 = 0;
            } else {
                int i24 = -scrollX;
                i8 = i5 + i24;
                i7 = i24;
            }
            if (i7 != 0) {
                i10 = i8;
                int i25 = i7;
                i9 = i6;
                overScrollBy(i7, 0, getScrollX(), 0, 0, 0, this.f9525N0, 0, true);
                int overScrollMode2 = getOverScrollMode();
                if (overScrollMode2 == 0 || (overScrollMode2 == 1 && !u())) {
                    if (i16 > 0) {
                        this.f9528P0.e(((float) i25) / ((float) getWidth()));
                        if (!this.f9530Q0.c()) {
                            this.f9530Q0.f();
                        }
                        invalidate(this.f9528P0.b(false));
                    } else if (i16 < 0) {
                        this.f9530Q0.e(((float) i25) / ((float) getWidth()));
                        if (!this.f9528P0.c()) {
                            this.f9528P0.f();
                        }
                        invalidate(this.f9530Q0.b(true));
                    }
                }
            } else {
                i10 = i8;
                i9 = i6;
            }
            if (i10 != 0) {
                if (getScrollX() != 0) {
                    ((C0773j) this.f9513H.f398a).setScrollX(0);
                    z();
                }
                Q(i10, i10);
                this.f9558l0 = 3;
                int childCount = getChildCount();
                if (childCount == 0) {
                    i12 = 0;
                    i11 = -1;
                } else {
                    int w6 = w(i2);
                    if (w6 == -1) {
                        w6 = (this.f9578a + childCount) - 1;
                    }
                    i11 = w6;
                    i12 = 0;
                }
                this.f9560n0 = i12;
                View childAt3 = getChildAt(i11 - this.f9578a);
                if (childAt3 != null) {
                    childAt3.getLeft();
                }
                this.f9556j0 = i15;
                this.f9555i0 = i11;
            }
            this.f9559m0 = i15;
            this.f9536T0 = i9;
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [k5.k, java.lang.Object] */
    public final boolean N(float f6, float f7, int i2) {
        int G6 = G((int) f6, (int) f7);
        if (G6 != -1) {
            this.f9529Q.getItemId(G6);
            if (getChildAt(G6 - this.f9578a) != null) {
                this.f9568w0 = new Object();
                return super.showContextMenuForChild(this);
            }
        }
        return N(f6, f7, i2);
    }

    public final void O(int i2) {
        int i5;
        if (this.f9562p0 == null) {
            this.f9562p0 = new C0166e1(this);
        }
        int i6 = this.f9578a;
        int childCount = getChildCount();
        int i7 = i6 + childCount;
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        if (i2 == 0 || this.f9592y == 0 || childCount == 0 || ((i6 == 0 && getChildAt(0).getLeft() == paddingLeft && i2 < 0) || (i7 == this.f9592y && getChildAt(childCount - 1).getRight() == width && i2 > 0))) {
            this.f9562p0.a();
            return;
        }
        C0166e1 e1Var = this.f9562p0;
        e1Var.getClass();
        if (i2 < 0) {
            i5 = f.API_PRIORITY_OTHER;
        } else {
            i5 = 0;
        }
        e1Var.f3285b = i5;
        u uVar = (u) e1Var.f3286c;
        uVar.d = null;
        uVar.f9644a = 0;
        t tVar = uVar.f9645b;
        tVar.f9638k = false;
        tVar.f9631a = i5;
        tVar.f9633c = i5 + i2;
        tVar.g = AnimationUtils.currentAnimationTimeMillis();
        tVar.h = 200;
        tVar.f9635f = 0.0f;
        tVar.d = 0;
        t tVar2 = uVar.f9646c;
        tVar2.f9638k = false;
        tVar2.f9631a = 0;
        tVar2.f9633c = 0;
        tVar2.g = AnimationUtils.currentAnimationTimeMillis();
        tVar2.h = 200;
        tVar2.f9635f = 0.0f;
        tVar2.d = 0;
        C0773j jVar = (C0773j) e1Var.f3287e;
        jVar.f9558l0 = 4;
        jVar.f9513H.p(e1Var);
    }

    public final boolean P(int i2) {
        boolean z3;
        int i5;
        int i6 = i2 - this.f9556j0;
        int abs = Math.abs(i6);
        if (getScrollX() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 && abs <= this.f9512G0) {
            return false;
        }
        v();
        if (z3) {
            this.f9558l0 = 5;
            this.f9560n0 = 0;
        } else {
            this.f9558l0 = 3;
            if (i6 > 0) {
                i5 = this.f9512G0;
            } else {
                i5 = -this.f9512G0;
            }
            this.f9560n0 = i5;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f9570y0);
        }
        setPressed(false);
        View childAt = getChildAt(this.f9555i0 - this.f9578a);
        if (childAt != null) {
            childAt.setPressed(false);
        }
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        M(i2);
        return true;
    }

    public final boolean Q(int i2, int i5) {
        int i6;
        boolean z3;
        boolean z4;
        boolean z5;
        int i7;
        int i8;
        boolean z6;
        int i9;
        int i10;
        int i11;
        int i12 = i2;
        int i13 = i5;
        int childCount = getChildCount();
        if (childCount == 0) {
            return true;
        }
        int left = getChildAt(0).getLeft();
        int i14 = childCount - 1;
        int right = getChildAt(i14).getRight();
        int i15 = 0 - left;
        int width = right - getWidth();
        int width2 = (getWidth() - getPaddingRight()) - getPaddingLeft();
        if (i12 < 0) {
            Math.max(-(width2 - 1), i12);
        } else {
            Math.min(width2 - 1, i12);
        }
        if (i13 < 0) {
            i6 = Math.max(-(width2 - 1), i13);
        } else {
            i6 = Math.min(width2 - 1, i13);
        }
        int i16 = this.f9578a;
        Rect rect = this.f9551e0;
        if (i16 == 0) {
            this.f9532R0 = left - rect.left;
        } else {
            this.f9532R0 += i6;
        }
        int i17 = i16 + childCount;
        int i18 = this.f9592y;
        if (i17 == i18) {
            this.f9534S0 = rect.right + right;
        } else {
            this.f9534S0 += i6;
        }
        if (i16 != 0 || left < rect.left || i6 < 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (i17 != i18 || right > getWidth() - rect.right || i6 > 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z3 && !z4) {
            if (i6 < 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean isInTouchMode = isInTouchMode();
            if (isInTouchMode) {
                y();
            }
            int headerViewsCount = getHeaderViewsCount();
            int footerViewsCount = this.f9592y - getFooterViewsCount();
            C0770g gVar = this.f9541W;
            if (z5) {
                int i19 = -i6;
                i7 = 0;
                for (int i20 = 0; i20 < childCount; i20++) {
                    View childAt = getChildAt(i20);
                    if (childAt.getRight() >= i19) {
                        break;
                    }
                    i7++;
                    int i21 = i16 + i20;
                    if (i21 >= headerViewsCount && i21 < footerViewsCount) {
                        gVar.a(childAt, i21);
                    }
                }
                z6 = true;
                i8 = 0;
            } else {
                int width3 = getWidth() - i6;
                i8 = 0;
                int i22 = 0;
                while (i14 >= 0) {
                    View childAt2 = getChildAt(i14);
                    if (childAt2.getLeft() <= width3) {
                        break;
                    }
                    i22 = i7 + 1;
                    int i23 = i16 + i14;
                    if (i23 >= headerViewsCount && i23 < footerViewsCount) {
                        gVar.a(childAt2, i23);
                    }
                    int i24 = i14;
                    i14--;
                    i8 = i24;
                }
                z6 = true;
            }
            this.f9577G = z6;
            if (i7 > 0) {
                detachViewsFromParent(i8, i7);
                gVar.j();
            }
            if (!awakenScrollBars()) {
                invalidate();
            }
            C(i6);
            if (z5) {
                this.f9578a += i7;
            }
            int abs = Math.abs(i6);
            if (i15 < abs || width < abs) {
                HListView hListView = (HListView) this;
                int childCount2 = hListView.getChildCount();
                if (z5) {
                    if (childCount2 > 0) {
                        i11 = hListView.getChildAt(childCount2 - 1).getRight() + hListView.g1;
                    } else {
                        i11 = 0;
                    }
                    hListView.g0(hListView.f9578a + childCount2, i11);
                    hListView.Y(hListView.getChildCount());
                } else {
                    if (childCount2 > 0) {
                        i10 = hListView.getChildAt(0).getLeft() - hListView.g1;
                    } else {
                        i10 = hListView.getWidth();
                    }
                    hListView.f0(hListView.f9578a - 1, i10);
                    hListView.X(hListView.getChildCount());
                }
            }
            if (isInTouchMode || (i9 = this.f9589v) == -1) {
                int i25 = this.f9537U;
                if (i25 != -1) {
                    int i26 = i25 - this.f9578a;
                    if (i26 >= 0 && i26 < getChildCount()) {
                        H(getChildAt(i26), -1);
                    }
                } else {
                    this.f9539V.setEmpty();
                }
            } else {
                int i27 = i9 - this.f9578a;
                if (i27 >= 0 && i27 < getChildCount()) {
                    H(getChildAt(i27), this.f9589v);
                }
            }
            this.f9577G = false;
            onScrollChanged(0, 0, 0, 0);
            return false;
        } else if (i6 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public final void R() {
        int i2;
        if (this.f9535T == null) {
            return;
        }
        if ((hasFocus() && !isInTouchMode()) || (i2 = this.f9558l0) == 1 || i2 == 2) {
            this.f9535T.setState(getDrawableState());
        } else {
            this.f9535T.setState(f9505c1);
        }
    }

    public final void addTouchables(ArrayList arrayList) {
        int childCount = getChildCount();
        int i2 = this.f9578a;
        ListAdapter listAdapter = this.f9529Q;
        if (listAdapter != null) {
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (listAdapter.isEnabled(i2 + i5)) {
                    arrayList.add(childAt);
                }
                childAt.addTouchables(arrayList);
            }
        }
    }

    public final boolean checkInputConnectionProxy(View view) {
        return false;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0767d;
    }

    public final int computeHorizontalScrollExtent() {
        int childCount = getChildCount();
        if (childCount <= 0) {
            return 0;
        }
        if (!this.f9565t0) {
            return 1;
        }
        int i2 = childCount * 100;
        View childAt = getChildAt(0);
        int left = childAt.getLeft();
        int width = childAt.getWidth();
        if (width > 0) {
            i2 = C0552a.h(left, 100, width, i2);
        }
        View childAt2 = getChildAt(childCount - 1);
        int right = childAt2.getRight();
        int width2 = childAt2.getWidth();
        if (width2 > 0) {
            return i2 - (((right - getWidth()) * 100) / width2);
        }
        return i2;
    }

    public final int computeHorizontalScrollOffset() {
        int i2 = this.f9578a;
        int childCount = getChildCount();
        int i5 = 0;
        if (i2 >= 0 && childCount > 0) {
            if (this.f9565t0) {
                View childAt = getChildAt(0);
                int left = childAt.getLeft();
                int width = childAt.getWidth();
                if (width > 0) {
                    return Math.max(((i2 * 100) - ((left * 100) / width)) + ((int) ((((float) getScrollX()) / ((float) getWidth())) * ((float) this.f9592y) * 100.0f)), 0);
                }
            } else {
                int i6 = this.f9592y;
                if (i2 != 0) {
                    if (i2 + childCount == i6) {
                        i5 = i6;
                    } else {
                        i5 = (childCount / 2) + i2;
                    }
                }
                return (int) (((((float) i5) / ((float) i6)) * ((float) childCount)) + ((float) i2));
            }
        }
        return 0;
    }

    public final int computeHorizontalScrollRange() {
        if (!this.f9565t0) {
            return this.f9592y;
        }
        int max = Math.max(this.f9592y * 100, 0);
        if (getScrollX() != 0) {
            return max + Math.abs((int) ((((float) getScrollX()) / ((float) getWidth())) * ((float) this.f9592y) * 100.0f));
        }
        return max;
    }

    public void dispatchDraw(Canvas canvas) {
        boolean z3 = this.f9533S;
        if (!z3) {
            Rect rect = this.f9539V;
            if (!rect.isEmpty()) {
                Drawable drawable = this.f9535T;
                drawable.setBounds(rect);
                drawable.draw(canvas);
            }
        }
        super.dispatchDraw(canvas);
        if (z3) {
            Rect rect2 = this.f9539V;
            if (!rect2.isEmpty()) {
                Drawable drawable2 = this.f9535T;
                drawable2.setBounds(rect2);
                drawable2.draw(canvas);
            }
        }
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f9528P0 != null) {
            int scrollX = getScrollX();
            boolean c3 = this.f9528P0.c();
            Rect rect = this.f9551e0;
            if (!c3) {
                int save = canvas.save();
                int i2 = rect.top;
                int height = (getHeight() - i2) - rect.bottom;
                int min = Math.min(0, this.f9532R0 + scrollX);
                canvas.rotate(-90.0f);
                canvas.translate((float) ((-getHeight()) + i2), (float) min);
                p pVar = this.f9528P0;
                pVar.d = height;
                if (pVar.a(canvas)) {
                    p pVar2 = this.f9528P0;
                    pVar2.f9599e = min;
                    pVar2.f9600f = i2;
                    invalidate();
                }
                canvas.restoreToCount(save);
            }
            if (!this.f9530Q0.c()) {
                int save2 = canvas.save();
                int i5 = rect.left;
                int height2 = (getHeight() - i5) - rect.right;
                int max = Math.max(getWidth(), scrollX + this.f9534S0);
                canvas.rotate(90.0f);
                canvas.translate((float) (-i5), (float) (-max));
                p pVar3 = this.f9530Q0;
                pVar3.d = height2;
                if (pVar3.a(canvas)) {
                    invalidate();
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        R();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [k5.d, android.view.ViewGroup$LayoutParams] */
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ? layoutParams = new ViewGroup.LayoutParams(-2, -1);
        layoutParams.f9487a = 0;
        return layoutParams;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.LayoutParams(layoutParams);
    }

    @ViewDebug.ExportedProperty(category = "drawing")
    public int getCacheColorHint() {
        return this.f9510E0;
    }

    public int getCheckedItemCount() {
        return this.f9521L;
    }

    public long[] getCheckedItemIds() {
        g gVar;
        if (this.f9515I == 0 || (gVar = this.f9524N) == null || this.f9529Q == null) {
            return new long[0];
        }
        int e6 = gVar.e();
        long[] jArr = new long[e6];
        for (int i2 = 0; i2 < e6; i2++) {
            jArr[i2] = gVar.c(i2);
        }
        return jArr;
    }

    public int getCheckedItemPosition() {
        k kVar;
        if (this.f9515I == 1 && (kVar = this.f9522M) != null && kVar.h() == 1) {
            return this.f9522M.f(0);
        }
        return -1;
    }

    public k getCheckedItemPositions() {
        if (this.f9515I != 0) {
            return this.f9522M;
        }
        return null;
    }

    public int getChoiceMode() {
        return this.f9515I;
    }

    public ContextMenu.ContextMenuInfo getContextMenuInfo() {
        return this.f9568w0;
    }

    public final void getFocusedRect(Rect rect) {
        View selectedView = getSelectedView();
        if (selectedView == null || selectedView.getParent() != this) {
            super.getFocusedRect(rect);
            return;
        }
        selectedView.getFocusedRect(rect);
        offsetDescendantRectToMyCoords(selectedView, rect);
    }

    public int getFooterViewsCount() {
        return 0;
    }

    public int getHeaderViewsCount() {
        return 0;
    }

    public float getHorizontalScrollFactor() {
        if (this.f9548b1 == 0.0f) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.hlv_listPreferredItemWidth, typedValue, true)) {
                this.f9548b1 = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define hlv_listPreferredItemWidth.");
            }
        }
        return this.f9548b1;
    }

    public int getHorizontalScrollbarHeight() {
        return super.getHorizontalScrollbarHeight();
    }

    public float getLeftFadingEdgeStrength() {
        int childCount = getChildCount();
        float leftFadingEdgeStrength = super.getLeftFadingEdgeStrength();
        if (childCount == 0) {
            return leftFadingEdgeStrength;
        }
        if (this.f9578a > 0) {
            return 1.0f;
        }
        int left = getChildAt(0).getLeft();
        float horizontalFadingEdgeLength = (float) getHorizontalFadingEdgeLength();
        if (left < getPaddingLeft()) {
            return ((float) (-(left - getPaddingLeft()))) / horizontalFadingEdgeLength;
        }
        return leftFadingEdgeStrength;
    }

    public int getListPaddingBottom() {
        return this.f9551e0.bottom;
    }

    public int getListPaddingLeft() {
        return this.f9551e0.left;
    }

    public int getListPaddingRight() {
        return this.f9551e0.right;
    }

    public int getListPaddingTop() {
        return this.f9551e0.top;
    }

    public float getRightFadingEdgeStrength() {
        int childCount = getChildCount();
        float rightFadingEdgeStrength = super.getRightFadingEdgeStrength();
        if (childCount == 0) {
            return rightFadingEdgeStrength;
        }
        if ((this.f9578a + childCount) - 1 < this.f9592y - 1) {
            return 1.0f;
        }
        int right = getChildAt(childCount - 1).getRight();
        int width = getWidth();
        float horizontalFadingEdgeLength = (float) getHorizontalFadingEdgeLength();
        if (right <= width - getPaddingRight()) {
            return rightFadingEdgeStrength;
        }
        return ((float) (getPaddingRight() + (right - width))) / horizontalFadingEdgeLength;
    }

    @ViewDebug.ExportedProperty
    public View getSelectedView() {
        int i2;
        if (this.f9592y <= 0 || (i2 = this.f9589v) < 0) {
            return null;
        }
        return getChildAt(i2 - this.f9578a);
    }

    public Drawable getSelector() {
        return this.f9535T;
    }

    public int getSolidColor() {
        return this.f9510E0;
    }

    public int getTranscriptMode() {
        return this.f9509D0;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f9535T;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (this.f9529Q != null && this.f9527P == null) {
            C0765b bVar = new C0765b(this);
            this.f9527P = bVar;
            this.f9529Q.registerDataSetObserver(bVar);
            this.f9586s = true;
            this.f9593z = this.f9592y;
            this.f9592y = this.f9529Q.getCount();
        }
        this.f9543Y0 = true;
    }

    public final int[] onCreateDrawableState(int i2) {
        if (this.f9511F0) {
            return super.onCreateDrawableState(i2);
        }
        int i5 = ViewGroup.ENABLED_STATE_SET[0];
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        int length = onCreateDrawableState.length - 1;
        while (true) {
            if (length < 0) {
                length = -1;
                break;
            } else if (onCreateDrawableState[length] == i5) {
                break;
            } else {
                length--;
            }
        }
        if (length >= 0) {
            System.arraycopy(onCreateDrawableState, length + 1, onCreateDrawableState, length, (onCreateDrawableState.length - length) - 1);
        }
        return onCreateDrawableState;
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return null;
    }

    public final void onDetachedFromWindow() {
        C0765b bVar;
        super.onDetachedFromWindow();
        this.f9541W.c();
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        ListAdapter listAdapter = this.f9529Q;
        if (!(listAdapter == null || (bVar = this.f9527P) == null)) {
            listAdapter.unregisterDataSetObserver(bVar);
            this.f9527P = null;
        }
        C0166e1 e1Var = this.f9562p0;
        if (e1Var != null) {
            removeCallbacks(e1Var);
        }
        C0764a aVar = this.f9514H0;
        if (aVar != null) {
            removeCallbacks(aVar);
        }
        C0769f fVar = this.f9507B0;
        if (fVar != null) {
            removeCallbacks(fVar);
        }
        j jVar = this.f9508C0;
        if (jVar != null) {
            removeCallbacks(jVar);
            this.f9508C0 = null;
        }
        this.f9543Y0 = false;
    }

    public void onFocusChanged(boolean z3, int i2, Rect rect) {
        ListAdapter listAdapter;
        super.onFocusChanged(z3, i2, rect);
        if (z3 && this.f9589v < 0 && !isInTouchMode()) {
            if (!this.f9543Y0 && (listAdapter = this.f9529Q) != null) {
                this.f9586s = true;
                this.f9593z = this.f9592y;
                this.f9592y = listAdapter.getCount();
            }
            J();
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && this.f9558l0 == -1) {
            float axisValue = motionEvent.getAxisValue(10);
            if (axisValue != 0.0f) {
                int horizontalScrollFactor = (int) (getHorizontalScrollFactor() * axisValue);
                if (!Q(horizontalScrollFactor, horizontalScrollFactor)) {
                    return true;
                }
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(C0773j.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C0773j.class.getName());
        if (isEnabled()) {
            if (getFirstVisiblePosition() > 0) {
                accessibilityNodeInfo.addAction(8192);
            }
            if (getLastVisiblePosition() < getCount() - 1) {
                accessibilityNodeInfo.addAction(4096);
            }
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (!this.f9543Y0) {
            return false;
        }
        int i2 = action & 255;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 6) {
                            D(motionEvent);
                        }
                    }
                } else if (this.f9558l0 == 0) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f9523M0);
                    if (findPointerIndex == -1) {
                        this.f9523M0 = motionEvent.getPointerId(0);
                        findPointerIndex = 0;
                    }
                    int x6 = (int) motionEvent.getX(findPointerIndex);
                    if (this.f9561o0 == null) {
                        this.f9561o0 = VelocityTracker.obtain();
                    }
                    this.f9561o0.addMovement(motionEvent);
                    if (P(x6)) {
                        return true;
                    }
                }
            }
            this.f9558l0 = -1;
            this.f9523M0 = -1;
            VelocityTracker velocityTracker = this.f9561o0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f9561o0 = null;
            }
        } else {
            int i5 = this.f9558l0;
            if (i5 == 6 || i5 == 5) {
                this.f9560n0 = 0;
                return true;
            }
            int x7 = (int) motionEvent.getX();
            int y6 = (int) motionEvent.getY();
            this.f9523M0 = motionEvent.getPointerId(0);
            int w6 = w(x7);
            if (i5 != 4 && w6 >= 0) {
                getChildAt(w6 - this.f9578a).getLeft();
                this.f9556j0 = x7;
                this.f9557k0 = y6;
                this.f9555i0 = w6;
                this.f9558l0 = 0;
                t();
            }
            this.f9559m0 = Integer.MIN_VALUE;
            VelocityTracker velocityTracker2 = this.f9561o0;
            if (velocityTracker2 == null) {
                this.f9561o0 = VelocityTracker.obtain();
            } else {
                velocityTracker2.clear();
            }
            this.f9561o0.addMovement(motionEvent);
            if (i5 == 4) {
                return true;
            }
        }
        return false;
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        int i5;
        ListAdapter listAdapter;
        if (i2 == 23 || i2 == 66) {
            if (!isEnabled()) {
                return true;
            }
            if (isClickable() && isPressed() && (i5 = this.f9589v) >= 0 && (listAdapter = this.f9529Q) != null && i5 < listAdapter.getCount()) {
                View childAt = getChildAt(this.f9589v - this.f9578a);
                if (childAt != null) {
                    E(this.f9589v, this.f9590w);
                    childAt.setPressed(false);
                }
                setPressed(false);
                return true;
            }
        }
        return super.onKeyUp(i2, keyEvent);
    }

    public final void onLayout(boolean z3, int i2, int i5, int i6, int i7) {
        super.onLayout(z3, i2, i5, i6, i7);
        this.f9585r = true;
        if (z3) {
            int childCount = getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                getChildAt(i8).forceLayout();
            }
            C0770g gVar = this.f9541W;
            int i9 = gVar.d;
            if (i9 == 1) {
                ArrayList arrayList = gVar.f9491a;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((View) arrayList.get(i10)).forceLayout();
                }
            } else {
                for (int i11 = 0; i11 < i9; i11++) {
                    ArrayList arrayList2 = ((ArrayList[]) gVar.f9495f)[i11];
                    int size2 = arrayList2.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        ((View) arrayList2.get(i12)).forceLayout();
                    }
                }
            }
            k kVar = (k) gVar.g;
            if (kVar != null) {
                int h = kVar.h();
                for (int i13 = 0; i13 < h; i13++) {
                    ((View) ((k) gVar.g).i(i13)).forceLayout();
                }
            }
        }
        A();
        this.f9585r = false;
    }

    public void onMeasure(int i2, int i5) {
        int i6;
        if (this.f9535T == null) {
            setSelector(getResources().getDrawable(17301602));
        }
        int paddingLeft = getPaddingLeft() + this.f9545a0;
        Rect rect = this.f9551e0;
        rect.left = paddingLeft;
        rect.top = getPaddingTop() + this.f9547b0;
        rect.right = getPaddingRight() + this.f9549c0;
        rect.bottom = getPaddingBottom() + this.f9550d0;
        boolean z3 = true;
        if (this.f9509D0 == 1) {
            int childCount = getChildCount();
            int width = getWidth() - getPaddingRight();
            View childAt = getChildAt(childCount - 1);
            if (childAt != null) {
                i6 = childAt.getRight();
            } else {
                i6 = width;
            }
            if (this.f9578a + childCount < this.f9544Z0 || i6 > width) {
                z3 = false;
            }
            this.f9538U0 = z3;
        }
    }

    public final void onOverScrolled(int i2, int i5, boolean z3, boolean z4) {
        if (getScrollX() != i2) {
            onScrollChanged(i2, getScrollY(), getScrollX(), getScrollY());
            ((C0773j) this.f9513H.f398a).setScrollX(i2);
            z();
            awakenScrollBars();
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        C0570b bVar;
        C0772i iVar = (C0772i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        this.f9586s = true;
        this.f9581e = (long) iVar.f9499e;
        long j6 = iVar.f9496a;
        if (j6 >= 0) {
            this.f9582f = true;
            this.f9546a1 = iVar;
            this.d = j6;
            this.f9580c = iVar.d;
            this.f9579b = iVar.f9498c;
            this.f9583p = 0;
        } else if (iVar.f9497b >= 0) {
            setSelectedPositionInt(-1);
            setNextSelectedPositionInt(-1);
            this.f9537U = -1;
            this.f9582f = true;
            this.f9546a1 = iVar;
            this.d = iVar.f9497b;
            this.f9580c = iVar.d;
            this.f9579b = iVar.f9498c;
            this.f9583p = 1;
        }
        k kVar = iVar.f9503r;
        if (kVar != null) {
            this.f9522M = kVar;
        }
        g gVar = iVar.f9504s;
        if (gVar != null) {
            this.f9524N = gVar;
        }
        this.f9521L = iVar.f9502q;
        if (iVar.f9501p && this.f9515I == 3 && (bVar = this.f9519K) != null) {
            this.f9517J = startActionMode(bVar);
        }
        requestLayout();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, k5.i] */
    public final Parcelable onSaveInstanceState() {
        boolean z3;
        ? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        C0772i iVar = this.f9546a1;
        if (iVar != null) {
            baseSavedState.f9496a = iVar.f9496a;
            baseSavedState.f9497b = iVar.f9497b;
            baseSavedState.f9498c = iVar.f9498c;
            baseSavedState.d = iVar.d;
            baseSavedState.f9499e = iVar.f9499e;
            baseSavedState.f9500f = iVar.f9500f;
            baseSavedState.f9501p = iVar.f9501p;
            baseSavedState.f9502q = iVar.f9502q;
            baseSavedState.f9503r = iVar.f9503r;
            baseSavedState.f9504s = iVar.f9504s;
            return baseSavedState;
        }
        boolean z4 = true;
        if (getChildCount() <= 0 || this.f9592y <= 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        long selectedItemId = getSelectedItemId();
        baseSavedState.f9496a = selectedItemId;
        baseSavedState.f9499e = getWidth();
        if (selectedItemId >= 0) {
            baseSavedState.f9498c = this.f9563q0;
            baseSavedState.d = getSelectedItemPosition();
            baseSavedState.f9497b = -1;
        } else if (!z3 || this.f9578a <= 0) {
            baseSavedState.f9498c = 0;
            baseSavedState.f9497b = -1;
            baseSavedState.d = 0;
        } else {
            baseSavedState.f9498c = getChildAt(0).getLeft();
            int i2 = this.f9578a;
            int i5 = this.f9592y;
            if (i2 >= i5) {
                i2 = i5 - 1;
            }
            baseSavedState.d = i2;
            baseSavedState.f9497b = this.f9529Q.getItemId(i2);
        }
        baseSavedState.f9500f = null;
        if (this.f9515I != 3 || this.f9517J == null) {
            z4 = false;
        }
        baseSavedState.f9501p = z4;
        k kVar = this.f9522M;
        if (kVar != null) {
            try {
                baseSavedState.f9503r = kVar.clone();
            } catch (NoSuchMethodError e6) {
                e6.printStackTrace();
                baseSavedState.f9503r = new k();
            }
        }
        if (this.f9524N != null) {
            g gVar = new g();
            int e7 = this.f9524N.e();
            for (int i6 = 0; i6 < e7; i6++) {
                gVar.d(this.f9524N.f(i6), this.f9524N.c(i6));
            }
            baseSavedState.f9504s = gVar;
        }
        baseSavedState.f9502q = this.f9521L;
        return baseSavedState;
    }

    public void onSizeChanged(int i2, int i5, int i6, int i7) {
        if (getChildCount() > 0) {
            this.f9586s = true;
            f();
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        Drawable current;
        Runnable runnable;
        int i2;
        MotionEvent motionEvent2 = motionEvent;
        int i5 = 0;
        if (!isEnabled()) {
            if (isClickable() || isLongClickable()) {
                return true;
            }
            return false;
        } else if (!this.f9543Y0) {
            return false;
        } else {
            int action = motionEvent.getAction();
            if (this.f9561o0 == null) {
                this.f9561o0 = VelocityTracker.obtain();
            }
            this.f9561o0.addMovement(motionEvent2);
            int i6 = action & 255;
            if (i6 == 0) {
                if (this.f9558l0 != 6) {
                    this.f9523M0 = motionEvent2.getPointerId(0);
                    int x6 = (int) motionEvent.getX();
                    int y6 = (int) motionEvent.getY();
                    int G6 = G(x6, y6);
                    if (!this.f9586s) {
                        if (this.f9558l0 != 4 && G6 >= 0 && ((ListAdapter) getAdapter()).isEnabled(G6)) {
                            this.f9558l0 = 0;
                            if (this.f9571z0 == null) {
                                this.f9571z0 = new C0764a(this, 1);
                            }
                            postDelayed(this.f9571z0, (long) ViewConfiguration.getTapTimeout());
                        } else if (this.f9558l0 == 4) {
                            v();
                            this.f9558l0 = 3;
                            this.f9560n0 = 0;
                            G6 = w(x6);
                            C0166e1 e1Var = this.f9562p0;
                            ((C0773j) e1Var.f3287e).postDelayed((C0737s0) e1Var.d, 40);
                        }
                    }
                    if (G6 >= 0) {
                        getChildAt(G6 - this.f9578a).getLeft();
                    }
                    this.f9556j0 = x6;
                    this.f9557k0 = y6;
                    this.f9555i0 = G6;
                    this.f9559m0 = Integer.MIN_VALUE;
                } else {
                    this.f9562p0.a();
                    this.f9558l0 = 5;
                    this.f9557k0 = (int) motionEvent.getY();
                    int x7 = (int) motionEvent.getX();
                    this.f9559m0 = x7;
                    this.f9556j0 = x7;
                    this.f9560n0 = 0;
                    this.f9523M0 = motionEvent2.getPointerId(0);
                    this.f9536T0 = 0;
                }
                if ((motionEvent.getButtonState() & 2) != 0 && N(motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState()) && this.f9558l0 == 0) {
                    removeCallbacks(this.f9571z0);
                }
            } else if (i6 == 1) {
                int i7 = this.f9558l0;
                Rect rect = this.f9551e0;
                if (i7 == 0 || i7 == 1 || i7 == 2) {
                    int i8 = this.f9555i0;
                    View childAt = getChildAt(i8 - this.f9578a);
                    float x8 = motionEvent.getX();
                    if (x8 <= ((float) rect.left) || x8 >= ((float) (getWidth() - rect.right))) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (childAt != null && !childAt.hasFocusable() && z3) {
                        if (this.f9558l0 != 0) {
                            childAt.setPressed(false);
                        }
                        if (this.f9507B0 == null) {
                            this.f9507B0 = new C0769f(this);
                        }
                        C0769f fVar = this.f9507B0;
                        fVar.f9490c = i8;
                        fVar.f617a = ((C0773j) fVar.f618b).getWindowAttachCount();
                        this.f9567v0 = i8;
                        int i9 = this.f9558l0;
                        if (i9 == 0 || i9 == 1) {
                            Handler handler = getHandler();
                            if (handler != null) {
                                if (this.f9558l0 == 0) {
                                    runnable = this.f9571z0;
                                } else {
                                    runnable = this.f9570y0;
                                }
                                handler.removeCallbacks(runnable);
                            }
                            this.f9526O = 0;
                            if (this.f9586s || !this.f9529Q.isEnabled(i8)) {
                                this.f9558l0 = -1;
                                R();
                            } else {
                                this.f9558l0 = 1;
                                setSelectedPositionInt(this.f9555i0);
                                A();
                                childAt.setPressed(true);
                                H(childAt, this.f9555i0);
                                setPressed(true);
                                Drawable drawable = this.f9535T;
                                if (!(drawable == null || (current = drawable.getCurrent()) == null || !(current instanceof TransitionDrawable))) {
                                    ((TransitionDrawable) current).resetTransition();
                                }
                                j jVar = this.f9508C0;
                                if (jVar != null) {
                                    removeCallbacks(jVar);
                                }
                                j jVar2 = new j(this, childAt, fVar, 17, false);
                                this.f9508C0 = jVar2;
                                postDelayed(jVar2, (long) ViewConfiguration.getPressedStateDuration());
                            }
                            return true;
                        } else if (!this.f9586s && this.f9529Q.isEnabled(i8)) {
                            fVar.run();
                        }
                    }
                    this.f9558l0 = -1;
                    R();
                } else if (i7 == 3) {
                    int childCount = getChildCount();
                    if (childCount > 0) {
                        int left = getChildAt(0).getLeft();
                        int right = getChildAt(childCount - 1).getRight();
                        int i10 = rect.left;
                        int width = getWidth() - rect.right;
                        int i11 = this.f9578a;
                        if (i11 != 0 || left < i10 || i11 + childCount >= this.f9592y || right > getWidth() - width) {
                            VelocityTracker velocityTracker = this.f9561o0;
                            velocityTracker.computeCurrentVelocity(1000, (float) this.f9518J0);
                            int xVelocity = (int) (velocityTracker.getXVelocity(this.f9523M0) * this.f9520K0);
                            if (Math.abs(xVelocity) <= this.f9516I0 || (((i2 = this.f9578a) == 0 && left == i10 - this.f9525N0) || (i2 + childCount == this.f9592y && right == width + this.f9525N0))) {
                                this.f9558l0 = -1;
                                C0166e1 e1Var2 = this.f9562p0;
                                if (e1Var2 != null) {
                                    e1Var2.a();
                                }
                            } else {
                                if (this.f9562p0 == null) {
                                    this.f9562p0 = new C0166e1(this);
                                }
                                this.f9562p0.b(-xVelocity);
                            }
                        } else {
                            this.f9558l0 = -1;
                        }
                    } else {
                        this.f9558l0 = -1;
                    }
                } else if (i7 == 5) {
                    if (this.f9562p0 == null) {
                        this.f9562p0 = new C0166e1(this);
                    }
                    VelocityTracker velocityTracker2 = this.f9561o0;
                    velocityTracker2.computeCurrentVelocity(1000, (float) this.f9518J0);
                    int xVelocity2 = (int) velocityTracker2.getXVelocity(this.f9523M0);
                    if (Math.abs(xVelocity2) > this.f9516I0) {
                        C0166e1 e1Var3 = this.f9562p0;
                        int i12 = -xVelocity2;
                        u uVar = (u) e1Var3.f3286c;
                        uVar.d = null;
                        C0773j jVar3 = (C0773j) e1Var3.f3287e;
                        uVar.b(jVar3.getScrollX(), i12, Integer.MIN_VALUE, 0, jVar3.getWidth());
                        jVar3.f9558l0 = 6;
                        jVar3.invalidate();
                        jVar3.f9513H.p(e1Var3);
                    } else {
                        this.f9562p0.c();
                    }
                }
                setPressed(false);
                p pVar = this.f9528P0;
                if (pVar != null) {
                    pVar.f();
                    this.f9530Q0.f();
                }
                invalidate();
                Handler handler2 = getHandler();
                if (handler2 != null) {
                    handler2.removeCallbacks(this.f9570y0);
                }
                VelocityTracker velocityTracker3 = this.f9561o0;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f9561o0 = null;
                }
                this.f9523M0 = -1;
            } else if (i6 == 2) {
                int findPointerIndex = motionEvent2.findPointerIndex(this.f9523M0);
                if (findPointerIndex == -1) {
                    this.f9523M0 = motionEvent2.getPointerId(0);
                } else {
                    i5 = findPointerIndex;
                }
                int x9 = (int) motionEvent2.getX(i5);
                if (this.f9586s) {
                    A();
                }
                int i13 = this.f9558l0;
                if (i13 == 0 || i13 == 1 || i13 == 2) {
                    P(x9);
                } else if (i13 == 3 || i13 == 5) {
                    M(x9);
                }
            } else if (i6 == 3) {
                int i14 = this.f9558l0;
                if (i14 == 5) {
                    if (this.f9562p0 == null) {
                        this.f9562p0 = new C0166e1(this);
                    }
                    this.f9562p0.c();
                } else if (i14 != 6) {
                    this.f9558l0 = -1;
                    setPressed(false);
                    View childAt2 = getChildAt(this.f9555i0 - this.f9578a);
                    if (childAt2 != null) {
                        childAt2.setPressed(false);
                    }
                    t();
                    Handler handler3 = getHandler();
                    if (handler3 != null) {
                        handler3.removeCallbacks(this.f9570y0);
                    }
                    VelocityTracker velocityTracker4 = this.f9561o0;
                    if (velocityTracker4 != null) {
                        velocityTracker4.recycle();
                        this.f9561o0 = null;
                    }
                }
                p pVar2 = this.f9528P0;
                if (pVar2 != null) {
                    pVar2.f();
                    this.f9530Q0.f();
                }
                this.f9523M0 = -1;
            } else if (i6 == 5) {
                int actionIndex = motionEvent.getActionIndex();
                int pointerId = motionEvent2.getPointerId(actionIndex);
                int x10 = (int) motionEvent2.getX(actionIndex);
                int y7 = (int) motionEvent2.getY(actionIndex);
                this.f9560n0 = 0;
                this.f9523M0 = pointerId;
                this.f9556j0 = x10;
                this.f9557k0 = y7;
                int G7 = G(x10, y7);
                if (G7 >= 0) {
                    getChildAt(G7 - this.f9578a).getLeft();
                    this.f9555i0 = G7;
                }
                this.f9559m0 = x10;
            } else if (i6 == 6) {
                D(motionEvent);
                int i15 = this.f9556j0;
                int G8 = G(i15, this.f9557k0);
                if (G8 >= 0) {
                    getChildAt(G8 - this.f9578a).getLeft();
                    this.f9555i0 = G8;
                }
                this.f9559m0 = i15;
            }
            return true;
        }
    }

    public final void onTouchModeChanged(boolean z3) {
        if (z3) {
            y();
            if (getWidth() > 0 && getChildCount() > 0) {
                A();
            }
            R();
            return;
        }
        int i2 = this.f9558l0;
        if (i2 == 5 || i2 == 6) {
            C0166e1 e1Var = this.f9562p0;
            if (e1Var != null) {
                e1Var.a();
            }
            if (getScrollX() != 0) {
                ((C0773j) this.f9513H.f398a).setScrollX(0);
                p pVar = this.f9528P0;
                if (pVar != null) {
                    pVar.f9614v = 0;
                    this.f9530Q0.f9614v = 0;
                }
                invalidate();
            }
        }
    }

    public final void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        boolean z4 = !isInTouchMode();
        if (!z3) {
            setChildrenDrawingCacheEnabled(false);
            C0166e1 e1Var = this.f9562p0;
            if (e1Var != null) {
                removeCallbacks(e1Var);
                this.f9562p0.a();
                if (getScrollX() != 0) {
                    ((C0773j) this.f9513H.f398a).setScrollX(0);
                    p pVar = this.f9528P0;
                    if (pVar != null) {
                        pVar.f9614v = 0;
                        this.f9530Q0.f9614v = 0;
                    }
                    invalidate();
                }
            }
            if (z4) {
                this.f9567v0 = this.f9589v;
            }
        } else {
            int i2 = this.f9569x0;
            if (!(z4 == i2 || i2 == -1)) {
                if (z4) {
                    J();
                } else {
                    y();
                    this.f9526O = 0;
                    A();
                }
            }
        }
        this.f9569x0 = z4 ? 1 : 0;
    }

    public final boolean performAccessibilityAction(int i2, Bundle bundle) {
        if (super.performAccessibilityAction(i2, bundle)) {
            return true;
        }
        Rect rect = this.f9551e0;
        if (i2 != 4096) {
            if (i2 != 8192 || !isEnabled() || this.f9578a <= 0) {
                return false;
            }
            O(-((getWidth() - rect.left) - rect.right));
            return true;
        } else if (!isEnabled() || getLastVisiblePosition() >= getCount() - 1) {
            return false;
        } else {
            O((getWidth() - rect.left) - rect.right);
            return true;
        }
    }

    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        VelocityTracker velocityTracker;
        if (z3 && (velocityTracker = this.f9561o0) != null) {
            velocityTracker.recycle();
            this.f9561o0 = null;
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    public final void requestLayout() {
        if (!this.f9577G && !this.f9585r) {
            super.requestLayout();
        }
    }

    public final void sendAccessibilityEvent(int i2) {
        if (i2 == 4096) {
            int firstVisiblePosition = getFirstVisiblePosition();
            int lastVisiblePosition = getLastVisiblePosition();
            if (this.f9542W0 != firstVisiblePosition || this.X0 != lastVisiblePosition) {
                this.f9542W0 = firstVisiblePosition;
                this.X0 = lastVisiblePosition;
            } else {
                return;
            }
        }
        super.sendAccessibilityEvent(i2);
    }

    public void setCacheColorHint(int i2) {
        if (i2 != this.f9510E0) {
            this.f9510E0 = i2;
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                getChildAt(i5).setDrawingCacheBackgroundColor(i2);
            }
            C0770g gVar = this.f9541W;
            int i6 = gVar.d;
            if (i6 == 1) {
                ArrayList arrayList = gVar.f9491a;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((View) arrayList.get(i7)).setDrawingCacheBackgroundColor(i2);
                }
            } else {
                for (int i8 = 0; i8 < i6; i8++) {
                    ArrayList arrayList2 = ((ArrayList[]) gVar.f9495f)[i8];
                    int size2 = arrayList2.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        ((View) arrayList2.get(i9)).setDrawingCacheBackgroundColor(i2);
                    }
                }
            }
            for (View view : (View[]) gVar.f9494e) {
                if (view != null) {
                    view.setDrawingCacheBackgroundColor(i2);
                }
            }
        }
    }

    public void setChoiceMode(int i2) {
        ListAdapter listAdapter;
        this.f9515I = i2;
        ActionMode actionMode = this.f9517J;
        if (actionMode != null) {
            actionMode.finish();
            this.f9517J = null;
        }
        if (this.f9515I != 0) {
            if (this.f9522M == null) {
                this.f9522M = new k();
            }
            if (this.f9524N == null && (listAdapter = this.f9529Q) != null && listAdapter.hasStableIds()) {
                this.f9524N = new g();
            }
            if (this.f9515I == 3) {
                k kVar = this.f9522M;
                if (kVar != null) {
                    kVar.b();
                }
                g gVar = this.f9524N;
                if (gVar != null) {
                    gVar.a();
                }
                this.f9521L = 0;
                setLongClickable(true);
            }
        }
    }

    public void setDrawSelectorOnTop(boolean z3) {
        this.f9533S = z3;
    }

    public void setFriction(float f6) {
        if (this.f9562p0 == null) {
            this.f9562p0 = new C0166e1(this);
        }
        u uVar = (u) this.f9562p0.f3286c;
        uVar.f9645b.f9640m = f6;
        uVar.f9646c.f9640m = f6;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [h5.b, java.lang.Object] */
    public void setMultiChoiceModeListener(C0569a aVar) {
        if (this.f9519K == null) {
            ? obj = new Object();
            obj.f8178b = this;
            this.f9519K = obj;
        }
        this.f9519K.f8177a = aVar;
    }

    public void setOnScrollListener(C0768e eVar) {
        onScrollChanged(0, 0, 0, 0);
    }

    public void setOverScrollMode(int i2) {
        if (i2 == 2) {
            this.f9528P0 = null;
            this.f9530Q0 = null;
        } else if (this.f9528P0 == null) {
            Context context = getContext();
            this.f9528P0 = new p(context);
            this.f9530Q0 = new p(context);
        }
        super.setOverScrollMode(i2);
    }

    public void setRecyclerListener(C0771h hVar) {
        this.f9541W.getClass();
    }

    public void setScrollingCacheEnabled(boolean z3) {
        if (this.s0 && !z3) {
            t();
        }
        this.s0 = z3;
    }

    public abstract void setSelectionInt(int i2);

    public void setSelector(int i2) {
        setSelector(getResources().getDrawable(i2));
    }

    public void setSmoothScrollbarEnabled(boolean z3) {
        this.f9565t0 = z3;
    }

    public void setStackFromRight(boolean z3) {
        if (this.f9564r0 != z3) {
            this.f9564r0 = z3;
            if (getChildCount() > 0) {
                I();
                requestLayout();
                invalidate();
            }
        }
    }

    public void setTranscriptMode(int i2) {
        this.f9509D0 = i2;
    }

    public void setVelocityScale(float f6) {
        this.f9520K0 = f6;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [k5.k, java.lang.Object] */
    public final boolean showContextMenuForChild(View view) {
        int c3 = c(view);
        if (c3 < 0) {
            return false;
        }
        this.f9529Q.getItemId(c3);
        getChildAt(c3 - this.f9578a);
        this.f9568w0 = new Object();
        return super.showContextMenuForChild(view);
    }

    public final void t() {
        if (!((C0773j) this.f9513H.f398a).isHardwareAccelerated()) {
            if (this.f9514H0 == null) {
                this.f9514H0 = new C0764a(this, 0);
            }
            post(this.f9514H0);
        }
    }

    public final boolean u() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return true;
        }
        if (childCount != this.f9592y) {
            return false;
        }
        int left = getChildAt(0).getLeft();
        Rect rect = this.f9551e0;
        if (left < rect.left || getChildAt(childCount - 1).getRight() > getWidth() - rect.right) {
            return false;
        }
        return true;
    }

    public final void v() {
        if (this.s0 && !this.f9553g0 && !((C0773j) this.f9513H.f398a).isHardwareAccelerated()) {
            setChildrenDrawnWithCacheEnabled(true);
            setChildrenDrawingCacheEnabled(true);
            this.f9554h0 = true;
            this.f9553g0 = true;
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f9535T == drawable || super.verifyDrawable(drawable)) {
            return true;
        }
        return false;
    }

    public abstract int w(int i2);

    /* JADX WARNING: Removed duplicated region for block: B:125:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x() {
        /*
            r22 = this;
            r0 = r22
            int r1 = r0.f9592y
            int r2 = r0.f9544Z0
            r0.f9544Z0 = r1
            int r3 = r0.f9515I
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L_0x00f3
            android.widget.ListAdapter r3 = r0.f9529Q
            if (r3 == 0) goto L_0x00f3
            boolean r3 = r3.hasStableIds()
            if (r3 == 0) goto L_0x00f3
            n.k r3 = r0.f9522M
            r3.b()
            r3 = r5
            r7 = r3
        L_0x001f:
            n.g r8 = r0.f9524N
            int r8 = r8.e()
            if (r3 >= r8) goto L_0x00ea
            n.g r8 = r0.f9524N
            long r12 = r8.c(r3)
            n.g r8 = r0.f9524N
            java.lang.Object r8 = r8.f(r3)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r11 = r8.intValue()
            android.widget.ListAdapter r8 = r0.f9529Q
            long r8 = r8.getItemId(r11)
            int r8 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r8 == 0) goto L_0x00df
            int r8 = r11 + -20
            int r8 = java.lang.Math.max(r5, r8)
            int r9 = r11 + 20
            int r10 = r0.f9592y
            int r9 = java.lang.Math.min(r9, r10)
        L_0x0051:
            java.lang.Object r10 = n.h.f10222a
            if (r8 >= r9) goto L_0x00b0
            android.widget.ListAdapter r14 = r0.f9529Q
            long r14 = r14.getItemId(r8)
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 != 0) goto L_0x00ad
            n.k r9 = r0.f9522M
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r9.g(r8, r11)
            n.g r9 = r0.f9524N
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            if (r3 < 0) goto L_0x009a
            int r11 = r9.d
            if (r3 >= r11) goto L_0x009d
            boolean r12 = r9.f10219a
            if (r12 == 0) goto L_0x0095
            long[] r12 = r9.f10220b
            java.lang.Object[] r13 = r9.f10221c
            r14 = r5
            r15 = r14
        L_0x007c:
            if (r14 >= r11) goto L_0x0091
            r6 = r13[r14]
            if (r6 == r10) goto L_0x008e
            if (r14 == r15) goto L_0x008c
            r16 = r12[r14]
            r12[r15] = r16
            r13[r15] = r6
            r13[r14] = r4
        L_0x008c:
            int r15 = r15 + 1
        L_0x008e:
            int r14 = r14 + 1
            goto L_0x007c
        L_0x0091:
            r9.f10219a = r5
            r9.d = r15
        L_0x0095:
            java.lang.Object[] r6 = r9.f10221c
            r6[r3] = r8
            goto L_0x00dd
        L_0x009a:
            r9.getClass()
        L_0x009d:
            java.lang.String r1 = "Expected index to be within 0..size()-1, but was "
            java.lang.String r1 = com.google.android.gms.internal.measurement.a.f(r3, r1)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x00ad:
            int r8 = r8 + 1
            goto L_0x0051
        L_0x00b0:
            n.g r6 = r0.f9524N
            long[] r7 = r6.f10220b
            int r8 = r6.d
            int r7 = o.C0890a.b(r7, r8, r12)
            if (r7 < 0) goto L_0x00c8
            java.lang.Object[] r8 = r6.f10221c
            r9 = r8[r7]
            if (r9 == r10) goto L_0x00c8
            r8[r7] = r10
            r7 = 1
            r6.f10219a = r7
            goto L_0x00c9
        L_0x00c8:
            r7 = 1
        L_0x00c9:
            int r3 = r3 + -1
            int r6 = r0.f9521L
            int r6 = r6 - r7
            r0.f9521L = r6
            android.view.ActionMode r10 = r0.f9517J
            if (r10 == 0) goto L_0x00dc
            h5.b r9 = r0.f9519K
            if (r9 == 0) goto L_0x00dc
            r14 = 0
            r9.a(r10, r11, r12, r14)
        L_0x00dc:
            r7 = 1
        L_0x00dd:
            r6 = 1
            goto L_0x00e7
        L_0x00df:
            n.k r6 = r0.f9522M
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r6.g(r11, r8)
            goto L_0x00dd
        L_0x00e7:
            int r3 = r3 + r6
            goto L_0x001f
        L_0x00ea:
            if (r7 == 0) goto L_0x00f3
            android.view.ActionMode r3 = r0.f9517J
            if (r3 == 0) goto L_0x00f3
            r3.invalidate()
        L_0x00f3:
            k5.g r3 = r0.f9541W
            java.lang.Object r3 = r3.g
            n.k r3 = (n.k) r3
            if (r3 == 0) goto L_0x00fe
            r3.b()
        L_0x00fe:
            r3 = -1
            r6 = -9223372036854775808
            r8 = 3
            if (r1 <= 0) goto L_0x0230
            boolean r9 = r0.f9582f
            if (r9 == 0) goto L_0x0204
            r0.f9582f = r5
            r0.f9546a1 = r4
            int r9 = r0.f9509D0
            r10 = 2
            if (r9 != r10) goto L_0x0114
            r0.f9526O = r8
            return
        L_0x0114:
            r11 = 1
            if (r9 != r11) goto L_0x0148
            boolean r9 = r0.f9538U0
            if (r9 == 0) goto L_0x0120
            r0.f9538U0 = r5
            r0.f9526O = r8
            return
        L_0x0120:
            int r9 = r22.getChildCount()
            int r11 = r22.getWidth()
            int r12 = r22.getPaddingRight()
            int r11 = r11 - r12
            int r12 = r9 + -1
            android.view.View r12 = r0.getChildAt(r12)
            if (r12 == 0) goto L_0x013a
            int r12 = r12.getBottom()
            goto L_0x013b
        L_0x013a:
            r12 = r11
        L_0x013b:
            int r13 = r0.f9578a
            int r13 = r13 + r9
            if (r13 < r2) goto L_0x0145
            if (r12 > r11) goto L_0x0145
            r0.f9526O = r8
            return
        L_0x0145:
            r22.awakenScrollBars()
        L_0x0148:
            int r2 = r0.f9583p
            r9 = 5
            if (r2 == 0) goto L_0x0162
            r11 = 1
            if (r2 == r11) goto L_0x0152
            goto L_0x0204
        L_0x0152:
            r0.f9526O = r9
            int r2 = r0.f9580c
            int r2 = java.lang.Math.max(r5, r2)
            int r1 = r1 - r11
            int r1 = java.lang.Math.min(r2, r1)
            r0.f9580c = r1
            return
        L_0x0162:
            r11 = 1
            boolean r2 = r22.isInTouchMode()
            if (r2 == 0) goto L_0x0179
            r0.f9526O = r9
            int r2 = r0.f9580c
            int r2 = java.lang.Math.max(r5, r2)
            int r1 = r1 - r11
            int r1 = java.lang.Math.min(r2, r1)
            r0.f9580c = r1
            return
        L_0x0179:
            int r2 = r0.f9592y
            if (r2 != 0) goto L_0x0180
        L_0x017d:
            r13 = r3
            goto L_0x01e5
        L_0x0180:
            long r11 = r0.d
            int r13 = r0.f9580c
            int r14 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r14 != 0) goto L_0x0189
            goto L_0x017d
        L_0x0189:
            int r13 = java.lang.Math.max(r5, r13)
            r14 = 1
            int r2 = r2 - r14
            int r13 = java.lang.Math.min(r2, r13)
            long r14 = android.os.SystemClock.uptimeMillis()
            r16 = 100
            long r14 = r14 + r16
            android.widget.Adapter r8 = r22.getAdapter()
            if (r8 != 0) goto L_0x01a2
            goto L_0x017d
        L_0x01a2:
            r19 = r5
            r4 = r13
            r18 = r4
        L_0x01a7:
            long r20 = android.os.SystemClock.uptimeMillis()
            int r20 = (r20 > r14 ? 1 : (r20 == r14 ? 0 : -1))
            if (r20 > 0) goto L_0x017d
            long r20 = r8.getItemId(r13)
            int r20 = (r20 > r11 ? 1 : (r20 == r11 ? 0 : -1))
            if (r20 != 0) goto L_0x01b8
            goto L_0x01e5
        L_0x01b8:
            if (r4 != r2) goto L_0x01bd
            r20 = 1
            goto L_0x01bf
        L_0x01bd:
            r20 = r5
        L_0x01bf:
            if (r18 != 0) goto L_0x01c4
            r21 = 1
            goto L_0x01c6
        L_0x01c4:
            r21 = r5
        L_0x01c6:
            if (r20 == 0) goto L_0x01cb
            if (r21 == 0) goto L_0x01cb
            goto L_0x017d
        L_0x01cb:
            if (r21 != 0) goto L_0x01df
            if (r19 == 0) goto L_0x01d2
            if (r20 != 0) goto L_0x01d2
            goto L_0x01df
        L_0x01d2:
            if (r20 != 0) goto L_0x01d8
            if (r19 != 0) goto L_0x01a7
            if (r21 != 0) goto L_0x01a7
        L_0x01d8:
            int r18 = r18 + -1
            r13 = r18
            r19 = 1
            goto L_0x01a7
        L_0x01df:
            int r4 = r4 + 1
            r13 = r4
            r19 = r5
            goto L_0x01a7
        L_0x01e5:
            if (r13 < 0) goto L_0x0204
            r2 = 1
            int r4 = r0.e(r13, r2)
            if (r4 != r13) goto L_0x0204
            r0.f9580c = r13
            long r1 = r0.f9581e
            int r3 = r22.getWidth()
            long r3 = (long) r3
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x01fe
            r0.f9526O = r9
            goto L_0x0200
        L_0x01fe:
            r0.f9526O = r10
        L_0x0200:
            r0.setNextSelectedPositionInt(r13)
            return
        L_0x0204:
            boolean r2 = r22.isInTouchMode()
            if (r2 != 0) goto L_0x022a
            int r2 = r22.getSelectedItemPosition()
            r4 = 1
            if (r2 < r1) goto L_0x0213
            int r2 = r1 + -1
        L_0x0213:
            if (r2 >= 0) goto L_0x0216
            r2 = r5
        L_0x0216:
            int r1 = r0.e(r2, r4)
            if (r1 < 0) goto L_0x0220
            r0.setNextSelectedPositionInt(r1)
            return
        L_0x0220:
            int r1 = r0.e(r2, r5)
            if (r1 < 0) goto L_0x0231
            r0.setNextSelectedPositionInt(r1)
            return
        L_0x022a:
            r4 = 1
            int r1 = r0.f9567v0
            if (r1 < 0) goto L_0x0231
            return
        L_0x0230:
            r4 = 1
        L_0x0231:
            boolean r1 = r0.f9564r0
            if (r1 == 0) goto L_0x0236
            r4 = 3
        L_0x0236:
            r0.f9526O = r4
            r0.f9589v = r3
            r0.f9590w = r6
            r0.f9587t = r3
            r0.f9588u = r6
            r0.f9582f = r5
            r1 = 0
            r0.f9546a1 = r1
            r0.f9537U = r3
            r22.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.C0773j.x():void");
    }

    public final void y() {
        int i2 = this.f9589v;
        if (i2 != -1) {
            if (this.f9526O != 4) {
                this.f9567v0 = i2;
            }
            int i5 = this.f9587t;
            if (i5 >= 0 && i5 != i2) {
                this.f9567v0 = i5;
            }
            setSelectedPositionInt(-1);
            setNextSelectedPositionInt(-1);
            this.f9563q0 = 0;
        }
    }

    public final void z() {
        if (((C0773j) this.f9513H.f398a).isHardwareAccelerated() && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
        }
    }

    public void setAdapter(ListAdapter listAdapter) {
        if (listAdapter != null) {
            boolean hasStableIds = this.f9529Q.hasStableIds();
            this.f9531R = hasStableIds;
            if (this.f9515I != 0 && hasStableIds && this.f9524N == null) {
                this.f9524N = new g();
            }
        }
        k kVar = this.f9522M;
        if (kVar != null) {
            kVar.b();
        }
        g gVar = this.f9524N;
        if (gVar != null) {
            gVar.a();
        }
    }

    public void setSelector(Drawable drawable) {
        Drawable drawable2 = this.f9535T;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f9535T);
        }
        this.f9535T = drawable;
        Rect rect = new Rect();
        drawable.getPadding(rect);
        this.f9545a0 = rect.left;
        this.f9547b0 = rect.top;
        this.f9549c0 = rect.right;
        this.f9550d0 = rect.bottom;
        drawable.setCallback(this);
        R();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.LayoutParams(getContext(), attributeSet);
    }

    public final void dispatchSetPressed(boolean z3) {
    }
}
