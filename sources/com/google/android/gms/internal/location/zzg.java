package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.K;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.q;

public final class zzg {
    public final q removeActivityUpdates(o oVar, PendingIntent pendingIntent) {
        return ((K) oVar).f6046b.doWrite(new zze(this, oVar, pendingIntent));
    }

    public final q requestActivityUpdates(o oVar, long j6, PendingIntent pendingIntent) {
        return ((K) oVar).f6046b.doWrite(new zzd(this, oVar, j6, pendingIntent));
    }
}
