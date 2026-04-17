package com.google.android.gms.internal.play_billing;

import h0.C0552a;
import java.util.Arrays;
import java.util.RandomAccess;

final class zziv extends zzfx implements RandomAccess {
    private static final Object[] zza;
    private static final zziv zzb;
    private Object[] zzc;
    private int zzd;

    static {
        Object[] objArr = new Object[0];
        zza = objArr;
        zzb = new zziv(objArr, 0, false);
    }

    public zziv() {
        this(zza, 0, true);
    }

    public static zziv zze() {
        return zzb;
    }

    private static int zzg(int i2) {
        return C0552a.i(i2, 3, 2, 1, 10);
    }

    private final String zzh(int i2) {
        return C0552a.l("Index:", i2, this.zzd, ", Size:");
    }

    private final void zzi(int i2) {
        if (i2 < 0 || i2 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzh(i2));
        }
    }

    public final void add(int i2, Object obj) {
        int i5;
        zza();
        if (i2 < 0 || i2 > (i5 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzh(i2));
        }
        int i6 = i2 + 1;
        Object[] objArr = this.zzc;
        int length = objArr.length;
        if (i5 < length) {
            System.arraycopy(objArr, i2, objArr, i6, i5 - i2);
        } else {
            Object[] objArr2 = new Object[zzg(length)];
            System.arraycopy(this.zzc, 0, objArr2, 0, i2);
            System.arraycopy(this.zzc, i2, objArr2, i6, this.zzd - i2);
            this.zzc = objArr2;
        }
        this.zzc[i2] = obj;
        this.zzd++;
        this.modCount++;
    }

    public final Object get(int i2) {
        zzi(i2);
        return this.zzc[i2];
    }

    public final Object remove(int i2) {
        zza();
        zzi(i2);
        Object[] objArr = this.zzc;
        Object obj = objArr[i2];
        int i5 = this.zzd;
        if (i2 < i5 - 1) {
            System.arraycopy(objArr, i2 + 1, objArr, i2, (i5 - i2) - 1);
        }
        this.zzd--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i2, Object obj) {
        zza();
        zzi(i2);
        Object[] objArr = this.zzc;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.zzd;
    }

    public final /* bridge */ /* synthetic */ zzho zzd(int i2) {
        Object[] objArr;
        if (i2 >= this.zzd) {
            if (i2 == 0) {
                objArr = zza;
            } else {
                objArr = Arrays.copyOf(this.zzc, i2);
            }
            return new zziv(objArr, this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzf(int i2) {
        int length = this.zzc.length;
        if (i2 > length) {
            if (length != 0) {
                while (length < i2) {
                    length = zzg(length);
                }
                this.zzc = Arrays.copyOf(this.zzc, length);
                return;
            }
            this.zzc = new Object[Math.max(i2, 10)];
        }
    }

    private zziv(Object[] objArr, int i2, boolean z3) {
        super(z3);
        this.zzc = objArr;
        this.zzd = i2;
    }

    public final boolean add(Object obj) {
        zza();
        int i2 = this.zzd;
        int length = this.zzc.length;
        if (i2 == length) {
            this.zzc = Arrays.copyOf(this.zzc, zzg(length));
        }
        Object[] objArr = this.zzc;
        int i5 = this.zzd;
        this.zzd = i5 + 1;
        objArr[i5] = obj;
        this.modCount++;
        return true;
    }
}
