package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

public final class zzcq {
    Object[] zza = new Object[8];
    int zzb = 0;
    zzcp zzc;

    public final zzcq zza(Object obj, Object obj2) {
        int i2 = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i5 = i2 + i2;
        if (i5 > length) {
            this.zza = Arrays.copyOf(objArr, zzci.zzc(length, i5));
        }
        zzbw.zzb(obj, obj2);
        Object[] objArr2 = this.zza;
        int i6 = this.zzb;
        int i7 = i6 + i6;
        objArr2[i7] = obj;
        objArr2[i7 + 1] = obj2;
        this.zzb = i6 + 1;
        return this;
    }

    public final zzcr zzb() {
        zzcp zzcp = this.zzc;
        if (zzcp == null) {
            zzdp zzg = zzdp.zzg(this.zzb, this.zza, this);
            zzcp zzcp2 = this.zzc;
            if (zzcp2 == null) {
                return zzg;
            }
            throw zzcp2.zza();
        }
        throw zzcp.zza();
    }
}
