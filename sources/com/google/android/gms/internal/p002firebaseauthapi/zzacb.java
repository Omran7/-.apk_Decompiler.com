package com.google.android.gms.internal.p002firebaseauthapi;

import com.bumptech.glide.c;
import e3.C0492C;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacb  reason: invalid package */
final class zzacb implements zzafn<zzahn> {
    private final /* synthetic */ C0492C zza;
    private final /* synthetic */ zzaeg zzb;
    private final /* synthetic */ zzaam zzc;

    public zzacb(zzaam zzaam, C0492C c3, zzaeg zzaeg) {
        this.zza = c3;
        this.zzb = zzaeg;
        this.zzc = zzaam;
    }

    public final void zza(String str) {
        this.zzb.zza(c.G0(str));
    }

    public final void zza(Object obj) {
        zzahn zzahn = (zzahn) obj;
        zzaid zzaid = new zzaid();
        zzaid.zzd(zzahn.zzc());
        C0492C c3 = this.zza;
        if (c3.f7601c || c3.f7599a != null) {
            zzaid.zzb(c3.f7599a);
        }
        C0492C c6 = this.zza;
        if (c6.d || c6.f7602e != null) {
            zzaid.zzg(c6.f7600b);
        }
        zzaam.zza(this.zzc, this.zzb, zzahn, zzaid, (zzafk) this);
    }
}
