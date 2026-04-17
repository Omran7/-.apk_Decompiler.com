package com.mtma.criminal.city.utils;

import X4.d;
import android.support.v4.media.session.a;
import d5.o;
import i3.C0587c;
import i3.C0588d;
import i3.q;
import java.util.Map;

public final class k0 implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7429a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f7430b;

    public k0(d dVar, int i2) {
        this.f7430b = dVar;
        this.f7429a = i2;
    }

    public final void u(C0587c cVar) {
        int i2 = this.f7429a - a.g0((Map) cVar.e(new StoreUtil$1$1$1(this)))[0];
        d dVar = this.f7430b;
        if (com.google.android.gms.internal.measurement.a.t((String) dVar.f4209b)) {
            o.getStockObject().setStockFreeSpace(i2);
        }
        ((p0) dVar.f4210c).o(i2);
    }

    public final void B(C0588d dVar) {
    }
}
