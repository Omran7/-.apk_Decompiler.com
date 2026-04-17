package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.o;
import com.google.android.gms.location.LocationRequest;

final class zzu extends zzx {
    final /* synthetic */ LocationRequest zza;
    final /* synthetic */ PendingIntent zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzu(zzz zzz, o oVar, LocationRequest locationRequest, PendingIntent pendingIntent) {
        super(oVar);
        this.zza = locationRequest;
        this.zzb = pendingIntent;
    }

    public final /* bridge */ /* synthetic */ void doExecute(b bVar) {
        ((zzaz) bVar).zzE(this.zza, this.zzb, new zzy(this));
    }
}
