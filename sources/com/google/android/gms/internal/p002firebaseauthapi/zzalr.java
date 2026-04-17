package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import h0.C0552a;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzalr  reason: invalid package */
final class zzalr extends zzajj<Long> implements zzalc<Long>, RandomAccess {
    private static final long[] zza;
    private long[] zzb;
    private int zzc;

    static {
        long[] jArr = new long[0];
        zza = jArr;
        new zzalr(jArr, 0, false);
    }

    public zzalr() {
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
        long longValue = ((Long) obj).longValue();
        zza();
        if (i2 < 0 || i2 > (i5 = this.zzc)) {
            throw new IndexOutOfBoundsException(zze(i2));
        }
        long[] jArr = this.zzb;
        if (i5 < jArr.length) {
            System.arraycopy(jArr, i2, jArr, i2 + 1, i5 - i2);
        } else {
            long[] jArr2 = new long[zzd(jArr.length)];
            System.arraycopy(this.zzb, 0, jArr2, 0, i2);
            System.arraycopy(this.zzb, i2, jArr2, i2 + 1, this.zzc - i2);
            this.zzb = jArr2;
        }
        this.zzb[i2] = longValue;
        this.zzc++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        zza();
        zzalb.zza(collection);
        if (!(collection instanceof zzalr)) {
            return super.addAll(collection);
        }
        zzalr zzalr = (zzalr) collection;
        int i2 = zzalr.zzc;
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
            System.arraycopy(zzalr.zzb, 0, this.zzb, this.zzc, zzalr.zzc);
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
        if (!(obj instanceof zzalr)) {
            return super.equals(obj);
        }
        zzalr zzalr = (zzalr) obj;
        if (this.zzc != zzalr.zzc) {
            return false;
        }
        long[] jArr = zzalr.zzb;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            if (this.zzb[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i2) {
        return Long.valueOf(zzb(i2));
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i5 = 0; i5 < this.zzc; i5++) {
            i2 = (i2 * 31) + zzalb.zza(this.zzb[i5]);
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.zzb[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i2) {
        zza();
        zzf(i2);
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

    public final /* synthetic */ Object set(int i2, Object obj) {
        long longValue = ((Long) obj).longValue();
        zza();
        zzf(i2);
        long[] jArr = this.zzb;
        long j6 = jArr[i2];
        jArr[i2] = longValue;
        return Long.valueOf(j6);
    }

    public final int size() {
        return this.zzc;
    }

    public final /* synthetic */ zzalc zza(int i2) {
        if (i2 >= this.zzc) {
            return new zzalr(i2 == 0 ? zza : Arrays.copyOf(this.zzb, i2), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final long zzb(int i2) {
        zzf(i2);
        return this.zzb[i2];
    }

    public final void zzc(int i2) {
        long[] jArr = this.zzb;
        if (i2 > jArr.length) {
            if (jArr.length == 0) {
                this.zzb = new long[Math.max(i2, 10)];
                return;
            }
            int length = jArr.length;
            while (length < i2) {
                length = zzd(length);
            }
            this.zzb = Arrays.copyOf(this.zzb, length);
        }
    }

    private zzalr(long[] jArr, int i2, boolean z3) {
        super(z3);
        this.zzb = jArr;
        this.zzc = i2;
    }

    public final void zza(long j6) {
        zza();
        int i2 = this.zzc;
        long[] jArr = this.zzb;
        if (i2 == jArr.length) {
            long[] jArr2 = new long[zzd(jArr.length)];
            System.arraycopy(this.zzb, 0, jArr2, 0, this.zzc);
            this.zzb = jArr2;
        }
        long[] jArr3 = this.zzb;
        int i5 = this.zzc;
        this.zzc = i5 + 1;
        jArr3[i5] = j6;
    }

    public final /* synthetic */ boolean add(Object obj) {
        zza(((Long) obj).longValue());
        return true;
    }
}
