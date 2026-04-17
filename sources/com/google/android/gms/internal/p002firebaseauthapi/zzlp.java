package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlp  reason: invalid package */
final class zzlp implements zzlq {
    private final zzdk zza;
    private final int zzb;

    public zzlp(zzdk zzdk) {
        this.zza = zzdk;
        this.zzb = zzdk.zzc() + zzdk.zzb();
    }

    public final int zza() {
        return this.zzb;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, int i2) {
        if (bArr2.length >= i2) {
            return zzze.zza(zzdd.zze().zza(this.zza).zza(zzaaf.zza(Arrays.copyOf(bArr, this.zza.zzb()), zzbj.zza())).zzb(zzaaf.zza(Arrays.copyOfRange(bArr, this.zza.zzb(), this.zza.zzc() + this.zza.zzb()), zzbj.zza())).zza()).zza(Arrays.copyOfRange(bArr2, i2, bArr2.length), zzlm.zza);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
