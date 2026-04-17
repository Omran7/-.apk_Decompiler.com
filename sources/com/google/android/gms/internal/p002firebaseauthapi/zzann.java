package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzann  reason: invalid package */
public final class zzann {
    private static final zzann zza = new zzann(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzann() {
        this(0, new int[8], new Object[8], true);
    }

    public static zzann zzc() {
        return zza;
    }

    public static zzann zzd() {
        return new zzann();
    }

    private final void zzf() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzann)) {
            return false;
        }
        zzann zzann = (zzann) obj;
        int i2 = this.zzb;
        if (i2 == zzann.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzann.zzc;
            int i5 = 0;
            while (true) {
                if (i5 >= i2) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzann.zzd;
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

    public final int zza() {
        int zze2;
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.zzb; i6++) {
            int i7 = this.zzc[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 == 0) {
                zze2 = zzakg.zze(i8, ((Long) this.zzd[i6]).longValue());
            } else if (i9 == 1) {
                zze2 = zzakg.zza(i8, ((Long) this.zzd[i6]).longValue());
            } else if (i9 == 2) {
                zze2 = zzakg.zza(i8, (zzajp) this.zzd[i6]);
            } else if (i9 == 3) {
                i5 = ((zzann) this.zzd[i6]).zza() + (zzakg.zzi(i8) << 1) + i5;
            } else if (i9 == 5) {
                zze2 = zzakg.zzc(i8, ((Integer) this.zzd[i6]).intValue());
            } else {
                throw new IllegalStateException(zzalf.zza());
            }
            i5 = zze2 + i5;
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
            i5 += zzakg.zzb(this.zzc[i6] >>> 3, (zzajp) this.zzd[i6]);
        }
        this.zze = i5;
        return i5;
    }

    public final void zze() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    private zzann(int i2, int[] iArr, Object[] objArr, boolean z3) {
        this.zze = -1;
        this.zzb = i2;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z3;
    }

    public final void zzb(zzaof zzaof) {
        if (this.zzb != 0) {
            if (zzaof.zza() == 1) {
                for (int i2 = 0; i2 < this.zzb; i2++) {
                    zza(this.zzc[i2], this.zzd[i2], zzaof);
                }
                return;
            }
            for (int i5 = this.zzb - 1; i5 >= 0; i5--) {
                zza(this.zzc[i5], this.zzd[i5], zzaof);
            }
        }
    }

    public final zzann zza(zzann zzann) {
        if (zzann.equals(zza)) {
            return this;
        }
        zzf();
        int i2 = this.zzb + zzann.zzb;
        zza(i2);
        System.arraycopy(zzann.zzc, 0, this.zzc, this.zzb, zzann.zzb);
        System.arraycopy(zzann.zzd, 0, this.zzd, this.zzb, zzann.zzb);
        this.zzb = i2;
        return this;
    }

    public static zzann zza(zzann zzann, zzann zzann2) {
        int i2 = zzann.zzb + zzann2.zzb;
        int[] copyOf = Arrays.copyOf(zzann.zzc, i2);
        System.arraycopy(zzann2.zzc, 0, copyOf, zzann.zzb, zzann2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzann.zzd, i2);
        System.arraycopy(zzann2.zzd, 0, copyOf2, zzann.zzb, zzann2.zzb);
        return new zzann(i2, copyOf, copyOf2, true);
    }

    private final void zza(int i2) {
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

    public final void zza(StringBuilder sb, int i2) {
        for (int i5 = 0; i5 < this.zzb; i5++) {
            zzamh.zza(sb, i2, String.valueOf(this.zzc[i5] >>> 3), this.zzd[i5]);
        }
    }

    public final void zza(int i2, Object obj) {
        zzf();
        zza(this.zzb + 1);
        int[] iArr = this.zzc;
        int i5 = this.zzb;
        iArr[i5] = i2;
        this.zzd[i5] = obj;
        this.zzb = i5 + 1;
    }

    public final void zza(zzaof zzaof) {
        if (zzaof.zza() == 2) {
            for (int i2 = this.zzb - 1; i2 >= 0; i2--) {
                zzaof.zza(this.zzc[i2] >>> 3, this.zzd[i2]);
            }
            return;
        }
        for (int i5 = 0; i5 < this.zzb; i5++) {
            zzaof.zza(this.zzc[i5] >>> 3, this.zzd[i5]);
        }
    }

    private static void zza(int i2, Object obj, zzaof zzaof) {
        int i5 = i2 >>> 3;
        int i6 = i2 & 7;
        if (i6 == 0) {
            zzaof.zzb(i5, ((Long) obj).longValue());
        } else if (i6 == 1) {
            zzaof.zza(i5, ((Long) obj).longValue());
        } else if (i6 == 2) {
            zzaof.zza(i5, (zzajp) obj);
        } else if (i6 != 3) {
            if (i6 == 5) {
                zzaof.zzb(i5, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzalf.zza());
        } else if (zzaof.zza() == 1) {
            zzaof.zzb(i5);
            ((zzann) obj).zzb(zzaof);
            zzaof.zza(i5);
        } else {
            zzaof.zza(i5);
            ((zzann) obj).zzb(zzaof);
            zzaof.zzb(i5);
        }
    }
}
