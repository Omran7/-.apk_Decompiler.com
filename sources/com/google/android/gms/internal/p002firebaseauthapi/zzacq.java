package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import e3.q;
import f3.v;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacq  reason: invalid package */
final class zzacq extends zzaex<Void, v> {
    private final q zzu;
    private final String zzv;
    private final String zzw;
    private final String zzx;

    public zzacq(q qVar, String str, String str2, String str3) {
        super(2);
        I.g(qVar);
        throw null;
    }

    public final String zza() {
        return "finalizeMfaEnrollment";
    }

    public final void zzb() {
        ((v) this.zze).a(this.zzj, zzach.zza(this.zzc, this.zzk));
        zzb(null);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaef) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaef.zza((q) null, this.zzv, this.zzw, this.zzx, (zzaed) this.zzb);
    }
}
