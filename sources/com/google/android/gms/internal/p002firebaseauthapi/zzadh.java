package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import e3.C0493a;
import f3.v;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadh  reason: invalid package */
final class zzadh extends zzaex<Void, v> {
    private final zzahe zzu;

    public zzadh(String str, C0493a aVar) {
        super(6);
        I.e(str, "token cannot be null or empty");
        zzahe zzahe = new zzahe(4);
        this.zzu = zzahe;
        zzahe.zzd(str);
        if (aVar != null) {
            zzahe.zza(aVar);
        }
    }

    public final String zza() {
        return "sendEmailVerification";
    }

    public final void zzb() {
        zzb(null);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaef) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaef.zza(this.zzu, (zzaed) this.zzb);
    }
}
