package com.mtma.criminal.city.utils;

import B0.H;
import R2.b;
import android.support.v4.media.session.a;
import com.bumptech.glide.d;
import d5.k;
import i3.C0595k;
import i3.n;
import i3.p;
import j4.C;

/* renamed from: com.mtma.criminal.city.utils.f  reason: case insensitive filesystem */
public final class C0436f implements p {

    /* renamed from: a  reason: collision with root package name */
    public int f7405a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7406b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f7407c;
    public final /* synthetic */ int d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C f7408e;

    public C0436f(int i2, boolean z3, int i5, C c3) {
        this.f7406b = i2;
        this.f7407c = z3;
        this.d = i5;
        this.f7408e = c3;
    }

    public final H f(C0595k kVar) {
        int i2;
        int i5;
        if (kVar.b() == null) {
            return b.W0(kVar);
        }
        k kVar2 = (k) kVar.c(k.class);
        if (kVar2 == null || kVar2.getCourageCurrent() < (i5 = i2 + 1)) {
            return b.a();
        }
        kVar2.setCourageCurrent(kVar2.getCourageCurrent() - i5);
        kVar2.setCourageChangeTimeInMilli(n.f8294a);
        this.f7405a = kVar2.getLevel();
        int v02 = d.v0(80, "server_maximum_level");
        if (this.f7407c && this.f7405a < v02) {
            long E6 = (long) a.E((i2 = this.f7406b), this.d);
            boolean z3 = true;
            while (z3) {
                long levelCurrentExperience = kVar2.getLevelCurrentExperience();
                long w02 = d.w0(kVar2.getLevel());
                long j6 = levelCurrentExperience + E6;
                if (j6 < w02) {
                    kVar2.setLevelCurrentExperience(j6);
                } else {
                    kVar2.setLevel(kVar2.getLevel() + 1);
                    kVar2.setLevelCurrentExperience(0);
                    if (kVar2.getPowerCurrent() < d.B0(kVar2)) {
                        kVar2.setPowerCurrent(d.B0(kVar2));
                    }
                    if (kVar2.getCourageCurrent() < d.e0(kVar2.getLevel())) {
                        kVar2.setCourageCurrent(d.e0(kVar2.getLevel()));
                    }
                    if (kVar2.getNobilityCurrent() < 100) {
                        kVar2.setNobilityCurrent(100);
                    }
                    if (kVar2.getHealthCurrent() < d.p0(kVar2)) {
                        kVar2.setHealthCurrent(d.p0(kVar2));
                    }
                    long j7 = j6 - w02;
                    if (kVar2.getLevel() == v02) {
                        E6 = j7;
                    } else {
                        E6 = j7;
                    }
                }
                z3 = false;
            }
        }
        kVar.d(kVar2);
        return b.W0(kVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(i3.C0588d r10, boolean r11, i3.C0587c r12) {
        /*
            r9 = this;
            r0 = 1
            j4.C r1 = r9.f7408e
            java.lang.Class<d5.k> r2 = d5.k.class
            r3 = 0
            if (r10 != 0) goto L_0x0213
            boolean r10 = r12.b()
            if (r10 == 0) goto L_0x0213
            if (r11 != 0) goto L_0x0012
            goto L_0x0213
        L_0x0012:
            java.lang.Object r10 = r12.f(r2)
            d5.k r10 = (d5.k) r10
            d5.o.setMainStatesObject(r10)
            boolean r11 = r9.f7407c
            r12 = 2
            if (r11 == 0) goto L_0x01bc
            d5.e r11 = d5.o.getCrimeObject()
            int r11 = r11.getLastOpenedCrimeType()
            java.util.ArrayList r2 = android.support.v4.media.session.a.w()
            int r2 = r2.size()
            int r2 = r2 - r0
            int r4 = r9.f7406b
            if (r11 < r2) goto L_0x005c
            d5.e r11 = d5.o.getCrimeObject()
            int r11 = r11.getLastOpenedCrimeItem()
            java.util.ArrayList r2 = android.support.v4.media.session.a.G(r4)
            int r2 = r2.size()
            int r2 = r2 - r0
            if (r11 < r2) goto L_0x005c
            d5.e r11 = d5.o.getCrimeObject()
            double r5 = r11.getLastOpenedCrimeExecutionNumber()
            int r11 = android.support.v4.media.session.a.D()
            int r11 = r11 * r12
            double r7 = (double) r11
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 < 0) goto L_0x005c
            goto L_0x01bc
        L_0x005c:
            d5.e r11 = d5.o.getCrimeObject()
            int r11 = r11.getLastOpenedCrimeType()
            int r2 = r9.d
            if (r4 != r11) goto L_0x0075
            int r11 = r2 + 1
            d5.e r5 = d5.o.getCrimeObject()
            int r5 = r5.getLastOpenedCrimeItem()
            if (r11 < r5) goto L_0x0075
            goto L_0x0095
        L_0x0075:
            d5.e r11 = d5.o.getCrimeObject()
            int r11 = r11.getLastOpenedCrimeItem()
            if (r11 != 0) goto L_0x01bc
            d5.e r11 = d5.o.getCrimeObject()
            int r11 = r11.getLastOpenedCrimeType()
            int r11 = r11 - r0
            if (r4 != r11) goto L_0x01bc
            java.util.ArrayList r11 = android.support.v4.media.session.a.G(r4)
            int r11 = r11.size()
            int r11 = r11 - r0
            if (r2 != r11) goto L_0x01bc
        L_0x0095:
            d5.e r11 = d5.o.getCrimeObject()
            int r11 = r11.getLastOpenedCrimeItem()
            if (r2 != r11) goto L_0x00a8
            int r11 = android.support.v4.media.session.a.C(r4, r2)
            if (r11 != 0) goto L_0x00a8
            r1 = 4611686018427387904(0x4000000000000000, double:2.0)
            goto L_0x00bd
        L_0x00a8:
            d5.e r11 = d5.o.getCrimeObject()
            int r11 = r11.getLastOpenedCrimeItem()
            if (r2 != r11) goto L_0x00bb
            int r11 = android.support.v4.media.session.a.C(r4, r2)
            if (r11 != r0) goto L_0x00bb
            r1 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            goto L_0x00bd
        L_0x00bb:
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x00bd:
            d5.e r11 = d5.o.getCrimeObject()
            double r5 = r11.getLastOpenedCrimeExecutionNumber()
            double r5 = r5 + r1
            int r11 = android.support.v4.media.session.a.D()
            int r11 = r11 * r12
            double r7 = (double) r11
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            java.lang.String r5 = "crimeObject"
            java.lang.String r6 = "players"
            if (r11 < 0) goto L_0x0179
            d5.e r11 = new d5.e
            r11.<init>()
            r7 = 0
            r11.setLastOpenedCrimeExecutionNumber(r7)
            d5.e r7 = d5.o.getCrimeObject()
            int r7 = r7.getLastOpenedCrimeItem()
            java.util.ArrayList r4 = android.support.v4.media.session.a.G(r4)
            int r4 = r4.size()
            int r4 = r4 - r0
            if (r7 < r4) goto L_0x0138
            d5.e r4 = d5.o.getCrimeObject()
            int r4 = r4.getLastOpenedCrimeType()
            java.util.ArrayList r7 = android.support.v4.media.session.a.w()
            int r7 = r7.size()
            int r7 = r7 - r0
            if (r4 >= r7) goto L_0x0115
            d5.e r1 = d5.o.getCrimeObject()
            int r1 = r1.getLastOpenedCrimeType()
            int r1 = r1 + r0
            r11.setLastOpenedCrimeType(r1)
            r11.setLastOpenedCrimeItem(r3)
            r1 = r0
            goto L_0x0150
        L_0x0115:
            d5.e r4 = d5.o.getCrimeObject()
            double r7 = r4.getLastOpenedCrimeExecutionNumber()
            double r7 = r7 + r1
            r11.setLastOpenedCrimeExecutionNumber(r7)
            d5.e r1 = d5.o.getCrimeObject()
            int r1 = r1.getLastOpenedCrimeType()
            r11.setLastOpenedCrimeType(r1)
            d5.e r1 = d5.o.getCrimeObject()
            int r1 = r1.getLastOpenedCrimeItem()
            r11.setLastOpenedCrimeItem(r1)
            goto L_0x014f
        L_0x0138:
            d5.e r1 = d5.o.getCrimeObject()
            int r1 = r1.getLastOpenedCrimeType()
            r11.setLastOpenedCrimeType(r1)
            d5.e r1 = d5.o.getCrimeObject()
            int r1 = r1.getLastOpenedCrimeItem()
            int r1 = r1 + r0
            r11.setLastOpenedCrimeItem(r1)
        L_0x014f:
            r1 = r3
        L_0x0150:
            i3.h r2 = i3.C0592h.d()
            i3.f r2 = r2.e()
            i3.f r2 = com.google.android.gms.internal.measurement.a.x(r2, r6)
            d5.a r4 = d5.o.getAccountObject()
            java.lang.String r4 = r4.getId()
            i3.f r2 = r2.E(r4)
            i3.f r2 = r2.E(r5)
            com.google.android.gms.tasks.Task r2 = r2.I(r11)
            K4.g r4 = new K4.g
            r4.<init>((com.mtma.criminal.city.utils.C0436f) r9, (boolean) r1, (d5.C0472e) r11, (d5.k) r10)
            r2.addOnCompleteListener(r4)
            goto L_0x01bf
        L_0x0179:
            i3.h r11 = i3.C0592h.d()
            i3.f r11 = r11.e()
            i3.f r11 = com.google.android.gms.internal.measurement.a.x(r11, r6)
            java.lang.String r4 = "lastOpenedCrimeExecutionNumber"
            i3.f r11 = com.google.android.gms.internal.measurement.a.d(r11, r5, r4)
            java.util.Map r4 = i3.n.f8294a
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r4 = "increment"
            r2.put(r4, r1)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r4 = ".sv"
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r2)
            r1.put(r4, r2)
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            java.util.Map r1 = (java.util.Map) r1
            com.google.android.gms.tasks.Task r11 = r11.I(r1)
            H4.d r1 = new H4.d
            r1.<init>((com.mtma.criminal.city.utils.C0436f) r9, (d5.k) r10)
            r11.addOnCompleteListener(r1)
            goto L_0x01bf
        L_0x01bc:
            r1.c(r0)
        L_0x01bf:
            int r11 = r10.getLevel()
            int r1 = r9.f7405a
            int r11 = r11 - r1
            if (r11 <= 0) goto L_0x021c
            d5.a r1 = d5.o.getAccountObject()
            java.lang.String r1 = r1.getId()
            long r4 = (long) r11
            android.support.v4.media.session.a.C0(r3, r0, r4, r1)
            d5.a r11 = d5.o.getAccountObject()
            java.lang.String r11 = r11.getId()
            android.support.v4.media.session.a.C0(r0, r3, r4, r11)
            d5.a r11 = d5.o.getAccountObject()
            java.lang.String r11 = r11.getId()
            int r1 = r10.getLevel()
            long r1 = (long) r1
            android.support.v4.media.session.a.C0(r12, r0, r1, r11)
            d5.a r11 = d5.o.getAccountObject()
            java.lang.String r11 = r11.getId()
            int r12 = r10.getLevel()
            long r0 = (long) r12
            com.mtma.criminal.city.utils.Q.b(r3, r11, r0)
            d5.a r11 = d5.o.getAccountObject()
            java.lang.String r11 = r11.getId()
            int r12 = r10.getLevel()
            long r0 = r10.getLastSeen()
            com.bumptech.glide.c.F0(r12, r11, r0)
            goto L_0x021c
        L_0x0213:
            java.lang.Object r10 = r12.f(r2)
            d5.k r10 = (d5.k) r10
            r1.c(r3)
        L_0x021c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mtma.criminal.city.utils.C0436f.l(i3.d, boolean, i3.c):void");
    }
}
