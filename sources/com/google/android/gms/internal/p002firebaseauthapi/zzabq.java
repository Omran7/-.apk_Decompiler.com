package com.google.android.gms.internal.p002firebaseauthapi;

import com.bumptech.glide.c;
import e3.G;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabq  reason: invalid package */
final class zzabq implements zzafn<zzagq> {
    private final /* synthetic */ zzaeg zza;
    private final /* synthetic */ zzabn zzb;

    public zzabq(zzabn zzabn, zzaeg zzaeg) {
        this.zza = zzaeg;
        this.zzb = zzabn;
    }

    public final void zza(String str) {
        this.zza.zza(c.G0(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzagq zzagq = (zzagq) obj;
        this.zzb.zza.zza(new zzahn(zzagq.zzb(), zzagq.zza(), Long.valueOf(zzahp.zza(zzagq.zza())), "Bearer"), (String) null, (String) null, Boolean.FALSE, (G) null, this.zza, this);
    }
}
