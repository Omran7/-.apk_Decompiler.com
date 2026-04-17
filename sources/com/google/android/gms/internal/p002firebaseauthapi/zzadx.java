package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import f3.C0528e;
import f3.v;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadx  reason: invalid package */
final class zzadx extends zzaex<Void, v> {
    private final String zzu;

    public zzadx(String str) {
        super(2);
        I.e(str, "password cannot be null or empty");
        this.zzu = str;
    }

    public final String zza() {
        return "updatePassword";
    }

    public final void zzb() {
        ((v) this.zze).a(this.zzj, zzach.zza(this.zzc, this.zzk));
        zzb(null);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaef) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaef.zzc(((C0528e) this.zzd).f7920a.zzf(), this.zzu, this.zzb);
    }
}
