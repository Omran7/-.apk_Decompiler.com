package com.google.android.gms.internal.measurement;

import J1.b;
import com.google.android.gms.common.internal.I;

final class zzeh extends zzeu {
    final /* synthetic */ String zza;
    final /* synthetic */ Object zzb;
    final /* synthetic */ zzff zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzeh(zzff zzff, boolean z3, int i2, String str, Object obj, Object obj2, Object obj3) {
        super(zzff, false);
        this.zza = str;
        this.zzb = obj;
        this.zzc = zzff;
    }

    public final void zza() {
        zzcv zze = this.zzc.zzj;
        I.g(zze);
        zze.logHealthData(5, this.zza, new b(this.zzb), new b((Object) null), new b((Object) null));
    }
}
