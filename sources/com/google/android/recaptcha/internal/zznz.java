package com.google.android.recaptcha.internal;

final class zznz implements zzog {
    private final zzog[] zza;

    public zznz(zzog... zzogArr) {
        this.zza = zzogArr;
    }

    public final zzof zzb(Class cls) {
        for (int i2 = 0; i2 < 2; i2++) {
            zzog zzog = this.zza[i2];
            if (zzog.zzc(cls)) {
                return zzog.zzb(cls);
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
