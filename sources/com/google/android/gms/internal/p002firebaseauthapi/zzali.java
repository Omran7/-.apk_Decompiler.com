package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzali  reason: invalid package */
final class zzali<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> zza;

    public zzali(Iterator<Map.Entry<K, Object>> it2) {
        this.zza = it2;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.zza.next();
        if (next.getValue() instanceof zzalg) {
            return new zzalj(next);
        }
        return next;
    }

    public final void remove() {
        this.zza.remove();
    }
}
