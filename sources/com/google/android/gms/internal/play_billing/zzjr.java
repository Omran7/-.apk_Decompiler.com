package com.google.android.gms.internal.play_billing;

final class zzjr {
    public static /* bridge */ /* synthetic */ void zza(byte b6, byte b7, byte b8, byte b9, char[] cArr, int i2) {
        if (!zze(b7)) {
            if ((((b7 + 112) + (b6 << 28)) >> 30) == 0 && !zze(b8) && !zze(b9)) {
                byte b10 = ((b6 & 7) << 18) | ((b7 & 63) << 12) | ((b8 & 63) << 6) | (b9 & 63);
                cArr[i2] = (char) ((b10 >>> 10) + 55232);
                cArr[i2 + 1] = (char) ((b10 & 1023) + 56320);
                return;
            }
        }
        throw new zzhr("Protocol message had invalid UTF-8.");
    }

    public static /* bridge */ /* synthetic */ void zzb(byte b6, byte b7, byte b8, char[] cArr, int i2) {
        if (!zze(b7)) {
            if (b6 == -32) {
                if (b7 >= -96) {
                    b6 = -32;
                }
            }
            if (b6 == -19) {
                if (b7 < -96) {
                    b6 = -19;
                }
            }
            if (!zze(b8)) {
                cArr[i2] = (char) (((b6 & 15) << 12) | ((b7 & 63) << 6) | (b8 & 63));
                return;
            }
        }
        throw new zzhr("Protocol message had invalid UTF-8.");
    }

    public static /* bridge */ /* synthetic */ void zzc(byte b6, byte b7, char[] cArr, int i2) {
        if (b6 < -62 || zze(b7)) {
            throw new zzhr("Protocol message had invalid UTF-8.");
        }
        cArr[i2] = (char) (((b6 & 31) << 6) | (b7 & 63));
    }

    public static /* bridge */ /* synthetic */ boolean zzd(byte b6) {
        return b6 >= 0;
    }

    private static boolean zze(byte b6) {
        return b6 > -65;
    }
}
