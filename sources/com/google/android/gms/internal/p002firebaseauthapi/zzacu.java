package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacu  reason: invalid package */
final class zzacu extends zzaex<zzahk, Void> {
    private final zzahl zzu;

    public zzacu(String str, String str2) {
        super(10);
        I.d(str2);
        this.zzu = zzahl.zza(str, str2);
    }

    public final String zza() {
        return "getRecaptchaConfig";
    }

    public final void zzb() {
        zzb(this.zzr);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaef) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaef.zza(this.zzu, (zzaed) this.zzb);
    }
}
