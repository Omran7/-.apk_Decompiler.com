package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.I;

final class zzdn extends zzeu {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Bundle zzc;
    final /* synthetic */ zzff zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdn(zzff zzff, String str, String str2, Bundle bundle) {
        super(zzff, true);
        this.zza = str;
        this.zzb = str2;
        this.zzc = bundle;
        this.zzd = zzff;
    }

    public final void zza() {
        zzcv zze = this.zzd.zzj;
        I.g(zze);
        zze.clearConditionalUserProperty(this.zza, this.zzb, this.zzc);
    }
}
