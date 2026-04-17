package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.I;

final class zzet extends zzeu {
    final /* synthetic */ Long zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ boolean zzf;
    final /* synthetic */ zzff zzg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzet(zzff zzff, Long l6, String str, String str2, Bundle bundle, boolean z3, boolean z4) {
        super(zzff, true);
        this.zza = l6;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bundle;
        this.zze = z3;
        this.zzf = z4;
        this.zzg = zzff;
    }

    public final void zza() {
        long longValue;
        Long l6 = this.zza;
        if (l6 == null) {
            longValue = this.zzh;
        } else {
            longValue = l6.longValue();
        }
        long j6 = longValue;
        zzcv zze2 = this.zzg.zzj;
        I.g(zze2);
        zze2.logEvent(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, j6);
    }
}
