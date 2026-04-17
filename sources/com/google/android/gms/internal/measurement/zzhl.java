package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

public final class zzhl extends zzlz implements zzni {
    private zzhl() {
        throw null;
    }

    public final int zza() {
        return ((zzhm) this.zza).zzb();
    }

    public final long zzb() {
        return ((zzhm) this.zza).zzc();
    }

    public final long zzc() {
        return ((zzhm) this.zza).zzd();
    }

    public final zzhl zzd(Iterable iterable) {
        zzbe();
        zzhm.zzj((zzhm) this.zza, iterable);
        return this;
    }

    public final zzhl zze(zzhp zzhp) {
        zzbe();
        zzhm.zzk((zzhm) this.zza, (zzhq) zzhp.zzba());
        return this;
    }

    public final zzhl zzf(zzhq zzhq) {
        zzbe();
        zzhm.zzk((zzhm) this.zza, zzhq);
        return this;
    }

    public final zzhl zzg() {
        zzbe();
        ((zzhm) this.zza).zze = zzmd.zzcn();
        return this;
    }

    public final zzhl zzh(int i2) {
        zzbe();
        zzhm.zzn((zzhm) this.zza, i2);
        return this;
    }

    public final zzhl zzi(String str) {
        zzbe();
        zzhm.zzo((zzhm) this.zza, str);
        return this;
    }

    public final zzhl zzj(int i2, zzhp zzhp) {
        zzbe();
        zzhm.zzp((zzhm) this.zza, i2, (zzhq) zzhp.zzba());
        return this;
    }

    public final zzhl zzk(int i2, zzhq zzhq) {
        zzbe();
        zzhm.zzp((zzhm) this.zza, i2, zzhq);
        return this;
    }

    public final zzhl zzl(long j6) {
        zzbe();
        zzhm.zzq((zzhm) this.zza, j6);
        return this;
    }

    public final zzhl zzm(long j6) {
        zzbe();
        zzhm.zzr((zzhm) this.zza, j6);
        return this;
    }

    public final zzhq zzn(int i2) {
        return ((zzhm) this.zza).zzg(i2);
    }

    public final String zzo() {
        return ((zzhm) this.zza).zzh();
    }

    public final List zzp() {
        return Collections.unmodifiableList(((zzhm) this.zza).zzi());
    }

    public final boolean zzq() {
        return ((zzhm) this.zza).zzu();
    }

    public /* synthetic */ zzhl(zzip zzip) {
        super(zzhm.zzb);
    }
}
