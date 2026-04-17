package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzas  reason: invalid package */
public abstract class zzas<E> extends zzai<E> implements Set<E> {
    private transient zzaj<E> zza;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return zzax.zza(this, obj);
    }

    public int hashCode() {
        return zzax.zza(this);
    }

    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public zzaj<E> zzc() {
        zzaj<E> zzaj = this.zza;
        if (zzaj != null) {
            return zzaj;
        }
        zzaj<E> zzg = zzg();
        this.zza = zzg;
        return zzg;
    }

    public zzaj<E> zzg() {
        return zzaj.zza(toArray());
    }
}
