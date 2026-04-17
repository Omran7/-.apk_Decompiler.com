package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import c5.C0346e;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import f2.C0522a;
import f2.b;
import f2.c;
import f2.d;
import k5.C0770g;
import m0.C0804F;
import m0.C0805G;
import m0.O;
import m0.P;

public class CarouselLayoutManager extends C0804F implements O {

    /* renamed from: p  reason: collision with root package name */
    public final C0346e f6366p;

    /* renamed from: q  reason: collision with root package name */
    public d f6367q;

    /* renamed from: r  reason: collision with root package name */
    public final View.OnLayoutChangeListener f6368r;

    public CarouselLayoutManager() {
        C0346e eVar = new C0346e(1);
        new c();
        this.f6368r = new C0522a(this);
        this.f6366p = eVar;
        l0();
        C0(0);
    }

    public final boolean A0() {
        if (this.f6367q.f7906a == 0) {
            return true;
        }
        return false;
    }

    public final boolean B0() {
        if (!A0() || C() != 1) {
            return false;
        }
        return true;
    }

    public final void C0(int i2) {
        d dVar;
        if (i2 == 0 || i2 == 1) {
            c((String) null);
            d dVar2 = this.f6367q;
            if (dVar2 == null || i2 != dVar2.f7906a) {
                if (i2 == 0) {
                    dVar = new d(this, 1);
                } else if (i2 == 1) {
                    dVar = new d(this, 0);
                } else {
                    throw new IllegalArgumentException("invalid orientation");
                }
                this.f6367q = dVar;
                l0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(a.f(i2, "invalid orientation:"));
    }

    public final boolean L() {
        return true;
    }

    public final void Q(RecyclerView recyclerView) {
        C0346e eVar = this.f6366p;
        Context context = recyclerView.getContext();
        float f6 = eVar.f5712b;
        if (f6 <= 0.0f) {
            f6 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        eVar.f5712b = f6;
        float f7 = eVar.f5713c;
        if (f7 <= 0.0f) {
            f7 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        eVar.f5713c = f7;
        l0();
        recyclerView.addOnLayoutChangeListener(this.f6368r);
    }

    public final void R(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f6368r);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r7 == 1) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        if (B0() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        if (r7 == 1) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
        if (B0() != false) goto L_0x0051;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0056 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View S(android.view.View r5, int r6, k5.C0770g r7, m0.P r8) {
        /*
            r4 = this;
            int r7 = r4.v()
            r8 = 0
            if (r7 != 0) goto L_0x0008
            return r8
        L_0x0008:
            f2.d r7 = r4.f6367q
            int r7 = r7.f7906a
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = -1
            r2 = 1
            if (r6 == r2) goto L_0x0053
            r3 = 2
            if (r6 == r3) goto L_0x0051
            r3 = 17
            if (r6 == r3) goto L_0x0049
            r3 = 33
            if (r6 == r3) goto L_0x0046
            r3 = 66
            if (r6 == r3) goto L_0x003d
            r3 = 130(0x82, float:1.82E-43)
            if (r6 == r3) goto L_0x003a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown focus request:"
            r7.<init>(r3)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "CarouselLayoutManager"
            android.util.Log.d(r7, r6)
        L_0x0038:
            r6 = r0
            goto L_0x0054
        L_0x003a:
            if (r7 != r2) goto L_0x0038
            goto L_0x0051
        L_0x003d:
            if (r7 != 0) goto L_0x0038
            boolean r6 = r4.B0()
            if (r6 == 0) goto L_0x0051
            goto L_0x0053
        L_0x0046:
            if (r7 != r2) goto L_0x0038
            goto L_0x0053
        L_0x0049:
            if (r7 != 0) goto L_0x0038
            boolean r6 = r4.B0()
            if (r6 == 0) goto L_0x0053
        L_0x0051:
            r6 = r2
            goto L_0x0054
        L_0x0053:
            r6 = r1
        L_0x0054:
            if (r6 != r0) goto L_0x0057
            return r8
        L_0x0057:
            r7 = 0
            if (r6 != r1) goto L_0x008b
            int r5 = m0.C0804F.H(r5)
            if (r5 != 0) goto L_0x0061
            return r8
        L_0x0061:
            android.view.View r5 = r4.u(r7)
            int r5 = m0.C0804F.H(r5)
            int r5 = r5 - r2
            if (r5 < 0) goto L_0x007a
            int r6 = r4.B()
            if (r5 < r6) goto L_0x0073
            goto L_0x007a
        L_0x0073:
            f2.d r5 = r4.f6367q
            r5.a()
            r5 = 0
            throw r5
        L_0x007a:
            boolean r5 = r4.B0()
            if (r5 == 0) goto L_0x0086
            int r5 = r4.v()
            int r7 = r5 + -1
        L_0x0086:
            android.view.View r5 = r4.u(r7)
            goto L_0x00c6
        L_0x008b:
            int r5 = m0.C0804F.H(r5)
            int r6 = r4.B()
            int r6 = r6 - r2
            if (r5 != r6) goto L_0x0097
            return r8
        L_0x0097:
            int r5 = r4.v()
            int r5 = r5 - r2
            android.view.View r5 = r4.u(r5)
            int r5 = m0.C0804F.H(r5)
            int r5 = r5 + r2
            if (r5 < 0) goto L_0x00b5
            int r6 = r4.B()
            if (r5 < r6) goto L_0x00ae
            goto L_0x00b5
        L_0x00ae:
            f2.d r5 = r4.f6367q
            r5.a()
            r5 = 0
            throw r5
        L_0x00b5:
            boolean r5 = r4.B0()
            if (r5 == 0) goto L_0x00bc
            goto L_0x00c2
        L_0x00bc:
            int r5 = r4.v()
            int r7 = r5 + -1
        L_0x00c2:
            android.view.View r5 = r4.u(r7)
        L_0x00c6:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.S(android.view.View, int, k5.g, m0.P):android.view.View");
    }

    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(C0804F.H(u(0)));
            accessibilityEvent.setToIndex(C0804F.H(u(v() - 1)));
        }
    }

    public final void W(int i2, int i5) {
        B();
    }

    public final void Z(int i2, int i5) {
        B();
    }

    public final PointF a(int i2) {
        return null;
    }

    public final void b0(C0770g gVar, P p6) {
        int i2;
        if (p6.b() > 0) {
            if (A0()) {
                i2 = this.f9859n;
            } else {
                i2 = this.f9860o;
            }
            if (((float) i2) > 0.0f) {
                B0();
                View view = gVar.n(0, Long.MAX_VALUE).f9893a;
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        g0(gVar);
    }

    public final void c0(P p6) {
        if (v() != 0) {
            C0804F.H(u(0));
        }
    }

    public final boolean d() {
        return A0();
    }

    public final boolean e() {
        return !A0();
    }

    public final int j(P p6) {
        v();
        return 0;
    }

    public final int k(P p6) {
        return 0;
    }

    public final boolean k0(RecyclerView recyclerView, View view, Rect rect, boolean z3, boolean z4) {
        return false;
    }

    public final int l(P p6) {
        return 0;
    }

    public final int m(P p6) {
        v();
        return 0;
    }

    public final int m0(int i2, C0770g gVar, P p6) {
        if (!A0() || v() == 0 || i2 == 0) {
            return 0;
        }
        View view = gVar.n(0, Long.MAX_VALUE).f9893a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    public final int n(P p6) {
        return 0;
    }

    public final void n0(int i2) {
    }

    public final int o(P p6) {
        return 0;
    }

    public final int o0(int i2, C0770g gVar, P p6) {
        if (!e() || v() == 0 || i2 == 0) {
            return 0;
        }
        View view = gVar.n(0, Long.MAX_VALUE).f9893a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    public final C0805G r() {
        return new C0805G(-2, -2);
    }

    public final void x0(RecyclerView recyclerView, int i2) {
        b bVar = new b(this, recyclerView.getContext(), 0);
        bVar.f10050a = i2;
        y0(bVar);
    }

    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerY();
        if (A0()) {
            rect.centerX();
        }
        throw null;
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i2, int i5) {
        new c();
        this.f6368r = new C0522a(this);
        this.f6366p = new C0346e(1);
        l0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Y1.a.f4248b);
            obtainStyledAttributes.getInt(0, 0);
            l0();
            C0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
