package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzgw {
    static final zzgw zza = new zzgw(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzgw zzd;
    private final Map zze;

    public zzgw() {
        this.zze = new HashMap();
    }

    public static zzgw zza() {
        zzgw zzgw = zzd;
        if (zzgw != null) {
            return zzgw;
        }
        synchronized (zzgw.class) {
            try {
                zzgw zzgw2 = zzd;
                if (zzgw2 != null) {
                    return zzgw2;
                }
                int i2 = zziu.zza;
                zzgw zzb2 = zzhe.zzb(zzgw.class);
                zzd = zzb2;
                return zzb2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzhj zzb(zzim zzim, int i2) {
        return (zzhj) this.zze.get(new zzgv(zzim, i2));
    }

    public zzgw(boolean z3) {
        this.zze = Collections.emptyMap();
    }
}
