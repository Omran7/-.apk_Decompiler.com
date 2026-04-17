package com.google.android.gms.internal.play_billing;

import h0.C0552a;
import java.util.Locale;

final class zzgo extends zzgr {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    public zzgo(byte[] bArr, int i2, int i5) {
        super((zzgq) null);
        int length = bArr.length;
        if (((length - i5) | i5) >= 0) {
            this.zzb = bArr;
            this.zzd = 0;
            this.zzc = i5;
            return;
        }
        Locale locale = Locale.US;
        throw new IllegalArgumentException(C0552a.l("Array range is invalid. Buffer.length=", length, i5, ", offset=0, length="));
    }

    public final int zza() {
        return this.zzc - this.zzd;
    }

    public final void zzb(byte b6) {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i2 = this.zzd;
        try {
            int i5 = i2 + 1;
            try {
                this.zzb[i2] = b6;
                this.zzd = i5;
            } catch (IndexOutOfBoundsException e6) {
                indexOutOfBoundsException = e6;
                i2 = i5;
                throw new zzgp((long) i2, (long) this.zzc, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e7) {
            indexOutOfBoundsException = e7;
            throw new zzgp((long) i2, (long) this.zzc, 1, indexOutOfBoundsException);
        }
    }

    public final void zzc(byte[] bArr, int i2, int i5) {
        try {
            System.arraycopy(bArr, 0, this.zzb, this.zzd, i5);
            this.zzd += i5;
        } catch (IndexOutOfBoundsException e6) {
            throw new zzgp((long) this.zzd, (long) this.zzc, i5, e6);
        }
    }

    public final void zzd(int i2, boolean z3) {
        zzt(i2 << 3);
        zzb(z3 ? (byte) 1 : 0);
    }

    public final void zze(int i2, zzgk zzgk) {
        zzt((i2 << 3) | 2);
        zzt(zzgk.zzd());
        zzgk.zzg(this);
    }

    public final void zzf(int i2, int i5) {
        zzt((i2 << 3) | 5);
        zzg(i5);
    }

    public final void zzg(int i2) {
        int i5 = this.zzd;
        try {
            byte[] bArr = this.zzb;
            bArr[i5] = (byte) (i2 & 255);
            bArr[i5 + 1] = (byte) ((i2 >> 8) & 255);
            bArr[i5 + 2] = (byte) ((i2 >> 16) & 255);
            bArr[i5 + 3] = (byte) ((i2 >> 24) & 255);
            this.zzd = i5 + 4;
        } catch (IndexOutOfBoundsException e6) {
            throw new zzgp((long) i5, (long) this.zzc, 4, e6);
        }
    }

    public final void zzh(int i2, long j6) {
        zzt((i2 << 3) | 1);
        zzi(j6);
    }

    public final void zzi(long j6) {
        int i2 = this.zzd;
        try {
            byte[] bArr = this.zzb;
            bArr[i2] = (byte) (((int) j6) & 255);
            bArr[i2 + 1] = (byte) (((int) (j6 >> 8)) & 255);
            bArr[i2 + 2] = (byte) (((int) (j6 >> 16)) & 255);
            bArr[i2 + 3] = (byte) (((int) (j6 >> 24)) & 255);
            bArr[i2 + 4] = (byte) (((int) (j6 >> 32)) & 255);
            bArr[i2 + 5] = (byte) (((int) (j6 >> 40)) & 255);
            bArr[i2 + 6] = (byte) (((int) (j6 >> 48)) & 255);
            bArr[i2 + 7] = (byte) (((int) (j6 >> 56)) & 255);
            this.zzd = i2 + 8;
        } catch (IndexOutOfBoundsException e6) {
            throw new zzgp((long) i2, (long) this.zzc, 8, e6);
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

    public final void zzm(int i2, zzim zzim, zzix zzix) {
        zzt((i2 << 3) | 2);
        zzt(((zzfv) zzim).zze(zzix));
        zzix.zzi(zzim, this.zza);
    }

    public final void zzn(int i2, zzim zzim) {
        zzt(11);
        zzs(2, i2);
        zzt(26);
        zzt(zzim.zzk());
        zzim.zzJ(this);
        zzt(12);
    }

    public final void zzo(int i2, zzgk zzgk) {
        zzt(11);
        zzs(2, i2);
        zze(3, zzgk);
        zzt(12);
    }

    public final void zzp(int i2, String str) {
        zzt((i2 << 3) | 2);
        zzq(str);
    }

    public final void zzq(String str) {
        int i2 = this.zzd;
        try {
            int zzz = zzgr.zzz(str.length() * 3);
            int zzz2 = zzgr.zzz(str.length());
            if (zzz2 == zzz) {
                int i5 = i2 + zzz2;
                this.zzd = i5;
                int zzb2 = zzjt.zzb(str, this.zzb, i5, this.zzc - i5);
                this.zzd = i2;
                zzt((zzb2 - i2) - zzz2);
                this.zzd = zzb2;
                return;
            }
            zzt(zzjt.zzc(str));
            byte[] bArr = this.zzb;
            int i6 = this.zzd;
            this.zzd = zzjt.zzb(str, bArr, i6, this.zzc - i6);
        } catch (zzjs e6) {
            this.zzd = i2;
            zzC(str, e6);
        } catch (IndexOutOfBoundsException e7) {
            throw new zzgp(e7);
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
        while ((i2 & -128) != 0) {
            byte[] bArr = this.zzb;
            int i5 = this.zzd;
            this.zzd = i5 + 1;
            bArr[i5] = (byte) ((i2 | 128) & 255);
            i2 >>>= 7;
        }
        try {
            byte[] bArr2 = this.zzb;
            int i6 = this.zzd;
            this.zzd = i6 + 1;
            bArr2[i6] = (byte) i2;
        } catch (IndexOutOfBoundsException e6) {
            IndexOutOfBoundsException indexOutOfBoundsException = e6;
            int i7 = this.zzd;
            throw new zzgp((long) i7, (long) this.zzc, 1, indexOutOfBoundsException);
        }
    }

    public final void zzu(int i2, long j6) {
        zzt(i2 << 3);
        zzv(j6);
    }

    public final void zzv(long j6) {
        if (!zzgr.zzc || this.zzc - this.zzd < 10) {
            while ((j6 & -128) != 0) {
                byte[] bArr = this.zzb;
                int i2 = this.zzd;
                this.zzd = i2 + 1;
                bArr[i2] = (byte) ((((int) j6) | 128) & 255);
                j6 >>>= 7;
            }
            try {
                byte[] bArr2 = this.zzb;
                int i5 = this.zzd;
                this.zzd = i5 + 1;
                bArr2[i5] = (byte) ((int) j6);
            } catch (IndexOutOfBoundsException e6) {
                throw new zzgp((long) this.zzd, (long) this.zzc, 1, e6);
            }
        } else {
            while (true) {
                int i6 = (int) j6;
                if ((j6 & -128) == 0) {
                    byte[] bArr3 = this.zzb;
                    int i7 = this.zzd;
                    this.zzd = i7 + 1;
                    zzjq.zzn(bArr3, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr4 = this.zzb;
                int i8 = this.zzd;
                this.zzd = i8 + 1;
                zzjq.zzn(bArr4, (long) i8, (byte) ((i6 | 128) & 255));
                j6 >>>= 7;
            }
        }
    }
}
