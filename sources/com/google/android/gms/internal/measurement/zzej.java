package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.I;

final class zzej extends zzeu {
    final /* synthetic */ String zza;
    final /* synthetic */ zzcs zzb;
    final /* synthetic */ zzff zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzej(zzff zzff, String str, zzcs zzcs) {
        super(zzff, true);
        this.zza = str;
        this.zzb = zzcs;
        this.zzc = zzff;
    }

    public final void zza() {
        zzcv zze = this.zzc.zzj;
        I.g(zze);
        zze.getMaxUserProperties(this.zza, this.zzb);
    }

    public final void zzb() {
        this.zzb.zze((Bundle) null);
    }
}
