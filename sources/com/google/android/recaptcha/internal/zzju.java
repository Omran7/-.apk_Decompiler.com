package com.google.android.recaptcha.internal;

import java.io.Serializable;

final class zzju extends zzjv implements Serializable {
    final byte[] zza;

    public zzju(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    public final int zza() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        if (length >= 4) {
            return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
        }
        throw new IllegalStateException(zzji.zza("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
    }

    public final int zzb() {
        return this.zza.length * 8;
    }

    public final boolean zzc(zzjv zzjv) {
        boolean z3;
        if (this.zza.length != zzjv.zze().length) {
            return false;
        }
        boolean z4 = true;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.zza;
            if (i2 >= bArr.length) {
                return z4;
            }
            if (bArr[i2] == zzjv.zze()[i2]) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 &= z3;
            i2++;
        }
    }

    public final byte[] zzd() {
        return (byte[]) this.zza.clone();
    }

    public final byte[] zze() {
        return this.zza;
    }
}
