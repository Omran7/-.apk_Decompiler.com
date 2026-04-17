package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

final class zzpb implements Iterator {
    final /* synthetic */ zzpe zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzpb(zzpe zzpe, zzpd zzpd) {
        this.zza = zzpe;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzc.entrySet().iterator();
        }
        return this.zzd;
    }

    public final boolean hasNext() {
        int i2 = this.zzb + 1;
        zzpe zzpe = this.zza;
        if (i2 < zzpe.zzb) {
            return true;
        }
        if (zzpe.zzc.isEmpty()) {
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
        zzpe zzpe = this.zza;
        if (i2 < zzpe.zzb) {
            return (zzpa) zzpe.zza[i2];
        }
        return (Map.Entry) zza().next();
    }

    public final void remove() {
        if (this.zzc) {
            this.zzc = false;
            this.zza.zzo();
            int i2 = this.zzb;
            zzpe zzpe = this.zza;
            if (i2 < zzpe.zzb) {
                this.zzb = i2 - 1;
                Object unused = zzpe.zzm(i2);
                return;
            }
            zza().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
