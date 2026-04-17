package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.measurement.a;
import h0.C0552a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajt  reason: invalid package */
final class zzajt extends zzajw {
    private final int zzc;
    private final int zzd;

    public zzajt(byte[] bArr, int i2, int i5) {
        super(bArr);
        zzajp.zza(i2, i2 + i5, bArr.length);
        this.zzc = i2;
        this.zzd = i5;
    }

    public final byte zza(int i2) {
        int zzb = zzb();
        if (((zzb - (i2 + 1)) | i2) >= 0) {
            return this.zzb[this.zzc + i2];
        }
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(a.f(i2, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(C0552a.l("Index > length: ", i2, zzb, ", "));
    }

    public final byte zzb(int i2) {
        return this.zzb[this.zzc + i2];
    }

    public final int zze() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final void zza(byte[] bArr, int i2, int i5, int i6) {
        System.arraycopy(this.zzb, zze(), bArr, 0, i6);
    }
}
