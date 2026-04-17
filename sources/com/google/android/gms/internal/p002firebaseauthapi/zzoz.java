package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzoz  reason: invalid package */
public final class zzoz {
    private static zzoz zza = new zzoz();
    private final AtomicReference<zzpv> zzb = new AtomicReference<>(zzpv.zza().zza());

    public static zzoz zza() {
        return zza;
    }

    public final <KeyT extends zzbm, PrimitiveT> PrimitiveT zza(KeyT keyt, Class<PrimitiveT> cls) {
        return this.zzb.get().zza(keyt, cls);
    }

    public final synchronized <KeyT extends zzbm, PrimitiveT> void zza(zzpr<KeyT, PrimitiveT> zzpr) {
        this.zzb.set(zzpv.zza(this.zzb.get()).zza(zzpr).zza());
    }

    public final synchronized <InputPrimitiveT, WrapperPrimitiveT> void zza(zzqc<InputPrimitiveT, WrapperPrimitiveT> zzqc) {
        this.zzb.set(zzpv.zza(this.zzb.get()).zza(zzqc).zza());
    }
}
