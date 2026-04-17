package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzib  reason: invalid package */
public final class zzib {
    private static long zza(byte[] bArr, int i2, int i5) {
        return (zza(bArr, i2) >> i5) & 67108863;
    }

    private static long zza(byte[] bArr, int i2) {
        return ((long) (((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16))) & 4294967295L;
    }

    private static void zza(byte[] bArr, long j6, int i2) {
        int i5 = 0;
        while (i5 < 4) {
            bArr[i2 + i5] = (byte) ((int) (255 & j6));
            i5++;
            j6 >>= 8;
        }
    }

    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        if (bArr3.length == 32) {
            long zza = zza(bArr3, 0, 0) & 67108863;
            long zza2 = zza(bArr3, 3, 2) & 67108611;
            long zza3 = zza(bArr3, 6, 4) & 67092735;
            long zza4 = zza(bArr3, 9, 6) & 66076671;
            long zza5 = zza(bArr3, 12, 8) & 1048575;
            long j6 = zza2 * 5;
            long j7 = zza3 * 5;
            long j8 = zza4 * 5;
            long j9 = zza5 * 5;
            int i2 = 17;
            byte[] bArr5 = new byte[17];
            long j10 = 0;
            int i5 = 0;
            long j11 = 0;
            long j12 = 0;
            long j13 = 0;
            long j14 = 0;
            while (i5 < bArr4.length) {
                int min = Math.min(16, bArr4.length - i5);
                System.arraycopy(bArr4, i5, bArr5, 0, min);
                bArr5[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr5, min + 1, i2, (byte) 0);
                }
                long zza6 = j14 + zza(bArr5, 0, 0);
                long zza7 = j10 + zza(bArr5, 3, 2);
                long zza8 = j11 + zza(bArr5, 6, 4);
                long zza9 = j12 + zza(bArr5, 9, 6);
                long zza10 = j13 + (zza(bArr5, 12, 8) | ((long) (bArr5[16] << 24)));
                long j15 = (zza10 * j6) + (zza9 * j7) + (zza8 * j8) + (zza7 * j9) + (zza6 * zza);
                long j16 = (zza10 * j7) + (zza9 * j8) + (zza8 * j9) + (zza7 * zza) + (zza6 * zza2);
                long j17 = (zza10 * j8) + (zza9 * j9) + (zza8 * zza) + (zza7 * zza2) + (zza6 * zza3);
                long j18 = (zza9 * zza) + (zza8 * zza2) + (zza7 * zza3) + (zza6 * zza4);
                long j19 = zza9 * zza2;
                long j20 = zza10 * zza;
                long j21 = j16 + (j15 >> 26);
                long j22 = j17 + (j21 >> 26);
                long j23 = (zza10 * j9) + j18 + (j22 >> 26);
                long j24 = j20 + j19 + (zza8 * zza3) + (zza7 * zza4) + (zza6 * zza5) + (j23 >> 26);
                long j25 = j24 >> 26;
                j13 = j24 & 67108863;
                long j26 = (j25 * 5) + (j15 & 67108863);
                i5 += 16;
                j11 = j22 & 67108863;
                j12 = j23 & 67108863;
                i2 = 17;
                j14 = j26 & 67108863;
                j10 = (j21 & 67108863) + (j26 >> 26);
            }
            long j27 = j11 + (j10 >> 26);
            long j28 = j27 & 67108863;
            long j29 = j12 + (j27 >> 26);
            long j30 = j29 & 67108863;
            long j31 = j13 + (j29 >> 26);
            long j32 = j31 & 67108863;
            long j33 = ((j31 >> 26) * 5) + j14;
            long j34 = j33 >> 26;
            long j35 = j33 & 67108863;
            long j36 = (j10 & 67108863) + j34;
            long j37 = j35 + 5;
            long j38 = j37 & 67108863;
            long j39 = (j37 >> 26) + j36;
            long j40 = j28 + (j39 >> 26);
            long j41 = j30 + (j40 >> 26);
            long j42 = (j32 + (j41 >> 26)) - 67108864;
            long j43 = j42 >> 63;
            long j44 = j35 & j43;
            long j45 = j36 & j43;
            long j46 = j28 & j43;
            long j47 = j30 & j43;
            long j48 = j32 & j43;
            long j49 = ~j43;
            long j50 = j45 | (j39 & 67108863 & j49);
            long j51 = j46 | (j40 & 67108863 & j49);
            long j52 = j47 | (j41 & 67108863 & j49);
            long j53 = j48 | (j42 & j49);
            long zza11 = ((j44 | (j38 & j49) | (j50 << 26)) & 4294967295L) + zza(bArr3, 16);
            long j54 = zza11 & 4294967295L;
            long zza12 = (((j50 >> 6) | (j51 << 20)) & 4294967295L) + zza(bArr3, 20) + (zza11 >> 32);
            long j55 = zza12 & 4294967295L;
            long zza13 = (((j51 >> 12) | (j52 << 14)) & 4294967295L) + zza(bArr3, 24) + (zza12 >> 32);
            long j56 = zza13 & 4294967295L;
            byte[] bArr6 = new byte[16];
            zza(bArr6, j54, 0);
            zza(bArr6, j55, 4);
            zza(bArr6, j56, 8);
            zza(bArr6, ((((j52 >> 18) | (j53 << 8)) & 4294967295L) + zza(bArr3, 28) + (zza13 >> 32)) & 4294967295L, 12);
            return bArr6;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }
}
