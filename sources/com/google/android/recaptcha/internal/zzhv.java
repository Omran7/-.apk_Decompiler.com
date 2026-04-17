package com.google.android.recaptcha.internal;

import java.math.BigInteger;

public final class zzhv {
    /* access modifiers changed from: private */
    public static final zzhu zza = new zzhu(11, ((long) Math.pow(2.0d, 32.0d)) ^ 20919936621L, (long) Math.pow(2.0d, 48.0d));
    private final zzhu zzb;
    private long zzc;

    public zzhv(long j6, long j7, zzhu zzhu) {
        this.zzb = zzhu;
        this.zzc = Math.abs(j6);
    }

    public final long zza() {
        zzhu zzhu = this.zzb;
        long longValue = (BigInteger.valueOf(zzhu.zzb()).multiply(BigInteger.valueOf(this.zzc)).mod(BigInteger.valueOf(zzhu.zza())).longValue() + 11) % this.zzb.zza();
        this.zzc = longValue;
        return longValue % 255;
    }
}
