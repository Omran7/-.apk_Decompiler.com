package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.I;

final class zzdr extends zzeu {
    final /* synthetic */ Boolean zza;
    final /* synthetic */ zzff zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdr(zzff zzff, Boolean bool) {
        super(zzff, true);
        this.zza = bool;
        this.zzb = zzff;
    }

    public final void zza() {
        zzcv zze = this.zzb.zzj;
        I.g(zze);
        zze.setMeasurementEnabled(this.zza.booleanValue(), this.zzh);
    }
}
