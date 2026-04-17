package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

public final class zzht extends zzlz implements zzni {
    private zzht() {
        throw null;
    }

    public final int zza() {
        return ((zzhv) this.zza).zza();
    }

    public final zzht zzb(Iterable iterable) {
        zzbe();
        zzhv.zzi((zzhv) this.zza, iterable);
        return this;
    }

    public final zzht zzc(zzhw zzhw) {
        zzbe();
        zzhv.zzj((zzhv) this.zza, (zzhx) zzhw.zzba());
        return this;
    }

    public final zzht zzd() {
        zzbe();
        ((zzhv) this.zza).zze = zzmd.zzcn();
        return this;
    }

    public final zzht zze(int i2, zzhw zzhw) {
        zzbe();
        zzhv.zzm((zzhv) this.zza, i2, (zzhx) zzhw.zzba());
        return this;
    }

    public final zzht zzf(String str) {
        zzbe();
        zzhv.zzn((zzhv) this.zza, str);
        return this;
    }

    public final zzht zzg(String str) {
        zzbe();
        zzhv.zzo((zzhv) this.zza, str);
        return this;
    }

    public final zzhx zzh(int i2) {
        return ((zzhv) this.zza).zze(i2);
    }

    public final String zzi() {
        return ((zzhv) this.zza).zzf();
    }

    public final List zzj() {
        return Collections.unmodifiableList(((zzhv) this.zza).zzh());
    }

    public /* synthetic */ zzht(zzip zzip) {
        super(zzhv.zzb);
    }
}
