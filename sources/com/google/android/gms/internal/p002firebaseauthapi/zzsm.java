package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsm  reason: invalid package */
public final class zzsm implements zzcb {
    private static final byte[] zza = {0};
    private final zzcb zzb;
    private final zzxu zzc;
    private final byte[] zzd;

    private zzsm(zzcb zzcb, zzxu zzxu, byte[] bArr) {
        this.zzb = zzcb;
        this.zzc = zzxu;
        this.zzd = bArr;
    }

    public static zzcb zza(zzoe zzoe) {
        byte[] bArr;
        zzqe zza2 = zzoe.zza(zzbj.zza());
        zzcb zzcb = (zzcb) zznt.zza().zza(zza2.zzf(), zzcb.class).zzb(zza2.zzd());
        zzxu zzc2 = zza2.zzc();
        int i2 = zzsp.zza[zzc2.ordinal()];
        if (i2 == 1) {
            bArr = zzpd.zza.zzb();
        } else if (i2 == 2 || i2 == 3) {
            bArr = zzpd.zza(zzoe.zzb().intValue()).zzb();
        } else if (i2 == 4) {
            bArr = zzpd.zzb(zzoe.zzb().intValue()).zzb();
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return new zzsm(zzcb, zzc2, bArr);
    }

    public final void zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 10) {
            if (this.zzc.equals(zzxu.LEGACY)) {
                bArr2 = zzyt.zza(bArr2, zza);
            }
            byte[] bArr3 = new byte[0];
            if (!this.zzc.equals(zzxu.RAW)) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                bArr = Arrays.copyOfRange(bArr, 5, bArr.length);
                bArr3 = copyOf;
            }
            if (Arrays.equals(this.zzd, bArr3)) {
                this.zzb.zza(bArr, bArr2);
                return;
            }
            throw new GeneralSecurityException("wrong prefix");
        }
        throw new GeneralSecurityException("tag too short");
    }

    public final byte[] zza(byte[] bArr) {
        if (this.zzc.equals(zzxu.LEGACY)) {
            bArr = zzyt.zza(bArr, zza);
        }
        return zzyt.zza(this.zzd, this.zzb.zza(bArr));
    }
}
