package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.I;

final class zzei extends zzeu {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzcs zzb;
    final /* synthetic */ zzff zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzei(zzff zzff, Bundle bundle, zzcs zzcs) {
        super(zzff, true);
        this.zza = bundle;
        this.zzb = zzcs;
        this.zzc = zzff;
    }

    public final void zza() {
        zzcv zze = this.zzc.zzj;
        I.g(zze);
        zze.performAction(this.zza, this.zzb, this.zzh);
    }

    public final void zzb() {
        this.zzb.zze((Bundle) null);
    }
}
