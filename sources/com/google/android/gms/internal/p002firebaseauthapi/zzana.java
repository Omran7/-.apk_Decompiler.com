package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Map;
import o3.d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzana  reason: invalid package */
final class zzana implements Comparable, Map.Entry {
    private final Comparable zza;
    private Object zzb;
    private final /* synthetic */ zzamw zzc;

    public zzana(zzamw zzamw, Map.Entry entry) {
        this(zzamw, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean zza(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((zzana) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!zza(this.zza, entry.getKey()) || !zza(this.zzb, entry.getValue())) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ Object getKey() {
        return this.zza;
    }

    public final Object getValue() {
        return this.zzb;
    }

    public final int hashCode() {
        int i2;
        Comparable comparable = this.zza;
        int i5 = 0;
        if (comparable == null) {
            i2 = 0;
        } else {
            i2 = comparable.hashCode();
        }
        Object obj = this.zzb;
        if (obj != null) {
            i5 = obj.hashCode();
        }
        return i2 ^ i5;
    }

    public final Object setValue(Object obj) {
        this.zzc.zzg();
        Object obj2 = this.zzb;
        this.zzb = obj;
        return obj2;
    }

    public final String toString() {
        return d.g(String.valueOf(this.zza), "=", String.valueOf(this.zzb));
    }

    public zzana(zzamw zzamw, Comparable comparable, Object obj) {
        this.zzc = zzamw;
        this.zza = comparable;
        this.zzb = obj;
    }
}
