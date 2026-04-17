package com.google.android.gms.internal.fido;

import java.util.Iterator;

final class zzbt extends zzbc {
    static final zzbt zza;
    private static final Object[] zzd;
    final transient Object[] zzb;
    final transient Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        Object[] objArr = new Object[0];
        zzd = objArr;
        zza = new zzbt(objArr, 0, objArr, 0, 0);
    }

    public zzbt(Object[] objArr, int i2, Object[] objArr2, int i5, int i6) {
        this.zzb = objArr;
        this.zze = i2;
        this.zzc = objArr2;
        this.zzf = i5;
        this.zzg = i6;
    }

    public final boolean contains(Object obj) {
        Object[] objArr = this.zzc;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int zza2 = zzau.zza(obj.hashCode());
        while (true) {
            int i2 = zza2 & this.zzf;
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            zza2 = i2 + 1;
        }
    }

    public final int hashCode() {
        return this.zze;
    }

    public final /* synthetic */ Iterator iterator() {
        return zzi().listIterator(0);
    }

    public final int size() {
        return this.zzg;
    }

    public final int zza(Object[] objArr, int i2) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzg);
        return this.zzg;
    }

    public final int zzb() {
        return this.zzg;
    }

    public final int zzc() {
        return 0;
    }

    public final zzcb zzd() {
        return zzi().listIterator(0);
    }

    public final Object[] zze() {
        return this.zzb;
    }

    public final boolean zzg() {
        return true;
    }

    public final zzaz zzj() {
        return zzaz.zzh(this.zzb, this.zzg);
    }
}
