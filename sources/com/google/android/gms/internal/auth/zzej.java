package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.f;
import h0.C0552a;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzej extends zzdq implements RandomAccess, zzey, zzgd {
    private static final zzej zza;
    private double[] zzb;
    private int zzc;

    static {
        zzej zzej = new zzej(new double[0], 0);
        zza = zzej;
        zzej.zzb();
    }

    public zzej() {
        this(new double[10], 0);
    }

    private final String zzf(int i2) {
        return C0552a.l("Index:", i2, this.zzc, ", Size:");
    }

    private final void zzg(int i2) {
        if (i2 < 0 || i2 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i2));
        }
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        int i5;
        double doubleValue = ((Double) obj).doubleValue();
        zza();
        if (i2 < 0 || i2 > (i5 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i2));
        }
        double[] dArr = this.zzb;
        if (i5 < dArr.length) {
            System.arraycopy(dArr, i2, dArr, i2 + 1, i5 - i2);
        } else {
            double[] dArr2 = new double[C0552a.h(i5, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            System.arraycopy(this.zzb, i2, dArr2, i2 + 1, this.zzc - i2);
            this.zzb = dArr2;
        }
        this.zzb[i2] = doubleValue;
        this.zzc++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        zza();
        zzez.zze(collection);
        if (!(collection instanceof zzej)) {
            return super.addAll(collection);
        }
        zzej zzej = (zzej) collection;
        int i2 = zzej.zzc;
        if (i2 == 0) {
            return false;
        }
        int i5 = this.zzc;
        if (f.API_PRIORITY_OTHER - i5 >= i2) {
            int i6 = i5 + i2;
            double[] dArr = this.zzb;
            if (i6 > dArr.length) {
                this.zzb = Arrays.copyOf(dArr, i6);
            }
            System.arraycopy(zzej.zzb, 0, this.zzb, this.zzc, zzej.zzc);
            this.zzc = i6;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzej)) {
            return super.equals(obj);
        }
        zzej zzej = (zzej) obj;
        if (this.zzc != zzej.zzc) {
            return false;
        }
        double[] dArr = zzej.zzb;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            if (Double.doubleToLongBits(this.zzb[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i2) {
        zzg(i2);
        return Double.valueOf(this.zzb[i2]);
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i5 = 0; i5 < this.zzc; i5++) {
            i2 = (i2 * 31) + zzez.zzc(Double.doubleToLongBits(this.zzb[i5]));
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i2 = this.zzc;
        for (int i5 = 0; i5 < i2; i5++) {
            if (this.zzb[i5] == doubleValue) {
                return i5;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        zza();
        zzg(i2);
        double[] dArr = this.zzb;
        double d = dArr[i2];
        int i5 = this.zzc;
        if (i2 < i5 - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (i5 - i2) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final void removeRange(int i2, int i5) {
        zza();
        if (i5 >= i2) {
            double[] dArr = this.zzb;
            System.arraycopy(dArr, i5, dArr, i2, this.zzc - i5);
            this.zzc -= i5 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        zza();
        zzg(i2);
        double[] dArr = this.zzb;
        double d = dArr[i2];
        dArr[i2] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.zzc;
    }

    public final /* bridge */ /* synthetic */ zzey zzd(int i2) {
        if (i2 >= this.zzc) {
            return new zzej(Arrays.copyOf(this.zzb, i2), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(double d) {
        zza();
        int i2 = this.zzc;
        double[] dArr = this.zzb;
        if (i2 == dArr.length) {
            double[] dArr2 = new double[C0552a.h(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            this.zzb = dArr2;
        }
        double[] dArr3 = this.zzb;
        int i5 = this.zzc;
        this.zzc = i5 + 1;
        dArr3[i5] = d;
    }

    private zzej(double[] dArr, int i2) {
        this.zzb = dArr;
        this.zzc = i2;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Double) obj).doubleValue());
        return true;
    }
}
