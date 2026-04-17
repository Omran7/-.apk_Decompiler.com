package com.google.android.gms.internal.measurement;

import G1.b;
import android.os.SystemClock;

abstract class zzeu implements Runnable {
    final long zzh = System.currentTimeMillis();
    final long zzi;
    final boolean zzj;
    final /* synthetic */ zzff zzk;

    public zzeu(zzff zzff, boolean z3) {
        this.zzk = zzff;
        ((b) zzff.zza).getClass();
        ((b) zzff.zza).getClass();
        this.zzi = SystemClock.elapsedRealtime();
        this.zzj = z3;
    }

    public final void run() {
        if (this.zzk.zzh) {
            zzb();
            return;
        }
        try {
            zza();
        } catch (Exception e6) {
            this.zzk.zzU(e6, false, this.zzj);
            zzb();
        }
    }

    public abstract void zza();

    public void zzb() {
    }
}
