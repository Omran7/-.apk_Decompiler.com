package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import e3.u;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaee  reason: invalid package */
final class zzaee extends zzaex<Void, u> {
    private final zzaib zzu;

    public zzaee(zzaib zzaib) {
        super(8);
        I.g(zzaib);
        this.zzu = zzaib;
    }

    public final String zza() {
        return "verifyPhoneNumber";
    }

    public final void zzb() {
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaef) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaef.zza(this.zzu, (zzaed) this.zzb);
    }
}
