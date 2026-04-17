package com.google.android.gms.internal.p002firebaseauthapi;

import e3.G;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabb  reason: invalid package */
final class zzabb implements zzafn<zzaih> {
    private final /* synthetic */ zzaeg zza;
    private final /* synthetic */ zzafk zzb;
    private final /* synthetic */ zzaam zzc;

    public zzabb(zzaam zzaam, zzaeg zzaeg, zzafk zzafk) {
        this.zza = zzaeg;
        this.zzb = zzafk;
        this.zzc = zzaam;
    }

    public final void zza(String str) {
        this.zzb.zza(str);
    }

    public final /* synthetic */ void zza(Object obj) {
        zzaih zzaih = (zzaih) obj;
        this.zzc.zza(new zzahn(zzaih.zzc(), zzaih.zzb(), Long.valueOf(zzaih.zza()), "Bearer"), (String) null, "password", Boolean.FALSE, (G) null, this.zza, this);
    }
}
