package com.google.android.gms.internal.auth;

import java.util.Arrays;

public final class zzgz {
    private static final zzgz zza = new zzgz(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private boolean zze;

    private zzgz(int i2, int[] iArr, Object[] objArr, boolean z3) {
        this.zzb = i2;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = z3;
    }

    public static zzgz zza() {
        return zza;
    }

    public static zzgz zzb(zzgz zzgz, zzgz zzgz2) {
        int i2 = zzgz.zzb + zzgz2.zzb;
        int[] copyOf = Arrays.copyOf(zzgz.zzc, i2);
        System.arraycopy(zzgz2.zzc, 0, copyOf, zzgz.zzb, zzgz2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzgz.zzd, i2);
        System.arraycopy(zzgz2.zzd, 0, copyOf2, zzgz.zzb, zzgz2.zzb);
        return new zzgz(i2, copyOf, copyOf2, true);
    }

    public static zzgz zzc() {
        return new zzgz(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzgz)) {
            return false;
        }
        zzgz zzgz = (zzgz) obj;
        int i2 = this.zzb;
        if (i2 == zzgz.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzgz.zzc;
            int i5 = 0;
            while (true) {
                if (i5 >= i2) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzgz.zzd;
                    int i6 = this.zzb;
                    int i7 = 0;
                    while (i7 < i6) {
                        if (objArr[i7].equals(objArr2[i7])) {
                            i7++;
                        }
                    }
                    return true;
                } else if (iArr[i5] != iArr2[i5]) {
                    break;
                } else {
                    i5++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zzb;
        int i5 = (i2 + 527) * 31;
        int[] iArr = this.zzc;
        int i6 = 17;
        int i7 = 17;
        for (int i8 = 0; i8 < i2; i8++) {
            i7 = (i7 * 31) + iArr[i8];
        }
        int i9 = (i5 + i7) * 31;
        Object[] objArr = this.zzd;
        int i10 = this.zzb;
        for (int i11 = 0; i11 < i10; i11++) {
            i6 = (i6 * 31) + objArr[i11].hashCode();
        }
        return i9 + i6;
    }

    public final void zzd() {
        this.zze = false;
    }

    public final void zze(StringBuilder sb, int i2) {
        for (int i5 = 0; i5 < this.zzb; i5++) {
            zzfy.zzb(sb, i2, String.valueOf(this.zzc[i5] >>> 3), this.zzd[i5]);
        }
    }

    public final void zzf(int i2, Object obj) {
        int i5;
        if (this.zze) {
            int i6 = this.zzb;
            int[] iArr = this.zzc;
            if (i6 == iArr.length) {
                if (i6 < 4) {
                    i5 = 8;
                } else {
                    i5 = i6 >> 1;
                }
                int i7 = i6 + i5;
                this.zzc = Arrays.copyOf(iArr, i7);
                this.zzd = Arrays.copyOf(this.zzd, i7);
            }
            int[] iArr2 = this.zzc;
            int i8 = this.zzb;
            iArr2[i8] = i2;
            this.zzd[i8] = obj;
            this.zzb = i8 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    private zzgz() {
        this(0, new int[8], new Object[8], true);
    }
}
