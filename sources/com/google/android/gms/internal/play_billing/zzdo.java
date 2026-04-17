package com.google.android.gms.internal.play_billing;

import java.util.Objects;

final class zzdo extends zzco {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zzdo(Object[] objArr, int i2, int i5) {
        this.zza = objArr;
        this.zzb = i2;
        this.zzc = i5;
    }

    public final Object get(int i2) {
        zzbe.zza(i2, this.zzc, "index");
        Object obj = this.zza[i2 + i2 + this.zzb];
        Objects.requireNonNull(obj);
        return obj;
    }

    public final int size() {
        return this.zzc;
    }

    public final boolean zzf() {
        return true;
    }
}
