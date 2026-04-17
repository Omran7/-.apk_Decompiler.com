package com.google.android.gms.internal.play_billing;

import com.google.android.gms.common.api.f;
import h0.C0552a;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzib extends zzfx implements RandomAccess, zzho, zzit {
    private static final long[] zza;
    private long[] zzb;
    private int zzc;

    static {
        long[] jArr = new long[0];
        zza = jArr;
        new zzib(jArr, 0, false);
    }

    public zzib() {
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
        long longValue = ((Long) obj).longValue();
        zza();
        if (i2 < 0 || i2 > (i5 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzi(i2));
        }
        int i6 = i2 + 1;
        long[] jArr = this.zzb;
        int length = jArr.length;
        if (i5 < length) {
            System.arraycopy(jArr, i2, jArr, i6, i5 - i2);
        } else {
            long[] jArr2 = new long[zzh(length)];
            System.arraycopy(this.zzb, 0, jArr2, 0, i2);
            System.arraycopy(this.zzb, i2, jArr2, i6, this.zzc - i2);
            this.zzb = jArr2;
        }
        this.zzb[i2] = longValue;
        this.zzc++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzhp.zzb;
        collection.getClass();
        if (!(collection instanceof zzib)) {
            return super.addAll(collection);
        }
        zzib zzib = (zzib) collection;
        int i2 = zzib.zzc;
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
            System.arraycopy(zzib.zzb, 0, this.zzb, this.zzc, zzib.zzc);
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
        if (!(obj instanceof zzib)) {
            return super.equals(obj);
        }
        zzib zzib = (zzib) obj;
        if (this.zzc != zzib.zzc) {
            return false;
        }
        long[] jArr = zzib.zzb;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            if (this.zzb[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i2) {
        zzj(i2);
        return Long.valueOf(this.zzb[i2]);
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i5 = 0; i5 < this.zzc; i5++) {
            long j6 = this.zzb[i5];
            byte[] bArr = zzhp.zzb;
            i2 = (i2 * 31) + ((int) (j6 ^ (j6 >>> 32)));
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
        zzj(i2);
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
        zzj(i2);
        long[] jArr = this.zzb;
        long j6 = jArr[i2];
        jArr[i2] = longValue;
        return Long.valueOf(j6);
    }

    public final int size() {
        return this.zzc;
    }

    public final /* bridge */ /* synthetic */ zzho zzd(int i2) {
        long[] jArr;
        if (i2 >= this.zzc) {
            if (i2 == 0) {
                jArr = zza;
            } else {
                jArr = Arrays.copyOf(this.zzb, i2);
            }
            return new zzib(jArr, this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final long zze(int i2) {
        zzj(i2);
        return this.zzb[i2];
    }

    public final void zzf(long j6) {
        zza();
        int i2 = this.zzc;
        int length = this.zzb.length;
        if (i2 == length) {
            long[] jArr = new long[zzh(length)];
            System.arraycopy(this.zzb, 0, jArr, 0, this.zzc);
            this.zzb = jArr;
        }
        long[] jArr2 = this.zzb;
        int i5 = this.zzc;
        this.zzc = i5 + 1;
        jArr2[i5] = j6;
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
            this.zzb = new long[Math.max(i2, 10)];
        }
    }

    private zzib(long[] jArr, int i2, boolean z3) {
        super(z3);
        this.zzb = jArr;
        this.zzc = i2;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Long) obj).longValue());
        return true;
    }
}
