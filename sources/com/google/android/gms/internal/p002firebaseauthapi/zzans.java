package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzans  reason: invalid package */
final class zzans {
    private static boolean zza(byte b6) {
        return b6 > -65;
    }

    public static /* synthetic */ void zza(byte b6, byte b7, byte b8, byte b9, char[] cArr, int i2) {
        if (!zza(b7)) {
            if ((((b7 + 112) + (b6 << 28)) >> 30) == 0 && !zza(b8) && !zza(b9)) {
                byte b10 = ((b6 & 7) << 18) | ((b7 & 63) << 12) | ((b8 & 63) << 6) | (b9 & 63);
                cArr[i2] = (char) ((b10 >>> 10) + 55232);
                cArr[i2 + 1] = (char) ((b10 & 1023) + 56320);
                return;
            }
        }
        throw zzalf.zzd();
    }

    public static /* synthetic */ void zza(byte b6, char[] cArr, int i2) {
        cArr[i2] = (char) b6;
    }

    public static /* synthetic */ void zza(byte b6, byte b7, byte b8, char[] cArr, int i2) {
        if (zza(b7) || ((b6 == -32 && b7 < -96) || ((b6 == -19 && b7 >= -96) || zza(b8)))) {
            throw zzalf.zzd();
        }
        cArr[i2] = (char) (((b6 & 15) << 12) | ((b7 & 63) << 6) | (b8 & 63));
    }

    public static /* synthetic */ void zza(byte b6, byte b7, char[] cArr, int i2) {
        if (b6 < -62 || zza(b7)) {
            throw zzalf.zzd();
        }
        cArr[i2] = (char) (((b6 & 31) << 6) | (b7 & 63));
    }
}
