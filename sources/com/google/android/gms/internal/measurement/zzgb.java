package com.google.android.gms.internal.measurement;

public final class zzgb extends zzmd implements zzni {
    /* access modifiers changed from: private */
    public static final zzgb zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzgb zzgb = new zzgb();
        zzb = zzgb;
        zzmd.zzct(zzgb.class, zzgb);
    }

    private zzgb() {
    }

    public final int zzb() {
        int zza = zzgf.zza(this.zzf);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzc() {
        int zza = zzgf.zza(this.zze);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final Object zzl(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            zzmg zzmg = zzge.zza;
            return zzmd.zzcq(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", zzmg, "zzf", zzmg});
        } else if (i5 == 3) {
            return new zzgb();
        } else {
            if (i5 == 4) {
                return new zzga((zzgz) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            throw null;
        }
    }
}
