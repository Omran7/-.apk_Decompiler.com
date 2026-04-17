package a1;

import B0.H;
import K1.e;
import R2.b;
import S3.t;
import com.bumptech.glide.d;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.I;
import com.mtma.criminal.city.utils.A;
import com.mtma.criminal.city.utils.C0447q;
import com.mtma.criminal.city.utils.J;
import com.mtma.criminal.city.utils.Q;
import com.mtma.criminal.city.utils.S;
import com.mtma.criminal.city.utils.o0;
import com.mtma.criminal.city.utils.r0;
import d5.k;
import d5.m;
import d5.o;
import i3.C0587c;
import i3.C0588d;
import i3.C0595k;
import i3.n;
import i3.p;
import java.net.URL;

/* renamed from: a1.c  reason: case insensitive filesystem */
public final class C0258c implements p, o0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4549a;

    /* renamed from: b  reason: collision with root package name */
    public int f4550b;

    /* renamed from: c  reason: collision with root package name */
    public long f4551c;
    public Object d;

    public /* synthetic */ C0258c() {
        this.f4549a = 1;
    }

    public void d(int i2, boolean z3) {
        switch (this.f4549a) {
            case 3:
                if (z3) {
                    I i5 = new I(this, 3);
                    b.a1(this.f4550b, 1, this.f4551c, i5);
                    return;
                }
                b.w(false);
                a.n(MyApplication.f7090a, R.string.toast_not_enough_items, ((A) this.d).f7340b, (String) null);
                return;
            case 4:
                if (z3) {
                    I i6 = new I(this, 4);
                    b.a1(this.f4550b, 2, this.f4551c, i6);
                    return;
                }
                b.w(false);
                a.n(MyApplication.f7090a, R.string.toast_not_enough_items, ((A) this.d).f7340b, (String) null);
                return;
            default:
                if (z3) {
                    b.a1(this.f4550b, 0, this.f4551c, new t(this, 29));
                    return;
                }
                b.w(false);
                a.n(MyApplication.f7090a, R.string.toast_not_enough_items, ((A) this.d).f7340b, (String) null);
                return;
        }
    }

    public H f(C0595k kVar) {
        switch (this.f4549a) {
            case 2:
                if (kVar.b() == null) {
                    return b.W0(kVar);
                }
                long longValue = ((Long) kVar.c(Long.class)).longValue();
                if (longValue <= 0) {
                    return b.a();
                }
                long j6 = (long) (((double) longValue) * 0.03d);
                this.f4551c = j6;
                if (this.f4550b > 0) {
                    this.f4551c = (long) ((e.S(10) + 1.0d) * ((double) j6));
                }
                if (this.f4551c == 0) {
                    this.f4551c = 1;
                }
                kVar.d(Long.valueOf(longValue - this.f4551c));
                return b.W0(kVar);
            case zzaky.zzf.zzf /*6*/:
                k kVar2 = (k) kVar.c(k.class);
                if (kVar2 == null) {
                    return b.W0(kVar);
                }
                int i2 = 2;
                long j7 = this.f4551c;
                int i5 = this.f4550b;
                if (i5 == 0) {
                    if (j7 >= kVar2.getPowerChangeTimeInSeconds() + 120) {
                        if (!b.k0(kVar2.getVipEndTime())) {
                            i2 = 1;
                        }
                        int powerCurrent = kVar2.getPowerCurrent() + i2;
                        if (powerCurrent > d.B0(kVar2)) {
                            powerCurrent = d.B0(kVar2);
                        }
                        kVar2.setPowerCurrent(powerCurrent);
                        kVar2.setPowerChangeTimeInMilli(n.f8294a);
                    }
                } else if (i5 == 1) {
                    if (j7 >= kVar2.getCourageChangeTimeInSeconds() + 120) {
                        if (kVar2.getCourageDoubleEffectEndTime() <= j7) {
                            i2 = 1;
                        }
                        int courageCurrent = kVar2.getCourageCurrent() + i2;
                        if (courageCurrent > d.e0(kVar2.getLevel())) {
                            courageCurrent = d.e0(kVar2.getLevel());
                        }
                        kVar2.setCourageCurrent(courageCurrent);
                        kVar2.setCourageChangeTimeInMilli(n.f8294a);
                    }
                } else if (i5 == 2) {
                    if (j7 >= kVar2.getNobilityChangeTimeInSeconds() + 300) {
                        int nobilityCurrent = kVar2.getNobilityCurrent() + 1;
                        if (nobilityCurrent > 100) {
                            nobilityCurrent = 100;
                        }
                        kVar2.setNobilityCurrent(nobilityCurrent);
                        kVar2.setNobilityChangeTimeInMilli(n.f8294a);
                    }
                } else if (i5 == 3 && ((double) j7) >= ((double) kVar2.getHealthChangeTimeInSeconds()) + 120.0d) {
                    long o02 = (long) (((double) d.o0()) * 0.05d);
                    if (kVar2.getHealthDoubleEffectEndTime() > j7) {
                        o02 *= 2;
                    }
                    long healthCurrent = kVar2.getHealthCurrent() + o02;
                    if (healthCurrent > d.o0()) {
                        healthCurrent = d.o0();
                    }
                    kVar2.setHealthCurrent(healthCurrent);
                    kVar2.setHealthChangeTimeInMilli(n.f8294a);
                }
                kVar.d(kVar2);
                return b.W0(kVar);
            default:
                if (kVar.b() == null) {
                    return b.W0(kVar);
                }
                m mVar = (m) kVar.c(m.class);
                long j8 = 0;
                int i6 = this.f4550b;
                long j9 = this.f4551c;
                if (i6 == 0) {
                    if (mVar.getCash() - j9 < 0) {
                        return b.a();
                    }
                    mVar.setCash(mVar.getCash() - j9);
                    long ceil = (long) Math.ceil(((double) j9) * (0.05d - (e.S(19) * 0.05d)));
                    if (ceil >= 0) {
                        j8 = ceil;
                    }
                    mVar.setBankCash(mVar.getBankCash() + (j9 - j8));
                    kVar.d(mVar);
                    return b.W0(kVar);
                } else if (mVar.getBankCash() - j9 < 0) {
                    return b.a();
                } else {
                    mVar.setBankCash(mVar.getBankCash() - j9);
                    mVar.setCash(mVar.getCash() + j9);
                    kVar.d(mVar);
                    return b.W0(kVar);
                }
        }
    }

    public void l(C0588d dVar, boolean z3, C0587c cVar) {
        switch (this.f4549a) {
            case 2:
                C0447q qVar = (C0447q) this.d;
                if (dVar != null || !cVar.b() || !z3) {
                    qVar.a(this.f4551c, "cash", false);
                    return;
                } else {
                    qVar.a(this.f4551c, "cash", true);
                    return;
                }
            case zzaky.zzf.zzf /*6*/:
                k kVar = (k) cVar.f(k.class);
                J j6 = (J) this.d;
                if (dVar == null && z3 && cVar.b()) {
                    o.setMainStatesObject(kVar);
                    if (j6 != null) {
                        j6.h(true, kVar);
                    }
                    if (this.f4550b == 2 && kVar.getNobilityCurrent() == 0) {
                        Q.b(129, o.getAccountObject().getId(), (long) 1);
                        return;
                    }
                    return;
                } else if (j6 != null) {
                    j6.h(false, kVar);
                    return;
                } else {
                    return;
                }
            default:
                m mVar = (m) cVar.f(m.class);
                S s6 = (S) this.d;
                if (dVar != null || !cVar.b() || !z3) {
                    s6.g(false, mVar);
                    return;
                }
                o.setMoneyObject(mVar);
                s6.g(true, mVar);
                return;
        }
    }

    public /* synthetic */ C0258c(int i2, long j6, Object obj, int i5) {
        this.f4549a = i5;
        this.f4550b = i2;
        this.f4551c = j6;
        this.d = obj;
    }

    public /* synthetic */ C0258c(r0 r0Var, int i2, long j6, int i5) {
        this.f4549a = i5;
        this.d = r0Var;
        this.f4550b = i2;
        this.f4551c = j6;
    }

    public C0258c(int i2, URL url, long j6) {
        this.f4549a = 0;
        this.f4550b = i2;
        this.d = url;
        this.f4551c = j6;
    }

    public C0258c(int i2, C0447q qVar) {
        this.f4549a = 2;
        this.f4550b = i2;
        this.d = qVar;
        this.f4551c = 0;
    }
}
