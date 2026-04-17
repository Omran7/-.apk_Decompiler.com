package com.mtma.criminal.city.utils;

import A2.f;
import B0.H;
import B0.l;
import K1.e;
import R2.b;
import android.support.v4.media.session.a;
import b5.i;
import com.bumptech.glide.c;
import d5.j;
import h0.C0552a;
import i3.C0586b;
import i3.C0587c;
import i3.C0588d;
import i3.C0590f;
import i3.C0592h;
import i3.C0595k;
import i3.n;
import i3.p;
import i3.q;
import java.util.ArrayList;
import java.util.Iterator;
import o3.d;
import v3.m;

public final class G implements p, q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7354a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f7355b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f7356c;
    public final /* synthetic */ int d;

    public /* synthetic */ G(int i2, int i5, long j6, String str) {
        this.f7354a = i5;
        this.f7355b = j6;
        this.f7356c = str;
        this.d = i2;
    }

    public void B(C0588d dVar) {
        int i2 = this.f7354a;
    }

    public H f(C0595k kVar) {
        if (kVar.b() == null) {
            return b.W0(kVar);
        }
        j jVar = (j) kVar.c(j.class);
        int currentCity = jVar.getCurrentCity();
        int currentPlace = jVar.getCurrentPlace();
        String d6 = e.d(2, (long) currentCity);
        String d7 = e.d(2, (long) currentPlace);
        long j6 = this.f7355b;
        String valueOf = String.valueOf(j6);
        StringBuilder sb = new StringBuilder();
        sb.append(d6);
        sb.append(".");
        sb.append(d7);
        sb.append(".");
        sb.append(valueOf);
        sb.append(".");
        String str = this.f7356c;
        sb.append(str);
        jVar.setSortByCityPlaceLastSeen(sb.toString());
        int currentCity2 = jVar.getCurrentCity();
        int currentPlace2 = jVar.getCurrentPlace();
        String d8 = e.d(2, (long) currentCity2);
        String d9 = e.d(2, (long) currentPlace2);
        String d10 = e.d(5, (long) this.d);
        String valueOf2 = String.valueOf(j6);
        jVar.setSortByCityPlaceLevelLastSeen(d8 + "." + d9 + "." + d10 + "." + valueOf2 + "." + str);
        kVar.d(jVar);
        return b.W0(kVar);
    }

    public void u(C0587c cVar) {
        long j6;
        long j7;
        long j8;
        long j9;
        int i2;
        int i5;
        C0587c cVar2 = cVar;
        Class<Long> cls = Long.class;
        String str = this.f7356c;
        long j10 = this.f7355b;
        int i6 = this.d;
        switch (this.f7354a) {
            case 1:
                try {
                    j6 = ((Long) cVar2.a("updatedTimeInMilli").f(cls)).longValue();
                } catch (Exception e6) {
                    ArrayList arrayList = Q.f7375a;
                    C0552a.x(e6, "Exception from try-catch block when get integer from Firebase (ignore it, default value added 0).", "Q");
                    j6 = 0;
                }
                if (c.W(Long.valueOf(j6)) > c.Y(j10) || c.W(Long.valueOf(j6)) < c.Y(j10) - 86400) {
                    if (!c.b0(j6, j10)) {
                        Q.h(i6, str);
                        if (i6 == 5) {
                            a.C0(2, 0, 0, str);
                            return;
                        }
                        return;
                    }
                    return;
                }
                try {
                    j7 = ((Long) cVar2.a("amount").f(cls)).longValue();
                } catch (Exception e7) {
                    ArrayList arrayList2 = Q.f7375a;
                    C0552a.x(e7, "Exception from try-catch block when get integer from Firebase (ignore it, default value added 0).", "Q");
                    j7 = 0;
                }
                long j11 = j7 + 1;
                d.d(C0592h.b().e(), "players", str, "medalsObject", "allMedalsDetails").E(e.w(i6)).E("updatedTimeInMilli").I(n.f8294a);
                d.d(C0592h.b().e(), "players", str, "medalsObject", "allMedalsDetails").E(e.w(i6)).E("amount").I(Long.valueOf(j11)).addOnSuccessListener(new O(this, j11, 0));
                if (i6 == 5) {
                    a.C0(2, 0, j11, str);
                    return;
                }
                return;
            case 2:
                try {
                    j8 = ((Long) cVar2.a("updatedTimeInMilli").f(cls)).longValue();
                } catch (Exception e8) {
                    ArrayList arrayList3 = Q.f7375a;
                    C0552a.x(e8, "Exception from try-catch block when get integer from Firebase (ignore it, default value added 0).", "Q");
                    j8 = 0;
                }
                if (!c.b0(j8, j10)) {
                    try {
                        j9 = ((Long) cVar2.a("amount").f(cls)).longValue();
                    } catch (Exception e9) {
                        ArrayList arrayList4 = Q.f7375a;
                        C0552a.x(e9, "Exception from try-catch block when get integer from Firebase (ignore it, default value added 0).", "Q");
                        j9 = 0;
                    }
                    long j12 = j9 + 1;
                    com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players").E(str).E("medalsObject").E("allMedalsDetails").E(e.w(i6)).E("updatedTimeInMilli").I(n.f8294a);
                    d.d(C0592h.b().e(), "players", str, "medalsObject", "allMedalsDetails").E(e.w(i6)).E("amount").I(Long.valueOf(j12)).addOnSuccessListener(new O(this, j12, 1));
                    return;
                }
                return;
            case 3:
                Class<Integer> cls2 = Integer.class;
                try {
                    i2 = ((Integer) cVar2.a("amount").f(cls2)).intValue();
                } catch (Exception e10) {
                    ArrayList arrayList5 = Q.f7375a;
                    C0552a.x(e10, "Exception from try-catch block when get integer for medal amount from Firebase (ignore it, default value added 0).", "Q");
                    i2 = 0;
                }
                try {
                    i5 = ((Integer) cVar2.a("level").f(cls2)).intValue();
                } catch (Exception e11) {
                    ArrayList arrayList6 = Q.f7375a;
                    C0552a.x(e11, "Exception from try-catch block when get integer for medal level from Firebase (ignore it, default value added 0).", "Q");
                    i5 = 0;
                }
                long j13 = ((long) i2) + j10;
                com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players").E(str).E("medalsObject").E("allMedalsDetails").E(e.w(i6)).E("amount").I(Long.valueOf(j13)).addOnSuccessListener(new P(this, i5, j13));
                return;
            default:
                i iVar = new i(i6);
                ArrayList arrayList7 = new ArrayList();
                C0586b c3 = cVar.c();
                while (true) {
                    Iterator it2 = c3.f8276a;
                    if (it2.hasNext()) {
                        v3.q qVar = (v3.q) it2.next();
                        C0590f E6 = c3.f8277b.f8279b.E(qVar.f12304a.f12280a);
                        iVar = (i) r3.b.c(i.class, m.t(qVar.f12305b).f12296a.getValue());
                        arrayList7.add(E6);
                    } else {
                        long c6 = (long) Q.c(i6, iVar.getLevel());
                        if (c6 != -100 && j10 >= c6) {
                            int level = iVar.getLevel() + 1;
                            com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players").E(str).E("medalsObject").E("allMedalsDetails").E(e.w(i6)).E("level").H(new l(level, (Object) new f((Object) this, (Object) arrayList7, level, 6), 11));
                            return;
                        }
                        return;
                    }
                }
                break;
        }
    }

    public G(int i2, String str, long j6) {
        this.f7354a = 4;
        this.d = i2;
        this.f7355b = j6;
        this.f7356c = str;
    }

    private final void a(C0588d dVar) {
    }

    private final void b(C0588d dVar) {
    }

    private final void c(C0588d dVar) {
    }

    private final void d(C0588d dVar) {
    }

    public void l(C0588d dVar, boolean z3, C0587c cVar) {
    }
}
