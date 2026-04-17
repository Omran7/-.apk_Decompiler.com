package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzamy  reason: invalid package */
final class zzamy implements Iterator {
    private int zza;
    private Iterator zzb;
    private final /* synthetic */ zzamw zzc;

    private final Iterator zza() {
        if (this.zzb == null) {
            this.zzb = this.zzc.zzf.entrySet().iterator();
        }
        return this.zzb;
    }

    public final boolean hasNext() {
        int i2 = this.zza;
        if ((i2 <= 0 || i2 > this.zzc.zzb) && !zza().hasNext()) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ Object next() {
        if (zza().hasNext()) {
            return (Map.Entry) zza().next();
        }
        Object[] zze = this.zzc.zza;
        int i2 = this.zza - 1;
        this.zza = i2;
        return (zzana) zze[i2];
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private zzamy(zzamw zzamw) {
        this.zzc = zzamw;
        this.zza = zzamw.zzb;
    }
}
