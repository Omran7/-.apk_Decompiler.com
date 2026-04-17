package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzar implements Iterator {
    final /* synthetic */ zzat zza;
    private int zzb = 0;

    public zzar(zzat zzat) {
        this.zza = zzat;
    }

    public final boolean hasNext() {
        return this.zzb < this.zza.zza.length();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        zzat zzat = this.zza;
        int i2 = this.zzb;
        if (i2 < zzat.zza.length()) {
            this.zzb = i2 + 1;
            return new zzat(String.valueOf(i2));
        }
        throw new NoSuchElementException();
    }
}
