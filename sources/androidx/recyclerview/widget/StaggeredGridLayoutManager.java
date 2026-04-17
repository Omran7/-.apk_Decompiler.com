package androidx.recyclerview.widget;

import L.i;
import L.j;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.emoji2.text.g;
import com.google.android.gms.common.api.f;
import com.google.crypto.tink.shaded.protobuf.C0407l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import k.C0737s0;
import k5.C0770g;
import m0.C0803E;
import m0.C0804F;
import m0.C0805G;
import m0.C0823o;
import m0.C0827t;
import m0.O;
import m0.P;
import m0.X;
import m0.Y;
import m0.a0;
import m0.b0;
import m0.c0;

public class StaggeredGridLayoutManager extends C0804F implements O {

    /* renamed from: A  reason: collision with root package name */
    public int f5390A = Integer.MIN_VALUE;

    /* renamed from: B  reason: collision with root package name */
    public final a0 f5391B;

    /* renamed from: C  reason: collision with root package name */
    public final int f5392C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f5393D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f5394E;
    public b0 F;

    /* renamed from: G  reason: collision with root package name */
    public final Rect f5395G;

    /* renamed from: H  reason: collision with root package name */
    public final X f5396H;

    /* renamed from: I  reason: collision with root package name */
    public final boolean f5397I;

    /* renamed from: J  reason: collision with root package name */
    public int[] f5398J;

    /* renamed from: K  reason: collision with root package name */
    public final C0737s0 f5399K;

    /* renamed from: p  reason: collision with root package name */
    public final int f5400p = -1;

    /* renamed from: q  reason: collision with root package name */
    public final c0[] f5401q;

    /* renamed from: r  reason: collision with root package name */
    public final g f5402r;

    /* renamed from: s  reason: collision with root package name */
    public final g f5403s;

    /* renamed from: t  reason: collision with root package name */
    public final int f5404t;

    /* renamed from: u  reason: collision with root package name */
    public int f5405u;

    /* renamed from: v  reason: collision with root package name */
    public final C0823o f5406v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f5407w = false;

    /* renamed from: x  reason: collision with root package name */
    public boolean f5408x = false;

    /* renamed from: y  reason: collision with root package name */
    public final BitSet f5409y;

    /* renamed from: z  reason: collision with root package name */
    public int f5410z = -1;

    /* JADX WARNING: type inference failed for: r7v3, types: [m0.o, java.lang.Object] */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i5) {
        a0 a0Var = new a0(0);
        this.f5391B = a0Var;
        this.f5392C = 2;
        this.f5395G = new Rect();
        this.f5396H = new X(this);
        this.f5397I = true;
        this.f5399K = new C0737s0(this, 8);
        C0803E I6 = C0804F.I(context, attributeSet, i2, i5);
        int i6 = I6.f9846a;
        if (i6 == 0 || i6 == 1) {
            c((String) null);
            if (i6 != this.f5404t) {
                this.f5404t = i6;
                g gVar = this.f5402r;
                this.f5402r = this.f5403s;
                this.f5403s = gVar;
                l0();
            }
            int i7 = I6.f9847b;
            c((String) null);
            if (i7 != this.f5400p) {
                int[] iArr = (int[]) a0Var.f9925b;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                a0Var.f9926c = null;
                l0();
                this.f5400p = i7;
                this.f5409y = new BitSet(this.f5400p);
                this.f5401q = new c0[this.f5400p];
                for (int i8 = 0; i8 < this.f5400p; i8++) {
                    this.f5401q[i8] = new c0(this, i8);
                }
                l0();
            }
            boolean z3 = I6.f9848c;
            c((String) null);
            b0 b0Var = this.F;
            if (!(b0Var == null || b0Var.f9936q == z3)) {
                b0Var.f9936q = z3;
            }
            this.f5407w = z3;
            l0();
            ? obj = new Object();
            obj.f10025a = true;
            obj.f10029f = 0;
            obj.g = 0;
            this.f5406v = obj;
            this.f5402r = g.a(this, this.f5404t);
            this.f5403s = g.a(this, 1 - this.f5404t);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public static int d1(int i2, int i5, int i6) {
        if (i5 == 0 && i6 == 0) {
            return i2;
        }
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - i5) - i6), mode);
        }
        return i2;
    }

    public final int A0(int i2) {
        boolean z3;
        if (v() != 0) {
            if (i2 < K0()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 != this.f5408x) {
                return -1;
            }
            return 1;
        } else if (this.f5408x) {
            return 1;
        } else {
            return -1;
        }
    }

    public final boolean B0() {
        int i2;
        if (!(v() == 0 || this.f5392C == 0 || !this.g)) {
            if (this.f5408x) {
                i2 = L0();
                K0();
            } else {
                i2 = K0();
                L0();
            }
            a0 a0Var = this.f5391B;
            if (i2 == 0 && P0() != null) {
                int[] iArr = (int[]) a0Var.f9925b;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                a0Var.f9926c = null;
                this.f9853f = true;
                l0();
                return true;
            }
        }
        return false;
    }

    public final int C0(P p6) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f5402r;
        boolean z3 = !this.f5397I;
        return a.i(p6, gVar, H0(z3), G0(z3), this, this.f5397I);
    }

    public final int D0(P p6) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f5402r;
        boolean z3 = !this.f5397I;
        return a.j(p6, gVar, H0(z3), G0(z3), this, this.f5397I, this.f5408x);
    }

    public final int E0(P p6) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f5402r;
        boolean z3 = !this.f5397I;
        return a.k(p6, gVar, H0(z3), G0(z3), this, this.f5397I);
    }

    public final int F0(C0770g gVar, C0823o oVar, P p6) {
        int i2;
        int i5;
        int i6;
        int i7;
        int i8;
        c0 c0Var;
        boolean z3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        C0770g gVar2 = gVar;
        C0823o oVar2 = oVar;
        int i18 = 0;
        int i19 = 1;
        this.f5409y.set(0, this.f5400p, true);
        C0823o oVar3 = this.f5406v;
        if (oVar3.f10030i) {
            if (oVar2.f10028e == 1) {
                i2 = f.API_PRIORITY_OTHER;
            } else {
                i2 = Integer.MIN_VALUE;
            }
        } else if (oVar2.f10028e == 1) {
            i2 = oVar2.g + oVar2.f10026b;
        } else {
            i2 = oVar2.f10029f - oVar2.f10026b;
        }
        int i20 = oVar2.f10028e;
        for (int i21 = 0; i21 < this.f5400p; i21++) {
            if (!this.f5401q[i21].f9943a.isEmpty()) {
                c1(this.f5401q[i21], i20, i2);
            }
        }
        if (this.f5408x) {
            i5 = this.f5402r.g();
        } else {
            i5 = this.f5402r.k();
        }
        boolean z4 = false;
        while (true) {
            int i22 = oVar2.f10027c;
            if (i22 < 0 || i22 >= p6.b()) {
                i6 = i18;
            } else {
                i6 = i19;
            }
            if (i6 == 0 || (!oVar3.f10030i && this.f5409y.isEmpty())) {
                int i23 = i18;
            } else {
                View view = gVar2.n(oVar2.f10027c, Long.MAX_VALUE).f9893a;
                oVar2.f10027c += oVar2.d;
                Y y6 = (Y) view.getLayoutParams();
                int b6 = y6.f9861a.b();
                a0 a0Var = this.f5391B;
                int[] iArr = (int[]) a0Var.f9925b;
                if (iArr == null || b6 >= iArr.length) {
                    i8 = -1;
                } else {
                    i8 = iArr[b6];
                }
                if (i8 == -1) {
                    if (T0(oVar2.f10028e)) {
                        i17 = this.f5400p - i19;
                        i16 = -1;
                        i15 = -1;
                    } else {
                        i15 = i19;
                        i16 = this.f5400p;
                        i17 = i18;
                    }
                    c0 c0Var2 = null;
                    if (oVar2.f10028e == i19) {
                        int k6 = this.f5402r.k();
                        int i24 = f.API_PRIORITY_OTHER;
                        while (i17 != i16) {
                            c0 c0Var3 = this.f5401q[i17];
                            int f6 = c0Var3.f(k6);
                            if (f6 < i24) {
                                i24 = f6;
                                c0Var2 = c0Var3;
                            }
                            i17 += i15;
                        }
                    } else {
                        int g = this.f5402r.g();
                        int i25 = Integer.MIN_VALUE;
                        while (i17 != i16) {
                            c0 c0Var4 = this.f5401q[i17];
                            int h = c0Var4.h(g);
                            if (h > i25) {
                                c0Var2 = c0Var4;
                                i25 = h;
                            }
                            i17 += i15;
                        }
                    }
                    c0Var = c0Var2;
                    a0Var.i(b6);
                    ((int[]) a0Var.f9925b)[b6] = c0Var.f9946e;
                } else {
                    c0Var = this.f5401q[i8];
                }
                y6.f9917e = c0Var;
                if (oVar2.f10028e == 1) {
                    z3 = false;
                    b(view, -1, false);
                } else {
                    z3 = false;
                    b(view, 0, false);
                }
                if (this.f5404t == 1) {
                    i9 = 1;
                    R0(view, C0804F.w(this.f5405u, this.f9857l, z3 ? 1 : 0, z3, y6.width), C0804F.w(this.f9860o, this.f9858m, D() + G(), true, y6.height));
                } else {
                    i9 = 1;
                    R0(view, C0804F.w(this.f9859n, this.f9857l, F() + E(), true, y6.width), C0804F.w(this.f5405u, this.f9858m, 0, false, y6.height));
                }
                if (oVar2.f10028e == i9) {
                    i11 = c0Var.f(i5);
                    i10 = this.f5402r.c(view) + i11;
                } else {
                    i10 = c0Var.h(i5);
                    i11 = i10 - this.f5402r.c(view);
                }
                if (oVar2.f10028e == 1) {
                    c0 c0Var5 = y6.f9917e;
                    c0Var5.getClass();
                    Y y7 = (Y) view.getLayoutParams();
                    y7.f9917e = c0Var5;
                    ArrayList arrayList = c0Var5.f9943a;
                    arrayList.add(view);
                    c0Var5.f9945c = Integer.MIN_VALUE;
                    if (arrayList.size() == 1) {
                        c0Var5.f9944b = Integer.MIN_VALUE;
                    }
                    if (y7.f9861a.i() || y7.f9861a.l()) {
                        c0Var5.d = c0Var5.f9947f.f5402r.c(view) + c0Var5.d;
                    }
                } else {
                    c0 c0Var6 = y6.f9917e;
                    c0Var6.getClass();
                    Y y8 = (Y) view.getLayoutParams();
                    y8.f9917e = c0Var6;
                    ArrayList arrayList2 = c0Var6.f9943a;
                    arrayList2.add(0, view);
                    c0Var6.f9944b = Integer.MIN_VALUE;
                    if (arrayList2.size() == 1) {
                        c0Var6.f9945c = Integer.MIN_VALUE;
                    }
                    if (y8.f9861a.i() || y8.f9861a.l()) {
                        c0Var6.d = c0Var6.f9947f.f5402r.c(view) + c0Var6.d;
                    }
                }
                if (!Q0() || this.f5404t != 1) {
                    i12 = this.f5403s.k() + (c0Var.f9946e * this.f5405u);
                    i13 = this.f5403s.c(view) + i12;
                } else {
                    i13 = this.f5403s.g() - (((this.f5400p - 1) - c0Var.f9946e) * this.f5405u);
                    i12 = i13 - this.f5403s.c(view);
                }
                if (this.f5404t == 1) {
                    C0804F.N(view, i12, i11, i13, i10);
                } else {
                    C0804F.N(view, i11, i12, i10, i13);
                }
                c1(c0Var, oVar3.f10028e, i2);
                V0(gVar2, oVar3);
                if (!oVar3.h || !view.hasFocusable()) {
                    i14 = 0;
                } else {
                    i14 = 0;
                    this.f5409y.set(c0Var.f9946e, false);
                }
                i18 = i14;
                i19 = 1;
                z4 = true;
            }
        }
        int i232 = i18;
        if (!z4) {
            V0(gVar2, oVar3);
        }
        if (oVar3.f10028e == -1) {
            i7 = this.f5402r.k() - N0(this.f5402r.k());
        } else {
            i7 = M0(this.f5402r.g()) - this.f5402r.g();
        }
        if (i7 > 0) {
            return Math.min(oVar2.f10026b, i7);
        }
        return i232;
    }

    public final View G0(boolean z3) {
        int k6 = this.f5402r.k();
        int g = this.f5402r.g();
        View view = null;
        for (int v6 = v() - 1; v6 >= 0; v6--) {
            View u6 = u(v6);
            int e6 = this.f5402r.e(u6);
            int b6 = this.f5402r.b(u6);
            if (b6 > k6 && e6 < g) {
                if (b6 <= g || !z3) {
                    return u6;
                }
                if (view == null) {
                    view = u6;
                }
            }
        }
        return view;
    }

    public final View H0(boolean z3) {
        int k6 = this.f5402r.k();
        int g = this.f5402r.g();
        int v6 = v();
        View view = null;
        for (int i2 = 0; i2 < v6; i2++) {
            View u6 = u(i2);
            int e6 = this.f5402r.e(u6);
            if (this.f5402r.b(u6) > k6 && e6 < g) {
                if (e6 >= k6 || !z3) {
                    return u6;
                }
                if (view == null) {
                    view = u6;
                }
            }
        }
        return view;
    }

    public final void I0(C0770g gVar, P p6, boolean z3) {
        int g;
        int M02 = M0(Integer.MIN_VALUE);
        if (M02 != Integer.MIN_VALUE && (g = this.f5402r.g() - M02) > 0) {
            int i2 = g - (-Z0(-g, gVar, p6));
            if (z3 && i2 > 0) {
                this.f5402r.p(i2);
            }
        }
    }

    public final int J(C0770g gVar, P p6) {
        if (this.f5404t == 0) {
            return this.f5400p;
        }
        return super.J(gVar, p6);
    }

    public final void J0(C0770g gVar, P p6, boolean z3) {
        int k6;
        int N02 = N0(f.API_PRIORITY_OTHER);
        if (N02 != Integer.MAX_VALUE && (k6 = N02 - this.f5402r.k()) > 0) {
            int Z02 = k6 - Z0(k6, gVar, p6);
            if (z3 && Z02 > 0) {
                this.f5402r.p(-Z02);
            }
        }
    }

    public final int K0() {
        if (v() == 0) {
            return 0;
        }
        return C0804F.H(u(0));
    }

    public final boolean L() {
        if (this.f5392C != 0) {
            return true;
        }
        return false;
    }

    public final int L0() {
        int v6 = v();
        if (v6 == 0) {
            return 0;
        }
        return C0804F.H(u(v6 - 1));
    }

    public final int M0(int i2) {
        int f6 = this.f5401q[0].f(i2);
        for (int i5 = 1; i5 < this.f5400p; i5++) {
            int f7 = this.f5401q[i5].f(i2);
            if (f7 > f6) {
                f6 = f7;
            }
        }
        return f6;
    }

    public final int N0(int i2) {
        int h = this.f5401q[0].h(i2);
        for (int i5 = 1; i5 < this.f5400p; i5++) {
            int h6 = this.f5401q[i5].h(i2);
            if (h6 < h) {
                h = h6;
            }
        }
        return h;
    }

    public final void O(int i2) {
        super.O(i2);
        for (int i5 = 0; i5 < this.f5400p; i5++) {
            c0 c0Var = this.f5401q[i5];
            int i6 = c0Var.f9944b;
            if (i6 != Integer.MIN_VALUE) {
                c0Var.f9944b = i6 + i2;
            }
            int i7 = c0Var.f9945c;
            if (i7 != Integer.MIN_VALUE) {
                c0Var.f9945c = i7 + i2;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void O0(int r11, int r12, int r13) {
        /*
            r10 = this;
            boolean r0 = r10.f5408x
            if (r0 == 0) goto L_0x0009
            int r0 = r10.L0()
            goto L_0x000d
        L_0x0009:
            int r0 = r10.K0()
        L_0x000d:
            r1 = 8
            if (r13 != r1) goto L_0x001b
            if (r11 >= r12) goto L_0x0017
            int r2 = r12 + 1
        L_0x0015:
            r3 = r11
            goto L_0x001e
        L_0x0017:
            int r2 = r11 + 1
            r3 = r12
            goto L_0x001e
        L_0x001b:
            int r2 = r11 + r12
            goto L_0x0015
        L_0x001e:
            m0.a0 r4 = r10.f5391B
            java.lang.Object r5 = r4.f9925b
            int[] r5 = (int[]) r5
            r6 = -1
            if (r5 != 0) goto L_0x0029
            goto L_0x00aa
        L_0x0029:
            int r5 = r5.length
            if (r3 < r5) goto L_0x002e
            goto L_0x00aa
        L_0x002e:
            java.lang.Object r5 = r4.f9926c
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            if (r5 != 0) goto L_0x0036
        L_0x0034:
            r5 = r6
            goto L_0x0091
        L_0x0036:
            r7 = 0
            if (r5 != 0) goto L_0x003a
            goto L_0x0055
        L_0x003a:
            int r5 = r5.size()
            int r5 = r5 + -1
        L_0x0040:
            if (r5 < 0) goto L_0x0055
            java.lang.Object r8 = r4.f9926c
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.Object r8 = r8.get(r5)
            m0.Z r8 = (m0.Z) r8
            int r9 = r8.f9918a
            if (r9 != r3) goto L_0x0052
            r7 = r8
            goto L_0x0055
        L_0x0052:
            int r5 = r5 + -1
            goto L_0x0040
        L_0x0055:
            if (r7 == 0) goto L_0x005e
            java.lang.Object r5 = r4.f9926c
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r5.remove(r7)
        L_0x005e:
            java.lang.Object r5 = r4.f9926c
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            r7 = 0
        L_0x0067:
            if (r7 >= r5) goto L_0x007b
            java.lang.Object r8 = r4.f9926c
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.Object r8 = r8.get(r7)
            m0.Z r8 = (m0.Z) r8
            int r8 = r8.f9918a
            if (r8 < r3) goto L_0x0078
            goto L_0x007c
        L_0x0078:
            int r7 = r7 + 1
            goto L_0x0067
        L_0x007b:
            r7 = r6
        L_0x007c:
            if (r7 == r6) goto L_0x0034
            java.lang.Object r5 = r4.f9926c
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r5 = r5.get(r7)
            m0.Z r5 = (m0.Z) r5
            java.lang.Object r8 = r4.f9926c
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            r8.remove(r7)
            int r5 = r5.f9918a
        L_0x0091:
            if (r5 != r6) goto L_0x00a1
            java.lang.Object r5 = r4.f9925b
            int[] r5 = (int[]) r5
            int r7 = r5.length
            java.util.Arrays.fill(r5, r3, r7, r6)
            java.lang.Object r5 = r4.f9925b
            int[] r5 = (int[]) r5
            int r5 = r5.length
            goto L_0x00aa
        L_0x00a1:
            java.lang.Object r7 = r4.f9925b
            int[] r7 = (int[]) r7
            int r5 = r5 + 1
            java.util.Arrays.fill(r7, r3, r5, r6)
        L_0x00aa:
            r5 = 1
            if (r13 == r5) goto L_0x00be
            r6 = 2
            if (r13 == r6) goto L_0x00ba
            if (r13 == r1) goto L_0x00b3
            goto L_0x00c1
        L_0x00b3:
            r4.o(r11, r5)
            r4.n(r12, r5)
            goto L_0x00c1
        L_0x00ba:
            r4.o(r11, r12)
            goto L_0x00c1
        L_0x00be:
            r4.n(r11, r12)
        L_0x00c1:
            if (r2 > r0) goto L_0x00c4
            return
        L_0x00c4:
            boolean r11 = r10.f5408x
            if (r11 == 0) goto L_0x00cd
            int r11 = r10.K0()
            goto L_0x00d1
        L_0x00cd:
            int r11 = r10.L0()
        L_0x00d1:
            if (r3 > r11) goto L_0x00d6
            r10.l0()
        L_0x00d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.O0(int, int, int):void");
    }

    public final void P(int i2) {
        super.P(i2);
        for (int i5 = 0; i5 < this.f5400p; i5++) {
            c0 c0Var = this.f5401q[i5];
            int i6 = c0Var.f9944b;
            if (i6 != Integer.MIN_VALUE) {
                c0Var.f9944b = i6 + i2;
            }
            int i7 = c0Var.f9945c;
            if (i7 != Integer.MIN_VALUE) {
                c0Var.f9945c = i7 + i2;
            }
        }
    }

    public final View P0() {
        char c3;
        boolean z3;
        boolean z4;
        int v6 = v();
        int i2 = v6 - 1;
        BitSet bitSet = new BitSet(this.f5400p);
        bitSet.set(0, this.f5400p, true);
        int i5 = -1;
        if (this.f5404t != 1 || !Q0()) {
            c3 = 65535;
        } else {
            c3 = 1;
        }
        if (this.f5408x) {
            v6 = -1;
        } else {
            i2 = 0;
        }
        if (i2 < v6) {
            i5 = 1;
        }
        while (i2 != v6) {
            View u6 = u(i2);
            Y y6 = (Y) u6.getLayoutParams();
            if (bitSet.get(y6.f9917e.f9946e)) {
                c0 c0Var = y6.f9917e;
                if (this.f5408x) {
                    int i6 = c0Var.f9945c;
                    if (i6 == Integer.MIN_VALUE) {
                        c0Var.a();
                        i6 = c0Var.f9945c;
                    }
                    if (i6 < this.f5402r.g()) {
                        ArrayList arrayList = c0Var.f9943a;
                        ((Y) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                    }
                    bitSet.clear(y6.f9917e.f9946e);
                } else {
                    int i7 = c0Var.f9944b;
                    if (i7 == Integer.MIN_VALUE) {
                        View view = (View) c0Var.f9943a.get(0);
                        c0Var.f9944b = c0Var.f9947f.f5402r.e(view);
                        ((Y) view.getLayoutParams()).getClass();
                        i7 = c0Var.f9944b;
                    }
                    if (i7 > this.f5402r.k()) {
                        ((Y) ((View) c0Var.f9943a.get(0)).getLayoutParams()).getClass();
                    }
                    bitSet.clear(y6.f9917e.f9946e);
                }
                return u6;
            }
            i2 += i5;
            if (i2 != v6) {
                View u7 = u(i2);
                if (this.f5408x) {
                    int b6 = this.f5402r.b(u6);
                    int b7 = this.f5402r.b(u7);
                    if (b6 < b7) {
                        return u6;
                    }
                    if (b6 != b7) {
                        continue;
                    }
                } else {
                    int e6 = this.f5402r.e(u6);
                    int e7 = this.f5402r.e(u7);
                    if (e6 > e7) {
                        return u6;
                    }
                    if (e6 != e7) {
                        continue;
                    }
                }
                if (y6.f9917e.f9946e - ((Y) u7.getLayoutParams()).f9917e.f9946e < 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (c3 < 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z3 != z4) {
                    return u6;
                }
            }
        }
        return null;
    }

    public final boolean Q0() {
        if (C() == 1) {
            return true;
        }
        return false;
    }

    public final void R(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f9850b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f5399K);
        }
        for (int i2 = 0; i2 < this.f5400p; i2++) {
            this.f5401q[i2].b();
        }
        recyclerView.requestLayout();
    }

    public final void R0(View view, int i2, int i5) {
        RecyclerView recyclerView = this.f9850b;
        Rect rect = this.f5395G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.J(view));
        }
        Y y6 = (Y) view.getLayoutParams();
        int d12 = d1(i2, y6.leftMargin + rect.left, y6.rightMargin + rect.right);
        int d13 = d1(i5, y6.topMargin + rect.top, y6.bottomMargin + rect.bottom);
        if (u0(view, d12, d13, y6)) {
            view.measure(d12, d13);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004f, code lost:
        if (r8.f5404t == 1) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0054, code lost:
        if (r8.f5404t == 0) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0061, code lost:
        if (Q0() == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x006e, code lost:
        if (Q0() == false) goto L_0x0063;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0073 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View S(android.view.View r9, int r10, k5.C0770g r11, m0.P r12) {
        /*
            r8 = this;
            int r0 = r8.v()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            androidx.recyclerview.widget.RecyclerView r0 = r8.f9850b
            if (r0 != 0) goto L_0x000e
        L_0x000c:
            r9 = r1
            goto L_0x0022
        L_0x000e:
            android.view.View r9 = r0.A(r9)
            if (r9 != 0) goto L_0x0015
            goto L_0x000c
        L_0x0015:
            c1.i r0 = r8.f9849a
            java.lang.Object r0 = r0.d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L_0x0022
            goto L_0x000c
        L_0x0022:
            if (r9 != 0) goto L_0x0025
            return r1
        L_0x0025:
            r8.Y0()
            r0 = 1
            r2 = -1
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r0) goto L_0x0065
            r4 = 2
            if (r10 == r4) goto L_0x0057
            r4 = 17
            if (r10 == r4) goto L_0x0052
            r4 = 33
            if (r10 == r4) goto L_0x004d
            r4 = 66
            if (r10 == r4) goto L_0x0048
            r4 = 130(0x82, float:1.82E-43)
            if (r10 == r4) goto L_0x0043
        L_0x0041:
            r10 = r3
            goto L_0x0071
        L_0x0043:
            int r10 = r8.f5404t
            if (r10 != r0) goto L_0x0041
            goto L_0x005b
        L_0x0048:
            int r10 = r8.f5404t
            if (r10 != 0) goto L_0x0041
            goto L_0x005b
        L_0x004d:
            int r10 = r8.f5404t
            if (r10 != r0) goto L_0x0041
            goto L_0x0063
        L_0x0052:
            int r10 = r8.f5404t
            if (r10 != 0) goto L_0x0041
            goto L_0x0063
        L_0x0057:
            int r10 = r8.f5404t
            if (r10 != r0) goto L_0x005d
        L_0x005b:
            r10 = r0
            goto L_0x0071
        L_0x005d:
            boolean r10 = r8.Q0()
            if (r10 == 0) goto L_0x005b
        L_0x0063:
            r10 = r2
            goto L_0x0071
        L_0x0065:
            int r10 = r8.f5404t
            if (r10 != r0) goto L_0x006a
            goto L_0x0063
        L_0x006a:
            boolean r10 = r8.Q0()
            if (r10 == 0) goto L_0x0063
            goto L_0x005b
        L_0x0071:
            if (r10 != r3) goto L_0x0074
            return r1
        L_0x0074:
            android.view.ViewGroup$LayoutParams r3 = r9.getLayoutParams()
            m0.Y r3 = (m0.Y) r3
            r3.getClass()
            m0.c0 r3 = r3.f9917e
            if (r10 != r0) goto L_0x0086
            int r4 = r8.L0()
            goto L_0x008a
        L_0x0086:
            int r4 = r8.K0()
        L_0x008a:
            r8.b1(r4, r12)
            r8.a1(r10)
            m0.o r5 = r8.f5406v
            int r6 = r5.d
            int r6 = r6 + r4
            r5.f10027c = r6
            androidx.emoji2.text.g r6 = r8.f5402r
            int r6 = r6.l()
            float r6 = (float) r6
            r7 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r6 = r6 * r7
            int r6 = (int) r6
            r5.f10026b = r6
            r5.h = r0
            r6 = 0
            r5.f10025a = r6
            r8.F0(r11, r5, r12)
            boolean r11 = r8.f5408x
            r8.f5393D = r11
            android.view.View r11 = r3.g(r4, r10)
            if (r11 == 0) goto L_0x00ba
            if (r11 == r9) goto L_0x00ba
            return r11
        L_0x00ba:
            boolean r11 = r8.T0(r10)
            if (r11 == 0) goto L_0x00d5
            int r11 = r8.f5400p
            int r11 = r11 - r0
        L_0x00c3:
            if (r11 < 0) goto L_0x00ea
            m0.c0[] r12 = r8.f5401q
            r12 = r12[r11]
            android.view.View r12 = r12.g(r4, r10)
            if (r12 == 0) goto L_0x00d2
            if (r12 == r9) goto L_0x00d2
            return r12
        L_0x00d2:
            int r11 = r11 + -1
            goto L_0x00c3
        L_0x00d5:
            r11 = r6
        L_0x00d6:
            int r12 = r8.f5400p
            if (r11 >= r12) goto L_0x00ea
            m0.c0[] r12 = r8.f5401q
            r12 = r12[r11]
            android.view.View r12 = r12.g(r4, r10)
            if (r12 == 0) goto L_0x00e7
            if (r12 == r9) goto L_0x00e7
            return r12
        L_0x00e7:
            int r11 = r11 + 1
            goto L_0x00d6
        L_0x00ea:
            boolean r11 = r8.f5407w
            r11 = r11 ^ r0
            if (r10 != r2) goto L_0x00f1
            r12 = r0
            goto L_0x00f2
        L_0x00f1:
            r12 = r6
        L_0x00f2:
            if (r11 != r12) goto L_0x00f6
            r11 = r0
            goto L_0x00f7
        L_0x00f6:
            r11 = r6
        L_0x00f7:
            if (r11 == 0) goto L_0x00fe
            int r12 = r3.c()
            goto L_0x0102
        L_0x00fe:
            int r12 = r3.d()
        L_0x0102:
            android.view.View r12 = r8.q(r12)
            if (r12 == 0) goto L_0x010b
            if (r12 == r9) goto L_0x010b
            return r12
        L_0x010b:
            boolean r10 = r8.T0(r10)
            if (r10 == 0) goto L_0x013a
            int r10 = r8.f5400p
            int r10 = r10 - r0
        L_0x0114:
            if (r10 < 0) goto L_0x015d
            int r12 = r3.f9946e
            if (r10 != r12) goto L_0x011b
            goto L_0x0137
        L_0x011b:
            if (r11 == 0) goto L_0x0126
            m0.c0[] r12 = r8.f5401q
            r12 = r12[r10]
            int r12 = r12.c()
            goto L_0x012e
        L_0x0126:
            m0.c0[] r12 = r8.f5401q
            r12 = r12[r10]
            int r12 = r12.d()
        L_0x012e:
            android.view.View r12 = r8.q(r12)
            if (r12 == 0) goto L_0x0137
            if (r12 == r9) goto L_0x0137
            return r12
        L_0x0137:
            int r10 = r10 + -1
            goto L_0x0114
        L_0x013a:
            int r10 = r8.f5400p
            if (r6 >= r10) goto L_0x015d
            if (r11 == 0) goto L_0x0149
            m0.c0[] r10 = r8.f5401q
            r10 = r10[r6]
            int r10 = r10.c()
            goto L_0x0151
        L_0x0149:
            m0.c0[] r10 = r8.f5401q
            r10 = r10[r6]
            int r10 = r10.d()
        L_0x0151:
            android.view.View r10 = r8.q(r10)
            if (r10 == 0) goto L_0x015a
            if (r10 == r9) goto L_0x015a
            return r10
        L_0x015a:
            int r6 = r6 + 1
            goto L_0x013a
        L_0x015d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.S(android.view.View, int, k5.g, m0.P):android.view.View");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:234:0x040a, code lost:
        if (B0() != false) goto L_0x040e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void S0(k5.C0770g r17, m0.P r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            m0.b0 r3 = r0.F
            r4 = -1
            m0.X r5 = r0.f5396H
            if (r3 != 0) goto L_0x0011
            int r3 = r0.f5410z
            if (r3 == r4) goto L_0x001e
        L_0x0011:
            int r3 = r18.b()
            if (r3 != 0) goto L_0x001e
            r16.g0(r17)
            r5.a()
            return
        L_0x001e:
            boolean r3 = r5.f9915e
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L_0x002f
            int r3 = r0.f5410z
            if (r3 != r4) goto L_0x002f
            m0.b0 r3 = r0.F
            if (r3 == 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r3 = r7
            goto L_0x0030
        L_0x002f:
            r3 = r6
        L_0x0030:
            m0.a0 r8 = r0.f5391B
            r9 = 0
            androidx.recyclerview.widget.StaggeredGridLayoutManager r10 = r5.g
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == 0) goto L_0x020e
            r5.a()
            m0.b0 r12 = r0.F
            if (r12 == 0) goto L_0x00c3
            int r13 = r12.f9932c
            if (r13 <= 0) goto L_0x0088
            int r14 = r0.f5400p
            if (r13 != r14) goto L_0x007a
            r12 = r7
        L_0x0049:
            int r13 = r0.f5400p
            if (r12 >= r13) goto L_0x0088
            m0.c0[] r13 = r0.f5401q
            r13 = r13[r12]
            r13.b()
            m0.b0 r13 = r0.F
            int[] r14 = r13.d
            r14 = r14[r12]
            if (r14 == r11) goto L_0x006f
            boolean r13 = r13.f9937r
            if (r13 == 0) goto L_0x0068
            androidx.emoji2.text.g r13 = r0.f5402r
            int r13 = r13.g()
        L_0x0066:
            int r14 = r14 + r13
            goto L_0x006f
        L_0x0068:
            androidx.emoji2.text.g r13 = r0.f5402r
            int r13 = r13.k()
            goto L_0x0066
        L_0x006f:
            m0.c0[] r13 = r0.f5401q
            r13 = r13[r12]
            r13.f9944b = r14
            r13.f9945c = r14
            int r12 = r12 + 1
            goto L_0x0049
        L_0x007a:
            r12.d = r9
            r12.f9932c = r7
            r12.f9933e = r7
            r12.f9934f = r9
            r12.f9935p = r9
            int r13 = r12.f9931b
            r12.f9930a = r13
        L_0x0088:
            m0.b0 r12 = r0.F
            boolean r13 = r12.f9938s
            r0.f5394E = r13
            boolean r12 = r12.f9936q
            r0.c(r9)
            m0.b0 r13 = r0.F
            if (r13 == 0) goto L_0x009d
            boolean r14 = r13.f9936q
            if (r14 == r12) goto L_0x009d
            r13.f9936q = r12
        L_0x009d:
            r0.f5407w = r12
            r16.l0()
            r16.Y0()
            m0.b0 r12 = r0.F
            int r13 = r12.f9930a
            if (r13 == r4) goto L_0x00b2
            r0.f5410z = r13
            boolean r13 = r12.f9937r
            r5.f9914c = r13
            goto L_0x00b6
        L_0x00b2:
            boolean r13 = r0.f5408x
            r5.f9914c = r13
        L_0x00b6:
            int r13 = r12.f9933e
            if (r13 <= r6) goto L_0x00ca
            int[] r13 = r12.f9934f
            r8.f9925b = r13
            java.util.ArrayList r12 = r12.f9935p
            r8.f9926c = r12
            goto L_0x00ca
        L_0x00c3:
            r16.Y0()
            boolean r12 = r0.f5408x
            r5.f9914c = r12
        L_0x00ca:
            boolean r12 = r2.g
            if (r12 != 0) goto L_0x01cb
            int r12 = r0.f5410z
            if (r12 != r4) goto L_0x00d4
            goto L_0x01cb
        L_0x00d4:
            if (r12 < 0) goto L_0x01c7
            int r13 = r18.b()
            if (r12 < r13) goto L_0x00de
            goto L_0x01c7
        L_0x00de:
            m0.b0 r12 = r0.F
            if (r12 == 0) goto L_0x00f3
            int r13 = r12.f9930a
            if (r13 == r4) goto L_0x00f3
            int r12 = r12.f9932c
            if (r12 >= r6) goto L_0x00eb
            goto L_0x00f3
        L_0x00eb:
            r5.f9913b = r11
            int r12 = r0.f5410z
            r5.f9912a = r12
            goto L_0x020c
        L_0x00f3:
            int r12 = r0.f5410z
            android.view.View r12 = r0.q(r12)
            if (r12 == 0) goto L_0x0188
            boolean r13 = r0.f5408x
            if (r13 == 0) goto L_0x0104
            int r13 = r16.L0()
            goto L_0x0108
        L_0x0104:
            int r13 = r16.K0()
        L_0x0108:
            r5.f9912a = r13
            int r13 = r0.f5390A
            if (r13 == r11) goto L_0x013a
            boolean r13 = r5.f9914c
            if (r13 == 0) goto L_0x0126
            androidx.emoji2.text.g r13 = r0.f5402r
            int r13 = r13.g()
            int r14 = r0.f5390A
            int r13 = r13 - r14
            androidx.emoji2.text.g r14 = r0.f5402r
            int r12 = r14.b(r12)
            int r13 = r13 - r12
            r5.f9913b = r13
            goto L_0x020c
        L_0x0126:
            androidx.emoji2.text.g r13 = r0.f5402r
            int r13 = r13.k()
            int r14 = r0.f5390A
            int r13 = r13 + r14
            androidx.emoji2.text.g r14 = r0.f5402r
            int r12 = r14.e(r12)
            int r13 = r13 - r12
            r5.f9913b = r13
            goto L_0x020c
        L_0x013a:
            androidx.emoji2.text.g r13 = r0.f5402r
            int r13 = r13.c(r12)
            androidx.emoji2.text.g r14 = r0.f5402r
            int r14 = r14.l()
            if (r13 <= r14) goto L_0x015d
            boolean r12 = r5.f9914c
            if (r12 == 0) goto L_0x0153
            androidx.emoji2.text.g r12 = r0.f5402r
            int r12 = r12.g()
            goto L_0x0159
        L_0x0153:
            androidx.emoji2.text.g r12 = r0.f5402r
            int r12 = r12.k()
        L_0x0159:
            r5.f9913b = r12
            goto L_0x020c
        L_0x015d:
            androidx.emoji2.text.g r13 = r0.f5402r
            int r13 = r13.e(r12)
            androidx.emoji2.text.g r14 = r0.f5402r
            int r14 = r14.k()
            int r13 = r13 - r14
            if (r13 >= 0) goto L_0x0171
            int r12 = -r13
            r5.f9913b = r12
            goto L_0x020c
        L_0x0171:
            androidx.emoji2.text.g r13 = r0.f5402r
            int r13 = r13.g()
            androidx.emoji2.text.g r14 = r0.f5402r
            int r12 = r14.b(r12)
            int r13 = r13 - r12
            if (r13 >= 0) goto L_0x0184
            r5.f9913b = r13
            goto L_0x020c
        L_0x0184:
            r5.f9913b = r11
            goto L_0x020c
        L_0x0188:
            int r12 = r0.f5410z
            r5.f9912a = r12
            int r13 = r0.f5390A
            if (r13 != r11) goto L_0x01ad
            int r12 = r0.A0(r12)
            if (r12 != r6) goto L_0x0198
            r12 = r6
            goto L_0x0199
        L_0x0198:
            r12 = r7
        L_0x0199:
            r5.f9914c = r12
            if (r12 == 0) goto L_0x01a4
            androidx.emoji2.text.g r12 = r10.f5402r
            int r12 = r12.g()
            goto L_0x01aa
        L_0x01a4:
            androidx.emoji2.text.g r12 = r10.f5402r
            int r12 = r12.k()
        L_0x01aa:
            r5.f9913b = r12
            goto L_0x01c4
        L_0x01ad:
            boolean r12 = r5.f9914c
            if (r12 == 0) goto L_0x01bb
            androidx.emoji2.text.g r12 = r10.f5402r
            int r12 = r12.g()
            int r12 = r12 - r13
            r5.f9913b = r12
            goto L_0x01c4
        L_0x01bb:
            androidx.emoji2.text.g r12 = r10.f5402r
            int r12 = r12.k()
            int r12 = r12 + r13
            r5.f9913b = r12
        L_0x01c4:
            r5.d = r6
            goto L_0x020c
        L_0x01c7:
            r0.f5410z = r4
            r0.f5390A = r11
        L_0x01cb:
            boolean r12 = r0.f5393D
            if (r12 == 0) goto L_0x01ec
            int r12 = r18.b()
            int r13 = r16.v()
            int r13 = r13 - r6
        L_0x01d8:
            if (r13 < 0) goto L_0x01ea
            android.view.View r14 = r0.u(r13)
            int r14 = m0.C0804F.H(r14)
            if (r14 < 0) goto L_0x01e7
            if (r14 >= r12) goto L_0x01e7
            goto L_0x0208
        L_0x01e7:
            int r13 = r13 + -1
            goto L_0x01d8
        L_0x01ea:
            r14 = r7
            goto L_0x0208
        L_0x01ec:
            int r12 = r18.b()
            int r13 = r16.v()
            r14 = r7
        L_0x01f5:
            if (r14 >= r13) goto L_0x01ea
            android.view.View r15 = r0.u(r14)
            int r15 = m0.C0804F.H(r15)
            if (r15 < 0) goto L_0x0205
            if (r15 >= r12) goto L_0x0205
            r14 = r15
            goto L_0x0208
        L_0x0205:
            int r14 = r14 + 1
            goto L_0x01f5
        L_0x0208:
            r5.f9912a = r14
            r5.f9913b = r11
        L_0x020c:
            r5.f9915e = r6
        L_0x020e:
            m0.b0 r12 = r0.F
            if (r12 != 0) goto L_0x0231
            int r12 = r0.f5410z
            if (r12 != r4) goto L_0x0231
            boolean r12 = r5.f9914c
            boolean r13 = r0.f5393D
            if (r12 != r13) goto L_0x0224
            boolean r12 = r16.Q0()
            boolean r13 = r0.f5394E
            if (r12 == r13) goto L_0x0231
        L_0x0224:
            java.lang.Object r12 = r8.f9925b
            int[] r12 = (int[]) r12
            if (r12 == 0) goto L_0x022d
            java.util.Arrays.fill(r12, r4)
        L_0x022d:
            r8.f9926c = r9
            r5.d = r6
        L_0x0231:
            int r8 = r16.v()
            if (r8 <= 0) goto L_0x02dc
            m0.b0 r8 = r0.F
            if (r8 == 0) goto L_0x023f
            int r8 = r8.f9932c
            if (r8 >= r6) goto L_0x02dc
        L_0x023f:
            boolean r8 = r5.d
            if (r8 == 0) goto L_0x025e
            r3 = r7
        L_0x0244:
            int r8 = r0.f5400p
            if (r3 >= r8) goto L_0x02dc
            m0.c0[] r8 = r0.f5401q
            r8 = r8[r3]
            r8.b()
            int r8 = r5.f9913b
            if (r8 == r11) goto L_0x025b
            m0.c0[] r9 = r0.f5401q
            r9 = r9[r3]
            r9.f9944b = r8
            r9.f9945c = r8
        L_0x025b:
            int r3 = r3 + 1
            goto L_0x0244
        L_0x025e:
            if (r3 != 0) goto L_0x027c
            int[] r3 = r5.f9916f
            if (r3 != 0) goto L_0x0265
            goto L_0x027c
        L_0x0265:
            r3 = r7
        L_0x0266:
            int r8 = r0.f5400p
            if (r3 >= r8) goto L_0x02dc
            m0.c0[] r8 = r0.f5401q
            r8 = r8[r3]
            r8.b()
            int[] r9 = r5.f9916f
            r9 = r9[r3]
            r8.f9944b = r9
            r8.f9945c = r9
            int r3 = r3 + 1
            goto L_0x0266
        L_0x027c:
            r3 = r7
        L_0x027d:
            int r8 = r0.f5400p
            if (r3 >= r8) goto L_0x02bb
            m0.c0[] r8 = r0.f5401q
            r8 = r8[r3]
            boolean r9 = r0.f5408x
            int r12 = r5.f9913b
            if (r9 == 0) goto L_0x0290
            int r13 = r8.f(r11)
            goto L_0x0294
        L_0x0290:
            int r13 = r8.h(r11)
        L_0x0294:
            r8.b()
            if (r13 != r11) goto L_0x029a
            goto L_0x02b8
        L_0x029a:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r14 = r8.f9947f
            if (r9 == 0) goto L_0x02a6
            androidx.emoji2.text.g r15 = r14.f5402r
            int r15 = r15.g()
            if (r13 < r15) goto L_0x02b8
        L_0x02a6:
            if (r9 != 0) goto L_0x02b1
            androidx.emoji2.text.g r9 = r14.f5402r
            int r9 = r9.k()
            if (r13 <= r9) goto L_0x02b1
            goto L_0x02b8
        L_0x02b1:
            if (r12 == r11) goto L_0x02b4
            int r13 = r13 + r12
        L_0x02b4:
            r8.f9945c = r13
            r8.f9944b = r13
        L_0x02b8:
            int r3 = r3 + 1
            goto L_0x027d
        L_0x02bb:
            m0.c0[] r3 = r0.f5401q
            int r8 = r3.length
            int[] r9 = r5.f9916f
            if (r9 == 0) goto L_0x02c5
            int r9 = r9.length
            if (r9 >= r8) goto L_0x02cc
        L_0x02c5:
            m0.c0[] r9 = r10.f5401q
            int r9 = r9.length
            int[] r9 = new int[r9]
            r5.f9916f = r9
        L_0x02cc:
            r9 = r7
        L_0x02cd:
            if (r9 >= r8) goto L_0x02dc
            int[] r10 = r5.f9916f
            r12 = r3[r9]
            int r12 = r12.h(r11)
            r10[r9] = r12
            int r9 = r9 + 1
            goto L_0x02cd
        L_0x02dc:
            r16.p(r17)
            m0.o r3 = r0.f5406v
            r3.f10025a = r7
            androidx.emoji2.text.g r8 = r0.f5403s
            int r8 = r8.l()
            int r9 = r0.f5400p
            int r9 = r8 / r9
            r0.f5405u = r9
            androidx.emoji2.text.g r9 = r0.f5403s
            int r9 = r9.i()
            android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            int r8 = r5.f9912a
            r0.b1(r8, r2)
            boolean r8 = r5.f9914c
            if (r8 == 0) goto L_0x0315
            r0.a1(r4)
            r0.F0(r1, r3, r2)
            r0.a1(r6)
            int r4 = r5.f9912a
            int r8 = r3.d
            int r4 = r4 + r8
            r3.f10027c = r4
            r0.F0(r1, r3, r2)
            goto L_0x0328
        L_0x0315:
            r0.a1(r6)
            r0.F0(r1, r3, r2)
            r0.a1(r4)
            int r4 = r5.f9912a
            int r8 = r3.d
            int r4 = r4 + r8
            r3.f10027c = r4
            r0.F0(r1, r3, r2)
        L_0x0328:
            androidx.emoji2.text.g r3 = r0.f5403s
            int r3 = r3.i()
            r4 = 1073741824(0x40000000, float:2.0)
            if (r3 != r4) goto L_0x0334
            goto L_0x03d0
        L_0x0334:
            int r3 = r16.v()
            r4 = 0
            r8 = r7
        L_0x033a:
            if (r8 >= r3) goto L_0x035c
            android.view.View r9 = r0.u(r8)
            androidx.emoji2.text.g r10 = r0.f5403s
            int r10 = r10.c(r9)
            float r10 = (float) r10
            int r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r12 >= 0) goto L_0x034c
            goto L_0x0359
        L_0x034c:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            m0.Y r9 = (m0.Y) r9
            r9.getClass()
            float r4 = java.lang.Math.max(r4, r10)
        L_0x0359:
            int r8 = r8 + 1
            goto L_0x033a
        L_0x035c:
            int r8 = r0.f5405u
            int r9 = r0.f5400p
            float r9 = (float) r9
            float r4 = r4 * r9
            int r4 = java.lang.Math.round(r4)
            androidx.emoji2.text.g r9 = r0.f5403s
            int r9 = r9.i()
            if (r9 != r11) goto L_0x0378
            androidx.emoji2.text.g r9 = r0.f5403s
            int r9 = r9.l()
            int r4 = java.lang.Math.min(r4, r9)
        L_0x0378:
            int r9 = r0.f5400p
            int r9 = r4 / r9
            r0.f5405u = r9
            androidx.emoji2.text.g r9 = r0.f5403s
            int r9 = r9.i()
            android.view.View.MeasureSpec.makeMeasureSpec(r4, r9)
            int r4 = r0.f5405u
            if (r4 != r8) goto L_0x038c
            goto L_0x03d0
        L_0x038c:
            r4 = r7
        L_0x038d:
            if (r4 >= r3) goto L_0x03d0
            android.view.View r9 = r0.u(r4)
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            m0.Y r10 = (m0.Y) r10
            r10.getClass()
            boolean r11 = r16.Q0()
            if (r11 == 0) goto L_0x03b8
            int r11 = r0.f5404t
            if (r11 != r6) goto L_0x03b8
            int r11 = r0.f5400p
            int r11 = r11 - r6
            m0.c0 r10 = r10.f9917e
            int r10 = r10.f9946e
            int r11 = r11 - r10
            int r10 = -r11
            int r11 = r0.f5405u
            int r11 = r11 * r10
            int r10 = r10 * r8
            int r11 = r11 - r10
            r9.offsetLeftAndRight(r11)
            goto L_0x03cd
        L_0x03b8:
            m0.c0 r10 = r10.f9917e
            int r10 = r10.f9946e
            int r11 = r0.f5405u
            int r11 = r11 * r10
            int r10 = r10 * r8
            int r12 = r0.f5404t
            if (r12 != r6) goto L_0x03c9
            int r11 = r11 - r10
            r9.offsetLeftAndRight(r11)
            goto L_0x03cd
        L_0x03c9:
            int r11 = r11 - r10
            r9.offsetTopAndBottom(r11)
        L_0x03cd:
            int r4 = r4 + 1
            goto L_0x038d
        L_0x03d0:
            int r3 = r16.v()
            if (r3 <= 0) goto L_0x03e7
            boolean r3 = r0.f5408x
            if (r3 == 0) goto L_0x03e1
            r0.I0(r1, r2, r6)
            r0.J0(r1, r2, r7)
            goto L_0x03e7
        L_0x03e1:
            r0.J0(r1, r2, r6)
            r0.I0(r1, r2, r7)
        L_0x03e7:
            if (r19 == 0) goto L_0x040d
            boolean r3 = r2.g
            if (r3 != 0) goto L_0x040d
            int r3 = r0.f5392C
            if (r3 == 0) goto L_0x040d
            int r3 = r16.v()
            if (r3 <= 0) goto L_0x040d
            android.view.View r3 = r16.P0()
            if (r3 == 0) goto L_0x040d
            androidx.recyclerview.widget.RecyclerView r3 = r0.f9850b
            if (r3 == 0) goto L_0x0406
            k.s0 r4 = r0.f5399K
            r3.removeCallbacks(r4)
        L_0x0406:
            boolean r3 = r16.B0()
            if (r3 == 0) goto L_0x040d
            goto L_0x040e
        L_0x040d:
            r6 = r7
        L_0x040e:
            boolean r3 = r2.g
            if (r3 == 0) goto L_0x0415
            r5.a()
        L_0x0415:
            boolean r3 = r5.f9914c
            r0.f5393D = r3
            boolean r3 = r16.Q0()
            r0.f5394E = r3
            if (r6 == 0) goto L_0x0427
            r5.a()
            r0.S0(r1, r2, r7)
        L_0x0427:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.S0(k5.g, m0.P, boolean):void");
    }

    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (v() > 0) {
            View H02 = H0(false);
            View G02 = G0(false);
            if (H02 != null && G02 != null) {
                int H6 = C0804F.H(H02);
                int H7 = C0804F.H(G02);
                if (H6 < H7) {
                    accessibilityEvent.setFromIndex(H6);
                    accessibilityEvent.setToIndex(H7);
                    return;
                }
                accessibilityEvent.setFromIndex(H7);
                accessibilityEvent.setToIndex(H6);
            }
        }
    }

    public final boolean T0(int i2) {
        boolean z3;
        boolean z4;
        boolean z5;
        if (this.f5404t == 0) {
            if (i2 == -1) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5 != this.f5408x) {
                return true;
            }
            return false;
        }
        if (i2 == -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 == this.f5408x) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 == Q0()) {
            return true;
        }
        return false;
    }

    public final void U0(int i2, P p6) {
        int i5;
        int i6;
        if (i2 > 0) {
            i6 = L0();
            i5 = 1;
        } else {
            i6 = K0();
            i5 = -1;
        }
        C0823o oVar = this.f5406v;
        oVar.f10025a = true;
        b1(i6, p6);
        a1(i5);
        oVar.f10027c = i6 + oVar.d;
        oVar.f10026b = Math.abs(i2);
    }

    public final void V(C0770g gVar, P p6, View view, j jVar) {
        int i2;
        int i5;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof Y)) {
            U(view, jVar);
            return;
        }
        Y y6 = (Y) layoutParams;
        if (this.f5404t == 0) {
            c0 c0Var = y6.f9917e;
            if (c0Var == null) {
                i5 = -1;
            } else {
                i5 = c0Var.f9946e;
            }
            jVar.i(i.a(i5, 1, -1, false, -1));
            return;
        }
        c0 c0Var2 = y6.f9917e;
        if (c0Var2 == null) {
            i2 = -1;
        } else {
            i2 = c0Var2.f9946e;
        }
        jVar.i(i.a(-1, -1, i2, false, 1));
    }

    public final void V0(C0770g gVar, C0823o oVar) {
        int i2;
        int i5;
        if (oVar.f10025a && !oVar.f10030i) {
            if (oVar.f10026b != 0) {
                int i6 = 1;
                if (oVar.f10028e == -1) {
                    int i7 = oVar.f10029f;
                    int h = this.f5401q[0].h(i7);
                    while (i6 < this.f5400p) {
                        int h6 = this.f5401q[i6].h(i7);
                        if (h6 > h) {
                            h = h6;
                        }
                        i6++;
                    }
                    int i8 = i7 - h;
                    if (i8 < 0) {
                        i5 = oVar.g;
                    } else {
                        i5 = oVar.g - Math.min(i8, oVar.f10026b);
                    }
                    W0(gVar, i5);
                    return;
                }
                int i9 = oVar.g;
                int f6 = this.f5401q[0].f(i9);
                while (i6 < this.f5400p) {
                    int f7 = this.f5401q[i6].f(i9);
                    if (f7 < f6) {
                        f6 = f7;
                    }
                    i6++;
                }
                int i10 = f6 - oVar.g;
                if (i10 < 0) {
                    i2 = oVar.f10029f;
                } else {
                    i2 = Math.min(i10, oVar.f10026b) + oVar.f10029f;
                }
                X0(gVar, i2);
            } else if (oVar.f10028e == -1) {
                W0(gVar, oVar.g);
            } else {
                X0(gVar, oVar.f10029f);
            }
        }
    }

    public final void W(int i2, int i5) {
        O0(i2, i5, 1);
    }

    public final void W0(C0770g gVar, int i2) {
        int v6 = v() - 1;
        while (v6 >= 0) {
            View u6 = u(v6);
            if (this.f5402r.e(u6) >= i2 && this.f5402r.o(u6) >= i2) {
                Y y6 = (Y) u6.getLayoutParams();
                y6.getClass();
                if (y6.f9917e.f9943a.size() != 1) {
                    c0 c0Var = y6.f9917e;
                    ArrayList arrayList = c0Var.f9943a;
                    int size = arrayList.size();
                    View view = (View) arrayList.remove(size - 1);
                    Y y7 = (Y) view.getLayoutParams();
                    y7.f9917e = null;
                    if (y7.f9861a.i() || y7.f9861a.l()) {
                        c0Var.d -= c0Var.f9947f.f5402r.c(view);
                    }
                    if (size == 1) {
                        c0Var.f9944b = Integer.MIN_VALUE;
                    }
                    c0Var.f9945c = Integer.MIN_VALUE;
                    i0(u6, gVar);
                    v6--;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void X() {
        a0 a0Var = this.f5391B;
        int[] iArr = (int[]) a0Var.f9925b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        a0Var.f9926c = null;
        l0();
    }

    public final void X0(C0770g gVar, int i2) {
        while (v() > 0) {
            View u6 = u(0);
            if (this.f5402r.b(u6) <= i2 && this.f5402r.n(u6) <= i2) {
                Y y6 = (Y) u6.getLayoutParams();
                y6.getClass();
                if (y6.f9917e.f9943a.size() != 1) {
                    c0 c0Var = y6.f9917e;
                    ArrayList arrayList = c0Var.f9943a;
                    View view = (View) arrayList.remove(0);
                    Y y7 = (Y) view.getLayoutParams();
                    y7.f9917e = null;
                    if (arrayList.size() == 0) {
                        c0Var.f9945c = Integer.MIN_VALUE;
                    }
                    if (y7.f9861a.i() || y7.f9861a.l()) {
                        c0Var.d -= c0Var.f9947f.f5402r.c(view);
                    }
                    c0Var.f9944b = Integer.MIN_VALUE;
                    i0(u6, gVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void Y(int i2, int i5) {
        O0(i2, i5, 8);
    }

    public final void Y0() {
        if (this.f5404t == 1 || !Q0()) {
            this.f5408x = this.f5407w;
        } else {
            this.f5408x = !this.f5407w;
        }
    }

    public final void Z(int i2, int i5) {
        O0(i2, i5, 2);
    }

    public final int Z0(int i2, C0770g gVar, P p6) {
        if (v() == 0 || i2 == 0) {
            return 0;
        }
        U0(i2, p6);
        C0823o oVar = this.f5406v;
        int F02 = F0(gVar, oVar, p6);
        if (oVar.f10026b >= F02) {
            if (i2 < 0) {
                i2 = -F02;
            } else {
                i2 = F02;
            }
        }
        this.f5402r.p(-i2);
        this.f5393D = this.f5408x;
        oVar.f10026b = 0;
        V0(gVar, oVar);
        return i2;
    }

    public final PointF a(int i2) {
        int A02 = A0(i2);
        PointF pointF = new PointF();
        if (A02 == 0) {
            return null;
        }
        if (this.f5404t == 0) {
            pointF.x = (float) A02;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) A02;
        }
        return pointF;
    }

    public final void a0(int i2, int i5) {
        O0(i2, i5, 4);
    }

    public final void a1(int i2) {
        boolean z3;
        C0823o oVar = this.f5406v;
        oVar.f10028e = i2;
        boolean z4 = this.f5408x;
        int i5 = 1;
        if (i2 == -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z4 != z3) {
            i5 = -1;
        }
        oVar.d = i5;
    }

    public final void b0(C0770g gVar, P p6) {
        S0(gVar, p6, true);
    }

    public final void b1(int i2, P p6) {
        boolean z3;
        int i5;
        int i6;
        int i7;
        boolean z4;
        C0823o oVar = this.f5406v;
        boolean z5 = false;
        oVar.f10026b = 0;
        oVar.f10027c = i2;
        C0827t tVar = this.f9852e;
        if (tVar == null || !tVar.f10053e) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z3 || (i7 = p6.f9875a) == -1) {
            i6 = 0;
            i5 = 0;
        } else {
            boolean z6 = this.f5408x;
            if (i7 < i2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z6 == z4) {
                i6 = this.f5402r.l();
                i5 = 0;
            } else {
                i5 = this.f5402r.l();
                i6 = 0;
            }
        }
        RecyclerView recyclerView = this.f9850b;
        if (recyclerView == null || !recyclerView.f5369p) {
            oVar.g = this.f5402r.f() + i6;
            oVar.f10029f = -i5;
        } else {
            oVar.f10029f = this.f5402r.k() - i5;
            oVar.g = this.f5402r.g() + i6;
        }
        oVar.h = false;
        oVar.f10025a = true;
        if (this.f5402r.i() == 0 && this.f5402r.f() == 0) {
            z5 = true;
        }
        oVar.f10030i = z5;
    }

    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    public final void c0(P p6) {
        this.f5410z = -1;
        this.f5390A = Integer.MIN_VALUE;
        this.F = null;
        this.f5396H.a();
    }

    public final void c1(c0 c0Var, int i2, int i5) {
        int i6 = c0Var.d;
        int i7 = c0Var.f9946e;
        if (i2 == -1) {
            int i8 = c0Var.f9944b;
            if (i8 == Integer.MIN_VALUE) {
                View view = (View) c0Var.f9943a.get(0);
                c0Var.f9944b = c0Var.f9947f.f5402r.e(view);
                ((Y) view.getLayoutParams()).getClass();
                i8 = c0Var.f9944b;
            }
            if (i8 + i6 <= i5) {
                this.f5409y.set(i7, false);
                return;
            }
            return;
        }
        int i9 = c0Var.f9945c;
        if (i9 == Integer.MIN_VALUE) {
            c0Var.a();
            i9 = c0Var.f9945c;
        }
        if (i9 - i6 >= i5) {
            this.f5409y.set(i7, false);
        }
    }

    public final boolean d() {
        if (this.f5404t == 0) {
            return true;
        }
        return false;
    }

    public final void d0(Parcelable parcelable) {
        if (parcelable instanceof b0) {
            this.F = (b0) parcelable;
            l0();
        }
    }

    public final boolean e() {
        if (this.f5404t == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object, m0.b0] */
    /* JADX WARNING: type inference failed for: r1v28, types: [android.os.Parcelable, java.lang.Object, m0.b0] */
    public final Parcelable e0() {
        int i2;
        View view;
        int i5;
        int k6;
        int[] iArr;
        b0 b0Var = this.F;
        if (b0Var != null) {
            ? obj = new Object();
            obj.f9932c = b0Var.f9932c;
            obj.f9930a = b0Var.f9930a;
            obj.f9931b = b0Var.f9931b;
            obj.d = b0Var.d;
            obj.f9933e = b0Var.f9933e;
            obj.f9934f = b0Var.f9934f;
            obj.f9936q = b0Var.f9936q;
            obj.f9937r = b0Var.f9937r;
            obj.f9938s = b0Var.f9938s;
            obj.f9935p = b0Var.f9935p;
            return obj;
        }
        ? obj2 = new Object();
        obj2.f9936q = this.f5407w;
        obj2.f9937r = this.f5393D;
        obj2.f9938s = this.f5394E;
        a0 a0Var = this.f5391B;
        if (a0Var == null || (iArr = (int[]) a0Var.f9925b) == null) {
            obj2.f9933e = 0;
        } else {
            obj2.f9934f = iArr;
            obj2.f9933e = iArr.length;
            obj2.f9935p = (ArrayList) a0Var.f9926c;
        }
        int i6 = -1;
        if (v() > 0) {
            if (this.f5393D) {
                i2 = L0();
            } else {
                i2 = K0();
            }
            obj2.f9930a = i2;
            if (this.f5408x) {
                view = G0(true);
            } else {
                view = H0(true);
            }
            if (view != null) {
                i6 = C0804F.H(view);
            }
            obj2.f9931b = i6;
            int i7 = this.f5400p;
            obj2.f9932c = i7;
            obj2.d = new int[i7];
            for (int i8 = 0; i8 < this.f5400p; i8++) {
                if (this.f5393D) {
                    i5 = this.f5401q[i8].f(Integer.MIN_VALUE);
                    if (i5 != Integer.MIN_VALUE) {
                        k6 = this.f5402r.g();
                    } else {
                        obj2.d[i8] = i5;
                    }
                } else {
                    i5 = this.f5401q[i8].h(Integer.MIN_VALUE);
                    if (i5 != Integer.MIN_VALUE) {
                        k6 = this.f5402r.k();
                    } else {
                        obj2.d[i8] = i5;
                    }
                }
                i5 -= k6;
                obj2.d[i8] = i5;
            }
        } else {
            obj2.f9930a = -1;
            obj2.f9931b = -1;
            obj2.f9932c = 0;
        }
        return obj2;
    }

    public final boolean f(C0805G g) {
        return g instanceof Y;
    }

    public final void f0(int i2) {
        if (i2 == 0) {
            B0();
        }
    }

    public final void h(int i2, int i5, P p6, C0407l lVar) {
        C0823o oVar;
        int f6;
        int i6;
        if (this.f5404t != 0) {
            i2 = i5;
        }
        if (v() != 0 && i2 != 0) {
            U0(i2, p6);
            int[] iArr = this.f5398J;
            if (iArr == null || iArr.length < this.f5400p) {
                this.f5398J = new int[this.f5400p];
            }
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                int i10 = this.f5400p;
                oVar = this.f5406v;
                if (i8 >= i10) {
                    break;
                }
                if (oVar.d == -1) {
                    f6 = oVar.f10029f;
                    i6 = this.f5401q[i8].h(f6);
                } else {
                    f6 = this.f5401q[i8].f(oVar.g);
                    i6 = oVar.g;
                }
                int i11 = f6 - i6;
                if (i11 >= 0) {
                    this.f5398J[i9] = i11;
                    i9++;
                }
                i8++;
            }
            Arrays.sort(this.f5398J, 0, i9);
            while (i7 < i9) {
                int i12 = oVar.f10027c;
                if (i12 >= 0 && i12 < p6.b()) {
                    lVar.a(oVar.f10027c, this.f5398J[i7]);
                    oVar.f10027c += oVar.d;
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final int j(P p6) {
        return C0(p6);
    }

    public final int k(P p6) {
        return D0(p6);
    }

    public final int l(P p6) {
        return E0(p6);
    }

    public final int m(P p6) {
        return C0(p6);
    }

    public final int m0(int i2, C0770g gVar, P p6) {
        return Z0(i2, gVar, p6);
    }

    public final int n(P p6) {
        return D0(p6);
    }

    public final void n0(int i2) {
        b0 b0Var = this.F;
        if (!(b0Var == null || b0Var.f9930a == i2)) {
            b0Var.d = null;
            b0Var.f9932c = 0;
            b0Var.f9930a = -1;
            b0Var.f9931b = -1;
        }
        this.f5410z = i2;
        this.f5390A = Integer.MIN_VALUE;
        l0();
    }

    public final int o(P p6) {
        return E0(p6);
    }

    public final int o0(int i2, C0770g gVar, P p6) {
        return Z0(i2, gVar, p6);
    }

    public final C0805G r() {
        if (this.f5404t == 0) {
            return new C0805G(-2, -1);
        }
        return new C0805G(-1, -2);
    }

    public final void r0(Rect rect, int i2, int i5) {
        int i6;
        int i7;
        int i8 = this.f5400p;
        int F6 = F() + E();
        int D4 = D() + G();
        if (this.f5404t == 1) {
            int height = rect.height() + D4;
            RecyclerView recyclerView = this.f9850b;
            WeakHashMap weakHashMap = K.O.f1352a;
            i7 = C0804F.g(i5, height, recyclerView.getMinimumHeight());
            i6 = C0804F.g(i2, (this.f5405u * i8) + F6, this.f9850b.getMinimumWidth());
        } else {
            int width = rect.width() + F6;
            RecyclerView recyclerView2 = this.f9850b;
            WeakHashMap weakHashMap2 = K.O.f1352a;
            i6 = C0804F.g(i2, width, recyclerView2.getMinimumWidth());
            i7 = C0804F.g(i5, (this.f5405u * i8) + D4, this.f9850b.getMinimumHeight());
        }
        this.f9850b.setMeasuredDimension(i6, i7);
    }

    public final C0805G s(Context context, AttributeSet attributeSet) {
        return new C0805G(context, attributeSet);
    }

    public final C0805G t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0805G((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0805G(layoutParams);
    }

    public final int x(C0770g gVar, P p6) {
        if (this.f5404t == 1) {
            return this.f5400p;
        }
        return super.x(gVar, p6);
    }

    public final void x0(RecyclerView recyclerView, int i2) {
        C0827t tVar = new C0827t(recyclerView.getContext());
        tVar.f10050a = i2;
        y0(tVar);
    }

    public final boolean z0() {
        if (this.F == null) {
            return true;
        }
        return false;
    }
}
