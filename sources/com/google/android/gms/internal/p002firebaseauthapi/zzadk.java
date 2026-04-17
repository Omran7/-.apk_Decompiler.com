package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import e3.C0493a;
import f3.v;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadk  reason: invalid package */
final class zzadk extends zzaex<Void, v> {
    private final zzahe zzu;
    private final String zzv;

    public zzadk(String str, C0493a aVar, String str2, String str3, String str4) {
        super(4);
        I.e(str, "email cannot be null or empty");
        zzahe zzahe = new zzahe(aVar.f7634r);
        this.zzu = zzahe;
        zzahe.zzb(str);
        zzahe.zza(aVar);
        zzahe.zzc(str2);
        zzahe.zza(str3);
        this.zzv = str4;
    }

    public final String zza() {
        return this.zzv;
    }

    public final void zzb() {
        zzb(null);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaef) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaef.zzb(this.zzu, (zzaed) this.zzb);
    }
}
