package com.google.android.gms.internal.measurement;

import h0.C0552a;
import java.util.List;
import o3.d;

public final class zzbj extends zzaw {
    public final zzap zza(String str, zzg zzg, List list) {
        if (str == null || str.isEmpty() || !zzg.zzh(str)) {
            throw new IllegalArgumentException(d.i("Command not found: ", str));
        }
        zzap zzd = zzg.zzd(str);
        if (zzd instanceof zzai) {
            return ((zzai) zzd).zza(zzg, list);
        }
        throw new IllegalArgumentException(C0552a.o("Function ", str, " is not defined"));
    }
}
