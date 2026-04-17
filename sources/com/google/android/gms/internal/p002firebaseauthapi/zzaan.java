package com.google.android.gms.internal.p002firebaseauthapi;

import com.bumptech.glide.c;
import e3.G;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaan  reason: invalid package */
final class zzaan implements zzafn<zzaiz> {
    private final /* synthetic */ zzaeg zza;
    private final /* synthetic */ zzaam zzb;

    public zzaan(zzaam zzaam, zzaeg zzaeg) {
        this.zza = zzaeg;
        this.zzb = zzaam;
    }

    public final void zza(String str) {
        this.zza.zza(c.G0(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzaiz zzaiz = (zzaiz) obj;
        if (zzaiz.zzf()) {
            this.zza.zza(new zzaaj(zzaiz.zzc(), zzaiz.zze(), (G) null));
            return;
        }
        this.zzb.zza(new zzahn(zzaiz.zzd(), zzaiz.zzb(), Long.valueOf(zzaiz.zza()), "Bearer"), (String) null, (String) null, Boolean.FALSE, (G) null, this.zza, this);
    }
}
