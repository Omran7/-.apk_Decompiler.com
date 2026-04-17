package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmq  reason: invalid package */
final class zzmq implements zzme {
    private final zzzc zza;
    private final zzly zzb;

    private zzmq(zzly zzly, zzzc zzzc) {
        this.zzb = zzly;
        this.zza = zzzc;
    }

    public static zzmq zza(zzzc zzzc) {
        int i2 = zzmt.zza[zzzc.ordinal()];
        if (i2 == 1) {
            return new zzmq(new zzly("HmacSha256"), zzzc.NIST_P256);
        }
        if (i2 == 2) {
            return new zzmq(new zzly("HmacSha384"), zzzc.NIST_P384);
        }
        if (i2 == 3) {
            return new zzmq(new zzly("HmacSha512"), zzzc.NIST_P521);
        }
        throw new GeneralSecurityException("invalid curve type: ".concat(String.valueOf(zzzc)));
    }

    public final byte[] zza(byte[] bArr, zzmh zzmh) {
        ECPrivateKey zza2 = zzyz.zza(this.zza, zzmh.zza().zzb());
        zzzc zzzc = this.zza;
        byte[] zza3 = zzyz.zza(zza2, zzyz.zza(zzyz.zza(zzzc), zzzb.UNCOMPRESSED, bArr));
        byte[] zza4 = zzyt.zza(bArr, zzmh.zzb().zzb());
        byte[] zza5 = zzmn.zza(zza());
        zzly zzly = this.zzb;
        return zzly.zza((byte[]) null, zza3, "eae_prk", zza4, "shared_secret", zza5, zzly.zza());
    }

    public final byte[] zza() {
        int i2 = zzmt.zza[this.zza.ordinal()];
        if (i2 == 1) {
            return zzmn.zzc;
        }
        if (i2 == 2) {
            return zzmn.zzd;
        }
        if (i2 == 3) {
            return zzmn.zze;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
