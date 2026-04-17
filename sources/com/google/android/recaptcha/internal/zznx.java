package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.f;
import h0.C0552a;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zznx extends zzkr implements RandomAccess, zznj, zzor {
    private static final long[] zza;
    private static final zznx zzb;
    private long[] zzc;
    private int zzd;

    static {
        long[] jArr = new long[0];
        zza = jArr;
        zzb = new zznx(jArr, 0, false);
    }

    public zznx() {
        this(zza, 0, true);
    }

    public static zznx zzf() {
        return zzb;
    }

    private static int zzi(int i2) {
        return C0552a.i(i2, 3, 2, 1, 10);
    }

    private final String zzj(int i2) {
        return C0552a.l("Index:", i2, this.zzd, ", Size:");
    }

    private final void zzk(int i2) {
        if (i2 < 0 || i2 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzj(i2));
        }
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        int i5;
        long longValue = ((Long) obj).longValue();
        zza();
        if (i2 < 0 || i2 > (i5 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzj(i2));
        }
        int i6 = i2 + 1;
        long[] jArr = this.zzc;
        int length = jArr.length;
        if (i5 < length) {
            System.arraycopy(jArr, i2, jArr, i6, i5 - i2);
        } else {
            long[] jArr2 = new long[zzi(length)];
            System.arraycopy(this.zzc, 0, jArr2, 0, i2);
            System.arraycopy(this.zzc, i2, jArr2, i6, this.zzd - i2);
            this.zzc = jArr2;
        }
        this.zzc[i2] = longValue;
        this.zzd++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zznl.zzb;
        collection.getClass();
        if (!(collection instanceof zznx)) {
            return super.addAll(collection);
        }
        zznx zznx = (zznx) collection;
        int i2 = zznx.zzd;
        if (i2 == 0) {
            return false;
        }
        int i5 = this.zzd;
        if (f.API_PRIORITY_OTHER - i5 >= i2) {
            int i6 = i5 + i2;
            long[] jArr = this.zzc;
            if (i6 > jArr.length) {
                this.zzc = Arrays.copyOf(jArr, i6);
            }
            System.arraycopy(zznx.zzc, 0, this.zzc, this.zzd, zznx.zzd);
            this.zzd = i6;
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
        if (!(obj instanceof zznx)) {
            return super.equals(obj);
        }
        zznx zznx = (zznx) obj;
        if (this.zzd != zznx.zzd) {
            return false;
        }
        long[] jArr = zznx.zzc;
        for (int i2 = 0; i2 < this.zzd; i2++) {
            if (this.zzc[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i2) {
        zzk(i2);
        return Long.valueOf(this.zzc[i2]);
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i5 = 0; i5 < this.zzd; i5++) {
            long j6 = this.zzc[i5];
            byte[] bArr = zznl.zzb;
            i2 = (i2 * 31) + ((int) (j6 ^ (j6 >>> 32)));
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i2 = this.zzd;
        for (int i5 = 0; i5 < i2; i5++) {
            if (this.zzc[i5] == longValue) {
                return i5;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        zza();
        zzk(i2);
        long[] jArr = this.zzc;
        long j6 = jArr[i2];
        int i5 = this.zzd;
        if (i2 < i5 - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (i5 - i2) - 1);
        }
        this.zzd--;
        this.modCount++;
        return Long.valueOf(j6);
    }

    public final void removeRange(int i2, int i5) {
        zza();
        if (i5 >= i2) {
            long[] jArr = this.zzc;
            System.arraycopy(jArr, i5, jArr, i2, this.zzd - i5);
            this.zzd -= i5 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        long longValue = ((Long) obj).longValue();
        zza();
        zzk(i2);
        long[] jArr = this.zzc;
        long j6 = jArr[i2];
        jArr[i2] = longValue;
        return Long.valueOf(j6);
    }

    public final int size() {
        return this.zzd;
    }

    public final /* bridge */ /* synthetic */ zznk zzd(int i2) {
        long[] jArr;
        if (i2 >= this.zzd) {
            if (i2 == 0) {
                jArr = zza;
            } else {
                jArr = Arrays.copyOf(this.zzc, i2);
            }
            return new zznx(jArr, this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final long zze(int i2) {
        zzk(i2);
        return this.zzc[i2];
    }

    public final void zzg(long j6) {
        zza();
        int i2 = this.zzd;
        int length = this.zzc.length;
        if (i2 == length) {
            long[] jArr = new long[zzi(length)];
            System.arraycopy(this.zzc, 0, jArr, 0, this.zzd);
            this.zzc = jArr;
        }
        long[] jArr2 = this.zzc;
        int i5 = this.zzd;
        this.zzd = i5 + 1;
        jArr2[i5] = j6;
    }

    public final void zzh(int i2) {
        int length = this.zzc.length;
        if (i2 > length) {
            if (length != 0) {
                while (length < i2) {
                    length = zzi(length);
                }
                this.zzc = Arrays.copyOf(this.zzc, length);
                return;
            }
            this.zzc = new long[Math.max(i2, 10)];
        }
    }

    private zznx(long[] jArr, int i2, boolean z3) {
        super(z3);
        this.zzc = jArr;
        this.zzd = i2;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Long) obj).longValue());
        return true;
    }
}
