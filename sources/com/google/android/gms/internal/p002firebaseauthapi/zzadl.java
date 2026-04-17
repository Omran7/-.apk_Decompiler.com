package com.google.android.gms.internal.p002firebaseauthapi;

import K1.e;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import e3.C0495c;
import f3.C0523A;
import f3.C0528e;
import f3.v;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadl  reason: invalid package */
final class zzadl extends zzaex<C0523A, v> {
    private final zzait zzu;

    public zzadl(C0495c cVar, String str) {
        super(2);
        I.h(cVar, "credential cannot be null");
        this.zzu = e.x0(cVar, str);
    }

    public final String zza() {
        return "signInWithCredential";
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
