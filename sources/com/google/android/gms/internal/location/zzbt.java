package com.google.android.gms.internal.location;

final class zzbt<E> extends zzbs<E> {
    static final zzbs<Object> zza = new zzbt(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzbt(Object[] objArr, int i2) {
        this.zzb = objArr;
        this.zzc = i2;
    }

    public final E get(int i2) {
        zzbm.zza(i2, this.zzc, "index");
        return this.zzb[i2];
    }

    public final int size() {
        return this.zzc;
    }

    public final Object[] zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return 0;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final boolean zzf() {
        return false;
    }

    public final int zzg(Object[] objArr, int i2) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }
}
