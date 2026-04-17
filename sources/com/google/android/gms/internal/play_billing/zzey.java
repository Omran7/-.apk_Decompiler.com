package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class zzey extends zzeh implements ScheduledFuture, zzeu {
    private final ScheduledFuture zza;

    public zzey(zzeu zzeu, ScheduledFuture scheduledFuture) {
        super(zzeu);
        this.zza = scheduledFuture;
    }

    public final boolean cancel(boolean z3) {
        boolean cancel = zzc().cancel(z3);
        if (cancel) {
            this.zza.cancel(z3);
        }
        return cancel;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zza.compareTo((Delayed) obj);
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.zza.getDelay(timeUnit);
    }
}
