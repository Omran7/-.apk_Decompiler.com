package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmo  reason: invalid package */
public final class zzmo implements zzbk {
    private zzmo(zzbk zzbk, byte[] bArr) {
    }

    public static zzbk zza(zzoe zzoe) {
        byte[] bArr;
        zzqe zza = zzoe.zza(zzbj.zza());
        zzbk zzbk = (zzbk) zznt.zza().zza(zza.zzf(), zzbk.class).zzb(zza.zzd());
        zzxu zzc = zza.zzc();
        int i2 = zzmr.zza[zzc.ordinal()];
        if (i2 == 1) {
            bArr = zzpd.zza.zzb();
        } else if (i2 == 2 || i2 == 3) {
            bArr = zzpd.zza(zzoe.zzb().intValue()).zzb();
        } else if (i2 == 4) {
            bArr = zzpd.zzb(zzoe.zzb().intValue()).zzb();
        } else {
            throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(zzc)));
        }
        return new zzmo(zzbk, bArr);
    }
}
