package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzat  reason: invalid package */
final class zzat<K, V> extends zzas<Map.Entry<K, V>> {
    private final transient zzan<K, V> zza;
    /* access modifiers changed from: private */
    public final transient Object[] zzb;
    /* access modifiers changed from: private */
    public final transient int zzc;

    public zzat(zzan<K, V> zzan, Object[] objArr, int i2, int i5) {
        this.zza = zzan;
        this.zzb = objArr;
        this.zzc = i5;
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.zza.get(key))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int size() {
        return this.zzc;
    }

    /* renamed from: zzd */
    public final zzba<Map.Entry<K, V>> iterator() {
        return (zzba) zzc().iterator();
    }

    public final boolean zze() {
        return true;
    }

    public final zzaj<Map.Entry<K, V>> zzg() {
        return new zzaw(this);
    }

    public final int zza(Object[] objArr, int i2) {
        return zzc().zza(objArr, i2);
    }
}
