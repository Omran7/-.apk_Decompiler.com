package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import e3.C0496d;
import f3.C0523A;
import f3.C0528e;
import f3.v;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadq  reason: invalid package */
final class zzadq extends zzaex<C0523A, v> {
    private final zzagp zzu;

    public zzadq(C0496d dVar, String str) {
        super(2);
        I.h(dVar, "credential cannot be null");
        this.zzu = new zzagp(dVar, (String) null, str);
    }

    public final String zza() {
        return "sendSignInLinkToEmail";
    }

    public final void zzb() {
        C0528e zza = zzach.zza(this.zzc, this.zzk);
        ((v) this.zze).a(this.zzj, zza);
        zzb(new C0523A(zza));
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaef) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaef.zza(this.zzu, (zzaed) this.zzb);
    }
}
