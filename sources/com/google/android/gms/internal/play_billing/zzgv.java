package com.google.android.gms.internal.play_billing;

final class zzgv {
    private final Object zza;
    private final int zzb;

    public zzgv(Object obj, int i2) {
        this.zza = obj;
        this.zzb = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgv)) {
            return false;
        }
        zzgv zzgv = (zzgv) obj;
        if (this.zza == zzgv.zza && this.zzb == zzgv.zzb) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
