package com.google.android.gms.internal.play_billing;

import h0.C0552a;

class zzgi extends zzgh {
    protected final byte[] zza;

    public zzgi(byte[] bArr) {
        super((zzgj) null);
        bArr.getClass();
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgk) || zzd() != ((zzgk) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzgi)) {
            return obj.equals(this);
        }
        zzgi zzgi = (zzgi) obj;
        int zzi = zzi();
        int zzi2 = zzgi.zzi();
        if (zzi != 0 && zzi2 != 0 && zzi != zzi2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzgi.zzd()) {
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        } else if (zzd <= zzgi.zzd()) {
            byte[] bArr = this.zza;
            byte[] bArr2 = zzgi.zza;
            zzgi.zzc();
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
            throw new IllegalArgumentException(C0552a.l("Ran off end of other: 0, ", zzd, zzgi.zzd(), ", "));
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

    public final int zze(int i2, int i5, int i6) {
        return zzhp.zzb(i2, this.zza, 0, i6);
    }

    public final zzgk zzf(int i2, int i5) {
        int zzh = zzgk.zzh(0, i5, zzd());
        if (zzh == 0) {
            return zzgk.zzb;
        }
        return new zzgf(this.zza, 0, zzh);
    }

    public final void zzg(zzgc zzgc) {
        ((zzgo) zzgc).zzc(this.zza, 0, zzd());
    }
}
