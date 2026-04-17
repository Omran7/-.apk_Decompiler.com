package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.I;

final class zzep extends zzeu {
    final /* synthetic */ zzev zza;
    final /* synthetic */ zzff zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzep(zzff zzff, zzev zzev) {
        super(zzff, true);
        this.zza = zzev;
        this.zzb = zzff;
    }

    public final void zza() {
        zzcv zze = this.zzb.zzj;
        I.g(zze);
        zze.setEventInterceptor(this.zza);
    }
}
