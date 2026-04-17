package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.f;
import h0.C0552a;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzfl extends zzdq implements RandomAccess, zzey, zzgd {
    private static final zzfl zza;
    private long[] zzb;
    private int zzc;

    static {
        zzfl zzfl = new zzfl(new long[0], 0);
        zza = zzfl;
        zzfl.zzb();
    }

    public zzfl() {
        this(new long[10], 0);
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
        long longValue = ((Long) obj).longValue();
        zza();
        if (i2 < 0 || i2 > (i5 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i2));
        }
        long[] jArr = this.zzb;
        if (i5 < jArr.length) {
            System.arraycopy(jArr, i2, jArr, i2 + 1, i5 - i2);
        } else {
            long[] jArr2 = new long[C0552a.h(i5, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            System.arraycopy(this.zzb, i2, jArr2, i2 + 1, this.zzc - i2);
            this.zzb = jArr2;
        }
        this.zzb[i2] = longValue;
        this.zzc++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        zza();
        zzez.zze(collection);
        if (!(collection instanceof zzfl)) {
            return super.addAll(collection);
        }
        zzfl zzfl = (zzfl) collection;
        int i2 = zzfl.zzc;
        if (i2 == 0) {
            return false;
        }
        int i5 = this.zzc;
        if (f.API_PRIORITY_OTHER - i5 >= i2) {
            int i6 = i5 + i2;
            long[] jArr = this.zzb;
            if (i6 > jArr.length) {
                this.zzb = Arrays.copyOf(jArr, i6);
            }
            System.arraycopy(zzfl.zzb, 0, this.zzb, this.zzc, zzfl.zzc);
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
        if (!(obj instanceof zzfl)) {
            return super.equals(obj);
        }
        zzfl zzfl = (zzfl) obj;
        if (this.zzc != zzfl.zzc) {
            return false;
        }
        long[] jArr = zzfl.zzb;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            if (this.zzb[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i2) {
        zzg(i2);
        return Long.valueOf(this.zzb[i2]);
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i5 = 0; i5 < this.zzc; i5++) {
            i2 = (i2 * 31) + zzez.zzc(this.zzb[i5]);
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i2 = this.zzc;
        for (int i5 = 0; i5 < i2; i5++) {
            if (this.zzb[i5] == longValue) {
                return i5;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        zza();
        zzg(i2);
        long[] jArr = this.zzb;
        long j6 = jArr[i2];
        int i5 = this.zzc;
        if (i2 < i5 - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (i5 - i2) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Long.valueOf(j6);
    }

    public final void removeRange(int i2, int i5) {
        zza();
        if (i5 >= i2) {
            long[] jArr = this.zzb;
            System.arraycopy(jArr, i5, jArr, i2, this.zzc - i5);
            this.zzc -= i5 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        long longValue = ((Long) obj).longValue();
        zza();
        zzg(i2);
        long[] jArr = this.zzb;
        long j6 = jArr[i2];
        jArr[i2] = longValue;
        return Long.valueOf(j6);
    }

    public final int size() {
        return this.zzc;
    }

    public final /* bridge */ /* synthetic */ zzey zzd(int i2) {
        if (i2 >= this.zzc) {
            return new zzfl(Arrays.copyOf(this.zzb, i2), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(long j6) {
        zza();
        int i2 = this.zzc;
        long[] jArr = this.zzb;
        if (i2 == jArr.length) {
            long[] jArr2 = new long[C0552a.h(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            this.zzb = jArr2;
        }
        long[] jArr3 = this.zzb;
        int i5 = this.zzc;
        this.zzc = i5 + 1;
        jArr3[i5] = j6;
    }

    private zzfl(long[] jArr, int i2) {
        this.zzb = jArr;
        this.zzc = i2;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Long) obj).longValue());
        return true;
    }
}
