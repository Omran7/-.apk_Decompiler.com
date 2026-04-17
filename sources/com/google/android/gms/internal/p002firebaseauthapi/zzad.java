package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzad  reason: invalid package */
abstract class zzad<E> extends zzaz<E> {
    private final int zza;
    private int zzb;

    public zzad(int i2, int i5) {
        zzw.zzb(i5, i2);
        this.zza = i2;
        this.zzb = i5;
    }

    public final boolean hasNext() {
        if (this.zzb < this.zza) {
            return true;
        }
        return false;
    }

    public final boolean hasPrevious() {
        if (this.zzb > 0) {
            return true;
        }
        return false;
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
