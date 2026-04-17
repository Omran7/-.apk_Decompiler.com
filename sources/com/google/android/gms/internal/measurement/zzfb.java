package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.I;

final class zzfb extends zzeu {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzfe zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfb(zzfe zzfe, Activity activity) {
        super(zzfe.zza, true);
        this.zza = activity;
        this.zzb = zzfe;
    }

    public final void zza() {
        zzcv zze = this.zzb.zza.zzj;
        I.g(zze);
        zze.onActivityStoppedByScionActivityInfo(zzdj.zza(this.zza), this.zzi);
    }
}
