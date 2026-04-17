package com.google.android.gms.internal.p002firebaseauthapi;

import com.bumptech.glide.c;
import e3.G;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaay  reason: invalid package */
final class zzaay implements zzafn<zzaix> {
    private final /* synthetic */ zzaeg zza;
    private final /* synthetic */ zzaam zzb;

    public zzaay(zzaam zzaam, zzaeg zzaeg) {
        this.zza = zzaeg;
        this.zzb = zzaam;
    }

    public final void zza(String str) {
        this.zza.zza(c.G0(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzaix zzaix = (zzaix) obj;
        this.zzb.zza(new zzahn(zzaix.zzc(), zzaix.zzb(), Long.valueOf(zzaix.zza()), "Bearer"), (String) null, (String) null, Boolean.valueOf(zzaix.zzd()), (G) null, this.zza, this);
    }
}
