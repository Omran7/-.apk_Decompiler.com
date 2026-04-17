package com.google.android.gms.internal.auth;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

abstract class zzhh {
    final Unsafe zza;

    public zzhh(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract double zza(Object obj, long j6);

    public abstract float zzb(Object obj, long j6);

    public abstract void zzc(Object obj, long j6, boolean z3);

    public abstract void zzd(Object obj, long j6, double d);

    public abstract void zze(Object obj, long j6, float f6);

    public abstract boolean zzf(Object obj, long j6);

    public final int zzg(Class cls) {
        return this.zza.arrayBaseOffset(cls);
    }

    public final int zzh(Class cls) {
        return this.zza.arrayIndexScale(cls);
    }

    public final int zzi(Object obj, long j6) {
        return this.zza.getInt(obj, j6);
    }

    public final long zzj(Object obj, long j6) {
        return this.zza.getLong(obj, j6);
    }

    public final long zzk(Field field) {
        return this.zza.objectFieldOffset(field);
    }

    public final Object zzl(Object obj, long j6) {
        return this.zza.getObject(obj, j6);
    }

    public final void zzm(Object obj, long j6, int i2) {
        this.zza.putInt(obj, j6, i2);
    }

    public final void zzn(Object obj, long j6, long j7) {
        this.zza.putLong(obj, j6, j7);
    }

    public final void zzo(Object obj, long j6, Object obj2) {
        this.zza.putObject(obj, j6, obj2);
    }
}
