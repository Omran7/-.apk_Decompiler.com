package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzalq  reason: invalid package */
final class zzalq implements zzamu {
    private static final zzamd zza = new zzalt();
    private final zzamd zzb;

    public zzalq() {
        this(new zzalv(zzakw.zza(), zza));
    }

    public final <T> zzamv<T> zza(Class<T> cls) {
        zzakm<?> zzakm;
        zzamx.zza((Class<?>) cls);
        zzama zza2 = this.zzb.zza(cls);
        if (zza2.zzc()) {
            return zzami.zza(zzamx.zza(), zzako.zza(), zza2.zza());
        }
        zzamk zza3 = zzamm.zza();
        zzalm zza4 = zzalo.zza();
        zzano<?, ?> zza5 = zzamx.zza();
        if (zzals.zza[zza2.zzb().ordinal()] != 1) {
            zzakm = zzako.zza();
        } else {
            zzakm = null;
        }
        return zzamg.zza(cls, zza2, zza3, zza4, zza5, zzakm, zzamb.zza());
    }

    private zzalq(zzamd zzamd) {
        this.zzb = (zzamd) zzalb.zza(zzamd, "messageInfoFactory");
    }
}
