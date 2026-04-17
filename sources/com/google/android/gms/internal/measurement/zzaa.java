package com.google.android.gms.internal.measurement;

import A2.g;
import h0.C0552a;
import java.util.HashMap;
import java.util.Map;

public final class zzaa {
    private static final g zza = g.z(3, "_syn", "_err", "_el");
    private String zzb;
    private final long zzc;
    private final Map zzd;

    public zzaa(String str, long j6, Map map) {
        this.zzb = str;
        this.zzc = j6;
        HashMap hashMap = new HashMap();
        this.zzd = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    public static Object zzd(String str, Object obj, Object obj2) {
        if (zza.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaa)) {
            return false;
        }
        zzaa zzaa = (zzaa) obj;
        if (this.zzc == zzaa.zzc && this.zzb.equals(zzaa.zzb)) {
            return this.zzd.equals(zzaa.zzd);
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.zzc;
        return this.zzd.hashCode() + (((this.zzb.hashCode() * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.zzb;
        String obj = this.zzd.toString();
        StringBuilder t6 = C0552a.t("Event{name='", str, "', timestamp=");
        t6.append(this.zzc);
        t6.append(", params=");
        t6.append(obj);
        t6.append("}");
        return t6.toString();
    }

    public final long zza() {
        return this.zzc;
    }

    /* renamed from: zzb */
    public final zzaa clone() {
        return new zzaa(this.zzb, this.zzc, new HashMap(this.zzd));
    }

    public final Object zzc(String str) {
        Map map = this.zzd;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        return null;
    }

    public final String zze() {
        return this.zzb;
    }

    public final Map zzf() {
        return this.zzd;
    }

    public final void zzg(String str) {
        this.zzb = str;
    }

    public final void zzh(String str, Object obj) {
        if (obj == null) {
            this.zzd.remove(str);
            return;
        }
        Map map = this.zzd;
        map.put(str, zzd(str, map.get(str), obj));
    }
}
