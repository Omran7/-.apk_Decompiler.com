package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzad implements Iterator {
    final /* synthetic */ zzae zza;
    private int zzb = 0;

    public zzad(zzae zzae) {
        this.zza = zzae;
    }

    public final boolean hasNext() {
        if (this.zzb < this.zza.zzc()) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        zzae zzae = this.zza;
        if (this.zzb < zzae.zzc()) {
            int i2 = this.zzb;
            this.zzb = i2 + 1;
            return zzae.zze(i2);
        }
        throw new NoSuchElementException(a.f(this.zzb, "Out of bounds index: "));
    }
}
