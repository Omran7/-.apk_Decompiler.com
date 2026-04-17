package com.google.android.gms.internal.auth;

import sun.misc.Unsafe;

final class zzhg extends zzhh {
    public zzhg(Unsafe unsafe) {
        super(unsafe);
    }

    public final double zza(Object obj, long j6) {
        return Double.longBitsToDouble(zzj(obj, j6));
    }

    public final float zzb(Object obj, long j6) {
        return Float.intBitsToFloat(zzi(obj, j6));
    }

    public final void zzc(Object obj, long j6, boolean z3) {
        if (zzhi.zza) {
            zzhi.zzi(obj, j6, z3);
        } else {
            zzhi.zzj(obj, j6, z3);
        }
    }

    public final void zzd(Object obj, long j6, double d) {
        zzn(obj, j6, Double.doubleToLongBits(d));
    }

    public final void zze(Object obj, long j6, float f6) {
        zzm(obj, j6, Float.floatToIntBits(f6));
    }

    public final boolean zzf(Object obj, long j6) {
        if (zzhi.zza) {
            return zzhi.zzq(obj, j6);
        }
        return zzhi.zzr(obj, j6);
    }
}
