package com.google.android.gms.internal.location;

import Q1.g;
import android.support.v4.media.session.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.o;
import com.google.android.gms.location.LocationRequest;

final class zzr extends zzx {
    final /* synthetic */ LocationRequest zza;
    final /* synthetic */ g zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzr(zzz zzz, o oVar, LocationRequest locationRequest, g gVar) {
        super(oVar);
        this.zza = locationRequest;
    }

    public final /* bridge */ /* synthetic */ void doExecute(b bVar) {
        ((zzaz) bVar).zzC(this.zza, a.n(zzbj.zzb(), (Object) null, g.class.getSimpleName()), new zzy(this));
    }
}
