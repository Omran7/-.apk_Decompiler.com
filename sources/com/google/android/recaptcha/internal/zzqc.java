package com.google.android.recaptcha.internal;

import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;

public final class zzqc {
    protected static final Charset zza = StandardCharsets.UTF_16;
    protected int[] zzb;
    protected int[] zzc;
    private final int[] zzd = {511133343, 1277647508, 107287496, 338123662};
    private byte[] zze;
    private byte[] zzf;
    private int zzg;

    public zzqc() {
    }

    public static int zza(int i2, int i5) {
        if (i2 % 2 != 0) {
            return (i2 | i5) - (i2 & i5);
        }
        return ((~i2) & i5) | ((~i5) & i2);
    }

    public static String zze(String str, byte[] bArr, zzqd zzqd) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr2 = new byte[12];
        int length = decode.length - 12;
        byte[] bArr3 = new byte[length];
        System.arraycopy(decode, 0, bArr2, 0, 12);
        System.arraycopy(decode, 12, bArr3, 0, length);
        return new String(new zzqc(bArr, bArr2).zzd(bArr3), zza);
    }

    public static String zzf(String str, byte[] bArr, zzqd zzqd) {
        byte[] bArr2 = new byte[12];
        new SecureRandom().nextBytes(bArr2);
        byte[] zzd2 = new zzqc(bArr, bArr2).zzd(str.getBytes(zza));
        int length = zzd2.length;
        byte[] bArr3 = new byte[(length + 12)];
        System.arraycopy(bArr2, 0, bArr3, 0, 12);
        System.arraycopy(zzd2, 0, bArr3, 12, length);
        return Base64.encodeToString(bArr3, 2);
    }

    private static final int zzg(byte[] bArr, int i2) {
        int i5 = (bArr[i2 + 1] & 255) << 8;
        return ((bArr[i2 + 3] & 255) << 24) | i5 | (bArr[i2] & 255) | ((bArr[i2 + 2] & 255) << 16);
    }

    public final void zzb(int i2, int i5, int i6, int i7) {
        zzc(i2, i5, i7, 16);
        zzc(i6, i7, i5, 12);
        zzc(i2, i5, i7, 8);
        zzc(i6, i7, i5, 7);
    }

    public final void zzc(int i2, int i5, int i6, int i7) {
        int[] iArr = this.zzb;
        int i8 = iArr[i2] + iArr[i5];
        iArr[i2] = i8;
        int zza2 = zza(iArr[i6], i8);
        iArr[i6] = zza2;
        iArr[i6] = (zza2 << i7) | (zza2 >>> (32 - i7));
    }

    public final byte[] zzd(byte[] bArr) {
        byte[] bArr2 = bArr;
        if (this.zzg == 1) {
            int length = bArr2.length;
            byte[] bArr3 = new byte[length];
            int i2 = 0;
            while (length > 0) {
                int[] iArr = this.zzc;
                int[] iArr2 = this.zzb;
                int length2 = iArr.length;
                System.arraycopy(iArr, 0, iArr2, 0, 16);
                this.zzb[12] = this.zzg;
                for (int i5 = 0; i5 < 10; i5++) {
                    zzb(0, 4, 8, 12);
                    zzb(1, 5, 9, 13);
                    zzb(2, 6, 10, 14);
                    zzb(3, 7, 11, 15);
                    zzb(0, 5, 10, 15);
                    zzb(1, 6, 11, 12);
                    zzb(2, 7, 8, 13);
                    zzb(3, 4, 9, 14);
                }
                byte[] bArr4 = new byte[64];
                for (int i6 = 0; i6 < 16; i6++) {
                    int i7 = this.zzb[i6];
                    int i8 = i6 * 4;
                    bArr4[i8] = (byte) (i7 & 255);
                    bArr4[i8 + 1] = (byte) ((i7 >> 8) & 255);
                    bArr4[i8 + 2] = (byte) ((i7 >> 16) & 255);
                    bArr4[i8 + 3] = (byte) ((i7 >> 24) & 255);
                }
                for (int i9 = 0; i9 < Math.min(64, length); i9++) {
                    int i10 = i2 + i9;
                    bArr3[i10] = (byte) zza(bArr4[i9], bArr2[i10]);
                }
                this.zzg++;
                length -= 64;
                i2 += 64;
            }
            return bArr3;
        }
        throw new IllegalStateException();
    }

    public zzqc(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            this.zze = bArr;
            this.zzg = 1;
            this.zzf = bArr2;
            this.zzb = new int[16];
            for (int i2 = 0; i2 < 4; i2++) {
                this.zzb[i2] = zza(this.zzd[i2], 2131181306);
            }
            for (int i5 = 4; i5 < 12; i5++) {
                this.zzb[i5] = zzg(this.zze, (i5 - 4) * 4);
            }
            this.zzb[12] = this.zzg;
            for (int i6 = 13; i6 < 16; i6++) {
                this.zzb[i6] = zzg(this.zzf, (i6 - 13) * 4);
            }
            int[] iArr = new int[16];
            this.zzc = iArr;
            int[] iArr2 = this.zzb;
            int length = iArr2.length;
            System.arraycopy(iArr2, 0, iArr, 0, 16);
            return;
        }
        throw new IllegalArgumentException();
    }
}
