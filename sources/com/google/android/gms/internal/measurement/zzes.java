package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.I;

final class zzes extends zzeu {
    final /* synthetic */ zzew zza;
    final /* synthetic */ zzff zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzes(zzff zzff, zzew zzew) {
        super(zzff, true);
        this.zza = zzew;
        this.zzb = zzff;
    }

    public final void zza() {
        zzcv zze = this.zzb.zzj;
        I.g(zze);
        zze.unregisterOnMeasurementEventListener(this.zza);
    }
}
