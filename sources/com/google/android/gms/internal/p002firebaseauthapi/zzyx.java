package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyx  reason: invalid package */
public final class zzyx {
    private ECPrivateKey zza;

    public zzyx(ECPrivateKey eCPrivateKey) {
        this.zza = eCPrivateKey;
    }

    public final byte[] zza(byte[] bArr, String str, byte[] bArr2, byte[] bArr3, int i2, zzzb zzzb) {
        byte[] zza2 = zzyt.zza(bArr, zzyz.zza(this.zza, zzyz.zza(this.zza.getParams(), zzzb, bArr)));
        Mac zza3 = zzzd.zzb.zza(str);
        if (i2 <= zza3.getMacLength() * 255) {
            if (bArr2 == null || bArr2.length == 0) {
                zza3.init(new SecretKeySpec(new byte[zza3.getMacLength()], str));
            } else {
                zza3.init(new SecretKeySpec(bArr2, str));
            }
            byte[] bArr4 = new byte[i2];
            zza3.init(new SecretKeySpec(zza3.doFinal(zza2), str));
            byte[] bArr5 = new byte[0];
            int i5 = 1;
            int i6 = 0;
            while (true) {
                zza3.update(bArr5);
                zza3.update(bArr3);
                zza3.update((byte) i5);
                bArr5 = zza3.doFinal();
                if (bArr5.length + i6 < i2) {
                    System.arraycopy(bArr5, 0, bArr4, i6, bArr5.length);
                    i6 += bArr5.length;
                    i5++;
                } else {
                    System.arraycopy(bArr5, 0, bArr4, i6, i2 - i6);
                    return bArr4;
                }
            }
        } else {
            throw new GeneralSecurityException("size too large");
        }
    }
}
