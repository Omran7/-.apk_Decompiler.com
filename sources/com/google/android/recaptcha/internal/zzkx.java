package com.google.android.recaptcha.internal;

import java.util.NoSuchElementException;

final class zzkx extends zzky {
    final /* synthetic */ zzle zza;
    private int zzb = 0;
    private final int zzc;

    public zzkx(zzle zzle) {
        this.zza = zzle;
        this.zzc = zzle.zzd();
    }

    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    public final byte zza() {
        int i2 = this.zzb;
        if (i2 < this.zzc) {
            this.zzb = i2 + 1;
            return this.zza.zzb(i2);
        }
        throw new NoSuchElementException();
    }
}
