package com.google.android.gms.internal.p002firebaseauthapi;

import com.bumptech.glide.c;
import e3.G;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaap  reason: invalid package */
final class zzaap implements zzafn<zzago> {
    private final /* synthetic */ zzaeg zza;
    private final /* synthetic */ zzaam zzb;

    public zzaap(zzaam zzaam, zzaeg zzaeg) {
        this.zza = zzaeg;
        this.zzb = zzaam;
    }

    public final void zza(String str) {
        this.zza.zza(c.G0(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzago zzago = (zzago) obj;
        if (zzago.zzf()) {
            this.zza.zza(new zzaaj(zzago.zzc(), zzago.zze(), (G) null));
            return;
        }
        this.zzb.zza(new zzahn(zzago.zzd(), zzago.zzb(), Long.valueOf(zzago.zza()), "Bearer"), (String) null, (String) null, Boolean.valueOf(zzago.zzg()), (G) null, this.zza, this);
    }
}
