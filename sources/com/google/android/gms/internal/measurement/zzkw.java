package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

final class zzkw extends zzkx {
    final /* synthetic */ zzld zza;
    private int zzb = 0;
    private final int zzc;

    public zzkw(zzld zzld) {
        this.zza = zzld;
        this.zzc = zzld.zzd();
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
