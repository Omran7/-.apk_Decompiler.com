package com.mtma.criminal.city.utils;

import B0.H;
import R2.b;
import a1.C0258c;
import com.bumptech.glide.d;
import com.google.android.gms.internal.measurement.a;
import d5.k;
import d5.o;
import i3.C0587c;
import i3.C0588d;
import i3.C0592h;
import i3.C0595k;
import i3.n;
import i3.p;

public final class I implements r0, p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7357a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ J f7358b;

    public /* synthetic */ I(int i2, J j6) {
        this.f7357a = i2;
        this.f7358b = j6;
    }

    public H f(C0595k kVar) {
        k kVar2 = (k) kVar.c(k.class);
        if (kVar2 == null) {
            return b.W0(kVar);
        }
        int i2 = this.f7357a;
        if (i2 == 0) {
            if (kVar2.getPowerCurrent() >= d.B0(kVar2)) {
                return b.a();
            }
            kVar2.setPowerCurrent(d.B0(kVar2));
            kVar2.setPowerChangeTimeInMilli(n.f8294a);
        } else if (i2 == 1) {
            if (kVar2.getCourageCurrent() >= d.e0(kVar2.getLevel())) {
                return b.a();
            }
            kVar2.setCourageCurrent(d.e0(kVar2.getLevel()));
            kVar2.setCourageChangeTimeInMilli(n.f8294a);
        } else if (i2 == 2) {
            if (kVar2.getNobilityCurrent() == 100) {
                return b.a();
            }
            if (kVar2.getNobilityCurrent() + 20 > 100) {
                kVar2.setNobilityCurrent(100);
            } else {
                kVar2.setNobilityCurrent(kVar2.getNobilityCurrent() + 20);
            }
            kVar2.setNobilityChangeTimeInMilli(n.f8294a);
        } else if (i2 == 3) {
            if (kVar2.getHealthCurrent() >= d.p0(kVar2)) {
                return b.a();
            }
            kVar2.setHealthCurrent(d.p0(kVar2));
            kVar2.setHealthChangeTimeInMilli(n.f8294a);
        }
        kVar.d(kVar2);
        return b.W0(kVar);
    }

    public void j(long j6) {
        a.v(a.c(C0592h.b().e(), "players"), "mainStatesObject").H(new C0258c(this.f7357a, j6, (Object) this.f7358b, 6));
    }

    public void l(C0588d dVar, boolean z3, C0587c cVar) {
        k kVar = (k) cVar.f(k.class);
        J j6 = this.f7358b;
        if (dVar != null || !z3 || !cVar.b()) {
            j6.h(false, kVar);
            return;
        }
        o.setMainStatesObject(kVar);
        j6.h(true, kVar);
    }
}
