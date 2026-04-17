package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.I;

final class zzef extends zzeu {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ zzcs zzd;
    final /* synthetic */ zzff zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzef(zzff zzff, String str, String str2, boolean z3, zzcs zzcs) {
        super(zzff, true);
        this.zza = str;
        this.zzb = str2;
        this.zzc = z3;
        this.zzd = zzcs;
        this.zze = zzff;
    }

    public final void zza() {
        zzcv zze2 = this.zze.zzj;
        I.g(zze2);
        zze2.getUserProperties(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final void zzb() {
        this.zzd.zze((Bundle) null);
    }
}
