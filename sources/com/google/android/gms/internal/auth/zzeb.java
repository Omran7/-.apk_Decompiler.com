package com.google.android.gms.internal.auth;

import h0.C0552a;
import java.nio.charset.Charset;

class zzeb extends zzea {
    protected final byte[] zza;

    public zzeb(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzee) || zzd() != ((zzee) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzeb)) {
            return obj.equals(this);
        }
        zzeb zzeb = (zzeb) obj;
        int zzj = zzj();
        int zzj2 = zzeb.zzj();
        if (zzj != 0 && zzj2 != 0 && zzj != zzj2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzeb.zzd()) {
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        } else if (zzd <= zzeb.zzd()) {
            byte[] bArr = this.zza;
            byte[] bArr2 = zzeb.zza;
            zzeb.zzc();
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
            throw new IllegalArgumentException(C0552a.l("Ran off end of other: 0, ", zzd, zzeb.zzd(), ", "));
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
        return zzez.zzd(i2, this.zza, 0, i6);
    }

    public final zzee zzf(int i2, int i5) {
        int zzi = zzee.zzi(0, i5, zzd());
        if (zzi == 0) {
            return zzee.zzb;
        }
        return new zzdy(this.zza, 0, zzi);
    }

    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    public final boolean zzh() {
        return zzhm.zzd(this.zza, 0, zzd());
    }
}
