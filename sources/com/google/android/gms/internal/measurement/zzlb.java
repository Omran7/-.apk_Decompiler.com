package com.google.android.gms.internal.measurement;

import h0.C0552a;

class zzlb extends zzla {
    protected final byte[] zza;

    public zzlb(byte[] bArr) {
        super((zzlc) null);
        bArr.getClass();
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzld) || zzd() != ((zzld) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzlb)) {
            return obj.equals(this);
        }
        zzlb zzlb = (zzlb) obj;
        int zzi = zzi();
        int zzi2 = zzlb.zzi();
        if (zzi != 0 && zzi2 != 0 && zzi != zzi2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzlb.zzd()) {
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        } else if (zzd <= zzlb.zzd()) {
            byte[] bArr = this.zza;
            byte[] bArr2 = zzlb.zza;
            zzlb.zzc();
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
            throw new IllegalArgumentException(C0552a.l("Ran off end of other: 0, ", zzd, zzlb.zzd(), ", "));
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
        return zzmk.zzb(i2, this.zza, 0, i6);
    }

    public final zzld zzf(int i2, int i5) {
        int zzh = zzld.zzh(0, i5, zzd());
        if (zzh == 0) {
            return zzld.zzb;
        }
        return new zzky(this.zza, 0, zzh);
    }

    public final void zzg(zzkv zzkv) {
        ((zzlh) zzkv).zzc(this.zza, 0, zzd());
    }
}
