package com.google.android.gms.internal.p002firebaseauthapi;

import com.bumptech.glide.c;
import e3.G;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabp  reason: invalid package */
final class zzabp implements zzafn<zzags> {
    private final /* synthetic */ zzaeg zza;
    private final /* synthetic */ zzaam zzb;

    public zzabp(zzaam zzaam, zzaeg zzaeg) {
        this.zza = zzaeg;
        this.zzb = zzaam;
    }

    public final void zza(String str) {
        this.zza.zza(c.G0(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzags zzags = (zzags) obj;
        this.zzb.zza(new zzahn(zzags.zzb(), zzags.zza(), Long.valueOf(zzahp.zza(zzags.zza())), "Bearer"), (String) null, (String) null, Boolean.FALSE, (G) null, this.zza, this);
    }
}
