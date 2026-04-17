package com.google.android.gms.internal.measurement;

final class zzmy implements zznf {
    private final zznf[] zza;

    public zzmy(zznf... zznfArr) {
        this.zza = zznfArr;
    }

    public final zzne zzb(Class cls) {
        for (int i2 = 0; i2 < 2; i2++) {
            zznf zznf = this.zza[i2];
            if (zznf.zzc(cls)) {
                return zznf.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    public final boolean zzc(Class cls) {
        for (int i2 = 0; i2 < 2; i2++) {
            if (this.zza[i2].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
