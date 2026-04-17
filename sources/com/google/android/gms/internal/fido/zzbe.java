package com.google.android.gms.internal.fido;

import java.util.AbstractMap;

final class zzbe extends zzaz {
    final /* synthetic */ zzbf zza;

    public zzbe(zzbf zzbf) {
        this.zza = zzbf;
    }

    public final /* bridge */ /* synthetic */ Object get(int i2) {
        return new AbstractMap.SimpleImmutableEntry(this.zza.zza.zze.zzd.get(i2), this.zza.zza.zzf.get(i2));
    }

    public final int size() {
        return this.zza.zza.size();
    }
}
