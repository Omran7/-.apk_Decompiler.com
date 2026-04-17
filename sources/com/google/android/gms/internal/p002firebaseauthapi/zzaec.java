package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import e3.C0493a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaec  reason: invalid package */
final class zzaec extends zzaex<Void, Void> {
    private final zzahe zzu;

    public zzaec(String str, String str2, C0493a aVar) {
        super(6);
        I.d(str);
        I.d(str2);
        I.g(aVar);
        this.zzu = zzahe.zza(aVar, str, str2);
    }

    public final String zza() {
        return "verifyBeforeUpdateEmail";
    }

    public final void zzb() {
        zzb(null);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaef) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaef.zzc(this.zzu, (zzaed) this.zzb);
    }
}
