package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import e3.n;
import f3.C0536m;
import f3.v;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacs  reason: invalid package */
final class zzacs extends zzaex<n, v> {
    private final String zzu;

    public zzacs(String str) {
        super(1);
        I.e(str, "refresh token cannot be null");
        this.zzu = str;
    }

    public final String zza() {
        return "getAccessToken";
    }

    public final void zzb() {
        if (TextUtils.isEmpty(this.zzj.zzd())) {
            this.zzj.zzc(this.zzu);
        }
        ((v) this.zze).a(this.zzj, this.zzd);
        zzb(C0536m.a(this.zzj.zzc()));
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaef) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaef.zzb(this.zzu, (zzaed) this.zzb);
    }
}
