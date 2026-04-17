package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaad  reason: invalid package */
public final class zzaad {
    private final BigInteger zza;

    private zzaad(BigInteger bigInteger) {
        this.zza = bigInteger;
    }

    public static zzaad zza(BigInteger bigInteger, zzck zzck) {
        if (zzck != null) {
            return new zzaad(bigInteger);
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public final BigInteger zza(zzck zzck) {
        if (zzck != null) {
            return this.zza;
        }
        throw new NullPointerException("SecretKeyAccess required");
    }
}
