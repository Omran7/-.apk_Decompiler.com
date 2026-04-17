package com.google.android.gms.internal.fido;

import com.google.android.gms.internal.measurement.a;
import h0.C0552a;

final class zzct extends zzcw {
    private final int zzc;
    private final int zzd;

    public zzct(byte[] bArr, int i2, int i5) {
        super(bArr);
        zzcz.zzj(i2, i2 + i5, bArr.length);
        this.zzc = i2;
        this.zzd = i5;
    }

    public final byte zza(int i2) {
        int i5 = this.zzd;
        if (((i5 - (i2 + 1)) | i2) >= 0) {
            return this.zza[this.zzc + i2];
        }
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(a.f(i2, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(C0552a.l("Index > length: ", i2, i5, ", "));
    }

    public final byte zzb(int i2) {
        return this.zza[this.zzc + i2];
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zzd;
    }

    public final void zze(byte[] bArr, int i2, int i5, int i6) {
        System.arraycopy(this.zza, this.zzc, bArr, 0, i6);
    }
}
