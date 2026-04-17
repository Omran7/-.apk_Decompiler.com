package com.google.android.gms.internal.auth;

import h0.C0552a;
import java.util.Arrays;
import java.util.RandomAccess;

final class zzgf extends zzdq implements RandomAccess {
    private static final zzgf zza;
    private Object[] zzb;
    private int zzc;

    static {
        zzgf zzgf = new zzgf(new Object[0], 0);
        zza = zzgf;
        zzgf.zzb();
    }

    public zzgf() {
        this(new Object[10], 0);
    }

    public static zzgf zze() {
        return zza;
    }

    private final String zzf(int i2) {
        return C0552a.l("Index:", i2, this.zzc, ", Size:");
    }

    private final void zzg(int i2) {
        if (i2 < 0 || i2 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i2));
        }
    }

    public final void add(int i2, Object obj) {
        int i5;
        zza();
        if (i2 < 0 || i2 > (i5 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i2));
        }
        Object[] objArr = this.zzb;
        if (i5 < objArr.length) {
            System.arraycopy(objArr, i2, objArr, i2 + 1, i5 - i2);
        } else {
            Object[] objArr2 = new Object[C0552a.h(i5, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i2);
            System.arraycopy(this.zzb, i2, objArr2, i2 + 1, this.zzc - i2);
            this.zzb = objArr2;
        }
        this.zzb[i2] = obj;
        this.zzc++;
        this.modCount++;
    }

    public final Object get(int i2) {
        zzg(i2);
        return this.zzb[i2];
    }

    public final Object remove(int i2) {
        zza();
        zzg(i2);
        Object[] objArr = this.zzb;
        Object obj = objArr[i2];
        int i5 = this.zzc;
        if (i2 < i5 - 1) {
            System.arraycopy(objArr, i2 + 1, objArr, i2, (i5 - i2) - 1);
        }
        this.zzc--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i2, Object obj) {
        zza();
        zzg(i2);
        Object[] objArr = this.zzb;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.zzc;
    }

    public final /* bridge */ /* synthetic */ zzey zzd(int i2) {
        if (i2 >= this.zzc) {
            return new zzgf(Arrays.copyOf(this.zzb, i2), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    private zzgf(Object[] objArr, int i2) {
        this.zzb = objArr;
        this.zzc = i2;
    }

    public final boolean add(Object obj) {
        zza();
        int i2 = this.zzc;
        Object[] objArr = this.zzb;
        if (i2 == objArr.length) {
            this.zzb = Arrays.copyOf(objArr, ((i2 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.zzb;
        int i5 = this.zzc;
        this.zzc = i5 + 1;
        objArr2[i5] = obj;
        this.modCount++;
        return true;
    }
}
