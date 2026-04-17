package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzamr  reason: invalid package */
final class zzamr {
    private static final zzamr zza = new zzamr();
    private final zzamu zzb = new zzalq();
    private final ConcurrentMap<Class<?>, zzamv<?>> zzc = new ConcurrentHashMap();

    private zzamr() {
    }

    public static zzamr zza() {
        return zza;
    }

    public final <T> zzamv<T> zza(Class<T> cls) {
        zzalb.zza(cls, "messageType");
        zzamv<T> zzamv = this.zzc.get(cls);
        if (zzamv != null) {
            return zzamv;
        }
        zzamv<T> zza2 = this.zzb.zza(cls);
        zzalb.zza(cls, "messageType");
        zzalb.zza(zza2, "schema");
        zzamv<T> putIfAbsent = this.zzc.putIfAbsent(cls, zza2);
        return putIfAbsent != null ? putIfAbsent : zza2;
    }

    public final <T> zzamv<T> zza(T t6) {
        return zza(t6.getClass());
    }
}
