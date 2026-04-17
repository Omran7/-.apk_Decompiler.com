package com.google.android.gms.internal.auth;

final class zzhl extends zzhk {
    public final int zza(int i2, byte[] bArr, int i5, int i6) {
        while (r10 < i6 && bArr[r10] >= 0) {
            i5 = r10 + 1;
        }
        if (r10 >= i6) {
            return 0;
        }
        while (r10 < i6) {
            int i7 = r10 + 1;
            byte b6 = bArr[r10];
            if (b6 < 0) {
                if (b6 < -32) {
                    if (i7 >= i6) {
                        return b6;
                    }
                    if (b6 >= -62) {
                        r10 += 2;
                        if (bArr[i7] > -65) {
                        }
                    }
                } else if (b6 < -16) {
                    if (i7 >= i6 - 1) {
                        return zzhm.zza(bArr, i7, i6);
                    }
                    int i8 = r10 + 2;
                    byte b7 = bArr[i7];
                    if (b7 <= -65 && ((b6 != -32 || b7 >= -96) && (b6 != -19 || b7 < -96))) {
                        r10 += 3;
                        if (bArr[i8] > -65) {
                        }
                    }
                } else if (i7 >= i6 - 2) {
                    return zzhm.zza(bArr, i7, i6);
                } else {
                    int i9 = r10 + 2;
                    byte b8 = bArr[i7];
                    if (b8 <= -65) {
                        if ((((b8 + 112) + (b6 << 28)) >> 30) == 0) {
                            int i10 = r10 + 3;
                            if (bArr[i9] <= -65) {
                                r10 += 4;
                                if (bArr[i10] > -65) {
                                }
                            }
                        }
                    }
                }
                return -1;
            }
            r10 = i7;
        }
        return 0;
    }
}
