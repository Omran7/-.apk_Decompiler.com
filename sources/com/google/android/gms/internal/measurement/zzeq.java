package com.google.android.gms.internal.measurement;

import android.content.Intent;
import com.google.android.gms.common.internal.I;

final class zzeq extends zzeu {
    final /* synthetic */ Intent zza;
    final /* synthetic */ zzff zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzeq(zzff zzff, Intent intent) {
        super(zzff, true);
        this.zza = intent;
        this.zzb = zzff;
    }

    public final void zza() {
        zzcv zze = this.zzb.zzj;
        I.g(zze);
        zze.setSgtmDebugInfo(this.zza);
    }
}
