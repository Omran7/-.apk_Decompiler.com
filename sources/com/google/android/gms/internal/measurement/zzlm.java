package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.f;
import h0.C0552a;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzlm extends zzkq implements RandomAccess, zzmj, zzno {
    private static final double[] zza;
    private double[] zzb;
    private int zzc;

    static {
        double[] dArr = new double[0];
        zza = dArr;
        new zzlm(dArr, 0, false);
    }

    public zzlm() {
        this(zza, 0, true);
    }

    private static int zzh(int i2) {
        return C0552a.i(i2, 3, 2, 1, 10);
    }

    private final String zzi(int i2) {
        return C0552a.l("Index:", i2, this.zzc, ", Size:");
    }

    private final void zzj(int i2) {
        if (i2 < 0 || i2 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzi(i2));
        }
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        int i5;
        double doubleValue = ((Double) obj).doubleValue();
        zzcE();
        if (i2 < 0 || i2 > (i5 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzi(i2));
        }
        int i6 = i2 + 1;
        double[] dArr = this.zzb;
        int length = dArr.length;
        if (i5 < length) {
            System.arraycopy(dArr, i2, dArr, i6, i5 - i2);
        } else {
            double[] dArr2 = new double[zzh(length)];
            System.arraycopy(this.zzb, 0, dArr2, 0, i2);
            System.arraycopy(this.zzb, i2, dArr2, i6, this.zzc - i2);
            this.zzb = dArr2;
        }
        this.zzb[i2] = doubleValue;
        this.zzc++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        zzcE();
        byte[] bArr = zzmk.zzb;
        collection.getClass();
        if (!(collection instanceof zzlm)) {
            return super.addAll(collection);
        }
        zzlm zzlm = (zzlm) collection;
        int i2 = zzlm.zzc;
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
            System.arraycopy(zzlm.zzb, 0, this.zzb, this.zzc, zzlm.zzc);
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
        if (!(obj instanceof zzlm)) {
            return super.equals(obj);
        }
        zzlm zzlm = (zzlm) obj;
        if (this.zzc != zzlm.zzc) {
            return false;
        }
        double[] dArr = zzlm.zzb;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            if (Double.doubleToLongBits(this.zzb[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i2) {
        zzj(i2);
        return Double.valueOf(this.zzb[i2]);
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i5 = 0; i5 < this.zzc; i5++) {
            long doubleToLongBits = Double.doubleToLongBits(this.zzb[i5]);
            byte[] bArr = zzmk.zzb;
            i2 = (i2 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
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
        zzcE();
        zzj(i2);
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
        zzcE();
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
        zzcE();
        zzj(i2);
        double[] dArr = this.zzb;
        double d = dArr[i2];
        dArr[i2] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.zzc;
    }

    public final /* bridge */ /* synthetic */ zzmj zzd(int i2) {
        double[] dArr;
        if (i2 >= this.zzc) {
            if (i2 == 0) {
                dArr = zza;
            } else {
                dArr = Arrays.copyOf(this.zzb, i2);
            }
            return new zzlm(dArr, this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final double zze(int i2) {
        zzj(i2);
        return this.zzb[i2];
    }

    public final void zzf(double d) {
        zzcE();
        int i2 = this.zzc;
        int length = this.zzb.length;
        if (i2 == length) {
            double[] dArr = new double[zzh(length)];
            System.arraycopy(this.zzb, 0, dArr, 0, this.zzc);
            this.zzb = dArr;
        }
        double[] dArr2 = this.zzb;
        int i5 = this.zzc;
        this.zzc = i5 + 1;
        dArr2[i5] = d;
    }

    public final void zzg(int i2) {
        int length = this.zzb.length;
        if (i2 > length) {
            if (length != 0) {
                while (length < i2) {
                    length = zzh(length);
                }
                this.zzb = Arrays.copyOf(this.zzb, length);
                return;
            }
            this.zzb = new double[Math.max(i2, 10)];
        }
    }

    private zzlm(double[] dArr, int i2, boolean z3) {
        super(z3);
        this.zzb = dArr;
        this.zzc = i2;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Double) obj).doubleValue());
        return true;
    }
}
