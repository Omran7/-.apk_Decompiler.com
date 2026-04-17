package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

final class zzoi extends zzok {
    public zzoi(Unsafe unsafe) {
        super(unsafe);
    }

    public final double zza(Object obj, long j6) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j6));
    }

    public final float zzb(Object obj, long j6) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j6));
    }

    public final void zzc(Object obj, long j6, boolean z3) {
        if (zzol.zzb) {
            zzol.zzD(obj, j6, r3 ? (byte) 1 : 0);
        } else {
            zzol.zzE(obj, j6, r3 ? (byte) 1 : 0);
        }
    }

    public final void zzd(Object obj, long j6, byte b6) {
        if (zzol.zzb) {
            zzol.zzD(obj, j6, b6);
        } else {
            zzol.zzE(obj, j6, b6);
        }
    }

    public final void zze(Object obj, long j6, double d) {
        this.zza.putLong(obj, j6, Double.doubleToLongBits(d));
    }

    public final void zzf(Object obj, long j6, float f6) {
        this.zza.putInt(obj, j6, Float.floatToIntBits(f6));
    }

    public final boolean zzg(Object obj, long j6) {
        if (zzol.zzb) {
            return zzol.zzt(obj, j6);
        }
        return zzol.zzu(obj, j6);
    }
}
