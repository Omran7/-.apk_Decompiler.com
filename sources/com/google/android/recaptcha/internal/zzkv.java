package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.f;
import h0.C0552a;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzkv extends zzkr implements RandomAccess, zznk, zzor {
    private static final boolean[] zza;
    private boolean[] zzb;
    private int zzc;

    static {
        boolean[] zArr = new boolean[0];
        zza = zArr;
        new zzkv(zArr, 0, false);
    }

    public zzkv() {
        this(zza, 0, true);
    }

    private static int zzg(int i2) {
        return C0552a.i(i2, 3, 2, 1, 10);
    }

    private final String zzh(int i2) {
        return C0552a.l("Index:", i2, this.zzc, ", Size:");
    }

    private final void zzi(int i2) {
        if (i2 < 0 || i2 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzh(i2));
        }
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        int i5;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i2 < 0 || i2 > (i5 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzh(i2));
        }
        int i6 = i2 + 1;
        boolean[] zArr = this.zzb;
        int length = zArr.length;
        if (i5 < length) {
            System.arraycopy(zArr, i2, zArr, i6, i5 - i2);
        } else {
            boolean[] zArr2 = new boolean[zzg(length)];
            System.arraycopy(this.zzb, 0, zArr2, 0, i2);
            System.arraycopy(this.zzb, i2, zArr2, i6, this.zzc - i2);
            this.zzb = zArr2;
        }
        this.zzb[i2] = booleanValue;
        this.zzc++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zznl.zzb;
        collection.getClass();
        if (!(collection instanceof zzkv)) {
            return super.addAll(collection);
        }
        zzkv zzkv = (zzkv) collection;
        int i2 = zzkv.zzc;
        if (i2 == 0) {
            return false;
        }
        int i5 = this.zzc;
        if (f.API_PRIORITY_OTHER - i5 >= i2) {
            int i6 = i5 + i2;
            boolean[] zArr = this.zzb;
            if (i6 > zArr.length) {
                this.zzb = Arrays.copyOf(zArr, i6);
            }
            System.arraycopy(zzkv.zzb, 0, this.zzb, this.zzc, zzkv.zzc);
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
        if (!(obj instanceof zzkv)) {
            return super.equals(obj);
        }
        zzkv zzkv = (zzkv) obj;
        if (this.zzc != zzkv.zzc) {
            return false;
        }
        boolean[] zArr = zzkv.zzb;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            if (this.zzb[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i2) {
        zzi(i2);
        return Boolean.valueOf(this.zzb[i2]);
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i5 = 0; i5 < this.zzc; i5++) {
            i2 = (i2 * 31) + zznl.zza(this.zzb[i5]);
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i2 = this.zzc;
        for (int i5 = 0; i5 < i2; i5++) {
            if (this.zzb[i5] == booleanValue) {
                return i5;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        zza();
        zzi(i2);
        boolean[] zArr = this.zzb;
        boolean z3 = zArr[i2];
        int i5 = this.zzc;
        if (i2 < i5 - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (i5 - i2) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Boolean.valueOf(z3);
    }

    public final void removeRange(int i2, int i5) {
        zza();
        if (i5 >= i2) {
            boolean[] zArr = this.zzb;
            System.arraycopy(zArr, i5, zArr, i2, this.zzc - i5);
            this.zzc -= i5 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        zzi(i2);
        boolean[] zArr = this.zzb;
        boolean z3 = zArr[i2];
        zArr[i2] = booleanValue;
        return Boolean.valueOf(z3);
    }

    public final int size() {
        return this.zzc;
    }

    public final /* bridge */ /* synthetic */ zznk zzd(int i2) {
        boolean[] zArr;
        if (i2 >= this.zzc) {
            if (i2 == 0) {
                zArr = zza;
            } else {
                zArr = Arrays.copyOf(this.zzb, i2);
            }
            return new zzkv(zArr, this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(boolean z3) {
        zza();
        int i2 = this.zzc;
        int length = this.zzb.length;
        if (i2 == length) {
            boolean[] zArr = new boolean[zzg(length)];
            System.arraycopy(this.zzb, 0, zArr, 0, this.zzc);
            this.zzb = zArr;
        }
        boolean[] zArr2 = this.zzb;
        int i5 = this.zzc;
        this.zzc = i5 + 1;
        zArr2[i5] = z3;
    }

    public final boolean zzf(int i2) {
        zzi(i2);
        return this.zzb[i2];
    }

    private zzkv(boolean[] zArr, int i2, boolean z3) {
        super(z3);
        this.zzb = zArr;
        this.zzc = i2;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Boolean) obj).booleanValue());
        return true;
    }
}
