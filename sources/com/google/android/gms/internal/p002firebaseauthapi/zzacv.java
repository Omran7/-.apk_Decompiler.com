package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import e3.s;
import f3.C0523A;
import f3.C0528e;
import f3.v;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacv  reason: invalid package */
final class zzacv extends zzaex<C0523A, v> {
    private final s zzu;

    public zzacv(s sVar) {
        super(2);
        I.h(sVar, "credential cannot be null");
        this.zzu = sVar;
    }

    public final String zza() {
        return "linkPhoneAuthCredential";
    }

    public final void zzb() {
        C0528e zza = zzach.zza(this.zzc, this.zzk);
        ((v) this.zze).a(this.zzj, zza);
        zzb(new C0523A(zza));
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaef) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaef.zza(new zzahr(((C0528e) this.zzd).f7920a.zzf(), zzafo.zza(this.zzu)), (zzaed) this.zzb);
    }
}
