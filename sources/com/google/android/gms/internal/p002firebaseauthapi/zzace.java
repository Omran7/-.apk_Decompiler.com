package com.google.android.gms.internal.p002firebaseauthapi;

import com.bumptech.glide.c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzace  reason: invalid package */
final class zzace implements zzafn<zzahn> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzaeg zzb;
    private final /* synthetic */ zzaam zzc;

    public zzace(zzaam zzaam, String str, zzaeg zzaeg) {
        this.zza = str;
        this.zzb = zzaeg;
        this.zzc = zzaam;
    }

    public final void zza(String str) {
        this.zzb.zza(c.G0(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzahn zzahn = (zzahn) obj;
        zzaid zzaid = new zzaid();
        zzaid.zzd(zzahn.zzc()).zzc(this.zza);
        zzaam.zza(this.zzc, this.zzb, zzahn, zzaid, (zzafk) this);
    }
}
