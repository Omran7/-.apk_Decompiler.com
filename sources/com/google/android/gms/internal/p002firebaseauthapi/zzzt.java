package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzix;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzt  reason: invalid package */
public final class zzzt implements zzso {
    private static final zzix.zza zza = zzix.zza.ALGORITHM_NOT_FIPS;
    private static final ThreadLocal<Cipher> zzb = new zzzw();
    private final SecretKey zzc;
    private byte[] zzd;
    private byte[] zze;

    public zzzt(byte[] bArr) {
        zzzz.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zzc = secretKeySpec;
        Cipher zza2 = zza();
        zza2.init(1, secretKeySpec);
        byte[] zzb2 = zzse.zzb(zza2.doFinal(new byte[16]));
        this.zzd = zzb2;
        this.zze = zzse.zzb(zzb2);
    }

    private static Cipher zza() {
        if (zza.zza()) {
            return zzb.get();
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    private static void zza(byte[] bArr, byte[] bArr2, int i2, byte[] bArr3) {
        for (int i5 = 0; i5 < 16; i5++) {
            bArr3[i5] = (byte) (bArr[i5] ^ bArr2[i5 + i2]);
        }
    }

    public final byte[] zza(byte[] bArr, int i2) {
        int i5;
        byte[] bArr2;
        if (i2 <= 16) {
            Cipher zza2 = zza();
            zza2.init(1, this.zzc);
            int length = bArr.length;
            if (length == 0) {
                i5 = 1;
            } else {
                i5 = ((length - 1) / 16) + 1;
            }
            if ((i5 << 4) == bArr.length) {
                bArr2 = zzyt.zza(bArr, (i5 - 1) << 4, this.zzd, 0, 16);
            } else {
                bArr2 = zzyt.zza(zzse.zza(Arrays.copyOfRange(bArr, (i5 - 1) << 4, bArr.length)), this.zze);
            }
            byte[] bArr3 = new byte[16];
            byte[] bArr4 = new byte[16];
            int i6 = 0;
            while (i6 < i5 - 1) {
                zza(bArr3, bArr, i6 << 4, bArr4);
                if (zza2.doFinal(bArr4, 0, 16, bArr3) == 16) {
                    i6++;
                } else {
                    throw new IllegalStateException("Cipher didn't write full block");
                }
            }
            zza(bArr3, bArr2, 0, bArr4);
            if (zza2.doFinal(bArr4, 0, 16, bArr3) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            } else if (16 == i2) {
                return bArr3;
            } else {
                return Arrays.copyOf(bArr3, i2);
            }
        } else {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
    }
}
