package com.mtma.criminal.city.utils;

import B0.H;
import R2.b;
import d5.o;
import i3.C0587c;
import i3.C0588d;
import i3.C0595k;
import i3.p;
import java.util.ArrayList;
import v3.s;

public final class l0 implements p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7432a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ K f7433b;

    public l0(int i2, K k6) {
        this.f7432a = i2;
        this.f7433b = k6;
    }

    public final H f(C0595k kVar) {
        if (kVar.b() == null) {
            return b.W0(kVar);
        }
        ArrayList arrayList = (ArrayList) r3.b.b(((s) kVar.f8289a.f9345b).f(kVar.f8290b).getValue(), new StoreUtil$10$1(this));
        int i2 = this.f7432a;
        if (arrayList != null && arrayList.contains(Integer.valueOf(i2))) {
            return b.a();
        }
        arrayList.add(Integer.valueOf(i2));
        kVar.d(arrayList);
        return b.W0(kVar);
    }

    public final void l(C0588d dVar, boolean z3, C0587c cVar) {
        ArrayList arrayList = (ArrayList) cVar.e(new StoreUtil$10$2(this));
        K k6 = this.f7433b;
        if (dVar != null || !cVar.b() || !z3) {
            k6.k(arrayList, false);
            return;
        }
        o.getStockObject().setMuseumBackgroundAvailable(arrayList);
        k6.k(arrayList, true);
    }
}
