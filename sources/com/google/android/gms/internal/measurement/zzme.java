package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.f;
import h0.C0552a;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzme extends zzkq implements RandomAccess, zzmh, zzno {
    private static final int[] zza;
    private static final zzme zzb;
    private int[] zzc;
    private int zzd;

    static {
        int[] iArr = new int[0];
        zza = iArr;
        zzb = new zzme(iArr, 0, false);
    }

    public zzme() {
        this(zza, 0, true);
    }

    public static zzme zzf() {
        return zzb;
    }

    private static int zzj(int i2) {
        return C0552a.i(i2, 3, 2, 1, 10);
    }

    private final String zzk(int i2) {
        return C0552a.l("Index:", i2, this.zzd, ", Size:");
    }

    private final void zzl(int i2) {
        if (i2 < 0 || i2 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzk(i2));
        }
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        int i5;
        int intValue = ((Integer) obj).intValue();
        zzcE();
        if (i2 < 0 || i2 > (i5 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzk(i2));
        }
        int i6 = i2 + 1;
        int[] iArr = this.zzc;
        int length = iArr.length;
        if (i5 < length) {
            System.arraycopy(iArr, i2, iArr, i6, i5 - i2);
        } else {
            int[] iArr2 = new int[zzj(length)];
            System.arraycopy(this.zzc, 0, iArr2, 0, i2);
            System.arraycopy(this.zzc, i2, iArr2, i6, this.zzd - i2);
            this.zzc = iArr2;
        }
        this.zzc[i2] = intValue;
        this.zzd++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        zzcE();
        byte[] bArr = zzmk.zzb;
        collection.getClass();
        if (!(collection instanceof zzme)) {
            return super.addAll(collection);
        }
        zzme zzme = (zzme) collection;
        int i2 = zzme.zzd;
        if (i2 == 0) {
            return false;
        }
        int i5 = this.zzd;
        if (f.API_PRIORITY_OTHER - i5 >= i2) {
            int i6 = i5 + i2;
            int[] iArr = this.zzc;
            if (i6 > iArr.length) {
                this.zzc = Arrays.copyOf(iArr, i6);
            }
            System.arraycopy(zzme.zzc, 0, this.zzc, this.zzd, zzme.zzd);
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
        if (!(obj instanceof zzme)) {
            return super.equals(obj);
        }
        zzme zzme = (zzme) obj;
        if (this.zzd != zzme.zzd) {
            return false;
        }
        int[] iArr = zzme.zzc;
        for (int i2 = 0; i2 < this.zzd; i2++) {
            if (this.zzc[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i2) {
        zzl(i2);
        return Integer.valueOf(this.zzc[i2]);
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i5 = 0; i5 < this.zzd; i5++) {
            i2 = (i2 * 31) + this.zzc[i5];
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i2 = this.zzd;
        for (int i5 = 0; i5 < i2; i5++) {
            if (this.zzc[i5] == intValue) {
                return i5;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        zzcE();
        zzl(i2);
        int[] iArr = this.zzc;
        int i5 = iArr[i2];
        int i6 = this.zzd;
        if (i2 < i6 - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (i6 - i2) - 1);
        }
        this.zzd--;
        this.modCount++;
        return Integer.valueOf(i5);
    }

    public final void removeRange(int i2, int i5) {
        zzcE();
        if (i5 >= i2) {
            int[] iArr = this.zzc;
            System.arraycopy(iArr, i5, iArr, i2, this.zzd - i5);
            this.zzd -= i5 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zzcE();
        zzl(i2);
        int[] iArr = this.zzc;
        int i5 = iArr[i2];
        iArr[i2] = intValue;
        return Integer.valueOf(i5);
    }

    public final int size() {
        return this.zzd;
    }

    public final int zze(int i2) {
        zzl(i2);
        return this.zzc[i2];
    }

    /* renamed from: zzg */
    public final zzmh zzd(int i2) {
        int[] iArr;
        if (i2 >= this.zzd) {
            if (i2 == 0) {
                iArr = zza;
            } else {
                iArr = Arrays.copyOf(this.zzc, i2);
            }
            return new zzme(iArr, this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzh(int i2) {
        zzcE();
        int i5 = this.zzd;
        int length = this.zzc.length;
        if (i5 == length) {
            int[] iArr = new int[zzj(length)];
            System.arraycopy(this.zzc, 0, iArr, 0, this.zzd);
            this.zzc = iArr;
        }
        int[] iArr2 = this.zzc;
        int i6 = this.zzd;
        this.zzd = i6 + 1;
        iArr2[i6] = i2;
    }

    public final void zzi(int i2) {
        int length = this.zzc.length;
        if (i2 > length) {
            if (length != 0) {
                while (length < i2) {
                    length = zzj(length);
                }
                this.zzc = Arrays.copyOf(this.zzc, length);
                return;
            }
            this.zzc = new int[Math.max(i2, 10)];
        }
    }

    private zzme(int[] iArr, int i2, boolean z3) {
        super(z3);
        this.zzc = iArr;
        this.zzd = i2;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Integer) obj).intValue());
        return true;
    }
}
