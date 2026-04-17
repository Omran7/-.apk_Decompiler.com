package com.mtma.criminal.city.utils;

import B0.H;
import K1.e;
import R2.b;
import S3.t;
import com.google.android.gms.internal.measurement.a;
import d5.o;
import i3.C0587c;
import i3.C0588d;
import i3.C0592h;
import i3.C0595k;
import i3.n;
import i3.p;

/* renamed from: com.mtma.criminal.city.utils.u  reason: case insensitive filesystem */
public final class C0450u implements p {

    /* renamed from: a  reason: collision with root package name */
    public long f7475a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f7476b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f7477c;
    public final /* synthetic */ C0447q d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f7478e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f7479f;

    public C0450u(long j6, long j7, C0447q qVar, String str, int i2) {
        this.f7476b = j6;
        this.f7477c = j7;
        this.d = qVar;
        this.f7478e = str;
        this.f7479f = i2;
    }

    public final H f(C0595k kVar) {
        if (kVar.b() == null) {
            this.f7475a = 1;
            kVar.a("goldBullion").d(0);
            kVar.a("lastUpdatedTimeInMilli").d(n.f8294a);
            return b.W0(kVar);
        }
        Class<Long> cls = Long.class;
        long longValue = ((Long) kVar.a("lastUpdatedTimeInMilli").c(cls)).longValue();
        if (longValue < this.f7476b || longValue >= this.f7477c) {
            this.f7475a = 1;
        } else {
            this.f7475a = ((Long) kVar.a("goldBullion").c(cls)).longValue();
        }
        kVar.a("goldBullion").d(0);
        kVar.a("lastUpdatedTimeInMilli").d(n.f8294a);
        return b.W0(kVar);
    }

    public final void l(C0588d dVar, boolean z3, C0587c cVar) {
        if (this.f7475a > 0) {
            a.x(C0592h.d().e(), "activitiesTempData").E(I1.b.y(1)).E(o.getAccountObject().getId()).H(new t(this, 26));
            return;
        }
        e.r0(this.f7478e, this.f7479f, this.d);
    }
}
