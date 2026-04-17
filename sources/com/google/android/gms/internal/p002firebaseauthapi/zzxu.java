package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxu  reason: invalid package */
public enum zzxu implements zzala {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    WITH_ID_REQUIREMENT(5),
    UNRECOGNIZED(-1);
    
    private final int zzi;

    private zzxu(int i2) {
        this.zzi = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(zzxu.class.getName());
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
            return this.zzi;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static zzxu zza(int i2) {
        if (i2 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i2 == 1) {
            return TINK;
        }
        if (i2 == 2) {
            return LEGACY;
        }
        if (i2 == 3) {
            return RAW;
        }
        if (i2 == 4) {
            return CRUNCHY;
        }
        if (i2 != 5) {
            return null;
        }
        return WITH_ID_REQUIREMENT;
    }
}
