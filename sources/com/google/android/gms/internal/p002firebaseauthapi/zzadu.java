package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import e3.u;
import e3.w;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadu  reason: invalid package */
final class zzadu extends zzaex<Void, u> {
    private final zzaah zzu;

    public zzadu(w wVar, String str, String str2, long j6, boolean z3, boolean z4, String str3, String str4, String str5, boolean z5) {
        super(8);
        I.g(wVar);
        I.d(str);
        this.zzu = new zzaah(wVar, str, str2, j6, z3, z4, str3, str4, str5, z5);
    }

    public final String zza() {
        return "startMfaSignInWithPhoneNumber";
    }

    public final void zzb() {
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaef) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaef.zza(this.zzu, (zzaed) this.zzb);
    }
}
