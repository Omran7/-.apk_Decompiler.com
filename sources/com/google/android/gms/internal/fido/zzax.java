package com.google.android.gms.internal.fido;

final class zzax extends zzaz {
    private final transient zzaz zza;

    public zzax(zzaz zzaz) {
        this.zza = zzaz;
    }

    private final int zzl(int i2) {
        return (this.zza.size() - 1) - i2;
    }

    public final boolean contains(Object obj) {
        return this.zza.contains(obj);
    }

    public final Object get(int i2) {
        zzap.zza(i2, this.zza.size(), "index");
        return this.zza.get(zzl(i2));
    }

    public final int indexOf(Object obj) {
        int lastIndexOf = this.zza.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return zzl(lastIndexOf);
        }
        return -1;
    }

    public final int lastIndexOf(Object obj) {
        int indexOf = this.zza.indexOf(obj);
        if (indexOf >= 0) {
            return zzl(indexOf);
        }
        return -1;
    }

    public final int size() {
        return this.zza.size();
    }

    public final zzaz zzf() {
        return this.zza;
    }

    /* renamed from: zzg */
    public final zzaz subList(int i2, int i5) {
        zzap.zze(i2, i5, this.zza.size());
        zzaz zzaz = this.zza;
        return zzaz.subList(zzaz.size() - i5, this.zza.size() - i2).zzf();
    }
}
