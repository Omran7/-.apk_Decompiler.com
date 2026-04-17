package com.google.android.gms.internal.fido;

import java.util.NoSuchElementException;

abstract class zzar extends zzcc {
    private final int zza;
    private int zzb;

    public zzar(int i2, int i5) {
        zzap.zzb(i5, i2, "index");
        this.zza = i2;
        this.zzb = i5;
    }

    public final boolean hasNext() {
        return this.zzb < this.zza;
    }

    public final boolean hasPrevious() {
        return this.zzb > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i2 = this.zzb;
            this.zzb = i2 + 1;
            return zza(i2);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.zzb;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i2 = this.zzb - 1;
            this.zzb = i2;
            return zza(i2);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.zzb - 1;
    }

    public abstract Object zza(int i2);
}
