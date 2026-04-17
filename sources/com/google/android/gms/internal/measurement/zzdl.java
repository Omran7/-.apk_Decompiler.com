package com.google.android.gms.internal.measurement;

import J1.b;
import com.google.android.gms.common.internal.I;

final class zzdl extends zzeu {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzff zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdl(zzff zzff, String str, String str2, Object obj, boolean z3) {
        super(zzff, true);
        this.zza = str;
        this.zzb = str2;
        this.zzc = obj;
        this.zzd = z3;
        this.zze = zzff;
    }

    public final void zza() {
        zzcv zze2 = this.zze.zzj;
        I.g(zze2);
        zze2.setUserProperty(this.zza, this.zzb, new b(this.zzc), this.zzd, this.zzh);
    }
}
