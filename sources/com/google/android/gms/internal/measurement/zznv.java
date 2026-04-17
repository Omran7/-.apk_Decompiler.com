package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

final class zznv extends zzoa {
    public zznv() {
        super((zznz) null);
    }

    public final void zza() {
        if (!zzj()) {
            for (int i2 = 0; i2 < zzc(); i2++) {
                Map.Entry zzg = zzg(i2);
                if (((zzlt) ((zznw) zzg).zza()).zze()) {
                    zzg.setValue(Collections.unmodifiableList((List) zzg.getValue()));
                }
            }
            for (Map.Entry entry : zzd()) {
                if (((zzlt) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
