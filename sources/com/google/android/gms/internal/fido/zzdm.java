package com.google.android.gms.internal.fido;

import java.util.Arrays;

public final class zzdm extends zzdr {
    private final long zza;

    public zzdm(long j6) {
        this.zza = j6;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzdr zzdr = (zzdr) obj;
        if (zza() != zzdr.zza()) {
            return zza() - zzdr.zza();
        }
        int i2 = (Math.abs(this.zza) > Math.abs(((zzdm) zzdr).zza) ? 1 : (Math.abs(this.zza) == Math.abs(((zzdm) zzdr).zza) ? 0 : -1));
        if (i2 < 0) {
            return -1;
        }
        if (i2 > 0) {
            return 1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzdm.class == obj.getClass() && this.zza == ((zzdm) obj).zza) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zza()), Long.valueOf(this.zza)});
    }

    public final String toString() {
        return Long.toString(this.zza);
    }

    public final int zza() {
        return zzdr.zzd(this.zza >= 0 ? (byte) 0 : 32);
    }

    public final long zzc() {
        return this.zza;
    }
}
