package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwb  reason: invalid package */
public enum zzwb implements zzala {
    AEAD_UNKNOWN(0),
    AES_128_GCM(1),
    AES_256_GCM(2),
    CHACHA20_POLY1305(3),
    UNRECOGNIZED(-1);
    
    private final int zzg;

    private zzwb(int i2) {
        this.zzg = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(zzwb.class.getName());
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

    public static zzwb zza(int i2) {
        if (i2 == 0) {
            return AEAD_UNKNOWN;
        }
        if (i2 == 1) {
            return AES_128_GCM;
        }
        if (i2 == 2) {
            return AES_256_GCM;
        }
        if (i2 != 3) {
            return null;
        }
        return CHACHA20_POLY1305;
    }
}
