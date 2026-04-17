package com.google.android.gms.internal.fido;

import com.google.android.gms.internal.measurement.a;
import java.io.Serializable;
import java.util.Map;

public abstract class zzba implements Map, Serializable {
    static final Map.Entry[] zza = new Map.Entry[0];
    private transient zzbc zzb;

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    public abstract Object get(Object obj);

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    public final int hashCode() {
        return zzbx.zza(entrySet());
    }

    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size >= 0) {
            StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824));
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
        throw new IllegalArgumentException(a.f(size, "size cannot be negative but was: "));
    }

    /* renamed from: zza */
    public zzav values() {
        throw null;
    }

    public abstract zzbc zzb();

    /* renamed from: zzc */
    public final zzbc entrySet() {
        zzbc zzbc = this.zzb;
        if (zzbc != null) {
            return zzbc;
        }
        zzbc zzb2 = zzb();
        this.zzb = zzb2;
        return zzb2;
    }

    /* renamed from: zzd */
    public zzbc keySet() {
        throw null;
    }
}
