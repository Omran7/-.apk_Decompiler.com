package com.google.android.gms.internal.play_billing;

final class zzid implements zzik {
    private final zzik[] zza;

    public zzid(zzik... zzikArr) {
        this.zza = zzikArr;
    }

    public final zzij zzb(Class cls) {
        for (int i2 = 0; i2 < 2; i2++) {
            zzik zzik = this.zza[i2];
            if (zzik.zzc(cls)) {
                return zzik.zzb(cls);
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
