package com.google.android.gms.internal.play_billing;

import h0.C0552a;
import java.util.Iterator;

final class zzdt extends zzcv {
    final transient Object zza;

    public zzdt(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final /* synthetic */ Iterator iterator() {
        return new zzcz(this.zza);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        return C0552a.o("[", this.zza.toString(), "]");
    }

    public final int zza(Object[] objArr, int i2) {
        objArr[0] = this.zza;
        return 1;
    }

    public final zzco zzd() {
        return zzco.zzm(this.zza);
    }

    public final zzdw zze() {
        return new zzcz(this.zza);
    }

    public final boolean zzf() {
        throw null;
    }
}
