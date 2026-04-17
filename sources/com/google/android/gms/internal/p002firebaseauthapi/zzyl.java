package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzix;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyl  reason: invalid package */
public final class zzyl implements zzzu {
    private static final zzix.zza zza = zzix.zza.ALGORITHM_REQUIRES_BORINGCRYPTO;
    private static final ThreadLocal<Cipher> zzb = new zzyo();
    private final SecretKeySpec zzc;
    private final int zzd;
    private final int zze;

    public zzyl(byte[] bArr, int i2) {
        if (zza.zza()) {
            zzzz.zza(bArr.length);
            this.zzc = new SecretKeySpec(bArr, "AES");
            int blockSize = zzb.get().getBlockSize();
            this.zze = blockSize;
            if (i2 < 12 || i2 > blockSize) {
                throw new GeneralSecurityException("invalid IV size");
            }
            this.zzd = i2;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }

    private final void zza(byte[] bArr, int i2, int i5, byte[] bArr2, int i6, byte[] bArr3, boolean z3) {
        Cipher cipher = zzb.get();
        byte[] bArr4 = new byte[this.zze];
        System.arraycopy(bArr3, 0, bArr4, 0, this.zzd);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z3) {
            cipher.init(1, this.zzc, ivParameterSpec);
        } else {
            cipher.init(2, this.zzc, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i2, i5, bArr2, i6) != i5) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    public final byte[] zzb(byte[] bArr) {
        int length = bArr.length;
        int i2 = this.zzd;
        if (length <= f.API_PRIORITY_OTHER - i2) {
            byte[] bArr2 = new byte[(bArr.length + i2)];
            byte[] zza2 = zzqg.zza(i2);
            System.arraycopy(zza2, 0, bArr2, 0, this.zzd);
            zza(bArr, 0, bArr.length, bArr2, this.zzd, zza2, true);
            return bArr2;
        }
        throw new GeneralSecurityException(a.f(f.API_PRIORITY_OTHER - this.zzd, "plaintext length can not exceed "));
    }

    public final byte[] zza(byte[] bArr) {
        int length = bArr.length;
        int i2 = this.zzd;
        if (length >= i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            int length2 = bArr.length;
            int i5 = this.zzd;
            byte[] bArr3 = new byte[(length2 - i5)];
            zza(bArr, i5, bArr.length - i5, bArr3, 0, bArr2, false);
            return bArr3;
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
