package com.google.android.material.bottomsheet;

import B0.H;
import B0.l;
import K.B;
import K.C0061a;
import K.C0062b;
import K.D;
import K.O;
import K.c0;
import K.d0;
import K.f0;
import M.a;
import U.e;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bumptech.glide.d;
import com.google.android.gms.common.api.internal.C0370y;
import com.mtma.criminal.city.R;
import d2.C0462a;
import d2.C0463b;
import d2.C0464c;
import h0.C0552a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import m0.a0;
import s2.f;
import s2.g;
import s2.k;
import x.C1089a;
import x.C1092d;

public class BottomSheetBehavior<V extends View> extends C1089a {

    /* renamed from: A  reason: collision with root package name */
    public final C0370y f6289A = new C0370y(this);

    /* renamed from: B  reason: collision with root package name */
    public final ValueAnimator f6290B;

    /* renamed from: C  reason: collision with root package name */
    public final int f6291C;

    /* renamed from: D  reason: collision with root package name */
    public int f6292D;

    /* renamed from: E  reason: collision with root package name */
    public int f6293E;
    public final float F = 0.5f;

    /* renamed from: G  reason: collision with root package name */
    public int f6294G;

    /* renamed from: H  reason: collision with root package name */
    public final float f6295H = -1.0f;

    /* renamed from: I  reason: collision with root package name */
    public boolean f6296I;

    /* renamed from: J  reason: collision with root package name */
    public boolean f6297J;

    /* renamed from: K  reason: collision with root package name */
    public final boolean f6298K = true;

    /* renamed from: L  reason: collision with root package name */
    public int f6299L = 4;

    /* renamed from: M  reason: collision with root package name */
    public e f6300M;

    /* renamed from: N  reason: collision with root package name */
    public boolean f6301N;

    /* renamed from: O  reason: collision with root package name */
    public int f6302O;

    /* renamed from: P  reason: collision with root package name */
    public boolean f6303P;

    /* renamed from: Q  reason: collision with root package name */
    public final float f6304Q = 0.1f;

    /* renamed from: R  reason: collision with root package name */
    public int f6305R;

    /* renamed from: S  reason: collision with root package name */
    public int f6306S;

    /* renamed from: T  reason: collision with root package name */
    public int f6307T;

    /* renamed from: U  reason: collision with root package name */
    public WeakReference f6308U;

    /* renamed from: V  reason: collision with root package name */
    public WeakReference f6309V;

    /* renamed from: W  reason: collision with root package name */
    public final ArrayList f6310W = new ArrayList();

    /* renamed from: X  reason: collision with root package name */
    public VelocityTracker f6311X;

    /* renamed from: Y  reason: collision with root package name */
    public int f6312Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f6313Z = -1;

    /* renamed from: a  reason: collision with root package name */
    public final int f6314a = 0;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f6315a0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6316b = true;

    /* renamed from: b0  reason: collision with root package name */
    public HashMap f6317b0;

    /* renamed from: c  reason: collision with root package name */
    public final float f6318c;

    /* renamed from: c0  reason: collision with root package name */
    public final SparseIntArray f6319c0 = new SparseIntArray();
    public final int d;

    /* renamed from: d0  reason: collision with root package name */
    public final C0463b f6320d0 = new C0463b(this, 0);

    /* renamed from: e  reason: collision with root package name */
    public int f6321e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6322f;
    public int g;
    public final int h;

    /* renamed from: i  reason: collision with root package name */
    public final g f6323i;

    /* renamed from: j  reason: collision with root package name */
    public final ColorStateList f6324j;

    /* renamed from: k  reason: collision with root package name */
    public final int f6325k = -1;

    /* renamed from: l  reason: collision with root package name */
    public final int f6326l = -1;

    /* renamed from: m  reason: collision with root package name */
    public int f6327m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f6328n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f6329o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f6330p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f6331q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f6332r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f6333s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f6334t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f6335u;

    /* renamed from: v  reason: collision with root package name */
    public int f6336v;

    /* renamed from: w  reason: collision with root package name */
    public int f6337w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f6338x;

    /* renamed from: y  reason: collision with root package name */
    public final k f6339y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f6340z;

    public BottomSheetBehavior() {
    }

    public static View v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = O.f1352a;
        if (D.p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View v6 = v(viewGroup.getChildAt(i2));
                if (v6 != null) {
                    return v6;
                }
            }
        }
        return null;
    }

    public static int w(int i2, int i5, int i6, int i7) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, i5, i7);
        if (i6 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i6), 1073741824);
        }
        if (size != 0) {
            i6 = Math.min(size, i6);
        }
        return View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
    }

    public final void A(int i2) {
        if (i2 == -1) {
            if (!this.f6322f) {
                this.f6322f = true;
            } else {
                return;
            }
        } else if (this.f6322f || this.f6321e != i2) {
            this.f6322f = false;
            this.f6321e = Math.max(0, i2);
        } else {
            return;
        }
        I();
    }

    public final void B(int i2) {
        String str;
        int i5;
        if (i2 == 1 || i2 == 2) {
            StringBuilder sb = new StringBuilder("STATE_");
            if (i2 == 1) {
                str = "DRAGGING";
            } else {
                str = "SETTLING";
            }
            throw new IllegalArgumentException(C0552a.r(sb, str, " should not be set externally."));
        } else if (this.f6296I || i2 != 5) {
            if (i2 != 6 || !this.f6316b || y(i2) > this.f6292D) {
                i5 = i2;
            } else {
                i5 = 3;
            }
            WeakReference weakReference = this.f6308U;
            if (weakReference == null || weakReference.get() == null) {
                C(i2);
                return;
            }
            View view = (View) this.f6308U.get();
            V4.g gVar = new V4.g(this, view, i5, 2);
            ViewParent parent = view.getParent();
            if (parent != null && parent.isLayoutRequested()) {
                WeakHashMap weakHashMap = O.f1352a;
                if (view.isAttachedToWindow()) {
                    view.post(gVar);
                    return;
                }
            }
            gVar.run();
        } else {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i2);
        }
    }

    public final void C(int i2) {
        if (this.f6299L != i2) {
            this.f6299L = i2;
            if (!(i2 == 4 || i2 == 3 || i2 == 6)) {
                boolean z3 = this.f6296I;
            }
            WeakReference weakReference = this.f6308U;
            if (weakReference != null && ((View) weakReference.get()) != null) {
                if (i2 == 3) {
                    H(true);
                } else if (i2 == 6 || i2 == 5 || i2 == 4) {
                    H(false);
                }
                G(i2, true);
                ArrayList arrayList = this.f6310W;
                if (arrayList.size() <= 0) {
                    F();
                } else {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        }
    }

    public final boolean D(View view, float f6) {
        if (this.f6297J) {
            return true;
        }
        if (view.getTop() < this.f6294G) {
            return false;
        }
        int t6 = t();
        if (Math.abs(((f6 * this.f6304Q) + ((float) view.getTop())) - ((float) this.f6294G)) / ((float) t6) > 0.5f) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r3 != false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        if (r1.o(r3.getLeft(), r0) != false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.y(r4)
            U.e r1 = r2.f6300M
            if (r1 == 0) goto L_0x0040
            if (r5 == 0) goto L_0x0015
            int r3 = r3.getLeft()
            boolean r3 = r1.o(r3, r0)
            if (r3 == 0) goto L_0x0040
            goto L_0x0032
        L_0x0015:
            int r5 = r3.getLeft()
            r1.f3667r = r3
            r3 = -1
            r1.f3655c = r3
            r3 = 0
            boolean r3 = r1.h(r5, r0, r3, r3)
            if (r3 != 0) goto L_0x0030
            int r5 = r1.f3653a
            if (r5 != 0) goto L_0x0030
            android.view.View r5 = r1.f3667r
            if (r5 == 0) goto L_0x0030
            r5 = 0
            r1.f3667r = r5
        L_0x0030:
            if (r3 == 0) goto L_0x0040
        L_0x0032:
            r3 = 2
            r2.C(r3)
            r3 = 1
            r2.G(r4, r3)
            com.google.android.gms.common.api.internal.y r3 = r2.f6289A
            r3.c(r4)
            goto L_0x0043
        L_0x0040:
            r2.C(r4)
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.E(android.view.View, int, boolean):void");
    }

    public final void F() {
        View view;
        int i2;
        boolean z3;
        C0062b bVar;
        WeakReference weakReference = this.f6308U;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            O.i(view, 524288);
            O.g(view, 0);
            O.i(view, 262144);
            O.g(view, 0);
            O.i(view, 1048576);
            O.g(view, 0);
            SparseIntArray sparseIntArray = this.f6319c0;
            int i5 = sparseIntArray.get(0, -1);
            if (i5 != -1) {
                O.i(view, i5);
                O.g(view, 0);
                sparseIntArray.delete(0);
            }
            int i6 = 6;
            if (!this.f6316b && this.f6299L != 6) {
                String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
                l lVar = new l((Object) this, 6, 18);
                ArrayList e6 = O.e(view);
                int i7 = 0;
                while (true) {
                    if (i7 >= e6.size()) {
                        int i8 = -1;
                        for (int i9 = 0; i9 < 32 && i8 == -1; i9++) {
                            int i10 = O.d[i9];
                            boolean z4 = true;
                            for (int i11 = 0; i11 < e6.size(); i11++) {
                                if (((L.e) e6.get(i11)).a() != i10) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                z4 &= z3;
                            }
                            if (z4) {
                                i8 = i10;
                            }
                        }
                        i2 = i8;
                    } else if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((L.e) e6.get(i7)).f1697a).getLabel())) {
                        i2 = ((L.e) e6.get(i7)).a();
                        break;
                    } else {
                        i7++;
                    }
                }
                if (i2 != -1) {
                    L.e eVar = new L.e((Object) null, i2, string, lVar, (Class) null);
                    View.AccessibilityDelegate c3 = O.c(view);
                    if (c3 == null) {
                        bVar = null;
                    } else if (c3 instanceof C0061a) {
                        bVar = ((C0061a) c3).f1363a;
                    } else {
                        bVar = new C0062b(c3);
                    }
                    if (bVar == null) {
                        bVar = new C0062b();
                    }
                    O.l(view, bVar);
                    O.i(view, eVar.a());
                    O.e(view).add(eVar);
                    O.g(view, 0);
                }
                sparseIntArray.put(0, i2);
            }
            if (this.f6296I && this.f6299L != 5) {
                O.j(view, L.e.f1694j, new l((Object) this, 5, 18));
            }
            int i12 = this.f6299L;
            if (i12 == 3) {
                if (this.f6316b) {
                    i6 = 4;
                }
                O.j(view, L.e.f1693i, new l((Object) this, i6, 18));
            } else if (i12 == 4) {
                if (this.f6316b) {
                    i6 = 3;
                }
                O.j(view, L.e.h, new l((Object) this, i6, 18));
            } else if (i12 == 6) {
                O.j(view, L.e.f1693i, new l((Object) this, 4, 18));
                O.j(view, L.e.h, new l((Object) this, 3, 18));
            }
        }
    }

    public final void G(int i2, boolean z3) {
        boolean z4;
        g gVar = this.f6323i;
        ValueAnimator valueAnimator = this.f6290B;
        if (i2 != 2) {
            if (this.f6299L != 3 || (!this.f6338x && !z())) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (this.f6340z != z4 && gVar != null) {
                this.f6340z = z4;
                float f6 = 1.0f;
                if (!z3 || valueAnimator == null) {
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        valueAnimator.cancel();
                    }
                    if (this.f6340z) {
                        f6 = s();
                    }
                    f fVar = gVar.f11459a;
                    if (fVar.f11446i != f6) {
                        fVar.f11446i = f6;
                        gVar.f11462e = true;
                        gVar.invalidateSelf();
                    }
                } else if (valueAnimator.isRunning()) {
                    valueAnimator.reverse();
                } else {
                    float f7 = gVar.f11459a.f11446i;
                    if (z4) {
                        f6 = s();
                    }
                    valueAnimator.setFloatValues(new float[]{f7, f6});
                    valueAnimator.start();
                }
            }
        }
    }

    public final void H(boolean z3) {
        WeakReference weakReference = this.f6308U;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z3) {
                    if (this.f6317b0 == null) {
                        this.f6317b0 = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = coordinatorLayout.getChildAt(i2);
                    if (childAt != this.f6308U.get() && z3) {
                        this.f6317b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z3) {
                    this.f6317b0 = null;
                }
            }
        }
    }

    public final void I() {
        View view;
        if (this.f6308U != null) {
            r();
            if (this.f6299L == 4 && (view = (View) this.f6308U.get()) != null) {
                view.requestLayout();
            }
        }
    }

    public final void c(C1092d dVar) {
        this.f6308U = null;
        this.f6300M = null;
    }

    public final void e() {
        this.f6308U = null;
        this.f6300M = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f(androidx.coordinatorlayout.widget.CoordinatorLayout r10, android.view.View r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00dc
            boolean r0 = r9.f6298K
            if (r0 != 0) goto L_0x000e
            goto L_0x00dc
        L_0x000e:
            int r0 = r12.getActionMasked()
            r3 = 0
            r4 = -1
            if (r0 != 0) goto L_0x0023
            r9.f6312Y = r4
            r9.f6313Z = r4
            android.view.VelocityTracker r5 = r9.f6311X
            if (r5 == 0) goto L_0x0023
            r5.recycle()
            r9.f6311X = r3
        L_0x0023:
            android.view.VelocityTracker r5 = r9.f6311X
            if (r5 != 0) goto L_0x002d
            android.view.VelocityTracker r5 = android.view.VelocityTracker.obtain()
            r9.f6311X = r5
        L_0x002d:
            android.view.VelocityTracker r5 = r9.f6311X
            r5.addMovement(r12)
            r5 = 2
            if (r0 == 0) goto L_0x0046
            if (r0 == r2) goto L_0x003b
            r11 = 3
            if (r0 == r11) goto L_0x003b
            goto L_0x0089
        L_0x003b:
            r9.f6315a0 = r1
            r9.f6312Y = r4
            boolean r11 = r9.f6301N
            if (r11 == 0) goto L_0x0089
            r9.f6301N = r1
            return r1
        L_0x0046:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.f6313Z = r7
            int r7 = r9.f6299L
            if (r7 == r5) goto L_0x0078
            java.lang.ref.WeakReference r7 = r9.f6309V
            if (r7 == 0) goto L_0x0061
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L_0x0062
        L_0x0061:
            r7 = r3
        L_0x0062:
            if (r7 == 0) goto L_0x0078
            int r8 = r9.f6313Z
            boolean r7 = r10.o(r7, r6, r8)
            if (r7 == 0) goto L_0x0078
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.f6312Y = r7
            r9.f6315a0 = r2
        L_0x0078:
            int r7 = r9.f6312Y
            if (r7 != r4) goto L_0x0086
            int r7 = r9.f6313Z
            boolean r11 = r10.o(r11, r6, r7)
            if (r11 != 0) goto L_0x0086
            r11 = r2
            goto L_0x0087
        L_0x0086:
            r11 = r1
        L_0x0087:
            r9.f6301N = r11
        L_0x0089:
            boolean r11 = r9.f6301N
            if (r11 != 0) goto L_0x0098
            U.e r11 = r9.f6300M
            if (r11 == 0) goto L_0x0098
            boolean r11 = r11.p(r12)
            if (r11 == 0) goto L_0x0098
            return r2
        L_0x0098:
            java.lang.ref.WeakReference r11 = r9.f6309V
            if (r11 == 0) goto L_0x00a3
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        L_0x00a3:
            if (r0 != r5) goto L_0x00db
            if (r3 == 0) goto L_0x00db
            boolean r11 = r9.f6301N
            if (r11 != 0) goto L_0x00db
            int r11 = r9.f6299L
            if (r11 == r2) goto L_0x00db
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.o(r3, r11, r0)
            if (r10 != 0) goto L_0x00db
            U.e r10 = r9.f6300M
            if (r10 == 0) goto L_0x00db
            int r10 = r9.f6313Z
            if (r10 == r4) goto L_0x00db
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            U.e r11 = r9.f6300M
            int r11 = r11.f3654b
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x00db
            r1 = r2
        L_0x00db:
            return r1
        L_0x00dc:
            r9.f6301N = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.f(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: type inference failed for: r10v21, types: [D0.h, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v23, types: [java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        boolean z3;
        View view2 = view;
        int i5 = this.f6326l;
        g gVar = this.f6323i;
        WeakHashMap weakHashMap = O.f1352a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view2.setFitsSystemWindows(true);
        }
        if (this.f6308U == null) {
            this.g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i6 = Build.VERSION.SDK_INT;
            if (i6 < 29 || this.f6328n || this.f6322f) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (this.f6329o || this.f6330p || this.f6331q || this.f6333s || this.f6334t || this.f6335u || z3) {
                H h6 = new H(this, z3, 6);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                ? obj = new Object();
                obj.f499a = paddingStart;
                obj.f500b = paddingEnd;
                obj.f501c = paddingBottom;
                D.u(view2, new a0(h6, obj, 3));
                if (view.isAttachedToWindow()) {
                    B.c(view);
                } else {
                    view2.addOnAttachStateChangeListener(new Object());
                }
            }
            I3.e eVar = new I3.e(view2);
            if (i6 >= 30) {
                view2.setWindowInsetsAnimationCallback(new f0(eVar));
            } else {
                PathInterpolator pathInterpolator = d0.f1381e;
                Object tag = view2.getTag(R.id.tag_on_apply_window_listener);
                c0 c0Var = new c0(view2, eVar);
                view2.setTag(R.id.tag_window_insets_animation_callback, c0Var);
                if (tag == null) {
                    view2.setOnApplyWindowInsetsListener(c0Var);
                }
            }
            this.f6308U = new WeakReference(view2);
            Context context = view.getContext();
            K1.e.o0(context, R.attr.motionEasingStandardDecelerateInterpolator, a.b(0.0f, 0.0f, 0.0f, 1.0f));
            K1.e.n0(R.attr.motionDurationMedium2, 300, context);
            K1.e.n0(R.attr.motionDurationShort3, 150, context);
            K1.e.n0(R.attr.motionDurationShort2, 100, context);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            if (gVar != null) {
                view2.setBackground(gVar);
                float f6 = this.f6295H;
                if (f6 == -1.0f) {
                    f6 = D.i(view);
                }
                gVar.i(f6);
            } else {
                ColorStateList colorStateList = this.f6324j;
                if (colorStateList != null) {
                    D.q(view2, colorStateList);
                }
            }
            F();
            if (view.getImportantForAccessibility() == 0) {
                view2.setImportantForAccessibility(1);
            }
        }
        if (this.f6300M == null) {
            this.f6300M = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f6320d0);
        } else {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i2);
        this.f6306S = coordinatorLayout.getWidth();
        this.f6307T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f6305R = height;
        int i7 = this.f6307T;
        int i8 = i7 - height;
        int i9 = this.f6337w;
        if (i8 < i9) {
            if (this.f6332r) {
                if (i5 != -1) {
                    i7 = Math.min(i7, i5);
                }
                this.f6305R = i7;
            } else {
                int i10 = i7 - i9;
                if (i5 != -1) {
                    i10 = Math.min(i10, i5);
                }
                this.f6305R = i10;
            }
        }
        this.f6292D = Math.max(0, this.f6307T - this.f6305R);
        this.f6293E = (int) ((1.0f - this.F) * ((float) this.f6307T));
        r();
        int i11 = this.f6299L;
        if (i11 == 3) {
            view2.offsetTopAndBottom(x());
        } else if (i11 == 6) {
            view2.offsetTopAndBottom(this.f6293E);
        } else if (this.f6296I && i11 == 5) {
            view2.offsetTopAndBottom(this.f6307T);
        } else if (i11 == 4) {
            view2.offsetTopAndBottom(this.f6294G);
        } else if (i11 == 1 || i11 == 2) {
            view2.offsetTopAndBottom(top - view.getTop());
        }
        G(this.f6299L, false);
        this.f6309V = new WeakReference(v(view));
        ArrayList arrayList = this.f6310W;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i2, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i2, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, this.f6325k, marginLayoutParams.width), w(i6, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f6326l, marginLayoutParams.height));
        return true;
    }

    public final boolean i(View view) {
        WeakReference weakReference = this.f6309V;
        if (weakReference == null || view != weakReference.get() || this.f6299L == 3) {
            return false;
        }
        return true;
    }

    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i5, int[] iArr, int i6) {
        View view3;
        boolean z3 = this.f6298K;
        if (i6 != 1) {
            WeakReference weakReference = this.f6309V;
            if (weakReference != null) {
                view3 = (View) weakReference.get();
            } else {
                view3 = null;
            }
            if (view2 == view3) {
                int top = view.getTop();
                int i7 = top - i5;
                if (i5 > 0) {
                    if (i7 < x()) {
                        int x6 = top - x();
                        iArr[1] = x6;
                        WeakHashMap weakHashMap = O.f1352a;
                        view.offsetTopAndBottom(-x6);
                        C(3);
                    } else if (z3) {
                        iArr[1] = i5;
                        WeakHashMap weakHashMap2 = O.f1352a;
                        view.offsetTopAndBottom(-i5);
                        C(1);
                    } else {
                        return;
                    }
                } else if (i5 < 0 && !view2.canScrollVertically(-1)) {
                    int i8 = this.f6294G;
                    if (i7 > i8 && !this.f6296I) {
                        int i9 = top - i8;
                        iArr[1] = i9;
                        WeakHashMap weakHashMap3 = O.f1352a;
                        view.offsetTopAndBottom(-i9);
                        C(4);
                    } else if (z3) {
                        iArr[1] = i5;
                        WeakHashMap weakHashMap4 = O.f1352a;
                        view.offsetTopAndBottom(-i5);
                        C(1);
                    } else {
                        return;
                    }
                }
                u(view.getTop());
                this.f6302O = i5;
                this.f6303P = true;
            }
        }
    }

    public final void m(View view, Parcelable parcelable) {
        C0464c cVar = (C0464c) parcelable;
        int i2 = this.f6314a;
        if (i2 != 0) {
            if (i2 == -1 || (i2 & 1) == 1) {
                this.f6321e = cVar.d;
            }
            if (i2 == -1 || (i2 & 2) == 2) {
                this.f6316b = cVar.f7520e;
            }
            if (i2 == -1 || (i2 & 4) == 4) {
                this.f6296I = cVar.f7521f;
            }
            if (i2 == -1 || (i2 & 8) == 8) {
                this.f6297J = cVar.f7522p;
            }
        }
        int i5 = cVar.f7519c;
        if (i5 == 1 || i5 == 2) {
            this.f6299L = 4;
        } else {
            this.f6299L = i5;
        }
    }

    public final Parcelable n(View view) {
        return new C0464c(View.BaseSavedState.EMPTY_STATE, this);
    }

    public final boolean o(View view, int i2, int i5) {
        this.f6302O = 0;
        this.f6303P = false;
        if ((i2 & 2) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r4.getTop() <= r3.f6293E) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0071, code lost:
        if (java.lang.Math.abs(r5 - r3.f6292D) < java.lang.Math.abs(r5 - r3.f6294G)) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
        if (r5 < java.lang.Math.abs(r5 - r3.f6294G)) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0090, code lost:
        if (java.lang.Math.abs(r5 - r2) < java.lang.Math.abs(r5 - r3.f6294G)) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ac, code lost:
        if (java.lang.Math.abs(r5 - r3.f6293E) < java.lang.Math.abs(r5 - r3.f6294G)) goto L_0x00ae;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p(android.view.View r4, android.view.View r5, int r6) {
        /*
            r3 = this;
            int r6 = r4.getTop()
            int r0 = r3.x()
            r1 = 3
            if (r6 != r0) goto L_0x000f
            r3.C(r1)
            return
        L_0x000f:
            java.lang.ref.WeakReference r6 = r3.f6309V
            if (r6 == 0) goto L_0x00b5
            java.lang.Object r6 = r6.get()
            if (r5 != r6) goto L_0x00b5
            boolean r5 = r3.f6303P
            if (r5 != 0) goto L_0x001f
            goto L_0x00b5
        L_0x001f:
            int r5 = r3.f6302O
            r6 = 6
            if (r5 <= 0) goto L_0x0034
            boolean r5 = r3.f6316b
            if (r5 == 0) goto L_0x002a
            goto L_0x00af
        L_0x002a:
            int r5 = r4.getTop()
            int r0 = r3.f6293E
            if (r5 <= r0) goto L_0x00af
            goto L_0x00ae
        L_0x0034:
            boolean r5 = r3.f6296I
            if (r5 == 0) goto L_0x0055
            android.view.VelocityTracker r5 = r3.f6311X
            if (r5 != 0) goto L_0x003e
            r5 = 0
            goto L_0x004d
        L_0x003e:
            r0 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.f6318c
            r5.computeCurrentVelocity(r0, r2)
            android.view.VelocityTracker r5 = r3.f6311X
            int r0 = r3.f6312Y
            float r5 = r5.getYVelocity(r0)
        L_0x004d:
            boolean r5 = r3.D(r4, r5)
            if (r5 == 0) goto L_0x0055
            r1 = 5
            goto L_0x00af
        L_0x0055:
            int r5 = r3.f6302O
            r0 = 4
            if (r5 != 0) goto L_0x0093
            int r5 = r4.getTop()
            boolean r2 = r3.f6316b
            if (r2 == 0) goto L_0x0074
            int r6 = r3.f6292D
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r2 = r3.f6294G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto L_0x0097
            goto L_0x00af
        L_0x0074:
            int r2 = r3.f6293E
            if (r5 >= r2) goto L_0x0083
            int r0 = r3.f6294G
            int r0 = r5 - r0
            int r0 = java.lang.Math.abs(r0)
            if (r5 >= r0) goto L_0x00ae
            goto L_0x00af
        L_0x0083:
            int r1 = r5 - r2
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f6294G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L_0x0097
            goto L_0x00ae
        L_0x0093:
            boolean r5 = r3.f6316b
            if (r5 == 0) goto L_0x0099
        L_0x0097:
            r1 = r0
            goto L_0x00af
        L_0x0099:
            int r5 = r4.getTop()
            int r1 = r3.f6293E
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f6294G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L_0x0097
        L_0x00ae:
            r1 = r6
        L_0x00af:
            r5 = 0
            r3.E(r4, r1, r5)
            r3.f6303P = r5
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.p(android.view.View, android.view.View, int):void");
    }

    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i2 = this.f6299L;
        if (i2 == 1 && actionMasked == 0) {
            return true;
        }
        e eVar = this.f6300M;
        if (eVar != null && (this.f6298K || i2 == 1)) {
            eVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f6312Y = -1;
            this.f6313Z = -1;
            VelocityTracker velocityTracker = this.f6311X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f6311X = null;
            }
        }
        if (this.f6311X == null) {
            this.f6311X = VelocityTracker.obtain();
        }
        this.f6311X.addMovement(motionEvent);
        if (this.f6300M != null && ((this.f6298K || this.f6299L == 1) && actionMasked == 2 && !this.f6301N)) {
            float abs = Math.abs(((float) this.f6313Z) - motionEvent.getY());
            e eVar2 = this.f6300M;
            if (abs > ((float) eVar2.f3654b)) {
                eVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f6301N;
    }

    public final void r() {
        int t6 = t();
        if (this.f6316b) {
            this.f6294G = Math.max(this.f6307T - t6, this.f6292D);
        } else {
            this.f6294G = this.f6307T - t6;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float s() {
        /*
            r5 = this;
            s2.g r0 = r5.f6323i
            r1 = 0
            if (r0 == 0) goto L_0x0079
            java.lang.ref.WeakReference r0 = r5.f6308U
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x0079
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L_0x0079
            java.lang.ref.WeakReference r0 = r5.f6308U
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.z()
            if (r2 == 0) goto L_0x0079
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L_0x0079
            s2.g r2 = r5.f6323i
            s2.f r3 = r2.f11459a
            s2.k r3 = r3.f11441a
            s2.c r3 = r3.f11488e
            android.graphics.RectF r2 = r2.f()
            float r2 = r3.a(r2)
            android.view.RoundedCorner r3 = r0.getRoundedCorner(0)
            if (r3 == 0) goto L_0x004e
            int r3 = r3.getRadius()
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x004e
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x004e
            float r3 = r3 / r2
            goto L_0x004f
        L_0x004e:
            r3 = r1
        L_0x004f:
            s2.g r2 = r5.f6323i
            s2.f r4 = r2.f11459a
            s2.k r4 = r4.f11441a
            s2.c r4 = r4.f11489f
            android.graphics.RectF r2 = r2.f()
            float r2 = r4.a(r2)
            android.view.RoundedCorner r0 = r0.getRoundedCorner(1)
            if (r0 == 0) goto L_0x0074
            int r0 = r0.getRadius()
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x0074
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x0074
            float r1 = r0 / r2
        L_0x0074:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L_0x0079:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.s():float");
    }

    public final int t() {
        int i2;
        if (this.f6322f) {
            return Math.min(Math.max(this.g, this.f6307T - ((this.f6306S * 9) / 16)), this.f6305R) + this.f6336v;
        }
        if (this.f6328n || this.f6329o || (i2 = this.f6327m) <= 0) {
            return this.f6321e + this.f6336v;
        }
        return Math.max(this.f6321e, i2 + this.h);
    }

    public final void u(int i2) {
        if (((View) this.f6308U.get()) != null) {
            ArrayList arrayList = this.f6310W;
            if (!arrayList.isEmpty()) {
                int i5 = this.f6294G;
                if (i2 <= i5 && i5 != x()) {
                    x();
                }
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        }
    }

    public final int x() {
        int i2;
        if (this.f6316b) {
            return this.f6292D;
        }
        int i5 = this.f6291C;
        if (this.f6332r) {
            i2 = 0;
        } else {
            i2 = this.f6337w;
        }
        return Math.max(i5, i2);
    }

    public final int y(int i2) {
        if (i2 == 3) {
            return x();
        }
        if (i2 == 4) {
            return this.f6294G;
        }
        if (i2 == 5) {
            return this.f6307T;
        }
        if (i2 == 6) {
            return this.f6293E;
        }
        throw new IllegalArgumentException(com.google.android.gms.internal.measurement.a.f(i2, "Invalid state to get top offset: "));
    }

    public final boolean z() {
        WeakReference weakReference = this.f6308U;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.f6308U.get()).getLocationOnScreen(iArr);
        if (iArr[1] == 0) {
            return true;
        }
        return false;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i2;
        this.h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Y1.a.f4247a);
        int i5 = 3;
        if (obtainStyledAttributes.hasValue(3)) {
            this.f6324j = d.a0(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f6339y = k.b(context, attributeSet, R.attr.bottomSheetStyle, 2131952445).a();
        }
        k kVar = this.f6339y;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f6323i = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f6324j;
            if (colorStateList != null) {
                this.f6323i.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f6323i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{s(), 1.0f});
        this.f6290B = ofFloat;
        ofFloat.setDuration(500);
        this.f6290B.addUpdateListener(new C0462a(this, 0));
        this.f6295H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f6325k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f6326l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue == null || (i2 = peekValue.data) != -1) {
            A(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            A(i2);
        }
        boolean z3 = obtainStyledAttributes.getBoolean(8, false);
        if (this.f6296I != z3) {
            this.f6296I = z3;
            if (!z3 && this.f6299L == 5) {
                B(4);
            }
            F();
        }
        this.f6328n = obtainStyledAttributes.getBoolean(13, false);
        boolean z4 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f6316b != z4) {
            this.f6316b = z4;
            if (this.f6308U != null) {
                r();
            }
            C((!this.f6316b || this.f6299L != 6) ? this.f6299L : i5);
            G(this.f6299L, true);
            F();
        }
        this.f6297J = obtainStyledAttributes.getBoolean(12, false);
        this.f6298K = obtainStyledAttributes.getBoolean(4, true);
        this.f6314a = obtainStyledAttributes.getInt(10, 0);
        float f6 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f6 <= 0.0f || f6 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.F = f6;
        if (this.f6308U != null) {
            this.f6293E = (int) ((1.0f - f6) * ((float) this.f6307T));
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
        if (peekValue2 == null || peekValue2.type != 16) {
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
            if (dimensionPixelOffset >= 0) {
                this.f6291C = dimensionPixelOffset;
                G(this.f6299L, true);
            } else {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        } else {
            int i6 = peekValue2.data;
            if (i6 >= 0) {
                this.f6291C = i6;
                G(this.f6299L, true);
            } else {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        }
        this.d = obtainStyledAttributes.getInt(11, 500);
        this.f6329o = obtainStyledAttributes.getBoolean(17, false);
        this.f6330p = obtainStyledAttributes.getBoolean(18, false);
        this.f6331q = obtainStyledAttributes.getBoolean(19, false);
        this.f6332r = obtainStyledAttributes.getBoolean(20, true);
        this.f6333s = obtainStyledAttributes.getBoolean(14, false);
        this.f6334t = obtainStyledAttributes.getBoolean(15, false);
        this.f6335u = obtainStyledAttributes.getBoolean(16, false);
        this.f6338x = obtainStyledAttributes.getBoolean(23, true);
        obtainStyledAttributes.recycle();
        this.f6318c = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final void k(CoordinatorLayout coordinatorLayout, View view, int i2, int i5, int i6, int[] iArr) {
    }
}
