package com.google.android.recaptcha.internal;

final class zzlk extends zzln {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    public zzlk(byte[] bArr, int i2, int i5) {
        super((zzlm) null);
        int length = bArr.length;
        if (((length - i5) | i5) >= 0) {
            this.zzb = bArr;
            this.zzd = 0;
            this.zzc = i5;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i5)}));
    }

    public final int zza() {
        return this.zzc - this.zzd;
    }

    public final void zzb(byte b6) {
        try {
            byte[] bArr = this.zzb;
            int i2 = this.zzd;
            this.zzd = i2 + 1;
            bArr[i2] = b6;
        } catch (IndexOutOfBoundsException e6) {
            throw new zzll(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1}), e6);
        }
    }

    public final void zzc(byte[] bArr, int i2, int i5) {
        try {
            System.arraycopy(bArr, 0, this.zzb, this.zzd, i5);
            this.zzd += i5;
        } catch (IndexOutOfBoundsException e6) {
            throw new zzll(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i5)}), e6);
        }
    }

    public final void zzd(int i2, boolean z3) {
        zzt(i2 << 3);
        zzb(z3 ? (byte) 1 : 0);
    }

    public final void zze(int i2, zzle zzle) {
        zzt((i2 << 3) | 2);
        zzt(zzle.zzd());
        zzle.zzh(this);
    }

    public final void zzf(int i2, int i5) {
        zzt((i2 << 3) | 5);
        zzg(i5);
    }

    public final void zzg(int i2) {
        try {
            byte[] bArr = this.zzb;
            int i5 = this.zzd;
            int i6 = i5 + 1;
            this.zzd = i6;
            bArr[i5] = (byte) (i2 & 255);
            int i7 = i5 + 2;
            this.zzd = i7;
            bArr[i6] = (byte) ((i2 >> 8) & 255);
            int i8 = i5 + 3;
            this.zzd = i8;
            bArr[i7] = (byte) ((i2 >> 16) & 255);
            this.zzd = i5 + 4;
            bArr[i8] = (byte) ((i2 >> 24) & 255);
        } catch (IndexOutOfBoundsException e6) {
            throw new zzll(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1}), e6);
        }
    }

    public final void zzh(int i2, long j6) {
        zzt((i2 << 3) | 1);
        zzi(j6);
    }

    public final void zzi(long j6) {
        try {
            byte[] bArr = this.zzb;
            int i2 = this.zzd;
            int i5 = i2 + 1;
            this.zzd = i5;
            bArr[i2] = (byte) (((int) j6) & 255);
            int i6 = i2 + 2;
            this.zzd = i6;
            bArr[i5] = (byte) (((int) (j6 >> 8)) & 255);
            int i7 = i2 + 3;
            this.zzd = i7;
            bArr[i6] = (byte) (((int) (j6 >> 16)) & 255);
            int i8 = i2 + 4;
            this.zzd = i8;
            bArr[i7] = (byte) (((int) (j6 >> 24)) & 255);
            int i9 = i2 + 5;
            this.zzd = i9;
            bArr[i8] = (byte) (((int) (j6 >> 32)) & 255);
            int i10 = i2 + 6;
            this.zzd = i10;
            bArr[i9] = (byte) (((int) (j6 >> 40)) & 255);
            int i11 = i2 + 7;
            this.zzd = i11;
            bArr[i10] = (byte) (((int) (j6 >> 48)) & 255);
            this.zzd = i2 + 8;
            bArr[i11] = (byte) (((int) (j6 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e6) {
            throw new zzll(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1}), e6);
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

    public final void zzm(int i2, zzoi zzoi, zzow zzow) {
        zzt((i2 << 3) | 2);
        zzt(((zzko) zzoi).zza(zzow));
        zzow.zzj(zzoi, this.zza);
    }

    public final void zzn(int i2, zzoi zzoi) {
        zzt(11);
        zzs(2, i2);
        zzt(26);
        zzt(zzoi.zzo());
        zzoi.zze(this);
        zzt(12);
    }

    public final void zzo(int i2, zzle zzle) {
        zzt(11);
        zzs(2, i2);
        zze(3, zzle);
        zzt(12);
    }

    public final void zzp(int i2, String str) {
        zzt((i2 << 3) | 2);
        zzq(str);
    }

    public final void zzq(String str) {
        int i2 = this.zzd;
        try {
            int zzA = zzln.zzA(str.length() * 3);
            int zzA2 = zzln.zzA(str.length());
            if (zzA2 == zzA) {
                int i5 = i2 + zzA2;
                this.zzd = i5;
                int zzb2 = zzpv.zzb(str, this.zzb, i5, this.zzc - i5);
                this.zzd = i2;
                zzt((zzb2 - i2) - zzA2);
                this.zzd = zzb2;
                return;
            }
            zzt(zzpv.zzc(str));
            byte[] bArr = this.zzb;
            int i6 = this.zzd;
            this.zzd = zzpv.zzb(str, bArr, i6, this.zzc - i6);
        } catch (zzpu e6) {
            this.zzd = i2;
            zzD(str, e6);
        } catch (IndexOutOfBoundsException e7) {
            throw new zzll(e7);
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
            throw new zzll(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1}), e6);
        }
    }

    public final void zzu(int i2, long j6) {
        zzt(i2 << 3);
        zzv(j6);
    }

    public final void zzv(long j6) {
        if (!zzln.zzc || this.zzc - this.zzd < 10) {
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
                throw new zzll(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1}), e6);
            }
        } else {
            while (true) {
                int i6 = (int) j6;
                if ((j6 & -128) == 0) {
                    byte[] bArr3 = this.zzb;
                    int i7 = this.zzd;
                    this.zzd = i7 + 1;
                    zzps.zzn(bArr3, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr4 = this.zzb;
                int i8 = this.zzd;
                this.zzd = i8 + 1;
                zzps.zzn(bArr4, (long) i8, (byte) ((i6 | 128) & 255));
                j6 >>>= 7;
            }
        }
    }
}
