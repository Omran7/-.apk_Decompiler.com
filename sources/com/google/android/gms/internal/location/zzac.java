package com.google.android.gms.internal.location;

import Q1.e;
import android.app.PendingIntent;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.o;

final class zzac extends zzae {
    final /* synthetic */ e zza;
    final /* synthetic */ PendingIntent zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzac(zzaf zzaf, o oVar, e eVar, PendingIntent pendingIntent) {
        super(oVar);
        this.zza = eVar;
        this.zzb = pendingIntent;
    }

    public final /* bridge */ /* synthetic */ void doExecute(b bVar) {
        ((zzaz) bVar).zzv(this.zza, this.zzb, this);
    }
}
