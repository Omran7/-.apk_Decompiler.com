package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import f3.C0523A;
import f3.C0528e;
import f3.v;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadv  reason: invalid package */
final class zzadv extends zzaex<C0523A, v> {
    private String zzu;

    public zzadv(String str) {
        super(2);
        I.e(str, "provider cannot be null or empty");
        this.zzu = str;
    }

    public final String zza() {
        return "unlinkFederatedCredential";
    }

    public final void zzb() {
        C0528e zza = zzach.zza(this.zzc, this.zzk);
        ((v) this.zze).a(this.zzj, zza);
        zzb(new C0523A(zza));
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaef) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaef.zzf(this.zzu, ((C0528e) this.zzd).f7920a.zzf(), this.zzb);
    }
}
