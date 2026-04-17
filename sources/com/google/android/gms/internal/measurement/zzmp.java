package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

final class zzmp implements Iterator {
    private final Iterator zza;

    public zzmp(Iterator it2) {
        this.zza = it2;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        if (entry.getValue() instanceof zzmr) {
            return new zzmo(entry, (zzmq) null);
        }
        return entry;
    }

    public final void remove() {
        this.zza.remove();
    }
}
