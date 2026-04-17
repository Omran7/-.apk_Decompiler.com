package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzakn  reason: invalid package */
final class zzakn {
    private final Object zza;
    private final int zzb;

    public zzakn(Object obj, int i2) {
        this.zza = obj;
        this.zzb = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzakn)) {
            return false;
        }
        zzakn zzakn = (zzakn) obj;
        if (this.zza == zzakn.zza && this.zzb == zzakn.zzb) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
