package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaff  reason: invalid package */
final class zzaff implements Runnable {
    private final /* synthetic */ zzafe zza;
    private final /* synthetic */ zzaez zzb;

    public zzaff(zzaez zzaez, zzafe zzafe) {
        this.zza = zzafe;
        this.zzb = zzaez;
    }

    public final void run() {
        synchronized (this.zzb.zza.zzh) {
            try {
                if (!this.zzb.zza.zzh.isEmpty()) {
                    this.zza.zza(this.zzb.zza.zzh.get(0), new Object[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
