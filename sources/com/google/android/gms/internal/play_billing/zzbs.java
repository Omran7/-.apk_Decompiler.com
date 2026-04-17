package com.google.android.gms.internal.play_billing;

import java.util.Objects;
import java.util.function.Function;

public final /* synthetic */ class zzbs implements Function {
    public final Object apply(Object obj) {
        zzcu zzcu = (zzcu) obj;
        int i2 = zzcu.zzb;
        if (i2 == 0) {
            return zzdq.zza;
        }
        if (i2 != 1) {
            zzcv zzj = zzcv.zzl(i2, zzcu.zza);
            zzcu.zzb = zzj.size();
            zzcu.zzc = true;
            return zzj;
        }
        Object obj2 = zzcu.zza[0];
        Objects.requireNonNull(obj2);
        return new zzdt(obj2);
    }
}
