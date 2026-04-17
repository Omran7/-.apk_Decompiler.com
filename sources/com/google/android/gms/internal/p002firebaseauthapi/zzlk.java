package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.measurement.a;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlk  reason: invalid package */
final class zzlk implements zzmb {
    private final int zza;

    public zzlk(int i2) {
        if (i2 == 16 || i2 == 32) {
            this.zza = i2;
            return;
        }
        throw new InvalidAlgorithmParameterException(a.f(i2, "Unsupported key length: "));
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return 12;
    }

    public final byte[] zzc() {
        int i2 = this.zza;
        if (i2 == 16) {
            return zzmn.zzi;
        }
        if (i2 == 32) {
            return zzmn.zzj;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, byte[] bArr4) {
        if (bArr.length == this.zza) {
            return new zzhr(bArr).zza(bArr2, bArr3, i2, bArr4);
        }
        throw new InvalidAlgorithmParameterException(a.f(bArr.length, "Unexpected key length: "));
    }
}
