package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

final class zznx implements Iterator {
    final /* synthetic */ zzoa zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zznx(zzoa zzoa, zznz zznz) {
        this.zza = zzoa;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzc.entrySet().iterator();
        }
        return this.zzd;
    }

    public final boolean hasNext() {
        int i2 = this.zzb + 1;
        zzoa zzoa = this.zza;
        if (i2 < zzoa.zzb) {
            return true;
        }
        if (zzoa.zzc.isEmpty()) {
            return false;
        }
        if (zza().hasNext()) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i2 = this.zzb + 1;
        this.zzb = i2;
        zzoa zzoa = this.zza;
        if (i2 < zzoa.zzb) {
            return (zznw) zzoa.zza[i2];
        }
        return (Map.Entry) zza().next();
    }

    public final void remove() {
        if (this.zzc) {
            this.zzc = false;
            zzoa zzoa = this.zza;
            zzoa.zzo();
            int i2 = this.zzb;
            if (i2 < zzoa.zzb) {
                this.zzb = i2 - 1;
                Object unused = zzoa.zzm(i2);
                return;
            }
            zza().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
