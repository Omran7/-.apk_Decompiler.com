package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgu  reason: invalid package */
public final class zzgu {
    private static final ThreadLocal<Cipher> zza = new zzgt();

    public static AlgorithmParameterSpec zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static SecretKey zzb(byte[] bArr) {
        zzzz.zza(bArr.length);
        return new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec zza(byte[] bArr, int i2, int i5) {
        Integer zzb = zzqq.zzb();
        if (zzb == null || zzb.intValue() > 19) {
            return new GCMParameterSpec(128, bArr, i2, i5);
        }
        return new IvParameterSpec(bArr, i2, i5);
    }

    public static Cipher zza() {
        return zza.get();
    }
}
