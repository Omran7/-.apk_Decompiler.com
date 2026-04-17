package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import e3.C0496d;
import e3.m;
import f3.C0523A;
import f3.C0528e;
import f3.v;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacy  reason: invalid package */
final class zzacy extends zzaex<C0523A, v> {
    private final C0496d zzu;

    public zzacy(C0496d dVar) {
        super(2);
        I.h(dVar, "credential cannot be null");
        this.zzu = dVar;
    }

    public final String zza() {
        return "linkEmailAuthCredential";
    }

    public final void zzb() {
        C0528e zza = zzach.zza(this.zzc, this.zzk);
        ((v) this.zze).a(this.zzj, zza);
        zzb(new C0523A(zza));
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaef) {
        this.zzg = new zzafh(this, taskCompletionSource);
        C0496d dVar = this.zzu;
        m mVar = this.zzd;
        dVar.getClass();
        dVar.d = ((C0528e) mVar).f7920a.zzf();
        dVar.f7643e = true;
        zzaef.zza(new zzagp(dVar, (String) null, (String) null), (zzaed) this.zzb);
    }
}
