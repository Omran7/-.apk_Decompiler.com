package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlr  reason: invalid package */
final class zzlr implements zzlq {
    private final zzjh zza;
    private final int zzb;

    public zzlr(zzjh zzjh) {
        this.zza = zzjh;
        this.zzb = zzjh.zzb();
    }

    public final int zza() {
        return this.zzb;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, int i2) {
        if (bArr2.length >= i2) {
            return zzyr.zza(zzja.zzc().zza(this.zza).zza(zzaaf.zza(bArr, zzbj.zza())).zza()).zza(Arrays.copyOfRange(bArr2, i2, bArr2.length), zzlm.zza);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
