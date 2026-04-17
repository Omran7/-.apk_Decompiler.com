package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwe  reason: invalid package */
public enum zzwe implements zzala {
    KDF_UNKNOWN(0),
    HKDF_SHA256(1),
    HKDF_SHA384(2),
    HKDF_SHA512(3),
    UNRECOGNIZED(-1);
    
    private final int zzg;

    private zzwe(int i2) {
        this.zzg = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(zzwe.class.getName());
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
            return this.zzg;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static zzwe zza(int i2) {
        if (i2 == 0) {
            return KDF_UNKNOWN;
        }
        if (i2 == 1) {
            return HKDF_SHA256;
        }
        if (i2 == 2) {
            return HKDF_SHA384;
        }
        if (i2 != 3) {
            return null;
        }
        return HKDF_SHA512;
    }
}
