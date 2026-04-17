package androidx.recyclerview.widget;

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
import com.google.crypto.tink.shaded.protobuf.C0407l;
import java.util.ArrayList;
import java.util.List;
import k5.C0770g;
import m0.C0803E;
import m0.C0804F;
import m0.C0805G;
import m0.C0824p;
import m0.C0825q;
import m0.C0826s;
import m0.C0827t;
import m0.O;
import m0.P;
import m0.T;
import m0.r;

public class LinearLayoutManager extends C0804F implements O {

    /* renamed from: A  reason: collision with root package name */
    public final C0824p f5308A = new C0824p();

    /* renamed from: B  reason: collision with root package name */
    public final C0825q f5309B = new Object();

    /* renamed from: C  reason: collision with root package name */
    public final int f5310C = 2;

    /* renamed from: D  reason: collision with root package name */
    public final int[] f5311D = new int[2];

    /* renamed from: p  reason: collision with root package name */
    public int f5312p = 1;

    /* renamed from: q  reason: collision with root package name */
    public r f5313q;

    /* renamed from: r  reason: collision with root package name */
    public g f5314r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f5315s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f5316t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f5317u = false;

    /* renamed from: v  reason: collision with root package name */
    public boolean f5318v = false;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f5319w = true;

    /* renamed from: x  reason: collision with root package name */
    public int f5320x = -1;

    /* renamed from: y  reason: collision with root package name */
    public int f5321y = Integer.MIN_VALUE;

    /* renamed from: z  reason: collision with root package name */
    public C0826s f5322z = null;

    /* JADX WARNING: type inference failed for: r2v1, types: [m0.q, java.lang.Object] */
    public LinearLayoutManager(int i2) {
        Z0(i2);
        c((String) null);
        if (this.f5316t) {
            this.f5316t = false;
            l0();
        }
    }

    public void A0(P p6, int[] iArr) {
        int i2;
        int i5;
        if (p6.f9875a != -1) {
            i2 = this.f5314r.l();
        } else {
            i2 = 0;
        }
        if (this.f5313q.f10042f == -1) {
            i5 = 0;
        } else {
            i5 = i2;
            i2 = 0;
        }
        iArr[0] = i2;
        iArr[1] = i5;
    }

    public void B0(P p6, r rVar, C0407l lVar) {
        int i2 = rVar.d;
        if (i2 >= 0 && i2 < p6.b()) {
            lVar.a(i2, Math.max(0, rVar.g));
        }
    }

    public final int C0(P p6) {
        if (v() == 0) {
            return 0;
        }
        G0();
        g gVar = this.f5314r;
        boolean z3 = !this.f5319w;
        return a.i(p6, gVar, J0(z3), I0(z3), this, this.f5319w);
    }

    public final int D0(P p6) {
        if (v() == 0) {
            return 0;
        }
        G0();
        g gVar = this.f5314r;
        boolean z3 = !this.f5319w;
        return a.j(p6, gVar, J0(z3), I0(z3), this, this.f5319w, this.f5317u);
    }

    public final int E0(P p6) {
        if (v() == 0) {
            return 0;
        }
        G0();
        g gVar = this.f5314r;
        boolean z3 = !this.f5319w;
        return a.k(p6, gVar, J0(z3), I0(z3), this, this.f5319w);
    }

    public final int F0(int i2) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 17) {
                    if (i2 != 33) {
                        if (i2 != 66) {
                            if (i2 != 130) {
                                return Integer.MIN_VALUE;
                            }
                            if (this.f5312p == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f5312p == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f5312p == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f5312p == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f5312p != 1 && S0()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f5312p != 1 && S0()) {
            return 1;
        } else {
            return -1;
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [m0.r, java.lang.Object] */
    public final void G0() {
        if (this.f5313q == null) {
            ? obj = new Object();
            obj.f10038a = true;
            obj.h = 0;
            obj.f10043i = 0;
            obj.f10045k = null;
            this.f5313q = obj;
        }
    }

    public final int H0(C0770g gVar, r rVar, P p6, boolean z3) {
        int i2;
        int i5 = rVar.f10040c;
        int i6 = rVar.g;
        if (i6 != Integer.MIN_VALUE) {
            if (i5 < 0) {
                rVar.g = i6 + i5;
            }
            V0(gVar, rVar);
        }
        int i7 = rVar.f10040c + rVar.h;
        while (true) {
            if ((!rVar.f10046l && i7 <= 0) || (i2 = rVar.d) < 0 || i2 >= p6.b()) {
                break;
            }
            C0825q qVar = this.f5309B;
            qVar.f10035a = 0;
            qVar.f10036b = false;
            qVar.f10037c = false;
            qVar.d = false;
            T0(gVar, p6, rVar, qVar);
            if (!qVar.f10036b) {
                int i8 = rVar.f10039b;
                int i9 = qVar.f10035a;
                rVar.f10039b = (rVar.f10042f * i9) + i8;
                if (!qVar.f10037c || rVar.f10045k != null || !p6.g) {
                    rVar.f10040c -= i9;
                    i7 -= i9;
                }
                int i10 = rVar.g;
                if (i10 != Integer.MIN_VALUE) {
                    int i11 = i10 + i9;
                    rVar.g = i11;
                    int i12 = rVar.f10040c;
                    if (i12 < 0) {
                        rVar.g = i11 + i12;
                    }
                    V0(gVar, rVar);
                }
                if (z3 && qVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i5 - rVar.f10040c;
    }

    public final View I0(boolean z3) {
        if (this.f5317u) {
            return M0(0, v(), z3);
        }
        return M0(v() - 1, -1, z3);
    }

    public final View J0(boolean z3) {
        if (this.f5317u) {
            return M0(v() - 1, -1, z3);
        }
        return M0(0, v(), z3);
    }

    public final int K0() {
        View M02 = M0(v() - 1, -1, false);
        if (M02 == null) {
            return -1;
        }
        return C0804F.H(M02);
    }

    public final boolean L() {
        return true;
    }

    public final View L0(int i2, int i5) {
        int i6;
        int i7;
        G0();
        if (i5 <= i2 && i5 >= i2) {
            return u(i2);
        }
        if (this.f5314r.e(u(i2)) < this.f5314r.k()) {
            i7 = 16644;
            i6 = 16388;
        } else {
            i7 = 4161;
            i6 = 4097;
        }
        if (this.f5312p == 0) {
            return this.f9851c.j(i2, i5, i7, i6);
        }
        return this.d.j(i2, i5, i7, i6);
    }

    public final View M0(int i2, int i5, boolean z3) {
        int i6;
        G0();
        if (z3) {
            i6 = 24579;
        } else {
            i6 = 320;
        }
        if (this.f5312p == 0) {
            return this.f9851c.j(i2, i5, i6, 320);
        }
        return this.d.j(i2, i5, i6, 320);
    }

    public View N0(C0770g gVar, P p6, int i2, int i5, int i6) {
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
            if (H6 >= 0 && H6 < i6) {
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

    public final int O0(int i2, C0770g gVar, P p6, boolean z3) {
        int g;
        int g5 = this.f5314r.g() - i2;
        if (g5 <= 0) {
            return 0;
        }
        int i5 = -Y0(-g5, gVar, p6);
        int i6 = i2 + i5;
        if (!z3 || (g = this.f5314r.g() - i6) <= 0) {
            return i5;
        }
        this.f5314r.p(g);
        return g + i5;
    }

    public final int P0(int i2, C0770g gVar, P p6, boolean z3) {
        int k6;
        int k7 = i2 - this.f5314r.k();
        if (k7 <= 0) {
            return 0;
        }
        int i5 = -Y0(k7, gVar, p6);
        int i6 = i2 + i5;
        if (!z3 || (k6 = i6 - this.f5314r.k()) <= 0) {
            return i5;
        }
        this.f5314r.p(-k6);
        return i5 - k6;
    }

    public final View Q0() {
        int i2;
        if (this.f5317u) {
            i2 = 0;
        } else {
            i2 = v() - 1;
        }
        return u(i2);
    }

    public final View R0() {
        int i2;
        if (this.f5317u) {
            i2 = v() - 1;
        } else {
            i2 = 0;
        }
        return u(i2);
    }

    public View S(View view, int i2, C0770g gVar, P p6) {
        int F02;
        View view2;
        View view3;
        X0();
        if (v() == 0 || (F02 = F0(i2)) == Integer.MIN_VALUE) {
            return null;
        }
        G0();
        b1(F02, (int) (((float) this.f5314r.l()) * 0.33333334f), false, p6);
        r rVar = this.f5313q;
        rVar.g = Integer.MIN_VALUE;
        rVar.f10038a = false;
        H0(gVar, rVar, p6, true);
        if (F02 == -1) {
            if (this.f5317u) {
                view2 = L0(v() - 1, -1);
            } else {
                view2 = L0(0, v());
            }
        } else if (this.f5317u) {
            view2 = L0(0, v());
        } else {
            view2 = L0(v() - 1, -1);
        }
        if (F02 == -1) {
            view3 = R0();
        } else {
            view3 = Q0();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    public final boolean S0() {
        if (C() == 1) {
            return true;
        }
        return false;
    }

    public final void T(AccessibilityEvent accessibilityEvent) {
        int i2;
        super.T(accessibilityEvent);
        if (v() > 0) {
            View M02 = M0(0, v(), false);
            if (M02 == null) {
                i2 = -1;
            } else {
                i2 = C0804F.H(M02);
            }
            accessibilityEvent.setFromIndex(i2);
            accessibilityEvent.setToIndex(K0());
        }
    }

    public void T0(C0770g gVar, P p6, r rVar, C0825q qVar) {
        int i2;
        int i5;
        int i6;
        int i7;
        boolean z3;
        boolean z4;
        View b6 = rVar.b(gVar);
        if (b6 == null) {
            qVar.f10036b = true;
            return;
        }
        C0805G g = (C0805G) b6.getLayoutParams();
        if (rVar.f10045k == null) {
            boolean z5 = this.f5317u;
            if (rVar.f10042f == -1) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z5 == z4) {
                b(b6, -1, false);
            } else {
                b(b6, 0, false);
            }
        } else {
            boolean z6 = this.f5317u;
            if (rVar.f10042f == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z6 == z3) {
                b(b6, -1, true);
            } else {
                b(b6, 0, true);
            }
        }
        C0805G g5 = (C0805G) b6.getLayoutParams();
        Rect J5 = this.f9850b.J(b6);
        int i8 = J5.left + J5.right;
        int i9 = J5.top + J5.bottom;
        int w6 = C0804F.w(this.f9859n, this.f9857l, F() + E() + g5.leftMargin + g5.rightMargin + i8, d(), g5.width);
        int w7 = C0804F.w(this.f9860o, this.f9858m, D() + G() + g5.topMargin + g5.bottomMargin + i9, e(), g5.height);
        if (u0(b6, w6, w7, g5)) {
            b6.measure(w6, w7);
        }
        qVar.f10035a = this.f5314r.c(b6);
        if (this.f5312p == 1) {
            if (S0()) {
                i7 = this.f9859n - F();
                i6 = i7 - this.f5314r.d(b6);
            } else {
                i6 = E();
                i7 = this.f5314r.d(b6) + i6;
            }
            if (rVar.f10042f == -1) {
                i2 = rVar.f10039b;
                i5 = i2 - qVar.f10035a;
            } else {
                i5 = rVar.f10039b;
                i2 = qVar.f10035a + i5;
            }
        } else {
            int G6 = G();
            int d = this.f5314r.d(b6) + G6;
            if (rVar.f10042f == -1) {
                int i10 = rVar.f10039b;
                int i11 = i10 - qVar.f10035a;
                int i12 = G6;
                i7 = i10;
                i2 = d;
                i6 = i11;
                i5 = i12;
            } else {
                int i13 = rVar.f10039b;
                int i14 = qVar.f10035a + i13;
                int i15 = d;
                i6 = i13;
                i2 = i15;
                int i16 = i14;
                i5 = G6;
                i7 = i16;
            }
        }
        C0804F.N(b6, i6, i5, i7, i2);
        if (g.f9861a.i() || g.f9861a.l()) {
            qVar.f10037c = true;
        }
        qVar.d = b6.hasFocusable();
    }

    public final void V0(C0770g gVar, r rVar) {
        if (rVar.f10038a && !rVar.f10046l) {
            int i2 = rVar.g;
            int i5 = rVar.f10043i;
            if (rVar.f10042f == -1) {
                int v6 = v();
                if (i2 >= 0) {
                    int f6 = (this.f5314r.f() - i2) + i5;
                    if (this.f5317u) {
                        for (int i6 = 0; i6 < v6; i6++) {
                            View u6 = u(i6);
                            if (this.f5314r.e(u6) < f6 || this.f5314r.o(u6) < f6) {
                                W0(gVar, 0, i6);
                                return;
                            }
                        }
                        return;
                    }
                    int i7 = v6 - 1;
                    for (int i8 = i7; i8 >= 0; i8--) {
                        View u7 = u(i8);
                        if (this.f5314r.e(u7) < f6 || this.f5314r.o(u7) < f6) {
                            W0(gVar, i7, i8);
                            return;
                        }
                    }
                }
            } else if (i2 >= 0) {
                int i9 = i2 - i5;
                int v7 = v();
                if (this.f5317u) {
                    int i10 = v7 - 1;
                    for (int i11 = i10; i11 >= 0; i11--) {
                        View u8 = u(i11);
                        if (this.f5314r.b(u8) > i9 || this.f5314r.n(u8) > i9) {
                            W0(gVar, i10, i11);
                            return;
                        }
                    }
                    return;
                }
                for (int i12 = 0; i12 < v7; i12++) {
                    View u9 = u(i12);
                    if (this.f5314r.b(u9) > i9 || this.f5314r.n(u9) > i9) {
                        W0(gVar, 0, i12);
                        return;
                    }
                }
            }
        }
    }

    public final void W0(C0770g gVar, int i2, int i5) {
        if (i2 != i5) {
            if (i5 > i2) {
                for (int i6 = i5 - 1; i6 >= i2; i6--) {
                    View u6 = u(i6);
                    j0(i6);
                    gVar.h(u6);
                }
                return;
            }
            while (i2 > i5) {
                View u7 = u(i2);
                j0(i2);
                gVar.h(u7);
                i2--;
            }
        }
    }

    public final void X0() {
        if (this.f5312p == 1 || !S0()) {
            this.f5317u = this.f5316t;
        } else {
            this.f5317u = !this.f5316t;
        }
    }

    public final int Y0(int i2, C0770g gVar, P p6) {
        int i5;
        if (v() == 0 || i2 == 0) {
            return 0;
        }
        G0();
        this.f5313q.f10038a = true;
        if (i2 > 0) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        int abs = Math.abs(i2);
        b1(i5, abs, true, p6);
        r rVar = this.f5313q;
        int H02 = H0(gVar, rVar, p6, false) + rVar.g;
        if (H02 < 0) {
            return 0;
        }
        if (abs > H02) {
            i2 = i5 * H02;
        }
        this.f5314r.p(-i2);
        this.f5313q.f10044j = i2;
        return i2;
    }

    public final void Z0(int i2) {
        if (i2 == 0 || i2 == 1) {
            c((String) null);
            if (i2 != this.f5312p || this.f5314r == null) {
                g a6 = g.a(this, i2);
                this.f5314r = a6;
                this.f5308A.f10031a = a6;
                this.f5312p = i2;
                l0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(com.google.android.gms.internal.measurement.a.f(i2, "invalid orientation:"));
    }

    public final PointF a(int i2) {
        if (v() == 0) {
            return null;
        }
        boolean z3 = false;
        int i5 = 1;
        if (i2 < C0804F.H(u(0))) {
            z3 = true;
        }
        if (z3 != this.f5317u) {
            i5 = -1;
        }
        if (this.f5312p == 0) {
            return new PointF((float) i5, 0.0f);
        }
        return new PointF(0.0f, (float) i5);
    }

    public void a1(boolean z3) {
        c((String) null);
        if (this.f5318v != z3) {
            this.f5318v = z3;
            l0();
        }
    }

    public void b0(C0770g gVar, P p6) {
        View view;
        int i2;
        boolean z3;
        int i5;
        int i6;
        List list;
        boolean z4;
        int i7;
        int i8;
        int O0;
        int i9;
        View q6;
        int e6;
        int i10;
        int i11;
        View view2;
        View view3;
        int i12;
        int i13;
        boolean z5;
        boolean z6;
        int i14;
        int i15;
        C0770g gVar2 = gVar;
        P p7 = p6;
        int i16 = -1;
        if (!(this.f5322z == null && this.f5320x == -1) && p6.b() == 0) {
            g0(gVar);
            return;
        }
        C0826s sVar = this.f5322z;
        if (sVar != null && (i15 = sVar.f10047a) >= 0) {
            this.f5320x = i15;
        }
        G0();
        this.f5313q.f10038a = false;
        X0();
        RecyclerView recyclerView = this.f9850b;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || ((ArrayList) this.f9849a.d).contains(view)) {
            view = null;
        }
        C0824p pVar = this.f5308A;
        if (!pVar.f10034e || this.f5320x != -1 || this.f5322z != null) {
            pVar.d();
            pVar.d = this.f5317u ^ this.f5318v;
            if (!p7.g && (i13 = this.f5320x) != -1) {
                if (i13 < 0 || i13 >= p6.b()) {
                    this.f5320x = -1;
                    this.f5321y = Integer.MIN_VALUE;
                } else {
                    int i17 = this.f5320x;
                    pVar.f10032b = i17;
                    C0826s sVar2 = this.f5322z;
                    if (sVar2 == null || sVar2.f10047a < 0) {
                        if (this.f5321y == Integer.MIN_VALUE) {
                            View q7 = q(i17);
                            if (q7 == null) {
                                if (v() > 0) {
                                    if (this.f5320x < C0804F.H(u(0))) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z5 == this.f5317u) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    pVar.d = z6;
                                }
                                pVar.a();
                            } else if (this.f5314r.c(q7) > this.f5314r.l()) {
                                pVar.a();
                            } else if (this.f5314r.e(q7) - this.f5314r.k() < 0) {
                                pVar.f10033c = this.f5314r.k();
                                pVar.d = false;
                            } else if (this.f5314r.g() - this.f5314r.b(q7) < 0) {
                                pVar.f10033c = this.f5314r.g();
                                pVar.d = true;
                            } else {
                                if (pVar.d) {
                                    i14 = this.f5314r.m() + this.f5314r.b(q7);
                                } else {
                                    i14 = this.f5314r.e(q7);
                                }
                                pVar.f10033c = i14;
                            }
                        } else {
                            boolean z7 = this.f5317u;
                            pVar.d = z7;
                            if (z7) {
                                pVar.f10033c = this.f5314r.g() - this.f5321y;
                            } else {
                                pVar.f10033c = this.f5314r.k() + this.f5321y;
                            }
                        }
                        pVar.f10034e = true;
                    } else {
                        boolean z8 = sVar2.f10049c;
                        pVar.d = z8;
                        if (z8) {
                            pVar.f10033c = this.f5314r.g() - this.f5322z.f10048b;
                        } else {
                            pVar.f10033c = this.f5314r.k() + this.f5322z.f10048b;
                        }
                        pVar.f10034e = true;
                    }
                }
            }
            if (v() != 0) {
                RecyclerView recyclerView2 = this.f9850b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.f9849a.d).contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    C0805G g = (C0805G) view2.getLayoutParams();
                    if (!g.f9861a.i() && g.f9861a.b() >= 0 && g.f9861a.b() < p6.b()) {
                        pVar.c(view2, C0804F.H(view2));
                        pVar.f10034e = true;
                    }
                }
                if (this.f5315s == this.f5318v) {
                    if (pVar.d) {
                        if (this.f5317u) {
                            view3 = N0(gVar, p6, 0, v(), p6.b());
                        } else {
                            view3 = N0(gVar, p6, v() - 1, -1, p6.b());
                        }
                    } else if (this.f5317u) {
                        view3 = N0(gVar, p6, v() - 1, -1, p6.b());
                    } else {
                        view3 = N0(gVar, p6, 0, v(), p6.b());
                    }
                    if (view3 != null) {
                        pVar.b(view3, C0804F.H(view3));
                        if (!p7.g && z0() && (this.f5314r.e(view3) >= this.f5314r.g() || this.f5314r.b(view3) < this.f5314r.k())) {
                            if (pVar.d) {
                                i12 = this.f5314r.g();
                            } else {
                                i12 = this.f5314r.k();
                            }
                            pVar.f10033c = i12;
                        }
                        pVar.f10034e = true;
                    }
                }
            }
            pVar.a();
            if (this.f5318v) {
                i11 = p6.b() - 1;
            } else {
                i11 = 0;
            }
            pVar.f10032b = i11;
            pVar.f10034e = true;
        } else if (view != null && (this.f5314r.e(view) >= this.f5314r.g() || this.f5314r.b(view) <= this.f5314r.k())) {
            pVar.c(view, C0804F.H(view));
        }
        r rVar = this.f5313q;
        if (rVar.f10044j >= 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        rVar.f10042f = i2;
        int[] iArr = this.f5311D;
        iArr[0] = 0;
        iArr[1] = 0;
        A0(p7, iArr);
        int k6 = this.f5314r.k() + Math.max(0, iArr[0]);
        int h = this.f5314r.h() + Math.max(0, iArr[1]);
        if (!(!p7.g || (i9 = this.f5320x) == -1 || this.f5321y == Integer.MIN_VALUE || (q6 = q(i9)) == null)) {
            if (this.f5317u) {
                i10 = this.f5314r.g() - this.f5314r.b(q6);
                e6 = this.f5321y;
            } else {
                e6 = this.f5314r.e(q6) - this.f5314r.k();
                i10 = this.f5321y;
            }
            int i18 = i10 - e6;
            if (i18 > 0) {
                k6 += i18;
            } else {
                h -= i18;
            }
        }
        if (!pVar.d ? !this.f5317u : this.f5317u) {
            i16 = 1;
        }
        U0(gVar2, p7, pVar, i16);
        p(gVar);
        r rVar2 = this.f5313q;
        if (this.f5314r.i() == 0 && this.f5314r.f() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        rVar2.f10046l = z3;
        this.f5313q.getClass();
        this.f5313q.f10043i = 0;
        if (pVar.d) {
            d1(pVar.f10032b, pVar.f10033c);
            r rVar3 = this.f5313q;
            rVar3.h = k6;
            H0(gVar2, rVar3, p7, false);
            r rVar4 = this.f5313q;
            i5 = rVar4.f10039b;
            int i19 = rVar4.d;
            int i20 = rVar4.f10040c;
            if (i20 > 0) {
                h += i20;
            }
            c1(pVar.f10032b, pVar.f10033c);
            r rVar5 = this.f5313q;
            rVar5.h = h;
            rVar5.d += rVar5.f10041e;
            H0(gVar2, rVar5, p7, false);
            r rVar6 = this.f5313q;
            i6 = rVar6.f10039b;
            int i21 = rVar6.f10040c;
            if (i21 > 0) {
                d1(i19, i5);
                r rVar7 = this.f5313q;
                rVar7.h = i21;
                H0(gVar2, rVar7, p7, false);
                i5 = this.f5313q.f10039b;
            }
        } else {
            c1(pVar.f10032b, pVar.f10033c);
            r rVar8 = this.f5313q;
            rVar8.h = h;
            H0(gVar2, rVar8, p7, false);
            r rVar9 = this.f5313q;
            i6 = rVar9.f10039b;
            int i22 = rVar9.d;
            int i23 = rVar9.f10040c;
            if (i23 > 0) {
                k6 += i23;
            }
            d1(pVar.f10032b, pVar.f10033c);
            r rVar10 = this.f5313q;
            rVar10.h = k6;
            rVar10.d += rVar10.f10041e;
            H0(gVar2, rVar10, p7, false);
            r rVar11 = this.f5313q;
            i5 = rVar11.f10039b;
            int i24 = rVar11.f10040c;
            if (i24 > 0) {
                c1(i22, i6);
                r rVar12 = this.f5313q;
                rVar12.h = i24;
                H0(gVar2, rVar12, p7, false);
                i6 = this.f5313q.f10039b;
            }
        }
        if (v() > 0) {
            if (this.f5317u ^ this.f5318v) {
                int O02 = O0(i6, gVar2, p7, true);
                i7 = i5 + O02;
                i8 = i6 + O02;
                O0 = P0(i7, gVar2, p7, false);
            } else {
                int P02 = P0(i5, gVar2, p7, true);
                i7 = i5 + P02;
                i8 = i6 + P02;
                O0 = O0(i8, gVar2, p7, false);
            }
            i5 = i7 + O0;
            i6 = i8 + O0;
        }
        if (p7.f9882k && v() != 0 && !p7.g && z0()) {
            List list2 = (List) gVar2.f9495f;
            int size = list2.size();
            int H6 = C0804F.H(u(0));
            int i25 = 0;
            int i26 = 0;
            for (int i27 = 0; i27 < size; i27++) {
                T t6 = (T) list2.get(i27);
                if (!t6.i()) {
                    if (t6.b() < H6) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z9 = this.f5317u;
                    View view4 = t6.f9893a;
                    if (z4 != z9) {
                        i25 += this.f5314r.c(view4);
                    } else {
                        i26 += this.f5314r.c(view4);
                    }
                }
            }
            this.f5313q.f10045k = list2;
            if (i25 > 0) {
                d1(C0804F.H(R0()), i5);
                r rVar13 = this.f5313q;
                rVar13.h = i25;
                rVar13.f10040c = 0;
                rVar13.a((View) null);
                H0(gVar2, this.f5313q, p7, false);
            }
            if (i26 > 0) {
                c1(C0804F.H(Q0()), i6);
                r rVar14 = this.f5313q;
                rVar14.h = i26;
                rVar14.f10040c = 0;
                list = null;
                rVar14.a((View) null);
                H0(gVar2, this.f5313q, p7, false);
            } else {
                list = null;
            }
            this.f5313q.f10045k = list;
        }
        if (!p7.g) {
            g gVar3 = this.f5314r;
            gVar3.f4929a = gVar3.l();
        } else {
            pVar.d();
        }
        this.f5315s = this.f5318v;
    }

    public final void b1(int i2, int i5, boolean z3, P p6) {
        boolean z4;
        int i6;
        int i7;
        r rVar = this.f5313q;
        boolean z5 = false;
        int i8 = 1;
        if (this.f5314r.i() == 0 && this.f5314r.f() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        rVar.f10046l = z4;
        this.f5313q.f10042f = i2;
        int[] iArr = this.f5311D;
        iArr[0] = 0;
        iArr[1] = 0;
        A0(p6, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i2 == 1) {
            z5 = true;
        }
        r rVar2 = this.f5313q;
        if (z5) {
            i6 = max2;
        } else {
            i6 = max;
        }
        rVar2.h = i6;
        if (!z5) {
            max = max2;
        }
        rVar2.f10043i = max;
        if (z5) {
            rVar2.h = this.f5314r.h() + i6;
            View Q02 = Q0();
            r rVar3 = this.f5313q;
            if (this.f5317u) {
                i8 = -1;
            }
            rVar3.f10041e = i8;
            int H6 = C0804F.H(Q02);
            r rVar4 = this.f5313q;
            rVar3.d = H6 + rVar4.f10041e;
            rVar4.f10039b = this.f5314r.b(Q02);
            i7 = this.f5314r.b(Q02) - this.f5314r.g();
        } else {
            View R02 = R0();
            r rVar5 = this.f5313q;
            rVar5.h = this.f5314r.k() + rVar5.h;
            r rVar6 = this.f5313q;
            if (!this.f5317u) {
                i8 = -1;
            }
            rVar6.f10041e = i8;
            int H7 = C0804F.H(R02);
            r rVar7 = this.f5313q;
            rVar6.d = H7 + rVar7.f10041e;
            rVar7.f10039b = this.f5314r.e(R02);
            i7 = (-this.f5314r.e(R02)) + this.f5314r.k();
        }
        r rVar8 = this.f5313q;
        rVar8.f10040c = i5;
        if (z3) {
            rVar8.f10040c = i5 - i7;
        }
        rVar8.g = i7;
    }

    public final void c(String str) {
        if (this.f5322z == null) {
            super.c(str);
        }
    }

    public void c0(P p6) {
        this.f5322z = null;
        this.f5320x = -1;
        this.f5321y = Integer.MIN_VALUE;
        this.f5308A.d();
    }

    public final void c1(int i2, int i5) {
        int i6;
        this.f5313q.f10040c = this.f5314r.g() - i5;
        r rVar = this.f5313q;
        if (this.f5317u) {
            i6 = -1;
        } else {
            i6 = 1;
        }
        rVar.f10041e = i6;
        rVar.d = i2;
        rVar.f10042f = 1;
        rVar.f10039b = i5;
        rVar.g = Integer.MIN_VALUE;
    }

    public final boolean d() {
        if (this.f5312p == 0) {
            return true;
        }
        return false;
    }

    public final void d0(Parcelable parcelable) {
        if (parcelable instanceof C0826s) {
            this.f5322z = (C0826s) parcelable;
            l0();
        }
    }

    public final void d1(int i2, int i5) {
        int i6;
        this.f5313q.f10040c = i5 - this.f5314r.k();
        r rVar = this.f5313q;
        rVar.d = i2;
        if (this.f5317u) {
            i6 = 1;
        } else {
            i6 = -1;
        }
        rVar.f10041e = i6;
        rVar.f10042f = -1;
        rVar.f10039b = i5;
        rVar.g = Integer.MIN_VALUE;
    }

    public final boolean e() {
        if (this.f5312p == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object, m0.s] */
    /* JADX WARNING: type inference failed for: r1v9, types: [android.os.Parcelable, java.lang.Object, m0.s] */
    public final Parcelable e0() {
        C0826s sVar = this.f5322z;
        if (sVar != null) {
            ? obj = new Object();
            obj.f10047a = sVar.f10047a;
            obj.f10048b = sVar.f10048b;
            obj.f10049c = sVar.f10049c;
            return obj;
        }
        ? obj2 = new Object();
        if (v() > 0) {
            G0();
            boolean z3 = this.f5315s ^ this.f5317u;
            obj2.f10049c = z3;
            if (z3) {
                View Q02 = Q0();
                obj2.f10048b = this.f5314r.g() - this.f5314r.b(Q02);
                obj2.f10047a = C0804F.H(Q02);
            } else {
                View R02 = R0();
                obj2.f10047a = C0804F.H(R02);
                obj2.f10048b = this.f5314r.e(R02) - this.f5314r.k();
            }
        } else {
            obj2.f10047a = -1;
        }
        return obj2;
    }

    public final void h(int i2, int i5, P p6, C0407l lVar) {
        int i6;
        if (this.f5312p != 0) {
            i2 = i5;
        }
        if (v() != 0 && i2 != 0) {
            G0();
            if (i2 > 0) {
                i6 = 1;
            } else {
                i6 = -1;
            }
            b1(i6, Math.abs(i2), true, p6);
            B0(p6, this.f5313q, lVar);
        }
    }

    public final void i(int i2, C0407l lVar) {
        int i5;
        boolean z3;
        C0826s sVar = this.f5322z;
        int i6 = -1;
        if (sVar == null || (i5 = sVar.f10047a) < 0) {
            X0();
            z3 = this.f5317u;
            i5 = this.f5320x;
            if (i5 == -1) {
                if (z3) {
                    i5 = i2 - 1;
                } else {
                    i5 = 0;
                }
            }
        } else {
            z3 = sVar.f10049c;
        }
        if (!z3) {
            i6 = 1;
        }
        for (int i7 = 0; i7 < this.f5310C && i5 >= 0 && i5 < i2; i7++) {
            lVar.a(i5, 0);
            i5 += i6;
        }
    }

    public final int j(P p6) {
        return C0(p6);
    }

    public int k(P p6) {
        return D0(p6);
    }

    public int l(P p6) {
        return E0(p6);
    }

    public final int m(P p6) {
        return C0(p6);
    }

    public int m0(int i2, C0770g gVar, P p6) {
        if (this.f5312p == 1) {
            return 0;
        }
        return Y0(i2, gVar, p6);
    }

    public int n(P p6) {
        return D0(p6);
    }

    public final void n0(int i2) {
        this.f5320x = i2;
        this.f5321y = Integer.MIN_VALUE;
        C0826s sVar = this.f5322z;
        if (sVar != null) {
            sVar.f10047a = -1;
        }
        l0();
    }

    public int o(P p6) {
        return E0(p6);
    }

    public int o0(int i2, C0770g gVar, P p6) {
        if (this.f5312p == 0) {
            return 0;
        }
        return Y0(i2, gVar, p6);
    }

    public final View q(int i2) {
        int v6 = v();
        if (v6 == 0) {
            return null;
        }
        int H6 = i2 - C0804F.H(u(0));
        if (H6 >= 0 && H6 < v6) {
            View u6 = u(H6);
            if (C0804F.H(u6) == i2) {
                return u6;
            }
        }
        return super.q(i2);
    }

    public C0805G r() {
        return new C0805G(-2, -2);
    }

    public final boolean v0() {
        if (this.f9858m == 1073741824 || this.f9857l == 1073741824) {
            return false;
        }
        int v6 = v();
        for (int i2 = 0; i2 < v6; i2++) {
            ViewGroup.LayoutParams layoutParams = u(i2).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    public void x0(RecyclerView recyclerView, int i2) {
        C0827t tVar = new C0827t(recyclerView.getContext());
        tVar.f10050a = i2;
        y0(tVar);
    }

    public boolean z0() {
        if (this.f5322z == null && this.f5315s == this.f5318v) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [m0.q, java.lang.Object] */
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i5) {
        C0803E I6 = C0804F.I(context, attributeSet, i2, i5);
        Z0(I6.f9846a);
        boolean z3 = I6.f9848c;
        c((String) null);
        if (z3 != this.f5316t) {
            this.f5316t = z3;
            l0();
        }
        a1(I6.d);
    }

    public final void R(RecyclerView recyclerView) {
    }

    public void U0(C0770g gVar, P p6, C0824p pVar, int i2) {
    }
}
