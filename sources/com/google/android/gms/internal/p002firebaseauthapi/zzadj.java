package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import f3.v;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadj  reason: invalid package */
final class zzadj extends zzaex<Void, v> {
    private final zzaif zzu;

    public zzadj(String str) {
        super(9);
        this.zzu = new zzaif(str);
    }

    public final String zza() {
        return "setFirebaseUIVersion";
    }

    public final void zzb() {
        zzb(null);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaef) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaef.zza(this.zzu, (zzaed) this.zzb);
    }
}
