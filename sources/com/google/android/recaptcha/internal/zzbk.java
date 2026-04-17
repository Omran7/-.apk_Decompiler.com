package com.google.android.recaptcha.internal;

import java.util.concurrent.ConcurrentHashMap;

public final class zzbk {
    public static final /* synthetic */ int zza = 0;
    private static final ConcurrentHashMap zzb = new ConcurrentHashMap();

    public static final void zza(int i2, long j6) {
        ConcurrentHashMap concurrentHashMap = zzb;
        Integer valueOf = Integer.valueOf(i2);
        Object obj = concurrentHashMap.get(valueOf);
        if (obj == null) {
            obj = new zzbj();
        }
        zzbj zzbj = (zzbj) obj;
        zzbj.zzg(zzbj.zzb() + 1);
        zzbj.zzf(zzbj.zzd() + j6);
        zzbj.zze(Math.max(j6, zzbj.zzc()));
        concurrentHashMap.put(valueOf, zzbj);
    }
}
