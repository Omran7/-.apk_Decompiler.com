package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzar  reason: invalid package */
final class zzar<E> extends zzaj<E> {
    static final zzaj<Object> zza = new zzar(new Object[0], 0);
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzar(Object[] objArr, int i2) {
        this.zzb = objArr;
        this.zzc = i2;
    }

    public final E get(int i2) {
        zzw.zza(i2, this.zzc);
        E e6 = this.zzb[i2];
        Objects.requireNonNull(e6);
        return e6;
    }

    public final int size() {
        return this.zzc;
    }

    public final int zza(Object[] objArr, int i2) {
        System.arraycopy(this.zzb, 0, objArr, i2, this.zzc);
        return i2 + this.zzc;
    }

    public final int zzb() {
        return 0;
    }

    public final boolean zze() {
        return false;
    }

    public final Object[] zzf() {
        return this.zzb;
    }

    public final int zza() {
        return this.zzc;
    }
}
