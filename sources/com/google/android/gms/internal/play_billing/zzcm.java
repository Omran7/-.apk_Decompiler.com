package com.google.android.gms.internal.play_billing;

final class zzcm extends zzco {
    private final transient zzco zza;

    public zzcm(zzco zzco) {
        this.zza = zzco;
    }

    private final int zzp(int i2) {
        return (this.zza.size() - 1) - i2;
    }

    public final boolean contains(Object obj) {
        return this.zza.contains(obj);
    }

    public final Object get(int i2) {
        zzbe.zza(i2, this.zza.size(), "index");
        return this.zza.get(zzp(i2));
    }

    public final int indexOf(Object obj) {
        int lastIndexOf = this.zza.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return zzp(lastIndexOf);
        }
        return -1;
    }

    public final int lastIndexOf(Object obj) {
        int indexOf = this.zza.indexOf(obj);
        if (indexOf >= 0) {
            return zzp(indexOf);
        }
        return -1;
    }

    public final int size() {
        return this.zza.size();
    }

    public final boolean zzf() {
        return this.zza.zzf();
    }

    public final zzco zzh() {
        return this.zza;
    }

    /* renamed from: zzi */
    public final zzco subList(int i2, int i5) {
        zzbe.zze(i2, i5, this.zza.size());
        zzco zzco = this.zza;
        return zzco.subList(zzco.size() - i5, this.zza.size() - i2).zzh();
    }
}
