package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzac implements Iterator {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ Iterator zzb;

    public zzac(zzae zzae, Iterator it2, Iterator it3) {
        this.zza = it2;
        this.zzb = it3;
    }

    public final boolean hasNext() {
        if (this.zza.hasNext()) {
            return true;
        }
        return this.zzb.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it2 = this.zza;
        if (it2.hasNext()) {
            return new zzat(((Integer) it2.next()).toString());
        }
        Iterator it3 = this.zzb;
        if (it3.hasNext()) {
            return new zzat((String) it3.next());
        }
        throw new NoSuchElementException();
    }
}
