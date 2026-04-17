package m0;

import K.O;
import K4.u;
import L.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import c1.i;
import com.google.crypto.tink.shaded.protobuf.C0407l;
import j4.p0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.C0724m;
import k5.C0770g;
import l0.a;

/* renamed from: m0.F  reason: case insensitive filesystem */
public abstract class C0804F {

    /* renamed from: a  reason: collision with root package name */
    public i f9849a;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f9850b;

    /* renamed from: c  reason: collision with root package name */
    public final a0 f9851c;
    public final a0 d;

    /* renamed from: e  reason: collision with root package name */
    public C0827t f9852e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f9853f = false;
    public boolean g = false;
    public final boolean h = true;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f9854i = true;

    /* renamed from: j  reason: collision with root package name */
    public int f9855j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f9856k;

    /* renamed from: l  reason: collision with root package name */
    public int f9857l;

    /* renamed from: m  reason: collision with root package name */
    public int f9858m;

    /* renamed from: n  reason: collision with root package name */
    public int f9859n;

    /* renamed from: o  reason: collision with root package name */
    public int f9860o;

    public C0804F() {
        C0724m mVar = new C0724m(this, 3);
        p0 p0Var = new p0(this, 9);
        this.f9851c = new a0((e0) mVar);
        this.d = new a0((e0) p0Var);
    }

    public static int A(View view) {
        Rect rect = ((C0805G) view.getLayoutParams()).f9862b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((C0805G) view.getLayoutParams()).f9861a.b();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [m0.E, java.lang.Object] */
    public static C0803E I(Context context, AttributeSet attributeSet, int i2, int i5) {
        ? obj = new Object();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f9663a, i2, i5);
        obj.f9846a = obtainStyledAttributes.getInt(0, 1);
        obj.f9847b = obtainStyledAttributes.getInt(10, 1);
        obj.f9848c = obtainStyledAttributes.getBoolean(9, false);
        obj.d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return obj;
    }

    public static boolean M(int i2, int i5, int i6) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        if (i6 > 0 && i2 != i6) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode == 1073741824 && size == i2) {
                return true;
            }
            return false;
        } else if (size >= i2) {
            return true;
        } else {
            return false;
        }
    }

    public static void N(View view, int i2, int i5, int i6, int i7) {
        C0805G g5 = (C0805G) view.getLayoutParams();
        Rect rect = g5.f9862b;
        view.layout(i2 + rect.left + g5.leftMargin, i5 + rect.top + g5.topMargin, (i6 - rect.right) - g5.rightMargin, (i7 - rect.bottom) - g5.bottomMargin);
    }

    public static int g(int i2, int i5, int i6) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(size, Math.max(i5, i6));
        }
        if (mode != 1073741824) {
            return Math.max(i5, i6);
        }
        return size;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r5 == 1073741824) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int w(int r4, int r5, int r6, boolean r7, int r8) {
        /*
            int r4 = r4 - r6
            r6 = 0
            int r4 = java.lang.Math.max(r6, r4)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r7 == 0) goto L_0x001d
            if (r8 < 0) goto L_0x0012
        L_0x0010:
            r5 = r3
            goto L_0x0030
        L_0x0012:
            if (r8 != r1) goto L_0x001a
            if (r5 == r2) goto L_0x0022
            if (r5 == 0) goto L_0x001a
            if (r5 == r3) goto L_0x0022
        L_0x001a:
            r5 = r6
            r8 = r5
            goto L_0x0030
        L_0x001d:
            if (r8 < 0) goto L_0x0020
            goto L_0x0010
        L_0x0020:
            if (r8 != r1) goto L_0x0024
        L_0x0022:
            r8 = r4
            goto L_0x0030
        L_0x0024:
            if (r8 != r0) goto L_0x001a
            if (r5 == r2) goto L_0x002e
            if (r5 != r3) goto L_0x002b
            goto L_0x002e
        L_0x002b:
            r8 = r4
            r5 = r6
            goto L_0x0030
        L_0x002e:
            r8 = r4
            r5 = r2
        L_0x0030:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.C0804F.w(int, int, int, boolean, int):int");
    }

    public static int z(View view) {
        Rect rect = ((C0805G) view.getLayoutParams()).f9862b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public final int B() {
        C0832y yVar;
        RecyclerView recyclerView = this.f9850b;
        if (recyclerView != null) {
            yVar = recyclerView.getAdapter();
        } else {
            yVar = null;
        }
        if (yVar != null) {
            return yVar.a();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.f9850b;
        WeakHashMap weakHashMap = O.f1352a;
        return recyclerView.getLayoutDirection();
    }

    public final int D() {
        RecyclerView recyclerView = this.f9850b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f9850b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f9850b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int G() {
        RecyclerView recyclerView = this.f9850b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int J(C0770g gVar, P p6) {
        RecyclerView recyclerView = this.f9850b;
        if (recyclerView == null || recyclerView.f5376t == null || !e()) {
            return 1;
        }
        return this.f9850b.f5376t.a();
    }

    public final void K(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((C0805G) view.getLayoutParams()).f9862b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (!(this.f9850b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
            RectF rectF = this.f9850b.f5375s;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean L();

    public void O(int i2) {
        RecyclerView recyclerView = this.f9850b;
        if (recyclerView != null) {
            int k6 = recyclerView.f5356e.k();
            for (int i5 = 0; i5 < k6; i5++) {
                recyclerView.f5356e.j(i5).offsetLeftAndRight(i2);
            }
        }
    }

    public void P(int i2) {
        RecyclerView recyclerView = this.f9850b;
        if (recyclerView != null) {
            int k6 = recyclerView.f5356e.k();
            for (int i5 = 0; i5 < k6; i5++) {
                recyclerView.f5356e.j(i5).offsetTopAndBottom(i2);
            }
        }
    }

    public abstract void R(RecyclerView recyclerView);

    public abstract View S(View view, int i2, C0770g gVar, P p6);

    public void T(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f9850b;
        C0770g gVar = recyclerView.f5351b;
        P p6 = recyclerView.f5365l0;
        if (recyclerView != null && accessibilityEvent != null) {
            boolean z3 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f9850b.canScrollVertically(-1) && !this.f9850b.canScrollHorizontally(-1) && !this.f9850b.canScrollHorizontally(1)) {
                z3 = false;
            }
            accessibilityEvent.setScrollable(z3);
            C0832y yVar = this.f9850b.f5376t;
            if (yVar != null) {
                accessibilityEvent.setItemCount(yVar.a());
            }
        }
    }

    public final void U(View view, j jVar) {
        T I6 = RecyclerView.I(view);
        if (I6 != null && !I6.i() && !((ArrayList) this.f9849a.d).contains(I6.f9893a)) {
            RecyclerView recyclerView = this.f9850b;
            V(recyclerView.f5351b, recyclerView.f5365l0, view, jVar);
        }
    }

    public void V(C0770g gVar, P p6, View view, j jVar) {
        int i2;
        int i5;
        if (e()) {
            i2 = H(view);
        } else {
            i2 = 0;
        }
        if (d()) {
            i5 = H(view);
        } else {
            i5 = 0;
        }
        jVar.i(L.i.a(i2, 1, i5, false, 1));
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.view.View r9, int r10, boolean r11) {
        /*
            r8 = this;
            m0.T r0 = androidx.recyclerview.widget.RecyclerView.I(r9)
            r1 = 1
            if (r11 != 0) goto L_0x0016
            boolean r11 = r0.i()
            if (r11 == 0) goto L_0x000e
            goto L_0x0016
        L_0x000e:
            androidx.recyclerview.widget.RecyclerView r11 = r8.f9850b
            m0.a0 r11 = r11.f5358f
            r11.u(r0)
            goto L_0x0032
        L_0x0016:
            androidx.recyclerview.widget.RecyclerView r11 = r8.f9850b
            m0.a0 r11 = r11.f5358f
            java.lang.Object r11 = r11.f9925b
            n.j r11 = (n.j) r11
            java.lang.Object r2 = r11.get(r0)
            m0.f0 r2 = (m0.f0) r2
            if (r2 != 0) goto L_0x002d
            m0.f0 r2 = m0.f0.a()
            r11.put(r0, r2)
        L_0x002d:
            int r11 = r2.f9966a
            r11 = r11 | r1
            r2.f9966a = r11
        L_0x0032:
            android.view.ViewGroup$LayoutParams r11 = r9.getLayoutParams()
            m0.G r11 = (m0.C0805G) r11
            boolean r2 = r0.q()
            r3 = 0
            if (r2 != 0) goto L_0x0132
            boolean r2 = r0.j()
            if (r2 == 0) goto L_0x0047
            goto L_0x0132
        L_0x0047:
            android.view.ViewParent r2 = r9.getParent()
            androidx.recyclerview.widget.RecyclerView r4 = r8.f9850b
            r5 = -1
            if (r2 != r4) goto L_0x010d
            c1.i r2 = r8.f9849a
            java.lang.Object r4 = r2.f5605b
            m0.x r4 = (m0.C0831x) r4
            androidx.recyclerview.widget.RecyclerView r4 = r4.f10067a
            int r4 = r4.indexOfChild(r9)
            if (r4 != r5) goto L_0x0060
        L_0x005e:
            r4 = r5
            goto L_0x0070
        L_0x0060:
            java.lang.Object r2 = r2.f5606c
            K4.u r2 = (K4.u) r2
            boolean r6 = r2.e(r4)
            if (r6 == 0) goto L_0x006b
            goto L_0x005e
        L_0x006b:
            int r2 = r2.b(r4)
            int r4 = r4 - r2
        L_0x0070:
            if (r10 != r5) goto L_0x0078
            c1.i r10 = r8.f9849a
            int r10 = r10.k()
        L_0x0078:
            if (r4 == r5) goto L_0x00ea
            if (r4 == r10) goto L_0x014d
            androidx.recyclerview.widget.RecyclerView r9 = r8.f9850b
            m0.F r9 = r9.f5378u
            android.view.View r2 = r9.u(r4)
            if (r2 == 0) goto L_0x00cd
            r9.u(r4)
            c1.i r5 = r9.f9849a
            r5.e(r4)
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            m0.G r4 = (m0.C0805G) r4
            m0.T r5 = androidx.recyclerview.widget.RecyclerView.I(r2)
            boolean r6 = r5.i()
            if (r6 == 0) goto L_0x00bb
            androidx.recyclerview.widget.RecyclerView r6 = r9.f9850b
            m0.a0 r6 = r6.f5358f
            java.lang.Object r6 = r6.f9925b
            n.j r6 = (n.j) r6
            java.lang.Object r7 = r6.get(r5)
            m0.f0 r7 = (m0.f0) r7
            if (r7 != 0) goto L_0x00b5
            m0.f0 r7 = m0.f0.a()
            r6.put(r5, r7)
        L_0x00b5:
            int r6 = r7.f9966a
            r1 = r1 | r6
            r7.f9966a = r1
            goto L_0x00c2
        L_0x00bb:
            androidx.recyclerview.widget.RecyclerView r1 = r9.f9850b
            m0.a0 r1 = r1.f5358f
            r1.u(r5)
        L_0x00c2:
            c1.i r9 = r9.f9849a
            boolean r1 = r5.i()
            r9.b(r2, r10, r4, r1)
            goto L_0x014d
        L_0x00cd:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "Cannot move a child from non-existing index:"
            r11.<init>(r0)
            r11.append(r4)
            androidx.recyclerview.widget.RecyclerView r9 = r9.f9850b
            java.lang.String r9 = r9.toString()
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r10.<init>(r9)
            throw r10
        L_0x00ea:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "Added View has RecyclerView as parent but view is not a real child. Unfiltered index:"
            r11.<init>(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r8.f9850b
            int r9 = r0.indexOfChild(r9)
            r11.append(r9)
            androidx.recyclerview.widget.RecyclerView r9 = r8.f9850b
            java.lang.String r9 = r9.y()
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r10.<init>(r9)
            throw r10
        L_0x010d:
            c1.i r2 = r8.f9849a
            r2.a(r9, r10, r3)
            r11.f9863c = r1
            m0.t r10 = r8.f9852e
            if (r10 == 0) goto L_0x014d
            boolean r1 = r10.f10053e
            if (r1 == 0) goto L_0x014d
            androidx.recyclerview.widget.RecyclerView r1 = r10.f10051b
            r1.getClass()
            m0.T r1 = androidx.recyclerview.widget.RecyclerView.I(r9)
            if (r1 == 0) goto L_0x012b
            int r5 = r1.b()
        L_0x012b:
            int r1 = r10.f10050a
            if (r5 != r1) goto L_0x014d
            r10.f10054f = r9
            goto L_0x014d
        L_0x0132:
            boolean r1 = r0.j()
            if (r1 == 0) goto L_0x013e
            k5.g r1 = r0.f9903n
            r1.o(r0)
            goto L_0x0144
        L_0x013e:
            int r1 = r0.f9899j
            r1 = r1 & -33
            r0.f9899j = r1
        L_0x0144:
            c1.i r1 = r8.f9849a
            android.view.ViewGroup$LayoutParams r2 = r9.getLayoutParams()
            r1.b(r9, r10, r2, r3)
        L_0x014d:
            boolean r9 = r11.d
            if (r9 == 0) goto L_0x0158
            android.view.View r9 = r0.f9893a
            r9.invalidate()
            r11.d = r3
        L_0x0158:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.C0804F.b(android.view.View, int, boolean):void");
    }

    public abstract void b0(C0770g gVar, P p6);

    public void c(String str) {
        RecyclerView recyclerView = this.f9850b;
        if (recyclerView != null) {
            recyclerView.i(str);
        }
    }

    public abstract void c0(P p6);

    public abstract boolean d();

    public abstract boolean e();

    public Parcelable e0() {
        return null;
    }

    public boolean f(C0805G g5) {
        if (g5 != null) {
            return true;
        }
        return false;
    }

    public final void g0(C0770g gVar) {
        for (int v6 = v() - 1; v6 >= 0; v6--) {
            if (!RecyclerView.I(u(v6)).p()) {
                View u6 = u(v6);
                j0(v6);
                gVar.h(u6);
            }
        }
    }

    public final void h0(C0770g gVar) {
        ArrayList arrayList;
        int size = gVar.f9491a.size();
        int i2 = size - 1;
        while (true) {
            arrayList = gVar.f9491a;
            if (i2 < 0) {
                break;
            }
            View view = ((T) arrayList.get(i2)).f9893a;
            T I6 = RecyclerView.I(view);
            if (!I6.p()) {
                I6.o(false);
                if (I6.k()) {
                    this.f9850b.removeDetachedView(view, false);
                }
                C0801C c3 = this.f9850b.f5342Q;
                if (c3 != null) {
                    c3.d(I6);
                }
                I6.o(true);
                T I7 = RecyclerView.I(view);
                I7.f9903n = null;
                I7.f9904o = false;
                I7.f9899j &= -33;
                gVar.i(I7);
            }
            i2--;
        }
        arrayList.clear();
        ArrayList arrayList2 = gVar.f9492b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f9850b.invalidate();
        }
    }

    public final void i0(View view, C0770g gVar) {
        i iVar = this.f9849a;
        C0831x xVar = (C0831x) iVar.f5605b;
        int indexOfChild = xVar.f10067a.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((u) iVar.f5606c).m(indexOfChild)) {
                iVar.L(view);
            }
            xVar.a(indexOfChild);
        }
        gVar.h(view);
    }

    public abstract int j(P p6);

    public final void j0(int i2) {
        if (u(i2) != null) {
            i iVar = this.f9849a;
            int r6 = iVar.r(i2);
            C0831x xVar = (C0831x) iVar.f5605b;
            View childAt = xVar.f10067a.getChildAt(r6);
            if (childAt != null) {
                if (((u) iVar.f5606c).m(r6)) {
                    iVar.L(childAt);
                }
                xVar.a(r6);
            }
        }
    }

    public abstract int k(P p6);

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ab, code lost:
        if ((r5.bottom - r10) > r2) goto L_0x00ae;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean k0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.E()
            int r1 = r8.G()
            int r2 = r8.f9859n
            int r3 = r8.F()
            int r2 = r2 - r3
            int r3 = r8.f9860o
            int r4 = r8.D()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.C()
            r7 = 1
            if (r3 != r7) goto L_0x005c
            if (r2 == 0) goto L_0x0057
            goto L_0x0064
        L_0x0057:
            int r2 = java.lang.Math.max(r6, r10)
            goto L_0x0064
        L_0x005c:
            if (r6 == 0) goto L_0x005f
            goto L_0x0063
        L_0x005f:
            int r6 = java.lang.Math.min(r4, r2)
        L_0x0063:
            r2 = r6
        L_0x0064:
            if (r1 == 0) goto L_0x0067
            goto L_0x006b
        L_0x0067:
            int r1 = java.lang.Math.min(r5, r11)
        L_0x006b:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto L_0x00ae
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L_0x007c
            goto L_0x00b3
        L_0x007c:
            int r1 = r8.E()
            int r2 = r8.G()
            int r3 = r8.f9859n
            int r4 = r8.F()
            int r3 = r3 - r4
            int r4 = r8.f9860o
            int r5 = r8.D()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f9850b
            android.graphics.Rect r5 = r5.f5371q
            r8.y(r13, r5)
            int r13 = r5.left
            int r13 = r13 - r11
            if (r13 >= r3) goto L_0x00b3
            int r13 = r5.right
            int r13 = r13 - r11
            if (r13 <= r1) goto L_0x00b3
            int r13 = r5.top
            int r13 = r13 - r10
            if (r13 >= r4) goto L_0x00b3
            int r13 = r5.bottom
            int r13 = r13 - r10
            if (r13 > r2) goto L_0x00ae
            goto L_0x00b3
        L_0x00ae:
            if (r11 != 0) goto L_0x00b4
            if (r10 == 0) goto L_0x00b3
            goto L_0x00b4
        L_0x00b3:
            return r0
        L_0x00b4:
            if (r12 == 0) goto L_0x00ba
            r9.scrollBy(r11, r10)
            goto L_0x00bd
        L_0x00ba:
            r9.Z(r11, r10, r0)
        L_0x00bd:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.C0804F.k0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int l(P p6);

    public final void l0() {
        RecyclerView recyclerView = this.f9850b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int m(P p6);

    public abstract int m0(int i2, C0770g gVar, P p6);

    public abstract int n(P p6);

    public abstract void n0(int i2);

    public abstract int o(P p6);

    public abstract int o0(int i2, C0770g gVar, P p6);

    public final void p(C0770g gVar) {
        for (int v6 = v() - 1; v6 >= 0; v6--) {
            View u6 = u(v6);
            T I6 = RecyclerView.I(u6);
            if (!I6.p()) {
                if (!I6.g() || I6.i() || this.f9850b.f5376t.f10069b) {
                    u(v6);
                    this.f9849a.e(v6);
                    gVar.l(u6);
                    this.f9850b.f5358f.u(I6);
                } else {
                    j0(v6);
                    gVar.i(I6);
                }
            }
        }
    }

    public final void p0(RecyclerView recyclerView) {
        q0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public View q(int i2) {
        int v6 = v();
        for (int i5 = 0; i5 < v6; i5++) {
            View u6 = u(i5);
            T I6 = RecyclerView.I(u6);
            if (I6 != null && I6.b() == i2 && !I6.p() && (this.f9850b.f5365l0.g || !I6.i())) {
                return u6;
            }
        }
        return null;
    }

    public final void q0(int i2, int i5) {
        this.f9859n = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        this.f9857l = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.f5323B0;
        }
        this.f9860o = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i5);
        this.f9858m = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.f5323B0;
        }
    }

    public abstract C0805G r();

    public void r0(Rect rect, int i2, int i5) {
        int F = F() + E() + rect.width();
        int D4 = D() + G() + rect.height();
        RecyclerView recyclerView = this.f9850b;
        WeakHashMap weakHashMap = O.f1352a;
        this.f9850b.setMeasuredDimension(g(i2, F, recyclerView.getMinimumWidth()), g(i5, D4, this.f9850b.getMinimumHeight()));
    }

    public C0805G s(Context context, AttributeSet attributeSet) {
        return new C0805G(context, attributeSet);
    }

    public final void s0(int i2, int i5) {
        int v6 = v();
        if (v6 == 0) {
            this.f9850b.n(i2, i5);
            return;
        }
        int i6 = Integer.MIN_VALUE;
        int i7 = Integer.MAX_VALUE;
        int i8 = Integer.MIN_VALUE;
        int i9 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < v6; i10++) {
            View u6 = u(i10);
            Rect rect = this.f9850b.f5371q;
            y(u6, rect);
            int i11 = rect.left;
            if (i11 < i9) {
                i9 = i11;
            }
            int i12 = rect.right;
            if (i12 > i6) {
                i6 = i12;
            }
            int i13 = rect.top;
            if (i13 < i7) {
                i7 = i13;
            }
            int i14 = rect.bottom;
            if (i14 > i8) {
                i8 = i14;
            }
        }
        this.f9850b.f5371q.set(i9, i7, i6, i8);
        r0(this.f9850b.f5371q, i2, i5);
    }

    public C0805G t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0805G) {
            return new C0805G((C0805G) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0805G((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0805G(layoutParams);
    }

    public final void t0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f9850b = null;
            this.f9849a = null;
            this.f9859n = 0;
            this.f9860o = 0;
        } else {
            this.f9850b = recyclerView;
            this.f9849a = recyclerView.f5356e;
            this.f9859n = recyclerView.getWidth();
            this.f9860o = recyclerView.getHeight();
        }
        this.f9857l = 1073741824;
        this.f9858m = 1073741824;
    }

    public final View u(int i2) {
        i iVar = this.f9849a;
        if (iVar != null) {
            return iVar.j(i2);
        }
        return null;
    }

    public final boolean u0(View view, int i2, int i5, C0805G g5) {
        if (view.isLayoutRequested() || !this.h || !M(view.getWidth(), i2, g5.width) || !M(view.getHeight(), i5, g5.height)) {
            return true;
        }
        return false;
    }

    public final int v() {
        i iVar = this.f9849a;
        if (iVar != null) {
            return iVar.k();
        }
        return 0;
    }

    public boolean v0() {
        return false;
    }

    public final boolean w0(View view, int i2, int i5, C0805G g5) {
        if (!this.h || !M(view.getMeasuredWidth(), i2, g5.width) || !M(view.getMeasuredHeight(), i5, g5.height)) {
            return true;
        }
        return false;
    }

    public int x(C0770g gVar, P p6) {
        RecyclerView recyclerView = this.f9850b;
        if (recyclerView == null || recyclerView.f5376t == null || !d()) {
            return 1;
        }
        return this.f9850b.f5376t.a();
    }

    public abstract void x0(RecyclerView recyclerView, int i2);

    public void y(View view, Rect rect) {
        int[] iArr = RecyclerView.f5323B0;
        C0805G g5 = (C0805G) view.getLayoutParams();
        Rect rect2 = g5.f9862b;
        rect.set((view.getLeft() - rect2.left) - g5.leftMargin, (view.getTop() - rect2.top) - g5.topMargin, view.getRight() + rect2.right + g5.rightMargin, view.getBottom() + rect2.bottom + g5.bottomMargin);
    }

    public final void y0(C0827t tVar) {
        C0827t tVar2 = this.f9852e;
        if (!(tVar2 == null || tVar == tVar2 || !tVar2.f10053e)) {
            tVar2.i();
        }
        this.f9852e = tVar;
        RecyclerView recyclerView = this.f9850b;
        S s6 = recyclerView.f5362i0;
        s6.f9891p.removeCallbacks(s6);
        s6.f9888c.abortAnimation();
        if (tVar.h) {
            Log.w("RecyclerView", "An instance of " + tVar.getClass().getSimpleName() + " was started more than once. Each instance of" + tVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        tVar.f10051b = recyclerView;
        tVar.f10052c = this;
        int i2 = tVar.f10050a;
        if (i2 != -1) {
            recyclerView.f5365l0.f9875a = i2;
            tVar.f10053e = true;
            tVar.d = true;
            tVar.f10054f = recyclerView.f5378u.q(i2);
            tVar.f10051b.f5362i0.a();
            tVar.h = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public boolean z0() {
        return false;
    }

    public void X() {
    }

    public void Q(RecyclerView recyclerView) {
    }

    public void d0(Parcelable parcelable) {
    }

    public void f0(int i2) {
    }

    public void W(int i2, int i5) {
    }

    public void Y(int i2, int i5) {
    }

    public void Z(int i2, int i5) {
    }

    public void a0(int i2, int i5) {
    }

    public void i(int i2, C0407l lVar) {
    }

    public void h(int i2, int i5, P p6, C0407l lVar) {
    }
}
