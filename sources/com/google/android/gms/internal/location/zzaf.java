package com.google.android.gms.internal.location;

import Q1.A;
import Q1.C0139d;
import Q1.e;
import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.K;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.internal.I;
import java.util.ArrayList;
import java.util.List;

public final class zzaf {
    @Deprecated
    public final q addGeofences(o oVar, List<C0139d> list, PendingIntent pendingIntent) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (C0139d next : list) {
                if (next != null) {
                    I.a("Geofence must be created using Geofence.Builder.", next instanceof zzbe);
                    arrayList.add((zzbe) next);
                }
            }
        }
        I.a("No geofence has been added to this request.", !arrayList.isEmpty());
        return ((K) oVar).f6046b.doWrite(new zzac(this, oVar, new e(arrayList, 5, "", (String) null), pendingIntent));
    }

    public final q removeGeofences(o oVar, PendingIntent pendingIntent) {
        I.h(pendingIntent, "PendingIntent can not be null.");
        return zza(oVar, new A((List) null, pendingIntent, ""));
    }

    public final q zza(o oVar, A a6) {
        return ((K) oVar).f6046b.doWrite(new zzad(this, oVar, a6));
    }

    public final q removeGeofences(o oVar, List<String> list) {
        I.h(list, "geofence can't be null.");
        I.a("Geofences must contains at least one id.", !list.isEmpty());
        return zza(oVar, new A(list, (PendingIntent) null, ""));
    }

    public final q addGeofences(o oVar, e eVar, PendingIntent pendingIntent) {
        return ((K) oVar).f6046b.doWrite(new zzac(this, oVar, eVar, pendingIntent));
    }
}
