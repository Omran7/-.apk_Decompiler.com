package com.google.android.gms.internal.p002firebaseauthapi;

import h0.C0552a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzant  reason: invalid package */
final class zzant {
    private static final zzanv zza = new zzanu();

    static {
        if (zzanp.zzc()) {
            boolean zzd = zzanp.zzd();
        }
    }

    public static /* synthetic */ int zza(byte[] bArr, int i2, int i5) {
        byte b6 = bArr[i2 - 1];
        int i6 = i5 - i2;
        if (i6 != 0) {
            if (i6 == 1) {
                byte b7 = bArr[i2];
                if (b6 > -12 || b7 > -65) {
                    return -1;
                }
                return (b7 << 8) ^ b6;
            } else if (i6 == 2) {
                byte b8 = bArr[i2];
                byte b9 = bArr[i2 + 1];
                if (b6 > -12 || b8 > -65 || b9 > -65) {
                    return -1;
                }
                return (b9 << 16) ^ ((b8 << 8) ^ b6);
            } else {
                throw new AssertionError();
            }
        } else if (b6 > -12) {
            return -1;
        } else {
            return b6;
        }
    }

    public static String zzb(byte[] bArr, int i2, int i5) {
        return zza.zza(bArr, i2, i5);
    }

    public static boolean zzc(byte[] bArr, int i2, int i5) {
        if (zza.zza(0, bArr, i2, i5) == 0) {
            return true;
        }
        return false;
    }

    public static int zza(String str, byte[] bArr, int i2, int i5) {
        return zza.zza(str, bArr, i2, i5);
    }

    public static int zza(String str) {
        int length = str.length();
        int i2 = 0;
        int i5 = 0;
        while (i5 < length && str.charAt(i5) < 128) {
            i5++;
        }
        int i6 = length;
        while (true) {
            if (i5 >= length) {
                break;
            }
            char charAt = str.charAt(i5);
            if (charAt < 2048) {
                i6 += (127 - charAt) >>> 31;
                i5++;
            } else {
                int length2 = str.length();
                while (i5 < length2) {
                    char charAt2 = str.charAt(i5);
                    if (charAt2 < 2048) {
                        i2 += (127 - charAt2) >>> 31;
                    } else {
                        i2 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i5) >= 65536) {
                                i5++;
                            } else {
                                throw new zzanx(i5, length2);
                            }
                        }
                    }
                    i5++;
                }
                i6 += i2;
            }
        }
        if (i6 >= length) {
            return i6;
        }
        throw new IllegalArgumentException(C0552a.m("UTF-8 length does not fit in int: ", ((long) i6) + 4294967296L));
    }
}
