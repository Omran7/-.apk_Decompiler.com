package com.google.android.recaptcha.internal;

import h0.C0552a;

class zzlc extends zzlb {
    protected final byte[] zza;

    public zzlc(byte[] bArr) {
        super((zzld) null);
        bArr.getClass();
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzle) || zzd() != ((zzle) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzlc)) {
            return obj.equals(this);
        }
        zzlc zzlc = (zzlc) obj;
        int zzj = zzj();
        int zzj2 = zzlc.zzj();
        if (zzj != 0 && zzj2 != 0 && zzj != zzj2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzlc.zzd()) {
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        } else if (zzd <= zzlc.zzd()) {
            byte[] bArr = this.zza;
            byte[] bArr2 = zzlc.zza;
            zzlc.zzc();
            int i2 = 0;
            int i5 = 0;
            while (i2 < zzd) {
                if (bArr[i2] != bArr2[i5]) {
                    return false;
                }
                i2++;
                i5++;
            }
            return true;
        } else {
            throw new IllegalArgumentException(C0552a.l("Ran off end of other: 0, ", zzd, zzlc.zzd(), ", "));
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
        return zznl.zzb(i2, this.zza, 0, i6);
    }

    public final zzle zzg(int i2, int i5) {
        int zzi = zzle.zzi(0, i5, zzd());
        if (zzi == 0) {
            return zzle.zzb;
        }
        return new zzkz(this.zza, 0, zzi);
    }

    public final void zzh(zzkw zzkw) {
        ((zzlk) zzkw).zzc(this.zza, 0, zzd());
    }
}
