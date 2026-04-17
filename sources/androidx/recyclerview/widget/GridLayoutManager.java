package androidx.recyclerview.widget;

import K.O;
import L.i;
import L.j;
import X4.d;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.measurement.a;
import com.google.crypto.tink.shaded.protobuf.C0407l;
import java.util.Arrays;
import java.util.WeakHashMap;
import k5.C0770g;
import m0.C0804F;
import m0.C0805G;
import m0.C0822n;
import m0.C0824p;
import m0.C0825q;
import m0.P;
import m0.r;

public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: E  reason: collision with root package name */
    public boolean f5301E = false;
    public int F = -1;

    /* renamed from: G  reason: collision with root package name */
    public int[] f5302G;

    /* renamed from: H  reason: collision with root package name */
    public View[] f5303H;

    /* renamed from: I  reason: collision with root package name */
    public final SparseIntArray f5304I = new SparseIntArray();

    /* renamed from: J  reason: collision with root package name */
    public final SparseIntArray f5305J = new SparseIntArray();

    /* renamed from: K  reason: collision with root package name */
    public final d f5306K = new d(29);

    /* renamed from: L  reason: collision with root package name */
    public final Rect f5307L = new Rect();

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i5) {
        super(context, attributeSet, i2, i5);
        l1(C0804F.I(context, attributeSet, i2, i5).f9847b);
    }

    public final void B0(P p6, r rVar, C0407l lVar) {
        int i2 = this.F;
        for (int i5 = 0; i5 < this.F && (r3 = rVar.d) >= 0 && r3 < p6.b() && i2 > 0; i5++) {
            lVar.a(rVar.d, Math.max(0, rVar.g));
            this.f5306K.getClass();
            i2--;
            rVar.d += rVar.f10041e;
        }
    }

    public final int J(C0770g gVar, P p6) {
        if (this.f5312p == 0) {
            return this.F;
        }
        if (p6.b() < 1) {
            return 0;
        }
        return h1(p6.b() - 1, gVar, p6) + 1;
    }

    public final View N0(C0770g gVar, P p6, int i2, int i5, int i6) {
        int i7;
        G0();
        int k6 = this.f5314r.k();
        int g = this.f5314r.g();
        if (i5 > i2) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        View view = null;
        View view2 = null;
        while (i2 != i5) {
            View u6 = u(i2);
            int H6 = C0804F.H(u6);
            if (H6 >= 0 && H6 < i6 && i1(H6, gVar, p6) == 0) {
                if (((C0805G) u6.getLayoutParams()).f9861a.i()) {
                    if (view2 == null) {
                        view2 = u6;
                    }
                } else if (this.f5314r.e(u6) < g && this.f5314r.b(u6) >= k6) {
                    return u6;
                } else {
                    if (view == null) {
                        view = u6;
                    }
                }
            }
            i2 += i7;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e1, code lost:
        if (r13 == r5) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0103, code lost:
        if (r13 == r5) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (((java.util.ArrayList) r0.f9849a.d).contains(r3) != false) goto L_0x000d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View S(android.view.View r23, int r24, k5.C0770g r25, m0.P r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r25
            r2 = r26
            androidx.recyclerview.widget.RecyclerView r3 = r0.f9850b
            r4 = 0
            if (r3 != 0) goto L_0x000f
            r5 = r23
        L_0x000d:
            r3 = r4
            goto L_0x0025
        L_0x000f:
            r5 = r23
            android.view.View r3 = r3.A(r5)
            if (r3 != 0) goto L_0x0018
        L_0x0017:
            goto L_0x000d
        L_0x0018:
            c1.i r6 = r0.f9849a
            java.lang.Object r6 = r6.d
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            boolean r6 = r6.contains(r3)
            if (r6 == 0) goto L_0x0025
            goto L_0x0017
        L_0x0025:
            if (r3 != 0) goto L_0x0028
            return r4
        L_0x0028:
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            m0.n r6 = (m0.C0822n) r6
            int r7 = r6.f10023e
            int r6 = r6.f10024f
            int r6 = r6 + r7
            android.view.View r5 = super.S(r23, r24, r25, r26)
            if (r5 != 0) goto L_0x003a
            return r4
        L_0x003a:
            r5 = r24
            int r5 = r0.F0(r5)
            r9 = 1
            if (r5 != r9) goto L_0x0045
            r5 = r9
            goto L_0x0046
        L_0x0045:
            r5 = 0
        L_0x0046:
            boolean r10 = r0.f5317u
            r11 = -1
            if (r5 == r10) goto L_0x0053
            int r5 = r22.v()
            int r5 = r5 - r9
            r10 = r11
            r12 = r10
            goto L_0x005a
        L_0x0053:
            int r5 = r22.v()
            r10 = r5
            r12 = r9
            r5 = 0
        L_0x005a:
            int r13 = r0.f5312p
            if (r13 != r9) goto L_0x0066
            boolean r13 = r22.S0()
            if (r13 == 0) goto L_0x0066
            r13 = r9
            goto L_0x0067
        L_0x0066:
            r13 = 0
        L_0x0067:
            int r14 = r0.h1(r5, r1, r2)
            r8 = r11
            r15 = r8
            r16 = r12
            r9 = 0
            r12 = 0
            r11 = r5
            r5 = r4
        L_0x0073:
            if (r11 == r10) goto L_0x0081
            r17 = r10
            int r10 = r0.h1(r11, r1, r2)
            android.view.View r1 = r0.u(r11)
            if (r1 != r3) goto L_0x0085
        L_0x0081:
            r21 = r5
            goto L_0x013d
        L_0x0085:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0098
            if (r10 == r14) goto L_0x0098
            if (r4 == 0) goto L_0x0090
            goto L_0x0081
        L_0x0090:
            r18 = r3
            r21 = r5
        L_0x0094:
            r19 = r9
            goto L_0x012d
        L_0x0098:
            android.view.ViewGroup$LayoutParams r10 = r1.getLayoutParams()
            m0.n r10 = (m0.C0822n) r10
            int r2 = r10.f10023e
            r18 = r3
            int r3 = r10.f10024f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00b0
            if (r2 != r7) goto L_0x00b0
            if (r3 != r6) goto L_0x00b0
            return r1
        L_0x00b0:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00b8
            if (r4 == 0) goto L_0x00c0
        L_0x00b8:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00c5
            if (r5 != 0) goto L_0x00c5
        L_0x00c0:
            r21 = r5
        L_0x00c2:
            r19 = r9
            goto L_0x0105
        L_0x00c5:
            int r19 = java.lang.Math.max(r2, r7)
            int r20 = java.lang.Math.min(r3, r6)
            r21 = r5
            int r5 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00e4
            if (r5 <= r9) goto L_0x00da
        L_0x00d9:
            goto L_0x00c2
        L_0x00da:
            if (r5 != r9) goto L_0x0094
            if (r2 <= r15) goto L_0x00e0
            r5 = 1
            goto L_0x00e1
        L_0x00e0:
            r5 = 0
        L_0x00e1:
            if (r13 != r5) goto L_0x0094
            goto L_0x00d9
        L_0x00e4:
            if (r4 != 0) goto L_0x0094
            r19 = r9
            m0.a0 r9 = r0.f9851c
            boolean r9 = r9.m(r1)
            if (r9 == 0) goto L_0x00f9
            m0.a0 r9 = r0.d
            boolean r9 = r9.m(r1)
            if (r9 == 0) goto L_0x00f9
            goto L_0x012d
        L_0x00f9:
            if (r5 <= r12) goto L_0x00fc
            goto L_0x0105
        L_0x00fc:
            if (r5 != r12) goto L_0x012d
            if (r2 <= r8) goto L_0x0102
            r5 = 1
            goto L_0x0103
        L_0x0102:
            r5 = 0
        L_0x0103:
            if (r13 != r5) goto L_0x012d
        L_0x0105:
            boolean r5 = r1.hasFocusable()
            if (r5 == 0) goto L_0x011c
            int r4 = r10.f10023e
            int r3 = java.lang.Math.min(r3, r6)
            int r2 = java.lang.Math.max(r2, r7)
            int r9 = r3 - r2
            r15 = r4
            r5 = r21
            r4 = r1
            goto L_0x0131
        L_0x011c:
            int r5 = r10.f10023e
            int r3 = java.lang.Math.min(r3, r6)
            int r2 = java.lang.Math.max(r2, r7)
            int r12 = r3 - r2
            r8 = r5
            r9 = r19
            r5 = r1
            goto L_0x0131
        L_0x012d:
            r9 = r19
            r5 = r21
        L_0x0131:
            int r11 = r11 + r16
            r1 = r25
            r2 = r26
            r10 = r17
            r3 = r18
            goto L_0x0073
        L_0x013d:
            if (r4 == 0) goto L_0x0140
            goto L_0x0142
        L_0x0140:
            r4 = r21
        L_0x0142:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.S(android.view.View, int, k5.g, m0.P):android.view.View");
    }

    public final void T0(C0770g gVar, P p6, r rVar, C0825q qVar) {
        boolean z3;
        int i2;
        boolean z4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z5;
        View b6;
        C0770g gVar2 = gVar;
        P p7 = p6;
        r rVar2 = rVar;
        C0825q qVar2 = qVar;
        int j6 = this.f5314r.j();
        if (j6 != 1073741824) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (v() > 0) {
            i2 = this.f5302G[this.F];
        } else {
            i2 = 0;
        }
        if (z3) {
            m1();
        }
        if (rVar2.f10041e == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        int i14 = this.F;
        if (!z4) {
            i14 = i1(rVar2.d, gVar2, p7) + j1(rVar2.d, gVar2, p7);
        }
        int i15 = 0;
        while (i15 < this.F && (r14 = rVar2.d) >= 0 && r14 < p6.b() && i14 > 0) {
            int i16 = rVar2.d;
            int j12 = j1(i16, gVar2, p7);
            if (j12 <= this.F) {
                i14 -= j12;
                if (i14 < 0 || (b6 = rVar2.b(gVar2)) == null) {
                    break;
                }
                this.f5303H[i15] = b6;
                i15++;
            } else {
                StringBuilder h = a.h("Item at position ", i16, " requires ", j12, " spans but GridLayoutManager has only ");
                h.append(this.F);
                h.append(" spans.");
                throw new IllegalArgumentException(h.toString());
            }
        }
        if (i15 == 0) {
            qVar2.f10036b = true;
            return;
        }
        if (z4) {
            i5 = 1;
            i6 = i15;
            i7 = 0;
        } else {
            i7 = i15 - 1;
            i6 = -1;
            i5 = -1;
        }
        int i17 = 0;
        while (i7 != i6) {
            View view = this.f5303H[i7];
            C0822n nVar = (C0822n) view.getLayoutParams();
            int j13 = j1(C0804F.H(view), gVar2, p7);
            nVar.f10024f = j13;
            nVar.f10023e = i17;
            i17 += j13;
            i7 += i5;
        }
        float f6 = 0.0f;
        int i18 = 0;
        for (int i19 = 0; i19 < i15; i19++) {
            View view2 = this.f5303H[i19];
            if (rVar2.f10045k != null) {
                z5 = false;
                if (z4) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z4) {
                z5 = false;
                b(view2, -1, false);
            } else {
                z5 = false;
                b(view2, 0, false);
            }
            RecyclerView recyclerView = this.f9850b;
            Rect rect = this.f5307L;
            if (recyclerView == null) {
                rect.set(z5 ? 1 : 0, z5, z5, z5);
            } else {
                rect.set(recyclerView.J(view2));
            }
            k1(view2, j6, z5);
            int c3 = this.f5314r.c(view2);
            if (c3 > i18) {
                i18 = c3;
            }
            float d = (((float) this.f5314r.d(view2)) * 1.0f) / ((float) ((C0822n) view2.getLayoutParams()).f10024f);
            if (d > f6) {
                f6 = d;
            }
        }
        if (z3) {
            e1(Math.max(Math.round(f6 * ((float) this.F)), i2));
            i18 = 0;
            for (int i20 = 0; i20 < i15; i20++) {
                View view3 = this.f5303H[i20];
                k1(view3, 1073741824, true);
                int c6 = this.f5314r.c(view3);
                if (c6 > i18) {
                    i18 = c6;
                }
            }
        }
        for (int i21 = 0; i21 < i15; i21++) {
            View view4 = this.f5303H[i21];
            if (this.f5314r.c(view4) != i18) {
                C0822n nVar2 = (C0822n) view4.getLayoutParams();
                Rect rect2 = nVar2.f9862b;
                int i22 = rect2.top + rect2.bottom + nVar2.topMargin + nVar2.bottomMargin;
                int i23 = rect2.left + rect2.right + nVar2.leftMargin + nVar2.rightMargin;
                int g1 = g1(nVar2.f10023e, nVar2.f10024f);
                if (this.f5312p == 1) {
                    i13 = C0804F.w(g1, 1073741824, i23, false, nVar2.width);
                    i12 = View.MeasureSpec.makeMeasureSpec(i18 - i22, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18 - i23, 1073741824);
                    i12 = C0804F.w(g1, 1073741824, i22, false, nVar2.height);
                    i13 = makeMeasureSpec;
                }
                if (w0(view4, i13, i12, (C0805G) view4.getLayoutParams())) {
                    view4.measure(i13, i12);
                }
            }
        }
        qVar2.f10035a = i18;
        if (this.f5312p != 1) {
            if (rVar2.f10042f == -1) {
                int i24 = rVar2.f10039b;
                i10 = i24 - i18;
                i9 = i24;
            } else {
                int i25 = rVar2.f10039b;
                i9 = i25 + i18;
                i10 = i25;
            }
            i11 = 0;
            i8 = 0;
        } else if (rVar2.f10042f == -1) {
            int i26 = rVar2.f10039b;
            i10 = 0;
            i9 = 0;
            int i27 = i26;
            i8 = i26 - i18;
            i11 = i27;
        } else {
            i8 = rVar2.f10039b;
            i11 = i8 + i18;
            i10 = 0;
            i9 = 0;
        }
        for (int i28 = 0; i28 < i15; i28++) {
            View view5 = this.f5303H[i28];
            C0822n nVar3 = (C0822n) view5.getLayoutParams();
            if (this.f5312p != 1) {
                int G6 = G() + this.f5302G[nVar3.f10023e];
                i8 = G6;
                i11 = this.f5314r.d(view5) + G6;
            } else if (S0()) {
                int E6 = E() + this.f5302G[this.F - nVar3.f10023e];
                i9 = E6;
                i10 = E6 - this.f5314r.d(view5);
            } else {
                i10 = E() + this.f5302G[nVar3.f10023e];
                i9 = this.f5314r.d(view5) + i10;
            }
            C0804F.N(view5, i10, i8, i9, i11);
            if (nVar3.f9861a.i() || nVar3.f9861a.l()) {
                qVar2.f10037c = true;
            }
            qVar2.d = view5.hasFocusable() | qVar2.d;
        }
        Arrays.fill(this.f5303H, (Object) null);
    }

    public final void U0(C0770g gVar, P p6, C0824p pVar, int i2) {
        boolean z3;
        m1();
        if (p6.b() > 0 && !p6.g) {
            if (i2 == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            int i12 = i1(pVar.f10032b, gVar, p6);
            if (z3) {
                while (i12 > 0) {
                    int i5 = pVar.f10032b;
                    if (i5 <= 0) {
                        break;
                    }
                    int i6 = i5 - 1;
                    pVar.f10032b = i6;
                    i12 = i1(i6, gVar, p6);
                }
            } else {
                int b6 = p6.b() - 1;
                int i7 = pVar.f10032b;
                while (i7 < b6) {
                    int i8 = i7 + 1;
                    int i13 = i1(i8, gVar, p6);
                    if (i13 <= i12) {
                        break;
                    }
                    i7 = i8;
                    i12 = i13;
                }
                pVar.f10032b = i7;
            }
        }
        f1();
    }

    public final void V(C0770g gVar, P p6, View view, j jVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0822n)) {
            U(view, jVar);
            return;
        }
        C0822n nVar = (C0822n) layoutParams;
        int h12 = h1(nVar.f9861a.b(), gVar, p6);
        if (this.f5312p == 0) {
            jVar.i(i.a(nVar.f10023e, nVar.f10024f, h12, false, 1));
        } else {
            jVar.i(i.a(h12, 1, nVar.f10023e, false, nVar.f10024f));
        }
    }

    public final void W(int i2, int i5) {
        d dVar = this.f5306K;
        dVar.D();
        ((SparseIntArray) dVar.f4210c).clear();
    }

    public final void X() {
        d dVar = this.f5306K;
        dVar.D();
        ((SparseIntArray) dVar.f4210c).clear();
    }

    public final void Y(int i2, int i5) {
        d dVar = this.f5306K;
        dVar.D();
        ((SparseIntArray) dVar.f4210c).clear();
    }

    public final void Z(int i2, int i5) {
        d dVar = this.f5306K;
        dVar.D();
        ((SparseIntArray) dVar.f4210c).clear();
    }

    public final void a0(int i2, int i5) {
        d dVar = this.f5306K;
        dVar.D();
        ((SparseIntArray) dVar.f4210c).clear();
    }

    public final void a1(boolean z3) {
        if (!z3) {
            super.a1(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public final void b0(C0770g gVar, P p6) {
        boolean z3 = p6.g;
        SparseIntArray sparseIntArray = this.f5305J;
        SparseIntArray sparseIntArray2 = this.f5304I;
        if (z3) {
            int v6 = v();
            for (int i2 = 0; i2 < v6; i2++) {
                C0822n nVar = (C0822n) u(i2).getLayoutParams();
                int b6 = nVar.f9861a.b();
                sparseIntArray2.put(b6, nVar.f10024f);
                sparseIntArray.put(b6, nVar.f10023e);
            }
        }
        super.b0(gVar, p6);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    public final void c0(P p6) {
        super.c0(p6);
        this.f5301E = false;
    }

    public final void e1(int i2) {
        int i5;
        int[] iArr = this.f5302G;
        int i6 = this.F;
        if (!(iArr != null && iArr.length == i6 + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i6 + 1)];
        }
        int i7 = 0;
        iArr[0] = 0;
        int i8 = i2 / i6;
        int i9 = i2 % i6;
        int i10 = 0;
        for (int i11 = 1; i11 <= i6; i11++) {
            i7 += i9;
            if (i7 <= 0 || i6 - i7 >= i9) {
                i5 = i8;
            } else {
                i5 = i8 + 1;
                i7 -= i6;
            }
            i10 += i5;
            iArr[i11] = i10;
        }
        this.f5302G = iArr;
    }

    public final boolean f(C0805G g) {
        return g instanceof C0822n;
    }

    public final void f1() {
        View[] viewArr = this.f5303H;
        if (viewArr == null || viewArr.length != this.F) {
            this.f5303H = new View[this.F];
        }
    }

    public final int g1(int i2, int i5) {
        if (this.f5312p != 1 || !S0()) {
            int[] iArr = this.f5302G;
            return iArr[i5 + i2] - iArr[i2];
        }
        int[] iArr2 = this.f5302G;
        int i6 = this.F;
        return iArr2[i6 - i2] - iArr2[(i6 - i2) - i5];
    }

    public final int h1(int i2, C0770g gVar, P p6) {
        boolean z3 = p6.g;
        d dVar = this.f5306K;
        if (!z3) {
            int i5 = this.F;
            dVar.getClass();
            return d.A(i2, i5);
        }
        int d = gVar.d(i2);
        if (d == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i2);
            return 0;
        }
        int i6 = this.F;
        dVar.getClass();
        return d.A(d, i6);
    }

    public final int i1(int i2, C0770g gVar, P p6) {
        boolean z3 = p6.g;
        d dVar = this.f5306K;
        if (!z3) {
            int i5 = this.F;
            dVar.getClass();
            return i2 % i5;
        }
        int i6 = this.f5305J.get(i2, -1);
        if (i6 != -1) {
            return i6;
        }
        int d = gVar.d(i2);
        if (d == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
            return 0;
        }
        int i7 = this.F;
        dVar.getClass();
        return d % i7;
    }

    public final int j1(int i2, C0770g gVar, P p6) {
        boolean z3 = p6.g;
        d dVar = this.f5306K;
        if (!z3) {
            dVar.getClass();
            return 1;
        }
        int i5 = this.f5304I.get(i2, -1);
        if (i5 != -1) {
            return i5;
        }
        if (gVar.d(i2) == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
            return 1;
        }
        dVar.getClass();
        return 1;
    }

    public final int k(P p6) {
        return D0(p6);
    }

    public final void k1(View view, int i2, boolean z3) {
        int i5;
        int i6;
        boolean z4;
        C0822n nVar = (C0822n) view.getLayoutParams();
        Rect rect = nVar.f9862b;
        int i7 = rect.top + rect.bottom + nVar.topMargin + nVar.bottomMargin;
        int i8 = rect.left + rect.right + nVar.leftMargin + nVar.rightMargin;
        int g1 = g1(nVar.f10023e, nVar.f10024f);
        if (this.f5312p == 1) {
            i5 = C0804F.w(g1, i2, i8, false, nVar.width);
            i6 = C0804F.w(this.f5314r.l(), this.f9858m, i7, true, nVar.height);
        } else {
            int w6 = C0804F.w(g1, i2, i7, false, nVar.height);
            int w7 = C0804F.w(this.f5314r.l(), this.f9857l, i8, true, nVar.width);
            i6 = w6;
            i5 = w7;
        }
        C0805G g = (C0805G) view.getLayoutParams();
        if (z3) {
            z4 = w0(view, i5, i6, g);
        } else {
            z4 = u0(view, i5, i6, g);
        }
        if (z4) {
            view.measure(i5, i6);
        }
    }

    public final int l(P p6) {
        return E0(p6);
    }

    public final void l1(int i2) {
        if (i2 != this.F) {
            this.f5301E = true;
            if (i2 >= 1) {
                this.F = i2;
                this.f5306K.D();
                l0();
                return;
            }
            throw new IllegalArgumentException(a.f(i2, "Span count should be at least 1. Provided "));
        }
    }

    public final int m0(int i2, C0770g gVar, P p6) {
        m1();
        f1();
        return super.m0(i2, gVar, p6);
    }

    public final void m1() {
        int D4;
        int G6;
        if (this.f5312p == 1) {
            D4 = this.f9859n - F();
            G6 = E();
        } else {
            D4 = this.f9860o - D();
            G6 = G();
        }
        e1(D4 - G6);
    }

    public final int n(P p6) {
        return D0(p6);
    }

    public final int o(P p6) {
        return E0(p6);
    }

    public final int o0(int i2, C0770g gVar, P p6) {
        m1();
        f1();
        return super.o0(i2, gVar, p6);
    }

    public final C0805G r() {
        if (this.f5312p == 0) {
            return new C0822n(-2, -1);
        }
        return new C0822n(-1, -2);
    }

    public final void r0(Rect rect, int i2, int i5) {
        int i6;
        int i7;
        if (this.f5302G == null) {
            super.r0(rect, i2, i5);
        }
        int F6 = F() + E();
        int D4 = D() + G();
        if (this.f5312p == 1) {
            int height = rect.height() + D4;
            RecyclerView recyclerView = this.f9850b;
            WeakHashMap weakHashMap = O.f1352a;
            i7 = C0804F.g(i5, height, recyclerView.getMinimumHeight());
            int[] iArr = this.f5302G;
            i6 = C0804F.g(i2, iArr[iArr.length - 1] + F6, this.f9850b.getMinimumWidth());
        } else {
            int width = rect.width() + F6;
            RecyclerView recyclerView2 = this.f9850b;
            WeakHashMap weakHashMap2 = O.f1352a;
            i6 = C0804F.g(i2, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f5302G;
            i7 = C0804F.g(i5, iArr2[iArr2.length - 1] + D4, this.f9850b.getMinimumHeight());
        }
        this.f9850b.setMeasuredDimension(i6, i7);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [m0.n, m0.G] */
    public final C0805G s(Context context, AttributeSet attributeSet) {
        ? g = new C0805G(context, attributeSet);
        g.f10023e = -1;
        g.f10024f = 0;
        return g;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [m0.n, m0.G] */
    /* JADX WARNING: type inference failed for: r0v2, types: [m0.n, m0.G] */
    public final C0805G t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ? g = new C0805G((ViewGroup.MarginLayoutParams) layoutParams);
            g.f10023e = -1;
            g.f10024f = 0;
            return g;
        }
        ? g5 = new C0805G(layoutParams);
        g5.f10023e = -1;
        g5.f10024f = 0;
        return g5;
    }

    public final int x(C0770g gVar, P p6) {
        if (this.f5312p == 1) {
            return this.F;
        }
        if (p6.b() < 1) {
            return 0;
        }
        return h1(p6.b() - 1, gVar, p6) + 1;
    }

    public final boolean z0() {
        if (this.f5322z != null || this.f5301E) {
            return false;
        }
        return true;
    }

    public GridLayoutManager(int i2) {
        super(1);
        l1(i2);
    }
}
