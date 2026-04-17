package com.google.android.gms.internal.fido;

public final class zzdt {
    private final byte zza;
    private final byte zzb;

    public zzdt(int i2) {
        this.zza = (byte) (i2 & 224);
        this.zzb = (byte) (i2 & 31);
    }

    public final byte zza() {
        return this.zzb;
    }

    public final byte zzb() {
        return this.zza;
    }

    public final int zzc() {
        return (this.zza >> 5) & 7;
    }
}
