package com.google.android.recaptcha.internal;

import com.google.android.gms.internal.measurement.a;
import java.util.Arrays;

public final class zzpm {
    private static final zzpm zza = new zzpm(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzpm(int i2, int[] iArr, Object[] objArr, boolean z3) {
        this.zze = -1;
        this.zzb = i2;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z3;
    }

    public static zzpm zzc() {
        return zza;
    }

    public static zzpm zze(zzpm zzpm, zzpm zzpm2) {
        int i2 = zzpm.zzb + zzpm2.zzb;
        int[] copyOf = Arrays.copyOf(zzpm.zzc, i2);
        System.arraycopy(zzpm2.zzc, 0, copyOf, zzpm.zzb, zzpm2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzpm.zzd, i2);
        System.arraycopy(zzpm2.zzd, 0, copyOf2, zzpm.zzb, zzpm2.zzb);
        return new zzpm(i2, copyOf, copyOf2, true);
    }

    public static zzpm zzf() {
        return new zzpm(0, new int[8], new Object[8], true);
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
        if (obj == null || !(obj instanceof zzpm)) {
            return false;
        }
        zzpm zzpm = (zzpm) obj;
        int i2 = this.zzb;
        if (i2 == zzpm.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzpm.zzc;
            int i5 = 0;
            while (true) {
                if (i5 >= i2) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzpm.zzd;
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
        int zzA;
        int zzB;
        int zzA2;
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
                    zzA2 = zzln.zzA(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int zzA3 = zzln.zzA(i8 << 3);
                    int zzd2 = ((zzle) this.zzd[i6]).zzd();
                    i5 = zzln.zzA(zzd2) + zzd2 + zzA3 + i5;
                } else if (i9 == 3) {
                    int zzA4 = zzln.zzA(i8 << 3);
                    zzA = zzA4 + zzA4;
                    zzB = ((zzpm) this.zzd[i6]).zza();
                } else if (i9 == 5) {
                    ((Integer) this.zzd[i6]).getClass();
                    zzA2 = zzln.zzA(i8 << 3) + 4;
                } else {
                    throw new IllegalStateException(new zznm("Protocol message tag had invalid wire type."));
                }
                i5 = zzA2 + i5;
            } else {
                int i10 = i8 << 3;
                long longValue = ((Long) this.zzd[i6]).longValue();
                zzA = zzln.zzA(i10);
                zzB = zzln.zzB(longValue);
            }
            i5 = zzB + zzA + i5;
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
            int zzA = zzln.zzA(8);
            int zzA2 = zzln.zzA(this.zzc[i6] >>> 3) + zzln.zzA(16);
            int zzA3 = zzln.zzA(24);
            int zzd2 = ((zzle) this.zzd[i6]).zzd();
            i5 += zzA + zzA + zzA2 + a.w(zzd2, zzd2, zzA3);
        }
        this.zze = i5;
        return i5;
    }

    public final zzpm zzd(zzpm zzpm) {
        if (zzpm.equals(zza)) {
            return this;
        }
        zzg();
        int i2 = this.zzb + zzpm.zzb;
        zzm(i2);
        System.arraycopy(zzpm.zzc, 0, this.zzc, this.zzb, zzpm.zzb);
        System.arraycopy(zzpm.zzd, 0, this.zzd, this.zzb, zzpm.zzb);
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
            zzok.zzb(sb, i2, String.valueOf(this.zzc[i5] >>> 3), this.zzd[i5]);
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

    public final void zzk(zzpy zzpy) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzpy.zzw(this.zzc[i2] >>> 3, this.zzd[i2]);
        }
    }

    public final void zzl(zzpy zzpy) {
        if (this.zzb != 0) {
            for (int i2 = 0; i2 < this.zzb; i2++) {
                int i5 = this.zzc[i2];
                Object obj = this.zzd[i2];
                int i6 = i5 & 7;
                int i7 = i5 >>> 3;
                if (i6 == 0) {
                    zzpy.zzt(i7, ((Long) obj).longValue());
                } else if (i6 == 1) {
                    zzpy.zzm(i7, ((Long) obj).longValue());
                } else if (i6 == 2) {
                    zzpy.zzd(i7, (zzle) obj);
                } else if (i6 == 3) {
                    zzpy.zzF(i7);
                    ((zzpm) obj).zzl(zzpy);
                    zzpy.zzh(i7);
                } else if (i6 == 5) {
                    zzpy.zzk(i7, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(new zznm("Protocol message tag had invalid wire type."));
                }
            }
        }
    }

    private zzpm() {
        this(0, new int[8], new Object[8], true);
    }
}
