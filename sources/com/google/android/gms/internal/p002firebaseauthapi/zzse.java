package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzse  reason: invalid package */
public final class zzse {
    public static byte[] zza(byte[] bArr) {
        if (bArr.length < 16) {
            byte[] copyOf = Arrays.copyOf(bArr, 16);
            copyOf[bArr.length] = Byte.MIN_VALUE;
            return copyOf;
        }
        throw new IllegalArgumentException("x must be smaller than a block.");
    }

    public static byte[] zzb(byte[] bArr) {
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[16];
            for (int i2 = 0; i2 < 16; i2++) {
                byte b6 = (byte) ((bArr[i2] << 1) & 254);
                bArr2[i2] = b6;
                if (i2 < 15) {
                    bArr2[i2] = (byte) (((byte) ((bArr[i2 + 1] >> 7) & 1)) | b6);
                }
            }
            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
            return bArr2;
        }
        throw new IllegalArgumentException("value must be a block.");
    }
}
