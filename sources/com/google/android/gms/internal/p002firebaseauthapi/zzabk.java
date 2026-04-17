package com.google.android.gms.internal.p002firebaseauthapi;

import com.bumptech.glide.c;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabk  reason: invalid package */
final class zzabk implements zzafn<zzahd> {
    private final /* synthetic */ zzafn zza;
    private final /* synthetic */ zzahn zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ zzaeg zzd;
    private final /* synthetic */ zzabh zze;

    public zzabk(zzabh zzabh, zzafn zzafn, zzahn zzahn, String str, zzaeg zzaeg) {
        this.zza = zzafn;
        this.zzb = zzahn;
        this.zzc = str;
        this.zzd = zzaeg;
        this.zze = zzabh;
    }

    public final void zza(String str) {
        this.zzd.zza(c.G0(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        List<zzahc> zza2 = ((zzahd) obj).zza();
        if (zza2 == null || zza2.isEmpty()) {
            this.zza.zza("No users.");
            return;
        }
        zzaid zzaid = new zzaid();
        zzaid.zzd(this.zzb.zzc()).zza(this.zzc);
        zzaam.zza(this.zze.zza, this.zzd, this.zzb, zza2.get(0), zzaid, (zzafk) this.zza);
    }
}
