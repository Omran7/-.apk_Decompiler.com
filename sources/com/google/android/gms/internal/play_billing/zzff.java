package com.google.android.gms.internal.play_billing;

import h0.C0552a;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class zzff extends zzee {
    /* access modifiers changed from: private */
    public zzeu zzc;
    /* access modifiers changed from: private */
    public ScheduledFuture zzd;

    private zzff(zzeu zzeu) {
        this.zzc = zzeu;
    }

    public static zzeu zzs(zzeu zzeu, long j6, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzff zzff = new zzff(zzeu);
        zzfc zzfc = new zzfc(zzff);
        zzff.zzd = scheduledExecutorService.schedule(zzfc, 28500, timeUnit);
        zzeu.zzb(zzfc, zzed.INSTANCE);
        return zzff;
    }

    public final String zzg() {
        zzeu zzeu = this.zzc;
        ScheduledFuture scheduledFuture = this.zzd;
        if (zzeu == null) {
            return null;
        }
        String o6 = C0552a.o("inputFuture=[", zzeu.toString(), "]");
        if (scheduledFuture == null) {
            return o6;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return o6;
        }
        return o6 + ", remaining delay=[" + delay + " ms]";
    }

    public final void zzm() {
        boolean z3;
        zzeu zzeu = this.zzc;
        if (zzeu != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 && isCancelled()) {
            zzeu.cancel(zzq());
        }
        ScheduledFuture scheduledFuture = this.zzd;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zzc = null;
        this.zzd = null;
    }
}
