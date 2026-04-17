package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import h0.C0552a;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaki  reason: invalid package */
final class zzaki extends zzajj<Double> implements zzalc<Double>, RandomAccess {
    private static final double[] zza;
    private double[] zzb;
    private int zzc;

    static {
        double[] dArr = new double[0];
        zza = dArr;
        new zzaki(dArr, 0, false);
    }

    public zzaki() {
        this(zza, 0, true);
    }

    private static int zzd(int i2) {
        return C0552a.i(i2, 3, 2, 1, 10);
    }

    private final String zze(int i2) {
        return C0552a.l("Index:", i2, this.zzc, ", Size:");
    }

    private final void zzf(int i2) {
        if (i2 < 0 || i2 >= this.zzc) {
            throw new IndexOutOfBoundsException(zze(i2));
        }
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        int i5;
        double doubleValue = ((Double) obj).doubleValue();
        zza();
        if (i2 < 0 || i2 > (i5 = this.zzc)) {
            throw new IndexOutOfBoundsException(zze(i2));
        }
        double[] dArr = this.zzb;
        if (i5 < dArr.length) {
            System.arraycopy(dArr, i2, dArr, i2 + 1, i5 - i2);
        } else {
            double[] dArr2 = new double[zzd(dArr.length)];
            System.arraycopy(this.zzb, 0, dArr2, 0, i2);
            System.arraycopy(this.zzb, i2, dArr2, i2 + 1, this.zzc - i2);
            this.zzb = dArr2;
        }
        this.zzb[i2] = doubleValue;
        this.zzc++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        zza();
        zzalb.zza(collection);
        if (!(collection instanceof zzaki)) {
            return super.addAll(collection);
        }
        zzaki zzaki = (zzaki) collection;
        int i2 = zzaki.zzc;
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
            System.arraycopy(zzaki.zzb, 0, this.zzb, this.zzc, zzaki.zzc);
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
        if (!(obj instanceof zzaki)) {
            return super.equals(obj);
        }
        zzaki zzaki = (zzaki) obj;
        if (this.zzc != zzaki.zzc) {
            return false;
        }
        double[] dArr = zzaki.zzb;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            if (Double.doubleToLongBits(this.zzb[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i2) {
        return Double.valueOf(zzb(i2));
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i5 = 0; i5 < this.zzc; i5++) {
            i2 = (i2 * 31) + zzalb.zza(Double.doubleToLongBits(this.zzb[i5]));
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.zzb[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i2) {
        zza();
        zzf(i2);
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

    public final /* synthetic */ Object set(int i2, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        zza();
        zzf(i2);
        double[] dArr = this.zzb;
        double d = dArr[i2];
        dArr[i2] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.zzc;
    }

    public final /* synthetic */ zzalc zza(int i2) {
        if (i2 >= this.zzc) {
            return new zzaki(i2 == 0 ? zza : Arrays.copyOf(this.zzb, i2), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final double zzb(int i2) {
        zzf(i2);
        return this.zzb[i2];
    }

    public final void zzc(int i2) {
        double[] dArr = this.zzb;
        if (i2 > dArr.length) {
            if (dArr.length == 0) {
                this.zzb = new double[Math.max(i2, 10)];
                return;
            }
            int length = dArr.length;
            while (length < i2) {
                length = zzd(length);
            }
            this.zzb = Arrays.copyOf(this.zzb, length);
        }
    }

    private zzaki(double[] dArr, int i2, boolean z3) {
        super(z3);
        this.zzb = dArr;
        this.zzc = i2;
    }

    public final void zza(double d) {
        zza();
        int i2 = this.zzc;
        double[] dArr = this.zzb;
        if (i2 == dArr.length) {
            double[] dArr2 = new double[zzd(dArr.length)];
            System.arraycopy(this.zzb, 0, dArr2, 0, this.zzc);
            this.zzb = dArr2;
        }
        double[] dArr3 = this.zzb;
        int i5 = this.zzc;
        this.zzc = i5 + 1;
        dArr3[i5] = d;
    }

    public final /* synthetic */ boolean add(Object obj) {
        zza(((Double) obj).doubleValue());
        return true;
    }
}
