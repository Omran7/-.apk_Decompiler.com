package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaas  reason: invalid package */
final class zzaas implements zzafn<zzahd> {
    private final /* synthetic */ zzafk zza;
    private final /* synthetic */ zzaeg zzb;
    private final /* synthetic */ zzahn zzc;
    private final /* synthetic */ zzaid zzd;
    private final /* synthetic */ zzaam zze;

    public zzaas(zzaam zzaam, zzafk zzafk, zzaeg zzaeg, zzahn zzahn, zzaid zzaid) {
        this.zza = zzafk;
        this.zzb = zzaeg;
        this.zzc = zzahn;
        this.zzd = zzaid;
        this.zze = zzaam;
    }

    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final /* synthetic */ void zza(Object obj) {
        List<zzahc> zza2 = ((zzahd) obj).zza();
        if (zza2 == null || zza2.isEmpty()) {
            this.zza.zza("No users");
        } else {
            zzaam.zza(this.zze, this.zzb, this.zzc, zza2.get(0), this.zzd, this.zza);
        }
    }
}
