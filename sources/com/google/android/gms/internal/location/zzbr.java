package com.google.android.gms.internal.location;

final class zzbr extends zzbs {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzbs zzc;

    public zzbr(zzbs zzbs, int i2, int i5) {
        this.zzc = zzbs;
        this.zza = i2;
        this.zzb = i5;
    }

    public final Object get(int i2) {
        zzbm.zza(i2, this.zzb, "index");
        return this.zzc.get(i2 + this.zza);
    }

    public final int size() {
        return this.zzb;
    }

    public final Object[] zzb() {
        return this.zzc.zzb();
    }

    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    public final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    public final boolean zzf() {
        return true;
    }

    /* renamed from: zzh */
    public final zzbs subList(int i2, int i5) {
        zzbm.zzc(i2, i5, this.zzb);
        zzbs zzbs = this.zzc;
        int i6 = this.zza;
        return zzbs.subList(i2 + i6, i5 + i6);
    }
}
