package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabw  reason: invalid package */
final class zzabw implements zzafn<zzahd> {
    private final /* synthetic */ zzafn zza;
    private final /* synthetic */ zzaeg zzb;
    private final /* synthetic */ zzahn zzc;

    public zzabw(zzabt zzabt, zzafn zzafn, zzaeg zzaeg, zzahn zzahn) {
        this.zza = zzafn;
        this.zzb = zzaeg;
        this.zzc = zzahn;
    }

    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final /* synthetic */ void zza(Object obj) {
        List<zzahc> zza2 = ((zzahd) obj).zza();
        if (zza2 == null || zza2.isEmpty()) {
            this.zza.zza("No users");
        } else {
            this.zzb.zza(this.zzc, zza2.get(0));
        }
    }
}
