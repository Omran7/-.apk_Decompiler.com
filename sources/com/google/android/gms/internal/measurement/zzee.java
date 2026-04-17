package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.I;

final class zzee extends zzeu {
    final /* synthetic */ zzcs zza;
    final /* synthetic */ zzff zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzee(zzff zzff, zzcs zzcs) {
        super(zzff, true);
        this.zza = zzcs;
        this.zzb = zzff;
    }

    public final void zza() {
        zzcv zze = this.zzb.zzj;
        I.g(zze);
        zze.getCurrentScreenClass(this.zza);
    }

    public final void zzb() {
        this.zza.zze((Bundle) null);
    }
}
