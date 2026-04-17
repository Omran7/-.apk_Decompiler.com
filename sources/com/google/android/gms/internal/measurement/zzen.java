package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.I;

final class zzen extends zzeu {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzff zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzen(zzff zzff, boolean z3) {
        super(zzff, true);
        this.zza = z3;
        this.zzb = zzff;
    }

    public final void zza() {
        zzcv zze = this.zzb.zzj;
        I.g(zze);
        zze.setDataCollectionEnabled(this.zza);
    }
}
