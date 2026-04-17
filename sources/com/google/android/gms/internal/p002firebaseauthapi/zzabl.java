package com.google.android.gms.internal.p002firebaseauthapi;

import com.bumptech.glide.c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabl  reason: invalid package */
final class zzabl implements zzafn<zzaiv> {
    private final /* synthetic */ zzaeg zza;
    private final /* synthetic */ zzaam zzb;

    public zzabl(zzaam zzaam, zzaeg zzaeg) {
        this.zza = zzaeg;
        this.zzb = zzaam;
    }

    public final void zza(String str) {
        this.zza.zza(c.G0(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzaiv zzaiv = (zzaiv) obj;
        if (!zzaiv.zzl()) {
            zzaam.zza(this.zzb, zzaiv, this.zza, (zzafk) this);
        } else {
            this.zza.zza(new zzaaj(zzaiv.zzf(), zzaiv.zzk(), zzaiv.zzb()));
        }
    }
}
