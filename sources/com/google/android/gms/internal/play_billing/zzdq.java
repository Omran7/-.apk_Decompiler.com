package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

final class zzdq extends zzcv {
    static final zzdq zza;
    private static final Object[] zzd;
    final transient Object[] zzb;
    final transient Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        Object[] objArr = new Object[0];
        zzd = objArr;
        zza = new zzdq(objArr, 0, objArr, 0, 0);
    }

    public zzdq(Object[] objArr, int i2, Object[] objArr2, int i5, int i6) {
        this.zzb = objArr;
        this.zze = i2;
        this.zzc = objArr2;
        this.zzf = i5;
        this.zzg = i6;
    }

    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.zzc;
            if (objArr.length != 0) {
                int zza2 = zzcg.zza(obj.hashCode());
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
        }
        return false;
    }

    public final int hashCode() {
        return this.zze;
    }

    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
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

    public final zzdw zze() {
        return zzd().listIterator(0);
    }

    public final boolean zzf() {
        throw null;
    }

    public final Object[] zzg() {
        return this.zzb;
    }

    public final zzco zzi() {
        return zzco.zzj(this.zzb, this.zzg);
    }

    public final boolean zzk() {
        return true;
    }
}
