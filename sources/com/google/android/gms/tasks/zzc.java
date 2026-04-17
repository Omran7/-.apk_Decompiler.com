package com.google.android.gms.tasks;

final class zzc implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzd zzb;

    public zzc(zzd zzd, Task task) {
        this.zzb = zzd;
        this.zza = task;
    }

    public final void run() {
        if (this.zza.isCanceled()) {
            this.zzb.zzc.zzc();
            return;
        }
        try {
            this.zzb.zzc.zzb(this.zzb.zzb.then(this.zza));
        } catch (RuntimeExecutionException e6) {
            if (e6.getCause() instanceof Exception) {
                this.zzb.zzc.zza((Exception) e6.getCause());
            } else {
                this.zzb.zzc.zza(e6);
            }
        } catch (Exception e7) {
            this.zzb.zzc.zza(e7);
        }
    }
}
