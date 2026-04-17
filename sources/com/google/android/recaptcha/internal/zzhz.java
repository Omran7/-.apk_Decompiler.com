package com.google.android.recaptcha.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import n5.C0875g;

public final class zzhz implements zzhx {
    private final zzhy zza;

    public zzhz(zzhy zzhy, zzhw zzhw) {
        this.zza = zzhy;
    }

    private final zztz zzb(String str, List list) {
        if (str.length() != 0) {
            try {
                zzhv zzhv = new zzhv(this.zza.zza(C0875g.a1(list)), 255, zzhv.zza);
                StringBuilder sb = new StringBuilder(str.length());
                for (int i2 = 0; i2 < str.length(); i2++) {
                    sb.append((char) (str.charAt(i2) ^ ((int) zzhv.zza())));
                }
                return zztz.zzg(zzkh.zzh().zzj(sb.toString()));
            } catch (Exception e6) {
                throw new zzce(3, 18, e6);
            }
        } else {
            throw new zzce(3, 17, (Throwable) null);
        }
    }

    public final zztz zza(zzub zzub) {
        zzjh zzb = zzjh.zzb();
        zztz zzb2 = zzb(zzub.zzj(), zzub.zzk());
        zzb.zzf();
        long zza2 = zzb.zza(TimeUnit.MICROSECONDS);
        int i2 = zzbk.zza;
        zzbk.zza(zzbl.zzh.zza(), zza2);
        return zzb2;
    }
}
