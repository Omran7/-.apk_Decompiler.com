package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import m0.C0827t;
import m0.P;

public final class g extends LinearLayoutManager {

    /* renamed from: E  reason: collision with root package name */
    public final /* synthetic */ int f6407E;
    public final /* synthetic */ k F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(k kVar, int i2, int i5) {
        super(i2);
        this.F = kVar;
        this.f6407E = i5;
    }

    public final void A0(P p6, int[] iArr) {
        int i2 = this.f6407E;
        k kVar = this.F;
        if (i2 == 0) {
            iArr[0] = kVar.f6419k0.getWidth();
            iArr[1] = kVar.f6419k0.getWidth();
            return;
        }
        iArr[0] = kVar.f6419k0.getHeight();
        iArr[1] = kVar.f6419k0.getHeight();
    }

    public final void x0(RecyclerView recyclerView, int i2) {
        C0827t tVar = new C0827t(recyclerView.getContext());
        tVar.f10050a = i2;
        y0(tVar);
    }
}
