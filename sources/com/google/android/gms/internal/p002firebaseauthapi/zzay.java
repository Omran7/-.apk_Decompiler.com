package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzay  reason: invalid package */
final class zzay extends zzaj<Object> {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zzay(Object[] objArr, int i2, int i5) {
        this.zza = objArr;
        this.zzb = i2;
        this.zzc = i5;
    }

    public final Object get(int i2) {
        zzw.zza(i2, this.zzc);
        Object obj = this.zza[(i2 * 2) + this.zzb];
        Objects.requireNonNull(obj);
        return obj;
    }

    public final int size() {
        return this.zzc;
    }

    public final boolean zze() {
        return true;
    }
}
