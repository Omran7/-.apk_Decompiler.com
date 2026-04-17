package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.o;

final class zzp extends zzx {
    final /* synthetic */ Location zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzp(zzz zzz, o oVar, Location location) {
        super(oVar);
        this.zza = location;
    }

    public final /* bridge */ /* synthetic */ void doExecute(b bVar) {
        ((zzaz) bVar).zzJ(this.zza);
        setResult(Status.f6002e);
    }
}
