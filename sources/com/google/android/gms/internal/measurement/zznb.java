package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class zznb extends LinkedHashMap {
    private static final zznb zza;
    private boolean zzb = true;

    static {
        zznb zznb = new zznb();
        zza = zznb;
        zznb.zzb = false;
    }

    private zznb() {
    }

    public static zznb zza() {
        return zza;
    }

    private static int zzf(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = zzmk.zzb;
            int length = bArr.length;
            int zzb2 = zzmk.zzb(length, bArr, 0, length);
            if (zzb2 == 0) {
                return 1;
            }
            return zzb2;
        } else if (!(obj instanceof zzmf)) {
            return obj.hashCode();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    private final void zzg() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        zzg();
        super.clear();
    }

    public final Set entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    public final boolean equals(Object obj) {
        boolean z3;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                z3 = value.equals(obj2);
                continue;
            } else {
                z3 = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!z3) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i2 = 0;
        for (Map.Entry entry : entrySet()) {
            i2 += zzf(entry.getValue()) ^ zzf(entry.getKey());
        }
        return i2;
    }

    public final Object put(Object obj, Object obj2) {
        zzg();
        byte[] bArr = zzmk.zzb;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        zzg();
        for (Object next : map.keySet()) {
            byte[] bArr = zzmk.zzb;
            next.getClass();
            map.get(next).getClass();
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        zzg();
        return super.remove(obj);
    }

    public final zznb zzb() {
        if (isEmpty()) {
            return new zznb();
        }
        return new zznb(this);
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final void zzd(zznb zznb) {
        zzg();
        if (!zznb.isEmpty()) {
            putAll(zznb);
        }
    }

    public final boolean zze() {
        return this.zzb;
    }

    private zznb(Map map) {
        super(map);
    }
}
