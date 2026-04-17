package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafx  reason: invalid package */
public final /* synthetic */ class zzafx implements Runnable {
    private /* synthetic */ zzafu zza;
    private /* synthetic */ String zzb;

    public /* synthetic */ zzafx(zzafu zzafu, String str) {
        this.zza = zzafu;
        this.zzb = str;
    }

    public final void run() {
        this.zza.zze(this.zzb);
    }
}
