package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmm  reason: invalid package */
public final class zzmm implements zzbh {
    private final zzbh zza;
    private final byte[] zzb;

    private zzmm(zzbh zzbh, byte[] bArr) {
        this.zza = zzbh;
        this.zzb = bArr;
    }

    public static zzbh zza(zzoe zzoe) {
        byte[] bArr;
        zzqe zza2 = zzoe.zza(zzbj.zza());
        zzbh zzbh = (zzbh) zznt.zza().zza(zza2.zzf(), zzbh.class).zzb(zza2.zzd());
        zzxu zzc = zza2.zzc();
        int i2 = zzmp.zza[zzc.ordinal()];
        if (i2 == 1) {
            bArr = zzpd.zza.zzb();
        } else if (i2 == 2 || i2 == 3) {
            bArr = zzpd.zza(zzoe.zzb().intValue()).zzb();
        } else if (i2 == 4) {
            bArr = zzpd.zzb(zzoe.zzb().intValue()).zzb();
        } else {
            throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(zzc)));
        }
        return new zzmm(zzbh, bArr);
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzqq.zza(bArr3, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, this.zzb.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
    }
}
