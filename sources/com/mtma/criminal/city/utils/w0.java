package com.mtma.criminal.city.utils;

import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.google.android.gms.internal.measurement.a;
import d5.o;
import i3.C0592h;

public final class w0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f7487a;

    public w0(long j6) {
        this.f7487a = j6;
    }

    public final void run() {
        long lastSeenInSeconds = o.getMainStatesObject().getLastSeenInSeconds();
        long j6 = this.f7487a;
        if (j6 <= lastSeenInSeconds && c.f5744o != -111) {
            d.e();
            for (int i2 = 0; i2 < o.getEstateObject().getServantContractsStartTimeInMilliList().size(); i2++) {
                if (o.getEstateObject().getServantContractsStartTimeInMilliList().get(i2).longValue() != -1 && !d.M0(o.getEstateObject().getServantContractsStartTimeInMilliList().get(i2).longValue(), j6)) {
                    a.d(a.c(C0592h.b().e(), "players"), "estateObject", "allOwnEstates").E(o.getEstateObject().getFirebaseKeyNode()).E("servantContractsStartTimeInMilliList").E(String.valueOf(i2)).I(-1L);
                    a.d(a.c(C0592h.b().e(), "players"), "estateObject", "servantContractsStartTimeInMilliList").E(String.valueOf(i2)).I(-1L).addOnSuccessListener(new C0441k(i2));
                }
            }
            d.d(j6);
            c.d(j6);
            if (j6 - d.d > 20) {
                c.f();
                d.d = j6;
                c.F0(o.getMainStatesObject().getLevel(), o.getAccountObject().getId(), j6);
            }
        }
    }
}
