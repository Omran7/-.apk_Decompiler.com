package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.I;

final class zzdm extends zzeu {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzff zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdm(zzff zzff, Bundle bundle) {
        super(zzff, true);
        this.zza = bundle;
        this.zzb = zzff;
    }

    public final void zza() {
        zzcv zze = this.zzb.zzj;
        I.g(zze);
        zze.setConditionalUserProperty(this.zza, this.zzh);
    }
}
