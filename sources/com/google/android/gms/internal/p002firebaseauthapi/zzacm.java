package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import f3.v;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacm  reason: invalid package */
final class zzacm extends zzaex<Void, v> {
    private final zzahu zzu;

    public zzacm(String str, String str2, String str3) {
        super(4);
        I.e(str, "code cannot be null or empty");
        I.e(str2, "new password cannot be null or empty");
        this.zzu = new zzahu(str, str2, str3);
    }

    public final String zza() {
        return "confirmPasswordReset";
    }

    public final void zzb() {
        zzb(null);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaef) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaef.zza(this.zzu, (zzaed) this.zzb);
    }
}
