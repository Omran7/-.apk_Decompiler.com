package com.google.android.gms.internal.measurement;

import java.util.Arrays;

public final class zzof {
    private static final zzof zza = new zzof(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzof(int i2, int[] iArr, Object[] objArr, boolean z3) {
        this.zze = -1;
        this.zzb = i2;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z3;
    }

    public static zzof zzc() {
        return zza;
    }

    public static zzof zze(zzof zzof, zzof zzof2) {
        int i2 = zzof.zzb + zzof2.zzb;
        int[] copyOf = Arrays.copyOf(zzof.zzc, i2);
        System.arraycopy(zzof2.zzc, 0, copyOf, zzof.zzb, zzof2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzof.zzd, i2);
        System.arraycopy(zzof2.zzd, 0, copyOf2, zzof.zzb, zzof2.zzb);
        return new zzof(i2, copyOf, copyOf2, true);
    }

    public static zzof zzf() {
        return new zzof(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i2) {
        int[] iArr = this.zzc;
        if (i2 > iArr.length) {
            int i5 = this.zzb;
            int i6 = (i5 / 2) + i5;
            if (i6 >= i2) {
                i2 = i6;
            }
            if (i2 < 8) {
                i2 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i2);
            this.zzd = Arrays.copyOf(this.zzd, i2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzof)) {
            return false;
        }
        zzof zzof = (zzof) obj;
        int i2 = this.zzb;
        if (i2 == zzof.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzof.zzc;
            int i5 = 0;
            while (true) {
                if (i5 >= i2) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzof.zzd;
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
        int i5 = i2 + 527;
        int[] iArr = this.zzc;
        int i6 = 17;
        int i7 = 17;
        for (int i8 = 0; i8 < i2; i8++) {
            i7 = (i7 * 31) + iArr[i8];
        }
        int i9 = ((i5 * 31) + i7) * 31;
        Object[] objArr = this.zzd;
        int i10 = this.zzb;
        for (int i11 = 0; i11 < i10; i11++) {
            i6 = (i6 * 31) + objArr[i11].hashCode();
        }
        return i9 + i6;
    }

    public final int zza() {
        int zzz;
        int zzA;
        int zzz2;
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.zzb; i6++) {
            int i7 = this.zzc[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.zzd[i6]).getClass();
                    zzz2 = zzlk.zzz(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int zzz3 = zzlk.zzz(i8 << 3);
                    int zzd2 = ((zzld) this.zzd[i6]).zzd();
                    i5 = zzlk.zzz(zzd2) + zzd2 + zzz3 + i5;
                } else if (i9 == 3) {
                    int zzz4 = zzlk.zzz(i8 << 3);
                    zzz = zzz4 + zzz4;
                    zzA = ((zzof) this.zzd[i6]).zza();
                } else if (i9 == 5) {
                    ((Integer) this.zzd[i6]).getClass();
                    zzz2 = zzlk.zzz(i8 << 3) + 4;
                } else {
                    throw new IllegalStateException(new zzml("Protocol message tag had invalid wire type."));
                }
                i5 = zzz2 + i5;
            } else {
                int i10 = i8 << 3;
                long longValue = ((Long) this.zzd[i6]).longValue();
                zzz = zzlk.zzz(i10);
                zzA = zzlk.zzA(longValue);
            }
            i5 = zzA + zzz + i5;
        }
        this.zze = i5;
        return i5;
    }

    public final int zzb() {
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.zzb; i6++) {
            int zzz = zzlk.zzz(8);
            int zzz2 = zzlk.zzz(this.zzc[i6] >>> 3) + zzlk.zzz(16);
            int zzz3 = zzlk.zzz(24);
            int zzd2 = ((zzld) this.zzd[i6]).zzd();
            i5 += zzz + zzz + zzz2 + a.a(zzd2, zzd2, zzz3);
        }
        this.zze = i5;
        return i5;
    }

    public final zzof zzd(zzof zzof) {
        if (zzof.equals(zza)) {
            return this;
        }
        zzg();
        int i2 = this.zzb + zzof.zzb;
        zzm(i2);
        System.arraycopy(zzof.zzc, 0, this.zzc, this.zzb, zzof.zzb);
        System.arraycopy(zzof.zzd, 0, this.zzd, this.zzb, zzof.zzb);
        this.zzb = i2;
        return this;
    }

    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb, int i2) {
        for (int i5 = 0; i5 < this.zzb; i5++) {
            zznj.zzb(sb, i2, String.valueOf(this.zzc[i5] >>> 3), this.zzd[i5]);
        }
    }

    public final void zzj(int i2, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i5 = this.zzb;
        iArr[i5] = i2;
        this.zzd[i5] = obj;
        this.zzb = i5 + 1;
    }

    public final void zzk(zzor zzor) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzor.zzw(this.zzc[i2] >>> 3, this.zzd[i2]);
        }
    }

    public final void zzl(zzor zzor) {
        if (this.zzb != 0) {
            for (int i2 = 0; i2 < this.zzb; i2++) {
                int i5 = this.zzc[i2];
                Object obj = this.zzd[i2];
                int i6 = i5 & 7;
                int i7 = i5 >>> 3;
                if (i6 == 0) {
                    zzor.zzt(i7, ((Long) obj).longValue());
                } else if (i6 == 1) {
                    zzor.zzm(i7, ((Long) obj).longValue());
                } else if (i6 == 2) {
                    zzor.zzd(i7, (zzld) obj);
                } else if (i6 == 3) {
                    zzor.zzF(i7);
                    ((zzof) obj).zzl(zzor);
                    zzor.zzh(i7);
                } else if (i6 == 5) {
                    zzor.zzk(i7, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(new zzml("Protocol message tag had invalid wire type."));
                }
            }
        }
    }

    private zzof() {
        this(0, new int[8], new Object[8], true);
    }
}
