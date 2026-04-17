package com.mtma.criminal.city.utils;

import B0.H;
import R2.b;
import b5.n;
import d5.o;
import i3.C0587c;
import i3.C0588d;
import i3.C0595k;
import i3.p;

public final class n0 implements p {

    /* renamed from: a  reason: collision with root package name */
    public boolean f7442a = false;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f7443b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f7444c;
    public final /* synthetic */ int d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f7445e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f7446f;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ int f7447p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f7448q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ o0 f7449r;

    public n0(int i2, int i5, int i6, int i7, o0 o0Var, String str, String str2, boolean z3) {
        this.f7443b = str;
        this.f7444c = z3;
        this.d = i2;
        this.f7445e = str2;
        this.f7446f = i5;
        this.f7447p = i6;
        this.f7448q = i7;
        this.f7449r = o0Var;
    }

    public final H f(C0595k kVar) {
        boolean equals = this.f7443b.equals(o.getAccountObject().getId());
        String str = this.f7445e;
        int i2 = this.d;
        if (equals && this.f7444c && ((i2 > 0 && str.equals("count") && o.getStockObject().getStockFreeSpace() < i2) || (i2 > 0 && str.equals("countInBag") && o.getStockObject().getBagFreeSpace() < i2))) {
            return b.a();
        }
        if (kVar.b() == null) {
            if (i2 > 0) {
                n nVar = new n(this.f7446f, this.f7447p);
                nVar.setLevel(this.f7448q);
                if (str.equals("countInBag")) {
                    nVar.setCountInBag(i2);
                } else {
                    nVar.setCount(i2);
                }
                kVar.d(nVar);
            }
            return b.W0(kVar);
        }
        n nVar2 = (n) kVar.c(n.class);
        if ((str.equals("count") && nVar2.getCount() + i2 < 0) || ((str.equals("countInBag") && nVar2.getCountInBag() + i2 < 0) || (str.equals("count") && nVar2.isUsedInArming() && nVar2.getCount() + i2 < 1))) {
            return b.a();
        }
        this.f7442a = true;
        if (str.equals("count")) {
            nVar2.setCount(nVar2.getCount() + i2);
        } else {
            nVar2.setCountInBag(nVar2.getCountInBag() + i2);
        }
        if (nVar2.getCount() == 0 && nVar2.getCountInBag() == 0) {
            kVar.d((Object) null);
            return b.W0(kVar);
        }
        kVar.d(nVar2);
        return b.W0(kVar);
    }

    public final void l(C0588d dVar, boolean z3, C0587c cVar) {
        o0 o0Var = this.f7449r;
        if (dVar != null || !z3 || (!cVar.b() && !this.f7442a)) {
            if (o0Var != null) {
                o0Var.d(-1, false);
            }
        } else if (o0Var == null) {
        } else {
            if (cVar.b()) {
                o0Var.d(((Integer) cVar.a(this.f7445e).f(Integer.class)).intValue(), true);
            } else {
                o0Var.d(0, true);
            }
        }
    }
}
