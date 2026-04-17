package com.google.android.recaptcha.internal;

public final class zzce extends Exception {
    private final Throwable zza;
    private final zztd zzb;
    private final int zzc;
    private final int zzd;

    public zzce(int i2, int i5, Throwable th) {
        this.zzc = i2;
        this.zzd = i5;
        this.zza = th;
        zztd zzf = zzte.zzf();
        zzf.zzq(i5);
        zzf.zzr(i2);
        this.zzb = zzf;
    }

    public final Throwable getCause() {
        return this.zza;
    }

    public final zztd zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzd;
    }
}
