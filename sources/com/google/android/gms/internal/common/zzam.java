package com.google.android.gms.internal.common;

import java.util.Objects;

final class zzam extends zzak {
    static final zzak zza = new zzam(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzam(Object[] objArr, int i2) {
        this.zzb = objArr;
        this.zzc = i2;
    }

    public final Object get(int i2) {
        zzv.zza(i2, this.zzc, "index");
        Object obj = this.zzb[i2];
        Objects.requireNonNull(obj);
        return obj;
    }

    public final int size() {
        return this.zzc;
    }

    public final int zza(Object[] objArr, int i2) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    public final int zzb() {
        return this.zzc;
    }

    public final int zzc() {
        return 0;
    }

    public final boolean zzf() {
        return false;
    }

    public final Object[] zzg() {
        return this.zzb;
    }
}
