package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.o;

final class zzw extends zzx {
    final /* synthetic */ PendingIntent zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzw(zzz zzz, o oVar, PendingIntent pendingIntent) {
        super(oVar);
        this.zza = pendingIntent;
    }

    public final /* bridge */ /* synthetic */ void doExecute(b bVar) {
        ((zzaz) bVar).zzG(this.zza, new zzy(this));
    }
}
