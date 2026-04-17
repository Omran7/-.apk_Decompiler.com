package com.google.android.recaptcha.internal;

import java.util.Map;
import o3.d;

final class zzpa implements Map.Entry, Comparable {
    final /* synthetic */ zzpe zza;
    private final Comparable zzb;
    private Object zzc;

    public zzpa(zzpe zzpe, Comparable comparable, Object obj) {
        this.zza = zzpe;
        this.zzb = comparable;
        this.zzc = obj;
    }

    private static final boolean zzb(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 != null) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzb.compareTo(((zzpa) obj).zzb);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!zzb(this.zzb, entry.getKey()) || !zzb(this.zzc, entry.getValue())) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ Object getKey() {
        return this.zzb;
    }

    public final Object getValue() {
        return this.zzc;
    }

    public final int hashCode() {
        int i2;
        Comparable comparable = this.zzb;
        int i5 = 0;
        if (comparable == null) {
            i2 = 0;
        } else {
            i2 = comparable.hashCode();
        }
        Object obj = this.zzc;
        if (obj != null) {
            i5 = obj.hashCode();
        }
        return i2 ^ i5;
    }

    public final Object setValue(Object obj) {
        this.zza.zzo();
        Object obj2 = this.zzc;
        this.zzc = obj;
        return obj2;
    }

    public final String toString() {
        return d.g(String.valueOf(this.zzb), "=", String.valueOf(this.zzc));
    }

    public final Comparable zza() {
        return this.zzb;
    }
}
