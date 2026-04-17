package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzalv  reason: invalid package */
final class zzalv implements zzamd {
    private zzamd[] zza;

    public zzalv(zzamd... zzamdArr) {
        this.zza = zzamdArr;
    }

    public final zzama zza(Class<?> cls) {
        for (zzamd zzamd : this.zza) {
            if (zzamd.zzb(cls)) {
                return zzamd.zza(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    public final boolean zzb(Class<?> cls) {
        for (zzamd zzb : this.zza) {
            if (zzb.zzb(cls)) {
                return true;
            }
        }
        return false;
    }
}
