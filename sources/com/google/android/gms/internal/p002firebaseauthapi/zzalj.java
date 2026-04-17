package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzalj  reason: invalid package */
final class zzalj<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, zzalg> zza;

    public final K getKey() {
        return this.zza.getKey();
    }

    public final Object getValue() {
        if (this.zza.getValue() == null) {
            return null;
        }
        throw new NoSuchMethodError();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof zzamc) {
            return this.zza.getValue().zza((zzamc) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final zzalg zza() {
        return this.zza.getValue();
    }

    private zzalj(Map.Entry<K, zzalg> entry) {
        this.zza = entry;
    }
}
