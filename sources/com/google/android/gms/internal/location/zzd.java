package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.o;

final class zzd extends zzf {
    final /* synthetic */ long zza;
    final /* synthetic */ PendingIntent zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzd(zzg zzg, o oVar, long j6, PendingIntent pendingIntent) {
        super(oVar);
        this.zza = j6;
        this.zzb = pendingIntent;
    }

    public final /* bridge */ /* synthetic */ void doExecute(b bVar) {
        ((zzaz) bVar).zzq(this.zza, this.zzb);
        setResult(Status.f6002e);
    }
}
