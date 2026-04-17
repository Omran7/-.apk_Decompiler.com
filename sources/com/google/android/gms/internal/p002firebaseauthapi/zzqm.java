package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;
import o3.d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqm  reason: invalid package */
final class zzqm {
    private final Class<?> zza;
    private final Class<? extends zzqi> zzb;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzqm)) {
            return false;
        }
        zzqm zzqm = (zzqm) obj;
        if (!zzqm.zza.equals(this.zza) || !zzqm.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return d.g(this.zza.getSimpleName(), " with serialization type: ", this.zzb.getSimpleName());
    }

    private zzqm(Class<?> cls, Class<? extends zzqi> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }
}
