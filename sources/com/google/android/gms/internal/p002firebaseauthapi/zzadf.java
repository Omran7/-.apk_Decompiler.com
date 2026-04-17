package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import f3.C0528e;
import f3.v;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadf  reason: invalid package */
final class zzadf extends zzaex<Void, v> {
    public zzadf() {
        super(2);
    }

    public final String zza() {
        return "reload";
    }

    public final void zzb() {
        ((v) this.zze).a(this.zzj, zzach.zza(this.zzc, this.zzk));
        zzb(null);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaef) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaef.zzc(((C0528e) this.zzd).f7920a.zzf(), (zzaed) this.zzb);
    }
}
