package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.I;

final class zzfc extends zzeu {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzcs zzb;
    final /* synthetic */ zzfe zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfc(zzfe zzfe, Activity activity, zzcs zzcs) {
        super(zzfe.zza, true);
        this.zza = activity;
        this.zzb = zzcs;
        this.zzc = zzfe;
    }

    public final void zza() {
        zzcv zze = this.zzc.zza.zzj;
        I.g(zze);
        zze.onActivitySaveInstanceStateByScionActivityInfo(zzdj.zza(this.zza), this.zzb, this.zzi);
    }
}
