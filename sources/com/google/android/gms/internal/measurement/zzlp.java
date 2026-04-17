package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzlp {
    static final zzlp zza = new zzlp(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzlp zzd;
    private final Map zze;

    public zzlp() {
        this.zze = new HashMap();
    }

    public static zzlp zza() {
        zzlp zzlp = zzd;
        if (zzlp != null) {
            return zzlp;
        }
        synchronized (zzlp.class) {
            try {
                zzlp zzlp2 = zzd;
                if (zzlp2 != null) {
                    return zzlp2;
                }
                int i2 = zznp.zza;
                zzlp zzb2 = zzlx.zzb(zzlp.class);
                zzd = zzb2;
                return zzb2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzmc zzb(zznh zznh, int i2) {
        return (zzmc) this.zze.get(new zzlo(zznh, i2));
    }

    public zzlp(boolean z3) {
        this.zze = Collections.emptyMap();
    }
}
