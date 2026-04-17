package com.google.android.recaptcha.internal;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class zzos {
    public static final /* synthetic */ int zza = 0;
    private static final zzos zzb = new zzos();
    private final zzox zzc = new zzoa();
    private final ConcurrentMap zzd = new ConcurrentHashMap();

    private zzos() {
    }

    public static zzos zza() {
        return zzb;
    }

    public final zzow zzb(Class cls) {
        zznl.zzc(cls, "messageType");
        zzow zzow = (zzow) this.zzd.get(cls);
        if (zzow == null) {
            zzow = this.zzc.zza(cls);
            zznl.zzc(cls, "messageType");
            zzow zzow2 = (zzow) this.zzd.putIfAbsent(cls, zzow);
            if (zzow2 == null) {
                return zzow;
            }
            return zzow2;
        }
        return zzow;
    }
}
