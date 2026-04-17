package com.google.android.gms.internal.p002firebaseauthapi;

import com.bumptech.glide.c;
import e3.G;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabz  reason: invalid package */
final class zzabz implements zzafn<zzaih> {
    private final /* synthetic */ zzaeg zza;
    private final /* synthetic */ zzaam zzb;

    public zzabz(zzaam zzaam, zzaeg zzaeg) {
        this.zza = zzaeg;
        this.zzb = zzaam;
    }

    public final void zza(String str) {
        this.zza.zza(c.G0(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzaih zzaih = (zzaih) obj;
        this.zzb.zza(new zzahn(zzaih.zzc(), zzaih.zzb(), Long.valueOf(zzaih.zza()), "Bearer"), (String) null, (String) null, Boolean.TRUE, (G) null, this.zza, this);
    }
}
