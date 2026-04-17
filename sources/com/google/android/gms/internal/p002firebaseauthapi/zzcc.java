package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcc  reason: invalid package */
public final class zzcc {
    public static zzbq zza(zzby zzby, zzck zzck) {
        if (zzck != null) {
            return zzbq.zza(zzby.zzb());
        }
        throw new NullPointerException("SecretKeyAccess cannot be null");
    }

    public static void zza(zzbq zzbq, zzbx zzbx, zzck zzck) {
        if (zzck != null) {
            zzbx.zza(zzbq.zzd());
            return;
        }
        throw new NullPointerException("SecretKeyAccess cannot be null");
    }
}
