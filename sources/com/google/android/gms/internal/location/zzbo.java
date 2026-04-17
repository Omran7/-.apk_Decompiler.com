package com.google.android.gms.internal.location;

import java.util.NoSuchElementException;

abstract class zzbo<E> extends zzbv<E> {
    private final int zza;
    private int zzb;

    public zzbo(int i2, int i5) {
        zzbm.zzb(i5, i2, "index");
        this.zza = i2;
        this.zzb = i5;
    }

    public final boolean hasNext() {
        return this.zzb < this.zza;
    }

    public final boolean hasPrevious() {
        return this.zzb > 0;
    }

    public final E next() {
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

    public final E previous() {
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

    public abstract E zza(int i2);
}
