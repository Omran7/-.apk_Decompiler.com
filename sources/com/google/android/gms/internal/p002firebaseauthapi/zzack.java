package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import f3.v;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzack  reason: invalid package */
final class zzack extends zzaex<Void, v> {
    private final String zzu;
    private final String zzv;

    public zzack(String str, String str2) {
        super(7);
        I.e(str, "code cannot be null or empty");
        this.zzu = str;
        this.zzv = str2;
    }

    public final String zza() {
        return "applyActionCode";
    }

    public final void zzb() {
        zzb(null);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaef) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaef.zza(this.zzu, this.zzv, (zzaed) this.zzb);
    }
}
