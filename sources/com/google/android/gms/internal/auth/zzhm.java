package com.google.android.gms.internal.auth;

final class zzhm {
    private static final zzhk zza = new zzhl();

    static {
        if (zzhi.zzu() && zzhi.zzv()) {
            int i2 = zzdr.zza;
        }
    }

    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i2, int i5) {
        byte b6 = bArr[i2 - 1];
        int i6 = i5 - i2;
        if (i6 != 0) {
            if (i6 == 1) {
                byte b7 = bArr[i2];
                if (b6 <= -12 && b7 <= -65) {
                    return b6 ^ (b7 << 8);
                }
            } else if (i6 == 2) {
                byte b8 = bArr[i2];
                byte b9 = bArr[i2 + 1];
                if (b6 <= -12 && b8 <= -65 && b9 <= -65) {
                    return ((b8 << 8) ^ b6) ^ (b9 << 16);
                }
            } else {
                throw new AssertionError();
            }
        } else if (b6 <= -12) {
            return b6;
        }
        return -1;
    }

    public static String zzb(byte[] bArr, int i2, int i5) {
        int length = bArr.length;
        if ((i2 | i5 | ((length - i2) - i5)) >= 0) {
            int i6 = i2 + i5;
            char[] cArr = new char[i5];
            int i7 = 0;
            while (r10 < i6) {
                byte b6 = bArr[r10];
                if (!zzhj.zzd(b6)) {
                    break;
                }
                i2 = r10 + 1;
                cArr[i7] = (char) b6;
                i7++;
            }
            int i8 = i7;
            while (r10 < i6) {
                int i9 = r10 + 1;
                byte b7 = bArr[r10];
                if (zzhj.zzd(b7)) {
                    cArr[i8] = (char) b7;
                    i8++;
                    r10 = i9;
                    while (r10 < i6) {
                        byte b8 = bArr[r10];
                        if (!zzhj.zzd(b8)) {
                            break;
                        }
                        r10++;
                        cArr[i8] = (char) b8;
                        i8++;
                    }
                } else if (b7 < -32) {
                    if (i9 < i6) {
                        r10 += 2;
                        zzhj.zzc(b7, bArr[i9], cArr, i8);
                        i8++;
                    } else {
                        throw zzfa.zzb();
                    }
                } else if (b7 < -16) {
                    if (i9 < i6 - 1) {
                        int i10 = r10 + 2;
                        r10 += 3;
                        zzhj.zzb(b7, bArr[i9], bArr[i10], cArr, i8);
                        i8++;
                    } else {
                        throw zzfa.zzb();
                    }
                } else if (i9 < i6 - 2) {
                    int i11 = r10 + 2;
                    int i12 = r10 + 3;
                    r10 += 4;
                    zzhj.zza(b7, bArr[i9], bArr[i11], bArr[i12], cArr, i8);
                    i8 += 2;
                } else {
                    throw zzfa.zzb();
                }
            }
            return new String(cArr, 0, i8);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(i2), Integer.valueOf(i5)}));
    }

    public static boolean zzc(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    public static boolean zzd(byte[] bArr, int i2, int i5) {
        return zza.zzb(bArr, i2, i5);
    }
}
