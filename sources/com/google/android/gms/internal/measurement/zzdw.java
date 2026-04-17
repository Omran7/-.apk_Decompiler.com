package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.I;

final class zzdw extends zzeu {
    final /* synthetic */ String zza;
    final /* synthetic */ zzff zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdw(zzff zzff, String str) {
        super(zzff, true);
        this.zza = str;
        this.zzb = zzff;
    }

    public final void zza() {
        zzcv zze = this.zzb.zzj;
        I.g(zze);
        zze.beginAdUnitExposure(this.zza, this.zzi);
    }
}
