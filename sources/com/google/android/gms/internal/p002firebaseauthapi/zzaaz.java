package com.google.android.gms.internal.p002firebaseauthapi;

import com.bumptech.glide.c;
import e3.G;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaaz  reason: invalid package */
final class zzaaz implements zzafn<zzajb> {
    private final /* synthetic */ zzaeg zza;
    private final /* synthetic */ zzaam zzb;

    public zzaaz(zzaam zzaam, zzaeg zzaeg) {
        this.zza = zzaeg;
        this.zzb = zzaam;
    }

    public final void zza(String str) {
        this.zza.zza(c.G0(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzajb zzajb = (zzajb) obj;
        this.zzb.zza(new zzahn(zzajb.zzd(), zzajb.zzb(), Long.valueOf(zzajb.zza()), "Bearer"), (String) null, (String) null, Boolean.valueOf(zzajb.zzf()), (G) null, this.zza, this);
    }
}
