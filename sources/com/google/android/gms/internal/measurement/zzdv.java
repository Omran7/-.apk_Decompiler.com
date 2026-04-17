package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.I;

final class zzdv extends zzeu {
    final /* synthetic */ long zza;
    final /* synthetic */ zzff zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdv(zzff zzff, long j6) {
        super(zzff, true);
        this.zza = j6;
        this.zzb = zzff;
    }

    public final void zza() {
        zzcv zze = this.zzb.zzj;
        I.g(zze);
        zze.setSessionTimeoutDuration(this.zza);
    }
}
