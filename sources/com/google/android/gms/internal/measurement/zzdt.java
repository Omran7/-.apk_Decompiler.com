package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.I;

final class zzdt extends zzeu {
    final /* synthetic */ zzff zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdt(zzff zzff) {
        super(zzff, true);
        this.zza = zzff;
    }

    public final void zza() {
        zzcv zze = this.zza.zzj;
        I.g(zze);
        zze.resetAnalyticsData(this.zzh);
    }
}
