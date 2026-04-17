package com.google.android.gms.internal.measurement;

import h0.C0552a;
import java.util.Locale;

final class zzlh extends zzlk {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    public zzlh(byte[] bArr, int i2, int i5) {
        super((zzlj) null);
        int length = bArr.length;
        if (((length - i5) | i5) >= 0) {
            this.zzc = bArr;
            this.zze = 0;
            this.zzd = i5;
            return;
        }
        Locale locale = Locale.US;
        throw new IllegalArgumentException(C0552a.l("Array range is invalid. Buffer.length=", length, i5, ", offset=0, length="));
    }

    public final int zza() {
        return this.zzd - this.zze;
    }

    public final void zzb(byte b6) {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i2 = this.zze;
        try {
            int i5 = i2 + 1;
            try {
                this.zzc[i2] = b6;
                this.zze = i5;
            } catch (IndexOutOfBoundsException e6) {
                indexOutOfBoundsException = e6;
                i2 = i5;
                throw new zzli((long) i2, (long) this.zzd, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e7) {
            indexOutOfBoundsException = e7;
            throw new zzli((long) i2, (long) this.zzd, 1, indexOutOfBoundsException);
        }
    }

    public final void zzc(byte[] bArr, int i2, int i5) {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i5);
            this.zze += i5;
        } catch (IndexOutOfBoundsException e6) {
            throw new zzli((long) this.zze, (long) this.zzd, i5, e6);
        }
    }

    public final void zzd(int i2, boolean z3) {
        zzt(i2 << 3);
        zzb(z3 ? (byte) 1 : 0);
    }

    public final void zze(int i2, zzld zzld) {
        zzt((i2 << 3) | 2);
        zzt(zzld.zzd());
        zzld.zzg(this);
    }

    public final void zzf(int i2, int i5) {
        zzt((i2 << 3) | 5);
        zzg(i5);
    }

    public final void zzg(int i2) {
        int i5 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i5] = (byte) i2;
            bArr[i5 + 1] = (byte) (i2 >> 8);
            bArr[i5 + 2] = (byte) (i2 >> 16);
            bArr[i5 + 3] = (byte) (i2 >> 24);
            this.zze = i5 + 4;
        } catch (IndexOutOfBoundsException e6) {
            throw new zzli((long) i5, (long) this.zzd, 4, e6);
        }
    }

    public final void zzh(int i2, long j6) {
        zzt((i2 << 3) | 1);
        zzi(j6);
    }

    public final void zzi(long j6) {
        int i2 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i2] = (byte) ((int) j6);
            bArr[i2 + 1] = (byte) ((int) (j6 >> 8));
            bArr[i2 + 2] = (byte) ((int) (j6 >> 16));
            bArr[i2 + 3] = (byte) ((int) (j6 >> 24));
            bArr[i2 + 4] = (byte) ((int) (j6 >> 32));
            bArr[i2 + 5] = (byte) ((int) (j6 >> 40));
            bArr[i2 + 6] = (byte) ((int) (j6 >> 48));
            bArr[i2 + 7] = (byte) ((int) (j6 >> 56));
            this.zze = i2 + 8;
        } catch (IndexOutOfBoundsException e6) {
            throw new zzli((long) i2, (long) this.zzd, 8, e6);
        }
    }

    public final void zzj(int i2, int i5) {
        zzt(i2 << 3);
        zzk(i5);
    }

    public final void zzk(int i2) {
        if (i2 >= 0) {
            zzt(i2);
        } else {
            zzv((long) i2);
        }
    }

    public final void zzl(byte[] bArr, int i2, int i5) {
        zzc(bArr, 0, i5);
    }

    public final void zzm(int i2, zznh zznh, zzns zzns) {
        zzt((i2 << 3) | 2);
        zzt(((zzko) zznh).zzca(zzns));
        zzns.zzi(zznh, this.zza);
    }

    public final void zzn(int i2, zznh zznh) {
        zzt(11);
        zzs(2, i2);
        zzt(26);
        zzt(zznh.zzcf());
        zznh.zzcB(this);
        zzt(12);
    }

    public final void zzo(int i2, zzld zzld) {
        zzt(11);
        zzs(2, i2);
        zze(3, zzld);
        zzt(12);
    }

    public final void zzp(int i2, String str) {
        zzt((i2 << 3) | 2);
        zzq(str);
    }

    public final void zzq(String str) {
        int i2 = this.zze;
        try {
            int zzz = zzlk.zzz(str.length() * 3);
            int zzz2 = zzlk.zzz(str.length());
            if (zzz2 == zzz) {
                int i5 = i2 + zzz2;
                this.zze = i5;
                int zzb = zzoo.zzb(str, this.zzc, i5, this.zzd - i5);
                this.zze = i2;
                zzt((zzb - i2) - zzz2);
                this.zze = zzb;
                return;
            }
            zzt(zzoo.zzc(str));
            byte[] bArr = this.zzc;
            int i6 = this.zze;
            this.zze = zzoo.zzb(str, bArr, i6, this.zzd - i6);
        } catch (zzon e6) {
            this.zze = i2;
            zzC(str, e6);
        } catch (IndexOutOfBoundsException e7) {
            throw new zzli(e7);
        }
    }

    public final void zzr(int i2, int i5) {
        zzt((i2 << 3) | i5);
    }

    public final void zzs(int i2, int i5) {
        zzt(i2 << 3);
        zzt(i5);
    }

    public final void zzt(int i2) {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i5;
        int i6 = this.zze;
        while ((i2 & -128) != 0) {
            i5 = i6 + 1;
            this.zzc[i6] = (byte) (i2 | 128);
            i2 >>>= 7;
            i6 = i5;
        }
        try {
            i5 = i6 + 1;
            try {
                this.zzc[i6] = (byte) i2;
                this.zze = i5;
            } catch (IndexOutOfBoundsException e6) {
                indexOutOfBoundsException = e6;
                i6 = i5;
                throw new zzli((long) i6, (long) this.zzd, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e7) {
            indexOutOfBoundsException = e7;
            throw new zzli((long) i6, (long) this.zzd, 1, indexOutOfBoundsException);
        }
    }

    public final void zzu(int i2, long j6) {
        zzt(i2 << 3);
        zzv(j6);
    }

    public final void zzv(long j6) {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i2;
        int i5 = this.zze;
        if (!zzlk.zzd || this.zzd - i5 < 10) {
            while ((j6 & -128) != 0) {
                int i6 = i5 + 1;
                try {
                    this.zzc[i5] = (byte) (((int) j6) | 128);
                    j6 >>>= 7;
                    i5 = i6;
                } catch (IndexOutOfBoundsException e6) {
                    e = e6;
                    i5 = i6;
                    indexOutOfBoundsException = e;
                    throw new zzli((long) i5, (long) this.zzd, 1, indexOutOfBoundsException);
                }
            }
            try {
                i2 = i5 + 1;
            } catch (IndexOutOfBoundsException e7) {
                e = e7;
                indexOutOfBoundsException = e;
                throw new zzli((long) i5, (long) this.zzd, 1, indexOutOfBoundsException);
            }
            try {
                this.zzc[i5] = (byte) ((int) j6);
            } catch (IndexOutOfBoundsException e8) {
                indexOutOfBoundsException = e8;
                i5 = i2;
                throw new zzli((long) i5, (long) this.zzd, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j6 & -128) != 0) {
                zzol.zzn(this.zzc, (long) i5, (byte) (((int) j6) | 128));
                j6 >>>= 7;
                i5++;
            }
            i2 = i5 + 1;
            zzol.zzn(this.zzc, (long) i5, (byte) ((int) j6));
        }
        this.zze = i2;
    }
}
