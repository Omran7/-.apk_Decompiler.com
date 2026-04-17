package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhs  reason: invalid package */
final class zzhs {
    private static final int[] zza = zza(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    private static int zza(int i2, int i5) {
        return (i2 >>> (-i5)) | (i2 << i5);
    }

    public static int[] zzb(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        zza(iArr3, iArr);
        iArr3[12] = iArr2[0];
        iArr3[13] = iArr2[1];
        iArr3[14] = iArr2[2];
        iArr3[15] = iArr2[3];
        zza(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        return Arrays.copyOf(iArr3, 8);
    }

    private static void zza(int[] iArr, int i2, int i5, int i6, int i7) {
        int i8 = iArr[i2] + iArr[i5];
        iArr[i2] = i8;
        int zza2 = zza(i8 ^ iArr[i7], 16);
        iArr[i7] = zza2;
        int i9 = iArr[i6] + zza2;
        iArr[i6] = i9;
        int zza3 = zza(iArr[i5] ^ i9, 12);
        iArr[i5] = zza3;
        int i10 = iArr[i2] + zza3;
        iArr[i2] = i10;
        int zza4 = zza(iArr[i7] ^ i10, 8);
        iArr[i7] = zza4;
        int i11 = iArr[i6] + zza4;
        iArr[i6] = i11;
        iArr[i5] = zza(iArr[i5] ^ i11, 7);
    }

    public static void zza(int[] iArr, int[] iArr2) {
        int[] iArr3 = zza;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    public static void zza(int[] iArr) {
        int[] iArr2 = iArr;
        for (int i2 = 0; i2 < 10; i2++) {
            zza(iArr2, 0, 4, 8, 12);
            zza(iArr2, 1, 5, 9, 13);
            zza(iArr2, 2, 6, 10, 14);
            zza(iArr2, 3, 7, 11, 15);
            zza(iArr2, 0, 5, 10, 15);
            zza(iArr2, 1, 6, 11, 12);
            zza(iArr2, 2, 7, 8, 13);
            zza(iArr2, 3, 4, 9, 14);
        }
    }

    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        int[] zzb = zzb(zza(bArr), zza(bArr2));
        ByteBuffer order = ByteBuffer.allocate(zzb.length << 2).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(zzb);
        return order.array();
    }

    public static int[] zza(byte[] bArr) {
        if (bArr.length % 4 == 0) {
            IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
            int[] iArr = new int[asIntBuffer.remaining()];
            asIntBuffer.get(iArr);
            return iArr;
        }
        throw new IllegalArgumentException("invalid input length");
    }
}
