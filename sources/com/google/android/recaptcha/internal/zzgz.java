package com.google.android.recaptcha.internal;

import java.util.Objects;

public final class zzgz implements zzgx {
    public static final zzgz zza = new zzgz();

    private zzgz() {
    }

    public final void zza(int i2, zzgd zzgd, zzue... zzueArr) {
        if (zzueArr.length == 1) {
            Object zza2 = zzgd.zzc().zza(zzueArr[0]);
            if (true != Objects.nonNull(zza2)) {
                zza2 = null;
            }
            if (zza2 != null) {
                try {
                    if (zza2 instanceof String) {
                        zza2 = zzgd.zzh().zza((String) zza2);
                    }
                    zzgd.zzc().zze(i2, zzgc.zza(zza2));
                } catch (zzce e6) {
                    throw e6;
                } catch (Exception e7) {
                    throw new zzce(6, 8, e7);
                }
            } else {
                throw new zzce(4, 5, (Throwable) null);
            }
        } else {
            throw new zzce(4, 3, (Throwable) null);
        }
    }
}
