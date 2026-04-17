package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.measurement.a;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjy  reason: invalid package */
public final class zzjy implements zzbi {
    private final zzbi zza;
    private final zzxu zzb;
    private final byte[] zzc;

    private zzjy(zzbi zzbi, zzxu zzxu, byte[] bArr) {
        this.zza = zzbi;
        this.zzb = zzxu;
        this.zzc = bArr;
    }

    public static zzbi zza(zzoe zzoe) {
        byte[] bArr;
        zzqe zza2 = zzoe.zza(zzbj.zza());
        zzbi zzbi = (zzbi) zznt.zza().zza(zza2.zzf(), zzbi.class).zzb(zza2.zzd());
        zzxu zzc2 = zza2.zzc();
        int i2 = zzjx.zza[zzc2.ordinal()];
        if (i2 == 1) {
            bArr = zzpd.zza.zzb();
        } else if (i2 == 2 || i2 == 3) {
            bArr = zzpd.zza(zzoe.zzb().intValue()).zzb();
        } else if (i2 == 4) {
            bArr = zzpd.zzb(zzoe.zzb().intValue()).zzb();
        } else {
            throw new GeneralSecurityException(a.f(zzc2.zza(), "unknown output prefix type "));
        }
        return new zzjy(zzbi, zzc2, bArr);
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        if (this.zzb == zzxu.RAW) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzqq.zza(this.zzc, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
