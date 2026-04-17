package com.google.android.gms.internal.play_billing;

final class zzcn extends zzco {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzco zzc;

    public zzcn(zzco zzco, int i2, int i5) {
        this.zzc = zzco;
        this.zza = i2;
        this.zzb = i5;
    }

    public final Object get(int i2) {
        zzbe.zza(i2, this.zzb, "index");
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

    public final boolean zzf() {
        return true;
    }

    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    /* renamed from: zzi */
    public final zzco subList(int i2, int i5) {
        zzbe.zze(i2, i5, this.zzb);
        int i6 = this.zza;
        return this.zzc.subList(i2 + i6, i5 + i6);
    }
}
