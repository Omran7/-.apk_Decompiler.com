package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import f3.v;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadt  reason: invalid package */
final class zzadt extends zzaex<Void, v> {
    private final String zzu;
    private final String zzv;
    private final String zzw;

    public zzadt(String str, String str2, String str3) {
        super(2);
        I.d(str);
        this.zzu = str;
        I.d(str2);
        this.zzv = str2;
        this.zzw = str3;
    }

    public final String zza() {
        return "unenrollMfa";
    }

    public final void zzb() {
        ((v) this.zze).a(this.zzj, zzach.zza(this.zzc, this.zzk));
        zzb(null);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaef) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaef.zza(this.zzu, this.zzv, this.zzw, (zzaed) this.zzb);
    }
}
