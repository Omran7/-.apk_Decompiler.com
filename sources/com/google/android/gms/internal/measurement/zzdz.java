package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.I;

final class zzdz extends zzeu {
    final /* synthetic */ Runnable zza;
    final /* synthetic */ zzff zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdz(zzff zzff, Runnable runnable) {
        super(zzff, true);
        this.zza = runnable;
        this.zzb = zzff;
    }

    public final void zza() {
        zzcv zze = this.zzb.zzj;
        I.g(zze);
        zze.retrieveAndUploadBatches(new zzdy(this, this.zza));
    }
}
