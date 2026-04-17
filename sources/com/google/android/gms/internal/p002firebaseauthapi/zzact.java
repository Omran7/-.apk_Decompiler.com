package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import e3.C0496d;
import f3.C0523A;
import f3.C0528e;
import f3.v;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzact  reason: invalid package */
final class zzact extends zzaex<C0523A, v> {
    private final C0496d zzu;
    private final String zzv;

    public zzact(C0496d dVar, String str) {
        super(2);
        I.h(dVar, "credential cannot be null");
        this.zzu = dVar;
        I.e(dVar.f7640a, "email cannot be null");
        I.e(dVar.f7641b, "password cannot be null");
        this.zzv = str;
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
        String str = dVar.f7640a;
        String str2 = dVar.f7641b;
        I.d(str2);
        zzaef.zza(str, str2, ((C0528e) this.zzd).f7920a.zzf(), this.zzd.v(), this.zzv, this.zzb);
    }
}
