package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

public final class zzgn extends zzlz implements zzni {
    private zzgn() {
        throw null;
    }

    public final int zza() {
        return ((zzgo) this.zza).zzb();
    }

    public final zzgm zzb(int i2) {
        return ((zzgo) this.zza).zze(i2);
    }

    public final zzgn zzc() {
        zzbe();
        ((zzgo) this.zza).zzj = zzmd.zzcn();
        return this;
    }

    public final zzgn zzd() {
        zzbe();
        ((zzgo) this.zza).zzm = zzmd.zzcn();
        return this;
    }

    public final zzgn zze(int i2, zzgl zzgl) {
        zzbe();
        zzgo.zzs((zzgo) this.zza, i2, (zzgm) zzgl.zzba());
        return this;
    }

    public final String zzf() {
        return ((zzgo) this.zza).zzk();
    }

    public final List zzg() {
        return Collections.unmodifiableList(((zzgo) this.zza).zzm());
    }

    public final List zzh() {
        return Collections.unmodifiableList(((zzgo) this.zza).zzn());
    }

    public /* synthetic */ zzgn(zzgz zzgz) {
        super(zzgo.zzb);
    }
}
