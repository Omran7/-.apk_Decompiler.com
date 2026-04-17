package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzan  reason: invalid package */
public abstract class zzan<K, V> implements Serializable, Map<K, V> {
    private transient zzas<Map.Entry<K, V>> zza;
    private transient zzas<K> zzb;
    private transient zzai<V> zzc;

    public static <K, V> zzan<K, V> zza(Map<? extends K, ? extends V> map) {
        if (!(map instanceof zzan) || (map instanceof SortedMap)) {
            Set<Map.Entry<? extends K, ? extends V>> entrySet = map.entrySet();
            zzaq zzaq = new zzaq(entrySet != null ? entrySet.size() : 4);
            zzaq.zza(entrySet);
            return zzaq.zza();
        }
        zzan<K, V> zzan = (zzan) map;
        zzan.zzd();
        return zzan;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        return ((zzai) values()).contains(obj);
    }

    public /* synthetic */ Set entrySet() {
        zzas<Map.Entry<K, V>> zzas = this.zza;
        if (zzas != null) {
            return zzas;
        }
        zzas<Map.Entry<K, V>> zzb2 = zzb();
        this.zza = zzb2;
        return zzb2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public abstract V get(Object obj);

    public final V getOrDefault(Object obj, V v6) {
        V v7 = get(obj);
        if (v7 != null) {
            return v7;
        }
        return v6;
    }

    public int hashCode() {
        return zzax.zza((zzas) entrySet());
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public /* synthetic */ Set keySet() {
        zzas<K> zzas = this.zzb;
        if (zzas != null) {
            return zzas;
        }
        zzas<K> zzc2 = zzc();
        this.zzb = zzc2;
        return zzc2;
    }

    @Deprecated
    public final V put(K k6, V v6) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        int size = size();
        zzag.zza(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) << 3, 1073741824));
        sb.append('{');
        boolean z3 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z3) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z3 = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ Collection values() {
        zzai<V> zzai = this.zzc;
        if (zzai != null) {
            return zzai;
        }
        zzai<V> zza2 = zza();
        this.zzc = zza2;
        return zza2;
    }

    public abstract zzai<V> zza();

    public abstract zzas<Map.Entry<K, V>> zzb();

    public abstract zzas<K> zzc();

    public abstract boolean zzd();
}
