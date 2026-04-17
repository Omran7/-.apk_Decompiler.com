package com.google.android.recaptcha.internal;

final class zzmn {
    private final Object zza;
    private final int zzb;

    public zzmn(Object obj, int i2) {
        this.zza = obj;
        this.zzb = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzmn)) {
            return false;
        }
        zzmn zzmn = (zzmn) obj;
        if (this.zza == zzmn.zza && this.zzb == zzmn.zzb) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
