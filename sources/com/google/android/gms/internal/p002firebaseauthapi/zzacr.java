package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacr  reason: invalid package */
final class zzacr extends zzaex<zzahj, Void> {
    private final zzahg zzu = zzahg.zzb();

    public zzacr() {
        super(11);
    }

    public final String zza() {
        return "getRecaptchaParam";
    }

    public final void zzb() {
        zzb(this.zzs);
    }

    public final void zza(TaskCompletionSource<zzahj> taskCompletionSource, zzaef zzaef) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaef.zza(this.zzu, (zzaed) this.zzb);
    }
}
