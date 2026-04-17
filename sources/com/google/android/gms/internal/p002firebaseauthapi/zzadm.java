package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import f3.C0523A;
import f3.C0528e;
import f3.v;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadm  reason: invalid package */
final class zzadm extends zzaex<C0523A, v> {
    private final String zzu;

    public zzadm(String str) {
        super(2);
        this.zzu = str;
    }

    public final String zza() {
        return "signInAnonymously";
    }

    public final void zzb() {
        C0528e zza = zzach.zza(this.zzc, this.zzk);
        ((v) this.zze).a(this.zzj, zza);
        zzb(new C0523A(zza));
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaef) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaef.zzd(this.zzu, this.zzb);
    }
}
