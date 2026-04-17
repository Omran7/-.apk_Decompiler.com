package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafj  reason: invalid package */
public final /* synthetic */ class zzafj implements Runnable {
    private /* synthetic */ zzafg zza;
    private /* synthetic */ zzafi zzb;
    private /* synthetic */ TaskCompletionSource zzc;

    public /* synthetic */ zzafj(zzafg zzafg, zzafi zzafi, TaskCompletionSource taskCompletionSource) {
        this.zza = zzafg;
        this.zzb = zzafi;
        this.zzc = taskCompletionSource;
    }

    public final void run() {
        this.zzb.zza(this.zzc, this.zza.zza);
    }
}
