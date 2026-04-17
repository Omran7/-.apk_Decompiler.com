package com.google.android.gms.internal.fido;

public final class zzcl {
    public static byte[] zza(byte[]... bArr) {
        int i2 = 0;
        int i5 = 0;
        while (true) {
            if (i2 >= r3) {
                break;
            }
            i5 += bArr[i2].length;
            i2++;
        }
        byte[] bArr2 = new byte[i5];
        int i6 = 0;
        for (byte[] bArr3 : bArr) {
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i6, length);
            i6 += length;
        }
        return bArr2;
    }
}
