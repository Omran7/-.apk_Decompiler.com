package com.google.android.gms.internal.fido;

final class zzay extends zzaz {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzaz zzc;

    public zzay(zzaz zzaz, int i2, int i5) {
        this.zzc = zzaz;
        this.zza = i2;
        this.zzb = i5;
    }

    public final Object get(int i2) {
        zzap.zza(i2, this.zzb, "index");
        return this.zzc.get(i2 + this.zza);
    }

    public final int size() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    public final Object[] zze() {
        return this.zzc.zze();
    }

    /* renamed from: zzg */
    public final zzaz subList(int i2, int i5) {
        zzap.zze(i2, i5, this.zzb);
        zzaz zzaz = this.zzc;
        int i6 = this.zza;
        return zzaz.subList(i2 + i6, i5 + i6);
    }
}
