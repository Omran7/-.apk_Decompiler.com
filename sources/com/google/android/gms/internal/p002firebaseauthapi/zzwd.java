package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwd  reason: invalid package */
public enum zzwd implements zzala {
    KEM_UNKNOWN(0),
    DHKEM_X25519_HKDF_SHA256(1),
    DHKEM_P256_HKDF_SHA256(2),
    DHKEM_P384_HKDF_SHA384(3),
    DHKEM_P521_HKDF_SHA512(4),
    UNRECOGNIZED(-1);
    
    private final int zzh;

    private zzwd(int i2) {
        this.zzh = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(zzwd.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb.append(" number=");
            sb.append(zza());
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzh;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static zzwd zza(int i2) {
        if (i2 == 0) {
            return KEM_UNKNOWN;
        }
        if (i2 == 1) {
            return DHKEM_X25519_HKDF_SHA256;
        }
        if (i2 == 2) {
            return DHKEM_P256_HKDF_SHA256;
        }
        if (i2 == 3) {
            return DHKEM_P384_HKDF_SHA384;
        }
        if (i2 != 4) {
            return null;
        }
        return DHKEM_P521_HKDF_SHA512;
    }
}
