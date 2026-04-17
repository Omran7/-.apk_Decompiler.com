package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.AbstractMap;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaw  reason: invalid package */
final class zzaw extends zzaj {
    private final /* synthetic */ zzat zza;

    public zzaw(zzat zzat) {
        this.zza = zzat;
    }

    public final /* synthetic */ Object get(int i2) {
        zzw.zza(i2, this.zza.zzc);
        int i5 = i2 * 2;
        Object obj = this.zza.zzb[i5];
        Objects.requireNonNull(obj);
        Object obj2 = this.zza.zzb[i5 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final int size() {
        return this.zza.zzc;
    }

    public final boolean zze() {
        return true;
    }
}
