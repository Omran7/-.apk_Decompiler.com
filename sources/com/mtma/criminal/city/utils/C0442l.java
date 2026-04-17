package com.mtma.criminal.city.utils;

import androidx.fragment.app.D;
import com.bumptech.glide.d;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.fragments.gangBase.I;
import d5.o;
import i3.C0587c;
import i3.C0588d;
import i3.C0590f;
import i3.C0592h;
import i3.q;
import q3.C0936a;

/* renamed from: com.mtma.criminal.city.utils.l  reason: case insensitive filesystem */
public final class C0442l implements q, C0936a {

    /* renamed from: a  reason: collision with root package name */
    public long f7431a;

    public long e() {
        return System.currentTimeMillis() + this.f7431a;
    }

    public void u(C0587c cVar) {
        long j6;
        try {
            j6 = ((Long) cVar.f(Long.class)).longValue();
        } catch (Exception unused) {
            j6 = 0;
        }
        if (j6 >= d.i0(o.getEstateObject().getId())) {
            d.k1(this.f7431a, new D(14));
            return;
        }
        C0590f v6 = a.v(a.c(C0592h.b().e(), "players"), "estateObject");
        v6.E("allOwnEstates").E("--defaultEstate").d(new I(v6, 1));
    }

    public void B(C0588d dVar) {
    }
}
