package com.google.android.gms.internal.location;

final class zzbq<E> extends zzbo<E> {
    private final zzbs<E> zza;

    public zzbq(zzbs<E> zzbs, int i2) {
        super(zzbs.size(), i2);
        this.zza = zzbs;
    }

    public final E zza(int i2) {
        return this.zza.get(i2);
    }
}
