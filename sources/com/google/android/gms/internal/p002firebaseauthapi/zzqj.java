package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;
import o3.d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqj  reason: invalid package */
final class zzqj {
    private final Class<? extends zzqi> zza;
    private final zzaae zzb;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzqj)) {
            return false;
        }
        zzqj zzqj = (zzqj) obj;
        if (!zzqj.zza.equals(this.zza) || !zzqj.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return d.g(this.zza.getSimpleName(), ", object identifier: ", String.valueOf(this.zzb));
    }

    private zzqj(Class<? extends zzqi> cls, zzaae zzaae) {
        this.zza = cls;
        this.zzb = zzaae;
    }
}
