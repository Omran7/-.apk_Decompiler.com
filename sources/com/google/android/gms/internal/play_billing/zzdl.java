package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Objects;

final class zzdl extends zzco {
    final /* synthetic */ zzdm zza;

    public zzdl(zzdm zzdm) {
        this.zza = zzdm;
    }

    public final /* bridge */ /* synthetic */ Object get(int i2) {
        zzbe.zza(i2, this.zza.zzc, "index");
        int i5 = i2 + i2;
        Object obj = this.zza.zzb[i5];
        Objects.requireNonNull(obj);
        Object obj2 = this.zza.zzb[i5 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final int size() {
        return this.zza.zzc;
    }

    public final boolean zzf() {
        return true;
    }
}
