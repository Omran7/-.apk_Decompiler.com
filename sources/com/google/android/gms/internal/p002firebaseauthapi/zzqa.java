package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;
import o3.d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqa  reason: invalid package */
final class zzqa {
    private final Class<?> zza;
    private final Class<?> zzb;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzqa)) {
            return false;
        }
        zzqa zzqa = (zzqa) obj;
        if (!zzqa.zza.equals(this.zza) || !zzqa.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return d.g(this.zza.getSimpleName(), " with primitive type: ", this.zzb.getSimpleName());
    }

    private zzqa(Class<?> cls, Class<?> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }
}
