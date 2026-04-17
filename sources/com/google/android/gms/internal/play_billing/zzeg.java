package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class zzeg extends zzcf implements Future {
    public boolean cancel(boolean z3) {
        return zzc().cancel(z3);
    }

    public final Object get() {
        return zzc().get();
    }

    public final boolean isCancelled() {
        return zzc().isCancelled();
    }

    public final boolean isDone() {
        return zzc().isDone();
    }

    public /* bridge */ /* synthetic */ Object zza() {
        throw null;
    }

    public abstract Future zzc();

    public final Object get(long j6, TimeUnit timeUnit) {
        return zzc().get(j6, timeUnit);
    }
}
