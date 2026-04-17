package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import e3.s;
import f3.C0528e;
import f3.v;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaea  reason: invalid package */
final class zzaea extends zzaex<Void, v> {
    private final s zzu;

    public zzaea(s sVar) {
        super(2);
        I.g(sVar);
        this.zzu = sVar;
    }

    public final String zza() {
        return "updatePhoneNumber";
    }

    public final void zzb() {
        ((v) this.zze).a(this.zzj, zzach.zza(this.zzc, this.zzk));
        zzb(null);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaef) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaef.zza(new zzahr(((C0528e) this.zzd).f7920a.zzf(), zzafo.zza(this.zzu)), (zzaed) this.zzb);
    }
}
