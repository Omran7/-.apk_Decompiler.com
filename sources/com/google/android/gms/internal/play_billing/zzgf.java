package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.measurement.a;
import h0.C0552a;

final class zzgf extends zzgi {
    private final int zzc;

    public zzgf(byte[] bArr, int i2, int i5) {
        super(bArr);
        zzgk.zzh(0, i5, bArr.length);
        this.zzc = i5;
    }

    public final byte zza(int i2) {
        int i5 = this.zzc;
        if (((i5 - (i2 + 1)) | i2) >= 0) {
            return this.zza[i2];
        }
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(a.f(i2, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(C0552a.l("Index > length: ", i2, i5, ", "));
    }

    public final byte zzb(int i2) {
        return this.zza[i2];
    }

    public final int zzc() {
        return 0;
    }

    public final int zzd() {
        return this.zzc;
    }
}
