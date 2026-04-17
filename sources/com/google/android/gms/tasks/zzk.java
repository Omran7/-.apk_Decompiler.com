package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.I;

final class zzk implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzl zzb;

    public zzk(zzl zzl, Task task) {
        this.zzb = zzl;
        this.zza = task;
    }

    public final void run() {
        synchronized (this.zzb.zzb) {
            try {
                zzl zzl = this.zzb;
                if (zzl.zzc != null) {
                    OnFailureListener zza2 = zzl.zzc;
                    Exception exception = this.zza.getException();
                    I.g(exception);
                    zza2.onFailure(exception);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
