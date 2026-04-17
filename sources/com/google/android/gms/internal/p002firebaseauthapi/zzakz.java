package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import h0.C0552a;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzakz  reason: invalid package */
final class zzakz extends zzajj<Integer> implements zzalc<Integer>, RandomAccess {
    private static final int[] zza;
    private int[] zzb;
    private int zzc;

    static {
        int[] iArr = new int[0];
        zza = iArr;
        new zzakz(iArr, 0, false);
    }

    public zzakz() {
        this(zza, 0, true);
    }

    private static int zze(int i2) {
        return C0552a.i(i2, 3, 2, 1, 10);
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
        int intValue = ((Integer) obj).intValue();
        zza();
        if (i2 < 0 || i2 > (i5 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i2));
        }
        int[] iArr = this.zzb;
        if (i5 < iArr.length) {
            System.arraycopy(iArr, i2, iArr, i2 + 1, i5 - i2);
        } else {
            int[] iArr2 = new int[zze(iArr.length)];
            System.arraycopy(this.zzb, 0, iArr2, 0, i2);
            System.arraycopy(this.zzb, i2, iArr2, i2 + 1, this.zzc - i2);
            this.zzb = iArr2;
        }
        this.zzb[i2] = intValue;
        this.zzc++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        zza();
        zzalb.zza(collection);
        if (!(collection instanceof zzakz)) {
            return super.addAll(collection);
        }
        zzakz zzakz = (zzakz) collection;
        int i2 = zzakz.zzc;
        if (i2 == 0) {
            return false;
        }
        int i5 = this.zzc;
        if (f.API_PRIORITY_OTHER - i5 >= i2) {
            int i6 = i5 + i2;
            int[] iArr = this.zzb;
            if (i6 > iArr.length) {
                this.zzb = Arrays.copyOf(iArr, i6);
            }
            System.arraycopy(zzakz.zzb, 0, this.zzb, this.zzc, zzakz.zzc);
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
        if (!(obj instanceof zzakz)) {
            return super.equals(obj);
        }
        zzakz zzakz = (zzakz) obj;
        if (this.zzc != zzakz.zzc) {
            return false;
        }
        int[] iArr = zzakz.zzb;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            if (this.zzb[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i2) {
        return Integer.valueOf(zzb(i2));
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i5 = 0; i5 < this.zzc; i5++) {
            i2 = (i2 * 31) + this.zzb[i5];
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.zzb[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i2) {
        zza();
        zzg(i2);
        int[] iArr = this.zzb;
        int i5 = iArr[i2];
        int i6 = this.zzc;
        if (i2 < i6 - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (i6 - i2) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Integer.valueOf(i5);
    }

    public final void removeRange(int i2, int i5) {
        zza();
        if (i5 >= i2) {
            int[] iArr = this.zzb;
            System.arraycopy(iArr, i5, iArr, i2, this.zzc - i5);
            this.zzc -= i5 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i2, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zza();
        zzg(i2);
        int[] iArr = this.zzb;
        int i5 = iArr[i2];
        iArr[i2] = intValue;
        return Integer.valueOf(i5);
    }

    public final int size() {
        return this.zzc;
    }

    public final /* synthetic */ zzalc zza(int i2) {
        int[] iArr;
        if (i2 >= this.zzc) {
            if (i2 == 0) {
                iArr = zza;
            } else {
                iArr = Arrays.copyOf(this.zzb, i2);
            }
            return new zzakz(iArr, this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final int zzb(int i2) {
        zzg(i2);
        return this.zzb[i2];
    }

    public final void zzc(int i2) {
        zza();
        int i5 = this.zzc;
        int[] iArr = this.zzb;
        if (i5 == iArr.length) {
            int[] iArr2 = new int[zze(iArr.length)];
            System.arraycopy(this.zzb, 0, iArr2, 0, this.zzc);
            this.zzb = iArr2;
        }
        int[] iArr3 = this.zzb;
        int i6 = this.zzc;
        this.zzc = i6 + 1;
        iArr3[i6] = i2;
    }

    public final void zzd(int i2) {
        int[] iArr = this.zzb;
        if (i2 > iArr.length) {
            if (iArr.length == 0) {
                this.zzb = new int[Math.max(i2, 10)];
                return;
            }
            int length = iArr.length;
            while (length < i2) {
                length = zze(length);
            }
            this.zzb = Arrays.copyOf(this.zzb, length);
        }
    }

    private zzakz(int[] iArr, int i2, boolean z3) {
        super(z3);
        this.zzb = iArr;
        this.zzc = i2;
    }

    public final /* synthetic */ boolean add(Object obj) {
        zzc(((Integer) obj).intValue());
        return true;
    }
}
