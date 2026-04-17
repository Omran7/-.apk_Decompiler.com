package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhz  reason: invalid package */
public final class zzhz implements zzbe {
    private final zzbe zza;
    private final byte[] zzb;

    private zzhz(zzbe zzbe, byte[] bArr) {
        this.zza = zzbe;
        if (bArr.length == 0 || bArr.length == 5) {
            this.zzb = bArr;
            return;
        }
        throw new IllegalArgumentException("identifier has an invalid length");
    }

    public static zzbe zza(zzoe zzoe) {
        byte[] bArr;
        zzqe zza2 = zzoe.zza(zzbj.zza());
        zzbe zzbe = (zzbe) zznt.zza().zza(zza2.zzf(), zzbe.class).zzb(zza2.zzd());
        zzxu zzc = zza2.zzc();
        int i2 = zzic.zza[zzc.ordinal()];
        if (i2 == 1) {
            bArr = zzpd.zza.zzb();
        } else if (i2 == 2 || i2 == 3) {
            bArr = zzpd.zza(zzoe.zzb().intValue()).zzb();
        } else if (i2 == 4) {
            bArr = zzpd.zzb(zzoe.zzb().intValue()).zzb();
        } else {
            throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(zzc)));
        }
        return new zzhz(zzbe, bArr);
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zzb(bArr, bArr2);
        }
        return zzyt.zza(bArr3, this.zza.zzb(bArr, bArr2));
    }

    public static zzbe zza(zzbe zzbe, zzaae zzaae) {
        return new zzhz(zzbe, zzaae.zzb());
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzqq.zza(bArr3, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
