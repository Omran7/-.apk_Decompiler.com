package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

final class zznq implements Iterator {
    private final Iterator zza;

    public zznq(Iterator it2) {
        this.zza = it2;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        if (entry.getValue() instanceof zzns) {
            return new zznp(entry, (zznr) null);
        }
        return entry;
    }

    public final void remove() {
        this.zza.remove();
    }
}
