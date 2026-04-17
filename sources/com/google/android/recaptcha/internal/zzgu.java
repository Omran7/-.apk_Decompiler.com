package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;
import java.util.Objects;

public final class zzgu implements zzgx {
    public static final zzgu zza = new zzgu();

    private zzgu() {
    }

    public final void zza(int i2, zzgd zzgd, zzue... zzueArr) {
        if (zzueArr.length == 2) {
            Object zza2 = zzgd.zzc().zza(zzueArr[0]);
            if (true != Objects.nonNull(zza2)) {
                zza2 = null;
            }
            if (zza2 != null) {
                Object zza3 = zzgd.zzc().zza(zzueArr[1]);
                if (true != (zza3 instanceof Integer)) {
                    zza3 = null;
                }
                Integer num = (Integer) zza3;
                if (num != null) {
                    int intValue = num.intValue();
                    try {
                        if (zza2 instanceof String) {
                            zza2 = zzgd.zzh().zza((String) zza2);
                        }
                        zzgd.zzc().zze(i2, Array.newInstance(zzgc.zza(zza2), intValue));
                    } catch (Exception e6) {
                        throw new zzce(6, 21, e6);
                    }
                } else {
                    throw new zzce(4, 5, (Throwable) null);
                }
            } else {
                throw new zzce(4, 5, (Throwable) null);
            }
        } else {
            throw new zzce(4, 3, (Throwable) null);
        }
    }
}
