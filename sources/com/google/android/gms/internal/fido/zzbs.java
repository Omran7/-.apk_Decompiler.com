package com.google.android.gms.internal.fido;

final class zzbs extends zzaz {
    static final zzaz zza = new zzbs(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzbs(Object[] objArr, int i2) {
        this.zzb = objArr;
        this.zzc = i2;
    }

    public final Object get(int i2) {
        zzap.zza(i2, this.zzc, "index");
        Object obj = this.zzb[i2];
        obj.getClass();
        return obj;
    }

    public final int size() {
        return this.zzc;
    }

    public final int zza(Object[] objArr, int i2) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    public final int zzb() {
        return this.zzc;
    }

    public final int zzc() {
        return 0;
    }

    public final Object[] zze() {
        return this.zzb;
    }
}
