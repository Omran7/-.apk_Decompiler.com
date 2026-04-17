package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.I;

final class zzem extends zzeu {
    final /* synthetic */ zzcs zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzff zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzem(zzff zzff, zzcs zzcs, int i2) {
        super(zzff, true);
        this.zza = zzcs;
        this.zzb = i2;
        this.zzc = zzff;
    }

    public final void zza() {
        zzcv zze = this.zzc.zzj;
        I.g(zze);
        zze.getTestFlag(this.zza, this.zzb);
    }

    public final void zzb() {
        this.zza.zze((Bundle) null);
    }
}
