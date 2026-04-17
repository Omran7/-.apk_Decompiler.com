package com.google.android.gms.internal.p002firebaseauthapi;

import K1.e;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import e3.C0495c;
import f3.C0523A;
import f3.C0528e;
import f3.v;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacw  reason: invalid package */
final class zzacw extends zzaex<C0523A, v> {
    private final zzait zzu;

    public zzacw(C0495c cVar) {
        super(2);
        I.h(cVar, "credential cannot be null");
        this.zzu = e.x0(cVar, (String) null);
    }

    public final String zza() {
        return "linkFederatedCredential";
    }

    public final void zzb() {
        C0528e zza = zzach.zza(this.zzc, this.zzk);
        ((v) this.zze).a(this.zzj, zza);
        zzb(new C0523A(zza));
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaef) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaef.zza(((C0528e) this.zzd).f7920a.zzf(), this.zzu, (zzaed) this.zzb);
    }
}
