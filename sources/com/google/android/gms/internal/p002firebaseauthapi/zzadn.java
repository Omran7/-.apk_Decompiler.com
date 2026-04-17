package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import f3.C0523A;
import f3.C0528e;
import f3.v;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadn  reason: invalid package */
final class zzadn extends zzaex<C0523A, v> {
    private final String zzu;
    private final String zzv;
    private final String zzw;
    private final String zzx;

    public zzadn(String str, String str2, String str3, String str4) {
        super(2);
        I.e(str, "email cannot be null or empty");
        I.e(str2, "password cannot be null or empty");
        this.zzu = str;
        this.zzv = str2;
        this.zzw = str3;
        this.zzx = str4;
    }

    public final String zza() {
        return "signInWithEmailAndPassword";
    }

    public final void zzb() {
        C0528e zza = zzach.zza(this.zzc, this.zzk);
        ((v) this.zze).a(this.zzj, zza);
        zzb(new C0523A(zza));
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaef) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaef.zzb(this.zzu, this.zzv, this.zzw, this.zzx, this.zzb);
    }
}
