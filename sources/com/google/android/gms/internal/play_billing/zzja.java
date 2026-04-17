package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.List;
import java.util.Map;

final class zzja extends zzjf {
    public zzja() {
        super((zzje) null);
    }

    public final void zza() {
        if (!zzj()) {
            for (int i2 = 0; i2 < zzc(); i2++) {
                Map.Entry zzg = zzg(i2);
                if (((zzha) ((zzjb) zzg).zza()).zze()) {
                    zzg.setValue(Collections.unmodifiableList((List) zzg.getValue()));
                }
            }
            for (Map.Entry entry : zzd()) {
                if (((zzha) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
