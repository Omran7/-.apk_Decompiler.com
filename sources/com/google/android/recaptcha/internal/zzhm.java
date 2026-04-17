package com.google.android.recaptcha.internal;

public final class zzhm implements zzgx {
    public static final zzhm zza = new zzhm();

    private zzhm() {
    }

    public final void zza(int i2, zzgd zzgd, zzue... zzueArr) {
        if (zzueArr.length == 1) {
            Object zza2 = zzgd.zzc().zza(zzueArr[0]);
            if (true != (zza2 instanceof String)) {
                zza2 = null;
            }
            String str = (String) zza2;
            if (str != null) {
                zzgd.zzf(str);
                return;
            }
            throw new zzce(4, 5, (Throwable) null);
        }
        throw new zzce(4, 3, (Throwable) null);
    }
}
