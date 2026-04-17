package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyt  reason: invalid package */
public final class zzyt {
    public static final void zza(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i2) {
        if (i2 < 0 || byteBuffer2.remaining() < i2 || byteBuffer3.remaining() < i2 || byteBuffer.remaining() < i2) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i5 = 0; i5 < i2; i5++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static byte[] zza(byte[]... bArr) {
        int length = bArr.length;
        int i2 = 0;
        int i5 = 0;
        while (i2 < length) {
            byte[] bArr2 = bArr[i2];
            if (i5 <= f.API_PRIORITY_OTHER - bArr2.length) {
                i5 += bArr2.length;
                i2++;
            } else {
                throw new GeneralSecurityException("exceeded size limit");
            }
        }
        byte[] bArr3 = new byte[i5];
        int i6 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, i6, bArr4.length);
            i6 += bArr4.length;
        }
        return bArr3;
    }

    public static final byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return zza(bArr, 0, bArr2, 0, bArr.length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static final byte[] zza(byte[] bArr, int i2, byte[] bArr2, int i5, int i6) {
        if (i6 < 0 || bArr.length - i6 < i2 || bArr2.length - i6 < 0) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            bArr3[i7] = (byte) (bArr[i7 + i2] ^ bArr2[i7]);
        }
        return bArr3;
    }
}
