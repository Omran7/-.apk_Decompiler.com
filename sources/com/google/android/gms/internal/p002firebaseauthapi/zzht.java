package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.measurement.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzht  reason: invalid package */
abstract class zzht {
    int[] zza;
    private final int zzb;

    public zzht(byte[] bArr, int i2) {
        if (bArr.length == 32) {
            this.zza = zzhs.zza(bArr);
            this.zzb = i2;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    public abstract int zza();

    public final ByteBuffer zza(byte[] bArr, int i2) {
        int[] zza2 = zza(zzhs.zza(bArr), i2);
        int[] iArr = (int[]) zza2.clone();
        zzhs.zza(iArr);
        for (int i5 = 0; i5 < zza2.length; i5++) {
            zza2[i5] = zza2[i5] + iArr[i5];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(zza2, 0, 16);
        return order;
    }

    public abstract int[] zza(int[] iArr, int i2);

    public void zza(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() >= bArr2.length) {
            zza(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    private final void zza(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (bArr.length == zza()) {
            int remaining = byteBuffer2.remaining();
            int i2 = remaining / 64;
            int i5 = i2 + 1;
            for (int i6 = 0; i6 < i5; i6++) {
                ByteBuffer zza2 = zza(bArr, this.zzb + i6);
                if (i6 == i2) {
                    zzyt.zza(byteBuffer, byteBuffer2, zza2, remaining % 64);
                } else {
                    zzyt.zza(byteBuffer, byteBuffer2, zza2, 64);
                }
            }
            return;
        }
        throw new GeneralSecurityException(a.f(zza(), "The nonce length (in bytes) must be "));
    }

    public byte[] zza(byte[] bArr, ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        zza(bArr, allocate, byteBuffer);
        return allocate.array();
    }
}
