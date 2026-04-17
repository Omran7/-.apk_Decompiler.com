package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import f3.C0530g;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadr  reason: invalid package */
final class zzadr extends zzaex<zzaij, Void> {
    private final zzaim zzu;

    public zzadr(C0530g gVar, String str) {
        super(12);
        I.g(gVar);
        String str2 = gVar.f7934a;
        I.d(str2);
        this.zzu = zzaim.zza(str2, str);
    }

    public final String zza() {
        return "startMfaEnrollment";
    }

    public final void zzb() {
        zzb(this.zzt);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaef) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaef.zza(this.zzu, (zzaed) this.zzb);
    }
}
