package com.mtma.criminal.city.utils;

import B0.H;
import R2.b;
import android.support.v4.media.session.a;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import d5.i;
import d5.k;
import d5.o;
import i3.C0587c;
import i3.C0588d;
import i3.C0595k;
import i3.p;

public final class C implements p, r0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7344a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f7345b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f7346c;
    public final /* synthetic */ long d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f7347e;

    public C(int i2, int i5, long j6, String str) {
        this.f7345b = i2;
        this.f7346c = i5;
        this.f7347e = str;
        this.d = j6;
    }

    public H f(C0595k kVar) {
        switch (this.f7344a) {
            case 0:
                i iVar = (i) kVar.c(i.class);
                if (iVar == null) {
                    iVar = new i();
                }
                long j6 = this.d;
                int i2 = this.f7346c;
                int i5 = this.f7345b;
                if (i5 == 0) {
                    if (iVar.getHerbIdsList().contains(Integer.valueOf(i2))) {
                        int indexOf = iVar.getHerbIdsList().indexOf(Integer.valueOf(i2));
                        if (j6 < b.T(iVar.getHerbIdsList().get(indexOf).intValue()) + iVar.getHerbUsingStartTimeList().get(indexOf).longValue()) {
                            return b.a();
                        }
                        iVar.getHerbTypesList().remove(indexOf);
                        iVar.getHerbIdsList().remove(indexOf);
                        iVar.getHerbUsingStartTimeList().remove(indexOf);
                    }
                } else if (iVar.getHerbTypesList().contains(Integer.valueOf(i5))) {
                    int indexOf2 = iVar.getHerbTypesList().indexOf(Integer.valueOf(i5));
                    if (j6 < b.T(iVar.getHerbIdsList().get(indexOf2).intValue()) + iVar.getHerbUsingStartTimeList().get(indexOf2).longValue()) {
                        return b.a();
                    }
                    iVar.getHerbTypesList().remove(indexOf2);
                    iVar.getHerbIdsList().remove(indexOf2);
                    iVar.getHerbUsingStartTimeList().remove(indexOf2);
                }
                iVar.getHerbTypesList().add(0, Integer.valueOf(i5));
                iVar.getHerbIdsList().add(0, Integer.valueOf(i2));
                iVar.getHerbUsingStartTimeList().add(0, Long.valueOf(j6));
                kVar.d(iVar);
                return b.W0(kVar);
            default:
                k kVar2 = (k) kVar.c(k.class);
                if (kVar2 == null) {
                    return b.W0(kVar);
                }
                this.f7345b = kVar2.getLevel();
                int level = kVar2.getLevel();
                int i6 = this.f7346c;
                if (level >= i6) {
                    return b.a();
                }
                long j7 = this.d;
                boolean z3 = true;
                while (z3) {
                    long levelCurrentExperience = kVar2.getLevelCurrentExperience();
                    long w02 = d.w0(kVar2.getLevel());
                    long j8 = levelCurrentExperience + j7;
                    if (j8 < w02) {
                        kVar2.setLevelCurrentExperience(j8);
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
                        long j9 = j8 - w02;
                        if (kVar2.getLevel() == i6) {
                            j7 = j9;
                        } else {
                            j7 = j9;
                        }
                    }
                    z3 = false;
                }
                kVar.d(kVar2);
                return b.W0(kVar);
        }
    }

    public void j(long j6) {
        String b02 = a.b0(this.f7345b, j6);
        long j7 = this.d;
        a.D0(this.f7345b, this.f7346c, (String) this.f7347e, j7, b02);
    }

    public void l(C0588d dVar, boolean z3, C0587c cVar) {
        switch (this.f7344a) {
            case 0:
                D d6 = (D) this.f7347e;
                Class<i> cls = i.class;
                if (dVar != null || !z3 || !cVar.b()) {
                    d6.e(false, (i) cVar.f(cls));
                    return;
                } else {
                    d6.e(true, (i) cVar.f(cls));
                    return;
                }
            default:
                Class<k> cls2 = k.class;
                k kVar = (k) cVar.f(cls2);
                J j6 = (J) this.f7347e;
                if (dVar != null || !cVar.b() || !z3) {
                    j6.h(false, (k) cVar.f(cls2));
                    return;
                }
                o.setMainStatesObject(kVar);
                j6.h(true, kVar);
                int level = kVar.getLevel() - this.f7345b;
                if (level > 0) {
                    long j7 = (long) level;
                    a.C0(0, 1, j7, o.getAccountObject().getId());
                    a.C0(1, 0, j7, o.getAccountObject().getId());
                    a.C0(2, 1, (long) kVar.getLevel(), o.getAccountObject().getId());
                    Q.b(0, o.getAccountObject().getId(), (long) kVar.getLevel());
                    c.F0(kVar.getLevel(), o.getAccountObject().getId(), kVar.getLastSeen());
                    return;
                }
                return;
        }
    }

    public C(int i2, int i5, long j6, D d6) {
        this.f7345b = i2;
        this.f7346c = i5;
        this.d = j6;
        this.f7347e = d6;
    }

    public C(int i2, long j6, J j7) {
        this.f7346c = i2;
        this.d = j6;
        this.f7347e = j7;
    }
}
