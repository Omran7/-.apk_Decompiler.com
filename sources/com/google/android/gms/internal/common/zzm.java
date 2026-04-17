package com.google.android.gms.internal.common;

import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class zzm implements Iterator {
    private Object zza;
    private int zzb = 2;

    public final boolean hasNext() {
        int i2 = this.zzb;
        if (i2 != 4) {
            int i5 = i2 - 1;
            if (i2 == 0) {
                throw null;
            } else if (i5 == 0) {
                return true;
            } else {
                if (i5 != 2) {
                    this.zzb = 4;
                    this.zza = zza();
                    if (this.zzb != 3) {
                        this.zzb = 1;
                        return true;
                    }
                }
                return false;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public final Object next() {
        if (hasNext()) {
            this.zzb = 2;
            Object obj = this.zza;
            this.zza = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public abstract Object zza();

    public final Object zzb() {
        this.zzb = 3;
        return null;
    }
}
