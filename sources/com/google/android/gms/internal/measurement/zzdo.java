package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.I;

final class zzdo extends zzeu {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcs zzc;
    final /* synthetic */ zzff zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdo(zzff zzff, String str, String str2, zzcs zzcs) {
        super(zzff, true);
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzcs;
        this.zzd = zzff;
    }

    public final void zza() {
        zzcv zze = this.zzd.zzj;
        I.g(zze);
        zze.getConditionalUserProperties(this.zza, this.zzb, this.zzc);
    }

    public final void zzb() {
        this.zzc.zze((Bundle) null);
    }
}
