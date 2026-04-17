package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.I;

final class zzdq extends zzeu {
    final /* synthetic */ zzdj zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzff zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdq(zzff zzff, zzdj zzdj, String str, String str2) {
        super(zzff, true);
        this.zza = zzdj;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzff;
    }

    public final void zza() {
        zzcv zze = this.zzd.zzj;
        I.g(zze);
        zze.setCurrentScreenByScionActivityInfo(this.zza, this.zzb, this.zzc, this.zzh);
    }
}
