package com.google.android.gms.internal.play_billing;

import h0.C0552a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

final class zzeo implements zzeu {
    private static final zzet zza = new zzet(zzeo.class);
    private final Object zzb;

    public zzeo(Object obj) {
        this.zzb = obj;
    }

    public final boolean cancel(boolean z3) {
        return false;
    }

    public final Object get() {
        return this.zzb;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        Object obj = this.zzb;
        String obj2 = super.toString();
        String obj3 = obj.toString();
        return obj2 + "[status=SUCCESS, result=[" + obj3 + "]]";
    }

    public final void zzb(Runnable runnable, Executor executor) {
        zzbe.zzc(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e6) {
            zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", C0552a.p("RuntimeException while executing runnable ", runnable.toString(), " with executor ", String.valueOf(executor)), e6);
        }
    }

    public final Object get(long j6, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.zzb;
    }
}
