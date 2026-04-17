package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzie extends zzmd implements zzni {
    /* access modifiers changed from: private */
    public static final zzie zzb;
    private int zzd;
    private int zze;
    private zzmi zzf = zzmd.zzcl();

    static {
        zzie zzie = new zzie();
        zzb = zzie;
        zzmd.zzct(zzie.class, zzie);
    }

    private zzie() {
    }

    public static zzid zzd() {
        return (zzid) zzb.zzcg();
    }

    public static /* synthetic */ void zzg(zzie zzie, Iterable iterable) {
        zzmi zzmi = zzie.zzf;
        if (!zzmi.zzc()) {
            zzie.zzf = zzmd.zzcm(zzmi);
        }
        zzko.zzcc(iterable, zzie.zzf);
    }

    public static /* synthetic */ void zzh(zzie zzie, int i2) {
        zzie.zzd |= 1;
        zzie.zze = i2;
    }

    public final int zza() {
        return this.zzf.size();
    }

    public final int zzb() {
        return this.zze;
    }

    public final long zzc(int i2) {
        return this.zzf.zza(i2);
    }

    public final List zzf() {
        return this.zzf;
    }

    public final boolean zzi() {
        return (this.zzd & 1) != 0;
    }

    public final Object zzl(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzmd.zzcq(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzd", "zze", "zzf"});
        } else if (i5 == 3) {
            return new zzie();
        } else {
            if (i5 == 4) {
                return new zzid((zzip) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            throw null;
        }
    }
}
