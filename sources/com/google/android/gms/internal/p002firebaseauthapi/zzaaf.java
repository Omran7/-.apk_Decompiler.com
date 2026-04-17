package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaaf  reason: invalid package */
public final class zzaaf {
    private final zzaae zza;

    private zzaaf(zzaae zzaae) {
        this.zza = zzaae;
    }

    public final int zza() {
        return this.zza.zza();
    }

    public static zzaaf zza(byte[] bArr, zzck zzck) {
        if (zzck != null) {
            return new zzaaf(zzaae.zza(bArr));
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public static zzaaf zza(int i2) {
        return new zzaaf(zzaae.zza(zzqg.zza(i2)));
    }

    public final byte[] zza(zzck zzck) {
        if (zzck != null) {
            return this.zza.zzb();
        }
        throw new NullPointerException("SecretKeyAccess required");
    }
}
