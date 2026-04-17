package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Callable;

final class zzfg extends zzes {
    final /* synthetic */ zzfh zza;
    private final Callable zzb;

    public zzfg(zzfh zzfh, Callable callable) {
        this.zza = zzfh;
        callable.getClass();
        this.zzb = callable;
    }

    public final Object zza() {
        return this.zzb.call();
    }

    public final String zzb() {
        return this.zzb.toString();
    }

    public final void zzc(Throwable th) {
        this.zza.zzo(th);
    }

    public final void zzd(Object obj) {
        this.zza.zzn(obj);
    }

    public final boolean zzf() {
        return this.zza.isDone();
    }
}
