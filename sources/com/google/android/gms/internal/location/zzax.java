package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0351e;
import z1.C1132b;

final class zzax extends zzaj {
    private C0351e zza;

    public zzax(C0351e eVar) {
        this.zza = eVar;
    }

    private final void zze(int i2) {
        C0351e eVar = this.zza;
        if (eVar == null) {
            Log.wtf("LocationClientImpl", "onRemoveGeofencesResult called multiple times", new Exception());
            return;
        }
        if ((i2 < 0 || i2 > 1) && (i2 < 1000 || i2 >= 1006)) {
            i2 = 1;
        }
        if (i2 == 1) {
            i2 = 13;
        }
        eVar.setResult(new Status(i2, (String) null, (PendingIntent) null, (C1132b) null));
        this.zza = null;
    }

    public final void zzb(int i2, String[] strArr) {
        Log.wtf("LocationClientImpl", "Unexpected call to onAddGeofencesResult", new Exception());
    }

    public final void zzc(int i2, String[] strArr) {
        zze(i2);
    }

    public final void zzd(int i2, PendingIntent pendingIntent) {
        zze(i2);
    }
}
