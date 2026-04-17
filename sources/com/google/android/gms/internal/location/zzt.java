package com.google.android.gms.internal.location;

import Q1.f;
import android.os.Looper;
import android.support.v4.media.session.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.o;
import com.google.android.gms.location.LocationRequest;

final class zzt extends zzx {
    final /* synthetic */ LocationRequest zza;
    final /* synthetic */ f zzb;
    final /* synthetic */ Looper zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzt(zzz zzz, o oVar, LocationRequest locationRequest, f fVar, Looper looper) {
        super(oVar);
        this.zza = locationRequest;
        this.zzc = looper;
    }

    public final /* bridge */ /* synthetic */ void doExecute(b bVar) {
        ((zzaz) bVar).zzB(zzba.zza((String) null, this.zza), a.n(zzbj.zza(this.zzc), (Object) null, f.class.getSimpleName()), new zzy(this));
    }
}
