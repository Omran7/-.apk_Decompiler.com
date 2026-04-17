package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpp  reason: invalid package */
final class zzpp<P> implements Iterator<P> {
    private final Iterator<P> zza;
    private final Iterator<P> zzb;

    public final boolean hasNext() {
        if (this.zza.hasNext() || this.zzb.hasNext()) {
            return true;
        }
        return false;
    }

    public final P next() {
        if (this.zza.hasNext()) {
            return this.zza.next();
        }
        return this.zzb.next();
    }

    private zzpp(Iterator<P> it2, Iterator<P> it3) {
        this.zza = it2;
        this.zzb = it3;
    }
}
