package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.f;
import h0.C0552a;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzdu extends zzdq implements RandomAccess, zzey, zzgd {
    private static final zzdu zza;
    private boolean[] zzb;
    private int zzc;

    static {
        zzdu zzdu = new zzdu(new boolean[0], 0);
        zza = zzdu;
        zzdu.zzb();
    }

    public zzdu() {
        this(new boolean[10], 0);
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
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i2 < 0 || i2 > (i5 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i2));
        }
        boolean[] zArr = this.zzb;
        if (i5 < zArr.length) {
            System.arraycopy(zArr, i2, zArr, i2 + 1, i5 - i2);
        } else {
            boolean[] zArr2 = new boolean[C0552a.h(i5, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            System.arraycopy(this.zzb, i2, zArr2, i2 + 1, this.zzc - i2);
            this.zzb = zArr2;
        }
        this.zzb[i2] = booleanValue;
        this.zzc++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        zza();
        zzez.zze(collection);
        if (!(collection instanceof zzdu)) {
            return super.addAll(collection);
        }
        zzdu zzdu = (zzdu) collection;
        int i2 = zzdu.zzc;
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
            System.arraycopy(zzdu.zzb, 0, this.zzb, this.zzc, zzdu.zzc);
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
        if (!(obj instanceof zzdu)) {
            return super.equals(obj);
        }
        zzdu zzdu = (zzdu) obj;
        if (this.zzc != zzdu.zzc) {
            return false;
        }
        boolean[] zArr = zzdu.zzb;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            if (this.zzb[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i2) {
        zzg(i2);
        return Boolean.valueOf(this.zzb[i2]);
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i5 = 0; i5 < this.zzc; i5++) {
            i2 = (i2 * 31) + zzez.zza(this.zzb[i5]);
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
        zzg(i2);
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
        zzg(i2);
        boolean[] zArr = this.zzb;
        boolean z3 = zArr[i2];
        zArr[i2] = booleanValue;
        return Boolean.valueOf(z3);
    }

    public final int size() {
        return this.zzc;
    }

    public final /* bridge */ /* synthetic */ zzey zzd(int i2) {
        if (i2 >= this.zzc) {
            return new zzdu(Arrays.copyOf(this.zzb, i2), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(boolean z3) {
        zza();
        int i2 = this.zzc;
        boolean[] zArr = this.zzb;
        if (i2 == zArr.length) {
            boolean[] zArr2 = new boolean[C0552a.h(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.zzb = zArr2;
        }
        boolean[] zArr3 = this.zzb;
        int i5 = this.zzc;
        this.zzc = i5 + 1;
        zArr3[i5] = z3;
    }

    private zzdu(boolean[] zArr, int i2) {
        this.zzb = zArr;
        this.zzc = i2;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Boolean) obj).booleanValue());
        return true;
    }
}
