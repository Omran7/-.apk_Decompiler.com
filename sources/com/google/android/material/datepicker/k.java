package com.google.android.material.datepicker;

import H.a;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class k<S> extends t {

    /* renamed from: e0  reason: collision with root package name */
    public int f6413e0;

    /* renamed from: f0  reason: collision with root package name */
    public b f6414f0;

    /* renamed from: g0  reason: collision with root package name */
    public o f6415g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f6416h0;

    /* renamed from: i0  reason: collision with root package name */
    public c f6417i0;

    /* renamed from: j0  reason: collision with root package name */
    public RecyclerView f6418j0;

    /* renamed from: k0  reason: collision with root package name */
    public RecyclerView f6419k0;

    /* renamed from: l0  reason: collision with root package name */
    public View f6420l0;

    /* renamed from: m0  reason: collision with root package name */
    public View f6421m0;

    /* renamed from: n0  reason: collision with root package name */
    public View f6422n0;

    /* renamed from: o0  reason: collision with root package name */
    public View f6423o0;

    public final void B(Bundle bundle) {
        super.B(bundle);
        if (bundle == null) {
            bundle = this.f5178f;
        }
        this.f6413e0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") == null) {
            this.f6414f0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
            if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
                this.f6415g0 = (o) bundle.getParcelable("CURRENT_MONTH_KEY");
                return;
            }
            throw new ClassCastException();
        }
        throw new ClassCastException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x018f, code lost:
        r0 = new m0.C0829v();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View C(android.view.LayoutInflater r12, android.view.ViewGroup r13) {
        /*
            r11 = this;
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r11.n()
            int r2 = r11.f6413e0
            r0.<init>(r1, r2)
            com.google.android.material.datepicker.c r1 = new com.google.android.material.datepicker.c
            r1.<init>(r0)
            r11.f6417i0 = r1
            android.view.LayoutInflater r12 = r12.cloneInContext(r0)
            com.google.android.material.datepicker.b r1 = r11.f6414f0
            com.google.android.material.datepicker.o r1 = r1.f6392a
            r2 = 16843277(0x101020d, float:2.369503E-38)
            boolean r3 = com.google.android.material.datepicker.l.Y(r0, r2)
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x002a
            r3 = 2131493093(0x7f0c00e5, float:1.8609656E38)
            r6 = r4
            goto L_0x002e
        L_0x002a:
            r3 = 2131493088(0x7f0c00e0, float:1.8609646E38)
            r6 = r5
        L_0x002e:
            android.view.View r12 = r12.inflate(r3, r13, r5)
            android.content.Context r13 = r11.Q()
            android.content.res.Resources r13 = r13.getResources()
            r3 = 2131100302(0x7f06028e, float:1.7812982E38)
            int r3 = r13.getDimensionPixelSize(r3)
            r7 = 2131100303(0x7f06028f, float:1.7812984E38)
            int r7 = r13.getDimensionPixelOffset(r7)
            int r7 = r7 + r3
            r3 = 2131100301(0x7f06028d, float:1.781298E38)
            int r3 = r13.getDimensionPixelOffset(r3)
            int r3 = r3 + r7
            r7 = 2131100286(0x7f06027e, float:1.781295E38)
            int r7 = r13.getDimensionPixelSize(r7)
            int r8 = com.google.android.material.datepicker.p.d
            r9 = 2131100281(0x7f060279, float:1.781294E38)
            int r9 = r13.getDimensionPixelSize(r9)
            int r9 = r9 * r8
            int r8 = r8 - r4
            r10 = 2131100300(0x7f06028c, float:1.7812978E38)
            int r10 = r13.getDimensionPixelOffset(r10)
            int r10 = r10 * r8
            int r10 = r10 + r9
            r8 = 2131100278(0x7f060276, float:1.7812933E38)
            int r13 = r13.getDimensionPixelOffset(r8)
            int r3 = r3 + r7
            int r3 = r3 + r10
            int r3 = r3 + r13
            r12.setMinimumHeight(r3)
            r13 = 2131298271(0x7f0907df, float:1.821451E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.GridView r13 = (android.widget.GridView) r13
            Q.h r3 = new Q.h
            r7 = 1
            r3.<init>(r7)
            K.O.l(r13, r3)
            com.google.android.material.datepicker.b r3 = r11.f6414f0
            int r3 = r3.f6395e
            com.google.android.material.datepicker.e r7 = new com.google.android.material.datepicker.e
            if (r3 <= 0) goto L_0x0097
            r7.<init>(r3)
            goto L_0x009a
        L_0x0097:
            r7.<init>()
        L_0x009a:
            r13.setAdapter(r7)
            int r1 = r1.d
            r13.setNumColumns(r1)
            r13.setEnabled(r5)
            r13 = 2131298274(0x7f0907e2, float:1.8214517E38)
            android.view.View r13 = r12.findViewById(r13)
            androidx.recyclerview.widget.RecyclerView r13 = (androidx.recyclerview.widget.RecyclerView) r13
            r11.f6419k0 = r13
            com.google.android.material.datepicker.g r13 = new com.google.android.material.datepicker.g
            r13.<init>(r11, r6, r6)
            androidx.recyclerview.widget.RecyclerView r1 = r11.f6419k0
            r1.setLayoutManager(r13)
            androidx.recyclerview.widget.RecyclerView r13 = r11.f6419k0
            java.lang.String r1 = "MONTHS_VIEW_GROUP_TAG"
            r13.setTag(r1)
            com.google.android.material.datepicker.s r13 = new com.google.android.material.datepicker.s
            com.google.android.material.datepicker.b r1 = r11.f6414f0
            S3.t r3 = new S3.t
            r5 = 20
            r3.<init>(r11, r5)
            r13.<init>(r0, r1, r3)
            androidx.recyclerview.widget.RecyclerView r1 = r11.f6419k0
            r1.setAdapter(r13)
            android.content.res.Resources r1 = r0.getResources()
            r3 = 2131361843(0x7f0a0033, float:1.834345E38)
            int r1 = r1.getInteger(r3)
            r3 = 2131298277(0x7f0907e5, float:1.8214523E38)
            android.view.View r5 = r12.findViewById(r3)
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            r11.f6418j0 = r5
            if (r5 == 0) goto L_0x010d
            r5.setHasFixedSize(r4)
            androidx.recyclerview.widget.RecyclerView r5 = r11.f6418j0
            androidx.recyclerview.widget.GridLayoutManager r6 = new androidx.recyclerview.widget.GridLayoutManager
            r6.<init>(r1)
            r5.setLayoutManager(r6)
            androidx.recyclerview.widget.RecyclerView r1 = r11.f6418j0
            com.google.android.material.datepicker.y r5 = new com.google.android.material.datepicker.y
            r5.<init>(r11)
            r1.setAdapter(r5)
            androidx.recyclerview.widget.RecyclerView r1 = r11.f6418j0
            com.google.android.material.datepicker.h r5 = new com.google.android.material.datepicker.h
            r5.<init>(r11)
            r1.g(r5)
        L_0x010d:
            r1 = 2131298264(0x7f0907d8, float:1.8214496E38)
            android.view.View r5 = r12.findViewById(r1)
            if (r5 == 0) goto L_0x0189
            android.view.View r1 = r12.findViewById(r1)
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            java.lang.String r5 = "SELECTOR_TOGGLE_TAG"
            r1.setTag(r5)
            com.google.android.material.datepicker.i r5 = new com.google.android.material.datepicker.i
            r6 = 0
            r5.<init>(r11, r6)
            K.O.l(r1, r5)
            r5 = 2131298266(0x7f0907da, float:1.82145E38)
            android.view.View r5 = r12.findViewById(r5)
            r11.f6420l0 = r5
            java.lang.String r6 = "NAVIGATION_PREV_TAG"
            r5.setTag(r6)
            r5 = 2131298265(0x7f0907d9, float:1.8214498E38)
            android.view.View r5 = r12.findViewById(r5)
            r11.f6421m0 = r5
            java.lang.String r6 = "NAVIGATION_NEXT_TAG"
            r5.setTag(r6)
            android.view.View r3 = r12.findViewById(r3)
            r11.f6422n0 = r3
            r3 = 2131298270(0x7f0907de, float:1.8214508E38)
            android.view.View r3 = r12.findViewById(r3)
            r11.f6423o0 = r3
            r11.W(r4)
            com.google.android.material.datepicker.o r3 = r11.f6415g0
            java.lang.String r3 = r3.j()
            r1.setText(r3)
            androidx.recyclerview.widget.RecyclerView r3 = r11.f6419k0
            com.google.android.material.datepicker.j r4 = new com.google.android.material.datepicker.j
            r4.<init>(r11, r13, r1)
            r3.h(r4)
            K4.m r3 = new K4.m
            r4 = 1
            r3.<init>(r11, r4)
            r1.setOnClickListener(r3)
            android.view.View r1 = r11.f6421m0
            com.google.android.material.datepicker.f r3 = new com.google.android.material.datepicker.f
            r3.<init>(r11, r13, r4)
            r1.setOnClickListener(r3)
            android.view.View r1 = r11.f6420l0
            com.google.android.material.datepicker.f r3 = new com.google.android.material.datepicker.f
            r4 = 0
            r3.<init>(r11, r13, r4)
            r1.setOnClickListener(r3)
        L_0x0189:
            boolean r0 = com.google.android.material.datepicker.l.Y(r0, r2)
            if (r0 != 0) goto L_0x01dc
            m0.v r0 = new m0.v
            r0.<init>()
            androidx.recyclerview.widget.RecyclerView r1 = r11.f6419k0
            androidx.recyclerview.widget.RecyclerView r2 = r0.f10063a
            if (r2 != r1) goto L_0x019b
            goto L_0x01dc
        L_0x019b:
            m0.W r3 = r0.f10064b
            if (r2 == 0) goto L_0x01ac
            java.util.ArrayList r2 = r2.f5367n0
            if (r2 == 0) goto L_0x01a6
            r2.remove(r3)
        L_0x01a6:
            androidx.recyclerview.widget.RecyclerView r2 = r0.f10063a
            r4 = 0
            r2.setOnFlingListener(r4)
        L_0x01ac:
            r0.f10063a = r1
            if (r1 == 0) goto L_0x01dc
            m0.H r1 = r1.getOnFlingListener()
            if (r1 != 0) goto L_0x01d4
            androidx.recyclerview.widget.RecyclerView r1 = r0.f10063a
            r1.h(r3)
            androidx.recyclerview.widget.RecyclerView r1 = r0.f10063a
            r1.setOnFlingListener(r0)
            android.widget.Scroller r1 = new android.widget.Scroller
            androidx.recyclerview.widget.RecyclerView r2 = r0.f10063a
            android.content.Context r2 = r2.getContext()
            android.view.animation.DecelerateInterpolator r3 = new android.view.animation.DecelerateInterpolator
            r3.<init>()
            r1.<init>(r2, r3)
            r0.f()
            goto L_0x01dc
        L_0x01d4:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "An instance of OnFlingListener already set."
            r12.<init>(r13)
            throw r12
        L_0x01dc:
            androidx.recyclerview.widget.RecyclerView r0 = r11.f6419k0
            com.google.android.material.datepicker.o r1 = r11.f6415g0
            com.google.android.material.datepicker.b r13 = r13.f6462c
            com.google.android.material.datepicker.o r13 = r13.f6392a
            int r13 = r13.k(r1)
            r0.Y(r13)
            androidx.recyclerview.widget.RecyclerView r13 = r11.f6419k0
            Q.h r0 = new Q.h
            r1 = 2
            r0.<init>(r1)
            K.O.l(r13, r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.k.C(android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    public final void J(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f6413e0);
        bundle.putParcelable("GRID_SELECTOR_KEY", (Parcelable) null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f6414f0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable) null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f6415g0);
    }

    public final void V(o oVar) {
        boolean z3;
        s sVar = (s) this.f6419k0.getAdapter();
        int k6 = sVar.f6462c.f6392a.k(oVar);
        int k7 = k6 - sVar.f6462c.f6392a.k(this.f6415g0);
        boolean z4 = false;
        if (Math.abs(k7) > 3) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (k7 > 0) {
            z4 = true;
        }
        this.f6415g0 = oVar;
        if (z3 && z4) {
            this.f6419k0.Y(k6 - 3);
            this.f6419k0.post(new a((Object) this, k6, 3));
        } else if (z3) {
            this.f6419k0.Y(k6 + 3);
            this.f6419k0.post(new a((Object) this, k6, 3));
        } else {
            this.f6419k0.post(new a((Object) this, k6, 3));
        }
    }

    public final void W(int i2) {
        this.f6416h0 = i2;
        if (i2 == 2) {
            this.f6418j0.getLayoutManager().n0(this.f6415g0.f6450c - ((y) this.f6418j0.getAdapter()).f6467c.f6414f0.f6392a.f6450c);
            this.f6422n0.setVisibility(0);
            this.f6423o0.setVisibility(8);
            this.f6420l0.setVisibility(8);
            this.f6421m0.setVisibility(8);
        } else if (i2 == 1) {
            this.f6422n0.setVisibility(8);
            this.f6423o0.setVisibility(0);
            this.f6420l0.setVisibility(0);
            this.f6421m0.setVisibility(0);
            V(this.f6415g0);
        }
    }
}
