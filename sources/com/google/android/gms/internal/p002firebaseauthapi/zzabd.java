package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.PendingIntent;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import e3.G;
import e3.s;
import z1.C1132b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabd  reason: invalid package */
final class zzabd implements zzafn<zzajb> {
    private final /* synthetic */ zzaeg zza;
    private final /* synthetic */ zzafn zzb;
    private final /* synthetic */ zzabe zzc;

    public zzabd(zzabe zzabe, zzaeg zzaeg, zzafn zzafn) {
        this.zza = zzaeg;
        this.zzb = zzafn;
        this.zzc = zzabe;
    }

    public final void zza(String str) {
        this.zzb.zza(str);
    }

    public final void zza(Object obj) {
        zzajb zzajb = (zzajb) obj;
        if (!TextUtils.isEmpty(zzajb.zze())) {
            this.zza.zza(new Status(17025, (String) null, (PendingIntent) null, (C1132b) null), new s((String) null, (String) null, zzajb.zzc(), zzajb.zze(), true));
            return;
        }
        zzahn zzahn = new zzahn(zzajb.zzd(), zzajb.zzb(), Long.valueOf(zzajb.zza()), "Bearer");
        this.zzc.zza.zza(zzahn, (String) null, "phone", Boolean.valueOf(zzajb.zzf()), (G) null, this.zza, this.zzb);
    }
}
