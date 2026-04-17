package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

final class zzdm extends zzcv {
    private final transient zzcr zza;
    /* access modifiers changed from: private */
    public final transient Object[] zzb;
    /* access modifiers changed from: private */
    public final transient int zzc;

    public zzdm(zzcr zzcr, Object[] objArr, int i2, int i5) {
        this.zza = zzcr;
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

    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    public final int size() {
        return this.zzc;
    }

    public final int zza(Object[] objArr, int i2) {
        return zzd().zza(objArr, 0);
    }

    public final zzdw zze() {
        return zzd().listIterator(0);
    }

    public final boolean zzf() {
        throw null;
    }

    public final zzco zzi() {
        return new zzdl(this);
    }
}
