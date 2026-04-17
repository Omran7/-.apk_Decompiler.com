package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import e3.C0492C;
import f3.C0528e;
import f3.v;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadz  reason: invalid package */
final class zzadz extends zzaex<Void, v> {
    private final C0492C zzu;

    public zzadz(C0492C c3) {
        super(2);
        I.h(c3, "request cannot be null");
        this.zzu = c3;
    }

    public final String zza() {
        return "updateProfile";
    }

    public final void zzb() {
        ((v) this.zze).a(this.zzj, zzach.zza(this.zzc, this.zzk));
        zzb(null);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaef) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaef.zza(((C0528e) this.zzd).f7920a.zzf(), this.zzu, (zzaed) this.zzb);
    }
}
