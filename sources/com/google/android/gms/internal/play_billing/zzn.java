package com.google.android.gms.internal.play_billing;

final class zzn extends zzf {
    public zzn() {
        super((zzp) null);
    }

    public final void zza(zzo zzo, zzo zzo2) {
        zzo.zzc = zzo2;
    }

    public final void zzb(zzo zzo, Thread thread) {
        zzo.zzb = thread;
    }

    public final boolean zzc(zzq zzq, zzj zzj, zzj zzj2) {
        synchronized (zzq) {
            try {
                if (zzq.zzd != zzj) {
                    return false;
                }
                zzq.zzd = zzj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzd(zzq zzq, Object obj, Object obj2) {
        synchronized (zzq) {
            try {
                if (zzq.zzc != obj) {
                    return false;
                }
                zzq.zzc = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zze(zzq zzq, zzo zzo, zzo zzo2) {
        synchronized (zzq) {
            try {
                if (zzq.zze != zzo) {
                    return false;
                }
                zzq.zze = zzo2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
