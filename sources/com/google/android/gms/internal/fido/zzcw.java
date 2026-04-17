package com.google.android.gms.internal.fido;

import h0.C0552a;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

class zzcw extends zzcv {
    protected final byte[] zza;

    public zzcw(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzcz) || zzd() != ((zzcz) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzcw)) {
            return obj.equals(this);
        }
        zzcw zzcw = (zzcw) obj;
        int zzk = zzk();
        int zzk2 = zzcw.zzk();
        if (zzk != 0 && zzk2 != 0 && zzk != zzk2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzcw.zzd()) {
            int zzd2 = zzd();
            throw new IllegalArgumentException("Length too large: " + zzd + zzd2);
        } else if (zzd <= zzcw.zzd()) {
            byte[] bArr = this.zza;
            byte[] bArr2 = zzcw.zza;
            int zzc = zzc() + zzd;
            int zzc2 = zzc();
            int zzc3 = zzcw.zzc();
            while (zzc2 < zzc) {
                if (bArr[zzc2] != bArr2[zzc3]) {
                    return false;
                }
                zzc2++;
                zzc3++;
            }
            return true;
        } else {
            throw new IllegalArgumentException(C0552a.l("Ran off end of other: 0, ", zzd, zzcw.zzd(), ", "));
        }
    }

    public byte zza(int i2) {
        return this.zza[i2];
    }

    public byte zzb(int i2) {
        return this.zza[i2];
    }

    public int zzc() {
        return 0;
    }

    public int zzd() {
        return this.zza.length;
    }

    public void zze(byte[] bArr, int i2, int i5, int i6) {
        System.arraycopy(this.zza, 0, bArr, 0, i6);
    }

    public final int zzf(int i2, int i5, int i6) {
        byte[] bArr = this.zza;
        int zzc = zzc();
        byte[] bArr2 = zzde.zzd;
        for (int i7 = zzc; i7 < zzc + i6; i7++) {
            i2 = (i2 * 31) + bArr[i7];
        }
        return i2;
    }

    public final zzcz zzg(int i2, int i5) {
        int zzj = zzcz.zzj(i2, i5, zzd());
        if (zzj == 0) {
            return zzcz.zzb;
        }
        return new zzct(this.zza, zzc() + i2, zzj);
    }

    public final InputStream zzh() {
        return new ByteArrayInputStream(this.zza, zzc(), zzd());
    }

    public final ByteBuffer zzi() {
        return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }
}
