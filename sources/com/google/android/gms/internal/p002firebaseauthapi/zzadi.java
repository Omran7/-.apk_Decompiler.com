package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadi  reason: invalid package */
final class zzadi extends zzaex<Void, Void> {
    private final zzahw zzu;

    public zzadi(String str, String str2, String str3, String str4) {
        super(15);
        this.zzu = zzahw.zzg().zzd(str).zza(str2).zzc(str4).zzb(str3).zza(zzagy.ACCESS_TOKEN).zza();
    }

    public final String zza() {
        return "revokeAccessToken";
    }

    public final void zzb() {
        zzb(null);
    }

    public final void zza(TaskCompletionSource<Void> taskCompletionSource, zzaef zzaef) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaef.zza(this.zzu, (zzaed) this.zzb);
    }
}
